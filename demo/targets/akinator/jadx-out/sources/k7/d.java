package k7;

import com.mbridge.msdk.foundation.download.Command;
import java.util.Date;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import q7.n;
import sv.k0;
import xv.f0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f70644c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final o0 f70645a;

    /* renamed from: b, reason: collision with root package name */
    public final c f70646b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final o0 f70647a;

        /* renamed from: b, reason: collision with root package name */
        public final c f70648b;

        /* renamed from: c, reason: collision with root package name */
        public final Date f70649c;

        /* renamed from: d, reason: collision with root package name */
        public final String f70650d;

        /* renamed from: e, reason: collision with root package name */
        public final Date f70651e;

        /* renamed from: f, reason: collision with root package name */
        public final String f70652f;

        /* renamed from: g, reason: collision with root package name */
        public final Date f70653g;

        /* renamed from: h, reason: collision with root package name */
        public final long f70654h;

        /* renamed from: i, reason: collision with root package name */
        public final long f70655i;

        /* renamed from: j, reason: collision with root package name */
        public final String f70656j;

        /* renamed from: k, reason: collision with root package name */
        public final int f70657k;

        public b(o0 o0Var, c cVar) {
            this.f70647a = o0Var;
            this.f70648b = cVar;
            this.f70657k = -1;
            if (cVar != null) {
                this.f70654h = cVar.getSentRequestAtMillis();
                this.f70655i = cVar.getReceivedResponseAtMillis();
                f0 responseHeaders = cVar.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strName = responseHeaders.name(i10);
                    if (k0.equals(strName, "Date", true)) {
                        this.f70649c = responseHeaders.getDate("Date");
                        this.f70650d = responseHeaders.value(i10);
                    } else if (k0.equals(strName, "Expires", true)) {
                        this.f70653g = responseHeaders.getDate("Expires");
                    } else if (k0.equals(strName, "Last-Modified", true)) {
                        this.f70651e = responseHeaders.getDate("Last-Modified");
                        this.f70652f = responseHeaders.value(i10);
                    } else if (k0.equals(strName, Command.HTTP_HEADER_ETAG, true)) {
                        this.f70656j = responseHeaders.value(i10);
                    } else if (k0.equals(strName, "Age", true)) {
                        this.f70657k = n.toNonNegativeInt(responseHeaders.value(i10), -1);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final k7.d compute() {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: k7.d.b.compute():k7.d");
        }
    }

    public d(o0 o0Var, c cVar, u uVar) {
        this.f70645a = o0Var;
        this.f70646b = cVar;
    }

    public final c getCacheResponse() {
        return this.f70646b;
    }

    public final o0 getNetworkRequest() {
        return this.f70645a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static boolean a(String str) {
            return (k0.equals("Connection", str, true) || k0.equals("Keep-Alive", str, true) || k0.equals("Proxy-Authenticate", str, true) || k0.equals("Proxy-Authorization", str, true) || k0.equals("TE", str, true) || k0.equals("Trailers", str, true) || k0.equals("Transfer-Encoding", str, true) || k0.equals("Upgrade", str, true)) ? false : true;
        }

        public final f0 combineHeaders(f0 f0Var, f0 f0Var2) {
            f0.a aVar = new f0.a();
            int size = f0Var.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = f0Var.name(i10);
                String strValue = f0Var.value(i10);
                if ((!k0.equals("Warning", strName, true) || !k0.startsWith$default(strValue, "1", false, 2, null)) && (k0.equals("Content-Length", strName, true) || k0.equals("Content-Encoding", strName, true) || k0.equals("Content-Type", strName, true) || !a(strName) || f0Var2.get(strName) == null)) {
                    aVar.add(strName, strValue);
                }
            }
            int size2 = f0Var2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strName2 = f0Var2.name(i11);
                if (!k0.equals("Content-Length", strName2, true) && !k0.equals("Content-Encoding", strName2, true) && !k0.equals("Content-Type", strName2, true) && a(strName2)) {
                    aVar.add(strName2, f0Var2.value(i11));
                }
            }
            return aVar.build();
        }

        public final boolean isCacheable(o0 o0Var, v0 v0Var) {
            return (o0Var.cacheControl().noStore() || v0Var.cacheControl().noStore() || e0.areEqual(v0Var.headers().get("Vary"), "*")) ? false : true;
        }

        public final boolean isCacheable(o0 o0Var, c cVar) {
            return (o0Var.cacheControl().noStore() || cVar.getCacheControl().noStore() || e0.areEqual(cVar.getResponseHeaders().get("Vary"), "*")) ? false : true;
        }
    }
}
