package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements;

/* renamed from: com.facebook.ads.redexgen.X.Bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1106Bm implements Parcelable.Creator<Requirements> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Requirements createFromParcel(Parcel parcel) {
        return new Requirements(parcel.readInt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Requirements[] newArray(int i10) {
        return new Requirements[i10];
    }
}
