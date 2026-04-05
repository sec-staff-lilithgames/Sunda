package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.MraidResizeCommand;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cm.Cif;
import com.bytedance.sdk.openadsdk.cm.opi;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.widget.jpo.jj;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.jr;
import com.bytedance.sdk.openadsdk.utils.rq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j1.o2;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements com.bytedance.sdk.openadsdk.p001if.xyk {

    /* renamed from: au, reason: collision with root package name */
    private int f19867au;
    private com.bytedance.sdk.openadsdk.common.cm cgn;

    /* renamed from: cm, reason: collision with root package name */
    Cif f19868cm;

    /* renamed from: dm, reason: collision with root package name */
    private boolean f19869dm;

    /* renamed from: dt, reason: collision with root package name */
    private float f19871dt;
    private boolean duq;

    /* renamed from: ef, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.jpo.my f19872ef;
    private String fy;
    private boolean hks;
    private long hmu;
    private ILoader huv;

    /* renamed from: if, reason: not valid java name */
    private final boolean f106if;
    private jj.jpo jkt;
    ef jpo;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f19878jr;

    /* renamed from: ju, reason: collision with root package name */
    private int f19879ju;
    private View nmd;
    private boolean opi;
    private int oya;
    private com.bytedance.sdk.component.zz.jj prr;

    /* renamed from: qk, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.cm.cm.my f19882qk;
    private long roc;

    /* renamed from: rq, reason: collision with root package name */
    private View f19883rq;

    /* renamed from: rv, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.au f19884rv;
    private boolean rxq;
    private boolean sbx;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo sz;
    private boolean tic;

    /* renamed from: tu, reason: collision with root package name */
    private float f19887tu;

    /* renamed from: uu, reason: collision with root package name */
    private boolean f19888uu;

    /* renamed from: va, reason: collision with root package name */
    private boolean f19889va;
    protected String wqx;
    private int xk;

    /* renamed from: yd, reason: collision with root package name */
    private final String f19891yd;

    /* renamed from: jd, reason: collision with root package name */
    protected boolean f19876jd = true;
    private boolean hna = false;

    /* renamed from: sq, reason: collision with root package name */
    private final AtomicBoolean f19886sq = new AtomicBoolean(true);
    int my = 0;

    /* renamed from: jj, reason: collision with root package name */
    String f19877jj = "";
    boolean xyk = false;

    /* renamed from: nq, reason: collision with root package name */
    private SparseArray<wqx.jpo> f19880nq = new SparseArray<>();

    /* renamed from: se, reason: collision with root package name */
    private boolean f19885se = true;

    /* renamed from: hx, reason: collision with root package name */
    private float f19874hx = -1.0f;
    private float pdm = -1.0f;
    private boolean kln = false;
    private long nzb = 0;
    private long vrc = -1;

    /* renamed from: pe, reason: collision with root package name */
    private volatile int f19881pe = 0;

    /* renamed from: ic, reason: collision with root package name */
    private int f19875ic = -1;

    /* renamed from: ya, reason: collision with root package name */
    private volatile int f19890ya = 0;
    private volatile int wcn = 0;

    /* renamed from: dn, reason: collision with root package name */
    private long f19870dn = 0;
    public boolean zz = false;

    /* renamed from: et, reason: collision with root package name */
    private int f19873et = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface cm {
        void jpo(WebView webView, int i10);

        void jpo(WebView webView, String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements com.bytedance.sdk.openadsdk.p001if.jpo {
        private final View jpo;

        public jd(View view) {
            this.jpo = view;
        }

        @Override // com.bytedance.sdk.openadsdk.p001if.jpo
        public int jd() {
            View view = this.jpo;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? va.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo()) : measuredWidth;
        }

        @Override // com.bytedance.sdk.openadsdk.p001if.jpo
        public int jpo() {
            View view = this.jpo;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? va.my(com.bytedance.sdk.openadsdk.core.sq.jpo()) : measuredHeight;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx implements com.bytedance.sdk.openadsdk.p001if.yd {
        private final com.bytedance.sdk.component.zz.jj jpo;

        @Override // com.bytedance.sdk.openadsdk.p001if.yd
        public void jd() {
            com.bytedance.sdk.component.zz.jj jjVar = this.jpo;
            if (jjVar == null) {
                return;
            }
            jjVar.opi();
        }

        @Override // com.bytedance.sdk.openadsdk.p001if.yd
        public void jpo() {
            com.bytedance.sdk.component.zz.jj jjVar = this.jpo;
            if (jjVar == null) {
                return;
            }
            jjVar.prr();
        }

        private wqx(com.bytedance.sdk.component.zz.jj jjVar) {
            this.jpo = jjVar;
        }
    }

    public hna(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.sz = jpoVar;
        this.f19891yd = jpoVar.my;
        this.f106if = jpoVar.f19905cm;
    }

    private com.bytedance.sdk.openadsdk.cm.cm.my duq() {
        return new opi(2, this.f106if ? "rewarded_video" : "fullscreen_interstitial_ad", this.sz.f19914jd);
    }

    /* renamed from: if, reason: not valid java name */
    public static /* synthetic */ int m440if(hna hnaVar) {
        int i10 = hnaVar.f19890ya;
        hnaVar.f19890ya = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nzb() {
        this.duq = true;
        this.rxq = false;
        this.sz.xk.removeMessages(600);
        this.sz.xk.removeMessages(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        this.sz.xk.removeMessages(900);
        this.sz.duq.cm(false);
        this.sz.f19916jr.set(true);
        this.sz.ree.prr();
        dt dtVar = this.sz.f19914jd;
        dtVar.mc();
        if (dtVar.mc() || !tic.xyk(rv.jpo(dtVar))) {
            return;
        }
        View viewYd = this.sz.tic.yd();
        View.OnClickListener onClickListener = (View.OnClickListener) viewYd.getTag(viewYd.getId());
        if (onClickListener != null) {
            jpo jpoVar = new jpo(this.sz, viewYd, onClickListener);
            viewYd.setOnClickListener(jpoVar);
            viewYd.setOnTouchListener(jpoVar);
        }
    }

    public static /* synthetic */ int oya(hna hnaVar) {
        int i10 = hnaVar.wcn;
        hnaVar.wcn = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int prr(hna hnaVar) {
        int i10 = hnaVar.f19881pe;
        hnaVar.f19881pe = i10 + 1;
        return i10;
    }

    public boolean ef() {
        return this.zz;
    }

    public boolean kln() {
        return this.duq;
    }

    public void sz() {
        Cif cif = this.f19868cm;
        if (cif != null) {
            cif.my();
        }
    }

    public boolean au() {
        return this.f19886sq.get();
    }

    public void dt() {
        Cif cif = this.f19868cm;
        if (cif != null) {
            cif.jpo(System.currentTimeMillis());
        }
    }

    public boolean hmu() {
        return this.xyk;
    }

    public void hna() throws JSONException {
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        if (jjVar != null) {
            jjVar.prr();
        }
        if (this.vrc > 0) {
            this.roc = (SystemClock.elapsedRealtime() - this.vrc) + this.roc;
            this.vrc = 0L;
        }
        ef efVar = this.jpo;
        if (efVar != null) {
            efVar.jpo(false);
            jd(this.jpo, false);
            jpo(this.jpo, true, false);
        }
    }

    public boolean hx() {
        ef efVar = this.jpo;
        if (efVar == null) {
            return false;
        }
        return efVar.zz();
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m441if() {
        String str = this.wqx;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public String jr() {
        return this.f19877jj;
    }

    public void ju() {
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        if (jjVar != null) {
            com.bytedance.sdk.openadsdk.core.tic.jpo(jjVar.getWebView());
        }
        dt dtVar = this.sz.f19914jd;
        long j10 = this.roc;
        if (j10 > 0) {
            if (this.vrc > 0) {
                this.roc = (SystemClock.elapsedRealtime() - this.vrc) + j10;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", dt.wqx(dtVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.sz.f19914jd, this.f19891yd, "second_endcard_duration", jSONObject, this.roc);
        }
        this.prr = null;
        if (this.f19882qk != null && !nmd.cm(dtVar) && !nmd.qk(dtVar) && !dt.wqx(dtVar)) {
            this.f19882qk.jpo(true);
            this.f19882qk.mo435if();
        }
        ef efVar = this.jpo;
        if (efVar != null) {
            efVar.m457if();
        }
        Cif cif = this.f19868cm;
        if (cif != null) {
            cif.cm(dtVar.eq());
        }
        DeviceUtils.AudioInfoReceiver.jd(this);
    }

    public boolean nmd() {
        return dt.wqx(this.sz.f19914jd) ? this.f19869dm && !this.tic && this.sz.nzb.m439if() : this.f19869dm && !this.tic && this.f19886sq.get() && this.opi;
    }

    public void nq() {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar != null) {
            myVar.wqx();
            this.f19882qk.cm();
        }
    }

    public int opi() {
        return this.my;
    }

    public boolean oya() {
        return this.opi;
    }

    public boolean pdm() {
        return this.opi && this.f19886sq.get();
    }

    public void prr() {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar != null) {
            myVar.zz();
        }
        Cif cif = this.f19868cm;
        if (cif != null) {
            cif.xyk();
        }
    }

    public void qk() {
        this.jpo.jpo("showPlayableEndCardOverlay", (JSONObject) null);
        this.sz.xk.sendEmptyMessageDelayed(600, 1000L);
        this.sz.xk.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.10
            @Override // java.lang.Runnable
            public void run() {
                hna.this.nzb();
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.oya oyaVar = this.sz.aix;
        if (oyaVar != null) {
            oyaVar.jpo(0L);
        }
    }

    public void rq() {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar != null) {
            myVar.xyk();
        }
    }

    public boolean rv() {
        return this.rxq;
    }

    public void se() {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar != null) {
            myVar.yd();
        }
    }

    public void sq() {
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        if (jjVar != null) {
            jjVar.au();
        }
        if (this.vrc == 0) {
            this.vrc = SystemClock.elapsedRealtime();
        }
        dt dtVar = this.sz.f19914jd;
        ef efVar = this.jpo;
        if (efVar != null) {
            efVar.ju();
            com.bytedance.sdk.component.zz.jj jjVar2 = this.prr;
            if (jjVar2 != null) {
                if (jjVar2.getVisibility() == 0) {
                    this.jpo.jpo(true);
                    jd(this.jpo, true);
                    jpo(this.jpo, false, true);
                    if (rv.xyk(dtVar) && !this.duq && this.sz.f19914jd.mc()) {
                        qk();
                    }
                } else {
                    this.jpo.jpo(false);
                    jd(this.jpo, false);
                    jpo(this.jpo, true, false);
                }
            }
        }
        Cif cif = this.f19868cm;
        if (cif != null) {
            cif.qk();
        }
    }

    public void tu() {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar != null) {
            myVar.qk();
        }
    }

    public boolean uu() {
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        return jjVar == null || jjVar.getWebView() == null;
    }

    public com.bytedance.sdk.component.zz.jj xyk() {
        return this.prr;
    }

    public void yd() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        dt dtVar = this.sz.f19914jd;
        String strQk = dtVar.qk();
        if (!TextUtils.isEmpty(strQk) && (xykVar = this.sz.ux) != null && (xykVar.vrc() || this.sz.ux.xk().tu())) {
            this.wqx = strQk;
        } else if (rv.my(dtVar)) {
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
            if (jdVarWw != null) {
                this.wqx = jdVarWw.m375if();
            }
        } else {
            this.wqx = rv.ju(dtVar);
        }
        String strJpo = jpo(this.wqx, dtVar, this.f19879ju, this.oya, this.f19867au);
        this.wqx = strJpo;
        if (TextUtils.isEmpty(strJpo)) {
            return;
        }
        this.f19869dm = this.wqx.contains("use_second_endcard=1");
    }

    public ef zz() {
        return this.jpo;
    }

    public void jj() {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.sz;
        dt dtVar = jpoVar.f19914jd;
        if (TextUtils.isEmpty(dt.jpo(jpoVar.f19920pe, dtVar))) {
            if (dtVar != null && !dtVar.pdm() && this.huv == null && m441if()) {
                this.fy = dtVar.afh();
                this.huv = com.bytedance.sdk.openadsdk.qk.jd.jpo().jd();
                int iJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(this.huv, this.fy);
                this.xk = iJpo;
                this.f19875ic = iJpo > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.fy)) {
                    Cif cif = this.f19868cm;
                    if (cif != null) {
                        cif.jpo(this.f19875ic);
                    }
                    wqx.jpo.jpo(this.f19870dn, dtVar, "landingpage_endcard", this.huv, this.fy);
                }
            }
            if ((!TextUtils.isEmpty(this.wqx) && this.wqx.contains("play.google.com/store")) || ((dtVar != null && !dtVar.va() && nmd.xyk(dtVar)) || nmd.qk(dtVar))) {
                this.xyk = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.f19876jd + ",webViewIsLoading " + this.hks);
            if (this.f19876jd) {
                boolean z10 = this.sz.f19931vk;
                if (this.prr != null && ((z10 || !TextUtils.isEmpty(this.wqx)) && dt.jd(dtVar))) {
                    if (this.hks) {
                        return;
                    }
                    String strO = o2.o(new StringBuilder(), this.wqx, "&is_pre_render=1");
                    Cif cif2 = this.f19868cm;
                    if (cif2 != null) {
                        cif2.cm();
                    }
                    rq.jpo(this.prr, strO);
                    this.hks = true;
                    return;
                }
                if (dt.wqx(dtVar)) {
                    this.sz.nzb.wqx();
                }
            }
        }
    }

    public void my() {
        if (rv.my(this.sz.f19914jd) && this.sz.f19925sg) {
            return;
        }
        jj();
    }

    public boolean cm() {
        return this.tic;
    }

    public void jd() {
        com.bytedance.sdk.openadsdk.common.au auVar;
        this.nmd = this.sz.vrc.findViewById(R.id.content);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.sz;
        boolean z10 = jpoVar.f19921qk;
        this.f19888uu = z10;
        if (z10 && (auVar = this.f19884rv) != null) {
            this.prr = auVar.cm();
        } else {
            com.bytedance.sdk.component.zz.jj jjVar = (com.bytedance.sdk.component.zz.jj) jpoVar.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.oya);
            this.prr = jjVar;
            if (jjVar != null && dt.jd(this.sz.f19914jd)) {
                this.prr.my();
            } else {
                va.jpo((View) this.prr, 8);
            }
        }
        com.bytedance.sdk.component.zz.jj jjVar2 = this.prr;
        if (jjVar2 != null) {
            jjVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws JSONException {
                    if (hna.this.prr == null || hna.this.prr.getViewTreeObserver() == null) {
                        return;
                    }
                    hna.this.prr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = hna.this.prr.getMeasuredWidth();
                    int measuredHeight = hna.this.prr.getMeasuredHeight();
                    if (hna.this.prr.getVisibility() == 0) {
                        hna.this.jpo(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public boolean wqx() {
        return this.f19889va;
    }

    public void cm(boolean z10) {
        if (rv.jd(this.sz.f19914jd)) {
            return;
        }
        my(z10);
    }

    public void my(boolean z10) {
        if (this.jpo == null || this.sz.vrc.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.jpo.jpo("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void wqx(boolean z10) throws JSONException {
        jd(this.jpo, z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends com.bytedance.sdk.openadsdk.core.wqx.jpo implements jd.jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final View f19899jd;
        private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpo;
        private final View.OnClickListener wqx;

        public jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar, View view, View.OnClickListener onClickListener) {
            super(jpoVar.vrc, jpoVar.f19914jd, jpoVar.my, jpoVar.f19905cm ? 7 : 5);
            this.jpo = jpoVar;
            this.f19899jd = view;
            this.wqx = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            jpo(map);
            jpo(jpoVar.f19919nq.wqx());
            jpo(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo, com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
        public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
            if (!this.jpo.f19914jd.mc()) {
                super.jpo(view, f10, f11, f12, f13, sparseArray, z10);
                this.jpo.roc.dm();
            } else {
                this.wqx.onClick(view);
                this.f19899jd.setOnTouchListener(null);
                this.f19899jd.setOnClickListener(this.wqx);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
        public void jpo(View view, int i10) {
            this.f19899jd.setOnTouchListener(null);
            this.f19899jd.setOnClickListener(this.wqx);
        }
    }

    public void qk(boolean z10) {
        this.rxq = z10;
    }

    public void jpo() {
        if (this.f19878jr) {
            return;
        }
        this.f19878jr = true;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.sz;
        this.f19879ju = jpoVar.sbx;
        this.f19867au = jpoVar.cgn;
        this.oya = jpoVar.hks;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        jd();
        this.f19870dn = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    public void jd(boolean z10) {
        jpo(this.jpo, z10);
    }

    public void jd(ef efVar, boolean z10) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            efVar.jpo(C3191e4.g.V, jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p001if.xyk
    public void jd(int i10) {
        int i11 = this.f19873et;
        if (i11 <= 0 && i10 > 0) {
            cm(false);
        } else if (i11 > 0 && i10 == 0) {
            cm(true);
        }
        this.f19873et = i10;
    }

    public void jpo(String str, final com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        jpo(str, new cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.hna.cm
            public void jpo(WebView webView, String str2) {
                if (hna.this.sz.vrc.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo unused = hna.this.sz;
                hna.this.au();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.jpo.hna.cm
            public void jpo(WebView webView, int i10) {
                try {
                    if (!hna.this.sz.f19921qk || hna.this.sz.ota == null) {
                        return;
                    }
                    hna.this.sz.ota.jpo(webView, i10, hna.this.jkt);
                } catch (Exception unused) {
                }
            }
        });
        jpo(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                hna.this.sz.f19919nq.jd();
                com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar2 = jdVar;
                if (jdVar2 != null) {
                    jdVar2.et();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        this.sz.f19908dt.get();
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.sz;
        com.bytedance.sdk.openadsdk.activity.xyk xykVar = jpoVar.ux;
        if (xykVar == null || !xykVar.f94if || jpoVar.f19908dt.get()) {
            return;
        }
        this.sz.f19908dt.set(true);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.sz;
        if (jpoVar2.f19927tl && nmd.m475if(jpoVar2.f19914jd) && jdVar != null) {
            jdVar.jj();
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.p001if.jj jjVar, String str, final com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        if (this.prr == null) {
            return;
        }
        HashMap map = new HashMap();
        final dt dtVar = this.sz.f19914jd;
        map.put("click_scence", 2);
        this.f19882qk = duq();
        ef efVar = new ef(this.sz.vrc);
        this.jpo = efVar;
        efVar.jpo(this.sz.roc);
        ef efVarJpo = this.jpo.jd(this.prr).jpo(dtVar).jpo(com.bytedance.sdk.openadsdk.core.zz.jpo.jd.jpo(dtVar)).wqx(dtVar.fc()).cm(dtVar.fxd()).jd(dtVar.jw() ? 7 : 5).jpo(new jd(this.prr)).my(dtVar.sd()).jpo(this.prr);
        if (m441if()) {
            str = "landingpage_endcard";
        }
        efVarJpo.jd(str).jpo(map).jpo(this.f19882qk).jpo(new com.bytedance.sdk.openadsdk.core.widget.my() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.my
            public void jpo() {
                if (hna.this.f19872ef != null) {
                    hna.this.f19872ef.wqx();
                }
                com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar2 = jdVar;
                if (jdVar2 != null) {
                    jdVar2.et();
                }
            }
        }).jpo(new ef.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.7
            @Override // com.bytedance.sdk.openadsdk.core.ef.jpo
            public void jpo() {
                hna.this.nzb();
            }
        });
        this.jpo.jpo(new wqx(this.prr));
        this.jpo.jpo(this.sz.tic.yd()).jpo(this.sz.f19924se.wqx()).jpo(new com.bytedance.sdk.openadsdk.p001if.wqx() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.9
            @Override // com.bytedance.sdk.openadsdk.p001if.wqx
            public void jpo(boolean z10, int i10, String str2) throws JSONException {
                if (z10) {
                    hna hnaVar = hna.this;
                    hnaVar.zz = true;
                    if (hnaVar.sbx) {
                        hna.this.sbx = false;
                        hna hnaVar2 = hna.this;
                        hnaVar2.jpo(hnaVar2.sz.huv, true);
                    }
                }
                if (dt.cm(dtVar)) {
                    hna.this.jpo(z10, i10, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p001if.wqx
            public void jpo() {
                hna.this.f19889va = true;
                hna.this.sz.tic.yd().performClick();
            }
        });
        this.jpo.cm(this.f19869dm);
    }

    public void jj(boolean z10) {
        this.tic = true;
        JSONObject jSONObject = new JSONObject();
        dt dtVar = this.sz.f19914jd;
        try {
            jSONObject.put("endcard_overlay_render_type", dt.wqx(dtVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, this.f19891yd, "use_second_endcard", jSONObject);
        this.vrc = SystemClock.elapsedRealtime();
        try {
            if (!dt.wqx(dtVar)) {
                this.jpo.jpo("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.sz.nzb.xyk();
                com.bytedance.sdk.openadsdk.cm.wqx.jd(dtVar, this.f19891yd, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        this.sz.aix.jpo(r5.xyk);
    }

    public void jpo(int i10, int i11) throws JSONException {
        if (this.jpo == null || this.sz.vrc.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i10);
            jSONObject.put("height", i11);
            this.jpo.jpo(MraidResizeCommand.NAME, jSONObject);
        } catch (Exception e10) {
            Log.e("TTAD.RFWVM", "", e10);
        }
    }

    public void jpo(boolean z10) {
        this.f19876jd = z10;
    }

    private static String jpo(String str, dt dtVar, int i10, int i11, int i12) {
        String strConcat;
        String strConcat2;
        float fSy = dtVar.sy();
        if (!TextUtils.isEmpty(str)) {
            if (i10 == 1) {
                if (str.contains("?")) {
                    strConcat2 = str.concat(C3191e4.i.f36527c);
                } else {
                    strConcat2 = str.concat("?");
                }
                str = o2.l(strConcat2, "orientation=portrait");
            }
            if (str.contains("?")) {
                strConcat = str.concat(C3191e4.i.f36527c);
            } else {
                strConcat = str.concat("?");
            }
            str = strConcat + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + fSy;
        }
        return !rv.jd(dtVar) ? com.bytedance.sdk.openadsdk.utils.jj.jpo(str) : str;
    }

    public void jpo(int i10) {
        if (this.opi || !this.f19886sq.get()) {
            jpo(0, this.sz.roc);
        }
        va.jpo((View) this.prr, i10);
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        if (jjVar != null) {
            va.jpo((View) jjVar.getWebView(), i10);
        }
        dt dtVar = this.sz.f19914jd;
        if (this.prr == null || !dtVar.eq()) {
            return;
        }
        this.prr.setLandingPage(true);
        this.prr.setTag("landingpage_endcard");
        this.prr.setMaterialMeta(dtVar.eye());
    }

    public void jpo(com.bytedance.sdk.openadsdk.common.au auVar) {
        this.f19884rv = auVar;
    }

    public void jpo(float f10) {
        va.jpo(this.prr, f10);
    }

    public void jpo(ef efVar, boolean z10) {
        if (this.jpo == null || this.sz.vrc.isFinishing()) {
            return;
        }
        efVar.jpo(z10);
    }

    private void jpo(String str, final cm cmVar) {
        com.bytedance.sdk.component.zz.jj jjVar;
        final dt dtVar = this.sz.f19914jd;
        com.bytedance.sdk.component.zz.jj jjVar2 = this.prr;
        if (jjVar2 == null || jjVar2.getWebView() == null) {
            return;
        }
        Cif cifJd = new Cif(dtVar, this.prr.getWebView(), new com.bytedance.sdk.openadsdk.cm.ju() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.11
            @Override // com.bytedance.sdk.openadsdk.cm.ju
            public void jpo(int i10) {
                if (TextUtils.isEmpty(hna.this.fy)) {
                    return;
                }
                wqx.jpo.jpo(hna.this.xk, hna.this.f19881pe, hna.this.wcn, hna.this.f19890ya - hna.this.wcn, dtVar, "landingpage_endcard", i10);
            }
        }, this.f19875ic).jd(true);
        this.f19868cm = cifJd;
        this.jkt = cifJd.jpo;
        cifJd.jpo(m441if() ? "landingpage_endcard" : str);
        this.f19868cm.jd(this.f19891yd);
        this.f19868cm.wqx(true);
        this.prr.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.12
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                Cif cif = hna.this.f19868cm;
                if (cif != null) {
                    cif.jd(i11);
                }
            }
        });
        xyk xykVar = this.sz.f19924se;
        if (xykVar != null) {
            this.f19868cm.jpo(xykVar.jpo());
        }
        com.bytedance.sdk.openadsdk.common.cm cmVarJpo = tic.jpo(dtVar, this.prr, this.sz.vrc, this.f19891yd);
        this.cgn = cmVarJpo;
        if (cmVarJpo != null) {
            cmVarJpo.jpo(m441if() ? "landingpage_endcard" : str);
        }
        if (m441if()) {
            tic.jpo(dtVar, this.prr);
        }
        com.bytedance.sdk.openadsdk.core.widget.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.my(com.bytedance.sdk.openadsdk.core.sq.jpo(), this.jpo, dtVar.fc(), this.cgn, this.f19868cm, dtVar.eq()) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                hna.this.hks = false;
                hna.this.opi = true;
                hna hnaVar = hna.this;
                hnaVar.jpo(100, hnaVar.sz.roc);
                if (hna.this.sz.f19909ef.nmd()) {
                    View viewYd = hna.this.sz.tic.yd();
                    if (viewYd instanceof com.bytedance.sdk.openadsdk.core.jj.cm) {
                        ((com.bytedance.sdk.openadsdk.core.jj.cm) viewYd).setImageResource(com.bytedance.sdk.component.utils.dt.cm(hna.this.sz.f19920pe, "tt_skip_btn"));
                    }
                }
                DeviceUtils.AudioInfoReceiver.jpo(hna.this);
                hna.this.f19873et = DeviceUtils.qk();
                com.bytedance.sdk.openadsdk.cm.cm.my myVar2 = hna.this.f19882qk;
                if (myVar2 != null) {
                    myVar2.jj();
                }
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo unused = hna.this.sz;
                cm cmVar2 = cmVar;
                if (cmVar2 != null) {
                    cmVar2.jpo(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                super.onPageStarted(webView, str2, bitmap);
                com.bytedance.sdk.openadsdk.cm.cm.my myVar2 = hna.this.f19882qk;
                if (myVar2 != null) {
                    myVar2.my();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str2, String str3) {
                super.onReceivedError(webView, i10, str2, str3);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                com.bytedance.sdk.openadsdk.component.reward.jpo.jpo unused = hna.this.sz;
                webResourceRequest.isForMainFrame();
                webResourceRequest.getUrl();
                webResourceResponse.getStatusCode();
                if (webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest.isForMainFrame()) {
                    hna.this.f19886sq.set(false);
                    hna.this.hks = false;
                    hna.this.my = webResourceResponse.getStatusCode();
                    hna hnaVar = hna.this;
                    hnaVar.f19877jj = "onReceivedHttpError";
                    hnaVar.jpo(hnaVar.my, hnaVar.sz.roc);
                }
                if (hna.this.f19882qk != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", webResourceResponse.getStatusCode());
                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        hna.this.f19882qk.jpo(jSONObject);
                    } catch (JSONException unused2) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                try {
                    if (TextUtils.isEmpty(hna.this.fy)) {
                        return super.shouldInterceptRequest(webView, str2);
                    }
                    hna.m440if(hna.this);
                    WebResourceResponseModel webResourceResponseModelJpo = com.bytedance.sdk.openadsdk.qk.jd.jpo().jpo(hna.this.huv, hna.this.fy, str2);
                    if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getWebResourceResponse() != null) {
                        hna.oya(hna.this);
                        return webResourceResponseModelJpo.getWebResourceResponse();
                    }
                    if (webResourceResponseModelJpo != null && webResourceResponseModelJpo.getMsg() == 2) {
                        hna.prr(hna.this);
                    }
                    return super.shouldInterceptRequest(webView, str2);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.RFWVM", "shouldInterceptRequest url error", th2);
                    return super.shouldInterceptRequest(webView, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                }
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !hna.this.jpo(webResourceRequest.getUrl().toString())) {
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo unused = hna.this.sz;
                        webResourceError.getErrorCode();
                        String.valueOf(webResourceError.getDescription());
                        String.valueOf(webResourceRequest.getUrl());
                    }
                    if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                        hna.this.f19886sq.set(false);
                        hna.this.hks = false;
                        hna.this.jpo(webResourceError != null ? webResourceError.getErrorCode() : -1, hna.this.sz.roc);
                    }
                    if (hna.this.f19882qk != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            hna.this.f19882qk.jpo(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceError != null) {
                        hna.this.my = webResourceError.getErrorCode();
                        hna.this.f19877jj = String.valueOf(webResourceError.getDescription());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                try {
                    return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.RFWVM", "shouldInterceptRequest error1", th2);
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            }
        };
        this.f19872ef = myVar;
        this.prr.setWebViewClient(myVar);
        this.f19872ef.jpo(dtVar);
        this.f19872ef.jpo(this.f106if ? "rewarded_video" : "fullscreen_interstitial_ad");
        if (dtVar.eq() && (jjVar = this.prr) != null && jjVar.getWebView() != null) {
            this.prr.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.3
                private final int wqx = com.bytedance.sdk.openadsdk.core.sq.jd();

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    int actionMasked;
                    int i10;
                    Cif cif = hna.this.f19868cm;
                    if (cif != null) {
                        cif.jpo(motionEvent);
                    }
                    if (hna.this.cgn != null) {
                        hna.this.cgn.jpo(motionEvent);
                    }
                    try {
                        actionMasked = motionEvent.getActionMasked();
                    } catch (Throwable th2) {
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th2);
                    }
                    if (actionMasked != 0) {
                        int i11 = 3;
                        if (actionMasked == 1) {
                            i10 = i11;
                        } else if (actionMasked != 2) {
                            i11 = actionMasked != 3 ? -1 : 4;
                            i10 = i11;
                        } else {
                            float rawX = motionEvent.getRawX();
                            float rawY = motionEvent.getRawY();
                            if (Math.abs(rawX - hna.this.f19887tu) >= this.wqx || Math.abs(rawY - hna.this.f19871dt) >= this.wqx) {
                                hna.this.f19885se = false;
                            }
                            hna.this.f19874hx += Math.abs(motionEvent.getX() - hna.this.f19887tu);
                            hna.this.pdm += Math.abs(motionEvent.getY() - hna.this.f19871dt);
                            int i12 = (System.currentTimeMillis() - hna.this.hmu <= 200 || (hna.this.f19874hx <= 8.0f && hna.this.pdm <= 8.0f)) ? 2 : 1;
                            if (hna.this.f19888uu) {
                                if (rawY - hna.this.f19871dt > 8.0f) {
                                    hna.this.f19884rv.jpo();
                                }
                                if (rawY - hna.this.f19871dt < -8.0f) {
                                    hna.this.f19884rv.jd();
                                }
                            }
                            i10 = i12;
                        }
                        return false;
                    }
                    hna.this.f19885se = true;
                    hna.this.f19880nq = new SparseArray();
                    hna.this.f19887tu = motionEvent.getRawX();
                    hna.this.f19871dt = motionEvent.getRawY();
                    hna.this.hmu = System.currentTimeMillis();
                    try {
                        long landingPageClickBegin = hna.this.prr.getLandingPageClickBegin();
                        if (landingPageClickBegin > 0 && landingPageClickBegin < hna.this.hmu) {
                            hna.this.hmu = landingPageClickBegin;
                            hna.this.prr.setLandingPageClickBegin(-1L);
                        }
                    } catch (Exception unused) {
                    }
                    hna.this.f19874hx = -1.0f;
                    hna.this.pdm = -1.0f;
                    i10 = 0;
                    hna.this.f19880nq.put(motionEvent.getActionMasked(), new wqx.jpo(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                    if (motionEvent.getAction() == 1 && nmd.jj(hna.this.sz.f19914jd) && hna.this.sz.roc != null) {
                        hna.this.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                hna.this.sz.roc.rxq();
                            }
                        });
                    }
                    if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!hna.this.hna || nmd.yd(dtVar)) && hna.this.f19885se)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("down_x", hna.this.f19887tu);
                        jSONObject.put("down_y", hna.this.f19871dt);
                        jSONObject.put("down_time", hna.this.hmu);
                        jSONObject.put("up_x", motionEvent.getRawX());
                        jSONObject.put("up_y", motionEvent.getRawY());
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            long landingPageClickEnd = hna.this.prr.getLandingPageClickEnd();
                            if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                try {
                                    hna.this.prr.setLandingPageClickEnd(-1L);
                                } catch (Exception unused2) {
                                }
                                jCurrentTimeMillis = landingPageClickEnd;
                            }
                        } catch (Exception unused3) {
                        }
                        jSONObject.put("up_time", jCurrentTimeMillis);
                        int[] iArr = new int[2];
                        if (hna.this.f19888uu) {
                            hna hnaVar = hna.this;
                            hnaVar.f19883rq = hnaVar.sz.f19930va.findViewById(com.bytedance.sdk.openadsdk.utils.hna.ree);
                        } else {
                            hna hnaVar2 = hna.this;
                            hnaVar2.f19883rq = hnaVar2.sz.f19930va.findViewById(520093713);
                        }
                        if (hna.this.f19883rq != null) {
                            hna.this.f19883rq.getLocationOnScreen(iArr);
                            jSONObject.put("button_x", iArr[0]);
                            jSONObject.put("button_y", iArr[1]);
                            jSONObject.put("button_width", hna.this.f19883rq.getWidth());
                            jSONObject.put("button_height", hna.this.f19883rq.getHeight());
                        }
                        if (hna.this.nmd != null) {
                            int[] iArr2 = new int[2];
                            hna.this.nmd.getLocationOnScreen(iArr2);
                            jSONObject.put("ad_x", iArr2[0]);
                            jSONObject.put("ad_y", iArr2[1]);
                            jSONObject.put("width", hna.this.nmd.getWidth());
                            jSONObject.put("height", hna.this.nmd.getHeight());
                        }
                        jSONObject.put("toolType", motionEvent.getToolType(0));
                        jSONObject.put("deviceId", motionEvent.getDeviceId());
                        jSONObject.put("source", motionEvent.getSource());
                        jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.Cif.jpo(hna.this.f19880nq, com.bytedance.sdk.openadsdk.core.zz.jd().jpo() ? 1 : 2));
                        jSONObject.put("user_behavior_type", hna.this.f19885se ? 1 : 2);
                        jSONObject.put("click_scence", 2);
                        if (hna.this.f19872ef != null) {
                            hna.this.f19872ef.jpo(jSONObject);
                        }
                        if (!hna.this.hna && !nmd.zz(dtVar)) {
                            if (hna.this.f106if) {
                                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, "rewarded_video", "click", jSONObject);
                            } else {
                                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, "fullscreen_interstitial_ad", "click", jSONObject);
                            }
                            hna.this.hna = true;
                        }
                        return false;
                    }
                    return false;
                }
            });
        }
        com.bytedance.sdk.component.zz.jj jjVar3 = this.prr;
        if (jjVar3 != null) {
            jjVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.jpo, this.f19868cm, this.cgn) { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.hna.4
                @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    cm cmVar2 = cmVar;
                    if (cmVar2 != null) {
                        cmVar2.jpo(webView, i10);
                    }
                }
            });
        }
        jpo(this.prr);
        this.prr.setLayerType(1, null);
        this.prr.setBackgroundColor(-1);
        this.prr.setDisplayZoomControls(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.sz.f19914jd.eq() && str.endsWith(".mp4");
    }

    public void jpo(DownloadListener downloadListener) {
        com.bytedance.sdk.component.zz.jj jjVar = this.prr;
        if (jjVar == null || downloadListener == null) {
            return;
        }
        jjVar.setDownloadListener(downloadListener);
    }

    public void jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.jpo.wqx.jpo(this.sz.vrc).jpo(false).jd(false).jpo(jjVar.getWebView());
        jjVar.setUserAgentString(jr.jpo(jjVar.getWebView(), BuildConfig.VERSION_CODE));
        jjVar.setMixedContentMode(0);
    }

    public void jpo(boolean z10, boolean z11) throws JSONException {
        jpo(this.jpo, z10, z11);
    }

    public void jpo(ef efVar, boolean z10, boolean z11) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z11);
            com.bytedance.sdk.openadsdk.activity.xyk xykVar = this.sz.ux;
            String str = TtmlNode.END;
            if (xykVar != null) {
                jSONObject.put("multi_ads_show", xykVar.xk().qk());
                if (!xykVar.f19416sq) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            efVar.jpo("endcard_control_event", jSONObject);
            if (z11) {
                if (this.opi) {
                    return;
                }
                this.sbx = true;
                return;
            }
            this.sbx = false;
        } catch (Exception unused) {
        }
    }

    public void jpo(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.cm.cm.my myVar = this.f19882qk;
        if (myVar == null) {
            return;
        }
        if (z10) {
            myVar.jd();
        } else {
            myVar.jpo(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.nzb < 100) {
            return false;
        }
        this.nzb = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
