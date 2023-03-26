package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    EditText s1;
    EditText s2;
    EditText s3;
    EditText s4;
    EditText s5;
    TextView t1;
    TextView t2;
    TextView ls;

    Button button;
    View lay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.eee);
        s1=findViewById(R.id.editTextTextPersonName2);
        s2=findViewById(R.id.editTextTextPersonName5);
        s3=findViewById(R.id.editTextTextPersonName8);
        s4=findViewById(R.id.editTextTextPersonName9);
        s5=findViewById(R.id.editTextTextPersonName10);
        t1=findViewById(R.id.textView);
        t2=findViewById(R.id.textView4);
        lay=findViewById(R.id.linearLayout);

        button=findViewById(R.id.button);
        String ss1=s1.getText().toString();
        String ss2=s2.getText().toString();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ss1=s1.getText().toString();
                String ss2=s2.getText().toString();
                String ss3=s3.getText().toString();
                String ss4=s4.getText().toString();
                String ss5=s5.getText().toString();

                int k=Integer.parseInt(ss2);
                int l=Integer.parseInt(ss3);
                int m=Integer.parseInt(ss4);
                int n=Integer.parseInt(ss5);

                if(l>=75 && m==0 && n>=50000){

                    lay.setVisibility(View.VISIBLE);
                    imageView.setImageResource(R.drawable.logo);
                    t1.setText("Name: "+ss1);
                    t2.setText("Roll no: "+ss2);
                    if(k==31 && ss1.equals("Rahil")){
                        lay.setVisibility(View.VISIBLE);
                        t1.setText("Name: "+ss1);
                        t2.setText("Roll no: "+ss2);
                        imageView.setImageResource(R.drawable.rahil);



                    }
                    if(k==23 && ss1.equals("Muzammil")){
                        lay.setVisibility(View.VISIBLE);
                        t1.setText("Name: "+ss1);
                        t2.setText("Roll no: "+ss2);
                        imageView.setImageResource(R.drawable.muzammil);



                    }
                    if(k==39 && ss1.equals("Sujan Shetty")){
                        lay.setVisibility(View.VISIBLE);
                        t1.setText("Name: "+ss1);
                        t2.setText("Roll no: "+ss2);
                        imageView.setImageResource(R.drawable.sujan);



                    }
                    if(k==37 && ss1.equals("Srujan Rai")){
                        lay.setVisibility(View.VISIBLE);
                        t1.setText("Name: "+ss1);
                        t2.setText("Roll no: "+ss2);
                        imageView.setImageResource(R.drawable.srujanrai);



                    }
                    if(k==45 && ss1.equals("Rakshith Rao")){
                        lay.setVisibility(View.VISIBLE);
                        t1.setText("Name: "+ss1);
                        t2.setText("Roll no: "+ss2);
                        imageView.setImageResource(R.drawable.rakshith);



                    }




                }

                else{lay.setVisibility(View.INVISIBLE);
                    if(l<75&&m==0&&n>=50000){
                        Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Shortage in Attendence", Toast.LENGTH_SHORT).show();

                    }
                    else if(m>0&&l>=75&&n>=50000){
                        Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Backlogs", Toast.LENGTH_SHORT).show();

                    }
                    else if(n<50000&&m==0&&l>=75){

                            Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Due in fees", Toast.LENGTH_SHORT).show();


                    }
                    else{
                        if(l<75&&m>1&&n>=50000) {
                            Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Shortage in Attendence & backlogs", Toast.LENGTH_SHORT).show();
                        }
                        else if(l<75&&m==0&&n<50000){
                            Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Shortage in Attendence & due in fees", Toast.LENGTH_SHORT).show();

                        }
                        else if(m>1&&n<50000&&l>=75){
                            Toast.makeText(MainActivity.this, "Hall ticket Can't be generated due to Backlogs & due in fees", Toast.LENGTH_SHORT).show();



                        }
                        else{
                            Toast.makeText(MainActivity.this, "Hall ticket can't be generated due to Shortage in Attendence & backlogs, due in fees ", Toast.LENGTH_SHORT).show();

                        }

                    }


                }






            }
        });





    }
}