package android.support.v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public MediaDescriptionCompat[] newArray(int i10) {
        return new MediaDescriptionCompat[i10];
    }
}
