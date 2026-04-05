package dw;

import com.ironsource.C3271ic;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f52915a = new j();

    public static final boolean invalidatesCache(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, C3271ic.f36944b) || e0.areEqual(method, "PATCH") || e0.areEqual(method, "PUT") || e0.areEqual(method, "DELETE") || e0.areEqual(method, "MOVE");
    }

    public static final boolean permitsRequestBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return (e0.areEqual(method, C3271ic.f36943a) || e0.areEqual(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, C3271ic.f36944b) || e0.areEqual(method, "PUT") || e0.areEqual(method, "PATCH") || e0.areEqual(method, "PROPPATCH") || e0.areEqual(method, "REPORT");
    }

    public final boolean redirectsToGet(String method) {
        e0.checkNotNullParameter(method, "method");
        return !e0.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        e0.checkNotNullParameter(method, "method");
        return e0.areEqual(method, "PROPFIND");
    }
}
