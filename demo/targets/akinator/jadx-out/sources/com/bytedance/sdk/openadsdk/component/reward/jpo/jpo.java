package com.bytedance.sdk.openadsdk.component.reward.jpo;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.component.reward.view.Cif;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.nmd;
import com.bytedance.sdk.openadsdk.utils.zz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public com.bytedance.sdk.openadsdk.utils.oya aix;

    /* renamed from: au, reason: collision with root package name */
    public final AtomicBoolean f19904au;
    public int cgn;

    /* renamed from: cm, reason: collision with root package name */
    public final boolean f19905cm;
    public long cql;
    public boolean cz;

    /* renamed from: dm, reason: collision with root package name */
    public final my f19906dm;

    /* renamed from: dn, reason: collision with root package name */
    public boolean f19907dn;

    /* renamed from: dt, reason: collision with root package name */
    public final AtomicBoolean f19908dt;
    public final Cif duq;

    /* renamed from: ef, reason: collision with root package name */
    public final hna f19909ef;
    public boolean erj;

    /* renamed from: et, reason: collision with root package name */
    public boolean f19910et;
    public String fy;
    public boolean gmx;
    public int hks;
    public final prr hmu;
    public final AtomicBoolean hna;
    public boolean huv;

    /* renamed from: hx, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.view.yd f19911hx;

    /* renamed from: ic, reason: collision with root package name */
    public final boolean f19912ic;

    /* renamed from: if, reason: not valid java name */
    public final AtomicBoolean f107if;

    /* renamed from: ii, reason: collision with root package name */
    public boolean f19913ii;

    /* renamed from: jd, reason: collision with root package name */
    public dt f19914jd;

    /* renamed from: jj, reason: collision with root package name */
    public final int f19915jj;
    public float jkt;
    public final int jpo;

    /* renamed from: jr, reason: collision with root package name */
    public final AtomicBoolean f19916jr;

    /* renamed from: ju, reason: collision with root package name */
    public final AtomicBoolean f19917ju;

    /* renamed from: kb, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.wqx f19918kb;
    public com.bytedance.sdk.openadsdk.p001if.zz kln;
    public final String my;
    public final AtomicBoolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    public final cm f19919nq;
    public final au nzb;
    public final AtomicBoolean opi;
    public com.bytedance.sdk.openadsdk.common.au ota;
    public final AtomicBoolean oya;
    public final ju pdm;

    /* renamed from: pe, reason: collision with root package name */
    public final Context f19920pe;
    public final AtomicBoolean prr;

    /* renamed from: qk, reason: collision with root package name */
    public final boolean f19921qk;
    public com.bytedance.sdk.openadsdk.component.reward.jd.jd ree;
    public final com.bytedance.sdk.openadsdk.core.au.cm.jd roc;

    /* renamed from: rq, reason: collision with root package name */
    public final AtomicBoolean f19922rq;

    /* renamed from: rv, reason: collision with root package name */
    public final yd f19923rv;
    public boolean rxq;
    public int sbx;

    /* renamed from: se, reason: collision with root package name */
    public final xyk f19924se;

    /* renamed from: sg, reason: collision with root package name */
    public boolean f19925sg;

    /* renamed from: sq, reason: collision with root package name */
    public final AtomicBoolean f19926sq;
    public final wqx sz;
    public final Cif tic;

    /* renamed from: tl, reason: collision with root package name */
    public boolean f19927tl;

    /* renamed from: tu, reason: collision with root package name */
    public final AtomicBoolean f19928tu;
    public boolean umr;

    /* renamed from: uu, reason: collision with root package name */
    public final jj f19929uu;
    public com.bytedance.sdk.openadsdk.activity.xyk ux;

    /* renamed from: va, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.view.zz f19930va;

    /* renamed from: vk, reason: collision with root package name */
    public boolean f19931vk;
    public boolean voc;
    public final Activity vrc;
    public boolean wad;
    public int wcn;
    public final boolean wqx;

    /* renamed from: wu, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.ju f19932wu;
    public final hx xk;
    public int xyk;

    /* renamed from: ya, reason: collision with root package name */
    public boolean f19933ya;

    /* renamed from: yd, reason: collision with root package name */
    public final AtomicBoolean f19934yd;
    private long ykp;

    /* renamed from: yq, reason: collision with root package name */
    private long f19935yq;
    public int zz;

    public jpo(Activity activity, hx hxVar, dt dtVar, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, int i10) {
        this(activity, hxVar, dtVar, jdVar, i10, null);
    }

    public boolean cm() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        return !this.f19927tl || (xykVar = this.ux) == null || !(xykVar instanceof com.bytedance.sdk.openadsdk.activity.my) || ((com.bytedance.sdk.openadsdk.activity.my) xykVar).jpo;
    }

    public void jd() {
        if (this.f19935yq <= 0) {
            this.f19935yq = SystemClock.elapsedRealtime();
        }
        this.ykp = (SystemClock.elapsedRealtime() - this.f19935yq) + this.ykp;
    }

    public Map<String, Object> jj() {
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = this.f19911hx;
        if (ydVar != null) {
            map.put("dynamic_show_type", Integer.valueOf(ydVar.ju()));
            JSONObject jSONObjectJpo = this.f19911hx.jpo((JSONObject) null);
            if (jSONObjectJpo != null) {
                Iterator<String> itKeys = jSONObjectJpo.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectJpo.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public void jpo(boolean z10) {
        this.f19910et = z10;
        this.duq.cm(z10);
    }

    public com.bytedance.sdk.openadsdk.cm.qk my() {
        if (!this.f19914jd.jj()) {
            com.bytedance.sdk.openadsdk.cm.qk qkVar = new com.bytedance.sdk.openadsdk.cm.qk();
            qkVar.jpo(System.currentTimeMillis(), 1.0f);
            return qkVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = this.f19911hx;
        if (ydVar != null && ydVar.jpo() != null) {
            return this.f19911hx.jpo().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.cm.qk qkVar2 = new com.bytedance.sdk.openadsdk.cm.qk();
        qkVar2.jpo(System.currentTimeMillis(), 1.0f);
        return qkVar2;
    }

    public long wqx() {
        return (SystemClock.elapsedRealtime() - this.f19935yq) + this.ykp;
    }

    public jpo(Activity activity, hx hxVar, dt dtVar, com.bytedance.sdk.openadsdk.core.au.cm.jd jdVar, int i10, jpo jpoVar) {
        this.xyk = 0;
        this.zz = 0;
        this.f19934yd = new AtomicBoolean(false);
        this.f19917ju = new AtomicBoolean(false);
        this.f107if = new AtomicBoolean(false);
        this.f19904au = new AtomicBoolean(false);
        this.oya = new AtomicBoolean(false);
        this.prr = new AtomicBoolean(false);
        this.hna = new AtomicBoolean(false);
        this.f19926sq = new AtomicBoolean(false);
        this.opi = new AtomicBoolean(false);
        this.f19916jr = new AtomicBoolean(false);
        this.nmd = new AtomicBoolean(false);
        this.f19922rq = new AtomicBoolean(false);
        this.f19928tu = new AtomicBoolean(false);
        this.f19908dt = new AtomicBoolean(false);
        this.f19933ya = false;
        this.sbx = 1;
        this.cql = 0L;
        this.ux = null;
        this.f19925sg = true;
        this.cz = false;
        this.umr = false;
        this.vrc = activity;
        this.roc = jdVar;
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        this.f19920pe = contextJpo;
        this.f19914jd = dtVar;
        this.jpo = i10;
        this.gmx = jpoVar != null;
        this.voc = i10 == 0 || i10 == 1;
        this.f19912ic = i10 == 0 || i10 == 2;
        this.xk = hxVar;
        boolean z10 = dtVar.gmx().getDurationSlotType() == 7;
        this.f19905cm = z10;
        this.my = z10 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.wad = dtVar.jj();
        this.f19921qk = nmd.au(dtVar);
        int iJl = dtVar.jl();
        this.f19915jj = iJl;
        this.huv = com.bytedance.sdk.openadsdk.core.sq.cm().hna(String.valueOf(iJl));
        this.wqx = com.bytedance.sdk.openadsdk.core.settings.au.jrx().au(String.valueOf(iJl));
        this.pdm = new ju(this);
        this.tic = i10 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.au(this) : dtVar.jj() ? new Cif(this) : new com.bytedance.sdk.openadsdk.component.reward.view.ju(this);
        this.f19930va = new com.bytedance.sdk.openadsdk.component.reward.view.zz(this);
        this.hmu = new prr(this);
        this.f19919nq = new cm(this);
        this.f19924se = new xyk(this, dtVar);
        com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = jpoVar != null ? jpoVar.f19911hx : new com.bytedance.sdk.openadsdk.component.reward.view.yd(this);
        this.f19911hx = ydVar;
        ydVar.jpo(this);
        this.f19909ef = new hna(this);
        this.nzb = new au(this);
        this.duq = new Cif(this);
        this.f19906dm = new my(this);
        this.f19923rv = new yd(this);
        jj jjVar = jpoVar != null ? jpoVar.f19929uu : new jj(this);
        this.f19929uu = jjVar;
        jjVar.jpo(this);
        this.sz = new wqx(this);
        this.kln = new com.bytedance.sdk.openadsdk.p001if.zz(contextJpo);
        this.aix = com.bytedance.sdk.openadsdk.utils.zz.jpo(activity, new zz.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jpo.jpo.1
            @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
            public void jd() {
                Cif cif = jpo.this.duq;
                if (cif != null) {
                    cif.my();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zz.jpo
            public View jpo() {
                Cif cif = jpo.this.tic;
                if (cif != null) {
                    return cif.yd();
                }
                return null;
            }
        });
    }

    public void jpo() {
        this.f19935yq = SystemClock.elapsedRealtime();
    }
}
