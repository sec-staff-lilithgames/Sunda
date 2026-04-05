package b1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.c3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object>[] newArray(int i10) {
        return new SnapshotStateList[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = g0.class.getClassLoader();
        }
        return h0.SnapshotStateList(parcel.readInt(), new c3(4, parcel, classLoader));
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateList<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
