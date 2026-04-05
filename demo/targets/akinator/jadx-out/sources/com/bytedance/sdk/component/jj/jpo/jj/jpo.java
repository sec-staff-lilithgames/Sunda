package com.bytedance.sdk.component.jj.jpo.jj;

import com.bytedance.sdk.component.jj.jpo.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static volatile jd jpo;

    public static jd jpo() {
        if (jpo == null) {
            synchronized (jd.class) {
                try {
                    if (jpo == null) {
                        jpo = new wqx(xyk.qk().jj(), new jj(xyk.qk().jj()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }
}
