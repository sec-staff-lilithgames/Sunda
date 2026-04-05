package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* loaded from: assets/audience_network.dex */
public class BV implements Parcelable.Creator<DownloadRequest> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final DownloadRequest createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final DownloadRequest[] newArray(int i10) {
        return new DownloadRequest[i10];
    }
}
