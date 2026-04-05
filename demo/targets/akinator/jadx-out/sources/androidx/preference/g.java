package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.TwoStatePreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public TwoStatePreference.SavedState createFromParcel(Parcel parcel) {
        TwoStatePreference.SavedState savedState = new TwoStatePreference.SavedState(parcel);
        savedState.f6923b = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public TwoStatePreference.SavedState[] newArray(int i10) {
        return new TwoStatePreference.SavedState[i10];
    }
}
