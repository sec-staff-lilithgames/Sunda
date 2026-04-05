package yr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final lt.b f94831c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f94832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        super(fVar);
        this.f94832e = fVar;
        this.f94831c = lt.c.linkOut();
    }

    @Override // yr.e
    public void doRun() throws IOException {
        f fVar;
        int i10;
        pw.g gVar = new pw.g();
        lt.f fVarTraceTask = lt.c.traceTask("WriteRunnable.runWrite");
        try {
            lt.c.linkIn(this.f94831c);
            synchronized (this.f94832e.f94887b) {
                pw.g gVar2 = this.f94832e.f94888c;
                gVar.write(gVar2, gVar2.completeSegmentByteCount());
                fVar = this.f94832e;
                fVar.f94892h = false;
                i10 = fVar.f94899o;
            }
            fVar.f94895k.write(gVar, gVar.size());
            synchronized (this.f94832e.f94887b) {
                this.f94832e.f94899o -= i10;
            }
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
