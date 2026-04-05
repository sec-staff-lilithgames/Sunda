package com.inmobi.media;

import android.os.SystemClock;
import com.amazon.device.ads.DTBMetricReport;
import io.ktor.http.ContentDisposition;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.s1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2980s1 implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f33343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33344b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33346d;

    public C2980s1(CountDownLatch countDownLatch, String remoteUrl, long j10, String assetAdType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(countDownLatch, "countDownLatch");
        kotlin.jvm.internal.e0.checkNotNullParameter(remoteUrl, "remoteUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(assetAdType, "assetAdType");
        this.f33343a = countDownLatch;
        this.f33344b = remoteUrl;
        this.f33345c = j10;
        this.f33346d = assetAdType;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] args) {
        kotlin.jvm.internal.e0.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.e0.checkNotNullParameter(args, "args");
        C3031v1 c3031v1 = C3031v1.f33468a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        Objects.toString(method);
        if (method == null) {
            return null;
        }
        if (!sv.k0.equals("onSuccess", method.getName(), true)) {
            if (!sv.k0.equals("onError", method.getName(), true)) {
                return null;
            }
            C3031v1.f33468a.c(this.f33344b);
            this.f33343a.countDown();
            return null;
        }
        HashMap mapHashMapOf = uu.p1.hashMapOf(tu.e0.to(DTBMetricReport.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - this.f33345c)), tu.e0.to(ContentDisposition.Parameters.Size, 0), tu.e0.to("assetType", "image"), tu.e0.to("networkType", R3.x()), tu.e0.to("adType", this.f33346d));
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("AssetDownloaded", mapHashMapOf, EnumC2993se.f33373a);
        C3031v1.f33468a.d(this.f33344b);
        this.f33343a.countDown();
        return null;
    }
}
