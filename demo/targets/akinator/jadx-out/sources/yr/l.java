package yr;

import com.ironsource.C3271ic;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import mh.p1;
import wr.e4;
import wr.p2;
import wr.z3;
import xr.c5;
import xr.df;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final as.e f94955a;

    /* renamed from: b, reason: collision with root package name */
    public static final as.e f94956b;

    /* renamed from: c, reason: collision with root package name */
    public static final as.e f94957c;

    /* renamed from: d, reason: collision with root package name */
    public static final as.e f94958d;

    /* renamed from: e, reason: collision with root package name */
    public static final as.e f94959e;

    /* renamed from: f, reason: collision with root package name */
    public static final as.e f94960f;

    static {
        pw.l lVar = as.e.f7944g;
        f94955a = new as.e(lVar, HttpRequest.DEFAULT_SCHEME);
        f94956b = new as.e(lVar, "http");
        pw.l lVar2 = as.e.f7942e;
        f94957c = new as.e(lVar2, C3271ic.f36944b);
        f94958d = new as.e(lVar2, C3271ic.f36943a);
        f94959e = new as.e(c5.f92315j.name(), "application/grpc");
        f94960f = new as.e("te", "trailers");
    }

    public static void a(ArrayList arrayList, e4 e4Var) {
        byte[][] http2Headers = df.toHttp2Headers(e4Var);
        for (int i10 = 0; i10 < http2Headers.length; i10 += 2) {
            pw.l lVarOf = pw.l.of(http2Headers[i10]);
            if (lVarOf.size() != 0 && lVarOf.getByte(0) != 58) {
                arrayList.add(new as.e(lVarOf, pw.l.of(http2Headers[i10 + 1])));
            }
        }
    }

    public static List<as.e> createHttpResponseHeaders(int i10, String str, e4 e4Var) {
        ArrayList arrayList = new ArrayList(p2.headerCount(e4Var) + 2);
        arrayList.add(new as.e(as.e.f7941d, a.b.e(i10, "")));
        arrayList.add(new as.e(c5.f92315j.name(), str));
        a(arrayList, e4Var);
        return arrayList;
    }

    public static List<as.e> createRequestHeaders(e4 e4Var, String str, String str2, String str3, boolean z10, boolean z11) {
        p1.checkNotNull(e4Var, "headers");
        p1.checkNotNull(str, "defaultPath");
        p1.checkNotNull(str2, "authority");
        e4Var.discardAll(c5.f92315j);
        e4Var.discardAll(c5.f92316k);
        z3 z3Var = c5.f92317l;
        e4Var.discardAll(z3Var);
        ArrayList arrayList = new ArrayList(p2.headerCount(e4Var) + 7);
        if (z11) {
            arrayList.add(f94956b);
        } else {
            arrayList.add(f94955a);
        }
        if (z10) {
            arrayList.add(f94958d);
        } else {
            arrayList.add(f94957c);
        }
        arrayList.add(new as.e(as.e.f7945h, str2));
        arrayList.add(new as.e(as.e.f7943f, str));
        arrayList.add(new as.e(z3Var.name(), str3));
        arrayList.add(f94959e);
        arrayList.add(f94960f);
        a(arrayList, e4Var);
        return arrayList;
    }

    public static List<as.e> createResponseHeaders(e4 e4Var) {
        e4Var.discardAll(c5.f92315j);
        e4Var.discardAll(c5.f92316k);
        e4Var.discardAll(c5.f92317l);
        ArrayList arrayList = new ArrayList(p2.headerCount(e4Var) + 2);
        arrayList.add(new as.e(as.e.f7941d, "200"));
        arrayList.add(f94959e);
        a(arrayList, e4Var);
        return arrayList;
    }

    public static List<as.e> createResponseTrailers(e4 e4Var, boolean z10) {
        if (!z10) {
            return createResponseHeaders(e4Var);
        }
        e4Var.discardAll(c5.f92315j);
        e4Var.discardAll(c5.f92316k);
        e4Var.discardAll(c5.f92317l);
        ArrayList arrayList = new ArrayList(p2.headerCount(e4Var));
        a(arrayList, e4Var);
        return arrayList;
    }
}
