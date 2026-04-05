package com.facebook.ads.redexgen.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;

/* loaded from: assets/audience_network.dex */
public class Q4 implements Parcelable.Creator<LinearLayoutManager$SavedState> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager$SavedState(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final LinearLayoutManager$SavedState[] newArray(int i10) {
        return new LinearLayoutManager$SavedState[i10];
    }
}
