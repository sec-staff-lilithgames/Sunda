package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f40938a = new Handler(Looper.getMainLooper());

    public static void a(String str, CampaignEx campaignEx, String str2, String str3, String str4) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n(str, !TextUtils.isEmpty(campaignEx.getMraid()) ? 1 : 3, "0", "", campaignEx.getId(), str3, str2, String.valueOf(campaignEx.getKeyIaRst()));
        nVar.b(campaignEx.getId());
        nVar.n(campaignEx.getRequestId());
        nVar.k(campaignEx.getCurrentLocalRid());
        nVar.o(campaignEx.getRequestIdNotice());
        nVar.a(campaignEx.getAdSpaceT());
        nVar.a(str4);
        nVar.e(7);
        nVar.c(l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
        nVar.b(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        o.c(nVar);
    }

    public static void c(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        o.d(nVar);
    }

    public static void d(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.j("2000060");
            nVar.u(str);
            nVar.c(l0.s(context));
            o.h(nVar);
        }
    }

    public static void b(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        if (nVar != null) {
            nVar.j("2000059");
            nVar.u(str);
            nVar.c(l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
            nVar.d(com.mbridge.msdk.foundation.tools.f.d());
            o.g(nVar);
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, String str, CampaignEx campaignEx) {
        int adType;
        if (nVar != null) {
            nVar.d(com.mbridge.msdk.foundation.tools.f.d());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, campaignEx);
            } else {
                o.f(nVar);
            }
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.j("2000063");
            nVar.u(str);
            nVar.c(l0.s(context));
            o.e(nVar);
        }
    }
}
