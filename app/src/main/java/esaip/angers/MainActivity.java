package esaip.angers;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText login, mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reupereration des widgets
        login= findViewById(R.id.login);
        mdp=findViewById(R.id.pwd);
    }
    public void clickValider(View v){
        Toast t= Toast.makeText(MainActivity.this, "Bonjour", Toast.LENGTH_SHORT);
        t.show();
    }
    public void effacer(View v){

        //TODO effacer les champs login et pwd
        login.setText("");
        mdp.setText("");
    }
    public void quitter(View v){
        finish();
    }
}