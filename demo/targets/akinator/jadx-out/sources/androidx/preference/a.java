package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public EditTextPreference.SavedState createFromParcel(Parcel parcel) {
        EditTextPreference.SavedState savedState = new EditTextPreference.SavedState(parcel);
        savedState.f6891b = parcel.readString();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public EditTextPreference.SavedState[] newArray(int i10) {
        return new EditTextPreference.SavedState[i10];
    }
}
