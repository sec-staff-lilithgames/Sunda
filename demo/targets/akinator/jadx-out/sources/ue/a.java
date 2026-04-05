package ue;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public PictureFrame createFromParcel(Parcel parcel) {
        return new PictureFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public PictureFrame[] newArray(int i10) {
        return new PictureFrame[i10];
    }
}
