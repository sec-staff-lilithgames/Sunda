package com.mbridge.msdk.tracker.network;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class p {
    private volatile long A;
    private volatile long B;
    private volatile long C;
    private volatile long D;
    private volatile long E;
    private volatile long F;
    private volatile long G;
    private volatile long H;
    private volatile List<InetAddress> I;
    private volatile InetSocketAddress J;
    private volatile Proxy K;
    private volatile com.mbridge.msdk.thrid.okhttp.o L;
    private volatile com.mbridge.msdk.thrid.okhttp.u M;
    private volatile IOException N;
    private volatile Exception P;
    private long R;
    private long S;
    private long T;
    private long U;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f43978d;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f43980f;

    /* renamed from: j, reason: collision with root package name */
    private volatile String f43984j;

    /* renamed from: k, reason: collision with root package name */
    private volatile String f43985k;

    /* renamed from: s, reason: collision with root package name */
    private volatile long f43993s;

    /* renamed from: t, reason: collision with root package name */
    private volatile long f43994t;

    /* renamed from: u, reason: collision with root package name */
    private volatile IOException f43995u;

    /* renamed from: v, reason: collision with root package name */
    private volatile long f43996v;

    /* renamed from: w, reason: collision with root package name */
    private volatile long f43997w;

    /* renamed from: y, reason: collision with root package name */
    private volatile long f43999y;

    /* renamed from: z, reason: collision with root package name */
    private volatile long f44000z;

    /* renamed from: a, reason: collision with root package name */
    protected volatile String f43975a = "";

    /* renamed from: b, reason: collision with root package name */
    private volatile String f43976b = "";

    /* renamed from: c, reason: collision with root package name */
    private volatile String f43977c = "";

    /* renamed from: e, reason: collision with root package name */
    private volatile String f43979e = "";

    /* renamed from: g, reason: collision with root package name */
    private volatile int f43981g = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f43982h = "";

    /* renamed from: i, reason: collision with root package name */
    private volatile int f43983i = -1;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f43986l = OkHttp3Client.NETWORK_CLIENT_OKHTTP;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f43987m = false;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f43988n = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    private volatile String f43989o = "";

    /* renamed from: p, reason: collision with root package name */
    private volatile long f43990p = 0;

    /* renamed from: q, reason: collision with root package name */
    private volatile long f43991q = 0;

    /* renamed from: r, reason: collision with root package name */
    private volatile long f43992r = 0;

    /* renamed from: x, reason: collision with root package name */
    private volatile String f43998x = "system";
    private volatile boolean O = false;
    private volatile boolean Q = false;

    public p(String str, String str2) {
        this.f43978d = "";
        this.f43984j = "un_known";
        this.f43985k = "";
        this.f43984j = str;
        this.f43985k = str2;
        this.f43978d = UUID.randomUUID().toString();
    }

    private void P() {
        try {
            JSONObject jSONObjectX = x();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectX, "m_request_end");
            if (MBridgeConstans.DEBUG) {
                p0.a("NetworkMonitor_" + H(), "request  end  monitor = " + jSONObjectX.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().d().d(eVarA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("NetworkMonitor", "reportRequestEnd ", th2);
            }
        }
    }

    private void Q() {
        try {
            JSONObject jSONObjectZ = z();
            com.mbridge.msdk.tracker.e eVarA = a(jSONObjectZ, "m_request_start");
            if (MBridgeConstans.DEBUG) {
                p0.a("NetworkMonitor_" + H(), "request start monitor = " + jSONObjectZ.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().d().d(eVarA);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("NetworkMonitor", "reportRequestStart ", th2);
            }
        }
    }

    private void T() {
        this.N = null;
        this.f43995u = null;
        this.P = null;
        this.f43993s = 0L;
        this.f43994t = 0L;
        this.f43996v = 0L;
        this.f43997w = 0L;
        this.f43999y = 0L;
        this.f44000z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.G = 0L;
        this.H = 0L;
        this.f43991q = 0L;
        this.f43992r = 0L;
        this.f43987m = false;
        this.f43981g = -1;
        this.f43983i = -1;
        this.f43982h = "";
        this.f43989o = "";
        this.f43990p = 0L;
        this.Q = false;
    }

    private JSONObject x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C3191e4.h.W, "m_request_end");
        jSONObject.put("uuid", M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("url", L());
        jSONObject.put("timeout", I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("lrid", n());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f43980f);
        jSONObject.put(IronSourceConstants.EVENTS_DURATION, j());
        jSONObject.put("request_duration", w());
        jSONObject.put("response_code", E());
        String strH = h();
        jSONObject.put("dns_result", strH);
        jSONObject.put("dns_status", TextUtils.isEmpty(strH) ? 2 : 1);
        jSONObject.put("is_connection_acquired", O() ? 1 : 0);
        jSONObject.put("address", c());
        jSONObject.put("port", p());
        jSONObject.put("proxy", r());
        jSONObject.put("protocol", q());
        jSONObject.put("tls_version", J());
        jSONObject.put("content_type", f());
        int iG = G();
        jSONObject.put("result", iG);
        if (iG != 1) {
            jSONObject.put("error_type", l());
            jSONObject.put("reason", k());
        }
        jSONObject.put("dns_duration", g());
        jSONObject.put("connect_duration", d());
        jSONObject.put("request_header_duration", y());
        jSONObject.put("request_body_duration", t());
        jSONObject.put("request_body_size", u());
        jSONObject.put("response_header_duration", F());
        jSONObject.put("response_body_duration", C());
        jSONObject.put("response_body_size", D());
        jSONObject.put("transmission_duration", K());
        jSONObject.put("current_response_body_size", B());
        jSONObject.put("dns_type", i());
        return jSONObject;
    }

    private JSONObject z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C3191e4.h.W, "m_request_start");
        jSONObject.put("uuid", M());
        jSONObject.put("request_uuid", A());
        jSONObject.put("lrid", n());
        jSONObject.put("url", L());
        jSONObject.put("timeout", I());
        jSONObject.put("timeout_connection", e());
        jSONObject.put("timeout_read", s());
        jSONObject.put("timeout_write", N());
        jSONObject.put("scene", H());
        jSONObject.put("method", o());
        jSONObject.put("adtp", b());
        jSONObject.put("http_stack", m());
        jSONObject.put("retry_count", v() - 1);
        jSONObject.put("request_wait_duration", this.f43980f);
        return jSONObject;
    }

    public String A() {
        return TextUtils.isEmpty(this.f43979e) ? "" : this.f43979e;
    }

    public long B() {
        return this.f43992r;
    }

    public long C() {
        return this.H - this.G;
    }

    public long D() {
        return this.f43991q;
    }

    public int E() {
        return this.f43983i;
    }

    public long F() {
        return this.F - this.E;
    }

    public int G() {
        return this.f43981g;
    }

    public String H() {
        return TextUtils.isEmpty(this.f43984j) ? "un_known" : this.f43984j;
    }

    public long I() {
        return this.R;
    }

    public String J() {
        if (this.L != null) {
            try {
                com.mbridge.msdk.thrid.okhttp.b0 b0VarC = this.L.c();
                return b0VarC == null ? "" : b0VarC.a();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("NetworkMonitor", "getTlsVersion ", e10);
                }
            }
        }
        return "";
    }

    public long K() {
        return this.E - this.A;
    }

    public String L() {
        return TextUtils.isEmpty(this.f43975a) ? "" : this.f43975a;
    }

    public String M() {
        return TextUtils.isEmpty(this.f43978d) ? "" : this.f43978d;
    }

    public long N() {
        return this.U;
    }

    public boolean O() {
        return this.f43987m;
    }

    public void R() {
        this.C = SystemClock.elapsedRealtime();
    }

    public void S() {
        this.A = SystemClock.elapsedRealtime();
    }

    public void U() {
        this.G = SystemClock.elapsedRealtime();
    }

    public void V() {
        this.E = SystemClock.elapsedRealtime();
    }

    public void a(String str) {
        this.f43977c = str;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.g gVar) {
    }

    public void c(String str) {
        this.f43998x = str;
    }

    public void d(String str) {
        this.f43982h = str;
    }

    public void e(long j10) {
        this.S = j10;
    }

    public void f(String str) {
        this.f43975a = str;
    }

    public long g() {
        return this.f43997w - this.f43996v;
    }

    public String h() {
        if (this.I == null || this.I.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            try {
                InetAddress inetAddress = this.I.get(i10);
                if (inetAddress != null) {
                    sb2.append(inetAddress.getHostAddress());
                    if (i10 != this.I.size() - 1) {
                        sb2.append(",");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("NetworkMonitor", "getDnsResult ", e10);
                }
            }
        }
        return sb2.toString();
    }

    public void i(long j10) {
        this.R = j10;
    }

    public void j(long j10) {
        this.U = j10;
    }

    public String k() {
        try {
            if (this.N != null) {
                String name = this.N.getClass().getName();
                String message = this.N.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return a("connection: %s ", name, message);
                }
            }
            if (this.f43995u != null) {
                String name2 = this.f43995u.getClass().getName();
                String message2 = this.f43995u.getMessage();
                if (!TextUtils.isEmpty(message2)) {
                    return a("call: %s ", name2, message2);
                }
            }
            if (this.P == null) {
                return "un_known";
            }
            String name3 = this.P.getClass().getName();
            String message3 = this.P.getMessage();
            return !TextUtils.isEmpty(message3) ? a("error: %s ", name3, message3) : "un_known";
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return "un_known";
            }
            p0.b("NetworkMonitor", "getError ", e10);
            return "un_known";
        }
    }

    public String l() {
        return this.f43982h;
    }

    public String m() {
        return this.f43986l;
    }

    public String n() {
        return TextUtils.isEmpty(this.f43976b) ? "" : this.f43976b;
    }

    public String o() {
        return TextUtils.isEmpty(this.f43985k) ? "" : this.f43985k;
    }

    public int p() {
        if (this.J != null) {
            return this.J.getPort();
        }
        return -1;
    }

    public String q() {
        return this.M != null ? this.M.toString() : "";
    }

    public String r() {
        Proxy.Type type;
        return (this.K == null || (type = this.K.type()) == null) ? "" : type.toString();
    }

    public long s() {
        return this.T;
    }

    public long t() {
        return this.D - this.C;
    }

    public long u() {
        return this.f43990p;
    }

    public int v() {
        return this.f43988n.getAndAdd(0);
    }

    public long w() {
        return this.f43994t - this.f43993s;
    }

    public long y() {
        return this.B - this.A;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.d dVar) {
        this.f43993s = SystemClock.elapsedRealtime();
    }

    public String b() {
        return TextUtils.isEmpty(this.f43977c) ? "" : this.f43977c;
    }

    public String c() {
        if (this.J != null) {
            try {
                InetAddress address = this.J.getAddress();
                if (address == null) {
                    return "";
                }
                String hostAddress = address.getHostAddress();
                return TextUtils.isEmpty(hostAddress) ? "" : hostAddress;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("NetworkMonitor", "getAddress ", e10);
                }
            }
        }
        return "";
    }

    public long d() {
        return this.f44000z - this.f43999y;
    }

    public long e() {
        return this.S;
    }

    public void f(long j10) {
        this.T = j10;
    }

    public void g(long j10) {
        this.f43990p = j10;
    }

    public String i() {
        return TextUtils.isEmpty(this.f43998x) ? "system" : this.f43998x;
    }

    public long j() {
        return (this.f43994t - this.f43993s) + this.f43980f;
    }

    public void a() {
        this.f43996v = SystemClock.elapsedRealtime();
    }

    public void b(int i10) {
        this.f43983i = i10;
    }

    public void d(long j10) {
        this.H = SystemClock.elapsedRealtime();
    }

    public void e(String str) {
        this.f43976b = str;
    }

    public String f() {
        return com.mbridge.msdk.foundation.same.d.a(this.f43989o);
    }

    public void a(List<InetAddress> list) {
        this.f43997w = SystemClock.elapsedRealtime();
        this.I = list;
    }

    public void b(long j10) {
        this.D = SystemClock.elapsedRealtime();
    }

    public void b(String str) {
        this.f43989o = str;
    }

    public void a(InetSocketAddress inetSocketAddress, Proxy proxy) {
        this.f43999y = SystemClock.elapsedRealtime();
        this.J = inetSocketAddress;
        this.K = proxy;
        this.O = true;
    }

    public void c(long j10) {
        this.f43992r = j10;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.o oVar) {
        this.L = oVar;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.u uVar, IOException iOException) {
        this.f44000z = SystemClock.elapsedRealtime();
        this.M = uVar;
        this.N = iOException;
    }

    public void h(long j10) {
        this.f43991q = j10;
    }

    public void a(com.mbridge.msdk.thrid.okhttp.g gVar) {
        this.f43987m = !this.O;
        if (!this.f43987m || gVar == null) {
            return;
        }
        try {
            this.M = gVar.a();
            com.mbridge.msdk.thrid.okhttp.a0 a0VarC = gVar.c();
            if (a0VarC != null) {
                this.J = a0VarC.d();
                this.K = a0VarC.b();
            }
            this.L = gVar.b();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("NetworkMonitor", "connectionAcquired ", e10);
            }
        }
    }

    public void W() {
    }

    public void a(com.mbridge.msdk.thrid.okhttp.w wVar) {
        this.B = SystemClock.elapsedRealtime();
    }

    public void a(com.mbridge.msdk.thrid.okhttp.y yVar) {
        this.F = SystemClock.elapsedRealtime();
        if (yVar != null) {
            try {
                com.mbridge.msdk.thrid.okhttp.p pVarM = yVar.m();
                if (pVarM != null) {
                    String strB = pVarM.b("Content-Type");
                    if (TextUtils.isEmpty(strB)) {
                        strB = "";
                    }
                    b(strB);
                }
            } catch (Exception e10) {
                b("unknown");
                if (MBridgeConstans.DEBUG) {
                    p0.b("NetworkMonitor", "responseHeadersEnd ", e10);
                }
            }
        }
    }

    public void a(IOException iOException) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f43994t = jElapsedRealtime;
        this.f43995u = iOException;
        a(iOException, jElapsedRealtime);
    }

    private void a(IOException iOException, long j10) {
        if (iOException != null) {
            if (this.f43996v == 0) {
                this.f43996v = j10;
            }
            if (this.f43997w == 0) {
                this.f43997w = j10;
            }
            if (this.f43999y == 0) {
                this.f43999y = j10;
            }
            if (this.f44000z == 0) {
                this.f44000z = j10;
            }
            if (this.A == 0) {
                this.A = j10;
            }
            if (this.B == 0) {
                this.B = j10;
            }
            if (this.C == 0) {
                this.C = j10;
            }
            if (this.D == 0) {
                this.D = j10;
            }
            if (this.E == 0) {
                this.E = j10;
            }
            if (this.F == 0) {
                this.F = j10;
            }
            if (this.G == 0) {
                this.G = j10;
            }
            if (this.H == 0) {
                this.H = j10;
            }
        }
    }

    private static String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        if (TextUtils.isEmpty(str2)) {
            str2 = "IOException";
        }
        sb2.append(String.format(str, str2));
        sb2.append(TextUtils.isEmpty(str3) ? "" : str3.replaceAll("[\\n\\r]", " "));
        return sb2.toString();
    }

    public void a(long j10) {
        this.f43979e = UUID.randomUUID().toString();
        this.f43980f = j10;
        this.f43988n.addAndGet(1);
        T();
        this.Q = true;
        Q();
    }

    public void a(Exception exc) {
        this.P = exc;
    }

    public void a(int i10) {
        this.f43981g = i10;
        if (this.Q) {
            this.Q = false;
            P();
        }
    }

    private static com.mbridge.msdk.tracker.e a(JSONObject jSONObject, String str) {
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        eVar.a(0);
        eVar.b(0);
        eVar.a(com.mbridge.msdk.foundation.same.report.c.d());
        eVar.a(jSONObject);
        return eVar;
    }
}
