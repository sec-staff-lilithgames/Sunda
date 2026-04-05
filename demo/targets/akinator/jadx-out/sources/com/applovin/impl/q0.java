package com.applovin.impl;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y3;
import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.Me;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.ui.AdActivity;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class q0 {

    /* renamed from: e, reason: collision with root package name */
    private static final List f15100e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f15101a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f15102b;

    /* renamed from: c, reason: collision with root package name */
    private final y3 f15103c;

    /* renamed from: d, reason: collision with root package name */
    private d f15104d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f15105a;

        /* renamed from: b, reason: collision with root package name */
        private long f15106b;

        public long a() {
            return this.f15105a;
        }

        public long b() {
            return this.f15106b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f15105a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f15106b = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements w3.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15107a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f15108b;

        /* renamed from: c, reason: collision with root package name */
        private final String f15109c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f15110d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f15111e;

        /* renamed from: f, reason: collision with root package name */
        private final b f15112f;

        /* renamed from: g, reason: collision with root package name */
        private final e f15113g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // w3.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(y3.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f15113g.a(this.f15107a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f15112f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    q0.this.a(this.f15109c, this.f15107a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (k7.h(com.applovin.impl.sdk.k.o()) && (!this.f15111e || s4.b(bArrD) != s4.a.V2)) {
                                        q0.this.f15101a.u().a(bArrD != null ? new String(dVar.d(), Charset.forName(C.UTF8_NAME)) : "", this.f15107a, this.f15108b.b() != null ? this.f15108b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f15113g.a(this.f15107a, this.f15110d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName(C.UTF8_NAME));
                                    b bVar2 = this.f15112f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f15108b.r()) {
                                            q0.this.f15104d = new d(this.f15108b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f15111e) {
                                        String strB = s4.b(bArrD, q0.this.f15101a.j0(), q0.this.f15101a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put(AdActivity.REQUEST_KEY_EXTRA, StringUtils.getHostAndPath(this.f15107a));
                                            map.put(Me.f34938n, str);
                                            q0.this.f15101a.G().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f15113g.a(this.f15107a, q0.this.a(str, this.f15110d), iC);
                                        return;
                                    } catch (Throwable th2) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f15107a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                                        com.applovin.impl.sdk.o unused = q0.this.f15102b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            q0.this.f15102b.a("ConnectionManager", str2, th2);
                                        }
                                        q0.this.f15101a.E().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f15107a)));
                                        this.f15113g.a(this.f15107a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e10) {
                                    e = e10;
                                }
                            } catch (MalformedURLException e11) {
                                malformedURLException = e11;
                                iC = i10;
                            }
                        } else {
                            try {
                                q0.this.a(this.f15109c, this.f15107a, iC, jE, (Throwable) null);
                                this.f15113g.a(this.f15107a, iC, null, null);
                                return;
                            } catch (MalformedURLException e12) {
                                e = e12;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e13) {
                        e = e13;
                    }
                    malformedURLException = e;
                } catch (MalformedURLException e14) {
                    malformedURLException = e14;
                    iC = 0;
                }
                MalformedURLException malformedURLException2 = malformedURLException;
                if (this.f15110d != null) {
                    q0.this.a(this.f15109c, this.f15107a, iC, jE, malformedURLException2);
                    this.f15113g.a(this.f15107a, -901, malformedURLException2.getMessage(), null);
                } else {
                    q0.this.a(this.f15109c, this.f15107a, iC, jE);
                    this.f15113g.a(this.f15107a, this.f15110d, -901);
                }
            } catch (Throwable th3) {
                int iB = dVar.b();
                try {
                    byte[] bArrF = dVar.f();
                    String str3 = new String(bArrF);
                    if (bArrF != null) {
                        if (this.f15111e) {
                            str3 = s4.b(bArrF, q0.this.f15101a.j0(), q0.this.f15101a);
                        }
                        objA = q0.this.a(str3, this.f15110d);
                    }
                } catch (Throwable unused2) {
                }
                q0.this.a(this.f15109c, this.f15107a, iB, jE, th3);
                this.f15113g.a(this.f15107a, iB, th3.getMessage(), objA);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f15107a = str;
            this.f15108b = aVar;
            this.f15109c = str2;
            this.f15110d = obj;
            this.f15111e = z10;
            this.f15112f = bVar;
            this.f15113g = eVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final long f15115a = System.currentTimeMillis();

        /* renamed from: b, reason: collision with root package name */
        private final String f15116b;

        /* renamed from: c, reason: collision with root package name */
        private final long f15117c;

        /* renamed from: d, reason: collision with root package name */
        private final long f15118d;

        public d(String str, long j10, long j11) {
            this.f15116b = str;
            this.f15117c = j10;
            this.f15118d = j11;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f15117c;
        }

        public long c() {
            return this.f15115a;
        }

        public String d() {
            return this.f15116b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f15118d;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public q0(com.applovin.impl.sdk.k kVar) {
        this.f15101a = kVar;
        this.f15102b = kVar.O();
        y3 y3Var = new y3(kVar);
        this.f15103c = y3Var;
        y3Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:39:0x0105, B:43:0x012c, B:42:0x0128, B:50:0x0166, B:52:0x017e, B:58:0x01a0, B:73:0x01f2, B:76:0x0201, B:78:0x020c, B:60:0x01a4, B:63:0x01ac, B:68:0x01c3, B:70:0x01c9, B:71:0x01de, B:54:0x018d, B:81:0x0215, B:65:0x01bd), top: B:111:0x0105, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.applovin.impl.sdk.network.a r20, com.applovin.impl.q0.b r21, com.applovin.impl.q0.e r22) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q0.a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    public d a() {
        return this.f15104d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof m8) {
                return n8.a(str, this.f15101a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f15102b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f15102b;
            StringBuilder sbR = a.b.r(i10, "Successful ", str, " returned ", " in ");
            sbR.append(j10 / 1000.0f);
            sbR.append(" s over ");
            sbR.append(r0.g(this.f15101a));
            sbR.append(" to ");
            sbR.append(a(str2));
            oVar.d("ConnectionManager", sbR.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f15102b;
            StringBuilder sbR = a.b.r(i10, "Failed ", str, " returned ", " in ");
            sbR.append(j10 / 1000.0f);
            sbR.append(" s over ");
            sbR.append(r0.g(this.f15101a));
            sbR.append(" to ");
            sbR.append(a(str2));
            oVar.a("ConnectionManager", sbR.toString(), th2);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
