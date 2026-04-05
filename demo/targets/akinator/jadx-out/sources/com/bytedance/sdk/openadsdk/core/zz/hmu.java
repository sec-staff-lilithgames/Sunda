package com.bytedance.sdk.openadsdk.core.zz;

import a.b;
import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nzb;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu extends com.bytedance.sdk.component.adexpress.my.jpo {

    /* renamed from: au, reason: collision with root package name */
    private String f21051au;
    private ef hna;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.cm.cm.my f147if;

    /* renamed from: jr, reason: collision with root package name */
    private volatile int f21052jr;

    /* renamed from: ju, reason: collision with root package name */
    private JSONObject f21053ju;
    private yd nmd;
    private dt.jpo opi;
    private Cif oya;
    private final Map<String, com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj> prr;

    /* renamed from: qk, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.utils.jpo f21054qk;

    /* renamed from: rq, reason: collision with root package name */
    private final com.bytedance.sdk.component.xyk.xyk f21055rq;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.qk f21056sq;

    /* renamed from: tu, reason: collision with root package name */
    private final Runnable f21057tu;
    private Context xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.dt f21058yd;
    private String zz;

    public hmu(Context context, com.bytedance.sdk.component.adexpress.jd.au auVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.cm.cm.my myVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        super(context, auVar, themeStatusBroadcastReceiver);
        this.prr = b.u();
        this.f21052jr = 0;
        this.f21055rq = new com.bytedance.sdk.component.xyk.xyk("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.zz.hmu.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.my.jpo) hmu.this).f18544jj.get()) {
                    return;
                }
                hmu hmuVar = hmu.this;
                hmuVar.f21053ju = hmuVar.ju().wqx();
                hmu hmuVar2 = hmu.this;
                hmuVar2.jpo(hmuVar2.f21053ju);
                if (hmu.this.f21052jr == 0) {
                    hmu.this.sq();
                }
                com.bytedance.sdk.openadsdk.core.oya.wqx().post(hmu.this.f21057tu);
            }
        };
        this.f21057tu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hmu.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.my.jpo) hmu.this).f18544jj.get() || hmu.this.f21056sq == null) {
                    return;
                }
                hmu.this.m483if();
                hmu hmuVar = hmu.this;
                hmu.super.jpo(hmuVar.f21056sq);
            }
        };
        if (this.f18542cm == null) {
            return;
        }
        this.xyk = context;
        this.zz = auVar.cm();
        this.f21058yd = dtVar;
        this.f147if = myVar;
        themeStatusBroadcastReceiver.jpo(this);
        sq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void opi() {
        com.bytedance.sdk.component.zz.jj jjVar = this.f18542cm;
        if (jjVar == null || jjVar.getWebView() == null || this.f21052jr == 2) {
            return;
        }
        this.f21051au = jpo(this.f21058yd);
        this.f18542cm.setDisplayZoomControls(false);
        jpo(nzb.jpo(this.f21051au));
        au();
        ef efVar = new ef(this.xyk);
        this.hna = efVar;
        efVar.wqx(true);
        oya();
        this.f21052jr = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq() {
        if (this.f18542cm.getWebView() == null || !duq.jj()) {
            this.f21052jr = 1;
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hmu.3
                @Override // java.lang.Runnable
                public void run() {
                    hmu.this.opi();
                }
            });
        } else {
            opi();
        }
        if (!oya.jd(this.f21058yd) || this.f18543jd) {
            return;
        }
        oya.jpo(this.f21058yd);
    }

    public void au() {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f21058yd;
        if (dtVar == null || dtVar.vzb() == null) {
            return;
        }
        this.opi = this.f21058yd.vzb();
    }

    public ef hna() {
        return this.hna;
    }

    /* renamed from: if, reason: not valid java name */
    public void m483if() {
        ef efVar;
        com.bytedance.sdk.component.zz.jj jjVar = this.f18542cm;
        if (jjVar == null || jjVar.getWebView() == null || (efVar = this.hna) == null) {
            return;
        }
        efVar.jd(this.f18542cm).jpo(this.f21058yd).wqx(this.f21058yd.fc()).cm(this.f21058yd.fxd()).jd(tic.jpo(this.zz)).my(this.f21058yd.sd()).jpo(this).jpo(this.f21053ju).jpo(this.f18542cm).jpo(this.f147if);
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.jpo
    public void onThemeChanged(int i10) throws JSONException {
        if (this.hna == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i10);
        } catch (JSONException unused) {
        }
        this.hna.jpo("themeChange", jSONObject);
    }

    public void oya() {
        com.bytedance.sdk.component.zz.jj jjVar = this.f18542cm;
        if (jjVar == null || jjVar.getWebView() == null) {
            return;
        }
        this.f18542cm.setBackgroundColor(0);
        this.f18542cm.setBackgroundResource(R.color.transparent);
        jpo(this.f18542cm);
        if (jpo() != null) {
            this.oya = new Cif(this.f21058yd, jpo().getWebView()).jd(false);
        }
        this.oya.jpo(this.f147if);
        yd ydVar = new yd(this.xyk, this.hna, this.f21058yd, this.oya, ju());
        this.nmd = ydVar;
        this.f18542cm.setWebViewClient(ydVar);
        this.f18542cm.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.hna, this.oya));
        com.bytedance.sdk.component.adexpress.my.my.jpo().jpo(this.f18542cm, this.hna);
    }

    public yd prr() {
        return this.nmd;
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void yd() {
        super.yd();
        com.bytedance.sdk.openadsdk.utils.jpo jpoVar = this.f21054qk;
        if (jpoVar != null) {
            jpoVar.jd(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void cm() {
        if (this.f18544jj.get()) {
            return;
        }
        super.cm();
        ef efVar = this.hna;
        if (efVar != null) {
            efVar.wqx();
            this.hna.m457if();
            this.hna = null;
        }
        Cif cif = this.oya;
        if (cif != null) {
            cif.cm(false);
        }
        com.bytedance.sdk.openadsdk.core.oya.wqx().removeCallbacks(this.f21057tu);
        this.prr.clear();
    }

    public void jd(int i10) {
        if (this.hna == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i10);
            this.hna.jpo("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.WebViewRender", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void jj() {
        if (jpo() == null) {
            return;
        }
        try {
            jpo().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void qk() {
        ef efVar = this.hna;
        if (efVar == null) {
            return;
        }
        efVar.jpo("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo, com.bytedance.sdk.component.adexpress.jd.cm
    public int wqx() {
        return this.f21058yd.tl();
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void xyk() throws JSONException {
        super.xyk();
        if (this.hna == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.hna.jpo("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void zz() {
        super.zz();
        com.bytedance.sdk.openadsdk.utils.jpo jpoVarMy = com.bytedance.sdk.openadsdk.core.prr.jpo().my();
        this.f21054qk = jpoVarMy;
        jpoVarMy.jpo(this);
    }

    public static String jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        return com.bytedance.sdk.component.adexpress.jpo.jd.jd.cm((dtVar == null || !dtVar.gf()) ? null : "v3");
    }

    private void jd(boolean z10) throws JSONException {
        if (this.hna == null || this.f18542cm == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z10);
            this.hna.jpo("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo, com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(com.bytedance.sdk.component.adexpress.jd.qk qkVar) {
        this.f21056sq = qkVar;
        duq.jd(this.f21055rq);
    }

    private void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this.xyk).jpo(false).jpo(jjVar.getWebView());
            jjVar.setVerticalScrollBarEnabled(false);
            jjVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(jjVar);
            jjVar.oya();
            jjVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.jr.jpo(jjVar.getWebView(), BuildConfig.VERSION_CODE));
            jjVar.setMixedContentMode(0);
            jjVar.setJavaScriptEnabled(true);
            jjVar.setJavaScriptCanOpenWindowsAutomatically(true);
            jjVar.setDomStorageEnabled(true);
            jjVar.setDatabaseEnabled(true);
            jjVar.setAllowFileAccess(false);
            jjVar.setSupportZoom(true);
            jjVar.setBuiltInZoomControls(true);
            jjVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            jjVar.setUseWideViewPort(true);
            jjVar.setCacheMode(-1);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.WebViewRender", e10.toString());
        }
    }

    public static boolean jd(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public com.bytedance.sdk.component.zz.jj jpo() {
        return this.f18542cm;
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo
    public void jpo(int i10) {
        if (i10 == this.my) {
            return;
        }
        this.my = i10;
        jd(i10 == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.my.jpo, com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        super.jpo(oyaVar);
        if (this.wqx) {
            com.bytedance.sdk.component.utils.zz.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.hmu.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.my.jpo) hmu.this).f18542cm.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        ef efVar = this.hna;
        if (efVar != null) {
            efVar.jpo(jdVar);
        }
    }
}
