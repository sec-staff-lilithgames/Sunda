package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.C3191e4;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f13240a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13241b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13242c = false;

    /* renamed from: d, reason: collision with root package name */
    private static int f13243d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13244e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f13245f = -1;

    /* renamed from: z, reason: collision with root package name */
    private static volatile b f13246z;
    private int B;

    /* renamed from: g, reason: collision with root package name */
    private Application f13247g;

    /* renamed from: h, reason: collision with root package name */
    private Context f13248h;

    /* renamed from: n, reason: collision with root package name */
    private String f13254n;

    /* renamed from: o, reason: collision with root package name */
    private long f13255o;

    /* renamed from: p, reason: collision with root package name */
    private String f13256p;

    /* renamed from: q, reason: collision with root package name */
    private long f13257q;

    /* renamed from: r, reason: collision with root package name */
    private String f13258r;

    /* renamed from: s, reason: collision with root package name */
    private long f13259s;

    /* renamed from: t, reason: collision with root package name */
    private String f13260t;

    /* renamed from: u, reason: collision with root package name */
    private long f13261u;

    /* renamed from: v, reason: collision with root package name */
    private String f13262v;

    /* renamed from: w, reason: collision with root package name */
    private long f13263w;

    /* renamed from: i, reason: collision with root package name */
    private List<String> f13249i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private List<Long> f13250j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private List<String> f13251k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private List<Long> f13252l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private LinkedList<a> f13253m = new LinkedList<>();

    /* renamed from: x, reason: collision with root package name */
    private boolean f13264x = false;

    /* renamed from: y, reason: collision with root package name */
    private long f13265y = -1;
    private int A = 50;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f13267a;

        /* renamed from: b, reason: collision with root package name */
        String f13268b;

        /* renamed from: c, reason: collision with root package name */
        long f13269c;

        public a(String str, String str2, long j10) {
            this.f13268b = str2;
            this.f13269c = j10;
            this.f13267a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f13269c)) + " : " + this.f13267a + ' ' + this.f13268b;
        }
    }

    private b(Application application) {
        this.f13248h = application;
        this.f13247g = application;
        if (application != null) {
            try {
                this.f13247g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f13254n = activity.getClass().getName();
                        b.this.f13255o = System.currentTimeMillis();
                        boolean unused = b.f13241b = bundle != null;
                        boolean unused2 = b.f13242c = true;
                        b.this.f13249i.add(b.this.f13254n);
                        b.this.f13250j.add(Long.valueOf(b.this.f13255o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f13254n, b.this.f13255o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f13249i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f13249i.size()) {
                            b.this.f13249i.remove(iIndexOf);
                            b.this.f13250j.remove(iIndexOf);
                        }
                        b.this.f13251k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f13252l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f13260t = activity.getClass().getName();
                        b.this.f13261u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.B == 0) {
                            b.this.f13264x = false;
                            boolean unused = b.f13242c = false;
                            b.this.f13265y = SystemClock.uptimeMillis();
                        } else if (b.this.B < 0) {
                            b.n(b.this);
                            b.this.f13264x = false;
                            boolean unused2 = b.f13242c = false;
                            b.this.f13265y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f13260t, b.this.f13261u, C3191e4.h.f36510t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f13258r = activity.getClass().getName();
                        b.this.f13259s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f13264x) {
                            if (b.f13240a) {
                                b.k();
                                int unused = b.f13243d = 1;
                                long unused2 = b.f13245f = b.this.f13259s;
                            }
                            if (!b.this.f13258r.equals(b.this.f13260t)) {
                                return;
                            }
                            if (b.f13242c && !b.f13241b) {
                                int unused3 = b.f13243d = 4;
                                long unused4 = b.f13245f = b.this.f13259s;
                                return;
                            } else if (!b.f13242c) {
                                int unused5 = b.f13243d = 3;
                                long unused6 = b.f13245f = b.this.f13259s;
                                return;
                            }
                        }
                        b.this.f13264x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f13258r, b.this.f13259s, C3191e4.h.f36512u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f13256p = activity.getClass().getName();
                        b.this.f13257q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f13256p, b.this.f13257q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f13262v = activity.getClass().getName();
                        b.this.f13263w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f13262v, b.this.f13263w, "onStop");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f13240a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f13249i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f13249i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f13249i.get(i10), this.f13250j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f13251k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f13251k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f13251k.get(i10), this.f13252l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f13254n, this.f13255o));
                jSONObject.put("last_start_activity", a(this.f13256p, this.f13257q));
                jSONObject.put("last_resume_activity", a(this.f13258r, this.f13259s));
                jSONObject.put("last_pause_activity", a(this.f13260t, this.f13261u));
                jSONObject.put("last_stop_activity", a(this.f13262v, this.f13263w));
                jSONObject.put("alive_activities", n());
                jSONObject.put(YsiBvdpw.QYTxsFQqqnl, o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.f13258r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f13253m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f13264x;
    }

    public static long c() {
        return f13245f;
    }

    public static b d() {
        if (f13246z == null) {
            synchronized (b.class) {
                try {
                    if (f13246z == null) {
                        f13246z = new b(com.apm.insight.e.h());
                    }
                } finally {
                }
            }
        }
        return f13246z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f13265y;
    }

    public static int b() {
        int i10 = f13243d;
        return i10 == 1 ? f13244e ? 2 : 1 : i10;
    }

    public static void a() {
        f13244e = true;
    }

    private static JSONObject a(String str, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put(DTBMetricReport.TIME, j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f13253m.size() >= bVar.A) {
                    aVar = bVar.f13253m.poll();
                    if (aVar != null) {
                        bVar.f13253m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f13253m.add(aVar);
                }
                aVar.f13268b = str2;
                aVar.f13267a = str;
                aVar.f13269c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
