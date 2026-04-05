package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f42955c = "d";

    /* renamed from: a, reason: collision with root package name */
    private int f42956a;

    /* renamed from: b, reason: collision with root package name */
    private String f42957b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42958a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f42959b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f42960c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42961d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        public class RunnableC0327a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f42963a;

            public RunnableC0327a(CampaignUnit campaignUnit) {
                this.f42963a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f42963a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f42963a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f42960c, this.f42963a);
                    d.this.saveRequestTime(this.f42963a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f42963a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f42959b.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f42961d, msg);
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i10) {
            this.f42958a = str;
            this.f42959b = jSONObject;
            this.f42960c = list;
            this.f42961d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0327a("v5".equals(this.f42958a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.f42959b.optJSONObject("data"), d.this.f42957b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.f42959b.optJSONObject("data"), d.this.f42957b)));
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

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        p0.b(f42955c, "errorCode = " + aVar.f40804a);
        a(aVar.f40804a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) throws JSONException {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f40802b) == null) {
            return;
        }
        int i10 = this.f42956a;
        if (i10 == 0) {
            b(aVar.f40825b, eVar.f40803c);
        } else if (i10 == 1) {
            a(aVar.f40825b, eVar.f40803c);
        }
    }

    public void a(String str) {
        this.f42957b = str;
    }

    private void a(List<g> list, JSONObject jSONObject) throws JSONException {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f42957b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f42957b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
