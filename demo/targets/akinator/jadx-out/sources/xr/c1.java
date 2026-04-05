package xr;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92299c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve f92300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1 f92301f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, lt.b bVar, ve veVar) {
        super(f1Var.f92493c.f92679f);
        this.f92301f = f1Var;
        this.f92299c = bVar;
        this.f92300e = veVar;
    }

    public final void a() throws IOException {
        f1 f1Var = this.f92301f;
        j1 j1Var = f1Var.f92493c;
        wr.m6 m6Var = f1Var.f92492b;
        ve veVar = this.f92300e;
        if (m6Var != null) {
            Logger logger = c5.f92306a;
            while (true) {
                InputStream next = veVar.next();
                if (next == null) {
                    return;
                } else {
                    c5.closeQuietly(next);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream next2 = veVar.next();
                    if (next2 == null) {
                        return;
                    }
                    try {
                        f1Var.f92491a.onMessage(j1Var.f92674a.parseResponse(next2));
                        next2.close();
                    } catch (Throwable th2) {
                        c5.closeQuietly(next2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Logger logger2 = c5.f92306a;
                    while (true) {
                        InputStream next3 = veVar.next();
                        if (next3 == null) {
                            wr.m6 m6VarWithDescription = wr.m6.f91038f.withCause(th3).withDescription("Failed to read message.");
                            f1Var.f92492b = m6VarWithDescription;
                            j1Var.f92683j.cancel(m6VarWithDescription);
                            return;
                        }
                        c5.closeQuietly(next3);
                    }
                }
            }
        }
    }

    @Override // xr.c2
    public void runInContext() {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall$Listener.messagesAvailable");
        try {
            lt.c.attachTag(this.f92301f.f92493c.f92675b);
            lt.c.linkIn(this.f92299c);
            a();
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
