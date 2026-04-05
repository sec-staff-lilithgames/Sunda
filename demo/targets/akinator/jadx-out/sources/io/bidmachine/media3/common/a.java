package io.bidmachine.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.media3.common.DrmInitData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public DrmInitData.SchemeData createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public DrmInitData.SchemeData[] newArray(int i10) {
        return new DrmInitData.SchemeData[i10];
    }
}
