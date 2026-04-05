package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K6 implements Fa {

    /* renamed from: a, reason: collision with root package name */
    public CrashConfig f31944a;

    /* renamed from: b, reason: collision with root package name */
    public C3102z4 f31945b;

    /* renamed from: c, reason: collision with root package name */
    public final C2681a6 f31946c;

    /* renamed from: d, reason: collision with root package name */
    public final J6 f31947d;

    public K6(CrashConfig crashConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(crashConfig, "crashConfig");
        this.f31944a = crashConfig;
        this.f31946c = new C2681a6(crashConfig);
        this.f31947d = new J6(this);
    }

    public final void a(Z5 z52) {
        X5 x5C = AbstractC2807hd.c();
        long eventTTL = this.f31944a.getEventTTL();
        x5C.getClass();
        x5C.a("ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (eventTTL * 1000))});
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("x4", "TAG");
        X5 x5C2 = AbstractC2807hd.c();
        x5C2.getClass();
        int iA = (V1.a(x5C2, null, null, 63) + 1) - this.f31944a.getMaxEventsToPersist();
        if (iA > 0) {
            AbstractC2807hd.c().a(iA);
        }
        AbstractC2807hd.c().a(z52);
    }

    public final void b(Z5 incident) {
        kotlin.jvm.internal.e0.checkNotNullParameter(incident, "incident");
        if (AbstractC2809hf.a(incident)) {
            CrashConfig.ANRConfig aNRConfig = this.f31944a.getANRConfig();
            if ((incident instanceof C2761f1) && R3.f32183a.J() && aNRConfig.getAppExitReason().getUseForReporting() && this.f31946c.f32646d.a()) {
                kotlin.jvm.internal.e0.checkNotNullParameter("ANREvent", "<set-?>");
                incident.f32425a = "ANREvent";
                a(incident);
            } else if ((incident instanceof Lf) && aNRConfig.getWatchdog().getUseForReporting() && this.f31946c.f32645c.a()) {
                a(incident);
            } else {
                if (!(incident instanceof C2915o3)) {
                    return;
                }
                if (this.f31944a.getCrashConfig().getEnabled() && this.f31946c.f32643a.a()) {
                    a(incident);
                }
            }
            zk.p runnable = new zk.p(this, 1);
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2809hf.f32906a.execute(runnable);
        }
    }

    public final void c() {
        zk.p runnable = new zk.p(this, 0);
        ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        AbstractC2809hf.f32906a.execute(runnable);
        C2925od.f().a(new int[]{2, 1, 152, 150, 151}, this.f31947d);
    }

    public static final void a(K6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31945b = new C3102z4(AbstractC2807hd.c(), this$0, this$0.f31944a.getEventConfig(), null);
        X5 x5C = AbstractC2807hd.c();
        x5C.getClass();
        if (V1.a(x5C, null, null, 63) > 0) {
            this$0.b();
        }
    }

    public final void a(C2796h2 incident) {
        kotlin.jvm.internal.e0.checkNotNullParameter(incident, "incident");
        if (this.f31944a.getCatchConfig().getEnabled() && this.f31946c.f32644b.a()) {
            zk.n runnable = new zk.n(2, this, incident);
            ScheduledExecutorService scheduledExecutorService = AbstractC2809hf.f32906a;
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            AbstractC2809hf.f32906a.execute(runnable);
        }
    }

    public static final void a(K6 this$0, C2796h2 incident) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(incident, "$incident");
        this$0.a((Z5) incident);
        this$0.b();
    }

    public static final void b(K6 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.b();
    }

    @Override // com.inmobi.media.Fa
    public final C3085y4 a() throws JSONException {
        int iA;
        String string;
        int iW = R3.f32183a.w();
        int i10 = 1;
        if (iW == 0 || iW != 1) {
            iA = this.f31944a.getMobileConfig().a();
        } else {
            iA = this.f31944a.getWifiConfig().a();
        }
        ArrayList arrayListB = AbstractC2807hd.c().b(iA);
        if (arrayListB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Z5) it.next()).f32427c));
        }
        try {
            HashMap map = new HashMap(R3.f32183a.a(false));
            map.put("im-accid", C2925od.b());
            map.put("version", "2.0.0");
            map.put("component", "crash");
            map.put("mk-version", C2942pd.a());
            map.putAll(C2778g1.f32859e);
            map.put("tp", C2942pd.d());
            String strF = C2942pd.f();
            if (strF == null) {
                strF = "";
            }
            map.put("tpVer", strF);
            JSONObject jSONObject = new JSONObject(map);
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayListB.iterator();
            while (it2.hasNext()) {
                Z5 z52 = (Z5) it2.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", z52.f32594e);
                jSONObject2.put("eventType", z52.f32425a);
                String strA = z52.a();
                int length = strA.length() - i10;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length) {
                    boolean z11 = kotlin.jvm.internal.e0.compare((int) strA.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                if (strA.subSequence(i11, length + 1).toString().length() > 0) {
                    jSONObject2.put("crash_report", z52.a());
                }
                jSONObject2.put("ts", z52.f32426b);
                jSONArray.put(jSONObject2);
                i10 = 1;
            }
            jSONObject.put("crash", jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C3085y4(arrayList, string);
        }
        return null;
    }

    public final void b() {
        tu.x0 x0Var;
        C3051w4 eventConfig = this.f31944a.getEventConfig();
        eventConfig.f33531k = this.f31944a.getUrl();
        C3102z4 c3102z4 = this.f31945b;
        if (c3102z4 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eventConfig, "eventConfig");
            c3102z4.f33694i = eventConfig;
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this.f31945b = new C3102z4(AbstractC2807hd.c(), this, eventConfig, null);
        }
        C3102z4 c3102z42 = this.f31945b;
        if (c3102z42 != null) {
            C3051w4 c3051w4 = c3102z42.f33694i;
            if (c3102z42.f33691f.get() || c3051w4 == null) {
                return;
            }
            c3102z42.a(c3051w4.f33523c, false);
        }
    }
}
