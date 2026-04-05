package we;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ApicFrame[] newArray(int i10) {
        return new ApicFrame[i10];
    }
}
