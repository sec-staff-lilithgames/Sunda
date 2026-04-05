package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public AppBarLayout.BaseBehavior.SavedState[] newArray(int i10) {
        return new AppBarLayout.BaseBehavior.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public AppBarLayout.BaseBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public AppBarLayout.BaseBehavior.SavedState createFromParcel(Parcel parcel) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, null);
    }
}
