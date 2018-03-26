package rvir.mycloset;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DodajOblekoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_obleko);
    }
    public void shraniOblacilo(View view) {
        Intent intent = new Intent(this, SeznamOblekActivity.class);
        startActivity(intent);
}
}
