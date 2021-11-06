package com.google.fastcf.Maps;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.google.fastcf.R;

public class diachi extends AppCompatActivity {
    Button btnThem1, btnThem2, btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        AnhXa();
    }

    private void AnhXa() {
        btnThem1 = (Button) findViewById(R.id.btnThem1);
        btnThem2 = (Button) findViewById(R.id.btnThem2);
        btnback = (Button) findViewById(R.id.playbackDC);
    }

}
