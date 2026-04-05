package com.facebook.ads.androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.I2;

/* loaded from: assets/audience_network.dex */
public final class VorbisComment extends com.facebook.ads.androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new I2();

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }
}
