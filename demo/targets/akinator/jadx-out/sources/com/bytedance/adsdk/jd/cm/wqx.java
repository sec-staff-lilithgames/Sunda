package com.bytedance.adsdk.jd.cm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum wqx {
    JSON(".json"),
    ZIP(".zip");

    public final String wqx;

    wqx(String str) {
        this.wqx = str;
    }

    public String jpo() {
        return ".temp" + this.wqx;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.wqx;
    }
}
