package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import com.bytedance.sdk.component.jj.jpo.xyk;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {
    public static String jpo = "com.bytedance.openadsdk";

    /* renamed from: jd, reason: collision with root package name */
    public static String f18726jd = o2.o(new StringBuilder("content://"), jpo, ".TTMultiProvider");

    static {
        jpo();
    }

    public static void jpo() {
        if (xyk.qk().jj() != null) {
            jpo = xyk.qk().jj().getPackageName();
            f18726jd = o2.o(new StringBuilder("content://"), jpo, ".TTMultiProvider");
        }
    }
}
