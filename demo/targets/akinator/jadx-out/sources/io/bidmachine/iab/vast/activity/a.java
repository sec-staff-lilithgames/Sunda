package io.bidmachine.iab.vast.activity;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastView.B createFromParcel(Parcel parcel) {
        VastView.B b10 = new VastView.B();
        b10.f60457b = null;
        b10.f60458c = 5.0f;
        b10.f60459e = 0;
        b10.f60460f = 0;
        b10.f60461g = true;
        b10.f60462h = false;
        b10.f60463i = false;
        b10.f60464j = false;
        b10.f60465k = false;
        b10.f60466l = false;
        b10.f60467m = false;
        b10.f60468n = false;
        b10.f60469o = true;
        b10.f60470p = false;
        b10.f60457b = parcel.readString();
        b10.f60458c = parcel.readFloat();
        b10.f60459e = parcel.readInt();
        b10.f60460f = parcel.readInt();
        b10.f60461g = parcel.readByte() != 0;
        b10.f60462h = parcel.readByte() != 0;
        b10.f60463i = parcel.readByte() != 0;
        b10.f60464j = parcel.readByte() != 0;
        b10.f60465k = parcel.readByte() != 0;
        b10.f60466l = parcel.readByte() != 0;
        b10.f60467m = parcel.readByte() != 0;
        b10.f60468n = parcel.readByte() != 0;
        b10.f60469o = parcel.readByte() != 0;
        b10.f60470p = parcel.readByte() != 0;
        return b10;
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastView.B[] newArray(int i10) {
        return new VastView.B[i10];
    }
}
