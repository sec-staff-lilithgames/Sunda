package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import p0.o2;
import p0.y4;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public ParcelableSnapshotMutableState<Object>[] newArray(int i10) {
        return new ParcelableSnapshotMutableState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        y4 y4VarNeverEqualPolicy;
        if (classLoader == null) {
            classLoader = a.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            y4VarNeverEqualPolicy = z4.neverEqualPolicy();
        } else if (i10 == 1) {
            y4VarNeverEqualPolicy = z4.structuralEqualityPolicy();
        } else if (i10 == 2) {
            y4VarNeverEqualPolicy = z4.referentialEqualityPolicy();
        } else {
            throw new IllegalStateException(o2.k(i10, "Unsupported MutableState policy ", " was restored"));
        }
        return new ParcelableSnapshotMutableState<>(value, y4VarNeverEqualPolicy);
    }

    @Override // android.os.Parcelable.Creator
    public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
