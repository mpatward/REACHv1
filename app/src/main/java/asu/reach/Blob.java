package asu.reach;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.VideoView;


public class Blob extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener{

    ImageButton one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve;
    ScrollView trickView;
    ImageView title;
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_blob);

        one = (ImageButton)findViewById(R.id.trickOneBtn);
        two = (ImageButton)findViewById(R.id.trickTwoBtn);
        three = (ImageButton)findViewById(R.id.trickThreeBtn);
        four = (ImageButton)findViewById(R.id.trickFourBtn);
        five = (ImageButton)findViewById(R.id.trickFiveBtn);
        six = (ImageButton)findViewById(R.id.trickSixBtn);
        seven = (ImageButton)findViewById(R.id.trickSevenBtn);
        eight = (ImageButton)findViewById(R.id.trickEightBtn);
        nine = (ImageButton)findViewById(R.id.trickNineBtn);
        ten = (ImageButton)findViewById(R.id.trickTenBtn);
        eleven = (ImageButton)findViewById(R.id.trickElevenBtn);
        twelve = (ImageButton)findViewById(R.id.trickTwelveBtn);
        trickView = (ScrollView)findViewById(R.id.trickView);
        vid = (VideoView)findViewById(R.id.videoView);
        title = (ImageView)findViewById(R.id.titleView);

        vid.setOnCompletionListener(this);
        vid.setOnPreparedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_blob, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void oneClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_ONE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.warble_n));
        vid.start();
    }
    public void twoClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_TWO","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.jump_n));
        vid.start();
    }
    public void threeClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_THREE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.dance_n));
        vid.start();
    }
    public void fourClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_FOUR","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.flip_n));
        vid.start();
    }
    public void fiveClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_FIVE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.bounce_n));
        vid.start();
    }
    public void sixClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_SIX","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.shrink_n));
        vid.start();
    }
    public void sevenClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_SEVEN","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.grow_n));
        vid.start();
    }
    public void eightClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_EIGHT","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.splat_n));
        vid.start();
    }
    public void nineClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_NINE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.fly_n));
        vid.start();
    }
    public void tenClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_TEN","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.double_bounce_n));
        vid.start();
    }
    public void elevenClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_ELEVEN","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.crater_jump_n));
        vid.start();
    }
    public void twelveClick(View v){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_TWELVE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setVideoURI(Uri.parse("android.resource://asu.reach/" + R.raw.glow_n));
        vid.start();
    }

    private void locked(){
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_LOCKED","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        Toast.makeText(this, "SORRY! Not unlocked yet.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        try {
            DBHelper helper = new DBHelper(this);
            helper.trackEvent(helper,"BLOB_TRICK_COMPLETE","INSIDE_BLOB_TRICKS");
            helper.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        vid.setBackgroundResource(R.drawable.background_space);
        title.setVisibility(View.VISIBLE);
        trickView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        vid.setBackgroundResource(0);
        title.setVisibility(View.INVISIBLE);
        trickView.setVisibility(View.INVISIBLE);
    }

    public void backClicked(View v){
        if(vid.isPlaying()){
            try {
                DBHelper helper = new DBHelper(this);
                helper.trackEvent(helper,"BLOB_TRICK_BACK_PRESSED","INSIDE_BLOB_TRICKS");
                helper.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            vid.stopPlayback();
            vid.setBackgroundResource(R.drawable.background_space);
            title.setVisibility(View.VISIBLE);
            trickView.setVisibility(View.VISIBLE);

        }else{
            super.onBackPressed();
        }
    }
}
