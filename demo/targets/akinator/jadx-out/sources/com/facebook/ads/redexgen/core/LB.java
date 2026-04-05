package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class LB {
    public static byte[] A00;
    public static String[] A01 = {"", "5RMLmaPj2fddIFPW54nmiFQPDQKlIy2x", "0506SZgMJJ7sv8mHDOEz9KlkL25eIrXm", "3YZMJbChCuRHZ", "0tP", "k2qiQoSuFgoxV", "", "m4QFNGv2UqCrxsi4qbKPCdwxAuw6y7wM"};

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "AJnFEtF8h38YXxkoJFDHCzPhEs51Q6lq";
            strArr[1] = "PqTCDiOjjtdJiv33jQVs3cEvP8T1eChE";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 20);
            i13++;
        }
    }

    public static void A06() {
        A00 = new byte[]{-42, -39, -36, -43, -86, -97, -97};
        String[] strArr = A01;
        if (strArr[5].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "";
        strArr2[0] = "";
    }

    static {
        A06();
    }

    public static int A00(BitmapFactory.Options options, int halfWidth, int i10) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i10 || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i10 && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static Bitmap A01(InputStream inputStream, int i10, int i11) throws IOException {
        LC lc2 = new LC(inputStream);
        lc2.mark(Segment.SIZE);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(lc2, null, options);
        lc2.reset();
        if (!lc2.A00()) {
            options.inSampleSize = A00(options, i10, i11);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeStream(lc2, null, options);
        }
        return BitmapFactory.decodeStream(lc2);
    }

    public static Bitmap A02(String str, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap A03(String str, int i10, int i11, boolean z10) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            if (i10 > 0 && i11 > 0) {
                if (z10) {
                    Bitmap bitmapA01 = A01(fileInputStream, i10, i11);
                    A07(fileInputStream);
                    return bitmapA01;
                }
                Bitmap bitmapA02 = A02(str, i10, i11);
                A07(fileInputStream);
                return bitmapA02;
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            A07(null);
            throw th2;
        }
    }

    public static String A05(File file) {
        if (file != null) {
            return A04(0, 7, 92) + file.getPath();
        }
        return null;
    }

    public static void A07(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
