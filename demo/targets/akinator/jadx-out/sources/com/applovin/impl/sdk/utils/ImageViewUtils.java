package com.applovin.impl.sdk.utils;

import af.n;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.browser.customtabs.g;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ImageViewUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, k kVar, ImageView imageView, Uri uri) {
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                AppLovinSdkUtils.runOnUiThread(new g(kVar, 22, BitmapFactory.decodeStream(inputStreamOpenStream), imageView));
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("ImageViewUtils", "Failed to fetch image: " + uri, th2);
            }
            kVar.O().a("ImageViewUtils", th2);
            kVar.E().a("ImageViewUtils", "setImageUri", th2);
        }
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        k kVar = k.D0;
        if (kVar == null) {
            o.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            kVar.r0().c().execute(new a(uri, imageView));
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new a(imageView, uri, 2));
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, k kVar) {
        if (imageView == null || uri == null) {
            return;
        }
        String string = uri.toString();
        if (URLUtil.isFileUrl(string) || URLUtil.isContentUrl(string)) {
            AppLovinSdkUtils.runOnUiThread(new a(imageView, uri, 0));
            return;
        }
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("ImageViewUtils", "Fetching image: " + uri);
        }
        kVar.r0().c().execute(new al.a(string, kVar, imageView, uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar, Bitmap bitmap, ImageView imageView) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(k.o().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point pointB = o0.b(imageView.getContext());
            height = Math.min(pointB.x, pointB.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                } else {
                    i10 = i13;
                }
            }
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        k.D0.O();
        if (o.a()) {
            k.D0.O().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        AppLovinSdkUtils.runOnUiThread(new n(22, imageView, BitmapFactory.decodeFile(uri.getPath(), options)));
    }
}
