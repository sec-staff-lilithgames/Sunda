package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.internal.http.d;
import com.mbridge.msdk.thrid.okhttp.internal.http.e;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final w f43308a;

    /* renamed from: b, reason: collision with root package name */
    public final y f43309b;

    public b(w wVar, y yVar) {
        this.f43308a = wVar;
        this.f43309b = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.h().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.mbridge.msdk.thrid.okhttp.y r3, com.mbridge.msdk.thrid.okhttp.w r4) {
        /*
            int r0 = r3.k()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.b(r0)
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            com.mbridge.msdk.thrid.okhttp.c r3 = r3.h()
            boolean r3 = r3.i()
            if (r3 != 0) goto L70
            com.mbridge.msdk.thrid.okhttp.c r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L70
            r3 = 1
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.cache.b.a(com.mbridge.msdk.thrid.okhttp.y, com.mbridge.msdk.thrid.okhttp.w):boolean");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f43310a;

        /* renamed from: b, reason: collision with root package name */
        final w f43311b;

        /* renamed from: c, reason: collision with root package name */
        final y f43312c;

        /* renamed from: d, reason: collision with root package name */
        private Date f43313d;

        /* renamed from: e, reason: collision with root package name */
        private String f43314e;

        /* renamed from: f, reason: collision with root package name */
        private Date f43315f;

        /* renamed from: g, reason: collision with root package name */
        private String f43316g;

        /* renamed from: h, reason: collision with root package name */
        private Date f43317h;

        /* renamed from: i, reason: collision with root package name */
        private long f43318i;

        /* renamed from: j, reason: collision with root package name */
        private long f43319j;

        /* renamed from: k, reason: collision with root package name */
        private String f43320k;

        /* renamed from: l, reason: collision with root package name */
        private int f43321l;

        public a(long j10, w wVar, y yVar) {
            this.f43321l = -1;
            this.f43310a = j10;
            this.f43311b = wVar;
            this.f43312c = yVar;
            if (yVar != null) {
                this.f43318i = yVar.s();
                this.f43319j = yVar.q();
                p pVarM = yVar.m();
                int iB = pVarM.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    String strA = pVarM.a(i10);
                    String strB = pVarM.b(i10);
                    if ("Date".equalsIgnoreCase(strA)) {
                        this.f43313d = d.a(strB);
                        this.f43314e = strB;
                    } else if ("Expires".equalsIgnoreCase(strA)) {
                        this.f43317h = d.a(strB);
                    } else if ("Last-Modified".equalsIgnoreCase(strA)) {
                        this.f43315f = d.a(strB);
                        this.f43316g = strB;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(strA)) {
                        this.f43320k = strB;
                    } else if ("Age".equalsIgnoreCase(strA)) {
                        this.f43321l = e.a(strB, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f43313d;
            long jMax = date != null ? Math.max(0L, this.f43319j - date.getTime()) : 0L;
            int i10 = this.f43321l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f43319j;
            return jMax + (j10 - this.f43318i) + (this.f43310a - j10);
        }

        private long b() {
            if (this.f43312c.h().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            if (this.f43317h != null) {
                Date date = this.f43313d;
                long time = this.f43317h.getTime() - (date != null ? date.getTime() : this.f43319j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f43315f != null && this.f43312c.r().g().k() == null) {
                Date date2 = this.f43313d;
                long time2 = (date2 != null ? date2.getTime() : this.f43318i) - this.f43315f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private b d() {
            String str;
            if (this.f43312c == null) {
                return new b(this.f43311b, null);
            }
            if (this.f43311b.d() && this.f43312c.l() == null) {
                return new b(this.f43311b, null);
            }
            if (!b.a(this.f43312c, this.f43311b)) {
                return new b(this.f43311b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c cVarB = this.f43311b.b();
            if (cVarB.h() || a(this.f43311b)) {
                return new b(this.f43311b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c cVarH = this.f43312c.h();
            long jA = a();
            long jB = b();
            if (cVarB.d() != -1) {
                jB = Math.min(jB, TimeUnit.SECONDS.toMillis(cVarB.d()));
            }
            long millis = 0;
            long millis2 = cVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(cVarB.f()) : 0L;
            if (!cVarH.g() && cVarB.e() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cVarB.e());
            }
            if (!cVarH.h()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jB) {
                    y.a aVarO = this.f43312c.o();
                    if (j10 >= jB) {
                        aVarO.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && e()) {
                        aVarO.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b(null, aVarO.a());
                }
            }
            String str2 = this.f43320k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f43315f != null) {
                    str2 = this.f43316g;
                } else {
                    if (this.f43313d == null) {
                        return new b(this.f43311b, null);
                    }
                    str2 = this.f43314e;
                }
                str = "If-Modified-Since";
            }
            p.a aVarA = this.f43311b.c().a();
            com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(aVarA, str, str2);
            return new b(this.f43311b.f().a(aVarA.a()).a(), this.f43312c);
        }

        private boolean e() {
            return this.f43312c.h().d() == -1 && this.f43317h == null;
        }

        public b c() {
            b bVarD = d();
            return (bVarD.f43308a == null || !this.f43311b.b().j()) ? bVarD : new b(null, null);
        }

        private static boolean a(w wVar) {
            return (wVar.a("If-Modified-Since") == null && wVar.a("If-None-Match") == null) ? false : true;
        }
    }
}
