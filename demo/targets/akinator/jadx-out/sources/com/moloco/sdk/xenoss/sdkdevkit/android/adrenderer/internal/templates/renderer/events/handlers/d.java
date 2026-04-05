package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import qv.v;
import tu.o;
import tu.q;
import uu.o1;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Set f48426a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f48427b;

    /* renamed from: c, reason: collision with root package name */
    public final o f48428c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        e0.checkNotNullParameter(eventHandlers, "eventHandlers");
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f48426a = eventHandlers;
        this.f48427b = metricsRecorder;
        this.f48428c = q.lazy(new a1.e(this, 16));
    }

    public final Map<String, List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a>> a() {
        return (Map) this.f48428c.getValue();
    }

    public static final Map a(d dVar) {
        Set set = dVar.f48426a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(arrayList, 10)), 16));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            String str = (String) next;
            Set set2 = dVar.f48426a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj).a().contains(str)) {
                    arrayList2.add(obj);
                }
            }
            linkedHashMap.put(next, arrayList2);
        }
        return linkedHashMap;
    }

    public final void a(String event) throws JSONException {
        String str;
        com.moloco.sdk.acm.g gVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        e0.checkNotNullParameter(event, "event");
        String strC = com.moloco.sdk.internal.client_metrics_data.c.f45889u.c();
        com.moloco.sdk.acm.recorder.c cVar = this.f48427b;
        com.moloco.sdk.acm.g gVarStartTimerEvent = cVar.startTimerEvent(strC);
        JSONObject jSONObject = new JSONObject(event);
        String string = jSONObject.getString(NotificationCompat.CATEGORY_EVENT);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", a.b.k("Event received: ", string), false, 4, null);
        List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> list = a().get(string);
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                str = "failure";
                MolocoLogger.warn$default(molocoLogger, "CompositeEventHandler", a.b.l("Found multiple event handlers for event: ", string, ", using first one"), null, false, 12, null);
                com.moloco.sdk.acm.d dVarWithTag = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.K.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), str);
                e0.checkNotNull(string);
                cVar.recordCountEvent(dVarWithTag.withTag(NotificationCompat.CATEGORY_EVENT, string));
            } else {
                str = "failure";
            }
            com.moloco.sdk.acm.g gVarStartTimerEvent2 = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45890v.c());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) y0.first((List) list);
            try {
                aVar2.a(jSONObject);
                gVar = gVarStartTimerEvent2;
                try {
                    aVar = aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    Exception exc = e;
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", a.b.k("Event handling failed: ", string), exc, false, 8, null);
                    e0.checkNotNull(string);
                    com.moloco.sdk.acm.g gVarWithTag = gVar.withTag(NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                    com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                    String strC2 = bVar.c();
                    String simpleName = exc.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    com.moloco.sdk.acm.g gVarWithTag2 = gVarWithTag.withTag(strC2, simpleName);
                    com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordTimerEvent(gVarWithTag2.withTag(bVar2.c(), str));
                    com.moloco.sdk.acm.d dVarWithTag2 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.J.c()).withTag(bVar2.c(), str);
                    String strC3 = bVar.c();
                    String simpleName2 = exc.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                    cVar.recordCountEvent(dVarWithTag2.withTag(strC3, simpleName2).withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                    com.moloco.sdk.acm.g gVarWithTag3 = gVarStartTimerEvent.withTag(bVar2.c(), str);
                    String strC4 = bVar.c();
                    String simpleName3 = exc.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName3, "getSimpleName(...)");
                    cVar.recordTimerEvent(gVarWithTag3.withTag(strC4, simpleName3).withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                }
                try {
                    MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", "Event handled: " + string, false, 4, null);
                    e0.checkNotNull(string);
                    com.moloco.sdk.acm.g gVarWithTag4 = gVar.withTag(NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                    com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordTimerEvent(gVarWithTag4.withTag(bVar3.c(), "success"));
                    cVar.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.J.c()).withTag(bVar3.c(), "success").withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                    cVar.recordTimerEvent(gVarStartTimerEvent.withTag(bVar3.c(), "success").withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                } catch (Exception e11) {
                    e = e11;
                    Exception exc2 = e;
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", a.b.k("Event handling failed: ", string), exc2, false, 8, null);
                    e0.checkNotNull(string);
                    com.moloco.sdk.acm.g gVarWithTag5 = gVar.withTag(NotificationCompat.CATEGORY_EVENT, string).withTag("handler", aVar.b());
                    com.moloco.sdk.internal.client_metrics_data.b bVar4 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                    String strC22 = bVar4.c();
                    String simpleName4 = exc2.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName4, "getSimpleName(...)");
                    com.moloco.sdk.acm.g gVarWithTag22 = gVarWithTag5.withTag(strC22, simpleName4);
                    com.moloco.sdk.internal.client_metrics_data.b bVar22 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    cVar.recordTimerEvent(gVarWithTag22.withTag(bVar22.c(), str));
                    com.moloco.sdk.acm.d dVarWithTag22 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.J.c()).withTag(bVar22.c(), str);
                    String strC32 = bVar4.c();
                    String simpleName22 = exc2.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName22, "getSimpleName(...)");
                    cVar.recordCountEvent(dVarWithTag22.withTag(strC32, simpleName22).withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                    com.moloco.sdk.acm.g gVarWithTag32 = gVarStartTimerEvent.withTag(bVar22.c(), str);
                    String strC42 = bVar4.c();
                    String simpleName32 = exc2.getClass().getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName32, "getSimpleName(...)");
                    cVar.recordTimerEvent(gVarWithTag32.withTag(strC42, simpleName32).withTag("handler", aVar.b()).withTag(NotificationCompat.CATEGORY_EVENT, string));
                }
            } catch (Exception e12) {
                e = e12;
                gVar = gVarStartTimerEvent2;
            }
        } else {
            MolocoLogger.error$default(molocoLogger, "CompositeEventHandler", a.b.k("Event not handled: ", string), null, false, 12, null);
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.J.c());
            com.moloco.sdk.internal.client_metrics_data.b bVar5 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            com.moloco.sdk.acm.d dVarWithTag3 = dVar.withTag(bVar5.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar6 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            com.moloco.sdk.acm.d dVarWithTag4 = dVarWithTag3.withTag(bVar6.c(), "no_handler");
            e0.checkNotNull(string);
            cVar.recordCountEvent(dVarWithTag4.withTag(NotificationCompat.CATEGORY_EVENT, string));
            cVar.recordTimerEvent(gVarStartTimerEvent.withTag(bVar5.c(), "failure").withTag(bVar6.c(), "no_handler").withTag(NotificationCompat.CATEGORY_EVENT, string));
        }
    }
}
