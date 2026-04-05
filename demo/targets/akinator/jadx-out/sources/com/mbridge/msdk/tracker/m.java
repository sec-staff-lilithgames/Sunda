package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f43930b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f43931a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f43931a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f43933a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f43934b;

        public b(e eVar, JSONObject jSONObject) {
            this.f43933a = eVar;
            this.f43934b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                m.this.f43931a.g().a(this.f43933a);
                JSONObject jSONObject = this.f43934b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f43934b.put("track_time", jArrE[0]);
                    this.f43934b.put("track_count", jArrE[1]);
                    this.f43933a.a(this.f43934b);
                }
                this.f43933a.b(m.this.f43931a.b().f44131f);
                m.this.f43931a.g().b(this.f43933a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f43931a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f43930b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.f43931a.o();
    }

    public String d() {
        return this.f43931a.s();
    }

    public long[] e() {
        return this.f43931a.g().a();
    }

    public String f() {
        return this.f43931a.v();
    }

    public boolean g() {
        return !this.f43931a.w();
    }

    public String h() {
        if (!g()) {
            return this.f43931a.x();
        }
        if (com.mbridge.msdk.tracker.a.f43882a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f43930b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f43931a.w()) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.d("TrackManager", duhsDlGWdBkekB.mKTzLuRF);
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectD = eVar.d();
            if (jSONObjectD != null && !jSONObjectD.has("ts")) {
                try {
                    jSONObjectD.put("ts", System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f43931a.h().a(new b(eVar, jSONObjectD));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.b())) {
            return false;
        }
        return this.f43931a.a(eVar);
    }

    public void a() {
        try {
            this.f43931a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        this.f43931a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
