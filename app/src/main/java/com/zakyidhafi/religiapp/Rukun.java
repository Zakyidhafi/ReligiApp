package com.zakyidhafi.religiapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Rukun implements Parcelable {
    private String name;
    private String detail;
    private String dalil;
    private int photo;

    public Rukun(){

    }

    protected Rukun(Parcel in) {
        name = in.readString();
        detail = in.readString();
        dalil = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Rukun> CREATOR = new Creator<Rukun>() {
        @Override
        public Rukun createFromParcel(Parcel in) {
            return new Rukun(in);
        }

        @Override
        public Rukun[] newArray(int size) {
            return new Rukun[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDalil() {
        return dalil;
    }

    public void setDalil(String dalil) {
        this.dalil = dalil;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(dalil);
        dest.writeInt(photo);
    }
}
