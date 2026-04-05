package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public PreferenceGroup.SavedState createFromParcel(Parcel parcel) {
        PreferenceGroup.SavedState savedState = new PreferenceGroup.SavedState(parcel);
        savedState.f6918b = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public PreferenceGroup.SavedState[] newArray(int i10) {
        return new PreferenceGroup.SavedState[i10];
    }
}
