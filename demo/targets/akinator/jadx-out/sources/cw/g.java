package cw;

import java.io.IOException;
import xv.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51143a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final f f51144b = new f();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final g getNONE() {
            return g.f51144b;
        }
    }

    public void connectEnd(xv.p connection, y0 route, xv.j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void connectFailed(y0 route, xv.j call, IOException failure) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.e0.checkNotNullParameter(failure, "failure");
    }

    public void connectStart(y0 route, xv.j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void connectionAcquired(xv.p connection, xv.j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void connectionClosed(xv.p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(xv.p connection, xv.j call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
    }

    public void noNewExchanges(xv.p connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
    }
}
