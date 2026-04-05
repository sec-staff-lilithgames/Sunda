package w7;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import e8.e;
import e8.n;
import java.io.IOException;
import java.util.Map;
import r7.c;
import r7.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f90449d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f90450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90451b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f90452c;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, d0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f90451b = str;
        } else {
            this.f90451b = str.concat("/");
        }
        this.f90452c = map;
        setDelegate(cVar);
        if (callback instanceof View) {
            this.f90450a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f90450a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (f90449d) {
            ((d0) this.f90452c.get(str)).setBitmap(bitmap);
        }
    }

    public Bitmap bitmapForId(String str) {
        String str2 = this.f90451b;
        d0 d0Var = (d0) this.f90452c.get(str);
        if (d0Var != null) {
            Bitmap bitmap = d0Var.getBitmap();
            if (bitmap != null) {
                return bitmap;
            }
            Context context = this.f90450a;
            if (context != null) {
                String fileName = d0Var.getFileName();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        try {
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                            if (bitmapDecodeByteArray != null) {
                                Bitmap bitmapResizeBitmapIfNeeded = n.resizeBitmapIfNeeded(bitmapDecodeByteArray, d0Var.getWidth(), d0Var.getHeight());
                                a(str, bitmapResizeBitmapIfNeeded);
                                return bitmapResizeBitmapIfNeeded;
                            }
                            e.warning("Decoded image `" + str + "` is null.");
                            return null;
                        } catch (IllegalArgumentException e10) {
                            e.warning("Unable to decode image `" + str + "`.", e10);
                            return null;
                        }
                    } catch (IllegalArgumentException e11) {
                        e.warning("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
                try {
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                    }
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + fileName), null, options);
                        if (bitmapDecodeStream != null) {
                            Bitmap bitmapResizeBitmapIfNeeded2 = n.resizeBitmapIfNeeded(bitmapDecodeStream, d0Var.getWidth(), d0Var.getHeight());
                            a(str, bitmapResizeBitmapIfNeeded2);
                            return bitmapResizeBitmapIfNeeded2;
                        }
                        e.warning("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e12) {
                        e.warning("Unable to decode image `" + str + "`.", e12);
                        return null;
                    }
                } catch (IOException e13) {
                    e.warning("Unable to open asset.", e13);
                    return null;
                }
            }
        }
        return null;
    }

    public d0 getImageAssetById(String str) {
        return (d0) this.f90452c.get(str);
    }

    public boolean hasSameContext(Context context) {
        Context context2 = this.f90450a;
        if (context == null) {
            return context2 == null;
        }
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == context2;
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Map map = this.f90452c;
        if (bitmap != null) {
            Bitmap bitmap2 = ((d0) map.get(str)).getBitmap();
            a(str, bitmap);
            return bitmap2;
        }
        d0 d0Var = (d0) map.get(str);
        Bitmap bitmap3 = d0Var.getBitmap();
        d0Var.setBitmap(null);
        return bitmap3;
    }

    public void setDelegate(c cVar) {
    }
}
