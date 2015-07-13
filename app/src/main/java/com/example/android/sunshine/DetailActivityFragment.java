package com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {


    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle extras=getActivity().getIntent().getExtras();

        View rootView=inflater.inflate(R.layout.fragment_detail, container, false);
        TextView miTextoDetalle=(TextView) rootView.findViewById(R.id.textViewBigDetail);
        miTextoDetalle.setText(extras.getString("datosDetalle"));
        return rootView;
    }
}
