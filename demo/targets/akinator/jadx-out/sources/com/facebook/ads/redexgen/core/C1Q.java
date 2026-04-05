package com.facebook.ads.redexgen.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.1Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1Q extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC1081Am<Bundle> A00(IBinder iBinder) {
        C08571h c08571hA01 = AbstractC1081Am.A01();
        int i10 = 0;
        int i11 = 1;
        while (i11 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i10);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i11 = parcelObtain2.readInt();
                        if (i11 == 1) {
                            c08571hA01.A04((Bundle) C3M.A01(parcelObtain2.readBundle()));
                            i10++;
                        }
                    }
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
        return c08571hA01.A05();
    }

    static {
        A00 = AbstractC09264a.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
