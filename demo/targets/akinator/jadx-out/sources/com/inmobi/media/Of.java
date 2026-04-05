package com.inmobi.media;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import io.ktor.http.ContentDisposition;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Of {

    /* renamed from: a, reason: collision with root package name */
    public Y3 f32116a;

    /* renamed from: b, reason: collision with root package name */
    public final Nf f32117b;

    public Of(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.f32117b = new Nf();
        C2925od.a(new io.bidmachine.media3.exoplayer.b1(webAssetCacheConfig, 20, this, context));
    }

    public final InputStream a(String url, F5 f52) {
        X3 x3B;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        Y3 y32 = this.f32116a;
        if (y32 == null) {
            if (f52 != null) {
                ((G5) f52).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: ".concat(url));
            }
            return null;
        }
        try {
            x3B = y32.b(String.valueOf(url.hashCode()));
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + url);
            }
        }
        if (x3B != null && kotlin.jvm.internal.e0.areEqual(url, AbstractC2775ff.a(new InputStreamReader(x3B.f32482a[0], AbstractC2775ff.f32848b)))) {
            return x3B.f32482a[1];
        }
        if (f52 != null) {
            ((G5) f52).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for ".concat(url));
        }
        return null;
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, Of this$0, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(webAssetCacheConfig, "$webAssetCacheConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        try {
            long j10 = R3.f32183a.j();
            if (j10 < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                this$0.getClass();
                a(context, j10);
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(context, "web_asset_file_key"), "cache_enabled", false, false, 4, (Object) null);
                return;
            }
            this$0.a(context, webAssetCacheConfig, j10);
            ConcurrentHashMap concurrentHashMap2 = I6.f31865b;
            I6.a(H6.a(context, "web_asset_file_key"), "cache_enabled", true, false, 4, (Object) null);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        kotlin.jvm.internal.e0.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE * 1024;
        Nf nf2 = this.f32117b;
        Pattern pattern = Y3.f32535p;
        if (jMin > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            Y3 y32 = new Y3(file, jMin, nf2);
            if (y32.f32538b.exists()) {
                try {
                    y32.c();
                    y32.b();
                    y32.f32546j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(y32.f32538b, true), AbstractC2775ff.f32847a));
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    y32.close();
                    AbstractC2775ff.a(y32.f32537a);
                }
            } else {
                file.mkdirs();
                y32 = new Y3(file, jMin, nf2);
                y32.d();
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(y32, "open(...)");
            this.f32116a = y32;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j10) {
        tu.v vVar = tu.e0.to(ContentDisposition.Parameters.Size, Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(context, "web_asset_file_key");
        kotlin.jvm.internal.e0.checkNotNullParameter("cache_enabled", C3191e4.h.W);
        Map mapMutableMapOf = uu.p1.mutableMapOf(vVar, tu.e0.to("state", Boolean.valueOf(i6A.f31866a.getBoolean("cache_enabled", false))));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("LowAvailableSpaceForCache", mapMutableMapOf, EnumC2993se.f33373a);
    }
}
