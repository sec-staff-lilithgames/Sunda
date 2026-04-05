package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7026b = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7027c = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7029f = parcel.readInt() == 1;
        int i10 = parcel.readInt();
        if (i10 > 0) {
            int[] iArr = new int[i10];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7028e = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int i10) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i10];
    }
}
