package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Fragment.SavedState[] newArray(int i10) {
        return new Fragment.SavedState[i10];
    }

    @Override // android.os.Parcelable.Creator
    public Fragment.SavedState createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Fragment.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment.SavedState(parcel, classLoader);
    }
}
