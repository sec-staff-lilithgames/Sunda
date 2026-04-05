package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public SeekBarPreference.SavedState createFromParcel(Parcel parcel) {
        SeekBarPreference.SavedState savedState = new SeekBarPreference.SavedState(parcel);
        savedState.f6920b = parcel.readInt();
        savedState.f6921c = parcel.readInt();
        savedState.f6922e = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public SeekBarPreference.SavedState[] newArray(int i10) {
        return new SeekBarPreference.SavedState[i10];
    }
}
