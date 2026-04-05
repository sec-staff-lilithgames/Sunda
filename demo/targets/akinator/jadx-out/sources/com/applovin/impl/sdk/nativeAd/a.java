package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.e2;
import com.applovin.impl.g5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f15555g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0041a f15556h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15557i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0041a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, InterfaceC0041a interfaceC0041a) {
        super("TaskCacheNativeAd", kVar);
        this.f15557i = UUID.randomUUID().toString();
        this.f15555g = appLovinNativeAdImpl;
        this.f15556h = interfaceC0041a;
    }

    private float a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i10;
        int i11;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } finally {
            }
        } catch (IOException e10) {
            if (o.a()) {
                this.f14005c.a(this.f14004b, "Failed to calculate aspect ratio", e10);
            }
        }
        if (i10 <= 0 || i11 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f10 = i10 / i11;
        fileInputStream.close();
        return f10;
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f14003a.H().a(a(), uri.toString(), this.f15555g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f15557i, e2.a(this.f15555g));
        if (TextUtils.isEmpty(strA)) {
            if (o.a()) {
                this.f14005c.b(this.f14004b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f14003a.H().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (o.a()) {
                this.f14005c.b(this.f14004b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (o.a()) {
            this.f14005c.b(this.f14004b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Begin caching ad #" + this.f15555g.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        Uri uriB = b(this.f15555g.getIconUri());
        if (uriB != null) {
            this.f15555g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f15555g.getMainImageUri());
        if (uriB2 != null) {
            this.f15555g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f15555g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f15555g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f15555g.setPrivacyIconUri(uriB3);
        }
        if (o.a()) {
            this.f14005c.a(this.f14004b, "Finished caching ad #" + this.f15555g.getAdIdNumber());
        }
        this.f15556h.a(this.f15555g);
    }
}
