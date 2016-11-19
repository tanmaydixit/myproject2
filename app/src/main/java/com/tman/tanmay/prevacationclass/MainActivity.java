package com.tman.tanmay.prevacationclass;

import android.app.DownloadManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener()
        {
           @Override
            public void  onClick(View view)
           {


               DownloadManager downloadManager;
               downloadManager=(DownloadManager) getSystemService(DOWNLOAD_SERVICE);
               Uri uri=Uri.parse("http://kmmc.in/wp-content/uploads/2014/01/lesson2.pdf");
               DownloadManager.Request request=new DownloadManager.Request(uri)
                       .setTitle("How to use pdf")
                       .setDescription("hello world")
                       .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

               downloadManager.enqueue(request);


           }
        });
        //b1 = (Button) findViewById(R.id.mybutton);
    }





}
