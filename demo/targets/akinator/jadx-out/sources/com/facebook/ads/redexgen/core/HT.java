package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;

/* loaded from: assets/audience_network.dex */
public class HT implements Parcelable.Creator<IcyHeaders> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final IcyHeaders createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final IcyHeaders[] newArray(int i10) {
        return new IcyHeaders[i10];
    }
}
