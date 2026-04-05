package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public RecyclerView.SavedState[] newArray(int i10) {
        return new RecyclerView.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public RecyclerView.SavedState createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel, null);
    }
}
