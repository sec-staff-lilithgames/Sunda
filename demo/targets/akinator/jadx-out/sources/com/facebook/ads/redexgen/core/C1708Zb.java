package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1708Zb extends WebViewClient {
    public static byte[] A05;
    public ZX A00 = new ZX() { // from class: com.facebook.ads.redexgen.X.LP
        @Override // com.facebook.ads.redexgen.core.ZX
        public final boolean AAW(String str) {
            return C1708Zb.A04(str);
        }
    };
    public WeakReference<ZZ> A01 = new WeakReference<>(null);
    public final WeakReference<C1937dL> A02;
    public final WeakReference<ZY> A03;
    public final WeakReference<ZT> A04;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, AbstractJsonLexerKt.TC_INVALID, 114, 56, AbstractJsonLexerKt.TC_INVALID, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1708Zb(WeakReference<C1937dL> weakReference, WeakReference<ZY> weakReference2, WeakReference<ZT> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1937dL c1937dL) {
        c1937dL.A08().AAy(A00(11, 11, 104), AbstractC1550Sv.A09, new C1551Sw(A00(111, 5, 91) + str));
    }

    private boolean A03(WebView webView, String str) throws URISyntaxException {
        boolean zA14;
        String strA00;
        String strA002;
        String strA003;
        Intent intent;
        String strA004 = A00(116, 8, 68);
        C1937dL c1937dL = this.A02.get();
        if (c1937dL != null) {
            if ((LJ.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A00.AAW(str)) {
                return true;
            }
            try {
                Uri uri = WQ.A00(str);
                String scheme = uri.getScheme();
                try {
                    zA14 = U7.A14(c1937dL);
                    strA00 = A00(48, 33, 58);
                    strA002 = A00(22, 26, 65);
                    strA003 = A00(105, 6, 36);
                } catch (Exception e10) {
                    c1937dL.A08().AAz(strA004, AbstractC1550Sv.A2d, new C1551Sw(e10));
                    c1937dL.A0F().A9u(e10.toString());
                }
                if (zA14) {
                    if (!LJ.A0E.contains(scheme) && !A00(101, 4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE).equals(scheme)) {
                        if (strA003.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(strA002, uri);
                        }
                        intent.addCategory(strA00);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!WB.A0D(c1937dL, intent)) {
                                A02(str, c1937dL);
                            }
                            return true;
                        } catch (W9 unused) {
                            if (strA003.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!WB.A0D(c1937dL, new Intent(strA002, WQ.A00(stringExtra)))) {
                                        A02(str, c1937dL);
                                    }
                                    return true;
                                }
                            }
                            C1551Sw c1551Sw = new C1551Sw(A00(111, 5, 91) + str);
                            c1551Sw.A05(1);
                            c1937dL.A08().AAz(A00(11, 11, 104), AbstractC1550Sv.A06, c1551Sw);
                            return true;
                        }
                    }
                    return false;
                }
                if (!LJ.A0A || !strA003.equalsIgnoreCase(scheme)) {
                    if ((LJ.A0A && AbstractC1644Wp.A04(str)) || !LJ.A0E.contains(scheme)) {
                        return WB.A0D(c1937dL, new Intent(strA002, uri));
                    }
                } else {
                    Intent uri2 = Intent.parseUri(str, 1);
                    uri2.addCategory(strA00);
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    if (c1937dL.getPackageManager().resolveActivity(uri2, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null && WB.A0D(c1937dL, uri2)) {
                        webView.goBack();
                        return true;
                    }
                }
                return false;
            } catch (SecurityException e11) {
                c1937dL.A08().AAz(strA004, AbstractC1550Sv.A2d, new C1551Sw(e11));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(ZX zx) {
        this.A00 = zx;
    }

    public final void A06(WeakReference<ZZ> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ZT timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        ZY zy = this.A03.get();
        if (zy != null) {
            zy.AES(str);
        }
        ZZ zz = this.A01.get();
        if (zz != null) {
            zz.ACa(webView.canGoBack());
            zz.ADJ(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ZY listener = this.A03.get();
        if (listener != null) {
            listener.AEU(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) throws JSONException {
        super.onReceivedError(webView, i10, str, str2);
        C1937dL c1937dL = this.A02.get();
        if (c1937dL != null) {
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1644Wp.A01(i10, sb2.append(strA00).append(str).toString(), strA00 + str2);
            c1937dL.A0F().A9r(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1937dL c1937dL = this.A02.get();
        if (c1937dL != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String strA00 = A00(0, 0, 109);
            String errorMessage = AbstractC1644Wp.A01(errorCode, sb2.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1937dL.A0F().A9r(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1937dL context = this.A02.get();
        if (context != null) {
            context.A0F().A9s();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1937dL context = this.A02.get();
        if (context != null) {
            context.A0F().A9t();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1711Ze.A0D(AbstractC1550Sv.A2e);
        ZY listener = this.A03.get();
        if (listener != null) {
            listener.AEw();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
