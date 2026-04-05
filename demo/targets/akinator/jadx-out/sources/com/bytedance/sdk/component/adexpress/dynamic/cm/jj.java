package com.bytedance.sdk.component.adexpress.dynamic.cm;

import com.amazon.device.ads.DTBMetricsConfiguration;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    private int aix;

    /* renamed from: as, reason: collision with root package name */
    private int f18137as;

    /* renamed from: au, reason: collision with root package name */
    private String f18138au;
    private boolean cgn;

    /* renamed from: cm, reason: collision with root package name */
    private float f18139cm;
    private int cql;
    private int cz;
    private int czp;

    /* renamed from: dm, reason: collision with root package name */
    private int f18140dm;

    /* renamed from: dn, reason: collision with root package name */
    private boolean f18141dn;

    /* renamed from: dt, reason: collision with root package name */
    private String f18142dt;
    private boolean duq;

    /* renamed from: ef, reason: collision with root package name */
    private String f18143ef;

    /* renamed from: eq, reason: collision with root package name */
    private int f18144eq;
    private String erj;

    /* renamed from: et, reason: collision with root package name */
    private int f18145et;
    private JSONObject ez;
    private String fgt;

    /* renamed from: fp, reason: collision with root package name */
    private String f18146fp;
    private int fri;
    private int fy;

    /* renamed from: gf, reason: collision with root package name */
    private JSONObject f18147gf;
    private int gmx;

    /* renamed from: hk, reason: collision with root package name */
    private boolean f18148hk;
    private String hks;
    private String hmu;
    private String hna;
    private boolean huv;

    /* renamed from: hx, reason: collision with root package name */
    private int f18149hx;

    /* renamed from: ic, reason: collision with root package name */
    private boolean f18150ic;

    /* renamed from: if, reason: not valid java name */
    private double f48if;

    /* renamed from: ii, reason: collision with root package name */
    private boolean f18151ii;
    private int iwg;

    /* renamed from: jd, reason: collision with root package name */
    private float f18152jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f18153jj;
    private boolean jkt;
    private float jpo;

    /* renamed from: jr, reason: collision with root package name */
    private String f18154jr;
    private String jrx;

    /* renamed from: ju, reason: collision with root package name */
    private double f18155ju;

    /* renamed from: kb, reason: collision with root package name */
    private int f18156kb;
    private int kgu;
    private String kln;
    private int kye;

    /* renamed from: lq, reason: collision with root package name */
    private boolean f18157lq;

    /* renamed from: mg, reason: collision with root package name */
    private long f18158mg = -1;
    private boolean my;
    private String nmd;

    /* renamed from: np, reason: collision with root package name */
    private boolean f18159np;

    /* renamed from: nq, reason: collision with root package name */
    private boolean f18160nq;
    private String nzb;
    private String opi;
    private int ota;

    /* renamed from: ou, reason: collision with root package name */
    private boolean f18161ou;
    private String oya;
    private String ozw;
    private double pdm;

    /* renamed from: pe, reason: collision with root package name */
    private double f18162pe;
    private String prr;
    private int pzk;

    /* renamed from: qk, reason: collision with root package name */
    private float f18163qk;
    private int ree;
    private int roc;

    /* renamed from: rq, reason: collision with root package name */
    private String f18164rq;

    /* renamed from: rv, reason: collision with root package name */
    private double f18165rv;
    private JSONObject rxq;
    private boolean rzi;
    private boolean sbx;

    /* renamed from: se, reason: collision with root package name */
    private int f18166se;

    /* renamed from: sg, reason: collision with root package name */
    private List<jpo> f18167sg;

    /* renamed from: sn, reason: collision with root package name */
    private int f18168sn;

    /* renamed from: sq, reason: collision with root package name */
    private String f18169sq;
    private String sz;
    private String ted;
    private int tic;

    /* renamed from: tl, reason: collision with root package name */
    private String f18170tl;

    /* renamed from: tu, reason: collision with root package name */
    private String f18171tu;
    private JSONObject uhu;
    private int umr;

    /* renamed from: uu, reason: collision with root package name */
    private String f18172uu;
    private int ux;

    /* renamed from: va, reason: collision with root package name */
    private int f18173va;

    /* renamed from: vk, reason: collision with root package name */
    private boolean f18174vk;
    private int voc;
    private int vrc;
    private double vzb;
    private int wad;
    private String wcn;
    private float wqx;

    /* renamed from: wu, reason: collision with root package name */
    private int f18175wu;

    /* renamed from: ww, reason: collision with root package name */
    private int f18176ww;
    private int xk;
    private float xyk;

    /* renamed from: ya, reason: collision with root package name */
    private int f18177ya;

    /* renamed from: yd, reason: collision with root package name */
    private float f18178yd;
    private boolean ykp;

    /* renamed from: yq, reason: collision with root package name */
    private int f18179yq;
    private String zmh;

    /* renamed from: zq, reason: collision with root package name */
    private String f18180zq;
    private int zrw;

    /* renamed from: zw, reason: collision with root package name */
    private boolean f18181zw;
    private float zz;

    private void hx(String str) {
        this.ted = str;
    }

    public static jj jpo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        jj jjVar = new jj();
        jjVar.jd(jSONObject.optString("adType", "embeded"));
        jjVar.prr(jSONObject.optString("clickArea", DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME));
        jjVar.hna(jSONObject.optString("clickTigger", "click"));
        jjVar.wqx(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        jjVar.cm(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        jjVar.my(jSONObject.optString("color", "#999999"));
        jjVar.jj(jSONObject.optString("bgColor", C3191e4.h.T));
        jjVar.qk(jSONObject.optString("bgImgUrl", ""));
        jjVar.hx(jSONObject.optString("bgImgData", ""));
        jjVar.xyk(jSONObject.optString("borderColor", "#000000"));
        jjVar.zz(jSONObject.optString("borderStyle", "solid"));
        jjVar.yd(jSONObject.optString("heightMode", DebugKt.DEBUG_PROPERTY_VALUE_AUTO));
        jjVar.ju(jSONObject.optString("widthMode", "fixed"));
        jjVar.m402if(jSONObject.optString("interactText", ""));
        jjVar.wqx(jSONObject.optBoolean("isShowBgControl", false));
        jjVar.au(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            jjVar.qk(jSONObjectOptJSONObject.optInt("translateY", 0));
            jjVar.xyk(jSONObjectOptJSONObject.optInt("translateX", 0));
            jjVar.cm(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            jjVar.my(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        jjVar.oya(jSONObject.optString("interactType", ""));
        jjVar.my(jSONObject.optInt("interactSlideDirection", -1));
        jjVar.sq(jSONObject.optString("justifyHorizontal", "space-around"));
        jjVar.opi(jSONObject.optString("justifyVertical", "flex-start"));
        jjVar.jd(jSONObject.optDouble("timingStart"));
        jjVar.wqx(jSONObject.optDouble("timingEnd"));
        jjVar.cm((float) jSONObject.optDouble("width", 0.0d));
        jjVar.wqx((float) jSONObject.optDouble("height", 0.0d));
        jjVar.jpo((float) jSONObject.optDouble("borderRadius", 0.0d));
        jjVar.jd((float) jSONObject.optDouble("borderSize", 0.0d));
        jjVar.jd(jSONObject.optBoolean("interactValidate", false));
        jjVar.zz((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        jjVar.my((float) jSONObject.optDouble("paddingBottom", 0.0d));
        jjVar.jj((float) jSONObject.optDouble("paddingLeft", 0.0d));
        jjVar.qk((float) jSONObject.optDouble("paddingRight", 0.0d));
        jjVar.xyk((float) jSONObject.optDouble("paddingTop", 0.0d));
        jjVar.cm(jSONObject.optBoolean("lineFeed", false));
        jjVar.zz(jSONObject.optInt("lineCount", 0));
        jjVar.jj(jSONObject.optDouble("lineHeight", 1.2d));
        jjVar.oya(jSONObject.optInt("letterSpacing", 0));
        jjVar.my(jSONObject.optBoolean("isDataFixed", false));
        jjVar.prr(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        jjVar.jj(jSONObject.optBoolean("lineLimit"));
        jjVar.hna(jSONObject.optInt(C3191e4.h.L));
        jjVar.jr(jSONObject.optString("align"));
        jjVar.qk(jSONObject.optBoolean("useLeft"));
        jjVar.xyk(jSONObject.optBoolean("useRight"));
        jjVar.zz(jSONObject.optBoolean("useTop"));
        jjVar.yd(jSONObject.optBoolean("useBottom"));
        jjVar.nmd(jSONObject.optString("data"));
        jjVar.jd(jSONObject.optJSONObject("i18n"));
        jjVar.m401if(jSONObject.optInt("marginLeft"));
        jjVar.au(jSONObject.optInt("marginRight"));
        jjVar.yd(jSONObject.optInt("marginTop"));
        jjVar.ju(jSONObject.optInt("marginBottom"));
        jjVar.sq(jSONObject.optInt("tagMaxCount"));
        jjVar.ju(jSONObject.optBoolean("allowTextFlow"));
        jjVar.opi(jSONObject.optInt("textFlowType"));
        jjVar.jr(jSONObject.optInt("textFlowDuration"));
        jjVar.nmd(jSONObject.optInt(TtmlNode.LEFT));
        jjVar.rq(jSONObject.optInt(TtmlNode.RIGHT));
        jjVar.tu(jSONObject.optInt("top"));
        jjVar.dt(jSONObject.optInt("bottom"));
        jjVar.rq(jSONObject.optString("alignItems", "flex-start"));
        jjVar.tu(jSONObject.optString("direction", ""));
        jjVar.jpo(jSONObject.optBoolean("loop", false));
        jjVar.hmu(jSONObject.optInt("zIndex"));
        jjVar.rv(jSONObject.optInt("interactVisibleTime"));
        jjVar.nq(jSONObject.optInt("interactHiddenTime"));
        jjVar.au(jSONObject.optBoolean("interactEnableMask"));
        jjVar.oya(jSONObject.optBoolean("interactWontHide"));
        jjVar.jpo(jSONObject.optString("bgGradient"));
        jjVar.sz(jSONObject.optInt("areaType"));
        jjVar.kln(jSONObject.optInt("interactSlideThreshold", 0));
        jjVar.duq(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.cm.jd() ? 0 : AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        jjVar.opi(jSONObject.optBoolean("openPlayableLandingPage", false));
        jjVar.wqx(jSONObject.optJSONObject("video"));
        jjVar.cm(jSONObject.optJSONObject("image"));
        jjVar.ef(jSONObject.optInt("borderShadowExtent"));
        jjVar.prr(jSONObject.optBoolean("bgGauseBlur"));
        jjVar.nzb(jSONObject.optInt("bgGauseBlurRadius"));
        jjVar.hna(jSONObject.optBoolean("showTimeProgress", false));
        jjVar.sq(jSONObject.optBoolean("showPlayButton", false));
        jjVar.jpo(jSONObject.optDouble("bgColorCg", 0.0d));
        jjVar.jj(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        jjVar.jd(jSONObject.optInt("borderTopLeftRadius", 0));
        jjVar.jpo(jSONObject.optInt("borderTopRightRadius", 0));
        jjVar.cm(jSONObject.optInt("borderBottomLeftRadius", 0));
        jjVar.wqx(jSONObject.optInt("borderBottomRightRadius", 0));
        jjVar.my(jSONObject.optJSONObject("interactI18n"));
        jjVar.hmu(jSONObject.optString("imageObjectFit"));
        jjVar.nq(jSONObject.optString("interactTitle"));
        jjVar.uu(jSONObject.optInt("interactTextPositionTop"));
        jjVar.dt(jSONObject.optString("imageLottieTosPath"));
        jjVar.m403if(jSONObject.optBoolean("animationsLoop"));
        jjVar.se(jSONObject.optInt("lottieAppNameMaxLength"));
        jjVar.pdm(jSONObject.optInt("lottieAdDescMaxLength"));
        jjVar.hx(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    jpo jpoVar = new jpo();
                    jpoVar.wqx(jSONObject2.optString("animationType"));
                    jpoVar.jpo(jSONObject2.optDouble("animationDuration"));
                    jpoVar.jd(jSONObject2.optDouble("animationScaleX"));
                    jpoVar.wqx(jSONObject2.optDouble("animationScaleY"));
                    jpoVar.cm(jSONObject2.optString("animationTimeFunction"));
                    jpoVar.cm(jSONObject2.optDouble("animationDelay"));
                    jpoVar.jj(jSONObject2.optInt("animationIterationCount"));
                    jpoVar.my(jSONObject2.optString("animationDirection"));
                    jpoVar.my(jSONObject2.optDouble("animationInterval"));
                    jpoVar.jpo(jSONObject2.optInt("animationBorderWidth"));
                    jpoVar.jpo(jSONObject2.optLong(C3191e4.h.W));
                    jpoVar.jd(jSONObject2.optInt("animationEffectWidth"));
                    jpoVar.wqx(jSONObject2.optInt("animationSwing", 1));
                    jpoVar.cm(jSONObject2.optInt("animationTranslateX"));
                    jpoVar.my(jSONObject2.optInt("animationTranslateY"));
                    jpoVar.jd(jSONObject2.optString("animationRippleBackgroundColor"));
                    jpoVar.jpo(jSONObject2.optString("animationScaleDirection"));
                    jpoVar.qk(jSONObject2.optInt("animationFadeStart"));
                    jpoVar.xyk(jSONObject2.optInt("animationFadeEnd"));
                    jpoVar.jj(jSONObject2.optString("animationFillMode"));
                    jpoVar.zz(jSONObject2.optInt("animationBounceHeight"));
                    if (jjVar.jr() > 0.0d) {
                        jpoVar.cm(jpoVar.oya() + jjVar.jr());
                    }
                    arrayList.add(jpoVar);
                }
                jjVar.jpo(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                jjVar.se(jSONObject.optString("triggerSlideDirection", "0"));
                jjVar.jpo(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return jjVar;
    }

    public boolean aix() {
        return this.f18151ii;
    }

    public int as() {
        return this.umr;
    }

    public boolean au() {
        return this.my;
    }

    public boolean cgn() {
        return this.huv;
    }

    public int cm() {
        return this.pzk;
    }

    public boolean cql() {
        return this.jkt;
    }

    public int cz() {
        return this.f18156kb;
    }

    public boolean czp() {
        return this.ykp;
    }

    public String dm() {
        return this.f18172uu;
    }

    public int dn() {
        return this.xk;
    }

    public String dt() {
        return this.f18169sq;
    }

    public double duq() {
        return this.f18165rv;
    }

    public int ef() {
        return this.f18149hx;
    }

    public int eq() {
        return this.fri;
    }

    public int erj() {
        return this.ota;
    }

    public boolean et() {
        return this.f18141dn;
    }

    public String ez() {
        return this.fgt;
    }

    public boolean fgt() {
        return this.f18181zw;
    }

    public long fp() {
        return this.f18158mg;
    }

    public void fri() {
        jpo(this, this.ez);
    }

    public int fy() {
        return this.f18173va;
    }

    public boolean gf() {
        return this.f18157lq;
    }

    public String gmx() {
        return this.erj;
    }

    public String hk() {
        return this.jrx;
    }

    public int hks() {
        return this.f18177ya;
    }

    public String hmu() {
        return this.opi;
    }

    public float hna() {
        return this.xyk;
    }

    public int huv() {
        return this.vrc;
    }

    public int ic() {
        return this.tic;
    }

    /* renamed from: if, reason: not valid java name */
    public float m400if() {
        return this.f18152jd;
    }

    public boolean ii() {
        return this.sbx;
    }

    public void iwg() {
        jpo(this, this.f18147gf);
    }

    public int jd() {
        return this.f18137as;
    }

    public JSONObject jj() {
        return this.uhu;
    }

    public int jkt() {
        return this.fy;
    }

    public double jr() {
        return this.f18155ju;
    }

    public List<jpo> jrx() {
        return this.f18167sg;
    }

    public float ju() {
        return this.jpo;
    }

    public int kb() {
        return this.ree;
    }

    public int kgu() {
        return this.zrw;
    }

    public int kln() {
        return this.f18166se;
    }

    public String kye() {
        return this.f18180zq;
    }

    public int lq() {
        List<jpo> list = this.f18167sg;
        if (list == null) {
            return 0;
        }
        for (jpo jpoVar : list) {
            if ("translate".equals(jpoVar.zz()) && jpoVar.qk() < 0) {
                return -jpoVar.qk();
            }
        }
        return 0;
    }

    public int my() {
        return this.f18168sn;
    }

    public double nmd() {
        return this.f48if;
    }

    public boolean np() {
        return this.f18148hk;
    }

    public String nq() {
        return this.ted;
    }

    public double nzb() {
        return this.pdm;
    }

    public float opi() {
        return this.f18178yd;
    }

    public boolean ota() {
        return this.cgn;
    }

    public JSONObject ou() {
        return this.ez;
    }

    public float oya() {
        return this.f18153jj;
    }

    public String pdm() {
        return this.f18171tu;
    }

    public boolean pe() {
        return this.duq;
    }

    public float prr() {
        return this.f18163qk;
    }

    public int pzk() {
        return this.f18179yq;
    }

    public int qk() {
        return this.kgu;
    }

    public JSONObject ree() {
        return this.rxq;
    }

    public String roc() {
        return this.nzb;
    }

    public String rq() {
        return this.prr;
    }

    public String rv() {
        return this.f18142dt;
    }

    public String rxq() {
        return this.wcn;
    }

    public int rzi() {
        return this.kye;
    }

    public boolean sbx() {
        return this.f18150ic;
    }

    public String se() {
        return this.f18154jr;
    }

    public String sg() {
        return this.f18170tl;
    }

    public boolean sn() {
        return this.rzi;
    }

    public float sq() {
        return this.zz;
    }

    public boolean sz() {
        return this.f18160nq;
    }

    public String tic() {
        return this.sz;
    }

    public int tl() {
        return this.cql;
    }

    public String tu() {
        return this.hna;
    }

    public int uhu() {
        return this.gmx;
    }

    public int umr() {
        return this.ux;
    }

    public String uu() {
        return this.hmu;
    }

    public int ux() {
        return this.voc;
    }

    public String va() {
        return this.kln;
    }

    public int vk() {
        return this.wad;
    }

    public int voc() {
        return this.f18145et;
    }

    public String vrc() {
        return this.f18143ef;
    }

    public int vzb() {
        return this.f18175wu;
    }

    public String wad() {
        return this.hks;
    }

    public double wcn() {
        return this.f18162pe;
    }

    public int wqx() {
        return this.czp;
    }

    public int wu() {
        return this.aix;
    }

    public int ww() {
        return this.cz;
    }

    public int xk() {
        return this.f18140dm;
    }

    public double xyk() {
        return this.vzb;
    }

    public int ya() {
        return this.roc;
    }

    public String yd() {
        return this.ozw;
    }

    public boolean ykp() {
        return this.f18161ou;
    }

    public String yq() {
        return this.zmh;
    }

    public boolean zmh() {
        return this.f18159np;
    }

    public String zq() {
        return this.f18146fp;
    }

    public int zrw() {
        return this.f18144eq;
    }

    public int zw() {
        return this.iwg;
    }

    public int zz() {
        return this.f18176ww;
    }

    public void au(String str) {
        this.hmu = str;
    }

    public void cm(int i10) {
        this.f18168sn = i10;
    }

    public void dt(int i10) {
        this.aix = i10;
    }

    public void duq(int i10) {
        this.f18144eq = i10;
    }

    public void ef(int i10) {
        this.umr = i10;
    }

    public void hmu(int i10) {
        this.f18156kb = i10;
    }

    public void hna(String str) {
        this.kln = str;
    }

    public String hx() {
        return this.f18164rq;
    }

    /* renamed from: if, reason: not valid java name */
    public void m402if(String str) {
        this.f18142dt = str;
    }

    public void jd(int i10) {
        this.czp = i10;
    }

    public void jj(int i10) {
        this.f18176ww = i10;
    }

    public void jr(String str) {
        this.wcn = str;
    }

    public void ju(String str) {
        this.f18171tu = str;
    }

    public void kln(int i10) {
        this.cz = i10;
    }

    public void my(int i10) {
        this.kgu = i10;
    }

    public void nmd(String str) {
        this.hks = str;
    }

    public void nq(int i10) {
        this.ux = i10;
    }

    public void nzb(int i10) {
        this.f18179yq = i10;
    }

    public void opi(String str) {
        this.nzb = str;
    }

    public void oya(String str) {
        this.f18172uu = str;
    }

    public void pdm(int i10) {
        this.fri = i10;
    }

    public void prr(String str) {
        this.sz = str;
    }

    public void qk(float f10) {
        this.xyk = f10;
    }

    public void rq(int i10) {
        this.ree = i10;
    }

    public void rv(int i10) {
        this.f18175wu = i10;
    }

    public void se(int i10) {
        this.kye = i10;
    }

    public void sq(String str) {
        this.f18143ef = str;
    }

    public void sz(int i10) {
        this.gmx = i10;
    }

    public void tu(int i10) {
        this.voc = i10;
    }

    public void uu(int i10) {
        this.zrw = i10;
    }

    public void wqx(int i10) {
        this.pzk = i10;
    }

    public void xyk(float f10) {
        this.zz = f10;
    }

    public void yd(String str) {
        this.f18164rq = str;
    }

    public void zz(float f10) {
        this.f18178yd = f10;
    }

    public void au(int i10) {
        this.roc = i10;
    }

    public void cm(float f10) {
        this.f18139cm = f10;
    }

    public void dt(String str) {
        this.zmh = str;
    }

    public void hmu(String str) {
        this.fgt = str;
    }

    public void hna(int i10) {
        this.f18177ya = i10;
    }

    public void hx(int i10) {
        this.iwg = i10;
    }

    /* renamed from: if, reason: not valid java name */
    public void m401if(int i10) {
        this.vrc = i10;
    }

    public void jd(float f10) {
        this.f18152jd = f10;
    }

    public void jj(float f10) {
        this.f18163qk = f10;
    }

    public void jr(int i10) {
        this.ota = i10;
    }

    public void ju(int i10) {
        this.f18173va = i10;
    }

    public void my(float f10) {
        this.f18153jj = f10;
    }

    public void nmd(int i10) {
        this.wad = i10;
    }

    public void nq(String str) {
        this.f18180zq = str;
    }

    public void opi(int i10) {
        this.cql = i10;
    }

    public void oya(int i10) {
        this.xk = i10;
    }

    public void prr(int i10) {
        this.fy = i10;
    }

    public void qk(String str) {
        this.opi = str;
    }

    public void rq(String str) {
        this.f18170tl = str;
    }

    public void se(String str) {
        this.f18146fp = str;
    }

    public void sq(int i10) {
        this.f18145et = i10;
    }

    public void tu(String str) {
        this.erj = str;
    }

    public void wqx(float f10) {
        this.wqx = f10;
    }

    public void xyk(String str) {
        this.f18154jr = str;
    }

    public void yd(int i10) {
        this.tic = i10;
    }

    public void zz(String str) {
        this.nmd = str;
    }

    public void au(boolean z10) {
        this.f18148hk = z10;
    }

    public void cm(String str) {
        this.prr = str;
    }

    public void hna(boolean z10) {
        this.rzi = z10;
    }

    /* renamed from: if, reason: not valid java name */
    public void m403if(boolean z10) {
        this.f18161ou = z10;
    }

    public void jd(boolean z10) {
        this.my = z10;
    }

    public void jj(String str) {
        this.f18169sq = str;
    }

    public void ju(boolean z10) {
        this.f18151ii = z10;
    }

    public void my(String str) {
        this.hna = str;
    }

    public void opi(boolean z10) {
        this.f18159np = z10;
    }

    public void oya(boolean z10) {
        this.f18157lq = z10;
    }

    public void prr(boolean z10) {
        this.ykp = z10;
    }

    public void qk(int i10) {
        this.f18166se = i10;
    }

    public void sq(boolean z10) {
        this.f18181zw = z10;
    }

    public void wqx(double d10) {
        this.f48if = d10;
    }

    public void xyk(int i10) {
        this.f18149hx = i10;
    }

    public void yd(boolean z10) {
        this.cgn = z10;
    }

    public void zz(int i10) {
        this.f18140dm = i10;
    }

    public void cm(double d10) {
        this.pdm = d10;
    }

    public void jd(double d10) {
        this.f18155ju = d10;
    }

    public void jj(double d10) {
        this.f18162pe = d10;
    }

    public void my(double d10) {
        this.f18165rv = d10;
    }

    public void qk(boolean z10) {
        this.f18141dn = z10;
    }

    public void wqx(String str) {
        this.oya = str;
    }

    public void xyk(boolean z10) {
        this.sbx = z10;
    }

    public void zz(boolean z10) {
        this.jkt = z10;
    }

    public void cm(boolean z10) {
        this.duq = z10;
    }

    public void jd(String str) {
        this.f18138au = str;
    }

    public void jj(boolean z10) {
        this.huv = z10;
    }

    public void my(boolean z10) {
        this.f18150ic = z10;
    }

    public void wqx(boolean z10) {
        this.f18160nq = z10;
    }

    public void cm(JSONObject jSONObject) {
        this.ez = jSONObject;
    }

    public void jd(JSONObject jSONObject) {
        this.rxq = jSONObject;
    }

    public void my(JSONObject jSONObject) {
        this.uhu = jSONObject;
    }

    public void wqx(JSONObject jSONObject) {
        this.f18147gf = jSONObject;
    }

    public boolean jpo() {
        return this.f18174vk;
    }

    public void jpo(boolean z10) {
        this.f18174vk = z10;
    }

    public void jpo(int i10) {
        this.f18137as = i10;
    }

    public void jpo(double d10) {
        this.vzb = d10;
    }

    public void jpo(String str) {
        this.ozw = str;
    }

    public void jpo(float f10) {
        this.jpo = f10;
    }

    public void jpo(List<jpo> list) {
        this.f18167sg = list;
    }

    public void jpo(long j10) {
        this.f18158mg = j10;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void jpo(jj jjVar, JSONObject jSONObject) {
        if (jjVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            char c10 = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c10 = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c10 = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c10 = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c10 = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c10 = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        c10 = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c10 = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c10 = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        c10 = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c10 = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c10 = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c10 = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c10 = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c10 = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c10 = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        c10 = 26;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c10 = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c10 = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c10 = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c10 = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c10 = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c10 = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        c10 = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c10 = AbstractJsonLexerKt.STRING;
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals(TtmlNode.LEFT)) {
                        c10 = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c10 = '$';
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                        c10 = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c10 = '&';
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c10 = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals(TtmlNode.RIGHT)) {
                        c10 = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c10 = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c10 = GMTDateParser.ANY;
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c10 = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c10 = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c10 = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c10 = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c10 = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c10 = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c10 = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c10 = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c10 = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals(C3191e4.h.L)) {
                        c10 = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c10 = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c10 = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c10 = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c10 = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c10 = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c10 = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c10 = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c10 = '<';
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c10 = G5.T;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c10 = '>';
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c10 = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c10 = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c10 = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        c10 = 'B';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    jjVar.wqx(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    jjVar.prr(jSONObject.optString(next));
                    break;
                case 2:
                    jjVar.se(jSONObject.optString(next));
                    break;
                case 3:
                    jjVar.qk(jSONObject.optString(next));
                    break;
                case 4:
                    jjVar.zz(jSONObject.optInt(next));
                    break;
                case 5:
                    jjVar.opi(jSONObject.optBoolean(next));
                    break;
                case 6:
                    jjVar.jj(jSONObject.optBoolean(next));
                    break;
                case 7:
                    jjVar.au(jSONObject.optString(next));
                    break;
                case '\b':
                    jjVar.jj((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    jjVar.jd(jSONObject.optString(next));
                    break;
                case '\n':
                    jjVar.dt(jSONObject.optInt(next));
                    break;
                case 11:
                    jjVar.wqx(jSONObject.optString(next));
                    break;
                case '\f':
                    jjVar.wqx((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    jjVar.cm(jSONObject.optString(next));
                    break;
                case 14:
                    jjVar.rq(jSONObject.optString(next));
                    break;
                case 15:
                    jjVar.jd(jSONObject.optBoolean(next));
                    break;
                case 16:
                    jjVar.yd(jSONObject.optInt(next));
                    break;
                case 17:
                    jjVar.yd(jSONObject.optBoolean(next));
                    break;
                case 18:
                    jjVar.jpo(jSONObject.optLong(next));
                    break;
                case 19:
                    jjVar.tu(jSONObject.optString(next));
                    break;
                case 20:
                    jjVar.sq(jSONObject.optInt(next));
                    break;
                case 21:
                    jjVar.nq(jSONObject.optInt(next));
                    break;
                case 22:
                    jjVar.zz(jSONObject.optBoolean(next));
                    break;
                case 23:
                    jjVar.prr(jSONObject.optInt(next));
                    break;
                case 24:
                    jjVar.hmu(jSONObject.optInt(next));
                    break;
                case 25:
                    jjVar.jd(jSONObject.optDouble(next));
                    break;
                case 26:
                    jjVar.jj(jSONObject.optDouble(next));
                    break;
                case 27:
                    jjVar.jr(jSONObject.optInt(next));
                    break;
                case 28:
                    jjVar.xyk(jSONObject.optBoolean(next));
                    break;
                case 29:
                    jjVar.ju(jSONObject.optInt(next));
                    break;
                case 30:
                    jjVar.jj(jSONObject.optString(next));
                    break;
                case 31:
                    jjVar.qk(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    jjVar.ju(jSONObject.optString(next));
                    break;
                case '!':
                    jjVar.tu(jSONObject.optInt(next));
                    break;
                case '\"':
                    jjVar.nmd(jSONObject.optString(next));
                    break;
                case '#':
                    jjVar.nmd(jSONObject.optInt(next));
                    break;
                case '$':
                    jjVar.jpo(jSONObject.optBoolean(next));
                    break;
                case '%':
                    jjVar.xyk((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    jjVar.jr(jSONObject.optString(next));
                    break;
                case '\'':
                    jjVar.my(jSONObject.optString(next));
                    break;
                case '(':
                    jjVar.rq(jSONObject.optInt(next));
                    break;
                case ')':
                    jjVar.cm((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    jjVar.wqx(jSONObject.optDouble(next));
                    break;
                case '+':
                    jjVar.my((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    jjVar.ju(jSONObject.optBoolean(next));
                    break;
                case '-':
                    jjVar.oya(jSONObject.optBoolean(next));
                    break;
                case '.':
                    jjVar.zz((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    jjVar.opi(jSONObject.optString(next));
                    break;
                case '0':
                    jjVar.rv(jSONObject.optInt(next));
                    break;
                case '1':
                    jjVar.qk((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    jjVar.xyk(jSONObject.optString(next));
                    break;
                case '3':
                    jjVar.zz(jSONObject.optString(next));
                    break;
                case '4':
                    jjVar.hna(jSONObject.optInt(next));
                    break;
                case '5':
                    jjVar.my(jSONObject.optBoolean(next));
                    break;
                case '6':
                    jjVar.au(jSONObject.optInt(next));
                    break;
                case '7':
                    jjVar.sq(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        jjVar.qk(jSONObjectOptJSONObject.optInt("translateY", 0));
                        jjVar.xyk(jSONObjectOptJSONObject.optInt("translateX", 0));
                        jjVar.cm(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        jjVar.my(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    jjVar.cm(jSONObject.optBoolean(next));
                    break;
                case ':':
                    jjVar.m402if(jSONObject.optString(next));
                    break;
                case ';':
                    jjVar.oya(jSONObject.optString(next));
                    break;
                case '<':
                    jjVar.jpo((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    jjVar.hna(jSONObject.optString(next));
                    break;
                case '>':
                    jjVar.yd(jSONObject.optString(next));
                    break;
                case '?':
                    jjVar.opi(jSONObject.optInt(next));
                    break;
                case '@':
                    jjVar.jd((float) jSONObject.optDouble(next));
                    break;
                case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                    jjVar.m401if(jSONObject.optInt(next));
                    break;
                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                    jjVar.oya(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
