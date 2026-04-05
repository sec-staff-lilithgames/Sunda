package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;

/* renamed from: com.facebook.ads.redexgen.X.Hl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1259Hl implements Parcelable.Creator<MotionPhotoMetadata> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
        return new MotionPhotoMetadata(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final MotionPhotoMetadata[] newArray(int i10) {
        return new MotionPhotoMetadata[i10];
    }
}
