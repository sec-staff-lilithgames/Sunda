package io.odeeo.internal.v1;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> io.odeeo.internal.a.c<io.odeeo.internal.y1.r<T>, Exception> transformNetworkErrors(io.odeeo.internal.a.c<io.odeeo.internal.y1.r<T>, ? extends Exception> cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof io.odeeo.internal.a.b) {
            int iCode = ((io.odeeo.internal.y1.r) ((io.odeeo.internal.a.b) cVar).getValue()).code();
            return iCode != 900 ? iCode != 901 ? cVar : new io.odeeo.internal.a.a(new IOException()) : new io.odeeo.internal.a.a(new Exception());
        }
        if (cVar instanceof io.odeeo.internal.a.a) {
            return cVar;
        }
        throw new t();
    }

    public static final <T> io.odeeo.internal.a.c<T, Exception> tryResult(kv.a func) {
        e0.checkNotNullParameter(func, "func");
        try {
            return new io.odeeo.internal.a.b(func.invoke());
        } catch (Exception e10) {
            return new io.odeeo.internal.a.a(e10);
        }
    }
}
