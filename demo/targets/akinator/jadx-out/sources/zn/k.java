package zn;

import android.os.Parcel;
import android.os.Parcelable;
import io.bidmachine.media3.exoplayer.offline.DownloadRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public DownloadRequest createFromParcel(Parcel parcel) {
        return new DownloadRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public DownloadRequest[] newArray(int i10) {
        return new DownloadRequest[i10];
    }
}
