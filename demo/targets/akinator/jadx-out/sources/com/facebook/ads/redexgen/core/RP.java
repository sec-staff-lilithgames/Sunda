package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class RP extends AsyncTask<RR, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final RQ A00;
    public final C1937dL A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(RR... rrArr) throws Throwable {
        if (!AbstractC1616Vl.A02(this) && rrArr != null) {
            try {
                if (rrArr.length >= 1) {
                    String str = rrArr[0].A01;
                    String str2 = rrArr[0].A00;
                    Bitmap bitmapA0O = null;
                    try {
                        bitmapA0O = new SF(this.A01).A0O(str, -1, -1);
                    } catch (Throwable th2) {
                        this.A01.A08().AAy(A01(0, 7, 4), AbstractC1550Sv.A1V, new C1551Sw(th2));
                    }
                    if (bitmapA0O != null) {
                        return C1480Qc.A05(this.A01, bitmapA0O, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th3) {
                AbstractC1616Vl.A00(th3, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] ^ i12) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public RP(C1937dL c1937dL, RQ rq2, boolean z10) {
        this.A01 = c1937dL;
        this.A00 = rq2;
        this.A02 = z10;
    }

    public /* synthetic */ RP(C1937dL c1937dL, RQ rq2, boolean z10, C2073fZ c2073fZ) {
        this(c1937dL, rq2, z10);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            this.A00.ADU(drawable);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(RR[] rrArr) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return null;
        }
        try {
            return A00(rrArr);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
