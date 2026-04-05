package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import com.facebook.ads.internal.util.image.thirdparty.JavaBlurProcess;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1442Oq {
    public static String[] A00 = {"GWFI2aEH9IwS9jlAmW7GhK1fzlhYxOYr", "8RR4W", "CWkLBEDZ3ckMIO6tTC6BOoN3cIPuPWQc", "H5jmeoVh4LyksNQ25zvZiIvxmGmhytkO", "GsHsqvgNRqvbvAJVDBzizJhfh8WArm0A", "4fKWUv5SQTvzMYF7waz6SD9Pf2i1NBM9", "aULd2mQrGZaata6Wu7225", "sYPqpaaM0HqFzSjGFkcoBixd8ZNH3dn1"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    /* JADX WARN: Code restructure failed: missing block: B:84:0x03d6, code lost:
    
        r38 = r38 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:46:0x01f9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(int[] r43, int r44, int r45, int r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1442Oq.A00(int[], int, int, int, int, int, int):void");
    }

    @Nullable
    public final Bitmap A02(Bitmap bitmap, float f10) throws InterruptedException {
        int w10 = bitmap.getWidth();
        int h10 = bitmap.getHeight();
        try {
            int[] iArr = new int[w10 * h10];
            bitmap.getPixels(iArr, 0, w10, 0, 0, w10, h10);
            int i10 = AbstractC1655Xa.A00;
            ArrayList arrayList = new ArrayList(i10);
            ArrayList<JavaBlurProcess.BlurTask> vertical = new ArrayList<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int h11 = h10;
                int cores = i11;
                arrayList.add(new XZ(iArr, w10, h11, (int) f10, i10, cores, 1));
                h10 = h11;
                int cores2 = i11;
                vertical.add(new XZ(iArr, w10, h10, (int) f10, i10, cores2, 2));
            }
            try {
                AbstractC1655Xa.A01.invokeAll(arrayList);
                try {
                    AbstractC1655Xa.A01.invokeAll(vertical);
                    try {
                        return Bitmap.createBitmap(iArr, w10, h10, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    String[] strArr = A00;
                    if (strArr[0].charAt(0) != strArr[4].charAt(0)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A00;
                    strArr2[0] = "GYxXddv1X7Qsu4uKyRk7X4E4VL4ApWq6";
                    strArr2[4] = "GxDga6TmLrnNDJa4WhYbU4AfHiRAiIT6";
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
