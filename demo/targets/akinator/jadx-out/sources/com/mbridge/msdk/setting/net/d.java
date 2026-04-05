package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(Q6.U0, f.d());
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("SettingRequestDiff", e10.getMessage());
            }
        }
    }
}
