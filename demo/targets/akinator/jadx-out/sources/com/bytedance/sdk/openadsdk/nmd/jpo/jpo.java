package com.bytedance.sdk.openadsdk.nmd.jpo;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.jpo.prr;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cm.opi;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.yd;
import com.bytedance.sdk.openadsdk.core.widget.zz;
import com.bytedance.sdk.openadsdk.nmd.my;
import com.bytedance.sdk.openadsdk.nmd.qk;
import com.bytedance.sdk.openadsdk.nmd.xyk;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: au, reason: collision with root package name */
    private volatile boolean f21320au;

    /* renamed from: cm, reason: collision with root package name */
    private final int f21321cm;
    private AtomicBoolean hna;

    /* renamed from: if, reason: not valid java name */
    private boolean f157if;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f21322jd;

    /* renamed from: jj, reason: collision with root package name */
    private yd f21323jj;
    protected jj jpo;

    /* renamed from: jr, reason: collision with root package name */
    private InterfaceC0149jpo f21324jr;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.p001if.jj f21325ju;
    private final FrameLayout my;
    private boolean nmd;
    private com.bytedance.sdk.openadsdk.core.wqx.jpo opi;
    private volatile boolean oya;
    private AtomicBoolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private ef f21326qk;

    /* renamed from: rq, reason: collision with root package name */
    private int f21327rq;

    /* renamed from: sq, reason: collision with root package name */
    private zz f21328sq;

    /* renamed from: tu, reason: collision with root package name */
    private int f21329tu;
    private final dt wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private xyk f21330yd;
    private final String zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.nmd.jpo.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0149jpo {
        void jpo();
    }

    public jpo(Context context, dt dtVar, int i10, boolean z10, FrameLayout frameLayout) {
        this(context, dtVar, i10, z10, frameLayout, false);
    }

    public jpo(Context context, dt dtVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11) {
        this(context, dtVar, i10, z10, frameLayout, z11, 0);
    }

    private void wqx(boolean z10) {
        prr prrVarJd;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.wqx.fc());
            jSONObject.put("log_extra", this.wqx.fxd());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.zz.jd().sq()) {
            qk.jpo(new qk.jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.1
            });
        }
        xyk xykVarJpo = xyk.jpo(sq.jpo(), this.jpo.getWebView(), new com.bytedance.sdk.openadsdk.nmd.wqx() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.2
            @Override // com.bytedance.sdk.openadsdk.nmd.wqx
            public void jpo(String str, JSONObject jSONObject2) {
                if (jpo.this.f21326qk != null) {
                    jpo.this.f21326qk.jpo(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.nmd.jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.3
            @Override // com.bytedance.sdk.openadsdk.nmd.jpo
            public void jd() {
                jpo.this.f21326qk.jd(true);
                if (jpo.this.f21325ju != null) {
                    jpo.this.f21325ju.jpo();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.nmd.jpo
            public com.bytedance.sdk.openadsdk.nmd.cm jpo() {
                String strJj = com.bytedance.sdk.openadsdk.common.jd.jj();
                strJj.getClass();
                switch (strJj) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.nmd.cm.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.nmd.jpo
            public void wqx() {
                if (jpo.this.f21326qk.oya() != null) {
                    jpo.this.f21326qk.oya().jpo(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.nmd.jpo
            public void jpo(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), jpo.this.wqx, jpo.this.xyk, "playable_track", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.3.1
                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject jpo() throws JSONException {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!jpo.this.wqx.ndv()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e10) {
                            nmd.wqx("PlayableManager", e10.getMessage());
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                    public JSONObject wqx() {
                        return jSONObject2;
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.nmd.jpo
            public void jpo(int i10, String str) throws JSONException {
                jpo.this.f157if = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    jpo.this.jpo(2, i10);
                } else if (i10 == 5) {
                    jpo.this.jpo(3, i10);
                } else {
                    jpo.this.jpo(1, 0);
                }
            }
        });
        this.f21330yd = xykVarJpo;
        xykVarJpo.qk(this.zz).my(com.bytedance.sdk.openadsdk.common.jd.jpo(sq.jpo())).jd(com.bytedance.sdk.openadsdk.common.jd.my()).jpo(com.bytedance.sdk.openadsdk.common.jd.jpo()).cm(com.bytedance.sdk.openadsdk.common.jd.cm()).wqx(jSONObject).wqx(rv.zz(this.wqx)).cm(true).jpo(z10).wqx(false).jpo(rv.hna(this.wqx)).jd(rv.hna(this.wqx)).jpo("sdkEdition", com.bytedance.sdk.openadsdk.common.jd.wqx()).my(rv.jj(this.wqx)).jj(this.xyk);
        this.f21330yd.jpo(my.jd(this.f21322jd));
        Set<String> setJu = this.f21330yd.ju();
        final WeakReference weakReference = new WeakReference(this.f21330yd);
        for (String str : setJu) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (prrVarJd = this.f21326qk.jd()) != null) {
                prrVarJd.jpo(str, new com.bytedance.sdk.component.jpo.cm<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.4
                    @Override // com.bytedance.sdk.component.jpo.cm
                    public JSONObject jpo(String str2, JSONObject jSONObject2, com.bytedance.sdk.component.jpo.my myVar) {
                        try {
                            xyk xykVar = (xyk) weakReference.get();
                            if (xykVar == null) {
                                return null;
                            }
                            return xykVar.cm(jpo(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void xyk() {
        this.jpo.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.my(sq.jpo(), this.f21326qk, this.wqx.fc(), null, true) { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) throws JSONException {
                super.onPageFinished(webView, str);
                if (jpo.this.f21330yd != null) {
                    jpo.this.f21330yd.zz(str);
                }
                if (jpo.this.f157if) {
                    jpo.this.jpo(0, 0);
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), jpo.this.wqx, jpo.this.xyk, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                jpo.this.f157if = false;
                if (jpo.this.f21330yd != null) {
                    jpo.this.f21330yd.jj(com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpo.this.wqx));
                    jpo.this.f21330yd.jpo(i10, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    jpo.this.f157if = false;
                    if (jpo.this.f21330yd != null) {
                        jpo.this.f21330yd.jj(com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpo.this.wqx));
                        jpo.this.f21330yd.jpo(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (jpo.this.wqx.ww() != null && !TextUtils.isEmpty(jpo.this.wqx.ww().au())) {
                        if (jpo.this.f21330yd != null) {
                            jpo.this.f21330yd.yd(str);
                        }
                        String strJu = rv.ju(jpo.this.wqx);
                        WebResourceResponse webResourceResponseJpo = com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpo.this.wqx.ww().au(), strJu, str);
                        if (webResourceResponseJpo == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (jpo.this.f21330yd != null) {
                            jpo.this.f21330yd.ju(str);
                        }
                        return webResourceResponseJpo;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    jpo.this.f157if = false;
                    if (jpo.this.f21330yd == null || webResourceError == null) {
                        return;
                    }
                    jpo.this.f21330yd.jj(com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(jpo.this.wqx));
                    jpo.this.f21330yd.jpo(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.jpo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.f21326qk) { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (jpo.this.f21323jj == null || jpo.this.f21323jj.getVisibility() != 0) {
                    return;
                }
                jpo.this.f21323jj.setProgress(i10);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this.f21322jd).jpo(false).jd(false).jpo(this.jpo.getWebView());
        jj jjVar = this.jpo;
        jjVar.setUserAgentString(jr.jpo(jjVar.getWebView(), BuildConfig.VERSION_CODE));
        this.jpo.setMixedContentMode(0);
    }

    public void cm() {
        xyk xykVar = this.f21330yd;
        if (xykVar != null) {
            xykVar.duq();
        }
        jj jjVar = this.jpo;
        if (jjVar != null) {
            jjVar.hna();
        }
        ef efVar = this.f21326qk;
        if (efVar != null) {
            efVar.m457if();
        }
        this.jpo = null;
    }

    public void jd() {
        if (!this.prr.get() || this.f21330yd == null) {
            return;
        }
        nmd.jpo("PlayableManager", "onResume() called");
        this.f21330yd.wqx(true);
    }

    public boolean jj() {
        ef efVar = this.f21326qk;
        if (efVar != null) {
            return efVar.jj();
        }
        return false;
    }

    public boolean my() {
        return this.f21320au;
    }

    public ef qk() {
        return this.f21326qk;
    }

    public jpo(Context context, dt dtVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11, int i11) throws JSONException {
        this.f157if = true;
        this.prr = new AtomicBoolean(false);
        this.hna = new AtomicBoolean(false);
        this.f21329tu = 0;
        this.f21322jd = context;
        this.wqx = dtVar;
        this.f21327rq = i11;
        if (dtVar != null && dtVar.cm() != null && dtVar.cm().cm() != null) {
            this.f21329tu = dtVar.cm().cm().size();
        }
        this.f21321cm = i10;
        String strWqx = tic.wqx(dtVar.gmx().getDurationSlotType());
        this.xyk = strWqx;
        int iJpo = tic.jpo(strWqx);
        this.nmd = z11;
        if (z11) {
            this.xyk = tic.jd(iJpo);
        }
        this.zz = rv.ju(dtVar);
        this.my = frameLayout;
        jpo(frameLayout);
        jpo(iJpo);
        wqx(z10);
        xyk();
    }

    private void jpo(FrameLayout frameLayout) {
        jj jjVar = new jj(this.f21322jd);
        this.jpo = jjVar;
        jjVar.my();
        this.jpo.setLayerType(2, null);
        this.jpo.setVisibility(4);
        this.jpo.setBackgroundColor(-16777216);
        this.jpo.setEnabled(true);
        this.jpo.setTag(this.xyk);
        this.jpo.setMaterialMeta(this.wqx.eye());
        this.jpo.setLandingPage(true);
        frameLayout.addView(this.jpo, new FrameLayout.LayoutParams(-1, -1));
        zz zzVar = new zz(this.f21322jd);
        this.f21328sq = zzVar;
        zzVar.jpo(this.wqx, this.xyk, this.opi, this.nmd);
        frameLayout.addView(this.f21328sq, new FrameLayout.LayoutParams(-1, -1));
        if (this.wqx.cyx()) {
            yd ydVar = new yd(this.f21322jd);
            this.f21323jj = ydVar;
            ydVar.jd();
            frameLayout.addView(this.f21323jj, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void jd(boolean z10) {
        xyk xykVar = this.f21330yd;
        if (xykVar != null) {
            xykVar.my(z10);
        }
    }

    private void jpo(int i10) throws JSONException {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.f21326qk = new ef(this.f21322jd);
        String strSd = this.wqx.sd();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.wqx.va());
            jSONObject.put("currentIndex", this.f21327rq);
            jSONObject.put("totalAdCount", this.f21329tu);
        } catch (JSONException unused) {
        }
        this.f21326qk.jd(this.jpo).jpo(this.wqx).jpo(com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(this.wqx, true, jSONObject)).wqx(this.wqx.fc()).cm(this.wqx.fxd()).jd(i10).my(strSd).jpo(this.jpo).jd(this.xyk).jpo(map).jpo(new opi(3, this.xyk, this.wqx));
    }

    public void wqx() {
        if (!this.prr.get() || this.f21330yd == null) {
            return;
        }
        nmd.jpo("PlayableManager", "onPause() called");
        this.f21330yd.wqx(false);
    }

    public void jpo(boolean z10, com.bytedance.sdk.openadsdk.p001if.jj jjVar) {
        this.f21325ju = jjVar;
        this.f21330yd.jd(z10);
        com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jd(this.wqx);
        this.jpo.a_(this.zz);
        xyk xykVar = this.f21330yd;
        if (xykVar != null) {
            xykVar.jj(com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(this.wqx));
            this.f21330yd.xyk(this.zz);
        }
    }

    public void jpo() throws JSONException {
        yd ydVar;
        final boolean z10 = true;
        if (this.prr.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.my;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        nmd.jpo("PlayableManager", "showPlayable() called with: hasLoading = [false], loadingViewIsHide = [" + this.oya + C3191e4.i.f36531e);
        if (!this.oya && (ydVar = this.f21323jj) != null) {
            ydVar.jd(this.wqx, this.f21321cm);
            xyk xykVar = this.f21330yd;
            if (xykVar != null) {
                xykVar.uu();
            }
        } else {
            this.f21330yd.wqx(true);
            ef efVar = this.f21326qk;
            if (efVar != null && efVar.oya() != null) {
                this.f21326qk.oya().jj();
            }
            z10 = false;
        }
        if (this.f21330yd != null) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), this.wqx, this.xyk, "playable_track", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.7
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jpo() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", jpo.this.f21330yd.va());
                        jSONObject.put("has_loading", z10);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
            this.f21330yd.jj(com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(this.wqx));
        }
        this.jpo.setVisibility(0);
    }

    public void jpo(final int i10, final int i11) throws JSONException {
        xyk xykVar;
        InterfaceC0149jpo interfaceC0149jpo;
        if (this.oya) {
            return;
        }
        this.oya = true;
        nmd.jpo("PlayableManager", o2.i(i10, i11, "onHidePlayableLoading() called with: hideReason = [", "], errorDetail = [", C3191e4.i.f36531e));
        if (i10 == 2) {
            this.f21320au = true;
            this.f21330yd.jpo(3);
        } else if (i10 == 1) {
            this.f21320au = true;
            this.f21330yd.jpo(2);
        } else if (i10 == 3) {
            this.f21320au = true;
            this.f21330yd.jpo(4);
        } else if (i10 == 0) {
            this.f21330yd.jpo(1);
        }
        if (this.f21320au && (interfaceC0149jpo = this.f21324jr) != null) {
            interfaceC0149jpo.jpo();
        }
        if (this.prr.get() && (xykVar = this.f21330yd) != null) {
            xykVar.wqx(true);
        }
        ef efVar = this.f21326qk;
        if (efVar != null && efVar.oya() != null) {
            this.f21326qk.oya().jj();
        }
        yd ydVar = this.f21323jj;
        if (ydVar != null) {
            ydVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.8
                @Override // java.lang.Runnable
                public void run() {
                    if (jpo.this.f21320au) {
                        jpo.this.f21328sq.setVisibility(0);
                        jpo.this.jpo(true);
                    }
                    jpo.this.f21330yd.qk(jpo.this.f21320au);
                    jpo.this.f21323jj.wqx();
                    if (jpo.this.prr.get()) {
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), jpo.this.wqx, jpo.this.xyk, "playable_track", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.jpo.8.1
                            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                            public JSONObject jpo() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i10);
                                    jSONObject.put("remove_loading_page_reason", i11);
                                    jSONObject.put("playable_url", jpo.this.zz);
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jpo.this.f21323jj.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                            public JSONObject wqx() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }
                        });
                    }
                }
            });
        }
    }

    public void jpo(boolean z10) {
        xyk xykVar = this.f21330yd;
        if (xykVar != null) {
            xykVar.jpo(z10);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        this.opi = jpoVar;
        yd ydVar = this.f21323jj;
        if (ydVar != null && ydVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.jj.xyk downloadButton = this.f21323jj.getDownloadButton();
            downloadButton.setOnClickListener(jpoVar);
            downloadButton.setOnTouchListener(jpoVar);
        }
        zz zzVar = this.f21328sq;
        if (zzVar != null) {
            zzVar.setClickListener(jpoVar);
        }
    }

    public void jpo(InterfaceC0149jpo interfaceC0149jpo) {
        this.f21324jr = interfaceC0149jpo;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        ef efVar = this.f21326qk;
        if (efVar != null) {
            efVar.jpo(jdVar);
        }
    }
}
