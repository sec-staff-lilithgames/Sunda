package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MaterialCheckBox.SavedState createFromParcel(Parcel parcel) {
        MaterialCheckBox.SavedState savedState = new MaterialCheckBox.SavedState(parcel);
        savedState.f29103b = ((Integer) parcel.readValue(MaterialCheckBox.SavedState.class.getClassLoader())).intValue();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public MaterialCheckBox.SavedState[] newArray(int i10) {
        return new MaterialCheckBox.SavedState[i10];
    }
}
