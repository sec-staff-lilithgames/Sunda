package xr;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class af extends wr.j {

    /* renamed from: g, reason: collision with root package name */
    public static final wr.m6 f92256g;

    /* renamed from: h, reason: collision with root package name */
    public static final i4 f92257h;

    /* renamed from: a, reason: collision with root package name */
    public final i6 f92258a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f92259b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f92260c;

    /* renamed from: d, reason: collision with root package name */
    public final v0 f92261d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f92262e;

    /* renamed from: f, reason: collision with root package name */
    public final xe f92263f = new xe(this);

    static {
        wr.m6 m6Var = wr.m6.f91047o;
        wr.m6 m6VarWithDescription = m6Var.withDescription("Subchannel is NOT READY");
        f92256g = m6Var.withDescription("wait-for-ready RPC is not supported on Subchannel.asChannel()");
        f92257h = new i4(m6VarWithDescription, l1.f92751f);
    }

    public af(i6 i6Var, Executor executor, ScheduledExecutorService scheduledExecutorService, v0 v0Var, AtomicReference atomicReference) {
        this.f92258a = (i6) mh.p1.checkNotNull(i6Var, "subchannel");
        this.f92259b = (Executor) mh.p1.checkNotNull(executor, "executor");
        this.f92260c = (ScheduledExecutorService) mh.p1.checkNotNull(scheduledExecutorService, "deadlineCancellationExecutor");
        this.f92261d = (v0) mh.p1.checkNotNull(v0Var, "callsTracer");
        this.f92262e = (AtomicReference) mh.p1.checkNotNull(atomicReference, "configSelector");
    }

    @Override // wr.j
    public String authority() {
        return this.f92258a.f92609b;
    }

    @Override // wr.j
    public <RequestT, ResponseT> wr.p newCall(wr.k4 k4Var, wr.i iVar) {
        Executor executor = iVar.getExecutor() == null ? this.f92259b : iVar.getExecutor();
        if (iVar.isWaitForReady()) {
            return new ze(executor);
        }
        wr.i iVarWithOption = iVar.withOption(c5.f92323r, Boolean.TRUE);
        return new j1(k4Var, executor, iVarWithOption, this.f92263f, this.f92260c, this.f92261d);
    }
}
