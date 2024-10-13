package com.example.intends;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//    }
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Botón para abrir YouTube (Intent Explícito)
    Button btnYouTube = findViewById(R.id.btnYouTube);
    btnYouTube.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/"));
        startActivity(intent);
    });

    // Botón para abrir Facebook (Intent Explícito)
    Button btnFacebook = findViewById(R.id.btnFacebook);
    btnFacebook.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(intent);
    });

    // Botón para abrir Twitter (Intent Explícito)
    Button btnTwitter = findViewById(R.id.btnTwitter);
    btnTwitter.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.twitter.com/"));
        startActivity(intent);
    });

    // Botón para abrir Twitch (Intent Implícito)
    Button btnTwitch = findViewById(R.id.btnTwitch);
    btnTwitch.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.twitch.tv/"));
        startActivity(intent);
    });

    // Botón para abrir Wikipedia (Intent Implícito)
    Button btnWikipedia = findViewById(R.id.btnWikipedia);
    btnWikipedia.setOnClickListener(v -> {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.wikipedia.org/"));
        startActivity(intent);
    });

    // Botón para abrir WhatsApp (Intent Implícito)
    Button btnWhatsApp = findViewById(R.id.btnWhatsApp);
    btnWhatsApp.setOnClickListener(v -> {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (intent != null) {
            startActivity(intent);
        } else {
            // Acción cuando WhatsApp no está instalado
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"));
            startActivity(intent);
        }
    });
}
}

