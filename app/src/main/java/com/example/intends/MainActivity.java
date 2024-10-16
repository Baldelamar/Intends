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

    // BOTON PARA ABRIR YOUTUBE (INTENT EXPLICITO)
    Button btnYouTube = findViewById(R.id.btnYouTube);
    btnYouTube.setOnClickListener(v -> {
        Intent intent = new Intent();
        // AQUI INDICO EL NOMBRE DEL PAQUETE ESPECIFICO ASI COMO LA ACTIVIDAD QUE DESEO ABRIR
        intent.setClassName("com.google.android.youtube",
                "com.google.android.youtube.HomeActivity");
        startActivity(intent);
    });

    // BOTON PARA ABRIR FACEBOOK (INTENT EXPLICITO)
    Button btnFacebook = findViewById(R.id.btnFacebook);
    btnFacebook.setOnClickListener(v -> {
        Intent intent = new Intent();
        // AQUI INDICO EL NOMBRE DEL PAQUETE ASI COMO LA ACTIVIDAD QUE DESEO ABRIR
        intent.setClassName("com.facebook.katana",
                "com.facebook.katana.LoginActivity");
        startActivity(intent);
    });

    // BOTON PARA ABRIR TWITTER (INTENT EXPLICITO)
    Button btnTwitter = findViewById(R.id.btnTwitter);
    btnTwitter.setOnClickListener(v -> {
        Intent intent = new Intent();
        // AQUI INDICO EL NOMBRE DEL PAQUETE ESPECIFICO ASI COMO LA ACTIVIDAD QUE DESEO ABRIR
        intent.setClassName("com.twitter.android",
                "com.twitter.android.StartActivity");
        startActivity(intent);
    });

    // BOTON PARA ABRIR TWITCH (INTENT IMPLICITO)
    Button btnTwitch = findViewById(R.id.btnTwitch);
    btnTwitch.setOnClickListener(v -> {
        // AQUI LE INDICO QUE DEBE ABRIR ALGO
        Intent intent = new Intent(Intent.ACTION_VIEW);
        //PERO NO LE DIGO CON QUE APLICACION LO DEBE ABRIR
        intent.setData(Uri.parse("https://www.twitch.tv/"));
        startActivity(intent);
    });

    // BOTON PARA ABRIR WIKIPEDIA (INTENT IMPLICITO)
    Button btnWikipedia = findViewById(R.id.btnWikipedia);
    btnWikipedia.setOnClickListener(v -> {
        // AQUI LE INDICO QUE DEBE ABRIR ALGO
        Intent intent = new Intent(Intent.ACTION_VIEW);
        // PERO NO LE DIGO CON QUE APLICACION LO DEBE ABRIR
        intent.setData(Uri.parse("https://www.wikipedia.org/"));
        startActivity(intent);
    });

    // BOTÓN PARA COMPARTIR UN MENSAJE  (INTENT IMPLÍCITO)
    Button btnWhatsApp = findViewById(R.id.btnWhatsApp);
    btnWhatsApp.setOnClickListener(v -> {
        // AQUI LE INDICO QUE DEBE HACER ALGO
        Intent intent = new Intent(Intent.ACTION_SEND);
        // PERO NO LE DIGO CON QUE APICACION LO DEBE HACER
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Este es un mensaje para compartir"); // Mensaje que deseas compartir

        startActivity(intent);
    });
}

}

