package com.bytedance.adsdk.ugeno.my;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.jd.jpo;
import com.bytedance.adsdk.ugeno.my.my;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.adsdk.ugeno.jd.jpo<my> {
    private int ez;

    /* renamed from: gf, reason: collision with root package name */
    private int f17928gf;
    private int jrx;
    private int kgu;

    /* renamed from: lq, reason: collision with root package name */
    private int f17929lq;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends jpo.C0062jpo {

        /* renamed from: ef, reason: collision with root package name */
        public int f17930ef;

        /* renamed from: hx, reason: collision with root package name */
        public float f17931hx;
        public int kln;
        public int nzb;
        public float pdm;

        /* renamed from: rv, reason: collision with root package name */
        public int f17932rv;

        /* renamed from: se, reason: collision with root package name */
        public int f17933se;
        public int sz;

        /* renamed from: uu, reason: collision with root package name */
        public float f17934uu;

        public jpo(com.bytedance.adsdk.ugeno.jd.jpo jpoVar) {
            super(jpoVar);
            this.f17933se = 1;
            this.f17931hx = 0.0f;
            this.pdm = 0.0f;
            this.f17932rv = -1;
            this.f17934uu = -1.0f;
            this.sz = -1;
            this.kln = -1;
            this.f17930ef = 16777215;
            this.nzb = 16777215;
        }

        private float cm(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float jd(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int my(java.lang.String r8) {
            /*
                r7 = this;
                r8.getClass()
                int r0 = r8.hashCode()
                r1 = 4
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = -1
                switch(r0) {
                    case -1881872635: goto L3e;
                    case -1720785339: goto L33;
                    case -1364013995: goto L28;
                    case 1384876188: goto L1d;
                    case 1744442261: goto L12;
                    default: goto L10;
                }
            L10:
                r8 = r6
                goto L48
            L12:
                java.lang.String r0 = "flex_end"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L1b
                goto L10
            L1b:
                r8 = r1
                goto L48
            L1d:
                java.lang.String r0 = "flex_start"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L26
                goto L10
            L26:
                r8 = r2
                goto L48
            L28:
                java.lang.String r0 = "center"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L31
                goto L10
            L31:
                r8 = r3
                goto L48
            L33:
                java.lang.String r0 = "baseline"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L3c
                goto L10
            L3c:
                r8 = r4
                goto L48
            L3e:
                java.lang.String r0 = "stretch"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L47
                goto L10
            L47:
                r8 = r5
            L48:
                switch(r8) {
                    case 0: goto L50;
                    case 1: goto L4f;
                    case 2: goto L4e;
                    case 3: goto L4d;
                    case 4: goto L4c;
                    default: goto L4b;
                }
            L4b:
                return r6
            L4c:
                return r4
            L4d:
                return r5
            L4e:
                return r3
            L4f:
                return r2
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.my.jj.jpo.my(java.lang.String):int");
        }

        private float wqx(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        public String toString() {
            return "LayoutParams{mWidth=" + this.jpo + ", mHeight=" + this.f17785jd + ", mMargin=" + this.my + ", mMarginLeft=" + this.f17786jj + ", mMarginRight=" + this.f17790qk + ", mMarginTop=" + this.xyk + ", mMarginBottom=" + this.zz + ", mParams=" + this.hmu + ", mOrder=" + this.f17933se + ", mFlexGrow=" + this.f17931hx + ", mFlexShrink=" + this.pdm + ", mAlignSelf=" + this.f17932rv + ", mFlexBasisPercent=" + this.f17934uu + ", mMinWidth=" + this.sz + ", mMinHeight=" + this.kln + ", mMaxWidth=" + this.f17930ef + ", mMaxHeight=" + this.nzb + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        /* renamed from: jd, reason: merged with bridge method [inline-methods] */
        public my.jpo jpo() {
            my.jpo jpoVar = new my.jpo((int) this.jpo, (int) this.f17785jd);
            ((ViewGroup.MarginLayoutParams) jpoVar).leftMargin = (int) this.f17786jj;
            ((ViewGroup.MarginLayoutParams) jpoVar).rightMargin = (int) this.f17790qk;
            ((ViewGroup.MarginLayoutParams) jpoVar).topMargin = (int) this.xyk;
            ((ViewGroup.MarginLayoutParams) jpoVar).bottomMargin = (int) this.zz;
            jpoVar.wqx(this.f17933se);
            jpoVar.cm(this.f17932rv);
            jpoVar.jpo(this.f17931hx);
            jpoVar.jd(this.pdm);
            jpoVar.wqx(this.f17934uu);
            return jpoVar;
        }

        @Override // com.bytedance.adsdk.ugeno.jd.jpo.C0062jpo
        public void jpo(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.jpo(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.f17934uu = cm(str2);
                    break;
                case "order":
                    this.f17933se = jpo(str2);
                    break;
                case "flexShrink":
                    this.pdm = wqx(str2);
                    break;
                case "flexGrow":
                    this.f17931hx = jd(str2);
                    break;
                case "alignSelf":
                    this.f17932rv = my(str2);
                    break;
            }
        }

        private int jpo(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public jj(Context context) {
        super(context);
    }

    private int au(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: if, reason: not valid java name */
    private int m392if(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int oya(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 4;
            case -1720785339:
                return str.equals("baseline") ? 3 : 4;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 4;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 4;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 4;
            default:
                return 4;
        }
    }

    private int prr(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 5;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 5;
            case -932331738:
                return str.equals("space_around") ? 4 : 5;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 5;
            case 1682480591:
                return str.equals("space_between") ? 3 : 5;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 5;
            default:
                return 5;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        ((my) this.my).setFlexDirection(this.f17928gf);
        ((my) this.my).setFlexWrap(this.ez);
        ((my) this.my).setJustifyContent(this.kgu);
        ((my) this.my).setAlignItems(this.jrx);
        ((my) this.my).setAlignContent(this.f17929lq);
    }

    public int ju(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public my jpo() {
        my myVar = new my(this.f17811jd);
        myVar.jpo(this);
        return myVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jpo
    public jpo.C0062jpo yd() {
        return new jpo(this);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.jrx = oya(str2);
                break;
            case "flexDirection":
                this.f17928gf = ju(str2);
                break;
            case "alignContent":
                this.f17929lq = prr(str2);
                break;
            case "flexWrap":
                this.ez = m392if(str2);
                break;
            case "justifyContent":
                this.kgu = au(str2);
                break;
        }
    }
}
