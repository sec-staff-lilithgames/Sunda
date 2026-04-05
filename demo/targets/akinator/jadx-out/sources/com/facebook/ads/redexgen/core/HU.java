package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo;

/* loaded from: assets/audience_network.dex */
public class HU implements Parcelable.Creator<IcyInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final IcyInfo createFromParcel(Parcel parcel) {
        return new IcyInfo(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final IcyInfo[] newArray(int i10) {
        return new IcyInfo[i10];
    }
}
