package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.AbstractC2989sa;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2989sa {
    public static final void a(AdConfig.OmidConfig omidConfig, int i10, X9 mRequest, int i11) throws InterruptedException {
        byte[] bArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(omidConfig, "$omidConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "$mNetworkRequest");
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        if ((System.currentTimeMillis() / 1000) - new C2720cb(contextD, "omid_js_store").b() > omidConfig.getExpiry()) {
            int i12 = 0;
            while (i12 <= i10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                kotlin.jvm.internal.e0.checkNotNullParameter(mRequest, "mRequest");
                Z9 z9B = mRequest.b();
                Context contextD2 = C2925od.d();
                if (z9B.b()) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                    i12++;
                    if (i12 > i10) {
                        return;
                    } else {
                        try {
                            Thread.sleep(i11 * 1000);
                        } catch (InterruptedException unused) {
                        }
                    }
                } else if (contextD2 != null) {
                    C2720cb c2720cb = new C2720cb(contextD2, "omid_js_store");
                    Map map = z9B.f32604f;
                    String strA = null;
                    List list = map != null ? (List) map.get("Content-Encoding") : null;
                    if (kotlin.jvm.internal.e0.areEqual(list != null ? (String) list.get(0) : null, "gzip")) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                        boolean z10 = C2736da.f32781a;
                        byte[] bArr2 = z9B.f32600b;
                        if (bArr2 == null || bArr2.length == 0) {
                            bArr = new byte[0];
                        } else {
                            kotlin.jvm.internal.e0.checkNotNull(bArr2);
                            bArr = new byte[bArr2.length];
                            byte[] bArr3 = z9B.f32600b;
                            kotlin.jvm.internal.e0.checkNotNull(bArr3);
                            System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        }
                        byte[] bArrA = C2736da.a(bArr);
                        if (bArrA != null) {
                            try {
                                String str = new String(bArrA, sv.g.f86134b);
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                                strA = str;
                            } catch (UnsupportedEncodingException unused2) {
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                            }
                        }
                    } else {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
                        strA = z9B.a();
                    }
                    if (strA != null) {
                        c2720cb.b("omid_js_string", strA);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void a(final AdConfig.OmidConfig omidConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(omidConfig, "omidConfig");
        String url = omidConfig.getUrl();
        final int maxRetries = omidConfig.getMaxRetries();
        final int retryInterval = omidConfig.getRetryInterval();
        if (url == null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("sa", "TAG");
            return;
        }
        final X9 x92 = new X9(url, null);
        x92.f32515x = false;
        x92.f32511t = false;
        x92.f32512u = false;
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).submit(new Runnable() { // from class: zk.y0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                AbstractC2989sa.a(omidConfig, maxRetries, x92, retryInterval);
            }
        });
    }
}
