package yr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public final lt.b f94837c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f94838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(fVar);
        this.f94838e = fVar;
        this.f94837c = lt.c.linkOut();
    }

    @Override // yr.e
    public void doRun() throws IOException {
        f fVar;
        pw.g gVar = new pw.g();
        lt.f fVarTraceTask = lt.c.traceTask("WriteRunnable.runFlush");
        try {
            lt.c.linkIn(this.f94837c);
            synchronized (this.f94838e.f94887b) {
                pw.g gVar2 = this.f94838e.f94888c;
                gVar.write(gVar2, gVar2.size());
                fVar = this.f94838e;
                fVar.f94893i = false;
            }
            fVar.f94895k.write(gVar, gVar.size());
            this.f94838e.f94895k.flush();
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
