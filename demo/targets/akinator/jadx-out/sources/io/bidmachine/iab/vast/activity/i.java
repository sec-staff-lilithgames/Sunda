package io.bidmachine.iab.vast.activity;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastView.z createFromParcel(Parcel parcel) {
        VastView.z zVar = new VastView.z(parcel);
        zVar.f60473b = (VastView.B) parcel.readParcelable(VastView.B.class.getClassLoader());
        return zVar;
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastView.z[] newArray(int i10) {
        return new VastView.z[i10];
    }
}
