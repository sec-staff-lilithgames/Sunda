package com.google.android.material.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SearchView.SavedState[] newArray(int i10) {
        return new SearchView.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SearchView.SavedState createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel);
    }
}
