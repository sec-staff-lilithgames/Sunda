package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public BackStackRecordState createFromParcel(Parcel parcel) {
        return new BackStackRecordState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public BackStackRecordState[] newArray(int i10) {
        return new BackStackRecordState[i10];
    }
}
