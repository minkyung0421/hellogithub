package kr.hs.aza923emirim.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button)findViewByid(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText( this, "Hello!", Toast.LENGTH_SHORT0).show();
    }
}
