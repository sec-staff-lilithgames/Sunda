package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h extends c {
    public h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        try {
            int iA = u0.a();
            String strC = u0.c();
            if (eVar != null) {
                eVar.a("misk_spt", String.valueOf(iA));
                if (!TextUtils.isEmpty(strC)) {
                    eVar.a("misk_spt_det", strC);
                }
            }
        } catch (Exception e10) {
            p0.a("CampaignRequest", e10.getMessage());
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
