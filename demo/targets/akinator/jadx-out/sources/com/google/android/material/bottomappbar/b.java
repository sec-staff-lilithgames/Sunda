package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public BottomAppBar.SavedState[] newArray(int i10) {
        return new BottomAppBar.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public BottomAppBar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomAppBar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public BottomAppBar.SavedState createFromParcel(Parcel parcel) {
        return new BottomAppBar.SavedState(parcel, null);
    }
}
