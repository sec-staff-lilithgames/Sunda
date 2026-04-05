package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UY implements InterfaceC1585Uf {
    public static byte[] A01;
    public final C1937dL A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, 64, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, 13, 0, 0, 51, 30, 9, 10, 9, 30, 30, 9, 30, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, 22, 39, 40, 36, 44};
    }

    public UY(C1937dL c1937dL) {
        this.A00 = c1937dL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z10, String str2, String str3, String str4, long j10) {
        this.A00.A0F().AB9(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().ABE(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().ABB(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().ABA(str);
            return false;
        }
        Uri uri = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + str2);
        ContentValues values = new ContentValues();
        values.put(A00(17, 18, 47), (Integer) 1);
        values.put(A00(61, 5, 33), Boolean.valueOf(z10));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), Long.valueOf(j10));
        try {
            contentResolver.insert(uri, values);
            this.A00.A0F().ABG(str);
            return true;
        } catch (UnsupportedOperationException unused) {
            this.A00.A0F().ABD(str);
            return false;
        } catch (Exception unused2) {
            this.A00.A0F().ABC(str);
            return false;
        }
    }

    public final void A04(boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A00.A0F().ABF();
        XU.A06.execute(new C1593Un(this, z10, str, str2, str3, j10, z11));
    }
}
