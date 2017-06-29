package com.example.danny.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{
    private EditText billieJeanText;
    private EditText beatItText;
    private EditText smoothCriminalText;
    private EditText manInTheMirrorText;
    private EditText thrillerText;
    private EditText theWayYouMakeMeFeelText;
    private EditText pytText;
    private EditText badText;
    private EditText dontStopTilYouGetEnoughText;
    private EditText blackOrWhiteText;
    private EditText rockWithYouText;
    private EditText wannaBeStartinSomethinText;
    private EditText dirtyDianaText;

    private ImageView billieJeanImage;
    private ImageView beatItImage;
    private ImageView smoothCriminalImage;
    private ImageView manInTheMirrorImage;
    private ImageView thrillerImage;
    private ImageView theWayYouMakeMeFeelImage;
    private ImageView pytImage;
    private ImageView badImage;
    private ImageView dontStopTilYouGetEnoughImage;
    private ImageView blackOrWhiteImage;
    private ImageView rockWithYouImage;
    private ImageView wannaBeStartinSomethinImage;
    private ImageView dirtyDianaImage;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEditText();
        addImageView();
        addClickListener();

    }

    public void addEditText()
    {
        billieJeanText = (EditText)findViewById(R.id.billieJeanText);
        beatItText = (EditText)findViewById(R.id.beatItText);
        smoothCriminalText = (EditText)findViewById(R.id.smoothCriminalText);
        manInTheMirrorText = (EditText)findViewById(R.id.manInTheMirrorText);
        thrillerText = (EditText)findViewById(R.id.thrillerText);
        theWayYouMakeMeFeelText = (EditText)findViewById(R.id.theWayYouMakeMeFeelText);
        pytText = (EditText)findViewById(R.id.pytText);
        badText = (EditText)findViewById(R.id.badText);
        dontStopTilYouGetEnoughText = (EditText)findViewById(R.id.dontStopTilYouGetEnoughText);
        blackOrWhiteText = (EditText)findViewById(R.id.blackOrWhiteText);
        rockWithYouText = (EditText)findViewById(R.id.rockWithYouText);
        wannaBeStartinSomethinText = (EditText)findViewById(R.id.wannaBeStartinSomethinText);
        dirtyDianaText = (EditText)findViewById(R.id.dirtyDianaText);
    }

    public void addImageView()
    {
        billieJeanImage = (ImageView)findViewById(R.id.billieJeanImage);
        beatItImage = (ImageView)findViewById(R.id.beatItImage);
        smoothCriminalImage = (ImageView)findViewById(R.id.smoothCriminalImage);
        manInTheMirrorImage = (ImageView)findViewById(R.id.manInTheMirrorImage);
        thrillerImage = (ImageView)findViewById(R.id.thrillerImage);
        theWayYouMakeMeFeelImage = (ImageView)findViewById(R.id.theWayYouMakeMeFeelImage);
        pytImage = (ImageView)findViewById(R.id.pytImage);
        badImage = (ImageView)findViewById(R.id.badImage);
        dontStopTilYouGetEnoughImage = (ImageView)findViewById(R.id.dontStopTilYouGetEnoughImage);
        blackOrWhiteImage = (ImageView)findViewById(R.id.blackOrWhiteImage);
        rockWithYouImage = (ImageView)findViewById(R.id.rockWithYouImage);
        wannaBeStartinSomethinImage = (ImageView)findViewById(R.id.wannaBeStartinSomethinImage);
        dirtyDianaImage = (ImageView)findViewById(R.id.dirtyDianaImage);
    }

    public void addClickListener()
    {
        billieJeanImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.billiejean);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Billie Jean By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.billiejean);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Billie Jean By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        beatItImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.beatit);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Beat It By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.beatit);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Beat It By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        smoothCriminalImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.smoothcriminal);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Smooth Criminal By: Michael Jackson",Toast.LENGTH_SHORT).show();

                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.smoothcriminal);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Smooth Criminal By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        manInTheMirrorImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.maninthemirror);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Man In The Mirror By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.maninthemirror);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Man In The Mirror By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        thrillerImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.thriller);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Thriller By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.thriller);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Thriller By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        theWayYouMakeMeFeelImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.thewayyoumakemefeel);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing The Way You Make Me Feel By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.thewayyoumakemefeel);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing The Way You Make Me Feel By: Michael Jackson",Toast.LENGTH_SHORT).show();
            }
        });

        pytImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pyt);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing (Pretty Young Thang) It By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pyt);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing (Pretty Young Thang) It By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        badImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.bad);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Bad By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.bad);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Bad By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        dontStopTilYouGetEnoughImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.dontstoptilyougetenough);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Dont Stop Til You Get Enough By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.dontstoptilyougetenough);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Dont Stop Til You Get Enough By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        blackOrWhiteImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.blackorwhite);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Black Or White By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.blackorwhite);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Black Or White By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        rockWithYouImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rockwithyou);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Rock With You By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rockwithyou);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Rock With You By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        wannaBeStartinSomethinImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wannabestartinsomethin);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Wanna Be Startin Somethin By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wannabestartinsomethin);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Wanna Be Startin Somethin By: Michael Jackson",Toast.LENGTH_SHORT).show();

            }
        });

        dirtyDianaImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if(mediaPlayer == null)
                {
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.dirtydiana);
                    mediaPlayer.start();
                    Toast.makeText(getApplicationContext(), "Playing Dirty Diana By: Michael Jackson",Toast.LENGTH_SHORT).show();
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.dirtydiana);
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(), "Playing Dirty Diana By: Michael Jackson",Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
