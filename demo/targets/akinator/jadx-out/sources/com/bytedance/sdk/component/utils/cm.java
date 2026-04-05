package com.bytedance.sdk.component.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static Bitmap jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] jpo(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap jpo(Bitmap bitmap, int i10, int i11) {
        if (bitmap == null) {
            return null;
        }
        if (i10 > 0 && i11 > 0) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (i10 < width && i11 < height) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(i10 / width, i11 / height);
                    return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return null;
            }
        }
        return bitmap;
    }
}
