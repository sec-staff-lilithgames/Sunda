package com.bytedance.adsdk.ugeno.my;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: au, reason: collision with root package name */
    int f17948au;
    int hna;

    /* renamed from: if, reason: not valid java name */
    int f43if;

    /* renamed from: jj, reason: collision with root package name */
    int f17951jj;

    /* renamed from: ju, reason: collision with root package name */
    float f17952ju;
    int my;
    boolean opi;
    int prr;

    /* renamed from: qk, reason: collision with root package name */
    int f17953qk;

    /* renamed from: sq, reason: collision with root package name */
    boolean f17954sq;
    int xyk;

    /* renamed from: yd, reason: collision with root package name */
    float f17955yd;
    int zz;
    int jpo = Integer.MAX_VALUE;

    /* renamed from: jd, reason: collision with root package name */
    int f17950jd = Integer.MAX_VALUE;
    int wqx = Integer.MIN_VALUE;

    /* renamed from: cm, reason: collision with root package name */
    int f17949cm = Integer.MIN_VALUE;
    List<Integer> oya = new ArrayList();

    public int jd() {
        return this.xyk - this.zz;
    }

    public int jpo() {
        return this.f17953qk;
    }

    public void jpo(View view, int i10, int i11, int i12, int i13) {
        jd jdVar = (jd) view.getLayoutParams();
        this.jpo = Math.min(this.jpo, (view.getLeft() - jdVar.au()) - i10);
        this.f17950jd = Math.min(this.f17950jd, (view.getTop() - jdVar.oya()) - i11);
        this.wqx = Math.max(this.wqx, jdVar.prr() + view.getRight() + i12);
        this.f17949cm = Math.max(this.f17949cm, jdVar.hna() + view.getBottom() + i13);
    }
}
