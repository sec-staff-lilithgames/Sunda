package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel parcel) {
        MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = new MediaSessionCompat.ResultReceiverWrapper();
        resultReceiverWrapper.f4551b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return resultReceiverWrapper;
    }

    @Override // android.os.Parcelable.Creator
    public MediaSessionCompat.ResultReceiverWrapper[] newArray(int i10) {
        return new MediaSessionCompat.ResultReceiverWrapper[i10];
    }
}
