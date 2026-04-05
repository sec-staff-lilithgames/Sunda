package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1520Rq {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C1520Rq(SQ sq2) {
        this.A00 = sq2.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), sq2), 0);
    }

    public final C1519Rp A02() {
        SharedPreferences sharedPreferences = this.A00;
        String strA00 = A00(0, 13, 55);
        if (sharedPreferences.contains(strA00)) {
            return new C1519Rp(this.A00.getString(strA00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), EnumC1518Ro.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C1519Rp.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C1519Rp c1519Rp) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, 55), c1519Rp.A03());
        editorEdit.putBoolean(A00(54, 15, 96), c1519Rp.A04());
        editorEdit.putLong(A00(26, 7, 65), c1519Rp.A01());
        editorEdit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(13, 13, 78), str);
        editorEdit.apply();
    }
}
