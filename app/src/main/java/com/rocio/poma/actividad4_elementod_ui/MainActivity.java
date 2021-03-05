package com.rocio.poma.actividad4_elementod_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button btn_toast,btn_SnackBar, btn_SnackBar_Acc;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast
        btn_toast= (Button) findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "GENIAL LO LOGRAMOS", Toast.LENGTH_SHORT).show();
            }
        });

        //SnackBar
        layout= (ConstraintLayout) findViewById(R.id.Layout1);
        btn_SnackBar= (Button) findViewById(R.id.btn_SnackBar);
        btn_SnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar= Snackbar.make(layout,"También logramos con SnackBar!", Snackbar.LENGTH_SHORT);
                snackbar.show();

            }
        });

        //SnackBar con Accion
        btn_SnackBar_Acc= (Button) findViewById(R.id.btn_SnackBar_Acc);
        btn_SnackBar_Acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSB(v).show();
            }
        });

    }
        private Snackbar getSB(View v){
            return Snackbar.make(v, "Esto es un SnackBar con Accion", Snackbar.LENGTH_LONG)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //ACTION
                            Log.e("XYZ", "MENSAJE");
                        }
                    }).setActionTextColor(Color.CYAN);


        }
}