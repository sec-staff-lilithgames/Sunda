package com.bytedance.sdk.component.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jj {
    private final String[] jpo;

    public jj(String[] strArr) {
        this.jpo = strArr;
    }

    public String jd(int i10) {
        return this.jpo[(i10 * 2) + 1];
    }

    public int jpo() {
        return this.jpo.length / 2;
    }

    public String jpo(int i10) {
        return this.jpo[i10 * 2];
    }
}
