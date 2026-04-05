package b1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SnapshotStateSet<Object>[] newArray(int i10) {
        return new SnapshotStateSet[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SnapshotStateSet<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet<Object> snapshotStateSet = new SnapshotStateSet<>();
        if (classLoader == null) {
            classLoader = SnapshotStateSet.class.getClassLoader();
        }
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            snapshotStateSet.add(parcel.readValue(classLoader));
        }
        return snapshotStateSet;
    }

    @Override // android.os.Parcelable.Creator
    public SnapshotStateSet<Object> createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
