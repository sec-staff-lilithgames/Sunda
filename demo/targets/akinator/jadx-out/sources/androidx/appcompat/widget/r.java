package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Toolbar.SavedState[] newArray(int i10) {
        return new Toolbar.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public Toolbar.SavedState createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, null);
    }
}
