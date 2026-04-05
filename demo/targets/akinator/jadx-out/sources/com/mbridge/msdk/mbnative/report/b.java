package com.mbridge.msdk.mbnative.report;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41788b;

        public a(Context context, CampaignEx campaignEx) {
            this.f41787a = context;
            this.f41788b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f41787a)).b(this.f41788b.getId());
            } catch (Exception unused) {
                p0.b("NativeReportUtils", "campain can't insert db");
            }
        }
    }

    public static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.listener.a aVar) {
        if (campaignEx == null) {
            return;
        }
        try {
            com.mbridge.msdk.setting.g gVarB = h.b().b(c.m().b());
            boolean z10 = gVarB == null || gVarB.n() == 1;
            if (!campaignEx.isReport()) {
                campaignEx.setReport(true);
                a(campaignEx, context, str);
                a(campaignEx, context, str, aVar, z10);
                a(a(campaignEx), campaignEx, context, str);
                b(campaignEx, context, str);
                b(campaignEx);
            }
            if (aVar != null && !campaignEx.isCallBackImpression()) {
                if (!z10) {
                    try {
                        aVar.onLoggingImpression(campaignEx.getType());
                    } catch (Exception e10) {
                        Log.e("NativeReportUtils", e10.getMessage());
                    }
                }
                campaignEx.setCallBackImpression(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void b(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        l lVar = new l();
        lVar.a(0);
        com.mbridge.msdk.foundation.tools.g.a(arrayList, lVar);
    }

    private static synchronized void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    Iterator<String> it = pv_urls.iterator();
                    while (it.hasNext()) {
                        CampaignEx campaignEx2 = campaignEx;
                        Context context2 = context;
                        String str2 = str;
                        com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                        context = context2;
                        campaignEx = campaignEx2;
                        str = str2;
                    }
                }
            } finally {
            }
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str) {
        try {
            c.m().a(context);
            if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, campaignEx));
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39792m);
            }
            if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().k() != null) {
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().k(), false, false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a(CampaignEx campaignEx, Context context, String str, com.mbridge.msdk.mbnative.listener.a aVar, boolean z10) {
        Map<String, Long> map;
        if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL()) && (map = NativeController.f41621d0) != null && !map.containsKey(campaignEx.getOnlyImpressionURL())) {
            if (z10 && aVar != null) {
                try {
                    aVar.onLoggingImpression(campaignEx.getAdType());
                } catch (Exception e10) {
                    Log.e("NativeReportUtils", e10.getMessage());
                }
            }
            NativeController.f41621d0.put(campaignEx.getOnlyImpressionURL(), Long.valueOf(System.currentTimeMillis()));
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f39793n);
        }
    }

    private static void a(List<String> list, CampaignEx campaignEx, Context context, String str) {
        CampaignEx campaignEx2;
        Context context2;
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        int i10 = 0;
        while (i10 < list.size()) {
            String str3 = list.get(i10);
            if (TextUtils.isEmpty(str3)) {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
            } else {
                campaignEx2 = campaignEx;
                context2 = context;
                str2 = str;
                com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, str3, false, false);
            }
            i10++;
            context = context2;
            campaignEx = campaignEx2;
            str = str2;
        }
    }

    public static List<String> a(CampaignEx campaignEx) {
        ArrayList arrayList = new ArrayList();
        if (campaignEx != null) {
            String ad_url_list = campaignEx.getAd_url_list();
            if (!TextUtils.isEmpty(ad_url_list)) {
                try {
                    JSONArray jSONArray = new JSONArray(ad_url_list);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add((String) jSONArray.get(i10));
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return arrayList;
                }
            }
        }
        return arrayList;
    }
}
