package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.ChapterFrame;

/* loaded from: assets/audience_network.dex */
public class HY implements Parcelable.Creator<ChapterFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ChapterFrame createFromParcel(Parcel parcel) {
        return new ChapterFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ChapterFrame[] newArray(int i10) {
        return new ChapterFrame[i10];
    }
}
