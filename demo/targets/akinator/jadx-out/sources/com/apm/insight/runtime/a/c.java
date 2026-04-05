package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected CrashType f13270a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f13271b;

    /* renamed from: c, reason: collision with root package name */
    private ICommonParams f13272c = com.apm.insight.e.a().c();

    /* renamed from: d, reason: collision with root package name */
    private b f13273d;

    /* renamed from: e, reason: collision with root package name */
    private d f13274e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar);

        com.apm.insight.entity.a b(int i10, com.apm.insight.entity.a aVar);
    }

    public c(CrashType crashType, Context context, b bVar, d dVar) {
        this.f13270a = crashType;
        this.f13271b = context;
        this.f13273d = bVar;
        this.f13274e = dVar;
    }

    public int a() {
        return 6;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a aVar) throws JSONException {
        aVar.a(com.apm.insight.e.q(), com.apm.insight.e.r());
        if (com.apm.insight.e.n()) {
            aVar.a("is_mp", (Object) 1);
        }
        try {
            aVar.a(this.f13272c.getPluginInfo());
        } catch (Throwable th2) {
            try {
                HashMap map = new HashMap();
                map.put("Data fetch failed since source misstake:\n" + m.a(th2), 0);
                aVar.a(map);
            } catch (Throwable unused) {
            }
        }
        aVar.b(com.apm.insight.e.p());
        com.apm.insight.e.g();
        aVar.a("process_name", com.apm.insight.l.a.b());
        return aVar;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a aVar) throws JSONException {
        b bVar;
        if (!com.apm.insight.l.a.b(com.apm.insight.e.g())) {
            aVar.a("remote_process", (Object) 1);
        }
        aVar.a("pid", Integer.valueOf(Process.myPid()));
        aVar.a(com.apm.insight.e.j());
        if (b() && (bVar = this.f13273d) != null) {
            aVar.a(bVar);
        }
        try {
            aVar.a(this.f13272c.getPatchInfo());
        } catch (Throwable th2) {
            try {
                aVar.a(Arrays.asList("Data fetch failed since source misstake:\n" + m.a(th2)));
            } catch (Throwable unused) {
            }
        }
        String strK = com.apm.insight.e.k();
        if (strK != null) {
            aVar.a("business", (Object) strK);
        }
        aVar.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a()));
        return aVar;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        return aVar;
    }

    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar, a aVar2, boolean z10) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a aVar3 = aVar;
        for (int i10 = 0; i10 < a(); i10++) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar2 != null) {
                try {
                    aVar3 = aVar2.a(i10, aVar3);
                } catch (Throwable unused) {
                }
            }
            try {
                aVar3 = a(i10, aVar3);
            } catch (Throwable unused2) {
            }
            if (aVar2 != null) {
                try {
                    a();
                    aVar3 = aVar2.b(i10, aVar3);
                } catch (Throwable unused3) {
                }
                if (z10) {
                    if (i10 != 0) {
                        aVar.c(aVar3.c());
                    } else {
                        aVar = aVar3;
                    }
                    aVar3 = new com.apm.insight.entity.a();
                }
            }
            aVar.b("step_cost_".concat(String.valueOf(i10)), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return a(aVar);
    }

    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) throws JSONException {
        if (aVar == null) {
            aVar = new com.apm.insight.entity.a();
        }
        if (i10 == 0) {
            b(aVar);
            return aVar;
        }
        if (i10 == 1) {
            c(aVar);
            List<AttachUserData> listA = com.apm.insight.e.b().a(this.f13270a);
            HashMap map = new HashMap();
            JSONObject jSONObjectOptJSONObject = aVar.c().optJSONObject(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                aVar.a(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM, jSONObjectOptJSONObject);
            }
            if (listA != null) {
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    try {
                        AttachUserData attachUserData = listA.get(i11);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, attachUserData.getUserData(this.f13270a));
                        map.put("custom_cost_" + attachUserData.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                    } catch (Throwable th2) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject, th2);
                    }
                }
            }
            try {
                jSONObjectOptJSONObject.put("fd_count", com.apm.insight.a.f());
            } catch (Throwable unused) {
            }
            List<AttachUserData> listB = com.apm.insight.e.b().b(this.f13270a);
            if (listB != null) {
                JSONObject jSONObjectOptJSONObject2 = aVar.c().optJSONObject("custom_long");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                    aVar.a("custom_long", jSONObjectOptJSONObject2);
                }
                while (i < listB.size()) {
                    try {
                        AttachUserData attachUserData2 = listB.get(i);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, attachUserData2.getUserData(this.f13270a));
                        map.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + map.size(), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
                    } catch (Throwable th3) {
                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, th3);
                    }
                    i++;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObjectOptJSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (Throwable unused2) {
                }
            }
        } else if (i10 != 2) {
            if (i10 == 5 && c()) {
                aVar.b(n.a());
                return aVar;
            }
        } else {
            d dVar = this.f13274e;
            aVar.a("battery", Integer.valueOf(dVar != null ? dVar.a() : 0));
            aVar.c(com.apm.insight.e.b().a());
            return aVar;
        }
        return aVar;
    }
}
