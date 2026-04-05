package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;

/* loaded from: assets/audience_network.dex */
public class PF implements Parcelable.ClassLoaderCreator<ViewPager$SavedState> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ViewPager$SavedState createFromParcel(Parcel parcel) {
        return new ViewPager$SavedState(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final ViewPager$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager$SavedState(parcel, classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final ViewPager$SavedState[] newArray(int i10) {
        return new ViewPager$SavedState[i10];
    }
}
