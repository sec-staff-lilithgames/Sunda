package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1912cv {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{81, 124, 102, 101, 121, 116, 108, 88, 112, 97, 103, 124, 118, 102, 53, 124, 102, 53, 123, 96, 121, 121, 59, 25, 46, 56, 36, 62, 57, 40, 46, 56, 107, 34, 56, 107, 37, 62, 39, 39, 101, 37, 18, 31, 26, 23, 18, 7, 26, 28, 29, 83, 21, 18, 26, 31, 22, 23, 93, 107, 105, 106};
    }

    static {
        A03();
        A00 = true;
    }

    public static BitmapDrawable A00(C1937dL c1937dL, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (overlayBm != null && (!A00 || A05(c1937dL, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c1937dL.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c1937dL, A02(0, 23, 41));
                    }
                } else {
                    A04(c1937dL, A02(23, 18, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th2) {
            c1937dL.A08().AAy(A02(59, 3, 58), AbstractC1550Sv.A1u, new C1551Sw(th2));
            return null;
        }
    }

    public static C1913cw A01(C1937dL c1937dL, String str) {
        BitmapDrawable bitmapDrawableA00;
        try {
            if (TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(c1937dL, str)) == null) {
                return null;
            }
            C1913cw c1913cw = new C1913cw(c1937dL);
            c1913cw.setBackground(bitmapDrawableA00);
            c1913cw.setClickable(false);
            c1913cw.setFocusable(false);
            return c1913cw;
        } catch (Throwable th2) {
            c1937dL.A08().AAy(A02(59, 3, 58), AbstractC1550Sv.A1u, new C1551Sw(th2));
            return null;
        }
    }

    public static void A04(C1937dL c1937dL, String str) {
        c1937dL.A08().AAy(A02(59, 3, 58), AbstractC1550Sv.A1u, new C1551Sw(str));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.facebook.ads.redexgen.core.C1937dL r4, android.graphics.Bitmap r5) {
        /*
            r3 = 0
        L1:
            int r0 = r5.getWidth()
            if (r3 >= r0) goto L36
            r2 = 0
        L8:
            int r0 = r5.getHeight()
            if (r2 >= r0) goto L33
            int r0 = r5.getPixel(r3, r2)
            int r0 = android.graphics.Color.alpha(r0)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            r2 = 41
            r1 = 18
            r0 = 79
            java.lang.String r0 = A02(r2, r1, r0)
            A04(r4, r0)
            r0 = 0
            return r0
        L30:
            int r2 = r2 + 1
            goto L8
        L33:
            int r3 = r3 + 1
            goto L1
        L36:
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC1912cv.A02
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC1912cv.A02
            java.lang.String r1 = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7"
            r0 = 4
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC1912cv.A05(com.facebook.ads.redexgen.X.dL, android.graphics.Bitmap):boolean");
    }
}
