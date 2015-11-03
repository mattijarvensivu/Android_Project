package com.example.maza.studentwallet;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by maza on 11/3/2015.
 */
public class PurchaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_purchase, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_purchaselabel);
        textView.setText("Purchase");
        return rootView;
    }
}
