package com.inmobi.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parcel, "parcel");
        kotlin.jvm.internal.e0.checkNotNullParameter(parcel, "parcel");
        long j10 = parcel.readLong();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        String str3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        String str4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        String str5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        String str6 = string6 == null ? "" : string6;
        boolean z10 = parcel.readByte() != 0;
        String string7 = parcel.readString();
        Y6 y62 = new Y6(j10, str, str2, str3, str4, str5, str6, z10, string7 == null ? "" : string7);
        String string8 = parcel.readString();
        X6 x62 = new X6(y62, string8 == null ? "" : string8, parcel.readInt(), parcel.readLong());
        x62.f32489f = parcel.readInt();
        x62.f32490g = parcel.readString();
        return x62;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new X6[i10];
    }
}
