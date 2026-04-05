package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.acm.g;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;
import uu.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f48413a;

    public a(com.moloco.sdk.acm.recorder.c metricsRecorder) {
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f48413a = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public Set<String> a() {
        return b2.setOf("metric");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public String b() {
        return "ACMHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public void a(JSONObject event) throws JSONException {
        e0.checkNotNullParameter(event, "event");
        String string = event.getString(NotificationCompat.CATEGORY_EVENT);
        String string2 = event.getString("metricName");
        String string3 = event.getString("type");
        JSONObject jSONObjectOptJSONObject = event.optJSONObject("tags");
        String string4 = event.getString("value");
        boolean zAreEqual = e0.areEqual(string3, "counter");
        com.moloco.sdk.acm.recorder.c cVar = this.f48413a;
        if (zAreEqual) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), a.b.m("Count metric recorded: ", string2, " = ", string4), false, 4, null);
            e0.checkNotNull(string2);
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(string2);
            e0.checkNotNull(string4);
            dVar.withCount(Integer.parseInt(string4));
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                e0.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    e0.checkNotNull(next);
                    String string5 = jSONObjectOptJSONObject.getString(next);
                    e0.checkNotNullExpressionValue(string5, "getString(...)");
                    dVar = dVar.withTag(next, string5);
                }
            }
            cVar.recordCountEvent(dVar);
            return;
        }
        if (!e0.areEqual(string3, "timer")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, b(), a.b.k("Unknown event type: ", string), null, false, 12, null);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, b(), a.b.m("Timer metric recorded: ", string2, " = ", string4), false, 4, null);
        g.a aVar = com.moloco.sdk.acm.g.Companion;
        e0.checkNotNull(string2);
        com.moloco.sdk.acm.g gVarCreate = aVar.create(string2);
        e0.checkNotNull(string4);
        gVarCreate.withTime(Long.parseLong(string4));
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            e0.checkNotNullExpressionValue(itKeys2, "keys(...)");
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                e0.checkNotNull(next2);
                String string6 = jSONObjectOptJSONObject.getString(next2);
                e0.checkNotNullExpressionValue(string6, "getString(...)");
                gVarCreate = gVarCreate.withTag(next2, string6);
            }
        }
        cVar.recordTimerEvent(gVarCreate);
    }
}
