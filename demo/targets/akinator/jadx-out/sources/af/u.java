package af;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.offline.StreamKey;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public StreamKey createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public StreamKey[] newArray(int i10) {
        return new StreamKey[i10];
    }
}
