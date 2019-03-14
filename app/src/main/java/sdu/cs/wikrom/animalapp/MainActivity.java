package sdu.cs.wikrom.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Explicit
    EditText useEditText, passEditText;
    Button logButton;
    String userString, passString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ผูกตัวแปร
        useEditText = findViewById(R.id.edtUsename);
        passEditText = findViewById(R.id.edtPassword);
        logButton = findViewById(R.id.btnLogin);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //รับค่า Username
                userString = useEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //check ค่าว่าง
                if ((userString.length() == 0) || (passString.length() == 0)) {
                    Toast.makeText(getApplicationContext(), "ใส่ข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                } else {
                    //check username password
                    if ((passString.equals("1234"))) {
                        Toast.makeText(getApplicationContext(), "ยินดีต้อนรับ" + userString, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, GameActivity.class);
                        intent.putExtra("name", userString);
                        startActivity(intent);


                    } else {
                        Toast.makeText(getApplicationContext(), "password ไม่ถูกต้อง กรุณาใส่ข้อมูลใหม่", Toast.LENGTH_SHORT).show();

                    }
                }
            }





        });
    }//end onCreate
}//end Class
