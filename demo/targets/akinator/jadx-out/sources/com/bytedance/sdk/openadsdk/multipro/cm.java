package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.sq;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static String jpo = "com.bytedance.openadsdk";

    /* renamed from: jd, reason: collision with root package name */
    public static String f21284jd = o2.o(new StringBuilder("content://"), jpo, ".TTMultiProvider");

    static {
        jpo();
    }

    public static void jpo() {
        if (sq.jpo() != null) {
            jpo = sq.jpo().getPackageName();
            f21284jd = o2.o(new StringBuilder("content://"), jpo, ".TTMultiProvider");
        }
    }
}
