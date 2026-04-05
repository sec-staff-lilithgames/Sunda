package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Preference.BaseSavedState createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Preference.BaseSavedState[] newArray(int i10) {
        return new Preference.BaseSavedState[i10];
    }
}
