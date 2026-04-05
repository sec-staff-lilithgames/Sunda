package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f42577d = "c";

    /* renamed from: a, reason: collision with root package name */
    private int f42578a;

    /* renamed from: b, reason: collision with root package name */
    private String f42579b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f42580c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f42582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f42583c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42584d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        public class RunnableC0318a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f42586a;

            public RunnableC0318a(CampaignUnit campaignUnit) {
                this.f42586a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f42586a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f42586a.getAds().size() > 0) {
                    this.f42586a.setMetricsData(c.this.f42580c);
                    a aVar = a.this;
                    c.this.a(aVar.f42583c, this.f42586a);
                    c.this.saveRequestTime(this.f42586a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f42586a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f42582b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f42584d, msg, cVar.f42580c);
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f42581a = str;
            this.f42582b = jSONObject;
            this.f42583c = list;
            this.f42584d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0318a("v5".equals(this.f42581a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f42582b.optJSONObject("data"), c.this.f42579b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f42582b.optJSONObject("data"), c.this.f42579b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        p0.b(f42577d, "errorCode = " + aVar.f40804a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f40804a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f40805b);
        this.f42580c.a(bVar);
        a(aVar.f40804a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f42580c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) throws JSONException {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f40802b) == null) {
            return;
        }
        int i10 = this.f42578a;
        if (i10 == 0) {
            b(aVar.f40825b, eVar.f40803c);
        } else if (i10 == 1) {
            a(aVar.f40825b, eVar.f40803c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f42580c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(String str) {
        this.f42579b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f42580c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) throws JSONException {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f42579b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f42579b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.f42580c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f42580c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strG = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strG);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strG)) {
                    strG = bVarA2.g();
                }
            }
            a(i10, strG, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strG);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strG);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strG)) {
                strG = bVarA.g();
            }
        }
        a(i10, strG, cVar);
    }
}
