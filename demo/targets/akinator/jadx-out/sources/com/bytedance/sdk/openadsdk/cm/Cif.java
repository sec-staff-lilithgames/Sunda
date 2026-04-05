package com.bytedance.sdk.openadsdk.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.jr;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.cm.if, reason: invalid class name */
/* loaded from: classes2.dex */
public class Cif {
    private static final int[] wqx = {10, 30, 50, 75, 100};

    /* renamed from: au, reason: collision with root package name */
    private String f19491au;
    private long cgn;

    /* renamed from: cm, reason: collision with root package name */
    private int f19492cm;

    /* renamed from: dm, reason: collision with root package name */
    private boolean f19493dm;

    /* renamed from: dn, reason: collision with root package name */
    private volatile long f19494dn;

    /* renamed from: dt, reason: collision with root package name */
    private long f19495dt;
    private WeakReference<WebView> duq;

    /* renamed from: ef, reason: collision with root package name */
    private final boolean f19496ef;
    private volatile int fy;
    private final AtomicBoolean hks;
    private int hmu;
    private com.bytedance.sdk.openadsdk.core.widget.jpo.jj hna;
    private int huv;

    /* renamed from: hx, reason: collision with root package name */
    private long f19497hx;

    /* renamed from: ic, reason: collision with root package name */
    private final AtomicBoolean f19498ic;

    /* renamed from: if, reason: not valid java name */
    private boolean f97if;

    /* renamed from: jd, reason: collision with root package name */
    AtomicBoolean f19499jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f19500jj;
    private String jkt;
    public jj.jpo jpo;

    /* renamed from: jr, reason: collision with root package name */
    private zz f19501jr;

    /* renamed from: ju, reason: collision with root package name */
    private int f19502ju;
    private boolean kln;
    private long my;
    private boolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    private final dt f19503nq;
    private final AtomicInteger nzb;
    private com.bytedance.sdk.openadsdk.nmd.xyk opi;
    private String oya;
    private long pdm;

    /* renamed from: pe, reason: collision with root package name */
    private final AtomicInteger f19504pe;
    private final Context prr;

    /* renamed from: qk, reason: collision with root package name */
    private final AtomicBoolean f19505qk;
    private volatile long roc;

    /* renamed from: rq, reason: collision with root package name */
    private int f19506rq;

    /* renamed from: rv, reason: collision with root package name */
    private long f19507rv;
    private String rxq;
    private final AtomicBoolean sbx;

    /* renamed from: se, reason: collision with root package name */
    private String f19508se;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f19509sq;
    private long sz;
    private com.bytedance.sdk.openadsdk.cm.cm.my tic;

    /* renamed from: tu, reason: collision with root package name */
    private long f19510tu;

    /* renamed from: uu, reason: collision with root package name */
    private long f19511uu;

    /* renamed from: va, reason: collision with root package name */
    private boolean f19512va;
    private ju vrc;
    private volatile long wcn;
    private final AtomicInteger xk;
    private final AtomicBoolean xyk;

    /* renamed from: ya, reason: collision with root package name */
    private volatile long f19513ya;

    /* renamed from: yd, reason: collision with root package name */
    private final AtomicBoolean f19514yd;
    private final AtomicBoolean zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.cm.if$jpo */
    /* loaded from: classes4.dex */
    public class jpo {
        private jpo() {
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i10 = 0;
            try {
                int iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    i10 = 100;
                } else if (iIntValue >= 0) {
                    i10 = iIntValue;
                }
            } catch (Throwable unused) {
            }
            Cif.this.nzb.set(i10);
        }
    }

    public Cif(dt dtVar, WebView webView, ju juVar, int i10) {
        this(dtVar, webView);
        this.vrc = juVar;
        this.huv = i10;
    }

    private int yd() {
        WeakReference<WebView> weakReference = this.duq;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    private boolean zz() {
        dt dtVar;
        return this.f19512va && (dtVar = this.f19503nq) != null && dtVar.pdm();
    }

    public void jj() {
        if (zz() && this.wcn > 0 && this.f19494dn > 0 && !this.sbx.getAndSet(true)) {
            wqx.jd(this.f19494dn - this.wcn, this.f19503nq, this.jkt, (String) null);
        }
    }

    public void xyk() {
        if (("landingpage".equals(this.f19508se) || "landingpage_endcard".equals(this.f19508se) || "landingpage_split_screen".equals(this.f19508se) || "landingpage_direct".equals(this.f19508se) || "aggregate_page".equals(this.f19508se) || "landingpage_split_ceiling".equals(this.f19508se)) && this.f19500jj == 2) {
            if (this.pdm > 0 || !wqx()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.f19497hx, this.pdm);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f19500jj);
                    jSONObject.put("max_scroll_percent", this.nzb.get());
                    jSONObject.put("jump_times", this.f19504pe.getAndSet(0));
                    jSONObject.put("click_times", this.xk.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.f19514yd.set(true);
                jpo("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("landingPause", this.f19503nq, this.rxq);
            }
        }
    }

    public void cm() {
        if (zz()) {
            this.f19513ya = SystemClock.elapsedRealtime();
            wqx.jpo(this.f19503nq, this.jkt);
        }
    }

    public com.bytedance.sdk.openadsdk.cm.cm.my jd() {
        return this.tic;
    }

    public void my() {
        if (zz()) {
            this.wcn = SystemClock.elapsedRealtime();
            jj();
        }
    }

    public void qk() {
        if (this.sz == 0) {
            this.sz = System.currentTimeMillis();
        }
        this.f19497hx = System.currentTimeMillis();
        if ("landingpage".equals(this.f19508se) || "landingpage_endcard".equals(this.f19508se) || "landingpage_split_screen".equals(this.f19508se) || "landingpage_direct".equals(this.f19508se) || duhsDlGWdBkekB.etPTdQPzMY.equals(this.f19508se)) {
            if (this.hks.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("landingStart", this.f19503nq, this.rxq);
            } else {
                com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("landingContinue", this.f19503nq, this.rxq);
            }
        }
        if (nmd.xyk(this.f19503nq) || nmd.jd(this.f19503nq)) {
            jpo(true, SystemClock.elapsedRealtime());
        }
    }

    public boolean wqx() {
        return this.f19512va;
    }

    public Cif jd(boolean z10) {
        this.f19493dm = z10;
        return this;
    }

    public void wqx(boolean z10) {
        this.f19512va = z10;
    }

    public Cif(dt dtVar, WebView webView) {
        this(dtVar, webView, false);
    }

    private String wqx(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.jkt = str;
    }

    public dt jpo() {
        return this.f19503nq;
    }

    public Cif(dt dtVar, WebView webView, boolean z10) {
        this.f19492cm = 0;
        this.my = -1L;
        this.f19500jj = 1;
        this.f19505qk = new AtomicBoolean(false);
        this.xyk = new AtomicBoolean(false);
        this.zz = new AtomicBoolean(false);
        this.f19514yd = new AtomicBoolean(false);
        this.f19502ju = -1;
        this.nmd = false;
        this.f19506rq = 0;
        this.f19499jd = new AtomicBoolean(false);
        this.f19508se = "landingpage";
        this.f19497hx = 0L;
        this.pdm = 0L;
        this.f19507rv = 0L;
        this.f19511uu = 0L;
        this.sz = 0L;
        this.kln = false;
        this.f19496ef = false;
        this.nzb = new AtomicInteger(0);
        this.f19493dm = false;
        this.f19512va = false;
        this.roc = 0L;
        this.f19504pe = new AtomicInteger(0);
        this.xk = new AtomicInteger(0);
        this.f19498ic = new AtomicBoolean(false);
        this.fy = 0;
        this.huv = -1;
        this.sbx = new AtomicBoolean(false);
        this.hks = new AtomicBoolean(false);
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        this.prr = contextJpo;
        this.f19503nq = dtVar;
        if (webView == null) {
            return;
        }
        this.nmd = z10;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.duq = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (dtVar != null && dtVar.sn()) {
            com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.jj(webView2, dtVar, contextJpo, this.nmd);
            this.hna = jjVar;
            this.jpo = jjVar.wqx();
        }
        if (dtVar != null && dtVar.zrw() && com.bytedance.sdk.openadsdk.core.settings.au.jrx().wu()) {
            this.f19501jr = new zz(dtVar, webView, this.nmd);
        }
        if (webView instanceof com.bytedance.sdk.component.zz.my) {
            this.cgn = ((com.bytedance.sdk.component.zz.my) webView2).jpo;
        } else {
            this.cgn = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new jpo(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("LandingPageLog", "addJavascriptInterface exception", e10);
        }
        if (dtVar != null && dtVar.eb() != null) {
            this.my = dtVar.eb().optLong("page_id", -1L);
        }
        this.rxq = String.valueOf(SystemClock.elapsedRealtime());
    }

    public void cm(boolean z10) {
        WeakReference<WebView> weakReference = this.duq;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.jpo("LandingPageLog", "removeJavascriptInterface exception", e10);
            }
        }
        if (this.xyk.compareAndSet(false, true)) {
            jpo(z10, "1");
            if (this.f19493dm) {
                wqx.jpo(this.f19503nq, this.f19508se, System.currentTimeMillis() - this.sz, this.huv, yd());
            }
        } else if (this.f19500jj == 2 && !this.f19514yd.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.f19500jj);
                jSONObject.put("max_scroll_percent", this.nzb.get());
                jSONObject.put("jump_times", this.f19504pe.getAndSet(0));
                jSONObject.put("click_times", this.xk.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            jpo("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.f19508se) || "landingpage_endcard".equals(this.f19508se) || "landingpage_split_screen".equals(this.f19508se) || "landingpage_direct".equals(this.f19508se) || "aggregate_page".equals(this.f19508se) || "landingpage_split_ceiling".equals(this.f19508se)) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("landingFinish", this.f19503nq, this.rxq);
        }
    }

    public void jpo(boolean z10) {
        if (z10) {
            this.f19506rq = 1;
        }
    }

    public void jd(WebView webView, String str, boolean z10) {
        zz zzVar = this.f19501jr;
        if (zzVar == null || !z10) {
            return;
        }
        zzVar.jpo(webView, str);
    }

    public void jpo(ju juVar) {
        this.vrc = juVar;
    }

    public void jpo(long j10) {
        this.pdm = j10;
    }

    public void jd(int i10) {
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar == null || !this.f19509sq) {
            return;
        }
        jjVar.jpo(i10);
    }

    public void jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar != null) {
            jjVar.jpo(str);
        }
        zz zzVar = this.f19501jr;
        if (zzVar != null) {
            zzVar.wqx(str);
        }
        this.f19508se = str;
    }

    public void jpo(int i10) {
        this.huv = i10;
    }

    public void jpo(com.bytedance.sdk.openadsdk.cm.cm.my myVar) {
        this.tic = myVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.nmd.xyk xykVar) {
        this.opi = xykVar;
    }

    public void jpo(WebView webView, int i10) throws JSONException {
        if (webView == null) {
            return;
        }
        if (this.roc == 0) {
            this.roc = SystemClock.elapsedRealtime();
        }
        if (this.f19507rv == 0 && i10 > 0) {
            this.f19507rv = System.currentTimeMillis();
        } else if (this.f19511uu == 0 && i10 == 100) {
            this.f19511uu = System.currentTimeMillis();
        }
        if (this.f19492cm != wqx.length && ("landingpage".equals(this.f19508se) || "landingpage_endcard".equals(this.f19508se) || "landingpage_split_screen".equals(this.f19508se) || "landingpage_direct".equals(this.f19508se) || "aggregate_page".equals(this.f19508se))) {
            int i11 = this.f19492cm;
            while (true) {
                int[] iArr = wqx;
                if (i11 >= iArr.length || i10 < iArr[this.f19492cm]) {
                    break;
                }
                int i12 = i11 + 1;
                this.f19492cm = i12;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j10 = this.my;
                    if (j10 != -1) {
                        jSONObject.put("page_id", j10);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i11]);
                } catch (Exception unused) {
                }
                jpo("progress_load_finish", jSONObject);
                i11 = i12;
            }
        }
        if (i10 == 100) {
            jpo(false, SystemClock.elapsedRealtime());
            jpo(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.f19511uu - this.f19507rv, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void jpo(String str, String str2, long j10) {
        if (this.zz.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i10 = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i10 = iIndexOf;
                    }
                    str = str.substring(0, i10);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            jpo("load_finish_progress", jSONObject, j10);
        }
    }

    public void jpo(WebView webView, String str, Bitmap bitmap, boolean z10, int i10) throws JSONException {
        this.f19509sq = z10;
        this.hmu++;
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar != null && z10) {
            jjVar.jd(str);
            this.hna.jd();
        }
        zz zzVar = this.f19501jr;
        if (zzVar != null && z10) {
            zzVar.jpo(str, i10);
        }
        WeakReference<WebView> weakReference = this.duq;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.fy) {
                    this.f19504pe.incrementAndGet();
                }
                this.fy = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.jpo("LandingPageLog", "copyBackForwardList exception", e10);
            }
        }
        if (this.roc == 0) {
            this.roc = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.my();
        }
        if (this.f19505qk.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i11 = this.huv;
                if (i11 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i11));
                }
            } catch (Exception unused) {
            }
            jpo("load_start", jSONObject);
        }
    }

    public void jpo(WebView webView, String str, boolean z10) throws JSONException {
        jpo(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar != null && z10) {
            jjVar.jpo();
        }
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.jj();
        }
        zz zzVar = this.f19501jr;
        if (zzVar != null && z10) {
            zzVar.jpo(str);
        }
        if (webView != null && !this.kln && this.f19493dm) {
            this.kln = true;
            com.bytedance.sdk.component.utils.oya.jpo(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.xyk.compareAndSet(false, true)) {
            if (this.f19500jj != 3) {
                this.f19500jj = 2;
            }
            this.f19497hx = System.currentTimeMillis();
            boolean z11 = this.f19500jj == 2;
            int iYd = yd();
            String str2 = OcvDtWCQ.SvnOQvI;
            if (z11) {
                long j10 = this.f19511uu - this.f19507rv;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(str2, this.f19502ju);
                    jSONObject.put("error_msg", this.f19491au);
                    jSONObject.put("error_url", this.oya);
                    int i10 = this.huv;
                    if (i10 >= 0) {
                        jSONObject.put("preload_status", i10);
                    }
                    jSONObject.put("first_page", iYd);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.f19503nq.iwg());
                    jSONObject.put("preload_h5_type", this.f19503nq.sz());
                } catch (Exception unused) {
                }
                jpo(z10, "0");
                long jMin = Math.min(j10, TTAdConstant.AD_MAX_EVENT_TIME);
                jpo("load_finish", jSONObject, jMin);
                if (zz()) {
                    this.f19494dn = SystemClock.elapsedRealtime();
                    jj();
                    wqx.jpo(this.f19503nq, this.jkt, this.f19494dn - this.f19513ya);
                }
                jpo(str, "load_finish", jMin);
                ju juVar = this.vrc;
                if (juVar != null) {
                    juVar.jpo(iYd);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(str2, this.f19502ju);
                jSONObject2.put("error_msg", this.f19491au);
                jSONObject2.put("error_url", this.oya);
                jSONObject2.put("first_page", iYd);
                int i11 = this.huv;
                if (i11 >= 0) {
                    jSONObject2.put("preload_status", i11);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.f19503nq.iwg());
                jSONObject2.put("preload_h5_type", this.f19503nq.sz());
            } catch (Exception unused2) {
            }
            jpo(z10, "2");
            jpo("load_fail", jSONObject2);
            if (zz()) {
                wqx.jpo(this.f19503nq, this.jkt, SystemClock.elapsedRealtime() - this.f19513ya, this.f19502ju, this.f19491au, this.oya);
            }
            if (this.f97if) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                jpo("load_fail_main", jSONObject2);
            }
        }
    }

    public void jpo(WebView webView, int i10, String str, String str2, String str3, boolean z10) {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.tic;
        if (myVar != null) {
            myVar.jpo((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.f19500jj != 2) {
            this.f19500jj = 3;
        }
        this.f19502ju = i10;
        this.f19491au = str;
        this.oya = str2;
        this.f97if = z10;
    }

    public void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        int iDn;
        Bitmap bitmapJpo;
        dt dtVar;
        if ((!"landingpage".equals(this.f19508se) && !"landingpage_endcard".equals(this.f19508se) && !"landingpage_split_screen".equals(this.f19508se) && !"landingpage_direct".equals(this.f19508se) && !"aggregate_page".equals(this.f19508se)) || (iDn = com.bytedance.sdk.openadsdk.core.sq.cm().dn()) == 0 || new Random().nextInt(100) + 1 > iDn || jjVar == null || jjVar.getWebView() == null || jjVar.getVisibility() != 0 || (bitmapJpo = va.jpo(jjVar)) == null || (dtVar = this.f19503nq) == null) {
            return;
        }
        va.jpo(dtVar, this.f19508se, "landing_page_blank", bitmapJpo, jjVar.getUrl(), this.my);
    }

    private void jpo(String str, JSONObject jSONObject) {
        jpo(str, jSONObject, -1L);
    }

    private void jpo(final String str, final JSONObject jSONObject, final long j10) {
        if (!this.f19493dm || this.f19503nq == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.nmd.xyk xykVar = this.opi;
        final int iDm = xykVar != null ? xykVar.dm() : -1;
        wqx.jpo(System.currentTimeMillis(), this.f19503nq, this.f19508se, str, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.if.1
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 > 0) {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j11);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                if (!com.bytedance.sdk.openadsdk.au.jpo.wqx(Cif.this.f19503nq)) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_lp_pre_render", Cif.this.f19506rq);
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() throws JSONException {
                if (jSONObject != null) {
                    try {
                        boolean zJd = rv.jd(Cif.this.f19503nq);
                        jSONObject.put("is_playable", zJd ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(Cif.this.f19503nq) ? 1 : 0);
                        if (zJd && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", iDm);
                        }
                        if ("stay_page".equals(str)) {
                            jSONObject.put("first_page", Cif.this.hmu > 1 ? 0 : 1);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String unused2 = Cif.this.f19508se;
                return jSONObject;
            }
        });
    }

    public void jpo(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar != null && this.f19509sq) {
            jjVar.jpo(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.roc != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.xk.incrementAndGet();
                if (this.f19498ic.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.f19503nq.iwg());
                } catch (JSONException unused) {
                }
                jpo("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.roc, 0L));
            }
        }
    }

    public void jpo(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.widget.jpo.jj jjVar = this.hna;
        if (jjVar != null && z10) {
            jjVar.wqx(str);
        }
        zz zzVar = this.f19501jr;
        if (zzVar == null || !z10) {
            return;
        }
        zzVar.jd(str);
    }

    private void jpo(boolean z10, final String str) {
        if (z10) {
            final int iYd = yd();
            wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.cm.if.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.qk qkVarTu = com.bytedance.sdk.openadsdk.core.sq.cm().tu();
                        boolean zJpo = Cif.this.jpo(qkVarTu, str);
                        if (zJpo) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.qk.f20882jd)) {
                                Cif.this.jpo(iYd, str);
                                return;
                            }
                            if (TextUtils.isEmpty(qkVarTu.wqx) || !zJpo) {
                                return;
                            }
                            String str2 = qkVarTu.wqx;
                            com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
                            jdVarWqx.jd(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            jdVarWqx.cm(map);
                            jdVarWqx.jpo(9);
                            jdVarWqx.jpo("sendPrefLog");
                            jdVarWqx.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.if.2.1
                                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.qk.f20882jd = jdVar.cm();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        Cif.this.jpo(iYd, str);
                                    } catch (Exception e10) {
                                        com.bytedance.sdk.component.utils.nmd.jpo("LandingPageLog", "TTWebViewClient : onPageFinished", e10);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.qk.f20882jd)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.qk.f20882jd);
            jSONObject.putOpt(BidResponsedEx.KEY_CID, jpo().fc());
            jSONObject.putOpt("ad_id", jpo().fc());
            jSONObject.put("log_extra", jpo().fxd());
            tic.jpo(sb2, "\"/** adInfo **/\"", jSONObject.toString());
            tic.jpo(sb2, "\"/** first_page **/\"", String.valueOf(i10));
            tic.jpo(sb2, "\"/** ix_to_externalurl **/\"", this.my != -1 ? "1" : "0");
            tic.jpo(sb2, "\"/** preload_status **/\"", this.huv == 2 ? "2" : "0");
            tic.jpo(sb2, "\"/** scene_state **/\"", str);
            tic.jpo(sb2, "\"/** web_init_time **/\"", String.valueOf(this.cgn));
            tic.jpo(sb2, "\"/** channel_name **/\"", "\"" + jpo().afh() + "\"");
            tic.jpo(sb2, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            tic.jpo(sb2, "\"/** web_url **/\"", "\"" + jpo().iwg() + "\"");
            String string = sb2.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strWqx = wqx(string);
            WeakReference<WebView> weakReference = this.duq;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strWqx) || webView == null) {
                return;
            }
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.cm.if.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.oya.jpo(webView, strWqx);
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(com.bytedance.sdk.openadsdk.core.settings.qk qkVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return qkVar.f20883cm;
            case "1":
                return qkVar.my;
            case "2":
                return qkVar.f20884jj;
            default:
                return false;
        }
    }

    public void jpo(boolean z10, long j10) {
        if (z10) {
            this.f19510tu = j10;
        } else {
            this.f19495dt = j10;
        }
        if (this.f19510tu <= 0 || this.f19495dt <= 0 || !this.f19509sq || !this.f19499jd.compareAndSet(false, true)) {
            return;
        }
        jpo(this.f19503nq, this.f19508se, this.f19495dt - this.f19510tu, this.f19506rq);
    }

    public static void jpo(final dt dtVar, final String str, final long j10, final int i10) {
        wqx.jpo(System.currentTimeMillis(), dtVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.cm.if.4
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jd() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i10);
                    jSONObject.put("meta_pre_render", dtVar.sbz() ? 1 : 0);
                    jr jrVarTu = dtVar.tu();
                    if (jrVarTu == null) {
                        jrVarTu = new jr();
                    }
                    jSONObject.put("pre_render_status", jrVarTu.wqx());
                    jSONObject.put("pre_render_use_gecko", jrVarTu.jd());
                    jSONObject.put("pre_render_add_type", jrVarTu.jpo());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
