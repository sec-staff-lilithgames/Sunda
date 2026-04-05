package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1711Ze extends WebView {
    public static byte[] A01;
    public static final String A02;
    public boolean A00;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 4, 9, 4, 15, 4, -4, 7, 4, 21, 0, -69, -34, 10, 10, 6, 4, 0, -24, -4, 9, -4, 2, 0, 13, -55, -70, -71, -125, -58, -43, -60, -42, -53, -56, -57, Utf8.REPLACEMENT_BYTE, 54, 75, 54, 72, 56, 71, 62, 69, 73, 15, -4, -22, -25, -28, -5, -18, -22, -4};
    }

    public abstract WebChromeClient A0G();

    public abstract WebViewClient A0H();

    static {
        A0C();
        A02 = AbstractC1711Ze.class.getSimpleName();
    }

    public AbstractC1711Ze(Activity activity, C1937dL c1937dL) {
        super(activity);
        A0E(c1937dL);
    }

    public AbstractC1711Ze(C1937dL c1937dL) {
        super(c1937dL);
        A0E(c1937dL);
    }

    public static void A0D(int i10) {
        C1911cu context = SP.A00();
        if (context != null) {
            context.A08().AAy(A0B(56, 8, 37), i10, new C1551Sw(A0B(35, 10, 3)));
        }
    }

    private void A0E(SQ sq2) {
        setWebChromeClient(A0G());
        setWebViewClient(A0H());
        AbstractC1717Zk.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (sq2.A05().AAF()) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        try {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        } catch (Exception unused) {
            Log.w(A02, A0B(0, 35, 59));
        }
    }

    private void A0F(String str) {
        loadUrl(A0B(45, 11, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) + str);
    }

    public final void A0I(String str) {
        try {
            evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            A0F(str);
        }
    }

    public final boolean A0J() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
