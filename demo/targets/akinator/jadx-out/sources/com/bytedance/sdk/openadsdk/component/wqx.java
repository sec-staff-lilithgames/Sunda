package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.jj;
import com.bytedance.sdk.openadsdk.component.zz.my;
import com.bytedance.sdk.openadsdk.component.zz.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.core.wqx.jd;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: au, reason: collision with root package name */
    private RelativeLayout f20078au;

    /* renamed from: cm, reason: collision with root package name */
    protected final FrameLayout f20079cm;

    /* renamed from: dt, reason: collision with root package name */
    private final xyk f20080dt = new xyk();
    private com.bytedance.sdk.openadsdk.component.xyk.wqx hmu;
    private com.bytedance.sdk.openadsdk.core.jj.xyk hna;

    /* renamed from: hx, reason: collision with root package name */
    private hna f20081hx;

    /* renamed from: if, reason: not valid java name */
    protected final com.bytedance.sdk.openadsdk.component.xyk.jpo f111if;

    /* renamed from: jd, reason: collision with root package name */
    protected final dt f20082jd;

    /* renamed from: jj, reason: collision with root package name */
    protected final int f20083jj;
    protected final Activity jpo;

    /* renamed from: jr, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20084jr;

    /* renamed from: ju, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.jj.xyk f20085ju;
    protected final com.bytedance.sdk.openadsdk.component.jpo my;
    private com.bytedance.sdk.openadsdk.core.jj.xyk nmd;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20086nq;
    private sq opi;
    private ImageView oya;
    private View pdm;
    private PAGLogoView prr;

    /* renamed from: qk, reason: collision with root package name */
    protected int f20087qk;

    /* renamed from: rq, reason: collision with root package name */
    private float f20088rq;

    /* renamed from: se, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f20089se;

    /* renamed from: sq, reason: collision with root package name */
    private ImageView f20090sq;

    /* renamed from: tu, reason: collision with root package name */
    private float f20091tu;
    protected final boolean wqx;
    protected FrameLayout xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.jj.cm f20092yd;
    protected View zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements sq.jpo {
        private final WeakReference<wqx> jpo;

        public jd(wqx wqxVar) {
            this.jpo = new WeakReference<>(wqxVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.sq.jpo
        public void jpo() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.sq.jpo
        public void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) {
            wqx wqxVar;
            if (!jdVar.my() || (wqxVar = this.jpo.get()) == null) {
                return;
            }
            wqxVar.jpo(jdVar);
            if (jdVar.jd() != null) {
                wqxVar.jpo(jdVar.jpo());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements jj.wqx {

        /* renamed from: jd, reason: collision with root package name */
        private final WeakReference<wqx> f20096jd;
        WeakReference<Activity> jpo;

        public jpo(Activity activity, wqx wqxVar) {
            this.jpo = new WeakReference<>(activity);
            this.f20096jd = new WeakReference<>(wqxVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.jj.wqx
        public void jpo(Object obj) {
            wqx wqxVar;
            if (this.jpo.get() == null || this.jpo.get().isFinishing() || (wqxVar = this.f20096jd.get()) == null) {
                return;
            }
            wqxVar.jpo(obj);
        }
    }

    public wqx(Activity activity, dt dtVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.jpo jpoVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar2) {
        this.jpo = activity;
        this.f20082jd = dtVar;
        this.f20079cm = frameLayout;
        this.f20087qk = i10;
        this.wqx = z10;
        this.my = jpoVar;
        this.f20083jj = dtVar.jl();
        this.f111if = jpoVar2;
    }

    private void xyk() {
        boolean z10;
        this.f20080dt.jpo();
        this.hna.setText(this.f20082jd.clt());
        if (this.f20082jd.se()) {
            zz();
            return;
        }
        if (this.wqx) {
            jd(0);
            jpo(8);
            if (jpo(this.xyk)) {
                this.my.wqx();
            } else {
                this.my.cm();
            }
            jj.jpo(this.f20082jd, new jpo(this.jpo, this), 25);
        } else {
            jd(8);
            jpo(0);
            yd();
            this.my.wqx();
        }
        boolean z11 = true;
        if (this.f20086nq == null) {
            z10 = false;
        } else {
            if (TextUtils.isEmpty(this.f20082jd.as())) {
                if (this.f20082jd.xur() != null) {
                    this.f20086nq.setText(this.f20082jd.xur().jd());
                }
                z10 = false;
            } else {
                this.f20086nq.setText(this.f20082jd.as());
            }
            z10 = true;
        }
        if (this.f20089se != null) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20082jd.ou(), this.f20089se, this.f20082jd);
        }
        hna hnaVar = this.f20081hx;
        if (hnaVar != null) {
            va.jpo((TextView) null, hnaVar, this.f20082jd);
            if (this.f20082jd.xur() == null || this.f20082jd.xur().cm() < 0.0d) {
                this.f20081hx.setVisibility(8);
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        View view = this.pdm;
        if (view != null) {
            view.setVisibility(z11 ? 0 : 8);
        }
    }

    private void yd() {
        opi opiVar = this.f20082jd.fri().get(0);
        com.bytedance.sdk.openadsdk.utils.sq.jpo(new com.bytedance.sdk.openadsdk.opi.jpo(opiVar.jpo(), opiVar.qk()), opiVar.jd(), opiVar.wqx(), new jd(this), com.bytedance.sdk.openadsdk.component.qk.jpo.jd(TextUtils.isEmpty(opiVar.qk()) ? com.bytedance.sdk.component.utils.my.jpo(opiVar.jpo()) : opiVar.qk()).getParent(), 25);
    }

    private void zz() {
        if (this.f20084jr != null) {
            if (this.f20082jd.xur() != null && !TextUtils.isEmpty(this.f20082jd.xur().jd())) {
                this.f20084jr.setText(this.f20082jd.xur().jd());
            } else if (TextUtils.isEmpty(this.f20082jd.as())) {
                this.f20084jr.setVisibility(8);
            } else {
                this.f20084jr.setText(this.f20082jd.as());
            }
        }
        if (this.nmd != null) {
            if (TextUtils.isEmpty(this.f20082jd.ozw())) {
                this.nmd.setVisibility(8);
            } else {
                this.nmd.setText(this.f20082jd.ozw());
            }
        }
        if (this.opi != null && this.f20082jd.ou() != null && !TextUtils.isEmpty(this.f20082jd.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20082jd.ou().jpo(), this.f20082jd.ou().jd(), this.f20082jd.ou().wqx(), this.opi, this.f20082jd);
        }
        this.my.wqx();
    }

    public int cm() {
        return -1;
    }

    public void jd() {
        if (this.f20082jd.jfy()) {
            this.my.wqx();
        } else {
            xyk();
        }
    }

    public void jj() {
        this.zz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.wqx.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.jpo jpoVar = wqx.this.my;
                if (jpoVar != null) {
                    jpoVar.jd(view);
                }
            }
        });
        this.f20092yd.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.wqx.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.jpo jpoVar = wqx.this.my;
                if (jpoVar != null) {
                    jpoVar.jpo(view);
                }
            }
        });
    }

    public JSONObject jpo(JSONObject jSONObject) {
        return null;
    }

    public com.bytedance.sdk.openadsdk.component.xyk.wqx qk() {
        return this.hmu;
    }

    public void wqx() {
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar = this.hmu;
        if (wqxVar != null) {
            wqxVar.m450if();
        }
    }

    public void jpo(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.zz.wqx cmVar = new com.bytedance.sdk.openadsdk.component.zz.cm(this.jpo, this.f20082jd);
        int iWcn = this.f20082jd.wcn();
        if (iWcn == 5) {
            cmVar = new com.bytedance.sdk.openadsdk.component.zz.jj(this.jpo, this.f20082jd);
        } else if (iWcn == 4) {
            cmVar = new com.bytedance.sdk.openadsdk.component.zz.my(this.jpo, this.f20082jd);
        }
        com.bytedance.sdk.openadsdk.component.zz.wqx wqxVar = cmVar;
        this.f20078au = wqxVar;
        viewGroup.addView(wqxVar);
        this.f20090sq = wqxVar.getBackImage();
        this.xyk = wqxVar.getVideoContainer();
        this.oya = wqxVar.getImageView();
        this.hna = wqxVar.getClickButton();
        this.prr = wqxVar.getAdLogo();
        this.f20086nq = wqxVar.getAdTitleTextView();
        this.f20089se = wqxVar.getAdIconView();
        this.f20081hx = wqxVar.getScoreBar();
        this.pdm = wqxVar.getOverlayLayout();
        if (this.f20082jd.se()) {
            this.opi = wqxVar.getIconOnlyView();
            this.f20084jr = wqxVar.getTitle();
            this.nmd = wqxVar.getContent();
        }
        if (wqxVar.getDspAdChoice() != null) {
            wqxVar.getDspAdChoice().jpo(14, this.f20082jd);
        }
        if (!this.f20082jd.jfy()) {
            this.f20080dt.jpo(wqxVar, this.f20082jd, this.f20091tu, this.f20088rq, this.wqx);
        }
        this.zz = wqxVar.getTopDisLike();
        this.f20092yd = wqxVar.getTopSkip();
        this.f20085ju = wqxVar.getTopCountDown();
        if (wqxVar instanceof com.bytedance.sdk.openadsdk.component.zz.my) {
            ((com.bytedance.sdk.openadsdk.component.zz.my) wqxVar).setRenderListener(new my.jpo() { // from class: com.bytedance.sdk.openadsdk.component.wqx.1
                @Override // com.bytedance.sdk.openadsdk.component.zz.my.jpo
                public void jpo(View view, int i10) {
                    wqx.this.my.my();
                }
            });
        }
    }

    private void jd(int i10) {
        va.jpo((View) this.xyk, i10);
    }

    public void my() {
    }

    public void jpo() {
        this.prr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.wqx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    wqx wqxVar = wqx.this;
                    TTWebsiteActivity.jpo(wqxVar.jpo, wqxVar.f20082jd, "open_ad");
                } catch (Throwable th2) {
                    nmd.wqx("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        jj();
        if (this.f20082jd.jfy()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.jpo.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.component.jpo.jd.jpo(this.f20082jd, this.jpo, this.f111if);
        jpoVarJpo.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.wqx.3
            @Override // com.bytedance.sdk.openadsdk.core.wqx.jd.jpo
            public void jpo(View view, int i10) {
                wqx.this.my.my();
            }
        });
        jpoVarJpo.jpo(this.hmu);
        if (this.f20082jd.ya() == 1) {
            this.f20078au.setOnClickListener(jpoVarJpo);
            this.f20078au.setOnTouchListener(jpoVarJpo);
        }
        this.hna.setOnClickListener(jpoVarJpo);
        this.hna.setOnTouchListener(jpoVarJpo);
    }

    public boolean jpo(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVar = new com.bytedance.sdk.openadsdk.component.xyk.wqx(this.jpo);
        this.hmu = wqxVar;
        return wqxVar.jpo(frameLayout, this.my, this.f20082jd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.f20090sq.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sq.jpo().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            nmd.wqx("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) {
        if (this.oya == null) {
            return;
        }
        if (jdVar.jd() != null) {
            this.oya.setImageBitmap(jdVar.jd());
            return;
        }
        Drawable drawableCm = jdVar.cm();
        if (drawableCm != null) {
            this.oya.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.d(drawableCm)) {
                a.b(drawableCm).start();
            }
            this.oya.setImageDrawable(drawableCm);
            return;
        }
        if (this.f20082jd.fri() == null || this.f20082jd.fri().get(0) == null) {
            return;
        }
        Drawable drawableJpo = com.bytedance.sdk.openadsdk.utils.sq.jpo(jdVar.wqx(), this.f20082jd.fri().get(0).jd());
        this.oya.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.oya.setImageDrawable(drawableJpo);
    }

    public void jpo(int i10) {
        va.jpo((View) this.oya, i10);
    }

    public void jpo(float f10, float f11) {
        this.f20091tu = f10;
        this.f20088rq = f11;
    }

    public void jpo(int i10, boolean z10) {
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar;
        if (this.f20092yd == null || (xykVar = this.f20085ju) == null) {
            return;
        }
        if (z10) {
            if (xykVar.getVisibility() != 8) {
                this.f20085ju.setVisibility(8);
            }
            if (this.f20092yd.getVisibility() != 0) {
                this.f20092yd.setVisibility(0);
                return;
            }
            return;
        }
        this.f20085ju.setText(o2.j(i10, ApsMetricsDataMap.APSMETRICS_FIELD_SDK));
        if (this.f20085ju.getVisibility() != 0) {
            this.f20085ju.setVisibility(0);
        }
    }
}
