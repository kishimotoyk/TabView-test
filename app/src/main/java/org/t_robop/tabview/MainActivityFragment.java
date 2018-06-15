package org.t_robop.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*****
 * 特にTextViewしか配置していないので、何もしていないです
 * もしJavaファイル上でレイアウトをいじりたいのなら、onCreateViewの中に書いてください
 *****/

public class MainActivityFragment extends Fragment {
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        //ここに書く
        return view;
    }

}
