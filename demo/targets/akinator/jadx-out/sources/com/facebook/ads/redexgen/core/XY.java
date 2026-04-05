package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* loaded from: assets/audience_network.dex */
public abstract class XY {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(XX xx) {
        byte[] bArrDecode = Base64.decode(xx.A01(AbstractC1640Wl.A02), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(XX xx) {
        byte[] bArrDecode = Base64.decode(xx.A01(AbstractC1640Wl.A02), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C1937dL c1937dL, XX xx) {
        return new BitmapDrawable(c1937dL.getResources(), A01(xx));
    }
}
