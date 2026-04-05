package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f7030b = parcel.readInt();
        savedState.f7031c = parcel.readInt();
        int i10 = parcel.readInt();
        savedState.f7032e = i10;
        if (i10 > 0) {
            int[] iArr = new int[i10];
            savedState.f7033f = iArr;
            parcel.readIntArray(iArr);
        }
        int i11 = parcel.readInt();
        savedState.f7034g = i11;
        if (i11 > 0) {
            int[] iArr2 = new int[i11];
            savedState.f7035h = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f7037j = parcel.readInt() == 1;
        savedState.f7038k = parcel.readInt() == 1;
        savedState.f7039l = parcel.readInt() == 1;
        savedState.f7036i = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.SavedState[] newArray(int i10) {
        return new StaggeredGridLayoutManager.SavedState[i10];
    }
}
