package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class se {
    public static boolean jpo = jpo();

    private static boolean jpo() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.sq.jpo() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.sq.jpo().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
        }
        return true;
    }

    public static void jpo(int i10) {
        try {
            SharedPreferences.Editor editorEdit = com.bytedance.sdk.openadsdk.core.sq.jpo().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            editorEdit.putInt("perf_con_use_prop", i10);
            editorEdit.apply();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
        }
    }
}
