package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Requirements createFromParcel(Parcel parcel) {
        return new Requirements(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public Requirements[] newArray(int i10) {
        return new Requirements[i10];
    }
}
