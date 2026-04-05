package com.fyber.inneractive.sdk.util;

import android.graphics.BitmapFactory;
import android.net.Uri;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u {
    public static Float a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        int i10;
        try {
            inputStreamOpenInputStream = IAConfigManager.O.f23227v.f23318a.getApplicationContext().getContentResolver().openInputStream(uri);
        } catch (Exception e10) {
            IAlog.b("%sFailed to retrieve image aspect ratio. Reason: %s", IAlog.a(u.class), e10.getMessage());
        }
        if (inputStreamOpenInputStream == null) {
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            inputStreamOpenInputStream.close();
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            int i11 = options.outHeight;
            if (i11 <= 0 || (i10 = options.outWidth) <= 0) {
                inputStreamOpenInputStream.close();
                return null;
            }
            Float fValueOf = Float.valueOf(i10 / i11);
            inputStreamOpenInputStream.close();
            return fValueOf;
        } finally {
        }
    }

    public static String b(Uri uri) throws IOException {
        try {
            InputStream inputStreamOpenInputStream = IAConfigManager.O.f23227v.f23318a.getApplicationContext().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                if (inputStreamOpenInputStream == null) {
                    return null;
                }
                inputStreamOpenInputStream.close();
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                String str = options.outMimeType;
                inputStreamOpenInputStream.close();
                return str;
            } finally {
            }
        } catch (Exception e10) {
            IAlog.b("%sFailed to retrieve image mime type. Reason: %s", IAlog.a(u.class), e10.getMessage());
            return null;
        }
    }
}
