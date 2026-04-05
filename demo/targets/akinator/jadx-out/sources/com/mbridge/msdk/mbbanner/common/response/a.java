package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class a extends c<JSONObject> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f41523b = "a";

    /* renamed from: a, reason: collision with root package name */
    private String f41524a = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    public class RunnableC0285a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f41526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41527c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        public class RunnableC0286a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f41529a;

            public RunnableC0286a(CampaignUnit campaignUnit) {
                this.f41529a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f41529a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f41529a.getAds().size() > 0) {
                    a.this.a(this.f41529a);
                    if (!TextUtils.isEmpty(a.this.f41524a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f41529a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f41529a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0285a.this.f41526b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0285a runnableC0285a = RunnableC0285a.this;
                a.this.a(runnableC0285a.f41527c, msg);
            }
        }

        public RunnableC0285a(String str, JSONObject jSONObject, int i10) {
            this.f41525a = str;
            this.f41526b = jSONObject;
            this.f41527c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0286a("v5".equals(this.f41525a) ? b.parseV5CampaignUnit(this.f41526b.optJSONObject("data"), a.this.f41524a) : b.parseCampaignUnit(this.f41526b.optJSONObject("data"), a.this.f41524a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        p0.c(f41523b, "onFailed errorCode = " + aVar.f40804a);
        a(aVar.f40804a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f40802b.f40825b, eVar.f40803c);
    }

    public void a(String str) {
        this.f41524a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        p0.c(f41523b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0285a(jSONObject.optString("version"), jSONObject, iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
