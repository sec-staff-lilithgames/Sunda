package com.bytedance.sdk.openadsdk.core.widget.jpo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.cm.jd;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.tu;
import i2.hQ.aTNDubNmpwAqdU;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends jj.jpo {

    /* renamed from: rq, reason: collision with root package name */
    private static final HashSet<String> f20921rq;

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.cm f20922au;

    /* renamed from: cm, reason: collision with root package name */
    protected final Context f20923cm;
    private boolean hna;

    /* renamed from: if, reason: not valid java name */
    private boolean f143if;

    /* renamed from: jd, reason: collision with root package name */
    private String f20924jd;

    /* renamed from: jj, reason: collision with root package name */
    protected Cif f20925jj;
    private final boolean jpo;

    /* renamed from: jr, reason: collision with root package name */
    private JSONObject f20926jr;

    /* renamed from: ju, reason: collision with root package name */
    private Map<String, Object> f20927ju;
    protected final String my;
    private dt nmd;
    private com.bytedance.sdk.openadsdk.core.au.cm.jd opi;
    private String oya;
    private final Stack<String> prr;

    /* renamed from: qk, reason: collision with root package name */
    protected boolean f20928qk;

    /* renamed from: sq, reason: collision with root package name */
    private TTCeilingLandingPageActivity.jpo f20929sq;
    protected final ef wqx;
    protected boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.Cif f20930yd;
    protected boolean zz;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f20921rq = hashSet;
        a.u(hashSet, "png", "ico", "jpg", "gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public my(Context context, ef efVar, String str, com.bytedance.sdk.openadsdk.common.cm cmVar, Cif cif, boolean z10, boolean z11, TTCeilingLandingPageActivity.jpo jpoVar) {
        this(context, efVar, str, cmVar, cif, z10);
        this.hna = z11;
        this.f20929sq = jpoVar;
    }

    public static String cm(String str) {
        int iLastIndexOf;
        String strSubstring;
        if (str == null || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf == str.length() - 1 || (strSubstring = str.substring(iLastIndexOf)) == null || !f20921rq.contains(strSubstring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(strSubstring);
    }

    private boolean my(String str) {
        if (nmd.yd(this.nmd)) {
            return TextUtils.equals(this.nmd.wo(), str);
        }
        return false;
    }

    public Cif jd() {
        return this.f20925jj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        Cif cif = this.f20925jj;
        if (cif != null) {
            cif.jpo(webView, str, this.jpo);
        }
        com.bytedance.sdk.openadsdk.common.cm cmVar = this.f20922au;
        if (cmVar != null) {
            cmVar.jd(webView, str, this.jpo);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2;
        String str2;
        dt dtVar;
        super.onPageStarted(webView, str, bitmap);
        dt dtVar2 = this.nmd;
        int iJpo = (dtVar2 != null && dtVar2.zrw() && com.bytedance.sdk.openadsdk.rq.jpo.jpo("opt_web_index", false)) ? tic.jpo(webView) : -1;
        Cif cif = this.f20925jj;
        if (cif != null) {
            webView2 = webView;
            str2 = str;
            cif.jpo(webView2, str2, bitmap, this.jpo, iJpo);
        } else {
            webView2 = webView;
            str2 = str;
        }
        com.bytedance.sdk.openadsdk.common.cm cmVar = this.f20922au;
        if (cmVar != null) {
            cmVar.wqx(webView2, str2, this.jpo);
        }
        if (this.jpo && (dtVar = this.nmd) != null && dtVar.zrw() && this.nmd.rq().jd() >= 2) {
            if (!TextUtils.isEmpty(str2) && !str2.equals(this.oya)) {
                if (this.prr.contains(str2)) {
                    while (!str2.equals(this.prr.peek())) {
                        this.prr.pop();
                    }
                } else {
                    this.prr.push(str2);
                }
            }
            this.oya = str2;
        }
        if (!this.xyk || this.zz) {
            return;
        }
        this.zz = true;
        wqx.jpo(this.f20923cm).jpo(true).jd(webView2.getSettings().getBuiltInZoomControls()).jpo(webView2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f20925jj == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.f20925jj.jpo(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f20925jj != null) {
            int primaryError = 0;
            String strConcat = "SslError: unknown";
            String url = null;
            if (sslError != null) {
                try {
                    primaryError = sslError.getPrimaryError();
                    strConcat = "SslError: ".concat(String.valueOf(sslError));
                    url = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str = url;
            this.f20925jj.jpo(webView, primaryError, strConcat, str, cm(str), true);
        }
    }

    @Override // com.bytedance.sdk.component.zz.jj.jpo, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.my.my.jpo().jd();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        my myVar;
        String str2;
        ef efVar;
        Uri uri;
        final String lowerCase;
        Intent uri2;
        Cif cif = this.f20925jj;
        if (cif != null) {
            cif.jpo(str, this.jpo);
        }
        com.bytedance.sdk.openadsdk.common.cm cmVar = this.f20922au;
        if (cmVar != null) {
            cmVar.jpo(webView, str, this.jpo);
        }
        if (jpo(webView, str)) {
            return true;
        }
        dt dtVar = this.nmd;
        if (dtVar != null && dtVar.oya() == 1 && ((com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.jpo(str, this.nmd) || com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.jpo(this.nmd, str)) && com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.jd(this.nmd, this.f20923cm, true))) {
            return true;
        }
        try {
            uri = Uri.parse(str);
            lowerCase = uri.getScheme().toLowerCase();
        } catch (Throwable unused) {
            myVar = this;
            str2 = str;
            efVar = myVar.wqx;
            if (efVar != null && efVar.my()) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if ("bytedance".equals(lowerCase)) {
            jr.jpo(uri, this.wqx);
            return true;
        }
        if (wqx(str)) {
            return true;
        }
        if (opi.jpo(str)) {
            str2 = str;
            return super.shouldOverrideUrlLoading(webView, str2);
        }
        if (nmd.yd(this.nmd)) {
            jpo(lowerCase, str);
            return true;
        }
        try {
            if (str.startsWith("intent:")) {
                uri2 = Intent.parseUri(str, 1);
            } else if (str.startsWith("android-app:")) {
                uri2 = Intent.parseUri(str, 2);
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                uri2 = intent;
            }
            uri2.addFlags(268435456);
            com.bytedance.sdk.component.utils.jd.jpo(this.f20923cm, uri2, new jd.InterfaceC0092jd() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.my.1
                @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
                public void jpo() {
                    my.this.jpo(lowerCase, true, 0, "", str);
                }

                @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
                public void jpo(Throwable th2) {
                    my.this.jpo(lowerCase, false, 2, th2.getMessage(), str);
                }
            });
            myVar = this;
            str2 = str;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("WebChromeClient", "parseUri", th2);
            myVar = this;
            str2 = str;
            try {
                myVar.jpo(lowerCase, false, 1, th2.getMessage(), str2);
            } catch (Throwable unused2) {
                efVar = myVar.wqx;
                if (efVar != null) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str2);
            }
        }
        com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar = myVar.opi;
        if (jdVar != null) {
            jdVar.sq();
        }
        return true;
    }

    public void wqx() {
        if (TextUtils.isEmpty(this.f20924jd) || !nmd.zz(this.nmd) || this.f143if) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.Cif cif = this.f20930yd;
        if (cif != null) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo("click", this.nmd, cif, this.f20924jd, true, this.f20927ju, 1);
            this.f143if = true;
            return;
        }
        JSONObject jSONObject = this.f20926jr;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.nmd, this.f20924jd, "click", jSONObject);
            this.f143if = true;
        }
    }

    public boolean jd(String str) {
        String strWqx;
        String strJpo;
        if (this.f20923cm == null) {
            return false;
        }
        dt dtVar = this.nmd;
        if (dtVar == null || dtVar.xur() == null) {
            strWqx = "";
            strJpo = "";
        } else {
            strWqx = this.nmd.xur().wqx();
            strJpo = this.nmd.xur().jpo();
        }
        if (!com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo()) {
            return com.bytedance.sdk.openadsdk.jr.jpo.jpo.jpo.jpo(str, this.f20923cm, this.f20924jd, this.nmd, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.jr.jpo.jpo.jpo.jpo(this.nmd, strWqx, this.f20923cm, this.f20924jd, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.jr.jpo.jpo.cm.jpo(this.f20923cm, strJpo, strWqx, this.f20924jd, this.nmd);
        }
        Context context = this.f20923cm;
        dt dtVar2 = this.nmd;
        return com.bytedance.sdk.openadsdk.jr.jpo.jpo.wqx.jpo(context, str, dtVar2, tic.jd(dtVar2), null, true) || com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.jpo(this.nmd, strWqx, this.f20923cm, this.f20924jd, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.jr.jpo.jpo.my.jpo(this.f20923cm, strJpo, strWqx, this.f20924jd, this.nmd);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.Cif cif) {
        this.f20930yd = cif;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f20925jj == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String string = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.containsKey("accept") ? requestHeaders.get("accept") : "";
        this.f20925jj.jpo(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), string, str, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Cif cif = this.f20925jj;
        if (cif != null) {
            cif.jd(webView, str, this.jpo);
        }
        com.bytedance.sdk.openadsdk.common.cm cmVar = this.f20922au;
        if (cmVar != null) {
            cmVar.jpo(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public void jpo(Map<String, Object> map) {
        this.f20927ju = map;
    }

    public my(Context context, ef efVar, String str, com.bytedance.sdk.openadsdk.common.cm cmVar, Cif cif, boolean z10) {
        this(context, efVar, str, cif, z10);
        this.f20922au = cmVar;
    }

    public void jpo(JSONObject jSONObject) {
        this.f20926jr = jSONObject;
    }

    public void jpo(String str) {
        this.f20924jd = str;
    }

    public my(Context context, ef efVar, String str, Cif cif, boolean z10) {
        this.f20928qk = true;
        this.xyk = true;
        this.zz = false;
        this.f20923cm = context;
        this.wqx = efVar;
        this.my = str;
        this.f20925jj = cif;
        this.jpo = z10;
        this.prr = new Stack<>();
    }

    public void jpo(dt dtVar) {
        this.nmd = dtVar;
    }

    private void jpo(String str, String str2) {
        if ((my(str) || ApsAdWebViewSupportClient.MARKET_SCHEME.equals(str)) && ((this.f20930yd != null || this.f20926jr != null) && jd(str2))) {
            wqx();
        }
        this.f20930yd = null;
        this.f20926jr = null;
    }

    public boolean wqx(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if ("play.google.com".equals(uri.getHost())) {
                if (nmd.yd(this.nmd) && this.f20926jr == null && this.f20930yd == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.f20923cm instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(uri);
                intent.setPackage("com.android.vending");
                this.f20923cm.startActivity(intent);
                wqx();
                this.f20926jr = null;
                this.f20930yd = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean jpo(WebView webView, String str) {
        if (!tic.cm(this.nmd) || this.nmd.rq() == null || webView == null) {
            return false;
        }
        int iJd = this.nmd.rq().jd();
        int size = this.prr.size();
        if (this.hna) {
            size++;
        }
        if (size + 1 != iJd) {
            return false;
        }
        tu.jpo(this.f20923cm, str, this.nmd, jd.jpo.f19526cm);
        TTCeilingLandingPageActivity.jpo jpoVar = this.f20929sq;
        if (jpoVar != null) {
            jpoVar.jpo();
        }
        return true;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        this.opi = jdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final String str, final boolean z10, final int i10, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.nmd, this.f20924jd, "lp_not_http_open", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.my.2
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(aTNDubNmpwAqdU.yVJ, str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z10);
                    jSONObject.put("error_type", i10);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }
}
