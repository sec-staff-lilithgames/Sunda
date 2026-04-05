package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.duq;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm implements hx.jpo {

    /* renamed from: au, reason: collision with root package name */
    private int f19711au;

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.sdk.component.zz.jj f19712cm;
    private boolean hna;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f19713jd;
    private final dt jpo;

    /* renamed from: jr, reason: collision with root package name */
    private int f19715jr;
    private wqx my;
    private String nmd;
    private boolean oya;
    private long prr;
    private WebView wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private long f19719yd;
    private int zz;

    /* renamed from: jj, reason: collision with root package name */
    private String f19714jj = "landingpage";

    /* renamed from: qk, reason: collision with root package name */
    private final Handler f19717qk = new hx(com.bytedance.sdk.openadsdk.core.oya.jd().getLooper(), this);

    /* renamed from: ju, reason: collision with root package name */
    private final AtomicBoolean f19716ju = new AtomicBoolean(false);

    /* renamed from: if, reason: not valid java name */
    private Pattern f101if = null;
    private long opi = -1;

    /* renamed from: sq, reason: collision with root package name */
    private final List<Integer> f19718sq = new ArrayList();

    public cm(dt dtVar, com.bytedance.sdk.component.zz.jj jjVar, String str, boolean z10) {
        this.jpo = dtVar;
        this.f19712cm = jjVar;
        this.f19713jd = z10;
        jd();
    }

    private void cm() {
        Handler handler = this.f19717qk;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void jd() {
        com.bytedance.sdk.component.zz.jj jjVar = this.f19712cm;
        if (jjVar != null) {
            this.wqx = jjVar.getWebView();
            View arbitrageLoadingView = this.f19712cm.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof wqx) {
                this.my = (wqx) arbitrageLoadingView;
            }
        }
        this.zz = com.bytedance.sdk.openadsdk.core.settings.au.jrx().sg();
        this.xyk = com.bytedance.sdk.openadsdk.core.settings.au.jrx().gmx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jj() {
        return qk() > 0 && !this.f19716ju.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        this.oya = false;
        if (this.f19716ju.getAndSet(true)) {
            return;
        }
        this.f19719yd = SystemClock.elapsedRealtime();
        this.prr = System.currentTimeMillis();
        xyk();
        if (this.my == null) {
            return;
        }
        WebView webView = this.wqx;
        if (webView != null) {
            this.nmd = webView.getUrl();
        }
        this.my.setVisibility(0);
        this.my.jpo(this.jpo);
        this.my.jpo();
        this.my.setAlpha(this.xyk);
        this.my.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.cm.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        cm();
        wqx();
    }

    private int qk() {
        try {
            return this.wqx.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void xyk() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.opi);
            jSONObject.put("loading_show_timestamp", this.prr);
            WebView webView = this.wqx;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.jpo, this.f19714jj, jSONObject);
    }

    public void wqx(WebView webView, String str, boolean z10) {
        this.f19718sq.clear();
        this.hna = z10;
        if (z10) {
            this.oya = true;
        }
        this.f19715jr = qk();
    }

    public void jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19714jj = str;
    }

    public void jpo(WebView webView, String str, boolean z10) {
        if (z10 && jj()) {
            jpo();
        }
    }

    private void wqx() {
        Handler handler = this.f19717qk;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.zz);
        }
    }

    public void jpo(WebView webView, String str) {
        dt dtVar = this.jpo;
        if (dtVar == null || !com.bytedance.sdk.component.zz.jd.jpo(dtVar.rq().wqx(), str)) {
            return;
        }
        this.f19711au++;
        com.bytedance.sdk.component.utils.zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cm.1
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.jj()) {
                    cm.this.jpo();
                }
            }
        });
    }

    public void jd(WebView webView, String str, boolean z10) {
        if (!z10 || this.my == null) {
            return;
        }
        jpo(1);
    }

    public void jpo(WebView webView, int i10) {
        wqx wqxVar = this.my;
        if (wqxVar != null) {
            wqxVar.jpo(i10);
        }
        if (this.hna) {
            if (jpo(i10, 30)) {
                jpo(30, webView);
            }
            if (jpo(i10, 50)) {
                jpo(50, webView);
            }
            if (jpo(i10, 70)) {
                jpo(70, webView);
            }
        }
        if (this.my == null || i10 != 100) {
            return;
        }
        jpo(1);
    }

    public void jpo() {
        if (duq.jj()) {
            my();
        } else {
            com.bytedance.sdk.component.utils.zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cm.2
                @Override // java.lang.Runnable
                public void run() {
                    cm.this.my();
                }
            });
        }
    }

    private void jpo(final int i10) {
        WebView webView = this.wqx;
        if (webView != null && i10 == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.nmd)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.cm.4
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.my != null) {
                    cm.this.f19716ju.set(false);
                    cm.this.my.jpo(cm.this.jpo, cm.this.f19714jj, i10, cm.this.nmd, cm.this.f19719yd, cm.this.oya, cm.this.f19711au, cm.this.prr);
                    cm.this.f19711au = 0;
                }
            }
        });
        cm();
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what == 1) {
            jpo(0);
        }
    }

    public void jpo(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.opi = SystemClock.elapsedRealtime();
        }
    }

    private boolean jpo(int i10, int i11) {
        if (i10 < i11 || this.f19718sq.contains(Integer.valueOf(i11)) || this.f19715jr < 2) {
            return false;
        }
        this.f19718sq.add(Integer.valueOf(i11));
        return true;
    }

    private void jpo(int i10, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UeklptUrP.HYYlrwcnArdFMM, i10);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.jpo, this.f19714jj, jSONObject);
    }
}
