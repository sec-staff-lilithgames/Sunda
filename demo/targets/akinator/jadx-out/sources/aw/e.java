package aw;

import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;
import xv.f0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f8243c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final o0 f8244a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f8245b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean isCacheable(xv.v0 r5, xv.o0 r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "request"
                kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
                int r0 = r5.code()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                java.lang.String r0 = "Expires"
                r1 = 2
                r3 = 0
                java.lang.String r0 = xv.v0.header$default(r5, r0, r3, r1, r3)
                if (r0 != 0) goto L65
                xv.h r0 = r5.cacheControl()
                int r0 = r0.maxAgeSeconds()
                r1 = -1
                if (r0 != r1) goto L65
                xv.h r0 = r5.cacheControl()
                boolean r0 = r0.isPublic()
                if (r0 != 0) goto L65
                xv.h r0 = r5.cacheControl()
                boolean r0 = r0.isPrivate()
                if (r0 != 0) goto L65
                return r2
            L65:
                xv.h r5 = r5.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7b
                xv.h r5 = r6.cacheControl()
                boolean r5 = r5.noStore()
                if (r5 != 0) goto L7b
                r5 = 1
                return r5
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: aw.e.a.isCacheable(xv.v0, xv.o0):boolean");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f8246a;

        /* renamed from: b, reason: collision with root package name */
        public final o0 f8247b;

        /* renamed from: c, reason: collision with root package name */
        public final v0 f8248c;

        /* renamed from: d, reason: collision with root package name */
        public final Date f8249d;

        /* renamed from: e, reason: collision with root package name */
        public final String f8250e;

        /* renamed from: f, reason: collision with root package name */
        public final Date f8251f;

        /* renamed from: g, reason: collision with root package name */
        public final String f8252g;

        /* renamed from: h, reason: collision with root package name */
        public final Date f8253h;

        /* renamed from: i, reason: collision with root package name */
        public final long f8254i;

        /* renamed from: j, reason: collision with root package name */
        public final long f8255j;

        /* renamed from: k, reason: collision with root package name */
        public final String f8256k;

        /* renamed from: l, reason: collision with root package name */
        public final int f8257l;

        public b(long j10, o0 request, v0 v0Var) {
            e0.checkNotNullParameter(request, "request");
            this.f8246a = j10;
            this.f8247b = request;
            this.f8248c = v0Var;
            this.f8257l = -1;
            if (v0Var != null) {
                this.f8254i = v0Var.sentRequestAtMillis();
                this.f8255j = v0Var.receivedResponseAtMillis();
                f0 f0VarHeaders = v0Var.headers();
                int size = f0VarHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strName = f0VarHeaders.name(i10);
                    String strValue = f0VarHeaders.value(i10);
                    if (k0.equals(strName, "Date", true)) {
                        this.f8249d = dw.e.toHttpDateOrNull(strValue);
                        this.f8250e = strValue;
                    } else if (k0.equals(strName, "Expires", true)) {
                        this.f8253h = dw.e.toHttpDateOrNull(strValue);
                    } else if (k0.equals(strName, "Last-Modified", true)) {
                        this.f8251f = dw.e.toHttpDateOrNull(strValue);
                        this.f8252g = strValue;
                    } else if (k0.equals(strName, Command.HTTP_HEADER_ETAG, true)) {
                        this.f8256k = strValue;
                    } else if (k0.equals(strName, "Age", true)) {
                        this.f8257l = yv.h.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
        /* JADX WARN: Type inference failed for: r4v20 */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Type inference failed for: r4v28 */
        /* JADX WARN: Type inference failed for: r4v36, types: [xv.o0, xv.v0] */
        /* JADX WARN: Type inference failed for: r4v37 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final aw.e compute() {
            /*
                Method dump skipped, instructions count: 476
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: aw.e.b.compute():aw.e");
        }

        public final o0 getRequest$okhttp() {
            return this.f8247b;
        }
    }

    public e(o0 o0Var, v0 v0Var) {
        this.f8244a = o0Var;
        this.f8245b = v0Var;
    }

    public final v0 getCacheResponse() {
        return this.f8245b;
    }

    public final o0 getNetworkRequest() {
        return this.f8244a;
    }
}
