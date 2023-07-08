package com.example.aplikasigamepuzzlehuruf;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO;
    TextView hasil;
    private final String[] dataHuruf = new String[] {
            "adonan", "bola", "coklat", "domba", "hujan", "ikan", "jalan", "kucing",
            "forked", "makanan"
    };
    private String inputHuruf = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.biru_muda)));

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnH);
        btnI = findViewById(R.id.btnI);
        btnJ = findViewById(R.id.btnJ);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);
        btnM = findViewById(R.id.btnM);
        btnN = findViewById(R.id.btnN);
        btnO = findViewById(R.id.btnO);
        hasil = findViewById(R.id.textViewHasil);

        btnA.setOnClickListener(view -> {
            inputHuruf += "a";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnB.setOnClickListener(view -> {
            inputHuruf += "b";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnC.setOnClickListener(view -> {
            inputHuruf += "c";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnD.setOnClickListener(view -> {
            inputHuruf += "d";
            checkInput();
        });

        btnE.setOnClickListener(view -> {
            inputHuruf += "e";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnF.setOnClickListener(view -> {
            inputHuruf += "f";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnG.setOnClickListener(view -> {
            inputHuruf += "g";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnH.setOnClickListener(view -> {
            inputHuruf += "h";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnI.setOnClickListener(view -> {
            inputHuruf += "I";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnJ.setOnClickListener(view -> {
            inputHuruf += "j";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnK.setOnClickListener(view -> {
            inputHuruf += "k";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnL.setOnClickListener(view -> {
            inputHuruf += "l";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnM.setOnClickListener(view -> {
            inputHuruf += "m";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnN.setOnClickListener(view -> {
            inputHuruf += "n";
            hasil.setText(inputHuruf);
            checkInput();
        });

        btnO.setOnClickListener(view -> {
            inputHuruf += "o";
            hasil.setText(inputHuruf);
            checkInput();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hamburgermenu, menu);

        MenuItem ulangiItem = menu.findItem(R.id.ulangi);
        ulangiItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                inputHuruf = "";
                return true;
            }
        });

        MenuItem keluarItem = menu.findItem(R.id.keluar);
        keluarItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                finish();
                return true;
            }
        });

        return true;
    }

    private void checkInput() {
        List<String> hurufList = Arrays.asList(dataHuruf);
        boolean matchFound = false;
        for (String huruf : hurufList) {
            if (huruf.equalsIgnoreCase(inputHuruf)) {
                matchFound = true;
                break;
            }
        }
        if (matchFound) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_with_button,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            Button button = layout.findViewById(R.id.button);

            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.setGravity(Gravity.CENTER, 0, 0);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inputHuruf = "";
                }
            });
            toast.show();
        }
    }
}