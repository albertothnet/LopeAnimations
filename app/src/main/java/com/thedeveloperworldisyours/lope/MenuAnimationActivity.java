package com.thedeveloperworldisyours.lope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.thedeveloperworldisyours.lope.animation.AppearanceActivity;
import com.thedeveloperworldisyours.lope.animation.DefaultActivity;
import com.thedeveloperworldisyours.lope.animation.DiagonalActivity;
import com.thedeveloperworldisyours.lope.animation.DivideActivity;
import com.thedeveloperworldisyours.lope.animation.DownActivity;
import com.thedeveloperworldisyours.lope.animation.GmailActivity;
import com.thedeveloperworldisyours.lope.animation.IosActivity;
import com.thedeveloperworldisyours.lope.animation.LeftActivity;
import com.thedeveloperworldisyours.lope.animation.NavigationActivity;
import com.thedeveloperworldisyours.lope.animation.RightActivity;
import com.thedeveloperworldisyours.lope.animation.ScrollDownActivity;
import com.thedeveloperworldisyours.lope.animation.UpActivity;

public class MenuAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_animation_activity);

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    public void onBackPressed() {
        finishMyActivity();
    }

    public void finishMyActivity() {
        finish();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void goToGmail(View view) {
        Intent intent = new Intent(this, GmailActivity.class);
        startActivity(intent);
    }

    public void goToRight(View view) {
        Intent intent = new Intent(this, RightActivity.class);
        startActivity(intent);
    }

    public void goToLeft(View view) {
        Intent intent = new Intent(this, LeftActivity.class);
        startActivity(intent);
    }

    public void goToUp(View view) {
        Intent intent = new Intent(this, UpActivity.class);
        startActivity(intent);
    }

    public void goToDown(View view) {
        Intent intent = new Intent(this, DownActivity.class);
        startActivity(intent);
    }

    public void goToiOS(View view) {
        Intent intent = new Intent(this, IosActivity.class);
        startActivity(intent);
    }

    public void goToScrollDown(View view) {
        Intent intent = new Intent(this, ScrollDownActivity.class);
        startActivity(intent);
    }

    public void goToDiagonal(View view) {
        Intent intent = new Intent(this, DiagonalActivity.class);
        startActivity(intent);
    }

    public void goToDivide(View view) {
        Intent intent = new Intent(this, DivideActivity.class);
        startActivity(intent);
    }

    public void goToNavigation(View view) {
        Intent intent = new Intent(this, NavigationActivity.class);
        startActivity(intent);
    }

    public void goToAppearance(View view) {
        Intent intent = new Intent(this, AppearanceActivity.class);
        startActivity(intent);
    }

    public void goToDefault(View view) {
        Intent intent = new Intent(this, DefaultActivity.class);
        startActivity(intent);
    }

}
