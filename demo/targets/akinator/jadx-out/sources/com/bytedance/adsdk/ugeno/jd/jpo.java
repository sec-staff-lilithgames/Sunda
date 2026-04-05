package com.bytedance.adsdk.ugeno.jd;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.qk.xyk;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo<E extends ViewGroup> extends wqx {
    protected List<wqx<View>> jpo;

    public jpo(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
    }

    public void jpo(wqx wqxVar) {
        if (wqxVar == null) {
            return;
        }
        this.jpo.add(wqxVar);
        View viewJu = wqxVar.ju();
        if (viewJu != null) {
            ((ViewGroup) this.my).addView(viewJu);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public wqx wqx(String str) {
        wqx<T> wqxVarJj;
        if (!TextUtils.isEmpty(str) && yd(str) != null) {
            return this;
        }
        for (wqx<View> wqxVar : this.jpo) {
            if (wqxVar != null && (wqxVarJj = wqxVar.jj(str)) != 0) {
                return wqxVarJj;
            }
        }
        return null;
    }

    public C0062jpo yd() {
        return new C0062jpo(this);
    }

    public List<wqx<View>> zz() {
        return this.jpo;
    }

    public jpo(Context context, jpo jpoVar) {
        super(context, jpoVar);
        this.jpo = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public wqx jd(String str) {
        wqx<T> wqxVarMy;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f36if)) {
            return this;
        }
        for (wqx<View> wqxVar : this.jpo) {
            if (wqxVar != null && (wqxVarMy = wqxVar.my(str)) != 0) {
                return wqxVarMy;
            }
        }
        return null;
    }

    public void jpo(wqx wqxVar, ViewGroup.LayoutParams layoutParams) {
        if (wqxVar == null) {
            return;
        }
        this.jpo.add(wqxVar);
        View viewJu = wqxVar.ju();
        if (viewJu != null) {
            ((ViewGroup) this.my).addView(viewJu, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public wqx jpo(String str) {
        wqx<T> wqxVarCm;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f17814ju)) {
            return this;
        }
        for (wqx<View> wqxVar : this.jpo) {
            if (wqxVar != null && (wqxVarCm = wqxVar.cm(str)) != 0) {
                return wqxVarCm;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.jd.jpo$jpo, reason: collision with other inner class name */
    public static class C0062jpo {

        /* renamed from: au, reason: collision with root package name */
        protected float f17782au;

        /* renamed from: dt, reason: collision with root package name */
        protected boolean f17784dt;
        protected ViewGroup.LayoutParams hmu;
        protected boolean hna;

        /* renamed from: if, reason: not valid java name */
        protected float f35if;

        /* renamed from: jj, reason: collision with root package name */
        protected float f17786jj;

        /* renamed from: jr, reason: collision with root package name */
        protected boolean f17787jr;

        /* renamed from: ju, reason: collision with root package name */
        protected float f17788ju;
        protected float my;
        protected boolean nmd;

        /* renamed from: nq, reason: collision with root package name */
        protected jpo f17789nq;
        protected boolean opi;
        protected float oya;
        protected boolean prr;

        /* renamed from: qk, reason: collision with root package name */
        protected float f17790qk;

        /* renamed from: rq, reason: collision with root package name */
        protected boolean f17791rq;

        /* renamed from: sq, reason: collision with root package name */
        protected boolean f17792sq;

        /* renamed from: tu, reason: collision with root package name */
        protected boolean f17793tu;
        protected float xyk;

        /* renamed from: yd, reason: collision with root package name */
        protected float f17794yd;
        protected float zz;
        protected float jpo = -2.0f;

        /* renamed from: jd, reason: collision with root package name */
        protected float f17785jd = -2.0f;
        protected float wqx = 0.0f;

        /* renamed from: cm, reason: collision with root package name */
        protected float f17783cm = 0.0f;

        public C0062jpo(jpo jpoVar) {
            this.f17789nq = jpoVar;
        }

        public void jpo(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.f17788ju = xyk.jpo(context, str2);
                    this.hna = true;
                    break;
                case "minWidth":
                    this.wqx = xyk.jpo(context, str2);
                    break;
                case "height":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.f17785jd = xyk.jpo(context, str2);
                            break;
                        } else {
                            this.f17785jd = -2.0f;
                            break;
                        }
                    } else {
                        this.f17785jd = -1.0f;
                        break;
                    }
                case "margin":
                    this.my = xyk.jpo(context, str2);
                    break;
                case "marginTop":
                    this.xyk = xyk.jpo(context, str2);
                    this.f17793tu = true;
                    break;
                case "padding":
                    this.f17794yd = xyk.jpo(context, str2);
                    this.prr = true;
                    break;
                case "marginBottom":
                    this.zz = xyk.jpo(context, str2);
                    this.f17784dt = true;
                    break;
                case "minHeight":
                    this.f17783cm = xyk.jpo(context, str2);
                    break;
                case "paddingTop":
                    this.f35if = xyk.jpo(context, str2);
                    this.opi = true;
                    break;
                case "width":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.jpo = xyk.jpo(context, str2);
                            break;
                        } else {
                            this.jpo = -2.0f;
                            break;
                        }
                    } else {
                        this.jpo = -1.0f;
                        break;
                    }
                case "paddingBottom":
                    this.oya = xyk.jpo(context, str2);
                    this.f17787jr = true;
                    break;
                case "paddingRight":
                    this.f17782au = xyk.jpo(context, str2);
                    this.f17792sq = true;
                    break;
                case "marginRight":
                    this.f17790qk = xyk.jpo(context, str2);
                    this.f17791rq = true;
                    break;
                case "marginLeft":
                    this.f17786jj = xyk.jpo(context, str2);
                    this.nmd = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.jpo + ", mHeight=" + this.f17785jd + ", mMargin=" + this.my + ", mMarginLeft=" + this.f17786jj + ", mMarginRight=" + this.f17790qk + ", mMarginTop=" + this.xyk + ", mMarginBottom=" + this.zz + ", mParams=" + this.hmu + AbstractJsonLexerKt.END_OBJ;
        }

        public ViewGroup.LayoutParams jpo() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.jpo, (int) this.f17785jd);
            marginLayoutParams.leftMargin = (int) (this.nmd ? this.f17786jj : this.my);
            marginLayoutParams.rightMargin = (int) (this.f17791rq ? this.f17790qk : this.my);
            marginLayoutParams.topMargin = (int) (this.f17793tu ? this.xyk : this.my);
            marginLayoutParams.bottomMargin = (int) (this.f17784dt ? this.zz : this.my);
            return marginLayoutParams;
        }
    }
}
