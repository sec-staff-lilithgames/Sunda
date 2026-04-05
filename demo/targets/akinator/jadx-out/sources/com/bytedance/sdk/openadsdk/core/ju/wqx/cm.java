package com.bytedance.sdk.openadsdk.core.ju.wqx;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.jd.ju;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.sq;
import com.bytedance.sdk.openadsdk.core.widget.jpo.my;
import com.bytedance.sdk.openadsdk.core.zz.prr;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.vrc;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements ju, wqx<jj> {

    /* renamed from: cm, reason: collision with root package name */
    private ef f20559cm;

    /* renamed from: jd, reason: collision with root package name */
    private dt f20560jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ju.wqx.jpo f20561jj;
    private Context jpo;
    private String my;

    /* renamed from: qk, reason: collision with root package name */
    private int f20562qk;
    private jj wqx;
    private final boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private jpo f20563yd;
    private boolean zz = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void qk();

        void xyk();
    }

    public cm(Context context, dt dtVar, boolean z10) {
        this.f20562qk = 1;
        this.jpo = context;
        this.f20560jd = dtVar;
        this.f20562qk = dtVar.ll();
        this.xyk = z10;
        if (z10) {
            this.my = sq.jd(this.f20560jd).jpo(this.f20562qk == 1);
        } else {
            this.my = sq.wqx(this.f20560jd).jpo(this.f20562qk == 1);
        }
    }

    private void qk() {
        cm cmVar;
        this.wqx.setBackgroundColor(0);
        this.wqx.setBackgroundResource(R.color.transparent);
        this.wqx.setVisibility(8);
        jpo(this.wqx);
        if (this.f20560jd != null) {
            cmVar = this;
            this.wqx.setWebViewClient(new my(this.jpo, this.f20559cm, this.f20560jd.fc(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.ju.wqx.cm.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (cm.this.f20563yd != null) {
                        cm.this.f20563yd.qk();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (cm.this.f20563yd != null) {
                        cm.this.f20563yd.xyk();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i10, String str, String str2) {
                    super.onReceivedError(webView, i10, str, str2);
                    if (cm.this.f20563yd != null) {
                        cm.this.f20563yd.xyk();
                    }
                }
            });
        } else {
            cmVar = this;
        }
        com.bytedance.sdk.component.adexpress.my.my.jpo().jpo(cmVar.wqx, cmVar.f20559cm);
        cmVar.wqx.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(cmVar.f20559cm));
    }

    private void xyk() {
        ef efVar = new ef(this.jpo);
        this.f20559cm = efVar;
        efVar.jd(this.wqx).jpo(this.f20560jd).wqx(this.f20560jd.fc()).cm(this.f20560jd.fxd()).my(this.f20560jd.sd()).jpo(com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(0.0f, 0.0f, false, this.f20560jd, null, null)).jpo(this).jpo(this.wqx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    public void jd() {
        if (TextUtils.isEmpty(this.my)) {
            this.wqx.setVisibility(8);
        } else {
            this.wqx.a_(this.my);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    /* renamed from: jj, reason: merged with bridge method [inline-methods] */
    public jj cm() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(oya oyaVar) {
    }

    public ef my() {
        return this.f20559cm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    public void wqx() {
        ef efVar = this.f20559cm;
        if (efVar != null) {
            efVar.wqx();
        }
        this.f20559cm = null;
        try {
            jj jjVar = this.wqx;
            if (jjVar != null) {
                ViewGroup viewGroup = (ViewGroup) jjVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.wqx);
                }
                this.wqx.hna();
            }
        } catch (Throwable unused) {
        }
        if (this.f20563yd != null) {
            this.f20563yd = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    public void jpo() {
        this.wqx = new jj(this.jpo);
        qk();
        xyk();
        if (this.xyk) {
            return;
        }
        vrc.jpo(this.wqx, false, this.f20560jd.jp(), false, new vrc.jd() { // from class: com.bytedance.sdk.openadsdk.core.ju.wqx.cm.1
            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jd() {
                cm.this.jpo(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo(View view, boolean z10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo(boolean z10) {
                cm.this.jpo(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.vrc.jd
            public void jpo() {
                cm.this.jpo(true);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    public void jpo(com.bytedance.sdk.openadsdk.core.ju.wqx.jpo jpoVar) {
        this.f20561jj = jpoVar;
    }

    private void jpo(jj jjVar) {
        if (jjVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this.jpo).jpo(false).jpo(jjVar.getWebView());
            jjVar.setVerticalScrollBarEnabled(false);
            jjVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(jjVar);
            jjVar.oya();
            jjVar.setUserAgentString(jr.jpo(jjVar.getWebView(), BuildConfig.VERSION_CODE));
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
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.wqx
    public void jpo(prr prrVar) {
        ef efVar = this.f20559cm;
        if (efVar != null) {
            efVar.jpo(prrVar);
        }
    }

    public void jpo(boolean z10) {
        if (z10 == this.zz) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z10 ? 1 : 0);
        } catch (Exception e10) {
            e10.getMessage();
        }
        this.f20559cm.jpo("visibleStateChange", jSONObject);
        this.zz = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        com.bytedance.sdk.openadsdk.core.ju.wqx.jpo jpoVar = this.f20561jj;
        if (jpoVar != null) {
            jpoVar.jpo(view, i10, wqxVar);
        }
    }

    public void jpo(jpo jpoVar) {
        this.f20563yd = jpoVar;
    }
}
