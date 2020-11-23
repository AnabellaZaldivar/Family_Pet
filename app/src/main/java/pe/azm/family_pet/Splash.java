package pe.azm.family_pet;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    ImageView logopetshop;
    TextView textlogopetshop;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

textlogopetshop = findViewById(R.id.txtlogopetshop);
logopetshop=findViewById(R.id.imglogopetshop);
animation= AnimationUtils.loadAnimation( this, R.anim.animacionsplash);
logopetshop.startAnimation(animation);
textlogopetshop.startAnimation(animation);
new Timer().schedule(new TimerTask() {
    @Override
    public void run() {
        Intent i = new Intent(Splash.this, MainActivity.class);
         i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
          startActivity(i);
    }
},4000);

    }
}