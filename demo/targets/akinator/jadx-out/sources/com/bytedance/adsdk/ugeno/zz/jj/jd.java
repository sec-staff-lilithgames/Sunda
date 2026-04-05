package com.bytedance.adsdk.ugeno.zz.jj;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.adsdk.ugeno.qk.xyk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends wqx<jpo> {

    /* renamed from: as, reason: collision with root package name */
    private int f18087as;

    @Deprecated
    private TextUtils.TruncateAt czp;
    private float ez;
    private float fgt;
    private float fri;

    /* renamed from: gf, reason: collision with root package name */
    protected int f18088gf;

    /* renamed from: hk, reason: collision with root package name */
    private boolean f18089hk;
    private float iwg;
    protected String jpo;
    private int jrx;
    private float kgu;
    private float kye;

    /* renamed from: lq, reason: collision with root package name */
    private int f18090lq;

    /* renamed from: ou, reason: collision with root package name */
    @Deprecated
    private float f18091ou;
    private TextUtils.TruncateAt pzk;

    /* renamed from: sn, reason: collision with root package name */
    private float f18092sn;
    private int uhu;

    /* renamed from: ww, reason: collision with root package name */
    private int f18093ww;

    @Deprecated
    private float zmh;

    /* renamed from: zq, reason: collision with root package name */
    private float f18094zq;
    private int zrw;

    public jd(Context context) {
        super(context);
        this.f18088gf = -16777216;
        this.ez = 12.0f;
        this.kgu = -1.0f;
        this.f18090lq = Integer.MAX_VALUE;
        this.f18093ww = 8388611;
        this.pzk = TextUtils.TruncateAt.END;
        this.f18092sn = -1.0f;
        this.fgt = 400.0f;
    }

    private TextUtils.TruncateAt au(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private void cm() {
        ((jpo) this.my).setLineSpacing(0.0f, this.f18092sn);
    }

    private int hna(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    /* renamed from: if, reason: not valid java name */
    private TextUtils.TruncateAt m399if(String str) {
        str.getClass();
        switch (str) {
            case "center":
                this.czp = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.czp = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.czp = TextUtils.TruncateAt.START;
                break;
            default:
                this.czp = null;
                break;
        }
        return this.czp;
    }

    private int oya(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1178781136) {
            return str.equals(TtmlNode.ITALIC) ? 2 : 0;
        }
        if (iHashCode != -1039745817) {
            return (iHashCode == 3029637 && str.equals(TtmlNode.BOLD)) ? 1 : 0;
        }
        str.equals("normal");
        return 0;
    }

    private int prr(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private void zz() {
        float f10 = this.f18092sn;
        if (f10 <= 3.0f) {
            ((jpo) this.my).setLineSpacing(0.0f, f10);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int iRound = Math.round(xyk.jpo(this.f17811jd, (f10 - (this.ez * 1.2f)) / 2.0f));
            int paddingTop = ((jpo) this.my).getPaddingTop() + iRound;
            int paddingBottom = ((jpo) this.my).getPaddingBottom() + iRound;
            T t10 = this.my;
            ((jpo) t10).setPadding(((jpo) t10).getPaddingLeft(), paddingTop, ((jpo) this.my).getPaddingRight(), paddingBottom);
            ((jpo) this.my).setLineHeight(Math.round(xyk.jpo(this.f17811jd, this.f18092sn)));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, this.jpo)) {
            this.jpo = "";
        }
        ju(this.jpo);
        ((jpo) this.my).setTextSize(1, this.ez);
        ((jpo) this.my).setTextColor(this.f18088gf);
        ((jpo) this.my).setLines(this.uhu);
        ((jpo) this.my).setMaxLines(this.f18090lq);
        ((jpo) this.my).setGravity(this.f18093ww);
        ((jpo) this.my).setIncludeFontPadding(false);
        ((jpo) this.my).setMinTextSize(xyk.jpo(this.f17811jd, this.kgu));
        jpo(this.f18087as);
        if (sz()) {
            jpo(this.pzk);
        } else {
            jpo(this.czp);
        }
        if (this.f18092sn > 0.0f) {
            if (sz()) {
                zz();
            } else {
                cm();
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ((jpo) this.my).setBreakStrategy(0);
        if (!sz()) {
            ((jpo) this.my).setShadowLayer(this.fri, this.zmh, this.f18091ou, this.zrw);
        } else if (this.f18089hk) {
            if (this.fri <= 0.0f) {
                this.fri = 1.0E-5f;
            }
            ((jpo) this.my).setShadowLayer(this.fri, this.kye, this.iwg, this.zrw);
        }
        int i11 = this.jrx;
        if (i11 == 1) {
            ((jpo) this.my).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((jpo) this.my).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.fgt, i11 == 2));
        } else if (this.fgt >= 500.0f) {
            ((jpo) this.my).setTypeface(Typeface.DEFAULT, 1);
        }
        if (xyk.jpo(this.f17811jd, this.ez) > 0.0f) {
            ((jpo) this.my).setLetterSpacing(this.f18094zq / xyk.jpo(this.f17811jd, this.ez));
        }
    }

    public void ju(String str) {
        this.jpo = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(AbstractJsonLexerKt.NULL, str)) {
            this.jpo = "";
        }
        ((jpo) this.my).setText(this.jpo);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public jpo jpo() {
        jpo jpoVar = new jpo(this.f17811jd);
        jpoVar.jpo(this);
        return jpoVar;
    }

    public void jpo(int i10) {
        this.f18087as = i10;
        if (i10 == Integer.MAX_VALUE) {
            return;
        }
        ((jpo) this.my).setPaintFlags(i10);
    }

    public void jpo(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((jpo) this.my).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.fri = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "shadowColor":
                this.zrw = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                this.f18089hk = true;
                break;
            case "shadowOffsetX":
                this.kye = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.iwg = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
            case "textAlign":
                this.f18093ww = prr(str2);
                break;
            case "textColor":
                this.f18088gf = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case "textStyle":
                this.jrx = oya(str2);
                break;
            case "textSize":
                this.ez = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "textDecoration":
                this.f18087as = hna(str2);
                break;
            case "shadowDx":
                this.zmh = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "shadowDy":
                this.f18091ou = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "fontWeight":
                float fJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, -1.0f);
                this.fgt = fJpo;
                if (fJpo < 1.0f || fJpo > 1000.0f) {
                    this.fgt = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.f18092sn = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                break;
            case "text":
                this.jpo = str2;
                break;
            case "lines":
                this.uhu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0);
                break;
            case "ellipsis":
                this.pzk = au(str2);
                break;
            case "minTextSize":
                this.kgu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, -1.0f);
                break;
            case "maxLines":
                int iJpo = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, Integer.MAX_VALUE);
                this.f18090lq = iJpo > 0 ? iJpo : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.czp = m399if(str2);
                break;
            case "letterSpacing":
                this.f18094zq = xyk.jpo(this.f17811jd, com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f));
                break;
        }
    }
}
