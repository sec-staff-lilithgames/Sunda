package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* renamed from: com.facebook.ads.redexgen.X.Hf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1253Hf implements Parcelable.Creator<MlltFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final MlltFrame createFromParcel(Parcel parcel) {
        return new MlltFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final MlltFrame[] newArray(int i10) {
        return new MlltFrame[i10];
    }
}
