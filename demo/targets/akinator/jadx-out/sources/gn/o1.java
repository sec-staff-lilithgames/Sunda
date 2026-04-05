package gn;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.media3.common.StreamKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public StreamKey createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public StreamKey[] newArray(int i10) {
        return new StreamKey[i10];
    }
}
