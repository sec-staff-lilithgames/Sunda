package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public ViewPager2.SavedState[] newArray(int i10) {
        return new ViewPager2.SavedState[i10];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public ViewPager2.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
        savedState.f7401b = parcel.readInt();
        savedState.f7402c = parcel.readInt();
        savedState.f7403e = parcel.readParcelable(classLoader);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public ViewPager2.SavedState createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
