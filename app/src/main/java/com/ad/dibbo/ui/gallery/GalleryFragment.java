package com.ad.dibbo.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ad.dibbo.R;
import com.mapswithme.maps.api.MapsWithMeApi;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        WebView webview;
        String html = "<iframe width=\"100%\" height=\"450\" src=\"https://embed.windy.com/embed2.html?lat=22.958&lon=89.978&zoom=6&level=surface&overlay=wind&menu=&message=&marker=&calendar=&pressure=&type=map&location=coordinates&detail=&detailLat=23.742&detailLon=90.428&metricWind=default&metricTemp=default&radarRange=-1\" frameborder=\"0\"></iframe>";

        webview = (WebView) root.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadData(html, "text/html", null);

        Button testButton;
        testButton = (Button)root.findViewById(R.id.testButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MapsWithMeApi.showPointOnMap(getActivity(), 22.186256, 90.466199, "Nizamul Chattara Govt. Primary School cum Cyclone Shelter");
            }
        });



        return root;
    }
}