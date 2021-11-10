package com.example.fragmentsprimeraclasse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boto1 = findViewById(R.id.button1);
        Button boto2 = findViewById(R.id.button2);
        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: inflar el fragment

                FragmentManager fm = getSupportFragmentManager();

                //if (fm.findFragmentById(R.id.contenidor1)==null){ // OPCIONAL, potser ens es igual si esta buit o no i volem machacar el contingut
                    Fragment1 fragment1 = new Fragment1();
                    fm.beginTransaction().replace(R.id.contenidor1,fragment1).commit(); // podem fer Add enlloc de replace. Pero si fem replace sempre ens asegurem que ho posara o machacara
                //}
            }
        });
        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();

                    Fragment2 fragment2 = new Fragment2();
                    fm.beginTransaction().replace(R.id.contenidor1,fragment2).commit();

            }
        });
    }
}