package com.example.nsutallin1.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.nsutallin1.Activity.CollegeActivity;
import com.example.nsutallin1.Activity.ImsActivity;
import com.example.nsutallin1.Activity.SyllabusActivity;
import com.example.nsutallin1.R;

public class HomeFragment extends Fragment {

    private LinearLayout clgStuff, imsStuff, syllabus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        clgStuff = rootView.findViewById(R.id.clg_stuff);
        imsStuff = rootView.findViewById(R.id.ims_stuff);
        syllabus = rootView.findViewById(R.id.syllabus);

        clgStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CollegeActivity.class);
                startActivity(intent);
            }
        });

        imsStuff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ImsActivity.class);
                startActivity(intent);
            }
        });

        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SyllabusActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
