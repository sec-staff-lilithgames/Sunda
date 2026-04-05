package io.odeeo.internal.j1;

import ao.kwoC.zAQQWzBxnS;
import com.mbridge.msdk.foundation.download.Command;
import io.bidmachine.protobuf.EventTypeExtended;
import io.odeeo.internal.v1.r;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.e0;
import xv.h0;
import xv.i0;
import xv.j0;
import xv.n0;
import xv.v0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f64378a = new c();

    @Override // xv.i0
    public v0 intercept(h0 h0Var) {
        e0.checkNotNullParameter(h0Var, zAQQWzBxnS.zXNAfEFigeXZqO);
        try {
            v0 v0VarProceed = h0Var.proceed(h0Var.request().newBuilder().header(Command.HTTP_HEADER_USER_AGENT, r.f67288a.getUserAgentString()).build());
            e0.checkNotNullExpressionValue(v0VarProceed, "{\n            chain.proc…)\n            )\n        }");
            return v0VarProceed;
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.w(e10, "Unknown error", new Object[0]);
            v0 v0VarBuild = new v0.a().request(h0Var.request()).protocol(n0.f93760f).code(e10 instanceof SocketException ? true : e10 instanceof UnknownHostException ? true : e10 instanceof IOException ? EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE : 900).message("").body(w0.create((j0) null, "{}")).build();
            e0.checkNotNullExpressionValue(v0VarBuild, "{\n            Timber.w(e…       .build()\n        }");
            return v0VarBuild;
        }
    }
}
