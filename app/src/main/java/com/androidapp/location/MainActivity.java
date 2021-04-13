package com.androidapp.location;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mtxtInfo;
    LocationManager lctManager;
    List<String> locProviderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtInfo = findViewById(R.id.txtInfo);

        lctManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        locProviderList = lctManager.getAllProviders();
        mtxtInfo.setText("");
        for (String locProvider : locProviderList)
        {
            mtxtInfo.append("Lic.Provider" + locProvider + "\n");
            mtxtInfo.append("Enabled " + lctManager.isProviderEnabled(locProvider) + "\n\n" );
        }
    }
}