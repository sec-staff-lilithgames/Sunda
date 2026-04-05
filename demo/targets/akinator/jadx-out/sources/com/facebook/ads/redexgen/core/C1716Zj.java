package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1716Zj extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public Date A00;
    public boolean A01 = false;
    public final C1937dL A02;
    public final WeakReference<C1333Ki> A03;
    public final WeakReference<InterfaceC1714Zh> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<XH> A06;
    public final WeakReference<C2010eX> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, 38, 40, 45, 42, -14, 8, 52, 51, 57, 55, 52, 49, -69, -36, -27, -32, -36, -37, 28, 77, 56, 67, 76, 56, 75, 64, 69, 62, -9, 44, 41, 32, -9, 39, 56, 75, Utf8.REPLACEMENT_BYTE, -9, 61, 70, 73, -9, 29, 64, 67, 60, -9, 24, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, 60, 72, 72, 68, 20, 57, 102, 102, 99, 102, 59, 84, 89, 71, 76, 75, 6, 56, 75, 87, 91, 75, 89, 90, 6, 76, 85, 88, 6, 44, 79, 82, 75, 6, 39, 73, 73, 75, 89, 89, 6, 34, 59, 64, 46, 51, 50, -19, 31, 50, 62, 66, 50, 64, 65, -19, 51, 60, Utf8.REPLACEMENT_BYTE, -19, 19, 54, 57, 50, -19, 14, 48, 48, 50, 64, 64, -19, 49, 50, 59, 54, 50, 49, 67, 68, 77, 72, 68, 67, 62, 84, 81, 72, 62, 79, 64, 83, 71, Utf8.REPLACEMENT_BYTE, 76, 76, 73, 76, 57, 61, 73, 62, Utf8.REPLACEMENT_BYTE, 40, 53, 53, 50, 53, 34, 39, 40, 54, 38, 53, 44, 51, 55, 44, 50, 49, 15, 10, 31, 18, 12, 24, 23, -41, 18, 12, 24, 19, 22, 25, 18, 89, 99, 79, 103, 85, 82, 79, 98, 85, 99, 95, 101, 98, 83, 85, 79, 85, 98, 98, 95, 98, 70, 73, 59, 62, 67, 72, 65, 57, 78, 67, 71, Utf8.REPLACEMENT_BYTE, 57, 67, 72, 57, 71, 67, 70, 70, 67, 77, -3, -12, 3, -55, -55, -44, -31, -31, -18, -44, -36, -33, -29, -24, -18, -31, -44, -30, -33, -34, -35, -30, -44, 46, 47, -19, 51, 52, 47, 50, 37, 66, 53, 65, 69, 53, 67, 68, 47, 57, 52, 101, 86, 105, 101, 32, 97, 93, 82, 90, 95, -8, -29, -18, -21, -26, -31, -14, -29, -10, -22, 62, 44, 41, 38, 61, 48, 44, 62};
        String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C1716Zj(C1937dL c1937dL, WeakReference<InterfaceC1714Zh> weakReference, WeakReference<C2010eX> weakReference2, WeakReference<XH> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C1333Ki> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z10) {
        this.A02 = c1937dL;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z10;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), StandardCharsets.UTF_8.name(), 403, A01(13, 6, 1), Collections.singletonMap(A01(0, 13, 79), A01(268, 8, 74)), new ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    private void A03(int i10, CharSequence charSequence, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z10 = charSequence != null;
        try {
            jSONObject.put(A01(160, 10, 100), i10);
            jSONObject.put(A01(170, 17, 77), charSequence);
            jSONObject.put(A01(202, 21, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), z10);
            jSONObject.put(A01(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 22, 100), j10);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A08().AAy(A01(306, 8, 81), AbstractC1550Sv.A2f, new C1551Sw(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) throws JSONException {
        if (A01(245, 23, 25).equals(str)) {
            this.A02.A0F().AKC();
            return;
        }
        this.A02.A0F().AKD(i10, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i10, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ADG(i10, str);
        }
    }

    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(187, 11, 51))) {
            return;
        }
        this.A02.A0F().AKH(webResourceResponse.getStatusCode(), AbstractC1644Wp.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(145, 15, 105), str);
            jSONObject.put(A01(296, 10, 12), str2);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A08().AAy(A01(306, 8, 81), AbstractC1550Sv.A2c, new C1551Sw(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A08(android.net.Uri r8) throws org.json.JSONException {
        /*
            r7 = this;
            java.lang.String r3 = r8.getPath()
            java.lang.String r4 = r8.getScheme()
            if (r3 == 0) goto Lbb
            if (r4 == 0) goto Lbb
            r5 = 198(0xc6, float:2.77E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1716Zj.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L26
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L26:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1716Zj.A0C
            java.lang.String r1 = "5na5yijD7UxFpHVkXXcSH2RW6Zg"
            r0 = 5
            r2[r0] = r1
            r1 = 4
            r0 = 55
            java.lang.String r0 = A01(r5, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbb
            boolean r4 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1716Zj.A0C
            r0 = 3
            r1 = r2[r0]
            r0 = 6
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb1
            if (r4 == 0) goto L6c
        L52:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 19
            r1 = 36
            r0 = 97
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L6c:
            com.facebook.ads.redexgen.X.dL r0 = r7.A02
            java.util.List r5 = com.facebook.ads.redexgen.core.SF.A09(r0)
            boolean r6 = A0A(r3, r5)
            if (r6 != 0) goto Lb0
            boolean r0 = com.facebook.ads.internal.api.BuildConfigApi.isDebug()
            if (r0 == 0) goto L98
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = 77
            r1 = 31
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            r0.toString()
        L98:
            java.lang.String r4 = com.facebook.ads.redexgen.core.C1333Ki.A01()
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 37
            r0 = 87
            java.lang.String r0 = A01(r2, r1, r0)
            android.util.Log.w(r4, r0)
            java.lang.String r0 = r5.toString()
            r7.A07(r3, r0)
        Lb0:
            return r6
        Lb1:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1716Zj.A0C
            java.lang.String r1 = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH"
            r0 = 5
            r2[r0] = r1
            if (r4 == 0) goto L6c
            goto L52
        Lbb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1716Zj.A08(android.net.Uri):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0F().AKE(this.A03.get() != null);
        if (this.A03.get() != null) {
            AtomicBoolean atomicBoolean = this.A05.get();
            String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0K();
            }
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0F().AKF();
        this.A00 = new Date();
        new Handler().postDelayed(new C1335Kk(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) throws JSONException {
        this.A01 = true;
        A04(i10, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        boolean zA12 = U7.A12(this.A02);
        String strA01 = A01(0, 0, 53);
        if (zA12 || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), strA01 + ((Object) webResourceError.getDescription()));
        } else {
            this.A02.A0F().AKG(AbstractC1644Wp.A01(webResourceError.getErrorCode(), strA01 + ((Object) webResourceError.getDescription()), strA01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0F().AKI();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1711Ze.A0D(AbstractC1550Sv.A2b);
        InterfaceC1714Zh adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AFw();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws JSONException {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse webResourceResponseA00 = A00();
            A05(webResourceRequest, webResourceResponseA00);
            return webResourceResponseA00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().ACj(str, new C1722Zp().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}
