package com.bytedance.adsdk.jd.wqx.jd;

import android.graphics.Paint;
import com.bytedance.adsdk.jd.jpo.jpo.nmd;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jpo f17480cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17481jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17482jj;
    private final String jpo;
    private final com.bytedance.adsdk.jd.wqx.jpo.cm my;

    /* renamed from: qk, reason: collision with root package name */
    private final jpo f17483qk;
    private final List<com.bytedance.adsdk.jd.wqx.jpo.jd> wqx;
    private final jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final boolean f17484yd;
    private final float zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.wqx.jd.opi$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: jd, reason: collision with root package name */
        static final /* synthetic */ int[] f17485jd;
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[jd.values().length];
            f17485jd = iArr;
            try {
                iArr[jd.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17485jd[jd.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17485jd[jd.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[jpo.values().length];
            jpo = iArr2;
            try {
                iArr2[jpo.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[jpo.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[jpo.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jd {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join jpo() {
            int i10 = AnonymousClass1.f17485jd[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap jpo() {
            int i10 = AnonymousClass1.jpo[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public opi(String str, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, List<com.bytedance.adsdk.jd.wqx.jpo.jd> list, com.bytedance.adsdk.jd.wqx.jpo.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jpo.cm cmVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, jpo jpoVar2, jd jdVar3, float f10, boolean z10) {
        this.jpo = str;
        this.f17481jd = jdVar;
        this.wqx = list;
        this.f17480cm = jpoVar;
        this.my = cmVar;
        this.f17482jj = jdVar2;
        this.f17483qk = jpoVar2;
        this.xyk = jdVar3;
        this.zz = f10;
        this.f17484yd = z10;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd cm() {
        return this.f17482jj;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jpo jd() {
        return this.f17480cm;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd jj() {
        return this.f17481jd;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jd.wqx
    public com.bytedance.adsdk.jd.jpo.jpo.wqx jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.qk qkVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar) {
        return new nmd(zzVar, jpoVar, this);
    }

    public List<com.bytedance.adsdk.jd.wqx.jpo.jd> my() {
        return this.wqx;
    }

    public jpo qk() {
        return this.f17483qk;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.cm wqx() {
        return this.my;
    }

    public jd xyk() {
        return this.xyk;
    }

    public boolean yd() {
        return this.f17484yd;
    }

    public float zz() {
        return this.zz;
    }

    public String jpo() {
        return this.jpo;
    }
}
