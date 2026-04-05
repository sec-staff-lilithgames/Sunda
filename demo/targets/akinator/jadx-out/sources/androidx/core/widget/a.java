package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public NestedScrollView.SavedState createFromParcel(Parcel parcel) {
        NestedScrollView.SavedState savedState = new NestedScrollView.SavedState(parcel);
        savedState.f5784b = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public NestedScrollView.SavedState[] newArray(int i10) {
        return new NestedScrollView.SavedState[i10];
    }
}
