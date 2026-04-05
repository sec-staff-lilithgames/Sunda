package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.model.Cif;
import com.bytedance.sdk.openadsdk.core.zz.wqx;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends com.bytedance.sdk.component.zz.jj implements wqx.InterfaceC0140wqx {

    /* renamed from: au, reason: collision with root package name */
    private List<String> f21087au;

    /* renamed from: cm, reason: collision with root package name */
    protected boolean f21088cm;
    private long hna;

    /* renamed from: if, reason: not valid java name */
    private int f149if;

    /* renamed from: jj, reason: collision with root package name */
    AtomicBoolean f21089jj;

    /* renamed from: ju, reason: collision with root package name */
    private String f21090ju;
    protected boolean my;
    private jd oya;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    AtomicBoolean f21091qk;
    private dt xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.dt f21092yd;
    private wqx zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jd();

        View jpo();

        void jpo(int i10, int i11);

        void jpo(View view, int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends jj.jpo {
        public static final Set<String> jpo = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.zz.my.jpo.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };

        /* renamed from: jd, reason: collision with root package name */
        wqx.InterfaceC0140wqx f21093jd;

        public jpo(wqx.InterfaceC0140wqx interfaceC0140wqx) {
            this.f21093jd = interfaceC0140wqx;
        }

        private void jpo(String str) {
            int iLastIndexOf;
            wqx.InterfaceC0140wqx interfaceC0140wqx;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!jpo.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0140wqx = this.f21093jd) == null) {
                    return;
                }
                interfaceC0140wqx.jd(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            wqx.InterfaceC0140wqx interfaceC0140wqx = this.f21093jd;
            if (interfaceC0140wqx != null) {
                interfaceC0140wqx.jpo();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                jpo(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            jpo(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.f21093jd.jpo(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            jpo(webResourceRequest.getUrl().toString());
        }

        private void jpo(String str, int i10, String str2) {
            wqx.InterfaceC0140wqx interfaceC0140wqx = this.f21093jd;
            if (interfaceC0140wqx != null) {
                interfaceC0140wqx.jpo(106, i10);
            }
        }
    }

    public my(Context context) {
        super(context);
        this.f21088cm = false;
        this.my = false;
        this.f21089jj = new AtomicBoolean(false);
        this.f21091qk = new AtomicBoolean(false);
        this.f149if = 0;
    }

    private void rq() {
        if (this.f21087au == null) {
            com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f21092yd, this.f21090ju, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.zz.my.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        if (my.this.f21087au != null && my.this.f21091qk.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = my.this.f21087au.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.cm.wqx.jd(my.this.f21092yd, my.this.f21090ju, "dsp_html_error_url", jSONObject);
                            my.this.f21087au = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.zz.jj
    public void hna() {
        this.zz.jd();
        super.hna();
    }

    public void jr() {
        jd jdVar = this.oya;
        if (jdVar != null) {
            jdVar.jd();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.hna);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f21092yd, this.f21090ju, "render_html_success", jSONObject);
    }

    public void nmd() {
        this.f21089jj.set(false);
        String strNes = this.f21092yd.nes();
        if (TextUtils.isEmpty(strNes)) {
            return;
        }
        String strJpo = com.bytedance.sdk.openadsdk.core.p000if.my.jpo(strNes);
        String str = TextUtils.isEmpty(strJpo) ? strNes : strJpo;
        this.f149if = 0;
        jpo(null, str, "text/html", C.UTF8_NAME, null);
        this.hna = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.zz.jj, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21088cm) {
            this.zz.jpo(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.zz.jj, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.zz.jpo();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.prr / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f21092yd, this.f21090ju, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        this.my = z10;
        this.zz.jpo(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.wqx.InterfaceC0140wqx
    public void jd(String str) {
        if (this.f21087au == null) {
            this.f21087au = new ArrayList();
        }
        this.f21087au.add(str);
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, jd jdVar, String str) {
        this.oya = jdVar;
        this.f21092yd = dtVar;
        this.f21090ju = str;
        this.zz = new wqx();
        this.xyk = new dt(getContext());
        setWebViewClient(new jpo(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.zz.my.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                my.this.prr = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    my.this.jpo();
                }
            }
        });
        com.bytedance.sdk.component.utils.zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.my.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = my.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.my.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            my.this.xyk.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx {
        protected int jpo = 0;

        /* renamed from: jd, reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.core.p000if.jj f21094jd = com.bytedance.sdk.openadsdk.core.p000if.jj.jpo();

        public void jd() {
            jpo();
        }

        public void jpo(WebView webView) {
            if (webView != null && this.jpo == 0) {
                if (this.f21094jd == null) {
                    this.f21094jd = com.bytedance.sdk.openadsdk.core.p000if.jj.jpo();
                }
                this.f21094jd.jpo(webView);
                this.f21094jd.jd();
                this.jpo = 1;
            }
        }

        public void jpo(boolean z10) {
            com.bytedance.sdk.openadsdk.core.p000if.jj jjVar;
            if (this.jpo == 1 && z10 && (jjVar = this.f21094jd) != null) {
                jjVar.wqx();
                this.jpo = 3;
            }
        }

        public void jpo(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.p000if.jj jjVar = this.f21094jd;
            if (jjVar != null) {
                jjVar.jpo(view, friendlyObstructionPurpose);
            }
        }

        public void jpo() {
            com.bytedance.sdk.openadsdk.core.p000if.jj jjVar;
            int i10 = this.jpo;
            if (i10 != 0 && i10 != 4 && (jjVar = this.f21094jd) != null) {
                jjVar.cm();
            }
            this.jpo = 4;
            this.f21094jd = null;
        }
    }

    public void jpo(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.zz.jpo(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.wqx.InterfaceC0140wqx
    public void jpo(String str) throws JSONException {
        boolean zJpo;
        if (TextUtils.isEmpty(str) || this.f21092yd == null || !this.xyk.jd()) {
            return;
        }
        int iJpo = tic.jpo(this.f21090ju);
        View viewJpo = null;
        if (!com.bytedance.sdk.component.utils.opi.jpo(str) && (this.f21092yd.cnl() == null || TextUtils.isEmpty(this.f21092yd.cnl().jpo()))) {
            com.bytedance.sdk.openadsdk.core.model.au auVar = new com.bytedance.sdk.openadsdk.core.model.au();
            auVar.jpo(str);
            this.f21092yd.jpo(auVar);
            str = null;
        }
        this.f21092yd.wqx(true);
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f21092yd;
        if (dtVar == null || dtVar.cnl() == null || TextUtils.isEmpty(this.f21092yd.cnl().jpo())) {
            zJpo = false;
        } else {
            zJpo = duq.jpo(getContext(), this.f21092yd, iJpo, this.f21090ju, true, (Map<String, Object>) null);
            if (!zJpo && !TextUtils.isEmpty(this.f21092yd.cnl().jd())) {
                str = this.f21092yd.cnl().jd();
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.f21092yd, this.f21090ju, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!zJpo) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                duq.jpo(getContext(), this.f21092yd, iJpo, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.cm.jpo) null, this.f21090ju, true, str2);
            }
        }
        if (this.xyk != null) {
            jd jdVar = this.oya;
            if (jdVar != null) {
                viewJpo = jdVar.jpo();
                this.oya.jpo(this, 2);
            }
            Cif cifJpo = this.xyk.jpo(getContext(), viewJpo);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo("click", this.f21092yd, cifJpo, this.f21090ju, true, (Map<String, Object>) map, this.xyk.jd() ? 1 : 2);
        }
        dt dtVar2 = this.xyk;
        if (dtVar2 != null) {
            dtVar2.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.wqx.InterfaceC0140wqx
    public void jpo(int i10, int i11) {
        jd jdVar = this.oya;
        if (jdVar != null) {
            jdVar.jpo(i10, i11);
        }
        this.f149if = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.hna);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f21092yd, this.f21090ju, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.wqx.InterfaceC0140wqx
    public void jpo() {
        if (this.f21089jj.compareAndSet(false, true)) {
            this.f21088cm = true;
            this.zz.jpo(getWebView());
            this.zz.jpo(this.my);
            jr();
            rq();
        }
    }
}
