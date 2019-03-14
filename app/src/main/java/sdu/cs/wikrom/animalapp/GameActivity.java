package sdu.cs.wikrom.animalapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class GameActivity extends AppCompatActivity {

    //Explicit
    Button btn1,btn2,btn3, btn4;
    ImageView questionImageView;
    ImageButton volumeImageButton;
    MediaPlayer mediaPlayer; //ตัวแปรควบคุมการเล่นเสียง
    int questionCount = 10; //ตัวเเปรกำหนดจำนวนข้อ
    ArrayList<Integer> qid = new ArrayList<Integer>(); //ตัวแปรสำหรับ random โจทย์
    String answer; //ตัวแปรไว้เก็บคำตอบ
    int score = 0;//ตัวแปรเก็บคะเนน



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปรบน java กัย id บน xml
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton = findViewById(R.id.imbVolume);

        //กำหนดคำสั่งในการ random โจทย์
        for (int i = 1; i <= questionCount;  i++) {
            qid.add(i);//จอดพื้นที่หน่วยความจำบน memory
        }//end for

        Collections.shuffle(qid); // set การ random โจทย์
        setQuestion(qid.remove(0)); //เมื่อ random โจทย์เเล้วให้ pop ออกจาก array

    }//end onCreate() method

    private void setQuestion(int qid) {//method setQuestion สำหรับเเสดงคำถาม
        if (qid == 1){
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.bird); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("นก");
            choice.add("เเมว");
            choice.add("ช้าง");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 2){
            answer = "เเมว";
            questionImageView.setImageResource(R.drawable.cat);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cat); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("เเมว");
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 3){
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cow); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("วัว");
            choice.add("เเมว");
            choice.add("ช้าง");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 4){
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.dog); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("หมา");
            choice.add("เเมว");
            choice.add("ช้าง");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 5){
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ช้าง");
            choice.add("เเมว");
            choice.add("วัว");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 6){
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.horse); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ม้า");
            choice.add("เเกะ");
            choice.add("ช้าง");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 7){
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.lion); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("สิงโต");
            choice.add("เเมว");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 8){
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ยุง");
            choice.add("หมู");
            choice.add("ช้าง");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 9){
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.pig); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("หมู");
            choice.add("เเมว");
            choice.add("แกะ");
            choice.add("หมา");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 10){
            answer = "เเกะ";
            questionImageView.setImageResource(R.drawable.sheep);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep); //แสดงเสียงสัตว์ที่ตรงกับภาพคำถาม

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("เเกะ");
            choice.add("เเมว");
            choice.add("หมู");
            choice.add("สิงโต");
            Collections.shuffle(choice);//กำหนดให้ random choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

    }//end setQuestion() method


    public void playSound(View view) {//เป็น method เเสดงเสียง
        mediaPlayer.start();
    }//end playSound method

    public void choiceAns(View view) {//เป้น method สำหรับตรวจคำตอบเเละรวมคะเเนน
        Button button = (Button) view;
        String buttonString = button.getText().toString();//เก็บข้อความบนปุ่มที่เลือก

        if (buttonString.equals(answer)){ //ถ้าคำตอบที่เลือกต้องกับ answer
            score++;//ถ้าคำตอบถูกก็เพิ่ม 1 คะเเเนน
        }

        if (qid.isEmpty()) {// ถ้าทำครบทุกข้อเเล้ว
            //Toast.makeText(getApplicationContext(), "คุณได้" + score + "คะเนน", Toast.LENGTH_SHORT).show();
            dialogboxScore();

        }else {//ถ้ายังไม่ครบทั้ง10ข้อให้ทำต่อข้อถัดไป
            setQuestion(qid.remove(0));
        }

    }//end choiceAns() method

    private void dialogboxScore() {//เเสดงคะเเนนเป็น Dialogbox
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะเเนน");
        builder.setMessage("คุณได้" +  score  + "คะเเนน")
                .setCancelable(false)
                .setPositiveButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    }
                })
                .setNegativeButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();




    }
    //end dialogboxScore() method
}//end class
