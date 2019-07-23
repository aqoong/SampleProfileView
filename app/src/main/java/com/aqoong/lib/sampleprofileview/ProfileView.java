package com.aqoong.lib.sampleprofileview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Andy
 * <p>
 * email : cooldnjsdn@gmail.com
 * date  : 2019-07-23
 **/
public class ProfileView extends LinearLayout
{
    private ImageView   vImage;
    private TextView    vNickName;
    private Button      vBtnReport;

    private UserData    userData;

    private ButtonClickListener clickListener;

    public ProfileView(Context context)
    {
        this(context, null);
    }

    public ProfileView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        setup();
    }

    private void setup(){
        final LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_profile_view, this);

        vImage      = findViewById(R.id.image);
        vNickName   = findViewById(R.id.nickname);
        vBtnReport  = findViewById(R.id.btn_report);
    }

    //사용자 호출 메소드
    public void setUserData(UserData userData){
        this.userData = userData;

        vImage.setImageURI(convertStringToUri(userData.getImagePath()));
        vNickName.setText(userData.getNickName());
    }

    public void setReportListener(ButtonClickListener listener){
        this.clickListener = listener;

        vBtnReport.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                clickListener.onClick(v);
            }
        });
    }

    private Uri convertStringToUri(String path){
        Uri uri = Uri.parse(path);
        return uri;
    }

    public UserData getUserData(){
        return this.userData;
    }
}
