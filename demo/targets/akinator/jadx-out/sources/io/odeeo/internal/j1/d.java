package io.odeeo.internal.j1;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e0;
import sv.k0;
import xv.h0;
import xv.i0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f64379a = new AtomicLong(0);

    @Override // xv.i0
    public v0 intercept(h0 chain) throws IOException {
        e0.checkNotNullParameter(chain, "chain");
        long jIncrementAndGet = this.f64379a.incrementAndGet();
        o0 o0VarBuild = chain.request().newBuilder().build();
        io.odeeo.internal.b2.a.d("request (" + jIncrementAndGet + ") = " + o0VarBuild, new Object[0]);
        String urlPath = o0VarBuild.url().encodedPath();
        e0.checkNotNullExpressionValue(urlPath, "urlPath");
        if (k0.endsWith$default(urlPath, "v2/initialize", false, 2, null) || k0.endsWith$default(urlPath, "v2/bidrequest", false, 2, null)) {
            String strQueryParameter = o0VarBuild.url().queryParameter("request_id");
            if (strQueryParameter == null) {
                strQueryParameter = o0VarBuild.url().queryParameter("id");
            }
            io.odeeo.internal.b2.a.i(e0.stringPlus("Request ID: ", strQueryParameter), new Object[0]);
        }
        v0 response = chain.proceed(o0VarBuild);
        io.odeeo.internal.b2.a.i("response (" + jIncrementAndGet + ") = " + response, new Object[0]);
        e0.checkNotNullExpressionValue(response, "response");
        return response;
    }
}
