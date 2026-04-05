package com.bytedance.adsdk.ugeno.jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.cm.zz;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.core.au;
import com.bytedance.adsdk.ugeno.core.hna;
import com.bytedance.adsdk.ugeno.core.jd.cm;
import com.bytedance.adsdk.ugeno.core.jd.my;
import com.bytedance.adsdk.ugeno.core.ju;
import com.bytedance.adsdk.ugeno.core.opi;
import com.bytedance.adsdk.ugeno.core.oya;
import com.bytedance.adsdk.ugeno.core.prr;
import com.bytedance.adsdk.ugeno.core.qk;
import com.bytedance.adsdk.ugeno.core.xyk;
import com.bytedance.adsdk.ugeno.core.yd;
import com.bytedance.adsdk.ugeno.jd.jpo;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.jpo.jj;
import com.bytedance.adsdk.ugeno.qk.jpo;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class wqx<T extends View> implements View.OnTouchListener, cm, prr.jd, prr.jpo {
    protected float aix;

    /* renamed from: as, reason: collision with root package name */
    private boolean f17795as;

    /* renamed from: au, reason: collision with root package name */
    protected float f17796au;
    protected float cgn;
    private boolean clt;

    /* renamed from: cm, reason: collision with root package name */
    protected JSONObject f17797cm;
    private boolean cnl;
    protected boolean cql;
    protected float cz;
    private boolean czp;

    /* renamed from: dm, reason: collision with root package name */
    protected int f17798dm;

    /* renamed from: dn, reason: collision with root package name */
    protected boolean f17799dn;

    /* renamed from: dt, reason: collision with root package name */
    protected boolean f17800dt;
    protected boolean duq;

    /* renamed from: ef, reason: collision with root package name */
    protected boolean f17801ef;

    /* renamed from: eq, reason: collision with root package name */
    protected boolean f17802eq;
    protected float erj;

    /* renamed from: et, reason: collision with root package name */
    protected int f17803et;
    private boolean ez;

    /* renamed from: fc, reason: collision with root package name */
    private JSONObject f17804fc;
    private com.bytedance.adsdk.ugeno.core.jpo fgt;

    /* renamed from: fp, reason: collision with root package name */
    private boolean f17805fp;
    private String fri;
    private long fxd;
    protected float fy;

    /* renamed from: gf, reason: collision with root package name */
    private boolean f17806gf;
    protected float gmx;
    private boolean hd;

    /* renamed from: hk, reason: collision with root package name */
    @Deprecated
    private com.bytedance.adsdk.ugeno.core.jd.jd f17807hk;
    protected int hks;
    protected boolean hmu;
    protected float hna;
    protected float huv;

    /* renamed from: hx, reason: collision with root package name */
    protected float f17808hx;

    /* renamed from: ic, reason: collision with root package name */
    protected float f17809ic;

    /* renamed from: if, reason: not valid java name */
    protected String f36if;

    /* renamed from: ii, reason: collision with root package name */
    protected float f17810ii;
    private float iqh;
    private yd iwg;

    /* renamed from: jd, reason: collision with root package name */
    protected Context f17811jd;

    /* renamed from: jj, reason: collision with root package name */
    protected jpo<ViewGroup> f17812jj;
    protected boolean jkt;
    private boolean jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected float f17813jr;
    private boolean jrx;

    /* renamed from: ju, reason: collision with root package name */
    protected String f17814ju;

    /* renamed from: kb, reason: collision with root package name */
    protected float f17815kb;
    private boolean kgu;
    protected boolean kln;

    @Deprecated
    private cm.jpo kye;

    /* renamed from: lq, reason: collision with root package name */
    private boolean f17816lq;

    /* renamed from: mg, reason: collision with root package name */
    private opi f17817mg;
    protected T my;
    protected float nmd;

    /* renamed from: np, reason: collision with root package name */
    protected jpo.C0066jpo f17818np;

    /* renamed from: nq, reason: collision with root package name */
    protected boolean f17819nq;
    protected boolean nzb;

    /* renamed from: oo, reason: collision with root package name */
    private boolean f17820oo;
    protected float opi;
    protected ViewGroup.LayoutParams ota;

    /* renamed from: ou, reason: collision with root package name */
    @Deprecated
    private my f17821ou;
    protected float oya;
    private boolean ozw;
    protected float pdm;

    /* renamed from: pe, reason: collision with root package name */
    protected boolean f17822pe;
    protected float prr;
    private GradientDrawable pzk;

    /* renamed from: qk, reason: collision with root package name */
    protected jpo<ViewGroup> f17823qk;

    /* renamed from: ql, reason: collision with root package name */
    private boolean f17824ql;
    protected jj ree;
    protected boolean roc;

    /* renamed from: rq, reason: collision with root package name */
    protected float f17825rq;

    /* renamed from: rv, reason: collision with root package name */
    protected float f17826rv;
    protected String rxq;
    protected com.bytedance.adsdk.ugeno.core.jj rzi;
    protected boolean sbx;

    /* renamed from: se, reason: collision with root package name */
    protected float f17827se;

    /* renamed from: sg, reason: collision with root package name */
    protected float f17828sg;

    /* renamed from: sn, reason: collision with root package name */
    private String f17829sn;

    /* renamed from: sq, reason: collision with root package name */
    protected float f17830sq;
    protected boolean sz;
    private boolean ted;
    protected String tic;

    /* renamed from: tl, reason: collision with root package name */
    protected float f17831tl;

    /* renamed from: tu, reason: collision with root package name */
    protected boolean f17832tu;
    private boolean uhu;
    protected xyk umr;

    /* renamed from: uu, reason: collision with root package name */
    protected float f17833uu;
    protected float ux;

    /* renamed from: va, reason: collision with root package name */
    protected ImageView.ScaleType f17834va;

    /* renamed from: vk, reason: collision with root package name */
    protected float f17835vk;
    protected float voc;
    protected float vrc;
    protected zz vzb;
    protected com.bytedance.adsdk.ugeno.jpo.jpo wad;
    protected boolean wcn;
    protected JSONObject wqx;

    /* renamed from: wu, reason: collision with root package name */
    protected float f17836wu;

    /* renamed from: ww, reason: collision with root package name */
    private boolean f17837ww;
    protected float xk;

    /* renamed from: xp, reason: collision with root package name */
    private boolean f17838xp;
    private com.bytedance.adsdk.ugeno.cm.jpo.jpo xur;
    protected qk.jpo xyk;

    /* renamed from: ya, reason: collision with root package name */
    protected float f17839ya;

    /* renamed from: yd, reason: collision with root package name */
    protected boolean f17840yd;
    protected hna ykp;

    /* renamed from: yq, reason: collision with root package name */
    protected prr f17841yq;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.jd.wqx zmh;

    /* renamed from: zq, reason: collision with root package name */
    private boolean f17842zq;

    @Deprecated
    private com.bytedance.adsdk.ugeno.core.jd.jj zrw;

    /* renamed from: zw, reason: collision with root package name */
    protected Map<Integer, au> f17843zw;
    protected ju zz;

    public wqx(Context context) {
        this(context, null);
    }

    @Deprecated
    private void cm() throws JSONException {
        com.bytedance.adsdk.ugeno.core.jd.cm cmVarCm;
        this.my.setVisibility(this.f17803et);
        float f10 = this.gmx;
        if (f10 != 0.0f) {
            this.my.setRotation(f10);
        }
        qk.jpo jpoVar = this.xyk;
        if (jpoVar != null && TextUtils.isEmpty(jpoVar.jd())) {
            this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    wqx wqxVar = wqx.this;
                    if (wqxVar.umr != null) {
                        boolean unused = wqxVar.f17824ql;
                    }
                }
            });
        } else if (jd(1) && !this.f17842zq) {
            this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Log.d("GesThrough_UGenWidget", "UGenWidget onClick handling");
                    wqx wqxVar = wqx.this;
                    if (wqxVar.f17841yq == null || !wqxVar.f17824ql) {
                        return;
                    }
                    wqx wqxVar2 = wqx.this;
                    prr prrVar = wqxVar2.f17841yq;
                    au auVar = wqxVar2.f17843zw.get(1);
                    wqx wqxVar3 = wqx.this;
                    prrVar.jpo(auVar, wqxVar3, wqxVar3);
                }
            });
        }
        if (this.f17841yq != null && jd(4)) {
            if (jd(1)) {
                Log.d("GesThrough_UGenWidget", "onSlide & onTap, view.id: " + ef());
                this.f17805fp = true;
                this.f17821ou = new my(this.f17811jd, this.f17843zw.get(4), this.f17843zw.get(1), this.f17805fp, dn());
            } else {
                Log.d("GesThrough_UGenWidget", "onSlide only, view.id: " + ef());
                this.f17821ou = new my(this.f17811jd, this.f17843zw.get(4), this.f17805fp, dn());
            }
        }
        if (this.f17841yq != null && jd(1) && this.f17842zq) {
            Log.d("GesThrough_UGenWidget", "onTap only, mOnlyTap: " + this.f17842zq + ", view.id: " + ef());
            this.zmh = new com.bytedance.adsdk.ugeno.core.jd.wqx(this.f17811jd, this.f17843zw.get(1));
        }
        zz();
        if (this.f17841yq != null && jd(3) && (cmVarCm = com.bytedance.adsdk.ugeno.my.jpo().cm()) != null) {
            this.kye = cmVarCm.jpo(this.f17811jd, this);
            new Object() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.3
            };
        }
        if (this.f17841yq != null && jd(9)) {
            com.bytedance.adsdk.ugeno.core.jd.jj jjVar = new com.bytedance.adsdk.ugeno.core.jd.jj(this.f17811jd, this.f17843zw.get(9), this);
            this.zrw = jjVar;
            jjVar.jpo(this.f17841yq);
        }
        if (jd(10)) {
            com.bytedance.adsdk.ugeno.core.jd.jd jdVar = new com.bytedance.adsdk.ugeno.core.jd.jd(this.f17811jd, this.f17843zw.get(10), this);
            this.f17807hk = jdVar;
            jdVar.jpo(this.f17841yq);
        }
    }

    private void jkt() {
        float f10 = this.wcn ? this.f17809ic : this.xk;
        float f11 = this.f17799dn ? this.huv : this.xk;
        float f12 = this.sbx ? this.fy : this.xk;
        float f13 = this.jkt ? this.f17839ya : this.xk;
        this.pzk.setCornerRadii(new float[]{f10, f10, f11, f11, f13, f13, f12, f12});
    }

    private void sbx() {
        if (TextUtils.equals("dashed", this.rxq)) {
            GradientDrawable gradientDrawable = this.pzk;
            float f10 = this.cgn;
            gradientDrawable.setStroke((int) f10, this.hks, 3.0f * f10, f10);
        } else {
            if (!TextUtils.equals("dotted", this.rxq)) {
                this.pzk.setStroke((int) this.cgn, this.hks);
                return;
            }
            GradientDrawable gradientDrawable2 = this.pzk;
            float f11 = this.cgn;
            gradientDrawable2.setStroke((int) f11, this.hks, f11 / 2.0f, f11);
        }
    }

    private void yd() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17814ju);
        this.my.setContentDescription(sb2);
    }

    private void zz() throws JSONException {
        au auVar;
        if (this.f17841yq == null || !jd(18) || (auVar = this.f17843zw.get(18)) == null) {
            return;
        }
        JSONObject jSONObjectWqx = auVar.wqx();
        if (jSONObjectWqx != null) {
            try {
                jSONObjectWqx.put("rotateZ", com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObjectWqx.optString("rotateZ"), this.f17797cm));
            } catch (JSONException unused) {
            }
        }
        this.f17841yq.jpo(auVar, this, this);
    }

    public void au() {
        this.cnl = this.f17797cm.optBoolean("gesture_through_enable", false);
        Log.d("GesThrough_UGenWidget", "mGestureThroughEnabled: " + this.cnl);
    }

    public int dm() {
        return (int) this.oya;
    }

    public boolean dn() {
        return this.cnl;
    }

    public float dt() {
        return this.xk;
    }

    public int duq() {
        return (int) this.f17796au;
    }

    public String ef() {
        return this.f17814ju;
    }

    public float fy() {
        T t10 = this.my;
        if (t10 instanceof com.bytedance.adsdk.ugeno.jpo.qk) {
            return ((com.bytedance.adsdk.ugeno.jpo.qk) t10).getShine();
        }
        return 0.0f;
    }

    public prr hmu() {
        return this.f17841yq;
    }

    public float hna() {
        return this.f17831tl;
    }

    public float huv() {
        T t10 = this.my;
        if (t10 instanceof com.bytedance.adsdk.ugeno.jpo.qk) {
            return ((com.bytedance.adsdk.ugeno.jpo.qk) t10).getStretch();
        }
        return 0.0f;
    }

    public void hx() {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmapJpo;
        if (TextUtils.isEmpty(this.tic)) {
            if (this.f17802eq) {
                jpo(this.f17818np);
                return;
            } else {
                this.pzk.setColor(this.f17798dm);
                cm(this.f17798dm);
                return;
            }
        }
        if (!this.tic.startsWith("local://")) {
            pdm();
            return;
        }
        String strReplace = this.tic.replace("local://", "");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = this.roc ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f17811jd.getResources().openRawResource(com.bytedance.adsdk.ugeno.qk.cm.jd(this.f17811jd, strReplace)), null, options);
            if (this.roc && (bitmapJpo = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, bitmapDecodeStream, (int) this.vrc)) != null) {
                bitmapDrawable = new BitmapDrawable(this.f17811jd.getResources(), bitmapJpo);
                jpo(bitmapDrawable);
            } else {
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.f17811jd.getResources(), bitmapDecodeStream);
                bitmapDrawable = bitmapDrawable2;
                jpo(bitmapDrawable);
            }
        } catch (Throwable unused) {
        }
    }

    public float ic() {
        T t10 = this.my;
        if (t10 instanceof com.bytedance.adsdk.ugeno.jpo.qk) {
            return ((com.bytedance.adsdk.ugeno.jpo.qk) t10).getRipple();
        }
        return 0.0f;
    }

    /* renamed from: if, reason: not valid java name */
    public JSONObject m389if() {
        return this.f17797cm;
    }

    public void jd(JSONObject jSONObject) {
        this.f17797cm = jSONObject;
        au();
    }

    public wqx<T> jj(String str) {
        return wqx(str);
    }

    public T jpo() {
        return null;
    }

    public float jr() {
        return this.f17836wu;
    }

    public T ju() {
        return this.my;
    }

    public jpo kln() {
        return this.f17812jj;
    }

    public wqx<T> my(String str) {
        return jd(str);
    }

    public float nmd() {
        return this.f17828sg;
    }

    public long nq() {
        return this.fxd;
    }

    public String nzb() {
        return this.f36if;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        my myVar;
        prr prrVar;
        com.bytedance.adsdk.ugeno.core.jd.wqx wqxVar;
        Log.d("GesThrough_UGenWidget", "UGenWidget onTouch event: " + motionEvent.toString());
        int action = motionEvent.getAction();
        if (action == 0) {
            roc();
        } else if (action == 1 || action == 3) {
            pe();
        }
        hna hnaVar = this.ykp;
        if (hnaVar != null) {
            hnaVar.jpo(this, motionEvent);
        }
        if (jd(17) && motionEvent.getAction() == 0) {
            this.f17841yq.jpo(this.f17843zw.get(17), this, this);
        }
        if (jd(1) && this.f17842zq && (prrVar = this.f17841yq) != null && (wqxVar = this.zmh) != null) {
            return wqxVar.jpo(prrVar, this, motionEvent);
        }
        prr prrVar2 = this.f17841yq;
        if (prrVar2 != null && (myVar = this.f17821ou) != null) {
            return myVar.jpo(prrVar2, this, motionEvent, dn());
        }
        zz zzVar = this.vzb;
        if (zzVar != null) {
            return zzVar.jpo(motionEvent);
        }
        return false;
    }

    public float opi() {
        return this.f17815kb;
    }

    public void oya() {
        this.my.setPadding((int) (this.kln ? this.f17808hx : this.f17827se), (int) (this.nzb ? this.f17826rv : this.f17827se), (int) (this.f17801ef ? this.pdm : this.f17827se), (int) (this.duq ? this.f17833uu : this.f17827se));
    }

    public void pdm() {
        com.bytedance.adsdk.ugeno.my.jpo().jd().jpo(this.zz, this.tic, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.4
            @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
            public void jpo(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                wqx wqxVar = wqx.this;
                if (!wqxVar.roc) {
                    com.bytedance.adsdk.ugeno.qk.xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            wqx.this.jpo(new BitmapDrawable(bitmap));
                        }
                    });
                    return;
                }
                final Bitmap bitmapJpo = com.bytedance.adsdk.ugeno.qk.xyk.jpo(wqxVar.f17811jd, bitmap, (int) wqxVar.vrc);
                if (bitmapJpo != null) {
                    com.bytedance.adsdk.ugeno.qk.xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.jd.wqx.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            wqx.this.jpo(new BitmapDrawable(bitmapJpo));
                        }
                    });
                }
            }
        });
    }

    public void pe() {
    }

    public float prr() {
        return this.aix;
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void qk() {
        com.bytedance.adsdk.ugeno.core.jpo jpoVar = this.fgt;
        if (jpoVar != null) {
            yd ydVar = new yd(this.my, jpoVar);
            this.iwg = ydVar;
            ydVar.jpo();
        }
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar2 = this.wad;
        if (jpoVar2 != null) {
            jpoVar2.jpo();
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            jjVar.jd();
        }
        zz zzVar = this.vzb;
        if (zzVar != null) {
            zzVar.my();
        }
        if (this.f17807hk != null && jd(10)) {
            this.f17807hk.jpo();
        }
        if (this.zrw != null && jd(9)) {
            this.zrw.jpo();
        }
        my myVar = this.f17821ou;
        if (myVar != null) {
            myVar.jpo();
        }
        this.fxd = System.currentTimeMillis();
    }

    public void roc() {
    }

    public float rq() {
        return this.gmx;
    }

    public ViewGroup.LayoutParams rv() {
        return this.ota;
    }

    public JSONObject se() {
        return this.wqx;
    }

    public float sq() {
        return this.f17835vk;
    }

    public boolean sz() {
        return this.f17840yd;
    }

    public boolean tic() {
        return this.cql;
    }

    public float tu() {
        return this.cz;
    }

    public qk.jpo uu() {
        return this.xyk;
    }

    public int va() {
        return this.f17798dm;
    }

    public com.bytedance.adsdk.ugeno.cm.jpo.jpo vrc() {
        return this.xur;
    }

    public boolean wcn() {
        return this.czp;
    }

    public boolean xk() {
        return this.f17810ii > 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void xyk() {
        yd ydVar = this.iwg;
        if (ydVar != null) {
            ydVar.jd();
        }
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
        if (jpoVar != null) {
            jpoVar.wqx();
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            jjVar.wqx();
        }
    }

    public float ya() {
        T t10 = this.my;
        if (t10 instanceof com.bytedance.adsdk.ugeno.jpo.qk) {
            return ((com.bytedance.adsdk.ugeno.jpo.qk) t10).getRubIn();
        }
        return 0.0f;
    }

    public wqx(Context context, jpo<ViewGroup> jpoVar) {
        this.f17796au = -2.0f;
        this.oya = -2.0f;
        this.rxq = "solid";
        this.f17803et = 0;
        this.cql = true;
        this.voc = 0.0f;
        this.aix = 0.0f;
        this.f17831tl = 0.0f;
        this.erj = 1.0f;
        this.f17835vk = 1.0f;
        this.f17815kb = 1.0f;
        this.ux = 0.0f;
        this.f17836wu = 0.0f;
        this.f17828sg = 0.0f;
        this.gmx = 0.0f;
        this.cz = 1.0f;
        this.f17795as = true;
        this.f17824ql = true;
        this.f17820oo = false;
        this.hd = false;
        this.cnl = false;
        this.iqh = 12.0f;
        this.f17811jd = context;
        this.f17812jj = jpoVar;
        this.f17843zw = new HashMap();
        this.pzk = new GradientDrawable();
        this.my = (T) jpo();
    }

    /* renamed from: if, reason: not valid java name */
    private boolean m388if(String str) {
        return TextUtils.isEmpty(str) || !TextUtils.equals(str, "hidden");
    }

    private ImageView.ScaleType ju(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.f17834va = ImageView.ScaleType.CENTER;
                break;
            case "fit":
                this.f17834va = ImageView.ScaleType.FIT_CENTER;
                break;
            case "crop":
                this.f17834va = ImageView.ScaleType.CENTER_CROP;
                break;
            default:
                this.f17834va = ImageView.ScaleType.FIT_XY;
                break;
        }
        return this.f17834va;
    }

    private void wqx() {
        if (this.jpo) {
            this.my.setTranslationX(this.aix);
        }
        if (this.f17806gf) {
            this.my.setTranslationY(this.f17831tl);
        }
        if (this.ez) {
            this.my.setScaleX(this.f17835vk);
        }
        if (this.kgu) {
            this.my.setScaleY(this.f17815kb);
        }
        if (this.jrx) {
            this.my.setRotation(this.ux);
        }
        if (this.f17816lq) {
            this.my.setRotationX(this.f17836wu);
        }
        if (this.uhu) {
            this.my.setRotationY(-this.f17828sg);
        }
        if (this.f17837ww) {
            this.my.setAlpha(this.cz);
        }
        float f10 = this.gmx;
        if (f10 != 0.0f) {
            this.my.setRotation(f10);
        }
        if (this.jrx || this.f17816lq || this.uhu) {
            this.my.setCameraDistance(10000.0f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jj() {
        if (this.f17817mg == null || this.f17838xp) {
            return;
        }
        this.f17838xp = true;
    }

    public void jpo(JSONObject jSONObject) throws JSONException {
        this.f17797cm = jSONObject;
        au();
        JSONObject jSONObject2 = this.wqx;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        jpo.C0062jpo c0062jpoYd = this.f17812jj != null ? this.f17812jj.yd() : null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(this.wqx.optString(next), jSONObject);
            jpo(next, strJpo);
            if (c0062jpoYd != null) {
                c0062jpoYd.jpo(this.f17811jd, next, strJpo);
            }
        }
        if (c0062jpoYd != null) {
            jpo(c0062jpoYd.jpo());
        }
        if (this.f17804fc == null || this.f17797cm == null) {
            return;
        }
        try {
            if (!sz()) {
                this.f17797cm.put("i18n", this.f17804fc);
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i18n", this.f17804fc);
            this.f17797cm.put("xNode", jSONObject3);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void my() {
        if (this.f17817mg == null || this.ted) {
            return;
        }
        this.ted = true;
    }

    public void jd() throws JSONException {
        hx();
        oya();
        wqx(this.f17803et);
        wqx();
        cm();
        zz zzVar = this.vzb;
        if (zzVar != null) {
            zzVar.jpo();
            this.vzb.jd();
            this.vzb.wqx();
        }
        this.my.setOnTouchListener(this);
        yd();
        ViewGroup viewGroup = (ViewGroup) this.my.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(!this.f17795as);
        }
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
        if (jpoVar != null) {
            jpoVar.cm();
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            jjVar.jpo();
        }
        zz zzVar2 = this.vzb;
        if (zzVar2 != null) {
            zzVar2.cm();
        }
        if (this.f17841yq == null || !jd(22)) {
            return;
        }
        this.f17841yq.jpo(this.f17843zw.get(22), this, this);
    }

    public com.bytedance.adsdk.ugeno.jpo.jpo yd(String str) {
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
        if (jpoVar != null && TextUtils.equals(str, jpoVar.my())) {
            return this.wad;
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            return jjVar.jpo(str);
        }
        return null;
    }

    public void jj(int i10) {
        if (sz()) {
            T t10 = this.my;
            if (t10 instanceof jd) {
                ((jd) t10).jd(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof jd) {
                ((jd) viewParent).jd(this.my, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.my.getLayoutParams();
        layoutParams.height = i10;
        this.my.setLayoutParams(layoutParams);
    }

    public void my(int i10) {
        if (sz()) {
            T t10 = this.my;
            if (t10 instanceof jd) {
                ((jd) t10).jpo(i10);
                return;
            }
            ViewParent viewParent = (ViewGroup) t10.getParent();
            if (viewParent instanceof jd) {
                ((jd) viewParent).jpo(this.my, i10);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.my.getLayoutParams();
        layoutParams.width = i10;
        this.my.setLayoutParams(layoutParams);
    }

    public void xyk(String str) {
        this.f36if = str;
    }

    public List<com.bytedance.adsdk.ugeno.cm.cm.wqx> zz(String str) {
        zz zzVar;
        if (TextUtils.isEmpty(str) || (zzVar = this.vzb) == null) {
            return null;
        }
        return zzVar.jpo(str);
    }

    public void qk(String str) {
        this.f17814ju = str;
    }

    public void jpo(opi opiVar) {
        this.f17817mg = opiVar;
    }

    public void jpo(hna hnaVar) {
        this.ykp = hnaVar;
    }

    public void jpo(prr prrVar) {
        this.f17841yq = prrVar;
    }

    public void wqx(int i10) {
        ViewParent viewParent = (ViewGroup) this.my.getParent();
        if (viewParent instanceof jd) {
            ((jd) viewParent).wqx(this.my, i10);
        } else {
            this.my.setVisibility(i10);
        }
    }

    public void jpo(jpo.C0066jpo c0066jpo) {
        if (c0066jpo == null) {
            return;
        }
        this.pzk.setShape(0);
        this.pzk.setOrientation(c0066jpo.jpo);
        if (Build.VERSION.SDK_INT >= 29) {
            this.pzk.setColors(c0066jpo.f17957jd, c0066jpo.wqx);
        } else {
            this.pzk.setColors(c0066jpo.f17957jd);
        }
        jkt();
        sbx();
        this.my.setBackground(this.pzk);
    }

    public boolean jd(int i10) {
        Map<Integer, au> map = this.f17843zw;
        return map != null && map.containsKey(Integer.valueOf(i10));
    }

    public wqx<T> jd(String str) {
        if (TextUtils.isEmpty(this.f36if) || !TextUtils.equals(this.f36if, str)) {
            return null;
        }
        return this;
    }

    public void wqx(JSONObject jSONObject) {
        this.wqx = jSONObject;
    }

    public void jd(String str, String str2) {
        if (TextUtils.isEmpty(str2) || this.f17843zw == null) {
            return;
        }
        try {
            int iJpo = oya.jpo(str).jpo();
            au auVar = new au();
            auVar.jpo(iJpo);
            auVar.jpo(this);
            JSONObject jSONObject = new JSONObject(str2);
            if (iJpo == 3) {
                try {
                    this.iqh = Float.parseFloat(com.bytedance.adsdk.ugeno.wqx.jd.jpo(jSONObject.optString("shakeAmplitude"), this.f17797cm));
                } catch (NumberFormatException unused) {
                    this.iqh = 12.0f;
                }
            }
            if (!(this.f17841yq instanceof com.bytedance.adsdk.ugeno.core.jpo.jd)) {
                jpo(iJpo, jSONObject, auVar);
                return;
            }
            throw null;
        } catch (JSONException unused2) {
        }
    }

    public wqx<T> wqx(String str) {
        if (yd(str) != null) {
            return this;
        }
        return null;
    }

    public void jpo(Drawable drawable) {
        this.my.setBackground(drawable);
    }

    public void cm(int i10) {
        this.pzk.setShape(0);
        this.pzk.setColor(i10);
        jkt();
        sbx();
        this.my.setBackground(this.pzk);
    }

    public void jpo(ViewGroup.LayoutParams layoutParams) {
        T t10 = this.my;
        if (t10 != null) {
            t10.setLayoutParams(layoutParams);
        }
        this.ota = layoutParams;
    }

    public void jpo(boolean z10, boolean z11) {
        if (this.my != null) {
            jpo(this.ota);
            if (z10) {
                my((int) this.f17796au);
            }
            if (z11) {
                jj((int) this.oya);
            }
        }
    }

    public wqx<T> cm(String str) {
        return jpo(str);
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jd(Canvas canvas) {
        if (this instanceof jpo) {
            com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
            if (jpoVar != null) {
                jpoVar.jd(canvas);
            }
            jj jjVar = this.ree;
            if (jjVar != null) {
                jjVar.jd(canvas);
            }
        }
    }

    public void jpo(qk.jpo jpoVar) {
        this.xyk = jpoVar;
    }

    public wqx<T> jpo(String str) {
        if (TextUtils.isEmpty(this.f17814ju) || !TextUtils.equals(this.f17814ju, str)) {
            return null;
        }
        return this;
    }

    public void jpo(boolean z10) {
        this.f17840yd = z10;
    }

    public void jpo(jpo jpoVar) {
        this.f17812jj = jpoVar;
    }

    public void jpo(ju juVar) {
        this.zz = juVar;
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jd(int i10, int i11, int i12, int i13) {
        yd ydVar = this.iwg;
        if (ydVar != null) {
            ydVar.jpo(i10, i11);
        }
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
        if (jpoVar != null) {
            jpoVar.jpo(i10, i11);
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            jjVar.jpo(i10, i11);
        }
    }

    public void jpo(xyk xykVar) {
        this.umr = xykVar;
    }

    public void jpo(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1964681502:
                if (str.equals("clickable")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1901681170:
                if (str.equals("onRenderSuccess")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1721943862:
                if (str.equals("translateX")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1375815020:
                if (str.equals("minWidth")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1351184668:
                if (str.equals("onDelay")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1337252761:
                if (str.equals("onShake")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1337126126:
                if (str.equals("onSlide")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1336288090:
                if (str.equals("onTimer")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1335874424:
                if (str.equals("onTwist")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1332194002:
                if (str.equals("background")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1291329255:
                if (str.equals("events")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c10 = 15;
                    break;
                }
                break;
            case -1081309778:
                if (str.equals("margin")) {
                    c10 = 16;
                    break;
                }
                break;
            case -1044792121:
                if (str.equals("marginTop")) {
                    c10 = 17;
                    break;
                }
                break;
            case -1013407967:
                if (str.equals("onDown")) {
                    c10 = 18;
                    break;
                }
                break;
            case -933876756:
                if (str.equals("backgroundDrawable")) {
                    c10 = 19;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c10 = 20;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c10 = 21;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c10 = 22;
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c10 = 23;
                    break;
                }
                break;
            case -681357156:
                if (str.equals("triggerFunc")) {
                    c10 = 24;
                    break;
                }
                break;
            case -289173127:
                if (str.equals("marginBottom")) {
                    c10 = 25;
                    break;
                }
                break;
            case -133587431:
                if (str.equals("minHeight")) {
                    c10 = 26;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c10 = 27;
                    break;
                }
                break;
            case 3176990:
                if (str.equals("i18n")) {
                    c10 = 28;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c10 = 29;
                    break;
                }
                break;
            case 87811796:
                if (str.equals("backgroundImageBlur")) {
                    c10 = 30;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c10 = 31;
                    break;
                }
                break;
            case 94750088:
                if (str.equals("click")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 105871684:
                if (str.equals("onTap")) {
                    c10 = '!';
                    break;
                }
                break;
            case 108285963:
                if (str.equals("ratio")) {
                    c10 = AbstractJsonLexerKt.STRING;
                    break;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    c10 = '#';
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c10 = '$';
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c10 = '%';
                    break;
                }
                break;
            case 314070383:
                if (str.equals("animations")) {
                    c10 = '&';
                    break;
                }
                break;
            case 320386138:
                if (str.equals("onLoadMore")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c10 = '(';
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c10 = ')';
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c10 = GMTDateParser.ANY;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c10 = '+';
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c10 = '-';
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c10 = '.';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c10 = '/';
                    break;
                }
                break;
            case 843948038:
                if (str.equals("onExposure")) {
                    c10 = '0';
                    break;
                }
                break;
            case 975087886:
                if (str.equals("marginRight")) {
                    c10 = '1';
                    break;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    c10 = '2';
                    break;
                }
                break;
            case 1087723621:
                if (str.equals("onAnimation")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1118509956:
                if (str.equals("animation")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1151851515:
                if (str.equals("animatorSet")) {
                    c10 = '5';
                    break;
                }
                break;
            case 1158381436:
                if (str.equals("onPullToRefresh")) {
                    c10 = '6';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    c10 = '7';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1301532860:
                if (str.equals(rJqlArycrfkilN.BcWsN)) {
                    c10 = '9';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    c10 = '<';
                    break;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    c10 = G5.T;
                    break;
                }
                break;
            case 1490730380:
                if (str.equals("onScroll")) {
                    c10 = '>';
                    break;
                }
                break;
            case 1671308008:
                if (str.equals("disable")) {
                    c10 = '?';
                    break;
                }
                break;
            case 1685004456:
                if (str.equals("onLongTap")) {
                    c10 = '@';
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 1970934485:
                if (str.equals("marginLeft")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 1997542747:
                if (str.equals("availability")) {
                    c10 = 'C';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.f17824ql = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
            case 1:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 18:
            case '!':
            case '\'':
            case '0':
            case '3':
            case '6':
            case '>':
            case '@':
                jd(str, str2);
                break;
            case 2:
                this.jpo = true;
                this.aix = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case 3:
                this.f17806gf = true;
                this.f17831tl = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case 4:
                this.f17808hx = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.kln = true;
                break;
            case 5:
                this.nmd = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 11:
            case '7':
                if (com.bytedance.adsdk.ugeno.qk.jpo.wqx(str2)) {
                    this.f17802eq = true;
                    this.f17818np = com.bytedance.adsdk.ugeno.qk.jpo.jd(str2);
                    break;
                } else {
                    this.f17798dm = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2, 0);
                    this.f17802eq = false;
                    break;
                }
            case '\f':
                this.vzb = zz.jpo(this, str2);
                break;
            case '\r':
                this.f17837ww = true;
                this.cz = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                break;
            case 14:
                this.f17809ic = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.wcn = true;
                break;
            case 15:
                if (TextUtils.equals(str2, "match_parent")) {
                    this.oya = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.oya = -2.0f;
                } else {
                    this.oya = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                }
                this.hd = true;
                break;
            case 16:
                this.prr = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                break;
            case 17:
                this.opi = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.hmu = true;
                break;
            case 19:
            case '8':
                this.tic = str2;
                break;
            case 20:
                this.jrx = true;
                this.ux = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 21:
                this.ez = true;
                this.f17835vk = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 22:
                this.kgu = true;
                this.f17815kb = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 23:
                this.f17827se = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.sz = true;
                break;
            case 24:
                this.fri = str2;
                break;
            case 25:
                this.f17813jr = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.f17819nq = true;
                break;
            case 26:
                this.f17825rq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case 27:
                this.f17814ju = str2;
                break;
            case 28:
                this.f17804fc = com.bytedance.adsdk.ugeno.qk.jd.jpo(str2, (JSONObject) null);
                break;
            case 29:
                this.f36if = str2;
                break;
            case 30:
                float fJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                this.vrc = fJpo;
                if (fJpo > 0.0f) {
                    this.roc = true;
                    break;
                }
                break;
            case 31:
                this.f17826rv = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.nzb = true;
                break;
            case ' ':
                this.f17829sn = str2;
                break;
            case '\"':
                this.f17810ii = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case '#':
                this.ez = true;
                this.kgu = true;
                float[] fArrWqx = com.bytedance.adsdk.ugeno.jpo.cm.wqx(str2);
                this.f17835vk = fArrWqx[0];
                this.f17815kb = fArrWqx[1];
                break;
            case '$':
                if (TextUtils.equals(str2, "match_parent")) {
                    this.f17796au = -1.0f;
                } else if (TextUtils.equals(str2, "wrap_content")) {
                    this.f17796au = -2.0f;
                } else {
                    this.f17796au = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                }
                this.f17820oo = true;
                break;
            case '%':
                this.f17833uu = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.duq = true;
                break;
            case '&':
                List<com.bytedance.adsdk.ugeno.jpo.wqx> listJpo = com.bytedance.adsdk.ugeno.jpo.cm.jpo(str2, this.f17797cm);
                if (listJpo != null && !listJpo.isEmpty()) {
                    this.ree = new jj(this.f17811jd, this, listJpo);
                    break;
                }
                break;
            case '(':
                this.huv = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.f17799dn = true;
                break;
            case ')':
                this.f17795as = m388if(str2);
                break;
            case '*':
                this.fy = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.sbx = true;
                break;
            case '+':
                this.f17839ya = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.jkt = true;
                break;
            case ',':
                this.pdm = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.f17801ef = true;
                break;
            case '-':
                this.hks = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case '.':
                this.rxq = str2;
                break;
            case '/':
                this.cgn = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                break;
            case '1':
                this.f17830sq = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.f17800dt = true;
                break;
            case '2':
                this.jpo = true;
                this.f17806gf = true;
                float[] fArrWqx2 = com.bytedance.adsdk.ugeno.jpo.cm.wqx(str2);
                this.aix = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, fArrWqx2[0]);
                this.f17831tl = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, fArrWqx2[1]);
                break;
            case '4':
                try {
                    this.wad = new com.bytedance.adsdk.ugeno.jpo.jpo(this.f17811jd, this, com.bytedance.adsdk.ugeno.jpo.cm.jpo(new JSONObject(str2), this.f17797cm));
                    break;
                } catch (JSONException unused) {
                    return;
                }
            case '5':
                this.fgt = com.bytedance.adsdk.ugeno.core.jpo.jpo(str2, this);
                break;
            case '9':
                this.f17822pe = true;
                this.f17834va = ju(str2);
                break;
            case ':':
                this.xk = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                break;
            case ';':
                this.f17816lq = true;
                this.f17836wu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case '<':
                this.uhu = true;
                this.f17828sg = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case '=':
                this.gmx = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case '?':
                this.czp = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                if (TextUtils.equals("visible", str2)) {
                    this.f17803et = 0;
                } else if (TextUtils.equals("invisible", str2)) {
                    this.f17803et = 4;
                } else if (TextUtils.equals("gone", str2) || TextUtils.equals("hidden", str2)) {
                    this.f17803et = 8;
                }
                this.my.setVisibility(this.f17803et);
                break;
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                this.hna = com.bytedance.adsdk.ugeno.qk.xyk.jpo(this.f17811jd, str2);
                this.f17832tu = true;
                break;
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                this.cql = !TextUtils.equals(str2, "unavailable");
                break;
        }
    }

    public wqx jd(wqx wqxVar) {
        return (wqxVar.kln() == null && (wqxVar instanceof jpo)) ? wqxVar : jd(wqxVar.kln());
    }

    @Deprecated
    public void jpo(int i10, JSONObject jSONObject, au auVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("success");
        if (jSONObjectOptJSONObject != null) {
            au auVar2 = new au();
            auVar2.jpo(jSONObjectOptJSONObject);
            auVar2.jpo(this);
            auVar.jpo(auVar2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(C3191e4.f.f36439e);
        if (jSONObjectOptJSONObject2 != null) {
            au auVar3 = new au();
            auVar3.jpo(jSONObjectOptJSONObject2);
            auVar3.jpo(this);
            auVar.jd(auVar3);
        }
        auVar.jpo(jSONObject);
        this.f17843zw.put(Integer.valueOf(i10), auVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public int[] jpo(int i10, int i11) {
        if (this.f17810ii > 0.0f) {
            if (this.f17820oo) {
                int size = View.MeasureSpec.getSize(i10);
                float f10 = this.f17810ii;
                if (f10 != 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                }
            } else if (this.hd) {
                int size2 = View.MeasureSpec.getSize(i11);
                float f11 = this.f17810ii;
                if (f11 != 0.0f) {
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                }
            }
        }
        if (this.f17817mg != null && !this.ozw) {
            this.ozw = true;
        }
        return new int[]{i10, i11};
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jpo(int i10, int i11, int i12, int i13) {
        if (this.f17817mg == null || this.clt) {
            return;
        }
        this.clt = true;
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jpo(Canvas canvas, IAnimation iAnimation) {
        yd ydVar = this.iwg;
        if (ydVar != null) {
            ydVar.jpo(canvas, iAnimation);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.cm
    public void jpo(Canvas canvas) {
        if (this instanceof jpo) {
            return;
        }
        com.bytedance.adsdk.ugeno.jpo.jpo jpoVar = this.wad;
        if (jpoVar != null) {
            jpoVar.jpo(canvas);
        }
        jj jjVar = this.ree;
        if (jjVar != null) {
            jjVar.jpo(canvas);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.prr.jd
    public void jpo(au auVar) {
        jpo<ViewGroup> jpoVar;
        wqx<T> wqxVarCm;
        if (auVar == null || auVar.wqx() == null || !TextUtils.equals(auVar.wqx().optString("type"), "onDismiss")) {
            return;
        }
        String strOptString = auVar.wqx().optString("nodeId");
        wqx(8);
        this.f17823qk = (jpo) jd(this);
        if (TextUtils.isEmpty(strOptString) || (jpoVar = this.f17823qk) == null || (wqxVarCm = jpoVar.cm(strOptString)) == null) {
            return;
        }
        wqxVarCm.wqx(8);
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.jpo.jpo jpoVar) {
        this.xur = jpoVar;
    }

    public void jpo(String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.cm.cm.wqx> listZz = zz(str);
        if (listZz == null || listZz.isEmpty()) {
            return;
        }
        for (com.bytedance.adsdk.ugeno.cm.cm.wqx wqxVar : listZz) {
            wqxVar.jpo(this.vzb);
            wqxVar.jpo(objArr);
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.core.my myVar) {
        zz zzVar = this.vzb;
        if (zzVar != null) {
            zzVar.jpo(myVar);
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.core.jj jjVar) {
        this.rzi = jjVar;
    }

    public void jpo(com.bytedance.adsdk.ugeno.cm.au auVar) {
        zz zzVar = this.vzb;
        if (zzVar != null) {
            zzVar.jpo(auVar);
        }
    }
}
