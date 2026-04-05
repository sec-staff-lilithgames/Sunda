package com.facebook.ads.redexgen.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1271Hy {
    public final int A00;
    public final long A01;

    public C1271Hy(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ C1271Hy(int i10, long j10, C1270Hx c1270Hx) {
        this(i10, j10);
    }

    public static C1271Hy A00(Parcel parcel) {
        return new C1271Hy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
