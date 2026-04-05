package ju;

import bu.a7;
import bu.d7;
import bu.e7;
import bu.t7;
import bu.w;
import iu.h;
import java.util.concurrent.TimeUnit;
import mt.b0;
import ou.j;
import pt.c;
import st.g;
import ut.m0;
import ut.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends b0 {
    public b0 autoConnect() {
        return autoConnect(1);
    }

    public final c connect() {
        h hVar = new h();
        connect(hVar);
        return hVar.f68408b;
    }

    public abstract void connect(g gVar);

    /* JADX WARN: Multi-variable type inference failed */
    public b0 refCount() {
        return mu.a.onAssembly(new t7(this instanceof e7 ? mu.a.onAssembly((a) new d7(((a7) ((e7) this)).publishSource())) : this));
    }

    public b0 autoConnect(int i10) {
        return autoConnect(i10, m0.emptyConsumer());
    }

    public b0 autoConnect(int i10, g gVar) {
        if (i10 <= 0) {
            connect(gVar);
            return mu.a.onAssembly(this);
        }
        return mu.a.onAssembly(new w(this, i10, gVar));
    }

    public final b0 refCount(int i10) {
        return refCount(i10, 0L, TimeUnit.NANOSECONDS, j.trampoline());
    }

    public final b0 refCount(long j10, TimeUnit timeUnit) {
        return refCount(1, j10, timeUnit, j.computation());
    }

    public final b0 refCount(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        return refCount(1, j10, timeUnit, m0Var);
    }

    public final b0 refCount(int i10, long j10, TimeUnit timeUnit) {
        return refCount(i10, j10, timeUnit, j.computation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 refCount(int i10, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        o0.verifyPositive(i10, "subscriberCount");
        o0.requireNonNull(timeUnit, "unit is null");
        o0.requireNonNull(m0Var, "scheduler is null");
        return mu.a.onAssembly(new t7(this instanceof e7 ? mu.a.onAssembly((a) new d7(((a7) ((e7) this)).publishSource())) : this, i10, j10, timeUnit, m0Var));
    }
}
