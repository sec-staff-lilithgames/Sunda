package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public ActionMenuPresenter.SavedState createFromParcel(Parcel parcel) {
        ActionMenuPresenter.SavedState savedState = new ActionMenuPresenter.SavedState();
        savedState.f4993b = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public ActionMenuPresenter.SavedState[] newArray(int i10) {
        return new ActionMenuPresenter.SavedState[i10];
    }
}
