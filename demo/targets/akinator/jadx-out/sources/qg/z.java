package qg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class z implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public ParcelableSparseArray[] newArray(int i10) {
        return new ParcelableSparseArray[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public ParcelableSparseArray createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, null);
    }
}
