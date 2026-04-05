package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {
    public static String a(String str) {
        String strB = b(str);
        return TextUtils.isEmpty(strB) ? "" : b1.a(strB);
    }

    public static String b(String str) {
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, TextUtils.isEmpty(str) ? gVarB.p0() : gVarB.B());
    }
}
