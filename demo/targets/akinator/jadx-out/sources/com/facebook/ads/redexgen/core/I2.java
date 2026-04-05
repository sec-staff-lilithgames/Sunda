package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;

/* loaded from: assets/audience_network.dex */
public class I2 implements Parcelable.Creator<VorbisComment> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final VorbisComment createFromParcel(Parcel parcel) {
        return new VorbisComment(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final VorbisComment[] newArray(int i10) {
        return new VorbisComment[i10];
    }
}
