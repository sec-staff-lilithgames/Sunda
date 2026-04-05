package com.mbridge.msdk.splash.request;

import android.content.Context;
import android.os.Build;
import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.u;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c extends com.mbridge.msdk.foundation.same.net.wrapper.b {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a(Q6.H, "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", l0.t(this.mContext));
        eVar.a("app_version_name", l0.B(this.mContext));
        eVar.a("app_version_code", l0.A(this.mContext) + "");
        eVar.a("orientation", l0.F(this.mContext) + "");
        eVar.a("model", l0.n());
        eVar.a("brand", l0.s());
        eVar.a(Q6.U0, "");
        eVar.a("gaid2", com.mbridge.msdk.foundation.tools.f.c());
        int iS = l0.s(this.mContext);
        eVar.a("network_type", iS + "");
        eVar.a("network_str", l0.a(this.mContext, iS) + "");
        eVar.a(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, l0.p(this.mContext));
        eVar.a("timezone", l0.w());
        eVar.a("useragent", l0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", l0.n(this.mContext) + "x" + l0.m(this.mContext));
        eVar.a("version_flag", "1");
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("gp_version", u.d(this.mContext));
        }
        com.mbridge.msdk.foundation.same.net.wrapper.f.a(eVar, this.mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.b(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.j(eVar);
    }
}
