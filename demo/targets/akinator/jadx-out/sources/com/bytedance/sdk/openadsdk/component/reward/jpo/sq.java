package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.tic;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.va;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class sq implements com.bytedance.sdk.openadsdk.p001if.xyk {

    /* renamed from: cm, reason: collision with root package name */
    private ImageView f19967cm;

    /* renamed from: jd, reason: collision with root package name */
    private final dt f19968jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wqx.qk f19969jj;
    private final Activity jpo;
    private boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private final AtomicBoolean f19970qk = new AtomicBoolean(false);
    private com.bytedance.sdk.component.zz.jj wqx;
    private volatile boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f19971yd;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo zz;

    public sq(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.zz = jpoVar;
        this.f19968jd = jpoVar.f19914jd;
        this.jpo = jpoVar.vrc;
    }

    private void cm() {
        this.wqx.my();
        jpo(this.wqx);
        this.wqx.setDisplayZoomControls(false);
        this.wqx.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.sq.3
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (i10 == 100) {
                    sq.this.wqx();
                }
            }
        });
        this.wqx.setWebViewClient(new jj.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.sq.4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                sq.this.wqx();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    sq.this.jpo(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (sq.this.jpo(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        jpo(Integer.MAX_VALUE, (String) null);
    }

    public void jd() {
        DeviceUtils.AudioInfoReceiver.jd(this);
        com.bytedance.sdk.component.zz.jj jjVar = this.wqx;
        if (jjVar != null) {
            tic.jpo(jjVar.getWebView());
        }
    }

    public void jpo() {
        DeviceUtils.AudioInfoReceiver.jpo(this);
        this.f19971yd = DeviceUtils.qk();
        if (this.f19968jd.zuz() != null) {
            this.f19969jj = new com.bytedance.sdk.openadsdk.core.wqx.qk("VAST_END_CARD", this.f19968jd.zuz()) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.sq.1
            };
            com.bytedance.sdk.openadsdk.core.p000if.wqx wqxVarWqx = this.f19968jd.zuz().wqx();
            if (wqxVarWqx != null) {
                String strMy = wqxVarWqx.my();
                if (!TextUtils.isEmpty(strMy)) {
                    this.my = true;
                    this.f19967cm = (ImageView) this.zz.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.xyk);
                    jpo(wqxVarWqx.jd(), wqxVarWqx.wqx());
                    com.bytedance.sdk.openadsdk.zz.cm.jpo(strMy).jpo(wqxVarWqx.jd()).jd(wqxVarWqx.wqx()).my(va.my(com.bytedance.sdk.openadsdk.core.sq.jpo())).cm(va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo())).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(this.f19968jd, strMy, new jpo(this.f19967cm, strMy, this, this.f19970qk)));
                    return;
                }
                com.bytedance.sdk.component.zz.jj jjVar = (com.bytedance.sdk.component.zz.jj) this.zz.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.zz);
                this.wqx = jjVar;
                if (jjVar == null) {
                    return;
                }
                cm();
                String strCm = wqxVarWqx.cm();
                if (strCm != null) {
                    this.my = true;
                    if (strCm.startsWith("http")) {
                        this.wqx.a_(strCm);
                        return;
                    }
                    String strJpo = com.bytedance.sdk.openadsdk.core.p000if.my.jpo(strCm);
                    String str = TextUtils.isEmpty(strJpo) ? strCm : strJpo;
                    this.wqx.setDefaultTextEncodingName("UTF -8");
                    this.wqx.jpo(null, str, "text/html", RnJusJ.CSgyn, null);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p001if.xyk
    public void jd(int i10) {
        int i11 = this.f19971yd;
        if (i11 == 0 && i10 > 0) {
            this.f19968jd.zuz().jpo().zz(this.zz.hmu.m442if());
        } else if (i11 > 0 && i10 == 0) {
            this.f19968jd.zuz().jpo().xyk(this.zz.hmu.m442if());
        }
        this.f19971yd = i10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements com.bytedance.sdk.component.my.hna {

        /* renamed from: cm, reason: collision with root package name */
        private final AtomicBoolean f19973cm;

        /* renamed from: jd, reason: collision with root package name */
        private final String f19974jd;
        private final WeakReference<ImageView> jpo;
        private final WeakReference<sq> wqx;

        public jpo(ImageView imageView, String str, sq sqVar, AtomicBoolean atomicBoolean) {
            this.jpo = new WeakReference<>(imageView);
            this.f19974jd = str;
            this.wqx = new WeakReference<>(sqVar);
            this.f19973cm = atomicBoolean;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            sq sqVar;
            ImageView imageView = this.jpo.get();
            if (imageView == null || (sqVar = this.wqx.get()) == null || juVar == null) {
                return;
            }
            Object objJd = juVar.jd();
            if (objJd == null) {
                sqVar.jpo(-1, this.f19974jd);
                return;
            }
            if (objJd instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objJd);
            } else if (objJd instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.d(objJd)) {
                    a.b(objJd).start();
                }
                imageView.setImageDrawable((Drawable) objJd);
            }
            this.f19973cm.set(true);
            sqVar.wqx();
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
            sq sqVar;
            ImageView imageView = this.jpo.get();
            if (imageView == null || (sqVar = this.wqx.get()) == null) {
                return;
            }
            imageView.setVisibility(8);
            sqVar.jpo(-2, this.f19974jd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final int i10, final String str) {
        if (this.xyk) {
            return;
        }
        this.xyk = true;
        if (i10 == Integer.MAX_VALUE) {
            dt dtVar = this.f19968jd;
            com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, dtVar.my(), "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.sq.2
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i10);
                        jSONObject.put("error_code", i10);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.cm.wqx.jd(sq.this.f19968jd, sq.this.f19968jd.my(), "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        jjVar.setVerticalScrollBarEnabled(false);
        jjVar.setHorizontalScrollBarEnabled(false);
        jjVar.setMixedContentMode(0);
        jjVar.setJavaScriptEnabled(true);
        jjVar.setJavaScriptCanOpenWindowsAutomatically(true);
        jjVar.setDomStorageEnabled(true);
        jjVar.setDatabaseEnabled(true);
        jjVar.setCacheMode(-1);
        jjVar.setAllowFileAccess(false);
        jjVar.setSupportZoom(true);
        jjVar.setBuiltInZoomControls(true);
        jjVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        jjVar.setUseWideViewPort(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(String str) {
        dt dtVar;
        if (str == null || (dtVar = this.f19968jd) == null || dtVar.zuz() == null || this.f19969jj == null) {
            return false;
        }
        this.f19968jd.zuz().jj(str);
        this.f19969jj.onClick(this.wqx);
        return true;
    }

    private void jpo(int i10, int i11) {
        if (i10 == 0 || i11 == 0 || this.f19967cm == null) {
            return;
        }
        int iWqx = va.wqx((Context) this.jpo);
        int iMy = va.my(this.jpo);
        if (i10 / i11 <= iWqx / iMy) {
            iWqx = (int) Math.ceil(r5 * r4);
        } else {
            iMy = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f19967cm.getLayoutParams();
        layoutParams.width = iWqx;
        layoutParams.height = iMy;
        layoutParams.gravity = 17;
        this.f19967cm.setLayoutParams(layoutParams);
        this.f19967cm.setOnClickListener(this.f19969jj);
        this.f19967cm.setOnTouchListener(this.f19969jj);
    }

    public boolean jpo(prr prrVar) {
        com.bytedance.sdk.openadsdk.core.p000if.wqx wqxVarWqx;
        if (!this.my) {
            return false;
        }
        if (this.f19967cm != null && this.f19970qk.get()) {
            this.f19967cm.setVisibility(0);
        } else {
            com.bytedance.sdk.component.zz.jj jjVar = this.wqx;
            if (jjVar != null) {
                jjVar.setVisibility(0);
                if (this.wqx.getWebView() != null) {
                    this.wqx.getWebView().setOnTouchListener(this.f19969jj);
                }
            }
        }
        dt dtVar = this.f19968jd;
        if (dtVar == null || dtVar.zuz() == null || (wqxVarWqx = this.f19968jd.zuz().wqx()) == null) {
            return true;
        }
        wqxVarWqx.jd(prrVar != null ? prrVar.m442if() : -1L);
        return true;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.my myVar) {
        com.bytedance.sdk.openadsdk.core.wqx.qk qkVar = this.f19969jj;
        if (qkVar != null) {
            qkVar.jpo(myVar);
        }
    }
}
