package wm;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.iab.vast.processor.VastAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastAd createFromParcel(Parcel parcel) {
        return new VastAd(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VastAd[] newArray(int i10) {
        return new VastAd[i10];
    }
}
