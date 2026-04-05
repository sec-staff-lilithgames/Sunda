package com.facebook.ads.internal.androidx.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.redexgen.core.PF;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static byte[] A03;
    public static final Parcelable.Creator<ViewPager$SavedState> CREATOR;
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{34, 114, 109, 113, 107, 118, 107, 109, 108, Utf8.REPLACEMENT_BYTE, 69, 113, 98, 100, 110, 102, 109, 119, 83, 98, 100, 102, 113, 45, 80, 98, 117, 102, 103, 80, 119, 98, 119, 102, 120, 6};
    }

    static {
        A02();
        CREATOR = new PF();
    }

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return A01(10, 25, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + Integer.toHexString(System.identityHashCode(this)) + A01(0, 10, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + this.A00 + A01(35, 1, 5);
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i10);
    }
}
