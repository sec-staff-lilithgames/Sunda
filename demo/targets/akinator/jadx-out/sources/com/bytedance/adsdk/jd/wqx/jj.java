package com.bytedance.adsdk.jd.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    public final float f17513jd;
    public final float jpo;
    private final String wqx;

    public jj(String str, float f10, float f11) {
        this.wqx = str;
        this.f17513jd = f11;
        this.jpo = f10;
    }

    public boolean jpo(String str) {
        if (this.wqx.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.wqx.endsWith("\r")) {
            String str2 = this.wqx;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
