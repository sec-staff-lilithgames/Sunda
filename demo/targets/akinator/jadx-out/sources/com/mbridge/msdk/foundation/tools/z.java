package com.mbridge.msdk.foundation.tools;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class z {
    public static Bitmap a(Bitmap bitmap, int i10, boolean z10) {
        int i11;
        int i12 = i10;
        Bitmap bitmapCopy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i12 < 1) {
            return null;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int i16 = i12 + i12;
        int i17 = i16 + 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[Math.max(width, height)];
        int i18 = (i16 + 2) >> 1;
        int i19 = i18 * i18;
        int i20 = i19 * NotificationCompat.FLAG_LOCAL_ONLY;
        int[] iArr6 = new int[i20];
        int i21 = 0;
        for (int i22 = 0; i22 < i20; i22++) {
            iArr6[i22] = i22 / i19;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
        int i23 = i12 + 1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i24 < height) {
            int[] iArr8 = iArr6;
            int i27 = -i12;
            int i28 = i21;
            int i29 = i28;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            while (i27 <= i12) {
                int[] iArr9 = iArr4;
                Bitmap bitmap2 = bitmapCopy;
                int i37 = i21;
                int i38 = iArr[Math.min(i14, Math.max(i27, i37)) + i25];
                int[] iArr10 = iArr7[i27 + i12];
                iArr10[i37] = (i38 & 16711680) >> 16;
                iArr10[1] = (i38 & 65280) >> 8;
                iArr10[2] = i38 & 255;
                int iAbs = i23 - Math.abs(i27);
                int i39 = iArr10[i37];
                i29 = (i39 * iAbs) + i29;
                int i40 = iArr10[1];
                i28 = (i40 * iAbs) + i28;
                int i41 = iArr10[2];
                i36 = (iAbs * i41) + i36;
                if (i27 > 0) {
                    i33 += i39;
                    i34 += i40;
                    i35 += i41;
                } else {
                    i32 += i39;
                    i31 += i40;
                    i30 += i41;
                }
                i27++;
                iArr4 = iArr9;
                bitmapCopy = bitmap2;
                i21 = 0;
            }
            int[] iArr11 = iArr4;
            Bitmap bitmap3 = bitmapCopy;
            int i42 = i12;
            int i43 = 0;
            while (i43 < width) {
                iArr2[i25] = iArr8[i29];
                iArr3[i25] = iArr8[i28];
                iArr11[i25] = iArr8[i36];
                int i44 = i29 - i32;
                int i45 = i28 - i31;
                int i46 = i36 - i30;
                int[] iArr12 = iArr7[((i42 - i12) + i17) % i17];
                int i47 = i32 - iArr12[0];
                int i48 = i31 - iArr12[1];
                int i49 = i30 - iArr12[2];
                if (i24 == 0) {
                    i11 = i43;
                    iArr5[i11] = Math.min(i43 + i12 + 1, i14);
                } else {
                    i11 = i43;
                }
                int i50 = iArr[i26 + iArr5[i11]];
                int i51 = (i50 & 16711680) >> 16;
                iArr12[0] = i51;
                int i52 = (i50 & 65280) >> 8;
                iArr12[1] = i52;
                int i53 = i50 & 255;
                iArr12[2] = i53;
                int i54 = i33 + i51;
                int i55 = i34 + i52;
                int i56 = i35 + i53;
                i29 = i44 + i54;
                i28 = i45 + i55;
                i36 = i46 + i56;
                i42 = (i42 + 1) % i17;
                int[] iArr13 = iArr7[i42 % i17];
                int i57 = iArr13[0];
                i32 = i47 + i57;
                int i58 = iArr13[1];
                i31 = i48 + i58;
                int i59 = iArr13[2];
                i30 = i49 + i59;
                i33 = i54 - i57;
                i34 = i55 - i58;
                i35 = i56 - i59;
                i25++;
                i43 = i11 + 1;
            }
            i26 += width;
            i24++;
            iArr6 = iArr8;
            iArr4 = iArr11;
            bitmapCopy = bitmap3;
            i21 = 0;
        }
        int[] iArr14 = iArr6;
        int[] iArr15 = iArr4;
        Bitmap bitmap4 = bitmapCopy;
        int i60 = 0;
        while (i60 < width) {
            int i61 = -i12;
            int i62 = i60;
            int i63 = i61 * width;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            while (i61 <= i12) {
                int iMax = Math.max(0, i63) + i62;
                int[] iArr16 = iArr7[i61 + i10];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr15[iMax];
                int iAbs2 = i23 - Math.abs(i61);
                i65 = (iArr2[iMax] * iAbs2) + i65;
                i64 = (iArr3[iMax] * iAbs2) + i64;
                i72 = (iArr15[iMax] * iAbs2) + i72;
                if (i61 > 0) {
                    i69 += iArr16[0];
                    i70 += iArr16[1];
                    i71 += iArr16[2];
                } else {
                    i68 += iArr16[0];
                    i67 += iArr16[1];
                    i66 += iArr16[2];
                }
                if (i61 < i15) {
                    i63 += width;
                }
                i61++;
                i12 = i10;
            }
            int i73 = i10;
            int i74 = i72;
            int i75 = i62;
            for (int i76 = 0; i76 < height; i76++) {
                iArr[i75] = (iArr[i75] & (-16777216)) | (iArr14[i65] << 16) | (iArr14[i64] << 8) | iArr14[i74];
                int i77 = i65 - i68;
                int i78 = i64 - i67;
                int i79 = i74 - i66;
                int[] iArr17 = iArr7[((i73 - i10) + i17) % i17];
                int i80 = i68 - iArr17[0];
                int i81 = i67 - iArr17[1];
                int i82 = i66 - iArr17[2];
                int i83 = i73;
                if (i62 == 0) {
                    iArr5[i76] = Math.min(i76 + i23, i15) * width;
                }
                int i84 = i62 + iArr5[i76];
                int i85 = iArr2[i84];
                iArr17[0] = i85;
                int i86 = iArr3[i84];
                iArr17[1] = i86;
                int i87 = iArr15[i84];
                iArr17[2] = i87;
                int i88 = i69 + i85;
                int i89 = i70 + i86;
                int i90 = i71 + i87;
                i65 = i77 + i88;
                i64 = i78 + i89;
                i74 = i79 + i90;
                i73 = (i83 + 1) % i17;
                int[] iArr18 = iArr7[i73];
                int i91 = iArr18[0];
                i68 = i80 + i91;
                int i92 = iArr18[1];
                i67 = i81 + i92;
                int i93 = iArr18[2];
                i66 = i82 + i93;
                i69 = i88 - i91;
                i70 = i89 - i92;
                i71 = i90 - i93;
                i75 += width;
            }
            i60 = i62 + 1;
            i12 = i10;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        if (i10 <= 0) {
            i10 = 10;
        }
        return a(Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / i10, bitmap.getHeight() / i10, false), 8, true);
    }
}
