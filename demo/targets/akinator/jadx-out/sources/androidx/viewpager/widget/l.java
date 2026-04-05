package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public ViewPager.SavedState[] newArray(int i10) {
        return new ViewPager.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public ViewPager.SavedState createFromParcel(Parcel parcel) {
        return new ViewPager.SavedState(parcel, null);
    }
}
