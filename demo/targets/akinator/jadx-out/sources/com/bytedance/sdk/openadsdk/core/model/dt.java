package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class dt {

    /* renamed from: cm, reason: collision with root package name */
    public static final String f20575cm;

    /* renamed from: jd, reason: collision with root package name */
    public static final String f20576jd;

    /* renamed from: ju, reason: collision with root package name */
    protected static int f20577ju;
    public static final String wqx;
    private int aix;

    /* renamed from: al, reason: collision with root package name */
    private int f20578al;

    /* renamed from: au, reason: collision with root package name */
    public long f20580au;
    private boolean aub;
    private String bhu;
    private int cgn;

    /* renamed from: cj, reason: collision with root package name */
    private int f20581cj;
    private JSONObject cmw;
    private JSONObject cnl;

    /* renamed from: cu, reason: collision with root package name */
    private pdm f20582cu;
    private jr cyx;
    private boolean cz;

    /* renamed from: dd, reason: collision with root package name */
    private String f20583dd;

    /* renamed from: dm, reason: collision with root package name */
    private opi f20584dm;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.model.jpo f20586dt;
    private int duq;

    /* renamed from: eb, reason: collision with root package name */
    private String f20587eb;

    /* renamed from: ef, reason: collision with root package name */
    private int f20588ef;
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd erj;

    /* renamed from: et, reason: collision with root package name */
    private String f20590et;

    /* renamed from: ew, reason: collision with root package name */
    private PAGBannerSize f20591ew;
    private xyk eye;

    /* renamed from: fc, reason: collision with root package name */
    private rq f20592fc;

    /* renamed from: fp, reason: collision with root package name */
    private int f20593fp;
    private String fri;
    private sq fxd;
    private String fy;
    private kln gdx;
    private int gmx;
    private com.bytedance.sdk.openadsdk.core.ju.xyk.jpo gox;
    private prr gs;
    private String gum;
    private int gy;
    private com.bytedance.sdk.openadsdk.core.p000if.jpo hd;

    /* renamed from: hk, reason: collision with root package name */
    private String f20595hk;
    private String hks;
    private String hmu;
    private String huv;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f20596hx;

    /* renamed from: ic, reason: collision with root package name */
    private String f20597ic;
    private int iqh;
    private boolean jfy;
    private au jkt;

    /* renamed from: jr, reason: collision with root package name */
    private String f20602jr;
    private int jrx;

    /* renamed from: kb, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd f20603kb;
    private int kfv;
    private AdSlot kgu;

    /* renamed from: ll, reason: collision with root package name */
    private qk f20605ll;

    /* renamed from: mg, reason: collision with root package name */
    private int f20607mg;
    private boolean nes;
    private hmu nmd;

    /* renamed from: nq, reason: collision with root package name */
    private String f20609nq;
    private int nzb;

    /* renamed from: oc, reason: collision with root package name */
    private String f20610oc;

    /* renamed from: oo, reason: collision with root package name */
    private rv f20611oo;
    private my opi;

    /* renamed from: ou, reason: collision with root package name */
    private oya f20612ou;
    private int pdm;
    private volatile boolean pve;
    private JSONObject pzk;

    /* renamed from: ql, reason: collision with root package name */
    private int f20615ql;
    private uu rqu;
    private String rxq;
    private String rzi;
    private jj sbx;

    /* renamed from: se, reason: collision with root package name */
    private int f20618se;

    /* renamed from: sg, reason: collision with root package name */
    private boolean f20619sg;

    /* renamed from: sn, reason: collision with root package name */
    private JSONObject f20620sn;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f20621sq;
    private String ss;
    private String sue;
    private boolean sy;
    private int ted;
    private opi tic;

    /* renamed from: tl, reason: collision with root package name */
    private int f20623tl;

    /* renamed from: tu, reason: collision with root package name */
    private String f20624tu;
    private String uhu;
    private int umr;
    private boolean ux;

    /* renamed from: va, reason: collision with root package name */
    private String f20626va;
    private int vbt;

    /* renamed from: vk, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd f20627vk;
    private long voc;
    private String vrc;

    /* renamed from: vt, reason: collision with root package name */
    private int f20628vt;
    private se wck;
    private int wcn;
    private String woc;

    /* renamed from: wu, reason: collision with root package name */
    private boolean f20630wu;
    private boolean xfa;
    private String xk;
    private String xur;
    protected int xyk;

    /* renamed from: ya, reason: collision with root package name */
    private String f20633ya;

    /* renamed from: ye, reason: collision with root package name */
    private boolean f20635ye;
    private jpo ykp;

    /* renamed from: yq, reason: collision with root package name */
    private Map<String, Object> f20636yq;
    private com.bytedance.sdk.openadsdk.core.ju.xyk.jpo yxp;
    private String zmh;
    private String zpa;

    /* renamed from: zq, reason: collision with root package name */
    private int f20637zq;
    private int zrw;

    /* renamed from: zw, reason: collision with root package name */
    private JSONObject f20638zw;
    protected long zz;
    private long hna = 0;
    protected boolean jpo = false;
    protected boolean my = com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo;

    /* renamed from: jj, reason: collision with root package name */
    protected int f20600jj = com.bytedance.sdk.openadsdk.hmu.jpo.wqx.f21173jd;

    /* renamed from: qk, reason: collision with root package name */
    protected String f20614qk = com.bytedance.sdk.openadsdk.hmu.jpo.wqx.wqx;

    /* renamed from: rq, reason: collision with root package name */
    private int f20616rq = -1;

    /* renamed from: yd, reason: collision with root package name */
    protected int f20634yd = 0;

    /* renamed from: rv, reason: collision with root package name */
    private final List<opi> f20617rv = new ArrayList();

    /* renamed from: uu, reason: collision with root package name */
    private final List<String> f20625uu = new ArrayList();
    private final List<FilterWord> sz = new ArrayList();
    private final dm kln = dm.wqx();

    /* renamed from: if, reason: not valid java name */
    public boolean f125if = false;
    private List<String> roc = new ArrayList();

    /* renamed from: pe, reason: collision with root package name */
    private List<String> f20613pe = new ArrayList();

    /* renamed from: dn, reason: collision with root package name */
    private String f20585dn = "0";

    /* renamed from: ii, reason: collision with root package name */
    private String f20599ii = "";
    private int cql = 0;
    private int ota = 2;
    private int wad = -1;
    private int ree = 0;

    /* renamed from: eq, reason: collision with root package name */
    private int f20589eq = 0;

    /* renamed from: np, reason: collision with root package name */
    private int f20608np = 1;
    private ju vzb = new ju();

    /* renamed from: gf, reason: collision with root package name */
    private int f20594gf = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int ez = 0;

    /* renamed from: lq, reason: collision with root package name */
    private int f20606lq = 1;

    /* renamed from: ww, reason: collision with root package name */
    private int f20631ww = 0;

    /* renamed from: as, reason: collision with root package name */
    private int f20579as = 0;
    private int czp = 0;
    private int fgt = 1;
    private int kye = 1;
    private float iwg = 100.0f;
    private int ozw = 2;

    /* renamed from: xp, reason: collision with root package name */
    private int f20632xp = 1;
    private int clt = 0;
    private int afh = -1;
    private long smo = -1;
    private int bl = 0;

    /* renamed from: ig, reason: collision with root package name */
    private int f20598ig = Integer.MIN_VALUE;
    private boolean pez = false;
    private int zuz = 0;

    /* renamed from: tj, reason: collision with root package name */
    private int f20622tj = 50;
    private int svi = -1;

    /* renamed from: wo, reason: collision with root package name */
    private final jd f20629wo = new jd();

    /* renamed from: kn, reason: collision with root package name */
    private boolean f20604kn = false;
    private com.bytedance.sdk.openadsdk.hmu.jpo.jd cxb = null;
    protected int oya = -1;
    protected int prr = -1;

    /* renamed from: jp, reason: collision with root package name */
    private float f20601jp = -1.0f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo {

        /* renamed from: au, reason: collision with root package name */
        private String f20639au;

        /* renamed from: cm, reason: collision with root package name */
        private String f20640cm;

        /* renamed from: if, reason: not valid java name */
        private String f126if;

        /* renamed from: jd, reason: collision with root package name */
        private String f20641jd;

        /* renamed from: jj, reason: collision with root package name */
        private String f20642jj;
        private String jpo;

        /* renamed from: ju, reason: collision with root package name */
        private String f20643ju;
        private String my;
        private String oya;

        /* renamed from: qk, reason: collision with root package name */
        private String f20644qk;
        private String wqx;
        private List<Integer> xyk;

        /* renamed from: yd, reason: collision with root package name */
        private String f20645yd;
        private String zz;

        public static com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jd(jpo jpoVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.ju.xyk.jpo().jpo(jpoVar.cm()).jd(jpoVar.oya()).wqx(jpoVar.au()).cm(jpoVar.prr()).my(str);
        }

        public static com.bytedance.sdk.component.adexpress.jpo.wqx.cm jpo(jpo jpoVar, String str) {
            return com.bytedance.sdk.component.adexpress.jpo.wqx.cm.jpo().jpo(jpoVar.cm()).jd(jpoVar.my()).wqx(jpoVar.jj()).cm(jpoVar.qk()).my(jpoVar.wqx()).jj(str);
        }

        public String au() {
            return this.f126if;
        }

        public String cm() {
            return this.jpo;
        }

        /* renamed from: if, reason: not valid java name */
        public boolean m469if() {
            return !TextUtils.isEmpty(this.f20645yd) && this.f20645yd.equals("v3");
        }

        public String jj() {
            return this.wqx;
        }

        public String ju() {
            return this.f20645yd;
        }

        public String my() {
            return this.f20641jd;
        }

        public String oya() {
            return this.f20639au;
        }

        public String prr() {
            return this.oya;
        }

        public String qk() {
            return this.f20640cm;
        }

        public String wqx() {
            return this.f20642jj;
        }

        public String xyk() {
            return this.my;
        }

        public String yd() {
            return this.f20643ju;
        }

        public String zz() {
            return this.f20644qk;
        }

        public void au(String str) {
            this.oya = str;
        }

        public void cm(String str) {
            this.f20641jd = str;
        }

        /* renamed from: if, reason: not valid java name */
        public void m468if(String str) {
            this.f20639au = str;
        }

        public void jj(String str) {
            this.f20640cm = str;
        }

        public void ju(String str) {
            this.f126if = str;
        }

        public void my(String str) {
            this.wqx = str;
        }

        public void qk(String str) {
            this.my = str;
        }

        public void wqx(String str) {
            this.jpo = str;
        }

        public void xyk(String str) {
            this.f20644qk = str;
        }

        public void yd(String str) {
            this.f20645yd = str;
        }

        public void zz(String str) {
            this.f20643ju = str;
        }

        public String jd() {
            return this.zz;
        }

        public void jd(String str) {
            this.f20642jj = str;
        }

        public List<Integer> jpo() {
            return this.xyk;
        }

        public void jpo(List<Integer> list) {
            this.xyk = list;
        }

        public void jpo(String str) {
            this.zz = str;
        }
    }

    static {
        CharSequence[] charSequenceArr = {"is", tic.rv()};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr[0]);
        sb2.append((CharSequence) "_");
        sb2.append(charSequenceArr[1]);
        f20576jd = sb2.toString();
        CharSequence[] charSequenceArr2 = {"is", tic.rv(), "sample"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr2[0]);
        for (int i10 = 1; i10 < 3; i10++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[i10]);
        }
        wqx = sb3.toString();
        CharSequence[] charSequenceArr3 = {tic.rv(), "strategy"};
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequenceArr3[0]);
        sb4.append((CharSequence) "_");
        sb4.append(charSequenceArr3[1]);
        f20575cm = sb4.toString();
        f20577ju = 330;
    }

    public dt() {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.model.jpo();
        this.f20586dt = jpoVar;
        jpoVar.jpo(this);
    }

    public static boolean jkt(int i10) {
        return i10 == 44 || i10 == 43 || i10 == 30 || i10 == 40 || i10 == 41 || i10 == 39;
    }

    private com.bytedance.sdk.openadsdk.core.ju.xyk.jpo lbb() {
        kln klnVarJrx = jrx();
        if (klnVarJrx == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.ju.xyk.jpo().jpo(klnVarJrx.jpo()).jd(klnVarJrx.jd()).wqx(klnVarJrx.wqx()).cm(klnVarJrx.cm()).my(jl() + "_v3");
    }

    private com.bytedance.sdk.openadsdk.core.ju.xyk.jpo ub() {
        jpo jpoVarVzb = vzb();
        if (jpoVarVzb == null) {
            return null;
        }
        return jpo.jd(jpoVarVzb, String.valueOf(jl()));
    }

    private static double zz(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public boolean aaf() {
        return cxb() == 3 || cxb() == 4;
    }

    public String afh() {
        return this.zmh;
    }

    public int aix() {
        return this.czp;
    }

    public prr al() {
        return this.gs;
    }

    public String as() {
        return this.hks;
    }

    public boolean au() {
        return this.f20596hx;
    }

    public JSONObject aub() {
        return this.cnl;
    }

    public boolean aul() {
        return gmx() != null && gmx().getDurationSlotType() == 8 && jfy();
    }

    public long ax() {
        return this.zz;
    }

    public int axn() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm = cm();
        if (jpoVarCm != null && jpoVarCm.m472if() != null) {
            return jpoVarCm.m472if().zz();
        }
        if (gmx() != null) {
            strValueOf = gmx().getCodeId();
        } else {
            int iJl = jl();
            strValueOf = iJl != 0 ? String.valueOf(iJl) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sq.cm().opi(strValueOf);
        }
        return 5;
    }

    public int bhu() {
        return this.aix;
    }

    public boolean biu() {
        return this.f125if;
    }

    public boolean bl() {
        return !ig() && woc() == 1;
    }

    public boolean by() {
        hmu hmuVar = this.nmd;
        return hmuVar != null && hmuVar.jpo() > 0;
    }

    public boolean cgk() {
        return true;
    }

    public int cgn() {
        return this.duq;
    }

    public boolean ci() {
        int i10 = this.duq;
        return i10 == 44 || i10 == 43;
    }

    public int cj() {
        return this.gy;
    }

    public String clt() {
        if (!TextUtils.isEmpty(this.fy)) {
            return this.fy;
        }
        Context contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo();
        int iPzk = pzk();
        if (iPzk != 2 && iPzk != 3) {
            if (iPzk == 4) {
                return contextJpo != null ? com.bytedance.sdk.component.utils.dt.jpo(contextJpo, "tt_video_download_apk") : this.fy;
            }
            if (iPzk != 8) {
                return this.fy;
            }
        }
        return contextJpo != null ? com.bytedance.sdk.component.utils.dt.jpo(contextJpo, "tt_video_mobile_go_detail") : this.fy;
    }

    public com.bytedance.sdk.openadsdk.core.model.jpo cm() {
        return this.f20586dt;
    }

    public int cmw() {
        return this.ted;
    }

    public au cnl() {
        return this.jkt;
    }

    public boolean co() {
        int i10 = this.nzb;
        return (i10 == 2 || i10 == 1) && 3 == this.f20588ef;
    }

    public int cql() {
        int i10 = this.nzb;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (aul()) {
            return 2;
        }
        return this.ota;
    }

    public int cu() {
        return this.f20615ql;
    }

    public my cw() {
        return this.opi;
    }

    public int cxb() {
        if (this.afh < 0) {
            JSONObject jSONObjectEb = eb();
            if (jSONObjectEb != null) {
                this.afh = jSONObjectEb.optInt("ad_slot_type", 0);
            } else {
                this.afh = 0;
            }
        }
        return this.afh;
    }

    public boolean cyx() {
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar = this.erj;
        return jdVar == null || jdVar.jr() != 1;
    }

    public int cz() {
        return this.jrx;
    }

    public String czp() {
        return this.f20633ya;
    }

    public boolean dd() {
        return this.iqh == 1;
    }

    public int dm() {
        try {
            JSONObject jSONObjectEb = eb();
            if (jSONObjectEb != null) {
                return jSONObjectEb.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public long dn() {
        qk qkVar = this.f20605ll;
        if (qkVar == null) {
            return 0L;
        }
        return qkVar.wqx();
    }

    public List<dt> dsh() {
        return this.f20586dt.cm();
    }

    public boolean dt() {
        return this.sy;
    }

    public boolean duq() {
        return this.nes;
    }

    public JSONObject eb() {
        if (this.f20638zw == null) {
            try {
                if (!TextUtils.isEmpty(this.f20590et)) {
                    this.f20638zw = new JSONObject(this.f20590et);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("MaterialMeta", e10.getMessage());
            }
        }
        return this.f20638zw;
    }

    public boolean eet() {
        return this.my;
    }

    public boolean ef() {
        return this.jfy;
    }

    public boolean eq() {
        return rzi() == 100 || this.nzb == 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dt.class == obj.getClass()) {
            dt dtVar = (dt) obj;
            if (this.f20585dn.equals(dtVar.fc()) && this.f20590et.equals(dtVar.fxd())) {
                return true;
            }
        }
        return false;
    }

    public int erj() {
        return this.f20608np;
    }

    public String et() {
        return this.f20599ii;
    }

    public int eto() {
        return this.f20600jj;
    }

    public int ew() {
        return this.clt;
    }

    public com.bytedance.sdk.component.zz.jd.jpo eye() {
        com.bytedance.sdk.component.zz.jd.jpo jpoVar = new com.bytedance.sdk.component.zz.jd.jpo();
        jpoVar.jpo(this.umr);
        jpoVar.jd(this.f20585dn);
        jpoVar.jpo(fxd());
        return jpoVar;
    }

    public int ez() {
        JSONObject jSONObject;
        int i10 = this.f20598ig;
        return (Integer.MIN_VALUE != i10 || (jSONObject = this.cmw) == null) ? i10 : jSONObject.optInt("click_trigger_type", 0);
    }

    public String fc() {
        return this.f20585dn;
    }

    public int fgt() {
        return this.f20581cj;
    }

    public uu fmg() {
        return this.rqu;
    }

    public List<String> fp() {
        return this.roc;
    }

    public List<opi> fri() {
        return this.f20617rv;
    }

    public String fxd() {
        return this.f20590et;
    }

    public void fy() {
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar = this.erj;
        if (jdVar == null || TextUtils.isEmpty(jdVar.m375if())) {
            return;
        }
        try {
            if (!this.erj.m375if().contains("style_id")) {
                this.xfa = false;
            } else {
                this.xfa = true;
                this.gum = Uri.parse(this.erj.m375if()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
        }
    }

    public PAGBannerSize gcf() {
        return this.f20591ew;
    }

    public int gdx() {
        return this.f20607mg;
    }

    public boolean gf() {
        jpo jpoVar = this.ykp;
        if (jpoVar != null) {
            return !TextUtils.isEmpty(jpoVar.ju());
        }
        int i10 = this.f20589eq;
        return i10 == 9 || i10 == 10;
    }

    public AdSlot gmx() {
        return this.kgu;
    }

    public int gox() {
        int i10 = this.f20593fp;
        if (i10 > 0) {
            return i10;
        }
        return 20;
    }

    public JSONObject gs() {
        return this.pzk;
    }

    public JSONObject gum() throws JSONException {
        JSONObject jSONObjectMy;
        JSONObject jSONObjectYd;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("raw_response_info", kfh());
            jSONObject.put("interaction_type", pzk());
            jSONObject.put("iv_skip_time", this.oya);
            jSONObject.put("rv_skip_time", this.prr);
            jSONObject.put(wqx, fgt());
            jSONObject.put("interaction_method", cgn());
            jSONObject.put("lp_click_type", wkl());
            jSONObject.put("lp_click_interval", ax());
            jSONObject.put("proportion_watching", ota());
            jSONObject.put(f20576jd, hk());
            jSONObject.put(f20575cm, zmh());
            jSONObject.put("target_url", iwg());
            jSONObject.put("app_log_url", oo());
            jSONObject.put("settings_url", this.f20602jr);
            jSONObject.put("gecko_id", afh());
            jSONObject.put("extension", aub());
            jSONObject.put("ad_id", fc());
            jSONObject.put("source", as());
            jSONObject.put("app_name", czp());
            jSONObject.put("screenshot", vt());
            jSONObject.put("dislike_control", woc());
            jSONObject.put("play_bar_show_time", umr());
            jSONObject.put("play_bar_style", wu());
            jSONObject.put("if_block_lp", wad());
            jSONObject.put("cache_sort", yq());
            jSONObject.put("if_sp_cache", ykp());
            jSONObject.put("render_control", cql());
            jSONObject.put("mrc_report", this.iqh);
            jSONObject.put("isMrcReportFinish", this.pve);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3191e4.h.G0, rxq());
            jSONObject2.put("other", hks());
            jSONObject.put("set_click_type", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, et());
            jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, ii());
            jSONObject.put("reward_data", jSONObject3);
            if (!TextUtils.isEmpty(sq()) && !TextUtils.isEmpty(opi())) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("adchoices_icon", sq());
                jSONObject4.put("adchoices_url", opi());
                jSONObject.put("dsp_adchoices", jSONObject4);
            }
            opi opiVarOu = ou();
            if (opiVarOu != null && !TextUtils.isEmpty(opiVarOu.jpo())) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("url", opiVarOu.jpo());
                jSONObject5.put("height", opiVarOu.wqx());
                jSONObject5.put("width", opiVarOu.jd());
                jSONObject.put("icon", jSONObject5);
            }
            opi opiVarKye = kye();
            if (opiVarKye != null && !TextUtils.isEmpty(opiVarKye.jpo())) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", opiVarKye.jpo());
                jSONObject6.put("height", opiVarKye.wqx());
                jSONObject6.put("width", opiVarKye.jd());
                jSONObject.put("cover_image", jSONObject6);
            }
            JSONObject jSONObjectGs = gs();
            if (jSONObjectGs != null) {
                jSONObject.put("session_params", jSONObjectGs);
            }
            JSONObject jSONObjectSue = sue();
            if (jSONObjectSue != null) {
                jSONObject.put("dynamic_configs", jSONObjectSue);
            }
            ju juVarSg = sg();
            if (juVarSg != null) {
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("click_upper_content_area", juVarSg.jpo);
                jSONObject7.put("click_upper_non_content_area", juVarSg.f20706jd);
                jSONObject7.put("click_lower_content_area", juVarSg.wqx);
                jSONObject7.put("click_lower_non_content_area", juVarSg.f20705cm);
                jSONObject7.put(KGUkpTlXZlJLy.WKvpZpTzQgcXl, juVarSg.my);
                jSONObject7.put("click_video_area", juVarSg.f20707jj);
                jSONObject.put("click_area", jSONObject7);
            }
            xyk xykVarRq = rq();
            if (xykVarRq != null) {
                jSONObject.put("arbitrage_interceptor_params", xykVarRq.xyk());
            }
            AdSlot adSlotGmx = gmx();
            if (adSlotGmx != null) {
                jSONObject.put("adslot", adSlotGmx.toJsonObj());
            }
            jpo(this, jSONObject);
            List<String> listFp = fp();
            if (listFp != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = listFp.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("show_url", jSONArray);
            }
            List<String> listMg = mg();
            if (listMg != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = listMg.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put(CampaignEx.JSON_KEY_CLICK_URL, jSONArray2);
            }
            List<String> listTed = ted();
            if (listTed != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator<String> it3 = listTed.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(it3.next());
                }
                jSONObject.put("play_start", jSONArray3);
            }
            jSONObject.put("phone_num", zq());
            jSONObject.put("title", ozw());
            jSONObject.put("description", xp());
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS, fxd());
            jSONObject.put("image_mode", iqh());
            jSONObject.put("cover_click_area", rzi());
            jSONObject.put("intercept_flag", cz());
            jSONObject.put("button_text", clt());
            jSONObject.put("ad_logo", ux());
            jSONObject.put("video_adaptation", kb());
            jSONObject.put("feed_video_opentype", aix());
            jSONObject.put("orientation", ll());
            jSONObject.put("aspect_ratio", sy());
            jd(this, jSONObject);
            au auVarCnl = cnl();
            if (auVarCnl != null) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("deeplink_url", auVarCnl.jpo());
                jSONObject8.put("fallback_url", auVarCnl.jd());
                jSONObject8.put("fallback_type", auVarCnl.wqx());
                jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject8);
            }
            jSONObject.put("is_web_jump_ip", this.f20634yd);
            pdm pdmVarZwh = zwh();
            if (pdmVarZwh != null && (jSONObjectYd = pdmVarZwh.yd()) != null) {
                jSONObject.put("oem", jSONObjectYd);
            }
            se seVarZx = zx();
            if (seVarZx != null && (jSONObjectMy = seVarZx.my()) != null) {
                jSONObject.put("multi_ad_scene", jSONObjectMy);
            }
            List<FilterWord> listPve = pve();
            if (listPve != null) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator<FilterWord> it4 = listPve.iterator();
                while (it4.hasNext()) {
                    JSONObject jSONObjectJd = jd(it4.next());
                    if (jSONObjectJd != null) {
                        jSONArray4.put(jSONObjectJd);
                    }
                }
                jSONObject.put("filter_words", jSONArray4);
            }
            sbx().jpo(jSONObject);
            jSONObject.put("count_down", bhu());
            jSONObject.put("expiration_time", smo());
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWck = wck();
            if (jdVarWck != null) {
                jSONObject.put("video", jdVarWck.opi());
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarRqu = rqu();
            if (jdVarRqu != null) {
                jSONObject.put("h265_video", jdVarRqu.opi());
            }
            jSONObject.put("video_encode_type", cu());
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("if_send_click", uhu());
            jSONObject.put("download_conf", jSONObject9);
            if (gy() != null) {
                JSONObject jSONObject10 = new JSONObject();
                Set<Map.Entry<String, Object>> setEntrySet = gy().entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (Map.Entry<String, Object> entry : setEntrySet) {
                        jSONObject10.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("media_ext", jSONObject10);
            }
            jpo jpoVarVzb = vzb();
            if (jpoVarVzb != null) {
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put("id", jpoVarVzb.cm());
                jSONObject11.put("md5", jpoVarVzb.my());
                jSONObject11.put("url", jpoVarVzb.jj());
                jSONObject11.put("data", jpoVarVzb.qk());
                jSONObject11.put("diff_data", jpoVarVzb.xyk());
                jSONObject11.put("version", jpoVarVzb.wqx());
                jSONObject11.put("dynamic_creative", jpoVarVzb.zz());
                jSONObject11.put(PtLatqAYjEFT.hlzCwjOlQywBB, jpoVarVzb.ju());
                jSONObject11.put("ugen_data", jpoVarVzb.prr());
                jSONObject11.put("ugen_md5", jpoVarVzb.oya());
                jSONObject11.put("ugen_url", jpoVarVzb.au());
                jSONObject.put("tpl_info", jSONObject11);
            }
            kln klnVar = this.gdx;
            if (klnVar != null) {
                jSONObject.put("tpl_info_v3", klnVar.qk());
            }
            jSONObject.put("dynamic_creative", kgu());
            jSONObject.put("creative_extra", zw());
            jSONObject.put("market_url", oc());
            jSONObject.put("auction_price", vk());
            jSONObject.put("ad_info", ree());
            jSONObject.put("is_package_open", yxp());
            jSONObject.put("playable_duration_time", gox());
            jSONObject.put("playable_endcard_close_time", gdx());
            jSONObject.put("endcard_close_time", cmw());
            JSONObject jSONObject12 = new JSONObject();
            jSONObject12.put("render_sequence", tl());
            jSONObject12.put("backup_render_control", erj());
            jSONObject12.put("reserve_time", kfv());
            jSONObject12.put("render_thread", cj());
            jSONObject.put("render", jSONObject12);
            if (this.f20592fc == null) {
                rq rqVar = new rq();
                this.f20592fc = rqVar;
                rqVar.jpo("");
                this.f20592fc.jpo(10L);
                this.f20592fc.jd(20L);
                this.f20592fc.wqx(10L);
                this.f20592fc.cm(20L);
            }
            JSONObject jSONObject13 = new JSONObject();
            jSONObject13.put("onlylp_loading_maxtime", this.f20592fc.jpo());
            jSONObject13.put("straight_lp_showtime", this.f20592fc.jd());
            jSONObject13.put("onlyagg_loading_maxtime", this.f20592fc.wqx());
            jSONObject13.put("straight_agg_showtime", this.f20592fc.cm());
            jSONObject13.put("loading_text", this.f20592fc.my());
            jr jrVar = this.cyx;
            if (jrVar != null) {
                jSONObject13 = jrVar.jpo(jSONObject13);
            }
            jSONObject.put("interaction_method_params", jSONObject13);
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("splash_clickarea", ya());
            jSONObject14.put("splash_layout_id", wcn());
            jSONObject14.put("load_wait_time", dn());
            qk qkVar = this.f20605ll;
            jSONObject14.put("skip_time", qkVar != null ? qkVar.jpo() : 0);
            jSONObject.put("splash_control", jSONObject14);
            if (jfy()) {
                jSONObject.put("dsp_html", this.xur);
            }
            if (ig()) {
                jSONObject.put("vast_json", this.hd.yd());
            }
            jSONObject.put("dsp_material_type", tda());
            jSONObject.put("deep_link_appname", this.huv);
            jSONObject.put("landing_page_download_clicktype", this.wcn);
            prr prrVar = this.gs;
            if (prrVar != null) {
                jSONObject.put("dsp_style", prrVar.wqx());
            }
            jSONObject.put("identificationOverlayContent", this.woc);
            if (this.yxp != null) {
                JSONObject jSONObject15 = new JSONObject();
                jSONObject15.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.yxp.jpo(this.gox));
                jSONObject.put("ugen", jSONObject15);
            }
            jSONObject.put("preload_h5_type", sz());
            jSONObject.put("hasReportShow", this.f20635ye);
            jSONObject.put("endcard_creative", this.ss);
            jSONObject.put("image_stay", this.kfv);
            jSONObject.put("ad_label", this.f20629wo.jj());
            JSONObject jSONObject16 = new JSONObject();
            jSONObject16.put(a.f37604j, this.my);
            jSONObject16.put("wait_time", this.f20600jj);
            jSONObject16.put("label", this.f20614qk);
            jSONObject.put("ev", jSONObject16);
            jSONObject.put("ad_label", this.f20629wo.jj());
            if (this.f20591ew != null) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put("width", this.f20591ew.getWidth());
                jSONObject17.put("height", this.f20591ew.getHeight());
                jSONObject.put("banner", jSONObject17);
            }
            if (!TextUtils.isEmpty(this.zpa)) {
                jSONObject.put("gdid_encrypted", this.zpa);
            }
            my myVar = this.opi;
            if (myVar != null) {
                jSONObject.put("ad_tracks", myVar.jd());
            }
            hmu hmuVar = this.nmd;
            if (hmuVar != null) {
                jSONObject.put("popup", hmuVar.cm());
            }
            jSONObject.put("playable_close_time", this.f20616rq);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public Map<String, Object> gy() {
        return this.f20636yq;
    }

    public String hbg() {
        JSONObject jSONObjectEb;
        String strOptString = this.bhu;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectEb = eb()) != null) {
            strOptString = jSONObjectEb.optString("req_id", "");
            kln(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public String hd() {
        return this.f20602jr;
    }

    public int hf() {
        int i10 = this.prr;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.sq.cm().zz(String.valueOf(jl()));
    }

    public int hk() {
        return this.f20578al;
    }

    public int hks() {
        return this.f20632xp;
    }

    public String hmu() {
        return this.zpa;
    }

    public boolean hna() {
        return this.f20630wu;
    }

    public boolean hrt() {
        return cxb() == 5;
    }

    public qk huv() {
        return this.f20605ll;
    }

    public String hx() {
        return this.gum;
    }

    public boolean ic() {
        if (this.afh <= 0) {
            this.afh = cxb();
        }
        int i10 = this.afh;
        return (i10 == 7 || i10 == 8) && !my(this) && cgn() != 21 && this.kfv == 1;
    }

    /* renamed from: if, reason: not valid java name */
    public boolean m467if() {
        return this.f20621sq;
    }

    public boolean ig() {
        int i10 = this.bl;
        return (i10 == 1 || i10 == 3) && zuz() != null;
    }

    public int ii() {
        return this.cql;
    }

    public int iqh() {
        return this.cgn;
    }

    public String iwg() {
        return this.f20626va;
    }

    public double iy() {
        return zz(eb());
    }

    public int jd() {
        qk qkVarHuv = huv();
        if (qkVarHuv != null) {
            return qkVarHuv.jpo();
        }
        return -1;
    }

    public boolean jfy() {
        return this.bl == 2;
    }

    public boolean jj() {
        se seVar;
        int iJkt = jkt();
        if (!va() || !rv.wqx(this) || iJkt == 43 || iJkt == 44) {
            return ((!va() && jkt(iJkt) && (seVar = this.wck) != null && seVar.jpo() == 1) || cql() != 2 || iJkt == 33 || iJkt == 5 || iJkt == 6 || iJkt == 19 || iJkt == 12) ? false : true;
        }
        return false;
    }

    public long jkf() {
        if (this.smo < 0) {
            JSONObject jSONObjectEb = eb();
            if (jSONObjectEb != null) {
                this.smo = jSONObjectEb.optLong("ad_id", 0L);
            } else {
                this.smo = 0L;
            }
        }
        return this.smo;
    }

    public int jl() {
        JSONObject jSONObjectEb = eb();
        if (jSONObjectEb != null) {
            return jSONObjectEb.optInt("rit", 0);
        }
        return 0;
    }

    public int jp() {
        return this.afh;
    }

    public hmu jpo() {
        return this.nmd;
    }

    public boolean jr() {
        return (TextUtils.isEmpty(sq()) || TextUtils.isEmpty(opi())) ? false : true;
    }

    public kln jrx() {
        return this.gdx;
    }

    public int ju() {
        return this.f20618se;
    }

    public boolean jw() {
        return cxb() == 7;
    }

    public int kb() {
        return this.f20579as;
    }

    public cm kc() {
        cm cmVarOya;
        my myVar = this.opi;
        if (myVar != null) {
            cmVarOya = myVar.wqx();
        } else {
            com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar = this.hd;
            cmVarOya = jpoVar != null ? jpoVar.oya() : null;
        }
        if (cmVarOya != null) {
            cmVarOya.jpo(this);
        }
        return cmVarOya;
    }

    public String kfh() {
        return this.f20587eb;
    }

    public int kfv() {
        return this.f20628vt;
    }

    public JSONObject kgu() {
        return this.cmw;
    }

    public void kln() {
        this.jfy = true;
    }

    public int kn() {
        return this.wcn;
    }

    public boolean kp() {
        se seVar = this.wck;
        if (seVar == null || seVar.jd() != 1) {
            return false;
        }
        hmu hmuVar = this.nmd;
        return hmuVar == null || hmuVar.jpo() <= 0;
    }

    public void ky() {
        this.kln.my();
        jj(false);
    }

    public opi kye() {
        return this.tic;
    }

    public int ll() {
        if (this.kye != 2) {
            this.kye = 1;
        }
        return this.kye;
    }

    public com.bytedance.sdk.component.adexpress.jpo.wqx.cm lq() {
        jpo jpoVarVzb = vzb();
        if (jpoVarVzb == null) {
            return null;
        }
        return jpo.jpo(jpoVarVzb, String.valueOf(jl()));
    }

    public jd mb() {
        return this.f20629wo;
    }

    public boolean mc() {
        return this.kln.jpo > 0;
    }

    public List<String> mg() {
        return this.f20613pe;
    }

    public String my() {
        int iJp = jp();
        return iJp != 1 ? iJp != 3 ? iJp != 5 ? iJp != 7 ? iJp != 8 ? "unknown" : "fullscreen_interstitial_ad" : "rewarded_video" : "embeded_ad" : "open_ad" : "banner_ad";
    }

    public boolean ndv() {
        return this.jpo;
    }

    public String nes() {
        return this.xur;
    }

    public rq nmd() {
        return this.f20592fc;
    }

    public int np() {
        return this.umr;
    }

    public String nq() {
        return this.woc;
    }

    public void nzb() {
        this.nes = true;
    }

    public int nzp() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm = cm();
        if (jpoVarCm != null && jpoVarCm.m472if() != null) {
            return jpoVarCm.m472if().zz();
        }
        if (gmx() != null) {
            strValueOf = gmx().getCodeId();
        } else {
            int iJl = jl();
            strValueOf = iJl != 0 ? String.valueOf(iJl) : null;
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.sq.cm().yd(strValueOf);
        }
        return 30;
    }

    public String oc() {
        return this.uhu;
    }

    public String oo() {
        return this.rxq;
    }

    public String opi() {
        return this.f20610oc;
    }

    public int ota() {
        return this.wad;
    }

    public opi ou() {
        return this.f20584dm;
    }

    public int ow() {
        int i10 = this.f20616rq;
        return i10 >= 0 ? i10 : jw() ? 20 : 5;
    }

    public int oya() {
        return this.f20634yd;
    }

    public String ozw() {
        return this.xk;
    }

    public boolean pdm() {
        return this.xfa;
    }

    public String pe() {
        return this.ss;
    }

    public boolean pez() {
        return ig() || this.opi != null;
    }

    public com.bytedance.sdk.openadsdk.hmu.jpo.jd piq() {
        return this.cxb;
    }

    public boolean prr() {
        return this.ux;
    }

    public List<FilterWord> pve() {
        return this.sz;
    }

    public int pzk() {
        return this.f20588ef;
    }

    public String qk() {
        nq nqVarM472if;
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm = cm();
        if (jpoVarCm == null || (nqVarM472if = jpoVarCm.m472if()) == null) {
            return null;
        }
        return nqVarM472if.qk();
    }

    public String ql() {
        return this.fy;
    }

    public long qzp() {
        return this.f20580au;
    }

    public int rc() {
        int i10 = this.oya;
        return i10 >= 0 ? i10 : com.bytedance.sdk.openadsdk.core.sq.cm().opi(String.valueOf(jl()));
    }

    public String ree() {
        return this.fri;
    }

    public boolean rf() {
        return this.f20604kn;
    }

    public String roc() {
        JSONObject jSONObjectEb;
        if (this.f20583dd == null && (jSONObjectEb = eb()) != null) {
            this.f20583dd = jSONObjectEb.optString(BidResponsedEx.KEY_CID, "");
        }
        return this.f20583dd;
    }

    public xyk rq() {
        return this.eye;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd rqu() {
        return this.f20627vk;
    }

    public com.bytedance.sdk.openadsdk.core.ju.xyk.jpo rv() {
        return this.yxp;
    }

    public int rxq() {
        return this.ozw;
    }

    public int rzi() {
        return this.f20623tl;
    }

    public rv sbx() {
        return this.f20611oo;
    }

    public boolean sbz() {
        jr jrVar;
        if (this.kgu == null || (jrVar = this.cyx) == null) {
            return false;
        }
        return jrVar.jpo(!TextUtils.isEmpty(r0.getBidAdm()));
    }

    public String sd() {
        jj jjVarXur = xur();
        if (jjVarXur == null || TextUtils.isEmpty(jjVarXur.jpo())) {
            return null;
        }
        return jjVarXur.jpo();
    }

    public boolean se() {
        List<Integer> listJpo;
        return (vzb() == null || (listJpo = vzb().jpo()) == null || !listJpo.contains(57)) ? false : true;
    }

    public ju sg() {
        return this.vzb;
    }

    public dm sj() {
        return this.kln;
    }

    public long smo() {
        return this.voc;
    }

    public boolean sn() {
        return this.f20581cj == 1;
    }

    public String sq() {
        return this.sue;
    }

    public void ss() {
        this.pve = true;
    }

    public JSONObject sue() {
        return this.f20620sn;
    }

    public boolean svi() {
        return this.pve;
    }

    public void sxw() {
        if (!TextUtils.isEmpty(vk())) {
            oya("0");
        }
        Map<String, Object> mapGy = gy();
        if (mapGy == null || !mapGy.containsKey("price")) {
            return;
        }
        mapGy.put("price", "0");
    }

    public float sy() {
        if (this.iwg <= 0.0f) {
            this.iwg = 100.0f;
        }
        return (this.iwg * 1000.0f) / 1000.0f;
    }

    public int sz() {
        return this.zuz;
    }

    public int tda() {
        return this.bl;
    }

    public List<String> ted() {
        return this.f20625uu;
    }

    public boolean tf() {
        prr prrVar;
        return ig() && !mc() && (prrVar = this.gs) != null && prrVar.jpo() == 1;
    }

    public boolean tic() {
        return this.f20635ye;
    }

    public sq tj() {
        return this.fxd;
    }

    public int tl() {
        return this.f20589eq;
    }

    public jr tu() {
        return this.cyx;
    }

    public int uhu() {
        oya oyaVar = this.f20612ou;
        if (oyaVar == null) {
            return 0;
        }
        return oyaVar.jpo();
    }

    public int umr() {
        return this.f20594gf;
    }

    public com.bytedance.sdk.openadsdk.core.ju.xyk.jpo uu() {
        return this.gox;
    }

    public int ux() {
        return this.f20606lq;
    }

    public boolean va() {
        return this.aub;
    }

    public int vbt() {
        return this.gmx;
    }

    public String vk() {
        return this.f20595hk;
    }

    public boolean voc() {
        return this.f20631ww == 1;
    }

    public int vrc() {
        return this.f20622tj;
    }

    public boolean vt() {
        return this.cz;
    }

    public jpo vzb() {
        return this.ykp;
    }

    public int wad() {
        return this.f20631ww;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd wck() {
        return this.f20603kb;
    }

    public int wcn() {
        if (se()) {
            return 5;
        }
        return jfy() ? 4 : 1;
    }

    public int wkl() {
        return this.xyk;
    }

    public String wn() {
        return this.f20624tu;
    }

    public String wo() {
        return this.huv;
    }

    public int woc() {
        return this.ree;
    }

    public String wq() {
        return this.f20614qk;
    }

    public int wqx() {
        return this.pdm;
    }

    public int wu() {
        if (ig()) {
            return 5;
        }
        if (sy() != 100.0f || cql() == 2) {
            return 0;
        }
        return this.ez;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd ww() {
        return this.erj;
    }

    public JSONObject xfa() throws JSONException {
        JSONObject jSONObjectGum = gum();
        JSONObject jSONObjectSq = com.bytedance.sdk.openadsdk.core.settings.au.jrx().sq(String.valueOf(jl()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectGum);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectSq);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("MaterialMeta", "toJsonObjPlus", e10.getMessage());
            return jSONObject;
        }
    }

    public int xk() {
        if (this.svi < 0) {
            try {
                JSONObject jSONObjectEb = eb();
                if (jSONObjectEb != null) {
                    this.svi = jSONObjectEb.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.svi = 0;
                }
            } catch (Throwable unused) {
                this.svi = 0;
            }
        }
        return this.svi;
    }

    public String xp() {
        return this.f20597ic;
    }

    public jj xur() {
        return this.sbx;
    }

    public long xyk() {
        return this.hna;
    }

    public int ya() {
        qk qkVar = this.f20605ll;
        if (qkVar == null) {
            return 2;
        }
        return qkVar.jd();
    }

    public String yd() {
        return this.f20609nq;
    }

    public int ye() {
        JSONObject jSONObject = this.cnl;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public float yjm() {
        float f10 = this.f20601jp;
        if (f10 > 0.0f) {
            return f10;
        }
        kln klnVar = this.gdx;
        if (klnVar != null) {
            String strCm = klnVar.cm();
            if (TextUtils.isEmpty(strCm)) {
                strCm = com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo("adv3", this.gdx.jpo(), this.gdx.jd());
            }
            if (strCm != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strCm).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.f20601jp = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.f20601jp = 0.0f;
        return 0.0f;
    }

    public int ykp() {
        return this.zrw;
    }

    public boolean yn() {
        return this.pez;
    }

    public int yq() {
        return this.fgt;
    }

    public int yxp() {
        return this.f20637zq;
    }

    public int yyf() {
        Map<String, Object> map = this.f20636yq;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int yzt() {
        return this.prr;
    }

    public boolean zc() {
        return cxb() == 1;
    }

    public boolean zhp() {
        return cxb() == 8;
    }

    public int zmh() {
        return this.vbt;
    }

    public boolean zpa() {
        if (this.f20617rv.isEmpty()) {
            return false;
        }
        if (this.cgn == 4 && this.f20617rv.size() < 3) {
            return false;
        }
        Iterator<opi> it = this.f20617rv.iterator();
        while (it.hasNext()) {
            if (!it.next().my()) {
                return false;
            }
        }
        return true;
    }

    public String zq() {
        return this.vrc;
    }

    public boolean zrw() {
        return this.f20578al == 1;
    }

    public com.bytedance.sdk.openadsdk.core.p000if.jpo zuz() {
        return this.hd;
    }

    public String zw() {
        return this.rzi;
    }

    public pdm zwh() {
        return this.f20582cu;
    }

    public se zx() {
        return this.wck;
    }

    public static boolean cm(dt dtVar) {
        return (dtVar == null || dtVar.ww() == null || dtVar.ww().jpo() != 1) ? false : true;
    }

    public static boolean wqx(dt dtVar) {
        return (dtVar == null || dtVar.ww() == null || dtVar.ww().cm() != 7 || rv.jd(dtVar)) ? false : true;
    }

    private static long xyk(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public void au(String str) {
        this.fri = str;
    }

    public void dn(int i10) {
        this.oya = i10;
    }

    public void dt(int i10) {
        this.f20623tl = i10;
    }

    public void duq(int i10) {
        this.f20616rq = i10;
    }

    public void ef(int i10) {
        this.f20637zq = i10;
    }

    public void hmu(int i10) {
        this.umr = i10;
    }

    public void hna(int i10) {
        this.f20579as = i10;
    }

    public void huv(int i10) {
        this.bl = i10;
    }

    public void hx(int i10) {
        this.f20578al = i10;
    }

    /* renamed from: if, reason: not valid java name */
    public void m465if(String str) {
        this.f20599ii = str;
    }

    public int jkt() {
        return this.nzb;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        if (jpoVar != null) {
            this.f20586dt = jpoVar;
        }
    }

    public void jr(int i10) {
        this.jrx = i10;
    }

    public void ju(String str) {
        this.ss = str;
    }

    public void kln(int i10) {
        this.ree = i10;
    }

    public void nmd(int i10) {
        this.f20594gf = i10;
    }

    public void nq(int i10) {
        this.f20581cj = i10;
    }

    public void nzb(int i10) {
        this.f20593fp = i10;
    }

    public void opi(int i10) {
        this.ez = i10;
    }

    public void oya(int i10) {
        this.f20589eq = i10;
    }

    public void pdm(int i10) {
        this.vbt = i10;
    }

    public void pe(int i10) {
        this.gmx = i10;
    }

    public void prr(int i10) {
        this.f20608np = i10;
    }

    public void rq(int i10) {
        this.fgt = i10;
    }

    public void rv(int i10) {
        this.cgn = i10;
    }

    public void sbx(int i10) {
        this.prr = i10;
    }

    public void sq(int i10) {
        this.f20606lq = i10;
    }

    public void sz(int i10) {
        this.kye = i10;
    }

    public void tic(int i10) {
        this.ted = i10;
    }

    public void tu(int i10) {
        this.zrw = i10;
    }

    public void uu(int i10) {
        this.aix = i10;
    }

    public void va(int i10) {
        this.iqh = i10;
    }

    public void vrc(int i10) {
        this.f20628vt = Math.max(0, i10);
    }

    public void ya(int i10) {
        this.xyk = i10;
    }

    public void yd(String str) {
        this.woc = str;
    }

    public String zz() {
        return this.hmu;
    }

    private String dm(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.hna.jpo(str);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("MaterialMeta", "generate icon key error", th2.getMessage());
            return null;
        }
    }

    public static boolean jd(dt dtVar) {
        return (jpo(dtVar) || wqx(dtVar)) ? false : true;
    }

    public static JSONObject wqx(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("MaterialMeta", e10.getMessage());
            return null;
        }
    }

    public void au(int i10) {
        this.czp = i10;
    }

    public void dt(String str) {
        this.f20585dn = str;
    }

    public void duq(String str) {
        this.f20624tu = str;
    }

    public void ef(String str) {
        this.f20587eb = str;
    }

    public void hmu(String str) {
        this.rxq = str;
    }

    public void hna(String str) {
        this.hks = str;
    }

    public void hx(String str) {
        this.zmh = str;
    }

    /* renamed from: if, reason: not valid java name */
    public void m464if(int i10) {
        this.f20631ww = i10;
    }

    public void jpo(int i10) {
        this.pdm = i10;
    }

    public void jr(String str) {
        this.vrc = str;
    }

    public void ju(int i10) {
        this.ota = i10;
    }

    public void kln(String str) {
        this.bhu = str;
    }

    public void nmd(String str) {
        this.xk = str;
    }

    public void nq(String str) {
        this.f20602jr = str;
    }

    public void nzb(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f20614qk = com.bytedance.sdk.openadsdk.hmu.jpo.wqx.wqx;
        } else {
            this.f20614qk = str;
        }
    }

    public void opi(String str) {
        this.f20626va = str;
    }

    public void oya(String str) {
        this.f20595hk = str;
    }

    public void pdm(String str) {
        this.uhu = str;
    }

    public void prr(String str) {
        this.rzi = str;
    }

    public void rq(String str) {
        this.f20597ic = str;
    }

    public void rv(String str) {
        this.xur = str;
    }

    public void sq(String str) {
        this.f20633ya = str;
    }

    public String sz(String str) {
        JSONObject jSONObjectEb = eb();
        return jSONObjectEb != null ? jSONObjectEb.optString("rit", str) : str;
    }

    public void tu(String str) {
        this.fy = str;
    }

    public void uu(String str) {
        this.huv = str;
    }

    public void wcn(int i10) {
        if (i10 < 0 || i10 > 30) {
            i10 = 6;
        }
        this.f20600jj = i10;
    }

    public void xyk(String str) {
        this.f20610oc = str;
    }

    public void yd(int i10) {
        this.wad = i10;
    }

    public void zz(String str) {
        this.zpa = str;
    }

    public static int cm(String str) {
        return jpo(wqx(str));
    }

    public static double jd(String str) {
        return zz(wqx(str));
    }

    public static boolean qk(dt dtVar) {
        Object obj;
        if (dtVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapGy = dtVar.gy();
            if (mapGy == null || (obj = mapGy.get(TTAdConstant.SDK_BIDDING_TYPE)) == null) {
                return false;
            }
            return 2 == Integer.parseInt(obj.toString());
        } catch (Throwable th2) {
            th2.getMessage();
            return false;
        }
    }

    public void au(boolean z10) {
        this.f20604kn = z10;
    }

    /* renamed from: if, reason: not valid java name */
    public void m466if(boolean z10) {
        this.jpo = z10;
    }

    public void jpo(long j10) {
        this.hna = j10;
    }

    public void ju(boolean z10) {
        this.pez = z10;
    }

    public void oya(boolean z10) {
        this.my = z10;
    }

    public void se(int i10) {
        this.f20588ef = i10;
    }

    public void xyk(boolean z10) {
        this.aub = z10;
    }

    public void yd(boolean z10) {
        this.f125if = z10;
    }

    public void zz(int i10) {
        this.cql = i10;
    }

    public static boolean jpo(dt dtVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (jpo(dtVar) || z13 || dtVar == null || dtVar.ww() == null || TextUtils.isEmpty(dtVar.ww().m375if())) {
            return false;
        }
        return wqx(dtVar) ? z12 : (dtVar.ww() == null || dtVar.ww().jpo() != 1) ? z10 : z11;
    }

    public void cm(boolean z10) {
        this.f20630wu = z10;
    }

    public void roc(int i10) {
        this.gy = i10;
    }

    public void se(String str) {
        this.f20590et = str;
    }

    public void xyk(int i10) {
        this.nzb = i10;
    }

    public void zz(boolean z10) {
        this.cz = z10;
    }

    public static String jd(Context context, dt dtVar) {
        if (context != null && dtVar != null) {
            try {
                if (dtVar.pzk() != 8) {
                    if (dtVar.rq().jpo()) {
                    }
                }
                String strJpo = com.bytedance.sdk.openadsdk.core.jpo.jpo.jpo(context);
                if (TextUtils.isEmpty(strJpo)) {
                    return null;
                }
                return strJpo;
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("MaterialMeta", th2.getMessage());
            }
        }
        return null;
    }

    public static boolean jj(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        int iIqh = dtVar.iqh();
        return iIqh == 5 || iIqh == 15 || iIqh == 50;
    }

    public void cm(int i10) {
        this.zuz = i10;
    }

    public void dm(int i10) {
        this.f20607mg = i10;
    }

    public void ic(int i10) {
        this.f20615ql = i10;
    }

    public void wqx(int i10) {
        this.f20634yd = i10;
    }

    public void cm(JSONObject jSONObject) {
        this.f20620sn = jSONObject;
    }

    public void jj(String str) {
        this.f20609nq = str;
    }

    public void wqx(boolean z10) {
        this.ux = z10;
    }

    public void xk(int i10) {
        this.clt = i10;
    }

    public static boolean my(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        int iIqh = dtVar.iqh();
        return dtVar.ig() || iIqh == 5 || iIqh == 15 || iIqh == 50;
    }

    public void cm(long j10) {
        this.zz = j10;
    }

    public void fy(int i10) {
        this.wcn = i10;
    }

    public void jj(boolean z10) {
        this.sy = z10;
    }

    public void qk(String str) {
        this.sue = str;
    }

    public void wqx(opi opiVar) {
        this.f20617rv.add(opiVar);
    }

    public static boolean jpo(dt dtVar) {
        return (dtVar == null || dtVar.ww() == null || dtVar.ww().cm() != 1) ? false : true;
    }

    public void jj(int i10) {
        this.kfv = i10;
    }

    public void qk(boolean z10) {
        this.f20635ye = z10;
    }

    public void wqx(JSONObject jSONObject) {
        this.pzk = jSONObject;
    }

    public static com.bytedance.sdk.openadsdk.core.au.jpo.jd jpo(String str, dt dtVar) {
        dtVar.xk(0);
        int iCxb = dtVar.cxb();
        int i10 = 3;
        if (iCxb == 3) {
            i10 = 4;
        } else if (iCxb == 7) {
            i10 = 1;
        } else if (iCxb == 8) {
            i10 = 2;
        }
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVar = new com.bytedance.sdk.openadsdk.core.au.jpo.jd(str, dtVar.wck(), dtVar.rqu(), dtVar.ew(), dtVar.cu(), i10);
        jdVar.jpo(com.bytedance.sdk.openadsdk.rq.jpo.jpo("video_error_conf", 0));
        return jdVar;
    }

    public void jd(int i10) {
        this.f20618se = i10;
    }

    public void jj(JSONObject jSONObject) {
        this.cnl = jSONObject;
    }

    public void my(String str) {
        this.hmu = str;
    }

    public void qk(int i10) {
        jpo(i10, -1);
    }

    public void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar) {
        this.f20627vk = jdVar;
    }

    public void jd(boolean z10) {
        this.f20596hx = z10;
    }

    public void my(boolean z10) {
        this.f20619sg = z10;
    }

    public void qk(JSONObject jSONObject) {
        this.f20629wo.jpo(jSONObject);
    }

    public void wqx(long j10) {
        this.f20580au = j10;
    }

    public void jd(com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVar) {
        this.gox = jpoVar;
        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(jpoVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void my(int i10) {
        this.f20622tj = i10;
    }

    public void my(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f20588ef = 4;
        this.f20585dn = jSONObject.optString("id");
        this.hks = jSONObject.optString("source");
        jj jjVar = new jj();
        this.sbx = jjVar;
        jjVar.wqx(jSONObject.optString("pkg_name"));
        this.sbx.jd(jSONObject.optString("name"));
        this.sbx.jpo(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public static long jpo(String str) {
        return xyk(wqx(str));
    }

    public void jd(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.ozw = 2;
        } else {
            this.ozw = (int) d10;
        }
    }

    public static int jpo(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void jd(JSONObject jSONObject) {
        this.cmw = jSONObject;
    }

    public static String jpo(Context context, dt dtVar) {
        if (context == null || dtVar == null || !((dtVar.cxb() == 8 || dtVar.cxb() == 7) && dtVar.eq())) {
            return null;
        }
        String strJd = jd(context, dtVar);
        if (TextUtils.isEmpty(strJd) || com.bytedance.sdk.openadsdk.core.jpo.jpo.jpo() != 1) {
            return null;
        }
        return strJd;
    }

    public void jd(opi opiVar) {
        this.tic = opiVar;
    }

    public void jd(long j10) {
        this.voc = j10;
    }

    private JSONObject jd(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(jd(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public void jpo(boolean z10) {
        this.f20621sq = z10;
    }

    public void jpo(xyk xykVar) {
        this.eye = xykVar;
    }

    public void jpo(rq rqVar) {
        this.f20592fc = rqVar;
    }

    public void jpo(jr jrVar) {
        this.cyx = jrVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.ju.xyk.jpo jpoVar) {
        this.yxp = jpoVar;
        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(jpoVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void jpo(qk qkVar) {
        this.f20605ll = qkVar;
    }

    public void jpo(rv rvVar) {
        this.f20611oo = rvVar;
    }

    public void jpo(int i10, int i11) {
        this.duq = i10;
        this.nzb = i10;
        if (this.kgu == null) {
            this.nzb = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = cxb();
        }
        if (this.kgu.getDurationSlotType() != 3 && i11 != 3) {
            if (this.kgu.getDurationSlotType() != 7 && this.kgu.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (!this.aub && rv.jd(this)) {
                    this.nzb = 4;
                    return;
                }
                if (this.duq == 4 && !rv.jd(this)) {
                    this.nzb = 0;
                }
                int i12 = this.duq;
                if (i12 == 41) {
                    this.nzb = 41;
                    return;
                }
                if (i10 >= 5) {
                    this.nzb = 0;
                    return;
                }
                if (i12 == 2 && pzk() != 3) {
                    this.nzb = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && pzk() != 3)) {
                        this.nzb = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.aub) {
                if (rv.wqx(this)) {
                    this.nzb = 12;
                    return;
                } else if (rv.jd(this)) {
                    this.nzb = 9;
                    return;
                }
            }
            if (this.duq == 5 && !nmd.cm(this)) {
                this.nzb = 7;
            }
            if (this.duq == 6 && !nmd.jd(this)) {
                this.nzb = 7;
            }
            if (this.duq == 8 && rzi() != 100) {
                this.nzb = 7;
            }
            if (this.duq == 19 && TextUtils.isEmpty(this.f20626va)) {
                this.nzb = 7;
            }
            if (this.duq == 20 && TextUtils.isEmpty(this.f20626va)) {
                this.nzb = 7;
            }
            if (this.duq == 38 && !nmd.wqx(this)) {
                this.nzb = 7;
            }
            if (i10 < 5) {
                this.nzb = 7;
                return;
            }
            return;
        }
        this.nzb = 14;
    }

    public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar) {
        this.f20603kb = jdVar;
    }

    public static void jd(dt dtVar, JSONObject jSONObject) throws JSONException {
        jj jjVarXur = dtVar.xur();
        if (jjVarXur != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", jjVarXur.jd());
            jSONObject2.put("package_name", jjVarXur.wqx());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, jjVarXur.jpo());
            jSONObject2.put("score", jjVarXur.cm());
            jSONObject2.put("comment_num", jjVarXur.my());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, jjVarXur.jj());
            jSONObject2.put("app_category", jjVarXur.qk());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public void jpo(double d10) {
        if (d10 != 2.0d && d10 != 1.0d) {
            this.f20632xp = 1;
        } else {
            this.f20632xp = (int) d10;
        }
    }

    public void jpo(ju juVar) {
        this.vzb = juVar;
    }

    public void jpo(AdSlot adSlot) {
        this.kgu = adSlot;
    }

    public void jpo(jpo jpoVar) {
        this.ykp = jpoVar;
        com.bytedance.sdk.component.adexpress.jpo.wqx.cm cmVarLq = lq();
        if (cmVarLq != null && !gf()) {
            com.bytedance.sdk.component.adexpress.jpo.jd.jd.jpo(cmVarLq);
        }
        if (jpoVar == null || TextUtils.isEmpty(jpoVar.au())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(ub(), "ad");
    }

    public void jpo(kln klnVar) {
        this.gdx = klnVar;
        if (klnVar == null || TextUtils.isEmpty(klnVar.wqx())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ju.jpo.jd.jpo().jpo(lbb(), "adv3");
    }

    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVar) {
        this.erj = jdVar;
    }

    public void jpo(oya oyaVar) {
        this.f20612ou = oyaVar;
    }

    public void jpo(opi opiVar) {
        jpo(opiVar, f20577ju);
        String strDm = dm(opiVar.jpo());
        if (!TextUtils.isEmpty(strDm)) {
            opiVar.jd(strDm);
        }
        this.f20584dm = opiVar;
    }

    private void jpo(opi opiVar, int i10) {
        if (opiVar != null) {
            try {
                if (TextUtils.isEmpty(opiVar.jpo())) {
                    return;
                }
                if (opiVar.jd() == 0 && opiVar.wqx() == 0) {
                    opiVar.jpo(i10);
                    opiVar.jd(i10);
                    return;
                }
                if (opiVar.jd() == 0) {
                    if (opiVar.wqx() > i10) {
                        opiVar.jd(i10);
                        opiVar.jpo(i10);
                        return;
                    } else {
                        opiVar.jpo(opiVar.wqx());
                        return;
                    }
                }
                if (opiVar.wqx() == 0) {
                    if (opiVar.jd() > i10) {
                        opiVar.jd(i10);
                        opiVar.jpo(i10);
                        return;
                    } else {
                        opiVar.jd(opiVar.jd());
                        return;
                    }
                }
                if (opiVar.jd() > opiVar.wqx()) {
                    if (opiVar.jd() > i10) {
                        opiVar.jd((int) (i10 / (opiVar.jd() / opiVar.wqx())));
                        opiVar.jpo(i10);
                        return;
                    }
                    return;
                }
                if (opiVar.wqx() > i10) {
                    opiVar.jpo((int) (i10 * (opiVar.jd() / opiVar.wqx())));
                    opiVar.jd(i10);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void jpo(jj jjVar) {
        this.sbx = jjVar;
    }

    public void jpo(au auVar) {
        this.jkt = auVar;
    }

    public void jpo(FilterWord filterWord) {
        this.sz.add(filterWord);
    }

    public void jpo(Map<String, Object> map) {
        this.f20636yq = map;
    }

    public void jpo(float f10) {
        this.iwg = f10;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo jpoVar) {
        this.hd = jpoVar;
    }

    public void jpo(sq sqVar) {
        this.fxd = sqVar;
    }

    public void jpo(prr prrVar) {
        this.gs = prrVar;
    }

    public void jpo(pdm pdmVar) {
        this.f20582cu = pdmVar;
    }

    public void jpo(PAGBannerSize pAGBannerSize) {
        this.f20591ew = pAGBannerSize;
    }

    public void jpo(se seVar) {
        this.wck = seVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jd jdVar) {
        this.cxb = jdVar;
    }

    public void jpo(uu uuVar) {
        this.rqu = uuVar;
    }

    public void jpo(my myVar) {
        this.opi = myVar;
    }

    public void jpo(hmu hmuVar) {
        this.nmd = hmuVar;
    }

    public static void jpo(dt dtVar, JSONObject jSONObject) throws JSONException {
        List<opi> listFri = dtVar.fri();
        if (listFri != null) {
            JSONArray jSONArray = new JSONArray();
            for (opi opiVar : listFri) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", opiVar.jpo());
                jSONObject2.put("height", opiVar.wqx());
                jSONObject2.put("width", opiVar.jd());
                jSONObject2.put("image_preview", opiVar.jj());
                jSONObject2.put("image_key", opiVar.qk());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
