package com.google.android.material.sidesheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SideSheetBehavior.SavedState[] newArray(int i10) {
        return new SideSheetBehavior.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SideSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SideSheetBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SideSheetBehavior.SavedState createFromParcel(Parcel parcel) {
        return new SideSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }
}
