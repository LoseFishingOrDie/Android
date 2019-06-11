package com.example.dome2;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by IT-CTY on 2018/4/25.
 */

public class Fragment4 extends Fragment {
    private TextView textView;
    private Button button;
    private ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment4,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imageView=(ImageView)getActivity().findViewById(R.id.tiaozhuan);
        imageView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Userdetail.class);
               startActivity(intent);
            }
        });
        //textView=(TextView)getActivity().findViewById(R.id.textView3);
        //button=(Button)getActivity().findViewById(R.id.login1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               Intent intent=new Intent(getActivity(),Userdetail.class);
//               startActivity(intent);
//            }
//        });


    }
}
