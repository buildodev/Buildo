package com.buildo.application;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.HawkBuilder;
import com.orhanobut.hawk.LogLevel;

public class ProfileActivity extends AppCompatActivity {

    private static final String CHOICE = "choice";
    private static final String FAM = "fam";
    private Integer[] selected = null;
    private MaterialDialog dialog;

    private RadioButton radioButtonCustom;
    private RadioButton radioButtonBasic;

    private EditText txtName;
    private EditText txtEmail;
    private EditText txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Hawk.init(this)
                .setEncryptionMethod(HawkBuilder.EncryptionMethod.MEDIUM)
                .setStorage(HawkBuilder.newSharedPrefStorage(this))
                .setLogLevel(LogLevel.FULL)
                .build();

        txtAge = (EditText) findViewById(R.id.editTextProfileAge);
        txtEmail = (EditText) findViewById(R.id.editTextProfileEmail);
        txtName = (EditText) findViewById(R.id.editTextProfileName);

        radioButtonCustom = (RadioButton) findViewById(R.id.radioButtonProfileCustom);
        radioButtonBasic = (RadioButton) findViewById(R.id.radioButtonProfileBasic);
        RadioButton radioButtonPro = (RadioButton) findViewById(R.id.radioButtonProfilePro);

        if (Hawk.contains("name")) {
            String name = Hawk.get("name");
            txtName.setText(name);
            txtName.setEnabled(false);
        }
        if (Hawk.contains("email")) {
            String email = Hawk.get("email");
            txtEmail.setText(email);
            txtEmail.setEnabled(false);
        }
        if (Hawk.contains("age")) {
            int age = Hawk.get("age");
            txtAge.setText(String.valueOf(age));
            txtAge.setEnabled(false);
        }

        int check = 0;

        if (Hawk.contains(FAM))
            check = Hawk.get(FAM);

        switch (check) {
            case 0:
                radioButtonBasic.setChecked(true);
                break;
            case 1:
                radioButtonPro.setChecked(true);
                break;
            case 2:
                radioButtonCustom.setChecked(true);
                break;
        }

        if (Hawk.contains(CHOICE)) {
            selected = Hawk.get(CHOICE);
            radioButtonBasic.setChecked(false);
            radioButtonCustom.setChecked(true);
        }

        buildoDialog();

        radioButtonBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Hawk.contains(FAM))
                    Hawk.remove(FAM);
                if (Hawk.contains(CHOICE))
                    Hawk.remove(CHOICE);
                Hawk.put(FAM, 0);
            }
        });

        radioButtonPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Hawk.contains(FAM))
                    Hawk.remove(FAM);
                if (Hawk.contains(CHOICE))
                    Hawk.remove(CHOICE);
                Hawk.put(FAM, 1);
            }
        });

        radioButtonCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }

    private void buildoDialog() {

        dialog = new MaterialDialog.Builder(this)
                .title(R.string.select_components)
                .items(R.array.components)
                .positiveText(R.string.done)
                .negativeText(R.string.cancel)
                .itemsCallbackMultiChoice(selected, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog materialDialog, Integer[] integers, CharSequence[] charSequences) {

                        if (integers.length == 0) {
                            if (Hawk.contains(CHOICE)) {
                                Hawk.remove(FAM);
                                Hawk.remove(CHOICE);
                            }

                            radioButtonCustom.setChecked(false);
                            radioButtonBasic.setChecked(true);
                        } else {

                            if (Hawk.contains(FAM))
                                Hawk.remove(FAM);
                            if (Hawk.contains(CHOICE))
                                Hawk.remove(CHOICE);
                            Hawk.chain().put(FAM, 2).put(CHOICE, integers).commit();
                        }

                        return true;
                    }
                })
                .onNegative(new MaterialDialog.SingleButtonCallback() {
                    @Override
                    public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {

                        if (Hawk.contains(CHOICE)) {
                            radioButtonCustom.setChecked(true);
                            radioButtonBasic.setChecked(false);
                        } else {
                            radioButtonCustom.setChecked(false);
                            radioButtonBasic.setChecked(true);
                        }
                    }
                })
                .dismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        if (Hawk.contains(CHOICE)) {
                            radioButtonCustom.setChecked(true);
                            radioButtonBasic.setChecked(false);
                        } else {
                            radioButtonCustom.setChecked(false);
                            radioButtonBasic.setChecked(true);
                        }
                    }
                }).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == R.id.action_edit) {
            txtName.setEnabled(true);
            txtEmail.setEnabled(true);
            txtAge.setEnabled(true);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void save(View view) {
        if (txtName.getText().toString().length() == 0)
            txtName.setBackgroundResource(R.drawable.custom_edit_text_error);
        else if (txtEmail.getText().toString().length() == 0)
            txtEmail.setBackgroundResource(R.drawable.custom_edit_text_error);
        else if (txtAge.getText().toString().length() == 0)
            txtAge.setBackgroundResource(R.drawable.custom_edit_text_error);
        else {
            Hawk.chain()
                    .put("name", txtName.getText().toString())
                    .put("email", txtEmail.getText().toString())
                    .put("age", Integer.parseInt(txtAge.getText().toString()))
                    .commit();
            txtName.setEnabled(false);
            txtEmail.setEnabled(false);
            txtAge.setEnabled(false);
        }

    }
}
