package com.example.text_editor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public EditText text_editor;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    public void initViews(){
        text_editor = findViewById(R.id.text_editor);
        btn = findViewById(R.id.btn);
btn.setOnClickListener(this);

text_editor.addTextChangedListener(new TextWatcher() {


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

        if (CharSequence.length() <10)
            text_editor.setError("لطفا شماره موبایل صحیح وارپ کنید");

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
});

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn:
                /*
               // Toast.makeText(MainActivity.this,"fdfdfdf",Toast.LENGTH_SHORT).show();
             //   String input = edittor.getText().toString();
               // Toast.makeText(MainActivity.this,input,Toast.LENGTH_SHORT).show();
edittor.setText("fdfd");
*/


                // error masgeges


                String input = text_editor.getText().toString();

                if (input == "" /*or nuall */|| input.trim().equals("")){

                    text_editor.setError("void value");

                }else {

                    Toast.makeText(this,input,Toast.LENGTH_SHORT).show();

                }





                break;
        }


    }
}
