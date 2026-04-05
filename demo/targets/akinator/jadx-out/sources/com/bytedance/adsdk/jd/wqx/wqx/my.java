package com.bytedance.adsdk.jd.wqx.wqx;

import com.bytedance.adsdk.jd.wqx.jpo.Cif;
import com.bytedance.adsdk.jd.wqx.jpo.ju;
import java.util.List;
import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {

    /* renamed from: au, reason: collision with root package name */
    private final float f17550au;

    /* renamed from: cm, reason: collision with root package name */
    private final long f17551cm;

    /* renamed from: dt, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.jpo f17552dt;
    private final com.bytedance.adsdk.jd.my.yd hmu;
    private final float hna;

    /* renamed from: if, reason: not valid java name */
    private final int f19if;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.qk f17553jd;

    /* renamed from: jj, reason: collision with root package name */
    private final long f17554jj;
    private final List<com.bytedance.adsdk.jd.wqx.jd.wqx> jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.jd f17555jr;

    /* renamed from: ju, reason: collision with root package name */
    private final int f17556ju;
    private final jpo my;
    private final List<com.bytedance.adsdk.jd.qk.jpo<Float>> nmd;
    private final ju opi;
    private final float oya;
    private final float prr;

    /* renamed from: qk, reason: collision with root package name */
    private final String f17557qk;

    /* renamed from: rq, reason: collision with root package name */
    private final jd f17558rq;

    /* renamed from: sq, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jpo.yd f17559sq;

    /* renamed from: tu, reason: collision with root package name */
    private final boolean f17560tu;
    private final String wqx;
    private final List<com.bytedance.adsdk.jd.wqx.jd.xyk> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final int f17561yd;
    private final Cif zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jd {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum jpo {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public my(List<com.bytedance.adsdk.jd.wqx.jd.wqx> list, com.bytedance.adsdk.jd.qk qkVar, String str, long j10, jpo jpoVar, long j11, String str2, List<com.bytedance.adsdk.jd.wqx.jd.xyk> list2, Cif cif, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.jd.wqx.jpo.yd ydVar, ju juVar, List<com.bytedance.adsdk.jd.qk.jpo<Float>> list3, jd jdVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2, boolean z10, com.bytedance.adsdk.jd.wqx.jd.jpo jpoVar2, com.bytedance.adsdk.jd.my.yd ydVar2) {
        this.jpo = list;
        this.f17553jd = qkVar;
        this.wqx = str;
        this.f17551cm = j10;
        this.my = jpoVar;
        this.f17554jj = j11;
        this.f17557qk = str2;
        this.xyk = list2;
        this.zz = cif;
        this.f17561yd = i10;
        this.f17556ju = i11;
        this.f19if = i12;
        this.f17550au = f10;
        this.oya = f11;
        this.prr = f12;
        this.hna = f13;
        this.f17559sq = ydVar;
        this.opi = juVar;
        this.nmd = list3;
        this.f17558rq = jdVar;
        this.f17555jr = jdVar2;
        this.f17560tu = z10;
        this.f17552dt = jpoVar2;
        this.hmu = ydVar2;
    }

    public long au() {
        return this.f17554jj;
    }

    public List<com.bytedance.adsdk.jd.qk.jpo<Float>> cm() {
        return this.nmd;
    }

    public com.bytedance.adsdk.jd.wqx.jd.jpo dt() {
        return this.f17552dt;
    }

    public com.bytedance.adsdk.jd.my.yd hmu() {
        return this.hmu;
    }

    public int hna() {
        return this.f19if;
    }

    /* renamed from: if, reason: not valid java name */
    public jd m385if() {
        return this.f17558rq;
    }

    public float jd() {
        return this.f17550au;
    }

    public String jj() {
        return this.wqx;
    }

    public String jpo(String str) {
        StringBuilder sbU = o2.u(str);
        sbU.append(jj());
        sbU.append("\n");
        my myVarJpo = this.f17553jd.jpo(au());
        if (myVarJpo != null) {
            sbU.append("\t\tParents: ");
            sbU.append(myVarJpo.jj());
            my myVarJpo2 = this.f17553jd.jpo(myVarJpo.au());
            while (myVarJpo2 != null) {
                sbU.append("->");
                sbU.append(myVarJpo2.jj());
                myVarJpo2 = this.f17553jd.jpo(myVarJpo2.au());
            }
            sbU.append(str);
            sbU.append("\n");
        }
        if (!yd().isEmpty()) {
            sbU.append(str);
            sbU.append("\tMasks: ");
            sbU.append(yd().size());
            sbU.append("\n");
        }
        if (opi() != 0 && sq() != 0) {
            sbU.append(str);
            sbU.append("\tBackground: ");
            sbU.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(opi()), Integer.valueOf(sq()), Integer.valueOf(hna())));
        }
        if (!this.jpo.isEmpty()) {
            sbU.append(str);
            sbU.append("\tShapes:\n");
            for (com.bytedance.adsdk.jd.wqx.jd.wqx wqxVar : this.jpo) {
                sbU.append(str);
                sbU.append("\t\t");
                sbU.append(wqxVar);
                sbU.append("\n");
            }
        }
        return sbU.toString();
    }

    public com.bytedance.adsdk.jd.wqx.jpo.yd jr() {
        return this.f17559sq;
    }

    public jpo ju() {
        return this.my;
    }

    public long my() {
        return this.f17551cm;
    }

    public ju nmd() {
        return this.opi;
    }

    public int opi() {
        return this.f17561yd;
    }

    public List<com.bytedance.adsdk.jd.wqx.jd.wqx> oya() {
        return this.jpo;
    }

    public Cif prr() {
        return this.zz;
    }

    public String qk() {
        return this.f17557qk;
    }

    public com.bytedance.adsdk.jd.wqx.jpo.jd rq() {
        return this.f17555jr;
    }

    public int sq() {
        return this.f17556ju;
    }

    public String toString() {
        return jpo("");
    }

    public boolean tu() {
        return this.f17560tu;
    }

    public float wqx() {
        return this.oya / this.f17553jd.sq();
    }

    public float xyk() {
        return this.prr;
    }

    public List<com.bytedance.adsdk.jd.wqx.jd.xyk> yd() {
        return this.xyk;
    }

    public float zz() {
        return this.hna;
    }

    public com.bytedance.adsdk.jd.qk jpo() {
        return this.f17553jd;
    }
}
