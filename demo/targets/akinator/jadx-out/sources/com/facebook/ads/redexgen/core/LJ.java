package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class LJ extends AbstractC1711Ze {
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static String[] A0C = {"r5lFqG0C0bBGIxytTEblkmz8pOWiln6U", "Y5tMFhpuLobi6U3v3neZGAzEpbrZh2e0", "35iZKMkwZFt7WP5rciHAZ1WswbletKXm", "1wdh7bxI31pnh6pFTaTypUqx", "X0GEkrMG66X1N8QG", "HQ8AmQiqT9dTkfwWyhZ7u2ZNdQoS7Fbv", "yjHJSxajRdLfdjSgilcNPSPFyTq4dELg", "ut8cBtSHXrZx3QiSKTpc7NoA9ie10da9"};
    public static final String A0D;
    public static final Set<String> A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1937dL A04;
    public ZT A05;
    public ZY A06;
    public C1708Zb A07;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{43, 55, 55, 51, 100, 120, 120, 124, AbstractJsonLexerKt.TC_INVALID};
    }

    static {
        A06();
        A0D = LJ.class.getSimpleName();
        A0E = new HashSet(2);
        A09 = false;
        A0A = false;
        A0E.add(A03(0, 4, 113));
        A0E.add(A03(4, 5, 62));
    }

    public LJ(C1937dL c1937dL, Activity activity, ZY zy) {
        super(activity, c1937dL);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1937dL, zy);
    }

    public LJ(C1937dL c1937dL, ZY zy) {
        super(c1937dL);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A08(c1937dL, zy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C1708Zb A0H() {
        return new C1708Zb(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A05() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A07(int i10, int i11, Intent intent) {
        if (A08 != null && i10 == 1001) {
            A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            A08 = null;
        }
    }

    private void A08(C1937dL c1937dL, ZY zy) {
        this.A04 = c1937dL;
        this.A06 = zy;
        this.A05 = new ZT(this);
        A09 = U8.A03(this.A04);
        A0A = U8.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0G());
        this.A07 = A0H();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze
    public final WebChromeClient A0G() {
        return new C1707Za(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0K(long j10) {
        if (this.A00 < 0) {
            this.A00 = j10;
        }
        A05();
        String[] strArr = A0C;
        if (strArr[6].charAt(18) == strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "TnIn5PelVgDBsDwa";
        strArr2[3] = "kaGwwHcDVWZGOuagxs1W4ZQa";
    }

    public final void A0L(long j10) {
        if (this.A01 < 0) {
            this.A01 = j10;
        }
        A05();
    }

    public final void A0M(long j10) {
        if (this.A02 < 0) {
            this.A02 = j10;
        }
        A05();
        String[] strArr = A0C;
        if (strArr[5].charAt(4) == strArr[7].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[6] = "DwC46XxC2zY9iA5O924mXxlTXzY8IGhb";
        strArr2[0] = "1LscF1ZcfF08U7LpSibJFf3LFm8iDmJu";
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1711Ze, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        AbstractC1717Zk.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList.getSize() > 0) {
            return webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(ZZ zz) {
        this.A07.A06(new WeakReference<>(zz));
    }

    public void setInterceptRedirectRequest(ZX zx) {
        this.A07.A05(zx);
    }
}
