package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.Token(parcel.readParcelable(null), null, null);
    }

    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.Token[] newArray(int i10) {
        return new MediaSessionCompat.Token[i10];
    }
}
