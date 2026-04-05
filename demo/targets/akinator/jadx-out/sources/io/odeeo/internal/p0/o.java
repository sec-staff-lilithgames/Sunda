package io.odeeo.internal.p0;

import android.content.Context;
import android.os.Handler;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import com.ironsource.G9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import io.ktor.util.date.GMTDateParser;
import io.odeeo.internal.p0.d;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.v;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.j1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements d, b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final h1<Long> f65655p = h1.of(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* renamed from: q, reason: collision with root package name */
    public static final h1<Long> f65656q = h1.of(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* renamed from: r, reason: collision with root package name */
    public static final h1<Long> f65657r = h1.of(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* renamed from: s, reason: collision with root package name */
    public static final h1<Long> f65658s = h1.of(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* renamed from: t, reason: collision with root package name */
    public static final h1<Long> f65659t = h1.of(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* renamed from: u, reason: collision with root package name */
    public static final h1<Long> f65660u = h1.of(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* renamed from: v, reason: collision with root package name */
    public static o f65661v;

    /* renamed from: a, reason: collision with root package name */
    public final j1<Integer, Long> f65662a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a.C0634a f65663b;

    /* renamed from: c, reason: collision with root package name */
    public final z f65664c;

    /* renamed from: d, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f65665d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65666e;

    /* renamed from: f, reason: collision with root package name */
    public int f65667f;

    /* renamed from: g, reason: collision with root package name */
    public long f65668g;

    /* renamed from: h, reason: collision with root package name */
    public long f65669h;

    /* renamed from: i, reason: collision with root package name */
    public int f65670i;

    /* renamed from: j, reason: collision with root package name */
    public long f65671j;

    /* renamed from: k, reason: collision with root package name */
    public long f65672k;

    /* renamed from: l, reason: collision with root package name */
    public long f65673l;

    /* renamed from: m, reason: collision with root package name */
    public long f65674m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65675n;

    /* renamed from: o, reason: collision with root package name */
    public int f65676o;

    public static synchronized o getSingletonInstance(Context context) {
        try {
            if (f65661v == null) {
                f65661v = new b(context).build();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65661v;
    }

    @Override // io.odeeo.internal.p0.d
    public void addEventListener(Handler handler, d.a aVar) {
        io.odeeo.internal.q0.a.checkNotNull(handler);
        io.odeeo.internal.q0.a.checkNotNull(aVar);
        this.f65663b.addListener(handler, aVar);
    }

    public final synchronized void b(int i10) throws Throwable {
        Throwable th2;
        try {
            try {
                int i11 = this.f65670i;
                if (i11 != 0) {
                    try {
                        if (!this.f65666e) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (this.f65675n) {
                    i10 = this.f65676o;
                }
                if (i11 == i10) {
                    return;
                }
                this.f65670i = i10;
                if (i10 == 1 || i10 == 0 || i10 == 8) {
                    return;
                }
                this.f65673l = a(i10);
                long jElapsedRealtime = this.f65665d.elapsedRealtime();
                a(this.f65667f > 0 ? (int) (jElapsedRealtime - this.f65668g) : 0, this.f65669h, this.f65673l);
                this.f65668g = jElapsedRealtime;
                this.f65669h = 0L;
                this.f65672k = 0L;
                this.f65671j = 0L;
                this.f65664c.reset();
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.odeeo.internal.p0.d
    public synchronized long getBitrateEstimate() {
        return this.f65673l;
    }

    @Override // io.odeeo.internal.p0.d
    public /* bridge */ /* synthetic */ long getTimeToFirstByteEstimateUs() {
        return super.getTimeToFirstByteEstimateUs();
    }

    @Override // io.odeeo.internal.p0.b0
    public synchronized void onBytesTransferred(i iVar, m mVar, boolean z10, int i10) {
        if (a(mVar, z10)) {
            this.f65669h += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // io.odeeo.internal.p0.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(io.odeeo.internal.p0.i r11, io.odeeo.internal.p0.m r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = a(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f65667f     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            io.odeeo.internal.q0.a.checkState(r11)     // Catch: java.lang.Throwable -> L72
            io.odeeo.internal.q0.d r11 = r10.f65665d     // Catch: java.lang.Throwable -> L72
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f65668g     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f65671j     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f65671j = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f65672k     // Catch: java.lang.Throwable -> L72
            long r6 = r10.f65669h     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f65672k = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            io.odeeo.internal.p0.z r13 = r10.f65664c     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f65671j     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.f65672k     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            io.odeeo.internal.p0.z r11 = r10.f65664c     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.f65673l = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.f65669h     // Catch: java.lang.Throwable -> L72
            long r8 = r10.f65673l     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.a(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.f65668g = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.f65669h = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.f65667f     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.f65667f = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.p0.o.onTransferEnd(io.odeeo.internal.p0.i, io.odeeo.internal.p0.m, boolean):void");
    }

    @Override // io.odeeo.internal.p0.b0
    public synchronized void onTransferStart(i iVar, m mVar, boolean z10) {
        try {
            if (a(mVar, z10)) {
                if (this.f65667f == 0) {
                    this.f65668g = this.f65665d.elapsedRealtime();
                }
                this.f65667f++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.odeeo.internal.p0.d
    public void removeEventListener(d.a aVar) {
        this.f65663b.removeListener(aVar);
    }

    public synchronized void setNetworkTypeOverride(int i10) {
        this.f65676o = i10;
        this.f65675n = true;
        b(i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65677a;

        /* renamed from: b, reason: collision with root package name */
        public Map<Integer, Long> f65678b;

        /* renamed from: c, reason: collision with root package name */
        public int f65679c;

        /* renamed from: d, reason: collision with root package name */
        public io.odeeo.internal.q0.d f65680d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f65681e;

        public b(Context context) {
            this.f65677a = context == null ? null : context.getApplicationContext();
            this.f65678b = a(g0.getCountryCode(context));
            this.f65679c = 2000;
            this.f65680d = io.odeeo.internal.q0.d.f65844a;
            this.f65681e = true;
        }

        public static Map<Integer, Long> a(String str) {
            int[] iArrB = o.b(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            h1<Long> h1Var = o.f65655p;
            map.put(2, h1Var.get(iArrB[0]));
            map.put(3, o.f65656q.get(iArrB[1]));
            map.put(4, o.f65657r.get(iArrB[2]));
            map.put(5, o.f65658s.get(iArrB[3]));
            map.put(10, o.f65659t.get(iArrB[4]));
            map.put(9, o.f65660u.get(iArrB[5]));
            map.put(7, h1Var.get(iArrB[0]));
            return map;
        }

        public o build() {
            return new o(this.f65677a, this.f65678b, this.f65679c, this.f65680d, this.f65681e);
        }

        public b setClock(io.odeeo.internal.q0.d dVar) {
            this.f65680d = dVar;
            return this;
        }

        public b setInitialBitrateEstimate(long j10) {
            Iterator<Integer> it = this.f65678b.keySet().iterator();
            while (it.hasNext()) {
                setInitialBitrateEstimate(it.next().intValue(), j10);
            }
            return this;
        }

        public b setResetOnNetworkTypeChange(boolean z10) {
            this.f65681e = z10;
            return this;
        }

        public b setSlidingWindowMaxWeight(int i10) {
            this.f65679c = i10;
            return this;
        }

        public b setInitialBitrateEstimate(int i10, long j10) {
            this.f65678b.put(Integer.valueOf(i10), Long.valueOf(j10));
            return this;
        }

        public b setInitialBitrateEstimate(String str) {
            this.f65678b = a(io.odeeo.internal.t0.c.toUpperCase(str));
            return this;
        }
    }

    @Deprecated
    public o() {
        this(null, j1.of(), 2000, io.odeeo.internal.q0.d.f65844a, false);
    }

    public final void a(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f65674m) {
            return;
        }
        this.f65674m = j11;
        this.f65663b.bandwidthSample(i10, j10, j11);
    }

    public o(Context context, Map<Integer, Long> map, int i10, io.odeeo.internal.q0.d dVar, boolean z10) {
        this.f65662a = j1.copyOf((Map) map);
        this.f65663b = new d.a.C0634a();
        this.f65664c = new z(i10);
        this.f65665d = dVar;
        this.f65666e = z10;
        if (context != null) {
            io.odeeo.internal.q0.v vVar = io.odeeo.internal.q0.v.getInstance(context);
            int networkType = vVar.getNetworkType();
            this.f65670i = networkType;
            this.f65673l = a(networkType);
            vVar.register(new v.c() { // from class: at.b
                @Override // io.odeeo.internal.q0.v.c
                public final void onNetworkTypeChanged(int i11) throws Throwable {
                    this.f8005a.b(i11);
                }
            });
            return;
        }
        this.f65670i = 0;
        this.f65673l = a(0);
    }

    public final long a(int i10) {
        Long l9 = this.f65662a.get(Integer.valueOf(i10));
        if (l9 == null) {
            l9 = this.f65662a.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    public static boolean a(m mVar, boolean z10) {
        return z10 && !mVar.isFlagSet(8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] b(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case ERROR_REASON_ANALYTICS_MONITOR_BAD_CONTENT_VALUE:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = AbstractJsonLexerKt.STRING;
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = GMTDateParser.ANY;
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = AbstractJsonLexerKt.COLON;
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = G5.T;
                    break;
                }
                break;
            case G9.a.f34481e /* 2210 */:
                if (str.equals("EG")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = GMTDateParser.MONTH;
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = GMTDateParser.YEAR;
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c10 = AbstractJsonLexerKt.BEGIN_LIST;
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = AbstractJsonLexerKt.STRING_ESC;
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = AbstractJsonLexerKt.END_LIST;
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = GMTDateParser.DAY_OF_MONTH;
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = GMTDateParser.HOURS;
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = GMTDateParser.MINUTES;
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = GMTDateParser.SECONDS;
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = AbstractJsonLexerKt.UNICODE_ESC;
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = GMTDateParser.ZONE;
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = AbstractJsonLexerKt.BEGIN_OBJ;
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = AbstractJsonLexerKt.END_OBJ;
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 130;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 161;
                    break;
                }
                break;
            case G9.b.f34491e /* 2503 */:
                if (str.equals("NU")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 26:
            case 'P':
            case TPAT_ERROR_VALUE:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case ']':
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 187:
            case 196:
            case 206:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case '3':
            case '9':
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case ASSET_FAILED_STATUS_CODE_VALUE:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case ',':
                return new int[]{3, 4, 3, 2, 2, 2};
            case '\b':
            case '?':
            case 'd':
            case 162:
            case 190:
            case 199:
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 4, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case '(':
            case 'g':
            case 188:
            case 193:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 1, 0, 1, 2, 2};
            case '\r':
            case 'W':
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 'O':
            case INVALID_ADS_ENDPOINT_VALUE:
            case 142:
            case 172:
            case PsExtractor.AUDIO_STREAM /* 192 */:
            case 195:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
            case 'M':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case '5':
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case ';':
            case 203:
            case 210:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case 198:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case ' ':
                return new int[]{3, 1, 3, 2, 2, 2};
            case '!':
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case '\"':
                return new int[]{0, 1, 1, 3, 2, 2};
            case '#':
                return new int[]{2, 4, 2, 2, 2, 2};
            case '$':
                return new int[]{0, 2, 1, 2, 4, 1};
            case '%':
                return new int[]{4, 2, 3, 1, 2, 2};
            case '&':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '\'':
            case 150:
                return new int[]{2, 4, 3, 4, 2, 2};
            case ')':
                return new int[]{3, 3, 3, 4, 2, 2};
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '+':
            case 171:
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                return new int[]{1, 1, 2, 2, 3, 2};
            case '-':
                return new int[]{2, 0, 2, 2, 3, 1};
            case '.':
                return new int[]{2, 2, 4, 2, 2, 2};
            case '/':
                return new int[]{2, 2, 4, 4, 2, 2};
            case '0':
            case 168:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '1':
                return new int[]{2, 3, 1, 0, 2, 2};
            case '2':
                return new int[]{2, 2, 0, 0, 2, 2};
            case '4':
                return new int[]{1, 0, 0, 0, 1, 2};
            case '6':
                return new int[]{0, 0, 2, 2, 1, 2};
            case '7':
                return new int[]{4, 1, 4, 4, 2, 2};
            case '8':
                return new int[]{0, 0, 1, 0, 0, 2};
            case ':':
            case 'j':
                return new int[]{3, 4, 4, 4, 2, 2};
            case '<':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '=':
            case '~':
            case 128:
            case 146:
                return new int[]{0, 0, 0, 0, 2, 2};
            case '>':
                return new int[]{3, 4, 2, 3, 2, 2};
            case '@':
            case '`':
                return new int[]{0, 1, 1, 1, 2, 2};
            case TokenParametersOuterClass$TokenParameters.MOCKRESPONSEID_FIELD_NUMBER /* 65 */:
                return new int[]{4, 4, 3, 1, 2, 2};
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                return new int[]{0, 0, 0, 1, 0, 2};
            case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                return new int[]{3, 1, 3, 3, 2, 2};
            case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
            case 'r':
            case 130:
            case 152:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                return new int[]{3, 2, 4, 2, 2, 2};
            case TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER /* 71 */:
                return new int[]{1, 1, 2, 1, 1, 1};
            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                return new int[]{2, 3, 1, 1, 2, 2};
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                return new int[]{0, 0, 1, 1, 2, 3};
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                return new int[]{1, 1, 1, 3, 2, 2};
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
            case 'S':
            case 143:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'N':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'Q':
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'R':
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'T':
                return new int[]{4, 2, 3, 4, 2, 2};
            case 'U':
            case '\\':
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case TPAT_RETRY_FAILED_VALUE:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 'V':
                return new int[]{2, 3, 2, 1, 2, 2};
            case 'X':
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '[':
            case 170:
            case 197:
                return new int[]{3, 2, 3, 3, 2, 2};
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                return new int[]{0, 0, 0, 1, 3, 2};
            case '_':
                return new int[]{3, 2, 3, 3, 3, 2};
            case 'a':
                return new int[]{1, 1, 2, 3, 4, 2};
            case 'b':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'c':
                return new int[]{1, 1, 3, 2, 4, 3};
            case 'e':
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 'f':
                return new int[]{3, 0, 1, 1, 3, 0};
            case 'h':
                return new int[]{0, 1, 0, 1, 1, 2};
            case 'i':
                return new int[]{3, 2, 1, 2, 2, 2};
            case 'k':
            case OMSDK_JS_WRITE_FAILED_VALUE:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 'l':
                return new int[]{0, 1, 0, 1, 1, 1};
            case 'm':
                return new int[]{3, 3, 2, 2, 2, 2};
            case 'n':
                return new int[]{2, 1, 1, 1, 2, 2};
            case 'o':
                return new int[]{1, 1, 4, 2, 2, 2};
            case 'p':
            case 'q':
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 's':
                return new int[]{0, 0, 1, 3, 4, 4};
            case 't':
                return new int[]{1, 1, 0, 0, 0, 2};
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                return new int[]{1, 1, 2, 2, 2, 2};
            case JSON_ENCODE_ERROR_VALUE:
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                return new int[]{2, 2, 1, 2, 2, 2};
            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                return new int[]{3, 2, 1, 4, 2, 2};
            case INVALID_RI_ENDPOINT_VALUE:
                return new int[]{3, 1, 3, 4, 4, 2};
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                return new int[]{3, 4, 4, 3, 2, 2};
            case INVALID_METRICS_ENDPOINT_VALUE:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case MRAID_JS_WRITE_FAILED_VALUE:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 134:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 135:
                return new int[]{3, 4, 2, 2, 2, 2};
            case PRIVACY_URL_ERROR_VALUE:
                return new int[]{3, 2, 2, 4, 2, 2};
            case 138:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 139:
                return new int[]{2, 4, 3, 3, 2, 2};
            case 140:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 144:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 148:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 149:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case 157:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 160:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case 173:
                return new int[]{2, 3, 2, 2, 3, 3};
            case 174:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{0, 1, 0, 0, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case 179:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case 184:
            case 212:
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 186:
                return new int[]{4, 3, 0, 2, 2, 2};
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new int[]{1, 1, 2, 3, 1, 4};
            case 194:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case 205:
                return new int[]{2, 2, 1, 0, 2, 2};
            case 204:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 207:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 208:
                return new int[]{0, 3, 2, 3, 3, 0};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE:
                return new int[]{4, 2, 4, 2, 2, 2};
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                return new int[]{4, 2, 3, 3, 2, 2};
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
                return new int[]{1, 1, 0, 1, 2, 2};
            case AD_RESPONSE_EMPTY_VALUE:
                return new int[]{1, 4, 1, 1, 2, 2};
            case AD_RESPONSE_TIMED_OUT_VALUE:
                return new int[]{0, 0, 0, 0, 0, 0};
            case MRAID_JS_COPY_FAILED_VALUE:
                return new int[]{0, 3, 1, 1, 2, 2};
            case STALE_CACHED_RESPONSE_VALUE:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 227:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 228:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 229:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 232:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 234:
                return new int[]{4, 1, 1, 1, 2, 2};
            case 235:
                return new int[]{3, 3, 1, 1, 1, 2};
            case 236:
                return new int[]{3, 3, 4, 2, 2, 2};
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // io.odeeo.internal.p0.d
    public b0 getTransferListener() {
        return this;
    }

    @Override // io.odeeo.internal.p0.b0
    public void onTransferInitializing(i iVar, m mVar, boolean z10) {
    }
}
