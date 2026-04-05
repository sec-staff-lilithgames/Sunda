package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public SearchView.SavedState[] newArray(int i10) {
        return new SearchView.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public SearchView.SavedState createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, null);
    }
}
