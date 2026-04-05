package com.bytedance.adsdk.jd.wqx;

import com.bytedance.adsdk.jd.wqx.jd.hna;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: cm, reason: collision with root package name */
    private final double f17443cm;

    /* renamed from: jd, reason: collision with root package name */
    private final char f17444jd;

    /* renamed from: jj, reason: collision with root package name */
    private final String f17445jj;
    private final List<hna> jpo;
    private final String my;
    private final double wqx;

    public cm(List<hna> list, char c10, double d10, double d11, String str, String str2) {
        this.jpo = list;
        this.f17444jd = c10;
        this.wqx = d10;
        this.f17443cm = d11;
        this.my = str;
        this.f17445jj = str2;
    }

    public static int jpo(char c10, String str, String str2) {
        return str2.hashCode() + o2.e(c10 * 31, 31, str);
    }

    public int hashCode() {
        return jpo(this.f17444jd, this.f17445jj, this.my);
    }

    public double jd() {
        return this.f17443cm;
    }

    public List<hna> jpo() {
        return this.jpo;
    }
}
