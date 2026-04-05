package com.mbridge.msdk.reward.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.videocommon.setting.b;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f42576a;

    private a() {
    }

    public static a a() {
        if (f42576a == null) {
            synchronized (a.class) {
                try {
                    if (f42576a == null) {
                        f42576a = new a();
                    }
                } finally {
                }
            }
        }
        return f42576a;
    }

    private void b(c cVar) {
        List<CampaignEx> listJ;
        if (cVar == null) {
            return;
        }
        try {
            int iA = cVar.a();
            String strW = cVar.w();
            if (TextUtils.isEmpty(strW) && (listJ = cVar.j()) != null && listJ.size() > 0 && listJ.get(0) != null) {
                strW = listJ.get(0).getCampaignUnitId();
                iA = listJ.get(0).getAdType();
                cVar.a(iA);
                cVar.n(strW);
            }
            com.mbridge.msdk.videocommon.setting.c cVarA = b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), strW, iA == 287);
            if (cVarA != null) {
                cVar.m(cVarA.x());
                cVar.o(cVarA.a());
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, c cVar) {
        try {
            a(cVar);
            b(cVar);
            d.b().b(cVar);
            d.b().b(str, cVar, null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(c cVar) {
        if (cVar == null) {
            try {
                cVar = new c();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = b.b().c();
        if (aVarC != null) {
            cVar.l(aVarC.a());
            cVar.k(aVarC.f());
        }
    }
}
