package com.bytedance.sdk.component.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class xyk implements Comparable<xyk>, Runnable {

    /* renamed from: jd, reason: collision with root package name */
    private String f19056jd;
    private int jpo;

    public xyk(String str, int i10) {
        this.jpo = 0;
        this.jpo = i10 == 0 ? 5 : i10;
        this.f19056jd = str;
    }

    public String getName() {
        return this.f19056jd;
    }

    public int getPriority() {
        return this.jpo;
    }

    public void setPriority(int i10) {
        this.jpo = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(xyk xykVar) {
        if (getPriority() < xykVar.getPriority()) {
            return 1;
        }
        return getPriority() >= xykVar.getPriority() ? -1 : 0;
    }

    public xyk(String str) {
        this.jpo = 5;
        this.f19056jd = str;
    }
}
