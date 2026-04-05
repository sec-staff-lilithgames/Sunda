package xr;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.p4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final p4.b f93291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d4 f93292c;

    public z3(d4 d4Var, p4.b bVar) {
        this.f93292c = d4Var;
        this.f93291b = (p4.b) mh.p1.checkNotNull(bVar, "savedListener");
    }

    @Override // java.lang.Runnable
    public void run() {
        y3 y3Var;
        wr.f1 f1Var;
        wr.r4 r4VarNewBuilder;
        p4.b bVar = this.f93291b;
        d4 d4Var = this.f93292c;
        String str = d4Var.f92393f;
        wr.u6 u6Var = d4Var.f92397j;
        Logger logger = d4.f92381s;
        Level level = Level.FINER;
        if (logger.isLoggable(level)) {
            logger.finer("Attempting DNS resolution of " + str);
        }
        androidx.appcompat.app.i1 i1VarA = null;
        try {
            try {
                wr.f5 f5VarProxyFor = d4Var.f92388a.proxyFor(InetSocketAddress.createUnresolved(str, d4Var.f92394g));
                f1Var = f5VarProxyFor != null ? new wr.f1(f5VarProxyFor) : null;
                r4VarNewBuilder = wr.s4.newBuilder();
            } catch (IOException e10) {
                bVar.onError(wr.m6.f91047o.withDescription("Unable to resolve host " + str).withCause(e10));
                y3Var = new y3(this, 0 != 0 && ((wr.m6) i1VarA.f4754a) == null);
            }
            if (f1Var != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Using proxy address " + f1Var);
                }
                r4VarNewBuilder.setAddresses(Collections.singletonList(f1Var));
            } else {
                i1VarA = d4Var.a();
                wr.m6 m6Var = (wr.m6) i1VarA.f4754a;
                if (m6Var != null) {
                    bVar.onError(m6Var);
                    y3Var = new y3(this, ((wr.m6) i1VarA.f4754a) == null);
                    u6Var.execute(y3Var);
                } else {
                    List<wr.f1> list = (List) i1VarA.f4755b;
                    if (list != null) {
                        r4VarNewBuilder.setAddresses(list);
                    }
                    wr.o4 o4Var = (wr.o4) i1VarA.f4756c;
                    if (o4Var != null) {
                        r4VarNewBuilder.setServiceConfig(o4Var);
                    }
                }
            }
            bVar.onResult(r4VarNewBuilder.build());
            y3Var = new y3(this, i1VarA != null && ((wr.m6) i1VarA.f4754a) == null);
            u6Var.execute(y3Var);
        } catch (Throwable th2) {
            u6Var.execute(new y3(this, 0 != 0 && ((wr.m6) i1VarA.f4754a) == null));
            throw th2;
        }
    }
}
