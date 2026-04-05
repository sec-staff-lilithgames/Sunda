package com.facebook.ads.internal.androidx.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState;
import com.facebook.ads.redexgen.core.QO;
import com.facebook.ads.redexgen.core.QY;

/* loaded from: assets/audience_network.dex */
public class RecyclerView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<RecyclerView$SavedState> CREATOR = new QY();
    public Parcelable A00;

    public RecyclerView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? QO.class.getClassLoader() : classLoader);
    }

    public RecyclerView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final void A03(RecyclerView$SavedState recyclerView$SavedState) {
        this.A00 = recyclerView$SavedState.A00;
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.A00, 0);
    }
}
