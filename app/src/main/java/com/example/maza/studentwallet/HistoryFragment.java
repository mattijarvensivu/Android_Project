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
public class HistoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_history, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_History);
        textView.setText("History");
        return rootView;
    }
}
