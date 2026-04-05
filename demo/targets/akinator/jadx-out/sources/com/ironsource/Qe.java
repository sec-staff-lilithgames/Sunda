package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Qe {

    /* renamed from: a, reason: collision with root package name */
    private C3175d6 f35365a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends Pe {
        public a() {
        }

        @Override // com.ironsource.Pe, java.lang.Runnable
        public void run() throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            try {
                jSONObjectB.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C3272id.O.a(new C5(D5.APP_ENTER_BACKGROUND, jSONObjectB));
        }
    }

    public final void a(InterfaceC3357n7 applicationLifecycleService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.f35365a = new C3175d6(applicationLifecycleService, new a());
    }
}
