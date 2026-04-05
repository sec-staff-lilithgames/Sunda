package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.search.SearchBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SearchBar.SavedState[] newArray(int i10) {
        return new SearchBar.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchBar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchBar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SearchBar.SavedState createFromParcel(Parcel parcel) {
        return new SearchBar.SavedState(parcel);
    }
}
