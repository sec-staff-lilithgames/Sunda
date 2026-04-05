package rt;

import iu.h;
import java.util.concurrent.TimeUnit;
import mt.l;
import ou.j;
import pt.c;
import st.g;
import ut.m0;
import ut.o0;
import yt.k9;
import yt.m8;
import yt.p8;
import yt.q8;
import yt.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends l {
    public l autoConnect() {
        return autoConnect(1);
    }

    public final c connect() {
        h hVar = new h();
        connect(hVar);
        return hVar.f68408b;
    }

    public abstract void connect(g gVar);

    /* JADX WARN: Multi-variable type inference failed */
    public l refCount() {
        a aVarOnAssembly;
        if (this instanceof q8) {
            m8 m8Var = (m8) ((q8) this);
            aVarOnAssembly = mu.a.onAssembly((a) new p8(m8Var.publishSource(), m8Var.publishBufferSize()));
        } else {
            aVarOnAssembly = this;
        }
        return mu.a.onAssembly(new k9(aVarOnAssembly));
    }

    public l autoConnect(int i10) {
        return autoConnect(i10, m0.emptyConsumer());
    }

    public l autoConnect(int i10, g gVar) {
        if (i10 <= 0) {
            connect(gVar);
            return mu.a.onAssembly(this);
        }
        return mu.a.onAssembly(new w(this, i10, gVar));
    }

    public final l refCount(int i10) {
        return refCount(i10, 0L, TimeUnit.NANOSECONDS, j.trampoline());
    }

    public final l refCount(long j10, TimeUnit timeUnit) {
        return refCount(1, j10, timeUnit, j.computation());
    }

    public final l refCount(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return refCount(1, j10, timeUnit, m0Var);
    }

    public final l refCount(int i10, long j10, TimeUnit timeUnit) {
        return refCount(i10, j10, timeUnit, j.computation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l refCount(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        a aVarOnAssembly;
        o0.verifyPositive(i10, "subscriberCount");
        o0.requireNonNull(timeUnit, "unit is null");
        o0.requireNonNull(m0Var, "scheduler is null");
        if (this instanceof q8) {
            m8 m8Var = (m8) ((q8) this);
            aVarOnAssembly = mu.a.onAssembly((a) new p8(m8Var.publishSource(), m8Var.publishBufferSize()));
        } else {
            aVarOnAssembly = this;
        }
        return mu.a.onAssembly(new k9(aVarOnAssembly, i10, j10, timeUnit, m0Var));
    }
}
