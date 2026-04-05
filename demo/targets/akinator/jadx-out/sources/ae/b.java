package ae;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.container.Mp4LocationData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Mp4LocationData createFromParcel(Parcel parcel) {
        return new Mp4LocationData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Mp4LocationData[] newArray(int i10) {
        return new Mp4LocationData[i10];
    }
}
