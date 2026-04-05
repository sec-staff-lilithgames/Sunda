package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ListPreference.SavedState createFromParcel(Parcel parcel) {
        ListPreference.SavedState savedState = new ListPreference.SavedState(parcel);
        savedState.f6892b = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public ListPreference.SavedState[] newArray(int i10) {
        return new ListPreference.SavedState[i10];
    }
}
