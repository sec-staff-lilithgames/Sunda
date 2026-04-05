package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Rf {

    /* renamed from: a, reason: collision with root package name */
    public static final Rf f32220a = new Rf();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f32221b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final AdConfig.WebAssetCacheConfig f32222c;

    /* renamed from: d, reason: collision with root package name */
    public static final Of f32223d;

    static {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        AdConfig.WebAssetCacheConfig webAssetCache = ((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getWebAssetCache();
        f32222c = webAssetCache;
        Context contextD = C2925od.d();
        f32223d = contextD != null ? new Of(contextD, webAssetCache) : null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:30|(4:32|136|33|(1:35)(8:36|51|(1:(1:54))(2:55|(3:(1:58)|59|60)(2:(1:62)|63))|64|127|(3:128|71|(7:73|66|97|(1:99)(1:101)|100|130|103)(9:74|75|125|76|(2:134|78)(1:83)|84|85|86|87))(6:66|97|(0)(0)|100|130|103)|116|117))(1:40)|41|42|124|43|(1:45)(1:50)|46|51|(0)(0)|64|127|(0)(5:67|68|128|71|(0)(0))|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023a, code lost:
    
        ((com.inmobi.media.G5) r24).b("WebResourceHandler", com.inmobi.media.Qf.a(r0, new java.lang.StringBuilder("Unhandled exception occurred: ")));
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        ((com.inmobi.media.G5) r24).b("WebResourceHandler", "Timeout exception occurred for url: ".concat(r23));
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r4 = r16;
        r6 = r20;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
    
        r4 = r16;
        r6 = r20;
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0215 A[Catch: Exception -> 0x01ec, TimeoutException -> 0x01f0, TRY_LEAVE, TryCatch #16 {TimeoutException -> 0x01f0, Exception -> 0x01ec, blocks: (B:97:0x0206, B:99:0x020a, B:101:0x0215, B:86:0x01dd), top: B:127:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126 A[Catch: Exception -> 0x00ef, TimeoutException -> 0x00f8, TryCatch #18 {TimeoutException -> 0x00f8, Exception -> 0x00ef, blocks: (B:43:0x00d9, B:45:0x00e7, B:51:0x0107, B:54:0x011b, B:64:0x016a, B:67:0x0198, B:55:0x0126, B:58:0x012e, B:59:0x0138, B:62:0x0151, B:63:0x015b, B:50:0x0100), top: B:124:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a6 A[Catch: Exception -> 0x01fb, TimeoutException -> 0x0201, TRY_LEAVE, TryCatch #15 {TimeoutException -> 0x0201, Exception -> 0x01fb, blocks: (B:71:0x01a2, B:74:0x01a6), top: B:128:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020a A[Catch: Exception -> 0x01ec, TimeoutException -> 0x01f0, TryCatch #16 {TimeoutException -> 0x01f0, Exception -> 0x01ec, blocks: (B:97:0x0206, B:99:0x020a, B:101:0x0215, B:86:0x01dd), top: B:127:0x0190 }] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse a(java.lang.String r23, com.inmobi.media.F5 r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Rf.a(java.lang.String, com.inmobi.media.F5):android.webkit.WebResourceResponse");
    }

    public static final Sc a(Rf this_run, String url, F5 f52) throws Throwable {
        Y3 y32;
        Sc response;
        S9 s92;
        kotlin.jvm.internal.e0.checkNotNullParameter(this_run, "$this_run");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "$url");
        this_run.getClass();
        if (f52 != null) {
            ((G5) f52).c("WebResourceHandler", AbstractC2811i0.a("downloadResourceFile(): ", url));
        }
        Lc method = Lc.f32009a;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(method, "method");
        Kc kc2 = new Kc(url, method);
        AdConfig.WebAssetCacheConfig webAssetCacheConfig = f32222c;
        kc2.f31963h = Integer.valueOf(webAssetCacheConfig.getTimeout());
        kc2.f31964i = Integer.valueOf(webAssetCacheConfig.getTimeout());
        Nc retryPolicy = new Nc(webAssetCacheConfig.getMaxRetries(), 500);
        kotlin.jvm.internal.e0.checkNotNullParameter(retryPolicy, "retryPolicy");
        kc2.f31962g = retryPolicy;
        Oc request = new Oc(kc2);
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        do {
            y32 = null;
            response = R9.a(request, (kv.p) null);
            s92 = response.f32272a;
        } while ((s92 != null ? s92.f32266a : null) == EnumC3017u4.f33430m);
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        byte[] bArr = response.f32274c;
        Integer num = response.f32275d;
        if (num != null && num.intValue() == 200 && bArr != null && bArr.length != 0) {
            if (f52 != null) {
                ((G5) f52).c("WebResourceHandler", "onSuccessfulResponse: ".concat(url));
            }
            Of of2 = f32223d;
            if (of2 != null) {
                String data = T9.a(response.f32274c);
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
                if (of2.f32116a != null) {
                    try {
                        String strValueOf = String.valueOf(url.hashCode());
                        Y3 y33 = of2.f32116a;
                        if (y33 == null) {
                            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("diskLruCache");
                        } else {
                            y32 = y33;
                        }
                        V3 v3A = y32.a(strValueOf);
                        if (v3A != null) {
                            v3A.a(url, 0);
                            v3A.a(data, 1);
                            if (v3A.f32388c) {
                                Y3.a(v3A.f32389d, v3A, false);
                                v3A.f32389d.d(v3A.f32386a.f32431a);
                                return response;
                            }
                            Y3.a(v3A.f32389d, v3A, true);
                            return response;
                        }
                        if (f52 != null) {
                            ((G5) f52).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for ".concat(url));
                            return response;
                        }
                    } catch (Exception e10) {
                        if (f52 != null) {
                            ((G5) f52).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + url);
                        }
                    }
                } else if (f52 != null) {
                    ((G5) f52).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: ".concat(url));
                }
            }
        }
        return response;
    }
}
