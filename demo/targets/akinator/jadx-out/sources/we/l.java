package we;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public TextInformationFrame createFromParcel(Parcel parcel) {
        return new TextInformationFrame((String) com.google.android.exoplayer2.util.a.checkNotNull(parcel.readString()), parcel.readString(), b5.copyOf((String[]) com.google.android.exoplayer2.util.a.checkNotNull(parcel.createStringArray())));
    }

    @Override // android.os.Parcelable.Creator
    public TextInformationFrame[] newArray(int i10) {
        return new TextInformationFrame[i10];
    }
}
