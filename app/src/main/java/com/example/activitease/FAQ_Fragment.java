package com.example.activitease;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FAQ_Fragment extends Fragment {
    private TextView head1;
    private TextView head2;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //head1 = (TextView) findViewById(R.id.head1);
        //head2 = (TextView) findViewById(R.id.head2);

        //String faqText = getString(R.string.head2);
        //faqText = String.format(faqText, S);

        //head2.setText(faqText);

        return inflater.inflate(R.layout.faq_page, container, false);
    }
}
