package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public MultiSelectListPreference.SavedState createFromParcel(Parcel parcel) {
        MultiSelectListPreference.SavedState savedState = new MultiSelectListPreference.SavedState(parcel);
        int i10 = parcel.readInt();
        savedState.f6893b = new HashSet();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Collections.addAll(savedState.f6893b, strArr);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public MultiSelectListPreference.SavedState[] newArray(int i10) {
        return new MultiSelectListPreference.SavedState[i10];
    }
}
