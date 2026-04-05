package com.bytedance.adsdk.ugeno.yoga.jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.jd.jpo;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.qk.xyk;
import com.bytedance.adsdk.ugeno.yoga.au;
import com.bytedance.adsdk.ugeno.yoga.cm;
import com.bytedance.adsdk.ugeno.yoga.jd.wqx;
import com.bytedance.adsdk.ugeno.yoga.jj;
import com.bytedance.adsdk.ugeno.yoga.my;
import com.bytedance.adsdk.ugeno.yoga.oya;
import com.bytedance.adsdk.ugeno.yoga.yd;
import e3.g;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends com.bytedance.adsdk.ugeno.jd.jpo<wqx> {
    private oya ez;

    /* renamed from: gf, reason: collision with root package name */
    private my f18017gf;
    private com.bytedance.adsdk.ugeno.yoga.jpo jrx;
    private jj kgu;

    /* renamed from: lq, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.yoga.jpo f18018lq;
    private yd uhu;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.yoga.jd.jpo$jpo, reason: collision with other inner class name */
    public static class C0070jpo extends jpo.C0062jpo {

        /* renamed from: dm, reason: collision with root package name */
        public float f18021dm;
        public int duq;

        /* renamed from: ef, reason: collision with root package name */
        public int f18022ef;

        /* renamed from: hx, reason: collision with root package name */
        public float f18023hx;
        public int kln;
        public int nzb;
        public float pdm;

        /* renamed from: pe, reason: collision with root package name */
        private boolean f18024pe;
        private boolean roc;

        /* renamed from: rv, reason: collision with root package name */
        public int f18025rv;

        /* renamed from: se, reason: collision with root package name */
        public int f18026se;
        public int sz;
        private boolean tic;

        /* renamed from: uu, reason: collision with root package name */
        public float f18027uu;

        /* renamed from: va, reason: collision with root package name */
        private boolean f18028va;
        private boolean vrc;
        private boolean xk;

        public C0070jpo(com.bytedance.adsdk.ugeno.jd.jpo jpoVar) {
            super(jpoVar);
            this.f18026se = 1;
            this.f18023hx = 0.0f;
            this.pdm = 1.0f;
            this.f18025rv = com.bytedance.adsdk.ugeno.yoga.jpo.AUTO.jpo();
            this.f18027uu = -1.0f;
            this.sz = au.RELATIVE.jpo();
        }

        private void cm() {
            com.bytedance.adsdk.ugeno.jd.jpo jpoVar = this.f17789nq;
            if (jpoVar instanceof jpo) {
                if (((jpo) jpoVar).sbx() == my.ROW && this.f17789nq.duq() == -2 && this.jpo == -1.0f && !this.f17789nq.xk()) {
                    this.jpo = -2.0f;
                    this.pdm = 1.0f;
                    this.f18023hx = 1.0f;
                    this.tic = true;
                    this.f18027uu = -1.0f;
                }
                if (((jpo) this.f17789nq).sbx() == my.COLUMN && this.f17789nq.dm() == -2 && this.f17785jd == -1.0f && !this.f17789nq.xk()) {
                    this.f17785jd = -2.0f;
                    this.pdm = 1.0f;
                    this.f18023hx = 1.0f;
                    this.tic = true;
                    this.f18027uu = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        /* renamed from: jd, reason: merged with bridge method [inline-methods] */
        public wqx.jpo jpo() {
            cm();
            wqx.jpo jpoVar = new wqx.jpo((int) this.jpo, (int) this.f17785jd);
            jpoVar.m396if((int) (this.nmd ? this.f17786jj : this.my));
            jpoVar.oya((int) (this.f17791rq ? this.f17790qk : this.my));
            jpoVar.ju((int) (this.f17793tu ? this.xyk : this.my));
            jpoVar.au((int) (this.f17784dt ? this.zz : this.my));
            jpoVar.jpo(this.f18026se);
            jpoVar.my(this.f18025rv);
            jpoVar.jd(this.f18023hx);
            jpoVar.wqx(this.pdm);
            jpoVar.hna(this.wqx);
            jpoVar.sq(this.f17783cm);
            if (this.tic) {
                jpoVar.cm(this.f18027uu);
            }
            jpoVar.jj(this.sz);
            if (this.f18028va) {
                jpoVar.qk(this.kln);
            }
            if (this.vrc) {
                jpoVar.zz(this.f18022ef);
            }
            if (this.roc) {
                jpoVar.xyk(this.nzb);
            }
            if (this.f18024pe) {
                jpoVar.yd(this.duq);
            }
            if (this.xk && wqx()) {
                float f10 = this.f18021dm;
                if (f10 > 0.0f) {
                    jpoVar.prr(f10);
                    jpoVar.wqx(0.0f);
                    jpoVar.jd(0.0f);
                }
            }
            return jpoVar;
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutParams{mOrder=");
            sb2.append(this.f18026se);
            sb2.append(", mFlexGrow=");
            sb2.append(this.f18023hx);
            sb2.append(", mFlexShrink=");
            sb2.append(this.pdm);
            sb2.append(", mAlignSelf=");
            sb2.append(this.f18025rv);
            sb2.append(", mFlexBasis=");
            sb2.append(this.f18027uu);
            sb2.append(", mPosition=");
            sb2.append(this.sz);
            sb2.append(", mTop=");
            sb2.append(this.kln);
            sb2.append(", mBottom=");
            sb2.append(this.f18022ef);
            sb2.append(", mLeft=");
            sb2.append(this.nzb);
            sb2.append(", mRight=");
            return g.m(sb2, this.duq, AbstractJsonLexerKt.END_OBJ);
        }

        public boolean wqx() {
            float f10 = this.jpo;
            if (f10 == -1.0f && this.f17785jd == -1.0f) {
                return false;
            }
            return f10 == -2.0f || this.f17785jd == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        public void jpo(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.jpo(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.tic = true;
                    float fJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, -1.0f);
                    this.f18027uu = fJpo;
                    this.f18027uu = xyk.jpo(context, fJpo);
                    break;
                case "bottom":
                    this.vrc = true;
                    this.f18022ef = (int) xyk.jpo(context, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0));
                    break;
                case "top":
                    this.f18028va = true;
                    this.kln = (int) xyk.jpo(context, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0));
                    break;
                case "left":
                    this.roc = true;
                    this.nzb = (int) xyk.jpo(context, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0));
                    break;
                case "order":
                    this.f18026se = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1);
                    break;
                case "ratio":
                    this.xk = true;
                    this.f18021dm = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                    break;
                case "right":
                    this.f18024pe = true;
                    this.duq = (int) xyk.jpo(context, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0));
                    break;
                case "position":
                    this.sz = au.jpo(str2).jpo();
                    break;
                case "flexShrink":
                    this.pdm = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.f18023hx = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.f18025rv = com.bytedance.adsdk.ugeno.yoga.jpo.jpo(str2).jpo();
                    break;
            }
        }
    }

    public jpo(Context context) {
        super(context);
        this.f18017gf = my.ROW;
        this.ez = oya.NO_WRAP;
        this.kgu = jj.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.jpo jpoVar = com.bytedance.adsdk.ugeno.yoga.jpo.STRETCH;
        this.jrx = jpoVar;
        this.f18018lq = jpoVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void pdm() {
        ImageView.ScaleType scaleType;
        if (this.roc) {
            com.bytedance.adsdk.ugeno.my.jpo().jd().jpo(this.zz, this.tic, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.yoga.jd.jpo.1
                @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
                public void jpo(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi != null) {
                            com.bytedance.adsdk.ugeno.core.jj unused = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi;
                            String unused2 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).tic;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi != null) {
                        com.bytedance.adsdk.ugeno.core.jj unused3 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi;
                        String unused4 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).tic;
                    }
                    final Bitmap bitmapJpo = xyk.jpo(((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).f17811jd, bitmap, (int) ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).vrc);
                    if (bitmapJpo != null) {
                        xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.jd.jpo.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jpo.this.jpo(new BitmapDrawable(bitmapJpo));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.zz.cm.jpo jpoVar = new com.bytedance.adsdk.ugeno.zz.cm.jpo(this.f17811jd);
        com.bytedance.adsdk.ugeno.my.jpo().jd().jpo(this.zz, this.tic, jpoVar, this.my.getWidth(), this.my.getHeight(), new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.yoga.jd.jpo.2
            @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
            public void jpo(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi != null) {
                        com.bytedance.adsdk.ugeno.core.jj unused = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi;
                        String unused2 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).tic;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi != null) {
                    com.bytedance.adsdk.ugeno.core.jj unused3 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).rzi;
                    String unused4 = ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).tic;
                }
            }
        });
        if (!this.f17822pe || (scaleType = this.f17834va) == ImageView.ScaleType.FIT_XY) {
            jpoVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            jpoVar.setScaleType(scaleType);
        }
        jpoVar.setCornerRadius(this.xk);
        wqx.jpo jpoVar2 = new wqx.jpo(-1, -1);
        jpoVar2.jj(au.ABSOLUTE.jpo());
        jpoVar2.qk(0.0f);
        jpoVar2.xyk(0.0f);
        T t10 = this.my;
        if (t10 instanceof wqx) {
            ((wqx) t10).addView(jpoVar, 0, jpoVar2);
            jpo(jpoVar);
        }
    }

    public my sbx() {
        return this.f18017gf;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public C0070jpo yd() {
        return new C0070jpo(this);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        this.uhu.jpo(this.f18017gf);
        this.uhu.jpo(this.ez);
        this.uhu.jpo(this.kgu);
        this.uhu.jpo(this.jrx);
        this.uhu.wqx(this.f18018lq);
        this.uhu.jpo(true);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void oya() {
        if (this.sz) {
            this.uhu.jd(cm.ALL, this.f17827se);
        }
        if (this.kln) {
            this.uhu.jd(cm.LEFT, this.f17808hx);
        }
        if (this.f17801ef) {
            this.uhu.jd(cm.RIGHT, this.pdm);
        }
        if (this.nzb) {
            this.uhu.jd(cm.TOP, this.f17826rv);
        }
        if (this.duq) {
            this.uhu.jd(cm.BOTTOM, this.f17833uu);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public wqx jpo() {
        wqx wqxVar = new wqx(this.f17811jd);
        wqxVar.jpo(this);
        this.uhu = wqxVar.getYogaNode();
        return wqxVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.zz.cm.jpo jpoVar = new com.bytedance.adsdk.ugeno.zz.cm.jpo(this.f17811jd);
        jpoVar.setImageDrawable(drawable);
        if (this.f17822pe && (scaleType = this.f17834va) != ImageView.ScaleType.FIT_XY) {
            jpoVar.setScaleType(scaleType);
        } else {
            jpoVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        jpoVar.setCornerRadius(this.xk);
        wqx.jpo jpoVar2 = new wqx.jpo(-1, -1);
        jpoVar2.jj(au.ABSOLUTE.jpo());
        jpoVar2.qk(0.0f);
        jpoVar2.xyk(0.0f);
        T t10 = this.my;
        if (t10 instanceof wqx) {
            ((wqx) t10).addView(jpoVar, 0, jpoVar2);
            jpo(jpoVar);
        }
    }

    private void jpo(final com.bytedance.adsdk.ugeno.zz.cm.jpo jpoVar) {
        this.my.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.jd.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                yd ydVarJpo;
                if (((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).my == null || (ydVarJpo = ((wqx) ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).my).jpo(jpoVar)) == null) {
                    return;
                }
                ydVarJpo.cm(((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).my.getWidth());
                ydVarJpo.jj(((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).my.getHeight());
                jpoVar.setCornerRadius(((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).xk);
                ((com.bytedance.adsdk.ugeno.jd.wqx) jpo.this).my.requestLayout();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        super.jpo(wqxVar);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar, ViewGroup.LayoutParams layoutParams) {
        if (wqxVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.jd.jpo) this).jpo.add(wqxVar);
        View viewJu = wqxVar.ju();
        if (viewJu != null) {
            ((wqx) this.my).addView(viewJu, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.jrx = com.bytedance.adsdk.ugeno.yoga.jpo.jpo(str2);
                break;
            case "flexDirection":
                this.f18017gf = my.jpo(str2);
                break;
            case "alignContent":
                this.f18018lq = com.bytedance.adsdk.ugeno.yoga.jpo.jpo(str2);
                break;
            case "flexWrap":
                this.ez = oya.jpo(str2);
                break;
            case "justifyContent":
                this.kgu = jj.jpo(str2);
                break;
        }
    }
}
