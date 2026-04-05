package com.mbridge.msdk.video.dynview.request;

import android.content.Context;
import android.os.Build;
import com.amazon.device.ads.DtbDeviceData;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.same.net.wrapper.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends c {
    public b(Context context) {
        super(context);
    }

    private void a(e eVar) {
        eVar.a(Q6.H, "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", l0.t(this.mContext));
        eVar.a("app_version_name", l0.B(this.mContext));
        eVar.a("app_version_code", l0.A(this.mContext) + "");
        eVar.a("orientation", l0.F(this.mContext) + "");
        eVar.a("model", l0.n());
        eVar.a("brand", l0.s());
        eVar.a(Q6.U0, "");
        eVar.a("gaid2", f.c());
        int iS = l0.s(this.mContext);
        eVar.a("network_type", iS + "");
        eVar.a("network_str", l0.a(this.mContext, iS) + "");
        eVar.a(DtbDeviceData.DEVICE_DATA_LANGUAGE_KEY, l0.p(this.mContext));
        eVar.a("timezone", l0.w());
        eVar.a("useragent", l0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        com.mbridge.msdk.foundation.same.net.wrapper.f.a(eVar, this.mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.b(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.j(eVar);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        a(eVar);
    }
}
