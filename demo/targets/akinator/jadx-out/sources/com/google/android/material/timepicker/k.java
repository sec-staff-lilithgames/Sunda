package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public TimeModel createFromParcel(Parcel parcel) {
        return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public TimeModel[] newArray(int i10) {
        return new TimeModel[i10];
    }
}
