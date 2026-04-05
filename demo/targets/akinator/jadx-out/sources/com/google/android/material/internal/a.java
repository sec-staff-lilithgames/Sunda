package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public CheckableImageButton.SavedState[] newArray(int i10) {
        return new CheckableImageButton.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public CheckableImageButton.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public CheckableImageButton.SavedState createFromParcel(Parcel parcel) {
        return new CheckableImageButton.SavedState(parcel, null);
    }
}
