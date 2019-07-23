package com.aqoong.lib.sampleprofileview;

/**
 * Created by Andy
 * <p>
 * email : cooldnjsdn@gmail.com
 * date  : 2019-07-23
 **/
public class UserData
{
    String  name;            //이름
    String  nickName;        //닉네임
    long    birthDt;         //생일
    long    registDt;        //가입일
    String  tel;             //전화번호
    String  address;         //주소

    String  imagePath;      //이미지 경로


    public UserData(String name,
                    String imagePath,
                    String nickName,
                    long birthDt,
                    long registDt,
                    String tel,
                    String address){
        setName(name);
        setNickName(nickName);
        setBirthDt(birthDt);
        setRegistDt(registDt);
        setTel(tel);
        setAddress(address);

        setImagePath(imagePath);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public void setBirthDt(long birthDt)
    {
        this.birthDt = birthDt;
    }

    public void setRegistDt(long registDt)
    {
        this.registDt = registDt;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }

    public String getName()
    {
        return name;
    }

    public String getNickName()
    {
        return nickName;
    }

    public long getBirthDt()
    {
        return birthDt;
    }

    public long getRegistDt()
    {
        return registDt;
    }

    public String getTel()
    {
        return tel;
    }

    public String getAddress()
    {
        return address;
    }

    public String getImagePath()
    {
        return imagePath;
    }
}
