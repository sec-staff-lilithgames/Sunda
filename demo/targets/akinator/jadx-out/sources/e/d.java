package e;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ResultReceiver createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public ResultReceiver[] newArray(int i10) {
        return new ResultReceiver[i10];
    }
}
