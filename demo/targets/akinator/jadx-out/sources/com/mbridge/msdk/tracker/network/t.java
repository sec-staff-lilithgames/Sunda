package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.inmobi.commons.core.configs.CrashConfig;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class t<T> implements Comparable<t<T>> {

    /* renamed from: a, reason: collision with root package name */
    private c f44007a;

    /* renamed from: b, reason: collision with root package name */
    private String f44008b;

    /* renamed from: c, reason: collision with root package name */
    private volatile p f44009c;

    /* renamed from: d, reason: collision with root package name */
    private long f44010d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f44011e;

    /* renamed from: f, reason: collision with root package name */
    private int f44012f;

    /* renamed from: g, reason: collision with root package name */
    private final String f44013g;

    /* renamed from: h, reason: collision with root package name */
    private final int f44014h;

    /* renamed from: i, reason: collision with root package name */
    private final String f44015i;

    /* renamed from: j, reason: collision with root package name */
    private final int f44016j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f44017k;

    /* renamed from: l, reason: collision with root package name */
    private v.a f44018l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f44019m;

    /* renamed from: n, reason: collision with root package name */
    private u f44020n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44021o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44022p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44023q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f44024r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f44025s;

    /* renamed from: t, reason: collision with root package name */
    private x f44026t;

    /* renamed from: u, reason: collision with root package name */
    private b.a f44027u;

    /* renamed from: v, reason: collision with root package name */
    private long f44028v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public t(int i10, String str) {
        this(i10, str, 0);
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final boolean A() {
        return this.f44025s;
    }

    public final boolean B() {
        return this.f44024r;
    }

    public abstract v<T> a(q qVar);

    public abstract void a(T t10);

    public void a(String str) {
    }

    public b0 c(b0 b0Var) {
        return b0Var;
    }

    public b.a d() {
        return this.f44027u;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f44008b)) {
            return this.f44008b;
        }
        if (this.f44007a == null) {
            this.f44007a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String strA = this.f44007a.a(this);
        this.f44008b = strA;
        return strA;
    }

    public Map<String, String> f() {
        return Collections.EMPTY_MAP;
    }

    public int g() {
        return this.f44012f;
    }

    public p h() {
        return this.f44009c;
    }

    public Map<String, String> i() {
        return null;
    }

    public String j() {
        return C.UTF8_NAME;
    }

    public int k() {
        return this.f44014h;
    }

    public a l() {
        return a.NORMAL;
    }

    public long m() {
        return this.f44028v;
    }

    public long n() {
        return SystemClock.elapsedRealtime() - this.f44010d;
    }

    public x o() {
        return this.f44026t;
    }

    public String p() {
        return this.f44015i;
    }

    public final int q() {
        x xVarO = o();
        if (xVarO == null) {
            return 30000;
        }
        return xVarO.b();
    }

    public final long r() {
        x xVarO = o();
        if (xVarO == null) {
            return CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        }
        long jA = xVarO.a();
        return jA < 0 ? CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL : jA;
    }

    public int s() {
        return this.f44016j;
    }

    public String t() {
        return this.f44013g;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(s());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v() ? "[X] " : "[ ] ");
        sb2.append(t());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(l());
        sb2.append(" ");
        sb2.append(this.f44019m);
        return sb2.toString();
    }

    public boolean u() {
        boolean z10;
        synchronized (this.f44017k) {
            z10 = this.f44023q;
        }
        return z10;
    }

    public boolean v() {
        boolean z10;
        synchronized (this.f44017k) {
            z10 = this.f44022p;
        }
        return z10;
    }

    public void w() {
        synchronized (this.f44017k) {
            this.f44023q = true;
        }
    }

    public void x() {
        synchronized (this.f44017k) {
        }
    }

    public boolean y() {
        return true;
    }

    public final boolean z() {
        return this.f44021o;
    }

    public t(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public boolean a() {
        return false;
    }

    public void c(String str) {
        u uVar = this.f44020n;
        if (uVar != null) {
            uVar.c(this);
        }
    }

    public String d(String str) {
        if (this.f44011e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f44011e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public t(int i10, String str, int i11, String str2) {
        this.f44017k = new Object();
        this.f44021o = false;
        this.f44022p = false;
        this.f44023q = false;
        this.f44024r = false;
        this.f44025s = false;
        this.f44027u = null;
        this.f44028v = 0L;
        this.f44012f = i10;
        this.f44013g = str;
        this.f44014h = i11;
        this.f44015i = str2;
        a((x) new e());
        this.f44016j = b(str);
        this.f44010d = SystemClock.elapsedRealtime();
    }

    public void a(v.a aVar) {
        this.f44018l = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(x xVar) {
        this.f44026t = xVar;
        return this;
    }

    public String c() {
        return OcvDtWCQ.IhABsRxiTIo + j();
    }

    public void a(int i10) {
        u uVar = this.f44020n;
        if (uVar != null) {
            uVar.a(this, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(int i10) {
        this.f44019m = Integer.valueOf(i10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> c(boolean z10) {
        this.f44024r = z10;
        return this;
    }

    public byte[] b() {
        Map<String, String> mapI = i();
        if (mapI != null && mapI.size() > 0) {
            byte[] bArrA = a(mapI, j());
            this.f44028v = bArrA.length;
            return bArrA;
        }
        this.f44028v = 0L;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t<?> a(u uVar) {
        this.f44020n = uVar;
        return this;
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(G5.T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(a.b.k("Encoding not supported: ", str), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> b(boolean z10) {
        this.f44025s = z10;
        return this;
    }

    public void b(b0 b0Var) {
        v.a aVar;
        synchronized (this.f44017k) {
            aVar = this.f44018l;
        }
        if (aVar != null) {
            aVar.a(b0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t<?> a(boolean z10) {
        this.f44021o = z10;
        return this;
    }

    public void a(v<?> vVar) {
        synchronized (this.f44017k) {
        }
    }

    public void a(p pVar) {
        this.f44009c = pVar;
    }

    public void a(String str, String str2) {
        if (this.f44011e == null) {
            this.f44011e = new HashMap();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f44011e.put(str, str2);
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t<T> tVar) {
        a aVarL = l();
        a aVarL2 = tVar.l();
        return aVarL == aVarL2 ? this.f44019m.intValue() - tVar.f44019m.intValue() : aVarL2.ordinal() - aVarL.ordinal();
    }
}
