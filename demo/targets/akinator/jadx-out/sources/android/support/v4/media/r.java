package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat.MediaItem createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat.MediaItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public MediaBrowserCompat.MediaItem[] newArray(int i10) {
        return new MediaBrowserCompat.MediaItem[i10];
    }
}
