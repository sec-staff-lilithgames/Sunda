package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class k {

    /* renamed from: o, reason: collision with root package name */
    private static volatile String f43915o = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f43916a;

    /* renamed from: b, reason: collision with root package name */
    private final m f43917b;

    /* renamed from: c, reason: collision with root package name */
    private Context f43918c;

    /* renamed from: d, reason: collision with root package name */
    private x f43919d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f43920e;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f43921f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f43922g;

    /* renamed from: h, reason: collision with root package name */
    private volatile c f43923h;

    /* renamed from: i, reason: collision with root package name */
    private volatile l f43924i;

    /* renamed from: j, reason: collision with root package name */
    private volatile d f43925j;

    /* renamed from: k, reason: collision with root package name */
    private volatile j f43926k;

    /* renamed from: l, reason: collision with root package name */
    private volatile s f43927l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f43928m = true;

    /* renamed from: n, reason: collision with root package name */
    private volatile o f43929n;

    public k(String str, m mVar) {
        this.f43916a = str;
        this.f43917b = mVar;
    }

    public void a(Context context) {
        this.f43918c = context;
    }

    public x b() {
        x xVar = this.f43919d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f43919d = xVarA;
        return xVarA;
    }

    public Context c() {
        return this.f43918c;
    }

    public c d() {
        if (y.b(this.f43923h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f43923h)) {
                        String strT = t();
                        this.f43923h = new c(new b(c(), e(), strT), strT);
                    }
                } finally {
                }
            }
        }
        return this.f43923h;
    }

    public String e() {
        return TextUtils.isEmpty(v()) ? "track_manager_default.db" : a.b.l("track_manager_", v(), ".db");
    }

    public d f() {
        if (y.b(this.f43925j)) {
            this.f43925j = b().f44133h;
        }
        return this.f43925j;
    }

    public l g() {
        if (y.b(this.f43924i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f43924i)) {
                        this.f43924i = new q(new g(d(), p()));
                    }
                } finally {
                }
            }
        }
        return this.f43924i;
    }

    public j h() {
        if (y.b(this.f43926k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f43926k)) {
                        this.f43926k = new j();
                    }
                } finally {
                }
            }
        }
        return this.f43926k;
    }

    public int i() {
        if (b().f44126a < 0) {
            return 50;
        }
        return b().f44126a;
    }

    public int j() {
        return Math.max(b().f44130e, 0);
    }

    public int k() {
        if (b().f44129d <= 0) {
            return 2;
        }
        return b().f44129d;
    }

    public int l() {
        return Math.max(b().f44127b, 0);
    }

    public o m() {
        if (y.b(this.f43929n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f43929n)) {
                        this.f43929n = new o(k(), n(), r(), q());
                    }
                } finally {
                }
            }
        }
        return this.f43929n;
    }

    public p n() {
        return b().f44132g;
    }

    public JSONObject o() {
        JSONObject jSONObject = this.f43920e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f43920e = jSONObject2;
        return jSONObject2;
    }

    public s p() {
        if (y.b(this.f43927l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f43927l)) {
                        this.f43927l = new s(this);
                    }
                } finally {
                }
            }
        }
        return this.f43927l;
    }

    public int q() {
        return b().f44128c;
    }

    public w r() {
        return b().f44134i;
    }

    public String s() {
        if (!TextUtils.isEmpty(f43915o)) {
            return f43915o;
        }
        String string = UUID.randomUUID().toString();
        f43915o = string;
        return string;
    }

    public String t() {
        return "event_table";
    }

    public m u() {
        return this.f43917b;
    }

    public String v() {
        return this.f43916a;
    }

    public boolean w() {
        return this.f43928m;
    }

    public String x() {
        if (!y.b(this.f43918c) && !y.b(this.f43919d)) {
            try {
                p().j();
                this.f43928m = false;
                if (TextUtils.isEmpty(f43915o)) {
                    f43915o = UUID.randomUUID().toString();
                }
                return f43915o;
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f43928m = true;
            }
        }
        return "";
    }

    public void a(x xVar) {
        this.f43919d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.f43920e = jSONObject;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f44135j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strB = eVar.b();
        if (TextUtils.isEmpty(strB)) {
            return false;
        }
        if (this.f43922g != null) {
            try {
                return !r0.contains(strB);
            } catch (Exception e11) {
                if (a.f43882a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list = this.f43921f;
        if (list != null) {
            try {
                return list.contains(strB);
            } catch (Exception e12) {
                if (a.f43882a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public boolean a() throws IllegalStateException {
        if (!y.b(b())) {
            if (!y.b(f())) {
                if (!y.b(r())) {
                    if (!y.b(n()) && !y.b(n().b())) {
                        if (TextUtils.isEmpty(n().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
