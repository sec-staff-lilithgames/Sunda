package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1713Zg {
    public static String[] A07 = {"MaUhfef1XHChQSOAsPU", "01oMUC4JT554rhL", "9TYVZPZrh7WqyaB", "ShOi1FYvFM9bF84GqYiu0GZZ4HOF35Af", ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "YvdeaQsxQHJ3CZVDgFIjqRdATcpqYXuO", "b384kAccrLIUxrnk6NdGu", "f4PnsWwvvRSNWXAtteJ0H"};
    public final String A00 = C1713Zg.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<LH> A03;
    public final WeakReference<InterfaceC1714Zh> A04;
    public final WeakReference<C2010eX> A05;
    public final WeakReference<C1333Ki> A06;

    public C1713Zg(C1333Ki c1333Ki, InterfaceC1714Zh interfaceC1714Zh, C2010eX c2010eX, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1937dL c1937dL) {
        this.A06 = new WeakReference<>(c1333Ki);
        this.A04 = new WeakReference<>(interfaceC1714Zh);
        this.A05 = new WeakReference<>(c2010eX);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1937dL.A0F());
    }

    private LH A00() {
        LH funnel = this.A03.get();
        if (funnel == null) {
            return new C2273j3();
        }
        return funnel;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return AbstractC1646Wr.A01(T5.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AK6(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AK7();
        if (this.A06.get() != null && this.A01.get() != null && this.A02.get() != null && this.A02.get().get()) {
            this.A01.get().set(true);
            A00().AK8();
            if (this.A06.get().isShown()) {
                A00().AK9();
                new Handler(Looper.getMainLooper()).post(new C1339Ko(this.A05));
            }
            InterfaceC1714Zh interfaceC1714Zh = this.A04.get();
            if (interfaceC1714Zh != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC1712Zf(this, interfaceC1714Zh));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        C1333Ki webView = this.A06.get();
        if (webView == null || webView.A0J()) {
            A00().AKA(true);
            return;
        }
        InterfaceC1714Zh interfaceC1714Zh = this.A04.get();
        if (interfaceC1714Zh == null) {
            A00().AKA(true);
            return;
        }
        LH lhA00 = A00();
        String[] strArr = A07;
        if (strArr[3].charAt(2) == strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        A07[6] = "MExJxptNjWm815DyzsGP1";
        lhA00.AKA(false);
        interfaceC1714Zh.AET();
    }
}
