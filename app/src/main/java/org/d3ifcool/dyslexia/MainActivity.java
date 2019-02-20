package org.d3ifcool.dyslexia;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView mBaca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mBaca = findViewById(R.id.imgMembaca);
    mBaca.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent iMembaca = new Intent(getApplicationContext(),MembacaActivity.class);
            startActivity(iMembaca);
        }
    });

    }
}
