package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public TextInputLayout.SavedState[] newArray(int i10) {
        return new TextInputLayout.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public TextInputLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public TextInputLayout.SavedState createFromParcel(Parcel parcel) {
        return new TextInputLayout.SavedState(parcel, null);
    }
}
