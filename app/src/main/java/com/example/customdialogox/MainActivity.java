package com.example.customdialogox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView textViewDate;

    int TIMEDATE_CODE = 1;

    public static String time = "";
    public static String date = "";

    static TextView time_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time_date = (TextView) findViewById(R.id.time_date);
    }


    public void AlertDialog(View view) {
        ExampleDialog dialog = new ExampleDialog();
        dialog.show(getSupportFragmentManager(), "Example Dialog");

    }

    public static void updateTimeDate() {
        time_date.setText(time + ", " + date);
    }

}
