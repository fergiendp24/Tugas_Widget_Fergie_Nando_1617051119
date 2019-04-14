package com.example.aplikasiwidget;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private TextView txtclose;
    private Button btn;

    Dialog mydialog;

    @BindView(R.id.main)
    LinearLayout main;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        animationDrawable = (AnimationDrawable) main.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
        mydialog = new Dialog(this);

    }


    public void HurufA(View v) {
        mydialog.setContentView(R.layout.nomor1);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose1);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno1(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno1(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno1(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno1(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufB(View v) {
        mydialog.setContentView(R.layout.nomor2);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose2);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno2(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno2(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno2(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno2(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufC(View v) {
        mydialog.setContentView(R.layout.nomor3);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose3);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno3(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno3(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno3(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno3(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufD(View v) {
        mydialog.setContentView(R.layout.nomor4);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose4);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno4(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno4(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno4(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno4(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufE(View v) {
        mydialog.setContentView(R.layout.nomor5);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose5);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno5(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno5(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno5(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno5(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufF(View v) {
        mydialog.setContentView(R.layout.nomor6);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose6);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno6(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno6(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno6(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno6(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufG(View v) {
        mydialog.setContentView(R.layout.nomor7);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose7);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno7(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno7(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno7(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno7(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufH(View v) {
        mydialog.setContentView(R.layout.nomor8);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose8);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno8(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno8(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno8(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno8(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufI(View v) {
        mydialog.setContentView(R.layout.nomor9);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose9);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno9(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno9(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno9(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno9(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

    public void HurufJ(View v) {
        mydialog.setContentView(R.layout.nomor10);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose10);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno10(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno10(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno10(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno10(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufK(View v) {
        mydialog.setContentView(R.layout.nomor11);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose11);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno11(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno11(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno11(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno11(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufL(View v) {
        mydialog.setContentView(R.layout.nomor12);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose12);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno12(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno12(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno12(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno12(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

    public void HurufM(View v) {
        mydialog.setContentView(R.layout.nomor13);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose13);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno13(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno13(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno13(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno13(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufN(View v) {
        mydialog.setContentView(R.layout.nomor14);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose14);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno14(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno14(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno14(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno14(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufO(View v) {
        mydialog.setContentView(R.layout.nomor15);
        txtclose = mydialog.findViewById(R.id.txtclose15);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno15(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno15(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno15(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno15(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufP(View v) {
        mydialog.setContentView(R.layout.nomor16);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose16);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno16(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno16(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno16(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno16(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufQ(View v) {
        mydialog.setContentView(R.layout.nomor17);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose17);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno17(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno17(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno17(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno17(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufR(View v) {
        mydialog.setContentView(R.layout.nomor18);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose18);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno18(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno18(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno18(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno18(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufS(View v) {
        mydialog.setContentView(R.layout.nomor19);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose19);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno19(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno19(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno19(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno19(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufT(View v) {
        mydialog.setContentView(R.layout.nomor20);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose20);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno20(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno20(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno20(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno20(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

    public void HurufU(View v) {
        mydialog.setContentView(R.layout.nomor21);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose21);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno21(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno21(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno21(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno21(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufV(View v) {
        mydialog.setContentView(R.layout.nomor22);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose22);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno22(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno22(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno22(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno22(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void W(View v) {
        mydialog.setContentView(R.layout.nomor23);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose23);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno23(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno23(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno23(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno23(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }


    public void HurufX(View v) {
        mydialog.setContentView(R.layout.nomor24);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose24);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno24(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno24(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno24(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno24(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufY(View v) {
        mydialog.setContentView(R.layout.nomor25);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose25);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno25(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno25(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno25(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno25(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }



    public void HurufZ(View v) {
        mydialog.setContentView(R.layout.nomor26);
        txtclose = (TextView) mydialog.findViewById(R.id.txtclose26);
        txtclose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }

        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabAno26(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabBno26(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabCno26(View v) {
        mydialog.setContentView(R.layout.benar);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
    public void jawabDno26(View v) {
        mydialog.setContentView(R.layout.salah);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }

}