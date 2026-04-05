package com.bytedance.sdk.openadsdk.hmu.jpo;

import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: jd, reason: collision with root package name */
    public static int f21173jd = 6;
    public static boolean jpo = false;
    public static String wqx = "engaged_view";

    public static void jd(dt dtVar) {
        jd jdVarWqx = wqx(dtVar);
        if (jdVarWqx == null) {
            return;
        }
        jdVarWqx.jd();
    }

    public static void jpo(dt dtVar) {
        jd jdVarWqx = wqx(dtVar);
        if (jdVarWqx == null) {
            return;
        }
        jdVarWqx.jpo();
    }

    private static jd wqx(dt dtVar) {
        if (dtVar == null || !dtVar.eet()) {
            return null;
        }
        return dtVar.piq();
    }

    public static void jpo(dt dtVar, int i10) {
        jd jdVarWqx = wqx(dtVar);
        if (jdVarWqx == null || jdVarWqx.wqx()) {
            return;
        }
        jdVarWqx.jpo(i10);
    }

    public static void jpo(dt dtVar, boolean z10) {
        jd jdVarWqx = wqx(dtVar);
        if (jdVarWqx == null || jdVarWqx.wqx()) {
            return;
        }
        jdVarWqx.jpo(z10);
        jdVarWqx.jpo(z10 ? 4 : 8);
    }
}
