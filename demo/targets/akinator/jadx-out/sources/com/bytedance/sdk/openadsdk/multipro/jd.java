package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static Boolean jpo;

    public static void jd() {
        jpo = Boolean.FALSE;
        BinderPoolService.jpo = true;
    }

    public static void jpo() {
        Boolean bool = Boolean.TRUE;
        jpo = bool;
        com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_info", "is_support_multi_process", bool);
    }

    public static boolean wqx() {
        Boolean bool = jpo;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!oya.my()) {
            return false;
        }
        if (jpo == null) {
            jpo = Boolean.valueOf(com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_info", "is_support_multi_process", false));
        }
        return jpo.booleanValue();
    }
}
