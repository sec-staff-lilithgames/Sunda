package io.ktor.utils.io.jvm.javaio;

import av.b;
import av.e;
import bv.h;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.EventLoopKt;
import kotlinx.coroutines.Job;
import kv.l;
import tu.a0;
import tu.t;
import tu.x0;
import tu.z;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
abstract class BlockingAdapter {
    static final /* synthetic */ AtomicReferenceFieldUpdater state$FU = AtomicReferenceFieldUpdater.newUpdater(BlockingAdapter.class, Object.class, "state");
    private final DisposableHandle disposable;
    private final d<x0> end;
    private int length;
    private int offset;
    private final Job parent;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private static /* synthetic */ void getState$annotations() {
    }

    private final void parkingLoop(Thread thread) {
        if (this.state != thread) {
            return;
        }
        if (!PollersKt.isParkingAllowed()) {
            BlockingKt.getADAPTER_LOGGER().warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
        }
        while (true) {
            long jProcessNextEventInCurrentThread = EventLoopKt.processNextEventInCurrentThread();
            if (this.state != thread) {
                return;
            }
            if (jProcessNextEventInCurrentThread > 0) {
                PollersKt.getParkingImpl().park(jProcessNextEventInCurrentThread);
            }
        }
    }

    private final Object rendezvous$$forInline(int i10, d<Object> dVar) {
        this.result = i10;
        b0.mark(0);
        Object objRendezvousBlock = rendezvousBlock(dVar);
        if (objRendezvousBlock == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        b0.mark(1);
        return objRendezvousBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object rendezvousBlock(d<Object> dVar) {
        Object obj;
        d dVarIntercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                dVarIntercepted = b.intercepted(dVar);
                obj = obj3;
            } else {
                if (!e0.areEqual(obj3, this)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                dVarIntercepted = b.intercepted(dVar);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, dVarIntercepted)) {
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    break;
                }
            }
            if (obj != null) {
                PollersKt.getParkingImpl().unpark(obj);
            }
            return e.getCOROUTINE_SUSPENDED();
            obj2 = obj;
        }
    }

    public final void finish(int i10) {
        this.result = i10;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final Job getParent() {
        return this.parent;
    }

    public abstract Object loop(d<? super x0> dVar);

    public final Object rendezvous(int i10, d<Object> dVar) {
        this.result = i10;
        Object objRendezvousBlock = rendezvousBlock(dVar);
        if (objRendezvousBlock == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objRendezvousBlock;
    }

    public final void shutdown() {
        DisposableHandle disposableHandle = this.disposable;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        d<x0> dVar = this.end;
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(new CancellationException("Stream closed"))));
    }

    public final int submitAndAwait(byte[] bArr, int i10, int i11) {
        e0.checkNotNullParameter(bArr, TJzY.raQsPhAyZTVJgpa);
        this.offset = i10;
        this.length = i11;
        return submitAndAwait(bArr);
    }

    public BlockingAdapter(Job job) {
        this.parent = job;
        d<x0> dVar = new d<x0>() { // from class: io.ktor.utils.io.jvm.javaio.BlockingAdapter$end$1
            private final m context;

            {
                this.context = this.this$0.getParent() != null ? UnsafeBlockingTrampoline.INSTANCE.plus(this.this$0.getParent()) : UnsafeBlockingTrampoline.INSTANCE;
            }

            @Override // zu.d
            public m getContext() {
                return this.context;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // zu.d
            public void resumeWith(Object obj) {
                Object obj2;
                boolean z10;
                boolean z11;
                Throwable thM7134exceptionOrNullimpl;
                Job parent;
                Object objM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
                if (objM7134exceptionOrNullimpl == null) {
                    objM7134exceptionOrNullimpl = x0.f87415a;
                }
                BlockingAdapter blockingAdapter = this.this$0;
                do {
                    obj2 = blockingAdapter.state;
                    z10 = obj2 instanceof Thread;
                    if (!(z10 ? true : obj2 instanceof d ? true : e0.areEqual(obj2, this))) {
                        return;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BlockingAdapter.state$FU;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(blockingAdapter, obj2, objM7134exceptionOrNullimpl)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(blockingAdapter) != obj2) {
                            z11 = false;
                            break;
                        }
                    }
                } while (!z11);
                if (z10) {
                    PollersKt.getParkingImpl().unpark(obj2);
                } else if ((obj2 instanceof d) && (thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj)) != null) {
                    ((d) obj2).resumeWith(z.m7131constructorimpl(a0.createFailure(thM7134exceptionOrNullimpl)));
                }
                if (z.m7136isFailureimpl(obj) && !(z.m7134exceptionOrNullimpl(obj) instanceof CancellationException) && (parent = this.this$0.getParent()) != null) {
                    Job.DefaultImpls.cancel$default(parent, (CancellationException) null, 1, (Object) null);
                }
                DisposableHandle disposableHandle = this.this$0.disposable;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                }
            }
        };
        this.end = dVar;
        this.state = this;
        this.result = 0;
        this.disposable = job != null ? job.invokeOnCompletion(new BlockingAdapter$disposable$1(this)) : null;
        ((l) h1.beforeCheckcastToFunctionOfArity(new BlockingAdapter$block$1(this, null), 1)).invoke(dVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final int submitAndAwait(Object jobToken) throws Throwable {
        Object tVar;
        e0.checkNotNullParameter(jobToken, "jobToken");
        Thread thread = Thread.currentThread();
        d dVar = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof d) {
                e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                dVar = (d) obj;
                tVar = thread;
            } else {
                if (obj instanceof x0) {
                    return this.result;
                }
                if (!(obj instanceof Throwable)) {
                    if (!(obj instanceof Thread)) {
                        if (!e0.areEqual(obj, this)) {
                            tVar = new t();
                        } else {
                            throw new IllegalStateException("Not yet started");
                        }
                    } else {
                        throw new IllegalStateException("There is already thread owning adapter");
                    }
                } else {
                    throw ((Throwable) obj);
                }
            }
            e0.checkNotNullExpressionValue(tVar, "when (value) {\n         …Exception()\n            }");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            e0.checkNotNull(dVar);
            dVar.resumeWith(z.m7131constructorimpl(jobToken));
            e0.checkNotNullExpressionValue(thread, "thread");
            parkingLoop(thread);
            Object obj2 = this.state;
            if (!(obj2 instanceof Throwable)) {
                return this.result;
            }
            throw ((Throwable) obj2);
        }
    }

    public /* synthetic */ BlockingAdapter(Job job, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : job);
    }
}
