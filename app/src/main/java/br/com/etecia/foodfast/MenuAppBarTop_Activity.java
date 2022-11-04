package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;


public class MenuAppBarTop_Activity extends AppCompatActivity {
    //declarando a variavel global do objeto AppBar
    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);
        //apresentando a toolbar xml para o java
        idToolbar = findViewById(R.id.idToolbar);

        idToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no ícone",
                        Toast.LENGTH_SHORT).show();
            }
        });

        idToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no favorite",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSearch:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Search",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em More",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });


    }
}