package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public AppCompatSpinner.SavedState createFromParcel(Parcel parcel) {
        AppCompatSpinner.SavedState savedState = new AppCompatSpinner.SavedState(parcel);
        savedState.f5037b = parcel.readByte() != 0;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public AppCompatSpinner.SavedState[] newArray(int i10) {
        return new AppCompatSpinner.SavedState[i10];
    }
}
