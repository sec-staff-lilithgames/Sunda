package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private int f41794a;

    /* renamed from: b, reason: collision with root package name */
    private String f41795b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41796a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f41797b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f41798c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f41799d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        public class RunnableC0295a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f41801a;

            public RunnableC0295a(CampaignUnit campaignUnit) {
                this.f41801a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f41801a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f41801a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.f41799d, aVar.f41797b.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.f41798c, this.f41801a);
                    b.this.saveRequestTime(this.f41801a.getAds().size());
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f41796a = str;
            this.f41797b = jSONObject;
            this.f41798c = list;
            this.f41799d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0295a("v5".equals(this.f41796a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f41797b.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f41797b.optJSONObject("data"))));
        }
    }

    public abstract void a(int i10, String str);

    public void a(String str) {
        this.f41795b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.f41795b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f40804a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f40802b) == null) {
            return;
        }
        int i10 = this.f41794a;
        if (i10 == 0) {
            b(aVar.f40825b, eVar.f40803c);
        } else if (i10 == 1) {
            a(aVar.f40825b, eVar.f40803c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(int i10) {
        this.f41794a = i10;
    }

    public int a() {
        return this.f41794a;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
