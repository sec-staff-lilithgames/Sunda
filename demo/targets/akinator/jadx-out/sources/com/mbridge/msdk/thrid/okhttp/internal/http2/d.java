package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3271ic;
import com.ironsource.Ib;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f43448a;

    /* renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f43449b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f43450a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f43451b;

        /* renamed from: c, reason: collision with root package name */
        private final int f43452c;

        /* renamed from: d, reason: collision with root package name */
        private int f43453d;

        /* renamed from: e, reason: collision with root package name */
        c[] f43454e;

        /* renamed from: f, reason: collision with root package name */
        int f43455f;

        /* renamed from: g, reason: collision with root package name */
        int f43456g;

        /* renamed from: h, reason: collision with root package name */
        int f43457h;

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f43453d;
            int i11 = this.f43457h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f43454e, (Object) null);
            this.f43455f = this.f43454e.length - 1;
            this.f43456g = 0;
            this.f43457h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f43448a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f43450a.add(d.f43448a[i10]);
                return;
            }
            int iA = a(i10 - d.f43448a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f43454e;
                if (iA < cVarArr.length) {
                    this.f43450a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f43450a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f43450a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f43450a);
            this.f43450a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.f43451b.f()) {
                byte b10 = this.f43451b.readByte();
                int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f43453d = iA;
                    if (iA < 0 || iA > this.f43452c) {
                        throw new IOException("Invalid dynamic table size update " + this.f43453d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        public a(int i10, int i11, s sVar) {
            this.f43450a = new ArrayList();
            this.f43454e = new c[8];
            this.f43455f = 7;
            this.f43456g = 0;
            this.f43457h = 0;
            this.f43452c = i10;
            this.f43453d = i11;
            this.f43451b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f43451b.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f43448a[i10].f43445a;
            }
            int iA = a(i10 - d.f43448a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f43454e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f43445a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f43455f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f43450a.add(cVar);
            int i11 = cVar.f43447c;
            if (i10 != -1) {
                i11 -= this.f43454e[a(i10)].f43447c;
            }
            int i12 = this.f43453d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f43457h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f43456g + 1;
                c[] cVarArr = this.f43454e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f43455f = this.f43454e.length - 1;
                    this.f43454e = cVarArr2;
                }
                int i14 = this.f43455f;
                this.f43455f = i14 - 1;
                this.f43454e[i14] = cVar;
                this.f43456g++;
            } else {
                this.f43454e[a(i10) + iB + i10] = cVar;
            }
            this.f43457h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f43454e.length;
                while (true) {
                    length--;
                    i11 = this.f43455f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f43454e[length].f43447c;
                    i10 -= i13;
                    this.f43457h -= i13;
                    this.f43456g--;
                    i12++;
                }
                c[] cVarArr = this.f43454e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f43456g);
                this.f43455f += i12;
            }
            return i12;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f43451b.c(iA)));
            }
            return this.f43451b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f43458a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f43459b;

        /* renamed from: c, reason: collision with root package name */
        private int f43460c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43461d;

        /* renamed from: e, reason: collision with root package name */
        int f43462e;

        /* renamed from: f, reason: collision with root package name */
        int f43463f;

        /* renamed from: g, reason: collision with root package name */
        c[] f43464g;

        /* renamed from: h, reason: collision with root package name */
        int f43465h;

        /* renamed from: i, reason: collision with root package name */
        int f43466i;

        /* renamed from: j, reason: collision with root package name */
        int f43467j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f43464g.length;
                while (true) {
                    length--;
                    i11 = this.f43465h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f43464g[length].f43447c;
                    i10 -= i13;
                    this.f43467j -= i13;
                    this.f43466i--;
                    i12++;
                }
                c[] cVarArr = this.f43464g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f43466i);
                c[] cVarArr2 = this.f43464g;
                int i15 = this.f43465h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f43465h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f43464g, (Object) null);
            this.f43465h = this.f43464g.length - 1;
            this.f43466i = 0;
            this.f43467j = 0;
        }

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f43460c = Integer.MAX_VALUE;
            this.f43464g = new c[8];
            this.f43465h = 7;
            this.f43466i = 0;
            this.f43467j = 0;
            this.f43462e = i10;
            this.f43463f = i10;
            this.f43459b = z10;
            this.f43458a = cVar;
        }

        public void b(int i10) {
            this.f43462e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f43463f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f43460c = Math.min(this.f43460c, iMin);
            }
            this.f43461d = true;
            this.f43463f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f43447c;
            int i11 = this.f43463f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f43467j + i10) - i11);
            int i12 = this.f43466i + 1;
            c[] cVarArr = this.f43464g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f43465h = this.f43464g.length - 1;
                this.f43464g = cVarArr2;
            }
            int i13 = this.f43465h;
            this.f43465h = i13 - 1;
            this.f43464g[i13] = cVar;
            this.f43466i++;
            this.f43467j += i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.d.b.a(java.util.List):void");
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f43458a.writeByte(i10 | i12);
                return;
            }
            this.f43458a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f43458a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f43458a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f43459b && k.b().a(fVar) < fVar.e()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.e(), 127, 128);
                this.f43458a.a(fVarO);
                return;
            }
            a(fVar.e(), 127, 0);
            this.f43458a.a(fVar);
        }

        private void a() {
            int i10 = this.f43463f;
            int i11 = this.f43467j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f43444i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f43441f;
        c cVar2 = new c(fVar, C3271ic.f36943a);
        c cVar3 = new c(fVar, C3271ic.f36944b);
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f43442g;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f43443h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, HttpRequest.DEFAULT_SCHEME);
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f43440e;
        f43448a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c(DtbConstants.PRIVACY_LOCATION_KEY, ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c(Ib.f34672a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f43449b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f43448a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f43448a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f43445a)) {
                linkedHashMap.put(cVarArr[i10].f43445a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.h());
            }
        }
        return fVar;
    }
}
