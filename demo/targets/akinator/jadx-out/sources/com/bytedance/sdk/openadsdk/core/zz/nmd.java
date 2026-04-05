package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.component.adexpress.jd.Cif;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.bytedance.sdk.component.adexpress.jd.yd;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.cm.qk;
import com.bytedance.sdk.openadsdk.core.duq;
import com.bytedance.sdk.openadsdk.core.ef;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.nzb;
import com.bytedance.sdk.openadsdk.core.wqx.jpo;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd extends com.bytedance.sdk.openadsdk.core.jj.wqx implements com.bytedance.sdk.component.adexpress.dynamic.cm, com.bytedance.sdk.component.adexpress.jd.prr, com.bytedance.sdk.component.adexpress.jd.xyk, jpo.InterfaceC0135jpo, prr {
    private long aix;

    /* renamed from: au, reason: collision with root package name */
    public FrameLayout f21095au;
    private com.bytedance.sdk.openadsdk.core.ju.jd.qk cgn;

    /* renamed from: cm, reason: collision with root package name */
    private TTDislikeDialogAbstract f21096cm;
    private final SparseArray<wqx.jpo> cql;

    /* renamed from: dm, reason: collision with root package name */
    private qk.jpo f21097dm;

    /* renamed from: dn, reason: collision with root package name */
    private List<com.bytedance.sdk.component.adexpress.jd.yd> f21098dn;

    /* renamed from: dt, reason: collision with root package name */
    int f21099dt;
    private String duq;

    /* renamed from: ef, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ju.wqx.jd f21100ef;

    /* renamed from: et, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.au f21101et;
    private final Runnable fy;
    private com.bytedance.sdk.openadsdk.core.ju.jj.cm hks;
    boolean hmu;
    protected com.bytedance.sdk.component.adexpress.jd.wqx hna;
    private ThemeStatusBroadcastReceiver huv;

    /* renamed from: hx, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.jd.jd f21102hx;

    /* renamed from: ic, reason: collision with root package name */
    private final Runnable f21103ic;

    /* renamed from: if, reason: not valid java name */
    protected com.bytedance.sdk.openadsdk.core.model.dt f150if;

    /* renamed from: ii, reason: collision with root package name */
    private int f21104ii;

    /* renamed from: jd, reason: collision with root package name */
    private int f21105jd;

    /* renamed from: jj, reason: collision with root package name */
    private xyk f21106jj;
    private com.bytedance.sdk.component.adexpress.jd.jj jkt;
    private boolean jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected String f21107jr;

    /* renamed from: ju, reason: collision with root package name */
    protected AdSlot f21108ju;
    private String kln;
    private PAGExpressAdWrapperListener my;
    protected HashSet<String> nmd;

    /* renamed from: nq, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.cm.qk f21109nq;
    private boolean nzb;
    protected int opi;
    private float ota;
    protected boolean oya;
    public com.bytedance.sdk.component.adexpress.jd.cm<? extends View> pdm;

    /* renamed from: pe, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f21110pe;
    protected boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private zz f21111qk;
    private float ree;
    private wqx roc;

    /* renamed from: rq, reason: collision with root package name */
    protected ViewGroup f21112rq;

    /* renamed from: rv, reason: collision with root package name */
    private float f21113rv;
    private com.bytedance.sdk.component.adexpress.jd.zz rxq;
    private com.bytedance.sdk.component.adexpress.jd.hna sbx;

    /* renamed from: se, reason: collision with root package name */
    long f21114se;

    /* renamed from: sq, reason: collision with root package name */
    boolean f21115sq;
    private com.bytedance.sdk.openadsdk.cm.cm.my sz;
    private boolean tic;

    /* renamed from: tl, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.cm.zz f21116tl;

    /* renamed from: tu, reason: collision with root package name */
    public boolean f21117tu;

    /* renamed from: uu, reason: collision with root package name */
    private float f21118uu;

    /* renamed from: va, reason: collision with root package name */
    private tu f21119va;
    private float voc;
    private final AtomicBoolean vrc;
    private float wad;
    private yd.jpo wcn;
    private com.bytedance.sdk.openadsdk.wqx.wqx wqx;
    private final Runnable xk;
    private String xyk;

    /* renamed from: ya, reason: collision with root package name */
    private hmu f21120ya;

    /* renamed from: yd, reason: collision with root package name */
    protected String f21121yd;
    protected final Context zz;

    public nmd(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, AdSlot adSlot, String str) {
        super(context);
        this.jpo = true;
        this.f21105jd = 0;
        this.f21121yd = "embeded_ad";
        this.xyk = null;
        this.prr = false;
        this.f21115sq = true;
        this.opi = -1;
        this.kln = "";
        this.f21117tu = false;
        this.tic = true;
        this.f21099dt = -1;
        this.f21109nq = new com.bytedance.sdk.openadsdk.cm.qk();
        this.f21114se = 0L;
        this.vrc = new AtomicBoolean(false);
        this.f21110pe = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                nmd nmdVar = nmd.this;
                if (nmdVar.f21115sq && nmdVar.zz()) {
                    nmd.this.se();
                    nmd nmdVar2 = nmd.this;
                    nmdVar2.removeCallbacks(nmdVar2.xk);
                    nmd nmdVar3 = nmd.this;
                    nmdVar3.postDelayed(nmdVar3.xk, 500L);
                }
            }
        };
        this.xk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.2
            @Override // java.lang.Runnable
            public void run() {
                if (!nzb.jpo(nmd.this, 0, 5, false)) {
                    nmd.this.jj(8);
                } else {
                    nmd nmdVar = nmd.this;
                    nmdVar.jj(nmdVar.getVisibility());
                }
            }
        };
        this.f21103ic = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.3
            @Override // java.lang.Runnable
            public void run() {
                nmd.this.jj(0);
            }
        };
        this.fy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.4
            @Override // java.lang.Runnable
            public void run() {
                nmd.this.jj(8);
            }
        };
        this.f21104ii = 8;
        this.cql = new SparseArray<>();
        this.ota = -1.0f;
        this.wad = -1.0f;
        this.ree = -1.0f;
        this.voc = -1.0f;
        this.aix = 0L;
        this.f21121yd = str;
        this.zz = context;
        this.f150if = dtVar;
        this.f21108ju = adSlot;
        this.f21117tu = false;
        qk();
    }

    private void au() {
        dt.jpo jpoVarVzb = this.f150if.vzb();
        if (!TextUtils.equals(this.f21121yd, "embeded_ad") || jpoVarVzb == null) {
            return;
        }
        String strYd = jpoVarVzb.yd();
        if (TextUtils.isEmpty(strYd)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strYd);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.f21118uu = iOptInt2;
            this.f21113rv = iOptInt;
        } catch (Exception unused) {
        }
    }

    private void hna() {
        this.f21105jd = this.f150if.tl();
        try {
            sq();
            nq();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        boolean z10 = this.f150if.erj() == 1;
        this.jpo = z10;
        if (z10) {
            com.bytedance.sdk.component.adexpress.jd.jj jjVar = new com.bytedance.sdk.component.adexpress.jd.jj(this.zz, this.f21101et, new rq(this, this.huv, this.f21101et));
            this.jkt = jjVar;
            this.f21098dn.add(jjVar);
        }
        Objects.toString(this.f21098dn);
        this.wcn = new Cif(this.f21098dn, this.rxq);
    }

    private boolean hx() {
        return com.bytedance.sdk.openadsdk.core.model.dt.my(this.f150if);
    }

    private void nq() {
        nmd nmdVar;
        com.bytedance.sdk.openadsdk.core.ju.jj.cm cmVar;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
        if (dtVar == null || dtVar.cxb() != 1 || this.f150if.cql() == 2) {
            com.bytedance.sdk.openadsdk.core.qk.jpo.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.qk.jpo.jpo();
            int i10 = this.f21105jd;
            if (i10 != 0) {
                if (i10 == 3) {
                    com.bytedance.sdk.component.adexpress.dynamic.my.qk qkVar = new com.bytedance.sdk.component.adexpress.dynamic.my.qk();
                    Context applicationContext = this.zz.getApplicationContext();
                    com.bytedance.sdk.component.adexpress.jd.au auVar = this.f21101et;
                    ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.huv;
                    boolean z10 = this.f21117tu;
                    com.bytedance.sdk.component.adexpress.jd.jd jdVar = new com.bytedance.sdk.component.adexpress.jd.jd(applicationContext, auVar, themeStatusBroadcastReceiver, z10, qkVar, this, jpoVar, new jj(this.zz, themeStatusBroadcastReceiver, z10, qkVar, auVar, jpoVar));
                    this.f21102hx = jdVar;
                    this.f21098dn.add(jdVar);
                    return;
                }
                if (i10 == 7) {
                    com.bytedance.sdk.openadsdk.core.ju.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.ju.jj.cm(this.zz, this.f150if, this.f21117tu, (com.bytedance.sdk.openadsdk.core.ju.jj.jpo) this.f21101et, this);
                    this.hks = cmVar2;
                    com.bytedance.sdk.openadsdk.core.ju.jd.qk qkVar2 = new com.bytedance.sdk.openadsdk.core.ju.jd.qk(this.zz, cmVar2, this, this.f21101et);
                    this.cgn = qkVar2;
                    qkVar2.jpo(this);
                    this.f21098dn.add(this.cgn);
                    return;
                }
                if (i10 != 9) {
                    if (i10 != 10) {
                        return;
                    }
                    if (!this.nzb || (cmVar = this.hks) == null) {
                        nmdVar = this;
                        nmdVar.hks = new com.bytedance.sdk.openadsdk.core.ju.jj.qk(this.zz, this.f150if, this.f21117tu, (com.bytedance.sdk.openadsdk.core.ju.jj.jpo) this.f21101et, this);
                    } else {
                        cmVar.jpo(this.f150if, this.f21117tu, (com.bytedance.sdk.openadsdk.core.ju.jj.jpo) this.f21101et, this);
                        nmdVar = this;
                    }
                    com.bytedance.sdk.openadsdk.core.ju.jd.qk qkVar3 = new com.bytedance.sdk.openadsdk.core.ju.jd.qk(nmdVar.zz, nmdVar.hks, this, nmdVar.f21101et);
                    nmdVar.cgn = qkVar3;
                    qkVar3.jpo(this);
                    nmdVar.f21098dn.add(nmdVar.cgn);
                    return;
                }
            }
            hmu hmuVar = new hmu(this.zz, this.f21101et, this.huv, this.sz, this.f150if);
            this.f21120ya = hmuVar;
            com.bytedance.sdk.component.adexpress.jd.hna hnaVar = new com.bytedance.sdk.component.adexpress.jd.hna(this.zz, this.f21101et, hmuVar, this);
            this.sbx = hnaVar;
            this.f21098dn.add(hnaVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void oya() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zz.nmd.oya():void");
    }

    private void pdm() {
        List<com.bytedance.sdk.component.adexpress.jd.yd> list = this.f21098dn;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.jd.yd> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void prr() {
        if (this.f150if.cxb() == 1 && this.f150if.ig()) {
            com.bytedance.sdk.component.adexpress.jd.jj jjVar = new com.bytedance.sdk.component.adexpress.jd.jj(this.zz, this.f21101et, new rq(this, this.huv, this.f21101et));
            this.jkt = jjVar;
            this.f21098dn.add(jjVar);
            this.wcn = new Cif(this.f21098dn, this.rxq);
            return;
        }
        if (uu()) {
            hna();
            return;
        }
        try {
            sq();
            hmu hmuVar = new hmu(this.zz, this.f21101et, this.huv, this.sz, this.f150if);
            this.f21120ya = hmuVar;
            com.bytedance.sdk.component.adexpress.jd.hna hnaVar = new com.bytedance.sdk.component.adexpress.jd.hna(this.zz, this.f21101et, hmuVar, this);
            this.sbx = hnaVar;
            this.f21098dn.add(hnaVar);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        com.bytedance.sdk.component.adexpress.jd.jj jjVar2 = new com.bytedance.sdk.component.adexpress.jd.jj(this.zz, this.f21101et, new rq(this, this.huv, this.f21101et));
        this.jkt = jjVar2;
        this.f21098dn.add(jjVar2);
        this.wcn = new Cif(this.f21098dn, this.rxq);
    }

    private void rv() {
        List<com.bytedance.sdk.component.adexpress.jd.yd> list = this.f21098dn;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.jd.yd> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void se() {
        if (this.vrc.get()) {
            this.f21109nq.jpo(System.currentTimeMillis(), nzb.jpo(this));
        }
    }

    private void sq() {
        if (com.bytedance.sdk.openadsdk.core.oya.my()) {
            return;
        }
        Cif.jpo();
    }

    private boolean uu() {
        return TextUtils.equals(this.f21121yd, "fullscreen_interstitial_ad") || TextUtils.equals(this.f21121yd, "rewarded_video") || TextUtils.equals("open_ad", this.f21121yd) || hmu.jd(this.f21121yd) || TextUtils.equals(this.f21121yd, "embeded_ad");
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.prr
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.jd.zz zzVar = this.rxq;
        if (zzVar != null) {
            if (!this.jpo) {
                zzVar.xyk();
            }
            this.rxq.zz();
            ((au) this.rxq).ju();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.my;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.xyk.jpo(i10), i10);
        }
        tu tuVar = this.f21119va;
        if (tuVar != null) {
            tuVar.jpo(this.f150if, this.f21121yd);
        }
    }

    public long cm() {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.zz.xyk r0 = r12.f21106jj
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.jd(r2)
            com.bytedance.sdk.openadsdk.core.zz.xyk r0 = r12.f21106jj
            int r2 = r13.getSource()
            r0.jpo(r2)
            com.bytedance.sdk.openadsdk.core.zz.xyk r0 = r12.f21106jj
            int r2 = r13.getToolType(r1)
            r0.wqx(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.zz.zz r0 = r12.f21111qk
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.jd(r2)
            com.bytedance.sdk.openadsdk.core.zz.zz r0 = r12.f21111qk
            int r2 = r13.getSource()
            r0.jpo(r2)
            com.bytedance.sdk.openadsdk.core.zz.zz r0 = r12.f21111qk
            int r2 = r13.getToolType(r1)
            r0.wqx(r2)
        L3b:
            int r0 = r13.getActionMasked()
            if (r0 == 0) goto L9a
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L4b
            r3 = 2
            if (r0 == r3) goto L4f
            if (r0 == r1) goto L4d
            r1 = -1
        L4b:
            r5 = r1
            goto Lb0
        L4d:
            r1 = 4
            goto L4b
        L4f:
            float r0 = r12.ree
            float r1 = r13.getX()
            float r4 = r12.ota
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.ree = r1
            float r0 = r12.voc
            float r1 = r13.getY()
            float r4 = r12.wad
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.voc = r1
            float r0 = r13.getX()
            r12.ota = r0
            float r0 = r13.getY()
            r12.wad = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r12.aix
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.ree
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.voc
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
        L96:
            r5 = r2
            goto Lb0
        L98:
            r5 = r3
            goto Lb0
        L9a:
            float r0 = r13.getRawX()
            r12.ota = r0
            float r0 = r13.getRawY()
            r12.wad = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.aix = r2
            com.bytedance.sdk.openadsdk.core.yd.wqx.jpo(r13)
            goto L4b
        Lb0:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.wqx.wqx$jpo> r0 = r12.cql
            if (r0 == 0) goto Lce
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.wqx.wqx$jpo r4 = new com.bytedance.sdk.openadsdk.core.wqx.wqx$jpo
            float r2 = r13.getSize()
            double r6 = (double) r2
            float r2 = r13.getPressure()
            double r8 = (double) r2
            long r10 = java.lang.System.currentTimeMillis()
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r4)
        Lce:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zz.nmd.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean dt() {
        return this.vrc.get();
    }

    public com.bytedance.sdk.openadsdk.cm.qk getAdShowTime() {
        return this.f21109nq;
    }

    public wqx getBrandBannerController() {
        return this.roc;
    }

    public xyk getClickCreativeListener() {
        return this.f21106jj;
    }

    public zz getClickListener() {
        return this.f21111qk;
    }

    public String getClosedListenerKey() {
        return this.duq;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar != null) {
            return cmVar.wqx();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.f21118uu).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.f21113rv).intValue();
    }

    public ef getJsObject() {
        hmu hmuVar = this.f21120ya;
        if (hmuVar != null) {
            return hmuVar.hna();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        yd ydVarPrr;
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (!(cmVar instanceof hmu) || (ydVarPrr = ((hmu) cmVar).prr()) == null) {
            return 0;
        }
        return ydVarPrr.jpo();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.sq.cm().dt();
    }

    public String getUgenTemplateErrorReason() {
        return this.kln;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wqx.jpo.InterfaceC0135jpo
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.cm.zz zzVar = this.f21116tl;
        if (zzVar != null) {
            return zzVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.zz.jj getWebView() {
        hmu hmuVar = this.f21120ya;
        if (hmuVar == null) {
            return null;
        }
        return hmuVar.jpo();
    }

    public void hmu() {
        com.bytedance.sdk.openadsdk.core.ju.wqx.jd jdVar = new com.bytedance.sdk.openadsdk.core.ju.wqx.jd(this.zz, this.f150if);
        this.f21100ef = jdVar;
        jdVar.jpo(this);
        this.f21100ef.jpo(new com.bytedance.sdk.openadsdk.core.ju.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.7
            @Override // com.bytedance.sdk.openadsdk.core.ju.wqx.jpo
            public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
                jpo(view, i10, wqxVar);
            }
        });
    }

    /* renamed from: if */
    public void mo446if() {
        try {
            wqx wqxVar = this.roc;
            if (wqxVar != null) {
                wqxVar.jd();
            }
            tu();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.jd.yd> list = this.f21098dn;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.jd.yd> it = list.iterator();
                while (it.hasNext()) {
                    it.next().jpo();
                }
            }
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f150if);
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jd(this.f150if);
            this.wqx = null;
            this.f21096cm = null;
            this.f21108ju = null;
            this.f150if = null;
            this.my = null;
            this.f21106jj = null;
            this.hna = null;
            this.f21111qk = null;
            com.bytedance.sdk.openadsdk.core.ju.wqx.jd jdVar = this.f21100ef;
            if (jdVar != null) {
                jdVar.cm();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("NativeExpressView", "detach error", th2);
        }
    }

    public void jd() {
    }

    public void jj() {
    }

    public void jpo() {
    }

    public void jr() {
        if (this.f150if == null) {
            return;
        }
        this.f21114se = SystemClock.elapsedRealtime();
        if (this.f150if.jfy()) {
            wqx wqxVar = this.roc;
            if (wqxVar == null) {
                a_(106);
                return;
            } else {
                wqxVar.jpo((com.bytedance.sdk.component.adexpress.jd.prr) this);
                this.roc.jpo();
                return;
            }
        }
        this.sz.jpo();
        yd.jpo jpoVar = this.wcn;
        if (jpoVar != null) {
            jpoVar.jpo(this);
        }
        try {
            this.wcn.jpo();
        } catch (Throwable unused) {
        }
    }

    public int my() {
        return 0;
    }

    public void nmd() {
        try {
            FrameLayout frameLayout = this.f21095au;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.f21095au);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        se();
        pdm();
        getViewTreeObserver().addOnScrollChangedListener(this.f21110pe);
        com.bytedance.sdk.openadsdk.core.zz.jd().jpo(this.duq, this.f21097dm);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.f21110pe);
        com.bytedance.sdk.openadsdk.core.zz.jd().jj(this.duq);
        rv();
        jpo(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        se();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z10 ? getVisibility() : 8);
        }
        se();
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(this.f150if, z10);
        if (z10) {
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f150if, 4);
        } else {
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f150if, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        jpo(i10, true, false);
    }

    public void opi() {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof hmu) {
            if (cmVar == null) {
                return;
            }
            ((hmu) cmVar).xyk();
            com.bytedance.sdk.component.utils.zz.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.6
                @Override // java.lang.Runnable
                public void run() {
                    nmd.this.my(1);
                }
            }, (this.f150if != null ? r0.tu().cm() : 5) * 1000);
        } else if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.qk) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.qk) cmVar).ju();
        }
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
        if (dtVar != null && (cmVarKc = dtVar.kc()) != null && (cmVarJpo = cmVarKc.jpo()) != null) {
            cmVarJpo.jpo(0L);
        }
        if ((this.pdm instanceof com.bytedance.sdk.openadsdk.core.ju.jj.qk) && com.bytedance.sdk.openadsdk.core.model.sq.jpo(this.f150if)) {
            jpo(this.pdm);
        }
    }

    public void qk() {
        this.nmd = new HashSet<>();
        this.huv = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f21108ju;
        if (adSlot != null) {
            this.f21113rv = adSlot.getExpressViewAcceptedWidth();
            this.f21118uu = this.f21108ju.getExpressViewAcceptedHeight();
            au();
            this.xyk = this.f21108ju.getCodeId();
            if (TextUtils.equals(this.f21121yd, "fullscreen_interstitial_ad")) {
                this.f21099dt = this.f150if.rc();
            } else if (TextUtils.equals(this.f21121yd, "rewarded_video")) {
                this.f21099dt = this.f150if.hf();
            } else if (TextUtils.equals(this.f21121yd, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
                if (dtVar == null || dtVar.jd() < 0) {
                    this.f21099dt = com.bytedance.sdk.openadsdk.core.sq.cm().rq(this.xyk);
                } else {
                    this.f21099dt = this.f150if.jd();
                }
                if (this.f21099dt < 0) {
                    this.f21099dt = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.f150if.jfy()) {
            this.roc = new wqx(this.zz, this, this.f150if, this.f21121yd);
            return;
        }
        oya();
        this.f21098dn = new ArrayList();
        prr();
        com.bytedance.sdk.component.adexpress.jd.hna hnaVar = this.sbx;
        if (hnaVar != null) {
            this.f21120ya = (hmu) hnaVar.jd();
        }
        ef jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.jj(this.f21121yd);
        }
    }

    public boolean rq() {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        return cmVar != null && (cmVar instanceof rq);
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.jd.wqx wqxVar) {
        this.hna = wqxVar;
        com.bytedance.sdk.component.adexpress.jd.jj jjVar = this.jkt;
        if (jjVar != null) {
            jjVar.jpo(wqxVar);
        }
    }

    public void setBannerClickClosedListener(qk.jpo jpoVar) {
        this.f21097dm = jpoVar;
    }

    public void setClickCreativeListener(xyk xykVar) {
        this.f21106jj = xykVar;
        if (xykVar != null) {
            xykVar.jpo((jpo.InterfaceC0135jpo) this);
        }
    }

    public void setClickListener(zz zzVar) {
        this.f21111qk = zzVar;
    }

    public void setClosedListenerKey(String str) {
        this.duq = str;
        wqx wqxVar = this.roc;
        if (wqxVar != null) {
            wqxVar.jpo(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.wqx.wqx wqxVar) {
        jpo jpoVar;
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar != null && (cmVar instanceof rq) && (jpoVar = (jpo) cmVar.my()) != null) {
            jpoVar.setDislikeInner(wqxVar);
        }
        wqx wqxVar2 = this.roc;
        if (wqxVar2 != null) {
            wqxVar2.jpo(wqxVar);
        }
        this.wqx = wqxVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.my = pAGExpressAdWrapperListener;
        wqx wqxVar = this.roc;
        if (wqxVar != null) {
            wqxVar.jpo(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        if (this.f21120ya != null && getJsObject() != null) {
            getJsObject().jpo(myVar);
        }
        com.bytedance.sdk.openadsdk.core.ju.jj.cm cmVar = this.hks;
        if (cmVar != null) {
            cmVar.jpo(myVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        jpo jpoVar;
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar != null && (cmVar instanceof rq) && (jpoVar = (jpo) cmVar.my()) != null) {
            jpoVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        wqx wqxVar = this.roc;
        if (wqxVar != null) {
            wqxVar.jpo(tTDislikeDialogAbstract);
        }
        this.f21096cm = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z10) {
        this.f21117tu = z10;
        com.bytedance.sdk.component.adexpress.jd.jd jdVar = this.f21102hx;
        if (jdVar != null && jdVar.jd() != null) {
            this.f21102hx.jd().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(String.valueOf(charSequence));
            jd(i12, i10);
            com.bytedance.sdk.openadsdk.core.ju.wqx.jd jdVar = this.f21100ef;
            if (jdVar != null) {
                jdVar.jpo(i12);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.cm.zz zzVar) {
        this.f21116tl = zzVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar) {
        hmu hmuVar = this.f21120ya;
        if (hmuVar != null) {
            hmuVar.jpo(jdVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.p001if.qk qkVar) {
        if (this.f21120ya == null || getJsObject() == null) {
            return;
        }
        getJsObject().jpo(qkVar);
    }

    public void tu() {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
        if (dtVar == null || (cmVarKc = dtVar.kc()) == null || (cmVarJpo = cmVarKc.jpo()) == null) {
            return;
        }
        cmVarJpo.my(getVideoProgress());
    }

    public long wqx() {
        return 0L;
    }

    public boolean xyk() {
        return true;
    }

    public void yd() {
        hmu hmuVar = this.f21120ya;
        if (hmuVar == null || hmuVar.my() == null) {
            return;
        }
        this.f21120ya.jj();
    }

    public boolean zz() {
        return true;
    }

    public void jd(int i10) {
    }

    public void jj(int i10) {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar == null || !(cmVar instanceof hmu)) {
            return;
        }
        ((hmu) cmVar).jpo(i10);
        this.f21104ii = i10;
    }

    public void jpo(int i10) {
    }

    public void wqx(JSONObject jSONObject) {
    }

    public boolean jd(com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        return true;
    }

    public void jpo(int i10, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
    }

    public void my(int i10) {
        if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(this.f150if)) {
            com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
            if (cmVar instanceof hmu) {
                ((hmu) cmVar).jd(i10);
            }
        }
    }

    public boolean jd(JSONObject jSONObject) {
        return false;
    }

    public void jpo(int i10, String str) {
    }

    public my.jpo wqx(int i10) {
        return new my.jpo(i10);
    }

    public void jpo(au.jpo jpoVar) {
    }

    public void jd(int i10, int i11) {
        int iMin;
        if (TextUtils.equals(this.f21121yd, "banner_ad")) {
            return;
        }
        int i12 = this.f21099dt;
        int i13 = ((i11 < i12 || i12 < 0 || !(this.hmu || TextUtils.equals(this.f21121yd, "open_ad"))) && !((i10 == 0 && TextUtils.equals(this.f21121yd, "open_ad")) || my() == 5)) ? 0 : 1;
        if (i11 <= this.f21099dt) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
            if (dtVar != null && dtVar.ww() != null) {
                iMin = (int) (Math.min(this.f21099dt, this.f150if.ww().jj() * this.f150if.ww().tu()) - i11);
            } else {
                iMin = this.f21099dt - i11;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.jd.jd jdVar = this.f21102hx;
        if (jdVar != null && jdVar.jd() != null) {
            this.f21102hx.jd().setTime(String.valueOf(i10), i13, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.cm) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.cm) cmVar).setTime(String.valueOf(i10), i13, iMin, false);
        }
    }

    public void jpo(String str, JSONObject jSONObject) {
    }

    public void jpo(boolean z10, String str) {
    }

    public boolean jpo(JSONObject jSONObject) {
        return false;
    }

    public void jpo(int i10, boolean z10, boolean z11) {
        this.f21115sq = z10;
        removeCallbacks(this.fy);
        removeCallbacks(this.f21103ic);
        if (i10 == 0) {
            if (z11) {
                this.f21103ic.run();
                return;
            } else {
                postDelayed(this.f21103ic, 50L);
                return;
            }
        }
        if (z11) {
            this.fy.run();
        } else {
            postDelayed(this.fy, 50L);
        }
    }

    public void jd(int i10, String str) throws JSONException {
        ef efVarHna;
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if (cmVar == null || !(cmVar instanceof hmu) || (efVarHna = ((hmu) cmVar).hna()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DTBMetricReport.TIME, i10);
            jSONObject.put("flag", str);
            efVarHna.jpo("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.nmd.jpo("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || wqxVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (rv.wqx(this.f150if)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.hna hnaVar = (com.bytedance.sdk.openadsdk.core.model.hna) wqxVar;
        if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(this.f150if)) {
            try {
                JSONObject jSONObject2 = hnaVar.f20650au;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx(th2.toString(), new Object[0]);
            }
        }
        xyk xykVar = this.f21106jj;
        if (xykVar != null) {
            xykVar.cm(getDynamicShowType());
            this.f21106jj.jpo(map);
        }
        zz zzVar = this.f21111qk;
        if (zzVar != null) {
            zzVar.cm(getDynamicShowType());
            this.f21111qk.jpo(map);
        }
        float f10 = hnaVar.jpo;
        float f11 = hnaVar.f20652jd;
        float f12 = hnaVar.wqx;
        float f13 = hnaVar.f20651cm;
        boolean z10 = hnaVar.f20654ju;
        SparseArray<wqx.jpo> sparseArray = hnaVar.f20656yd;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.cql;
        }
        SparseArray<wqx.jpo> sparseArray2 = sparseArray;
        String str = hnaVar.f20655qk;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectJpo = view != this ? jpo(view) : null;
            view2 = view;
        }
        hnaVar.xyk = i10;
        if (jSONObjectJpo != null && hnaVar.zz == null) {
            hnaVar.zz = jSONObjectJpo;
        }
        if (i10 != 13) {
            switch (i10) {
                case 1:
                    FrameLayout frameLayout = this.f21095au;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.dt dtVar = this.f150if;
                    if (dtVar == null || dtVar.hks() != 1 || z10) {
                        zz zzVar2 = this.f21111qk;
                        if (zzVar2 != null) {
                            zzVar2.jpo(hnaVar);
                            this.f21111qk.jpo(str);
                            this.f21111qk.jpo(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.my;
                        if (pAGExpressAdWrapperListener != null && !hnaVar.oya) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (hnaVar.f127if > 0) {
                        duq.jpo(true);
                    }
                    xyk xykVar2 = this.f21106jj;
                    if (xykVar2 != null) {
                        xykVar2.jpo(hnaVar);
                        this.f21106jj.jpo(str);
                        if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(this.f150if) && (jSONObject = hnaVar.f20650au) != null) {
                            this.f21106jj.cm(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.f21106jj.jpo(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.my;
                    if (pAGExpressAdWrapperListener2 != null && !hnaVar.oya) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    duq.jpo(false);
                    com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f150if, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f21096cm;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                        break;
                    } else {
                        com.bytedance.sdk.openadsdk.wqx.wqx wqxVar2 = this.wqx;
                        if (wqxVar2 != null) {
                            wqxVar2.jpo();
                            break;
                        } else {
                            TTDelegateActivity.jpo(this.f150if, this.duq);
                            break;
                        }
                    }
                case 4:
                    FrameLayout frameLayout2 = this.f21095au;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = this.f150if;
                    if (dtVar2 == null || dtVar2.hks() != 1 || z10) {
                        tic.wqx(this.f150if);
                        if ("embeded_ad".equals(this.f21121yd) && hx() && !this.oya && tic.wqx(this.f150if)) {
                            xyk xykVar3 = this.f21106jj;
                            if (xykVar3 != null) {
                                xykVar3.jpo(hnaVar);
                                this.f21106jj.jpo(str);
                                this.f21106jj.jpo(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        } else {
                            zz zzVar3 = this.f21111qk;
                            if (zzVar3 != null) {
                                zzVar3.jpo(hnaVar);
                                this.f21111qk.jpo(str);
                                this.f21111qk.jpo(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.my;
                        if (pAGExpressAdWrapperListener3 != null && !hnaVar.oya) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    jpo(!this.f21117tu, "dynamicClick");
                    break;
                case 6:
                    jpo();
                    break;
                case 7:
                    TTWebsiteActivity.jpo(this.zz, this.f150if, this.f21121yd);
                    break;
            }
            return;
        }
        int i11 = hnaVar.prr;
        if (i11 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i11);
                jpo(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public void ju() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void onvideoComplate() {
    }

    public void qk(int i10) {
        com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar = this.pdm;
        if ((cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.qk) && i10 == 4) {
            ((com.bytedance.sdk.openadsdk.core.ju.jj.qk) cmVar).yd();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.cm
    public void setTimeUpdate(int i10) {
    }

    public nmd(Context context, com.bytedance.sdk.openadsdk.core.model.dt dtVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.jpo = true;
        this.f21105jd = 0;
        this.f21121yd = "embeded_ad";
        this.xyk = null;
        this.prr = false;
        this.f21115sq = true;
        this.opi = -1;
        this.kln = "";
        this.f21117tu = false;
        this.tic = true;
        this.f21099dt = -1;
        this.f21109nq = new com.bytedance.sdk.openadsdk.cm.qk();
        this.f21114se = 0L;
        this.vrc = new AtomicBoolean(false);
        this.f21110pe = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                nmd nmdVar = nmd.this;
                if (nmdVar.f21115sq && nmdVar.zz()) {
                    nmd.this.se();
                    nmd nmdVar2 = nmd.this;
                    nmdVar2.removeCallbacks(nmdVar2.xk);
                    nmd nmdVar3 = nmd.this;
                    nmdVar3.postDelayed(nmdVar3.xk, 500L);
                }
            }
        };
        this.xk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.2
            @Override // java.lang.Runnable
            public void run() {
                if (!nzb.jpo(nmd.this, 0, 5, false)) {
                    nmd.this.jj(8);
                } else {
                    nmd nmdVar = nmd.this;
                    nmdVar.jj(nmdVar.getVisibility());
                }
            }
        };
        this.f21103ic = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.3
            @Override // java.lang.Runnable
            public void run() {
                nmd.this.jj(0);
            }
        };
        this.fy = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.nmd.4
            @Override // java.lang.Runnable
            public void run() {
                nmd.this.jj(8);
            }
        };
        this.f21104ii = 8;
        this.cql = new SparseArray<>();
        this.ota = -1.0f;
        this.wad = -1.0f;
        this.ree = -1.0f;
        this.voc = -1.0f;
        this.aix = 0L;
        this.f21121yd = str;
        this.zz = context;
        this.f150if = dtVar;
        this.f21108ju = adSlot;
        this.f21117tu = z10;
        this.tic = z11;
        qk();
    }

    public static JSONObject jpo(View view) throws JSONException {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jd.cm<? extends View> cmVar, com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        com.bytedance.sdk.openadsdk.core.model.dt dtVar;
        this.vrc.set(true);
        this.pdm = cmVar;
        cmVar.wqx();
        if (this.f21104ii != getWindowVisibility() && xyk()) {
            jj(getWindowVisibility());
        }
        if (cmVar.wqx() == 3 && (dtVar = this.f150if) != null && dtVar.jkt() == 1) {
            this.f150if.xyk(0);
        }
        if (cmVar.wqx() != 1) {
            View viewMy = cmVar.my();
            if (viewMy.getParent() != null) {
                ((ViewGroup) viewMy.getParent()).removeView(viewMy);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.zz.jj) {
                    removeView((View) arrayList.get(i11));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.nmd.wqx(this.f150if)) {
                addView(cmVar.my(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(cmVar.my());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.dt dtVar2 = this.f150if;
        if (dtVar2 != null) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo(dtVar2.xyk(), this.f21114se, this.f21121yd, cmVar.wqx());
        }
        com.bytedance.sdk.component.adexpress.jd.zz zzVar = this.rxq;
        if (zzVar != null) {
            ((au) zzVar).ju();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.my;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) oyaVar.wqx(), (float) oyaVar.cm());
        }
        if ((this.pdm instanceof com.bytedance.sdk.openadsdk.core.ju.jj.qk) && com.bytedance.sdk.openadsdk.core.model.sq.jpo(this.f150if)) {
            hmu();
        }
        if (jd(oyaVar)) {
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this, this.f150if, wqx(getDynamicShowType()));
        }
        tu tuVar = this.f21119va;
        if (tuVar != null) {
            tuVar.jpo(this.f150if, this.f21121yd);
        }
    }

    public JSONObject jpo(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.dt dtVar) throws JSONException {
        if (!(this.pdm instanceof hmu)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (dtVar != null) {
                if (dtVar.vzb() != null && dtVar.vzb().m469if()) {
                    jSONObject.put("engine_version", dtVar.vzb().ju());
                } else if (dtVar.jrx() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jd.cm cmVar) {
        if (this.f21100ef == null) {
            return;
        }
        try {
            if (cmVar instanceof com.bytedance.sdk.openadsdk.core.ju.jj.qk) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.ju.jj.qk) cmVar).jj().ju();
                this.f21112rq = viewGroup;
                if (viewGroup != null) {
                    this.f21100ef.jd();
                    View viewWqx = this.f21100ef.wqx();
                    if (viewWqx != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewWqx.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewWqx);
                        }
                        this.f21112rq.addView(viewWqx, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        if (dtVar == null) {
            return;
        }
        this.f21121yd = str;
        this.f150if = dtVar;
        this.f21108ju = adSlot;
        this.f21117tu = z10;
        this.tic = z11;
        int iTl = dtVar.tl();
        this.f21105jd = iTl;
        if (iTl != 10) {
            return;
        }
        this.nzb = true;
        qk();
        jr();
        this.nzb = false;
    }
}
