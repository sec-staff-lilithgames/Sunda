package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public DateValidatorPointForward createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public DateValidatorPointForward[] newArray(int i10) {
        return new DateValidatorPointForward[i10];
    }
}
