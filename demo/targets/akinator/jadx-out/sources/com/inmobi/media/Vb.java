package com.inmobi.media;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Vb extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final Vb f32397a = new Vb();

    public Vb() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) throws JSONException {
        C2762f2 it = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        int i10 = it.f32830a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case 150:
                case 151:
                case 152:
                    Map map = it.f32832c;
                    if (map != null && map.containsKey("data")) {
                        Object obj2 = it.f32832c.get("data");
                        kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        Z5 incident = (Z5) obj2;
                        EnumC2784g7 enumC2784g7 = Wb.f32456a;
                        kotlin.jvm.internal.e0.checkNotNullParameter(incident, "incident");
                        if (!(incident instanceof C2915o3) && !(incident instanceof Lf)) {
                            if (Wb.f32460e.getANRConfig().getAppExitReason().getReportToLogs() && (incident instanceof C2761f1)) {
                                new C2783g6(Wb.f32460e.getANRConfig().getAppExitReason().getIncompleteLogThresholdTime()).a(incident.f32425a, incident.a(), ((C2761f1) incident).f32828g, incident.f32426b);
                                break;
                            }
                        } else {
                            Iterator it2 = J5.a().iterator();
                            while (it2.hasNext()) {
                                Zc zc2 = (Zc) it2.next();
                                EnumC2784g7 logLevel = EnumC2784g7.f32872c;
                                String message = "TYPE - " + incident.f32425a + ", TIMESTAMP - " + incident.f32426b + ", PAYLOAD - " + incident.a();
                                zc2.getClass();
                                kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
                                kotlin.jvm.internal.e0.checkNotNullParameter("LOGGER CRASH", "tag");
                                kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
                                zc2.f32606a.a(logLevel, "LOGGER CRASH", message);
                                if (incident instanceof C2915o3) {
                                    zc2.f32606a.b();
                                }
                            }
                            break;
                        }
                    }
                    break;
            }
        } else {
            EnumC2784g7 enumC2784g72 = Wb.f32456a;
            Iterator it3 = J5.a().iterator();
            while (it3.hasNext()) {
                Zc zc3 = (Zc) it3.next();
                EnumC2784g7 logLevel2 = EnumC2784g7.f32872c;
                String message2 = "SYSTEM SHUTDOWN RECEIVED - " + i10;
                zc3.getClass();
                kotlin.jvm.internal.e0.checkNotNullParameter(logLevel2, "logLevel");
                kotlin.jvm.internal.e0.checkNotNullParameter("LOGGER CRASH", "tag");
                kotlin.jvm.internal.e0.checkNotNullParameter(message2, "message");
                zc3.f32606a.a(logLevel2, "LOGGER CRASH", message2);
                zc3.f32606a.b();
            }
            AtomicBoolean atomicBoolean = Wb.f32458c;
            atomicBoolean.set(false);
            N7 n7F = C2925od.f();
            Vb vb2 = Wb.f32462g;
            n7F.a(vb2);
            Wb.f32457b = null;
            atomicBoolean.set(false);
            C2925od.f().a(vb2);
            Wb.f32457b = null;
        }
        return tu.x0.f87415a;
    }
}
