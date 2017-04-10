package swe.sofolab.myimageslideshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    ViewFlipper viewFlipper;

    Animation Fade_in,Fade_out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper=(ViewFlipper)findViewById(R.id.viewFlipper_xml);
        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out=AnimationUtils.loadAnimation(this,android.R.anim.fade_out);


        viewFlipper.setInAnimation(Fade_in);
        viewFlipper.setOutAnimation(Fade_out);

        viewFlipper.setAutoStart(true);

        viewFlipper.setFlipInterval(2000);

        viewFlipper.startFlipping();





    }
}
