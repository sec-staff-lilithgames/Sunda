package p0;

import b1.m;
import b1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 extends f0 {
    public static final a C = new a(null);
    public static final MutableStateFlow D = StateFlowKt.MutableStateFlow(s0.a.persistentSetOf());
    public static final AtomicReference E = new AtomicReference(Boolean.FALSE);
    public z.t0 A;
    public final d B;

    /* renamed from: a, reason: collision with root package name */
    public long f80348a;

    /* renamed from: b, reason: collision with root package name */
    public final h f80349b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f80350c;

    /* renamed from: d, reason: collision with root package name */
    public Job f80351d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f80352e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f80353f;

    /* renamed from: g, reason: collision with root package name */
    public List f80354g;

    /* renamed from: h, reason: collision with root package name */
    public z.v0 f80355h;

    /* renamed from: i, reason: collision with root package name */
    public final r0.c f80356i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f80357j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f80358k;

    /* renamed from: l, reason: collision with root package name */
    public final z.u0 f80359l;

    /* renamed from: m, reason: collision with root package name */
    public final k2 f80360m;

    /* renamed from: n, reason: collision with root package name */
    public final z.u0 f80361n;

    /* renamed from: o, reason: collision with root package name */
    public final z.u0 f80362o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f80363p;

    /* renamed from: q, reason: collision with root package name */
    public Set f80364q;

    /* renamed from: r, reason: collision with root package name */
    public CancellableContinuation f80365r;

    /* renamed from: s, reason: collision with root package name */
    public int f80366s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f80367t;

    /* renamed from: u, reason: collision with root package name */
    public c f80368u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f80369v;

    /* renamed from: w, reason: collision with root package name */
    public final MutableStateFlow f80370w;

    /* renamed from: x, reason: collision with root package name */
    public final z0.d0 f80371x;

    /* renamed from: y, reason: collision with root package name */
    public final CompletableJob f80372y;

    /* renamed from: z, reason: collision with root package name */
    public final zu.m f80373z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static final void access$addRunning(a aVar, d dVar) {
            s0.n nVar;
            s0.n nVarAdd;
            aVar.getClass();
            do {
                nVar = (s0.n) n3.D.getValue();
                nVarAdd = nVar.add((Object) dVar);
                if (nVar == nVarAdd) {
                    return;
                }
            } while (!n3.D.compareAndSet(nVar, nVarAdd));
        }

        public static final void access$removeRunning(a aVar, d dVar) {
            s0.n nVar;
            s0.n nVarRemove;
            aVar.getClass();
            do {
                nVar = (s0.n) n3.D.getValue();
                nVarRemove = nVar.remove((Object) dVar);
                if (nVar == nVarRemove) {
                    return;
                }
            } while (!n3.D.compareAndSet(nVar, nVarRemove));
        }

        public final void clearErrors$runtime() {
            Iterable iterable = (Iterable) n3.D.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                c cVarResetErrorState = ((d) it.next()).resetErrorState();
                if (cVarResetErrorState != null) {
                    arrayList.add(cVarResetErrorState);
                }
            }
        }

        public final Set<b4> currentRunningRecomposers$runtime() {
            return (Set) n3.D.getValue();
        }

        public final List<a4> getCurrentErrors$runtime() {
            Iterable iterable = (Iterable) n3.D.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a4 currentError = ((d) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final StateFlow<Set<b4>> getRunningRecomposers() {
            return n3.D;
        }

        public final void invalidateGroupsWithKey$runtime(int i10) {
            n3.E.set(Boolean.TRUE);
            for (d dVar : (Iterable) n3.D.getValue()) {
                a4 currentError = dVar.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    dVar.resetErrorState();
                    dVar.invalidateGroupsWithKey(i10);
                    dVar.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime(Object obj) {
            n3.E.set(Boolean.TRUE);
            Iterator it = ((Iterable) n3.D.getValue()).iterator();
            while (it.hasNext()) {
                ((d) it.next()).resetErrorState();
            }
            kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            List list2 = list;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) list.get(i10)).resetContent();
            }
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) list.get(i11)).recompose();
            }
            Iterator it2 = ((Iterable) n3.D.getValue()).iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime() {
            n3.E.set(Boolean.TRUE);
            Iterable iterable = (Iterable) n3.D.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                uu.v0.addAll(arrayList, ((d) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime(boolean z10) {
            n3.E.set(Boolean.valueOf(z10));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final j0 f80374a;

        /* renamed from: b, reason: collision with root package name */
        public final kv.p f80375b;

        public b(j0 j0Var) {
            this.f80374a = j0Var;
            this.f80375b = j0Var.getComposable();
        }

        public final void clearContent() {
            j0 j0Var = this.f80374a;
            if (j0Var.isRoot()) {
                j0Var.setContent(o.f80379a.m5818getLambda$1091980426$runtime());
            }
        }

        public final void recompose() {
            j0 j0Var = this.f80374a;
            if (j0Var.isRoot()) {
                j0Var.setContent(this.f80375b);
            }
        }

        public final void resetContent() {
            this.f80374a.setComposable(this.f80375b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements a4 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f80376a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f80377b;

        public c(boolean z10, Throwable th2) {
            this.f80376a = z10;
            this.f80377b = th2;
        }

        @Override // p0.a4
        public Throwable getCause() {
            return this.f80377b;
        }

        @Override // p0.a4
        public boolean getRecoverable() {
            return this.f80376a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements b4 {
        public d() {
        }

        @Override // p0.b4
        public long getChangeCount() {
            return n3.this.getChangeCount();
        }

        public final a4 getCurrentError() {
            c cVar;
            Object obj = n3.this.f80350c;
            n3 n3Var = n3.this;
            synchronized (obj) {
                cVar = n3Var.f80368u;
            }
            return cVar;
        }

        @Override // p0.b4
        public boolean getHasPendingWork() {
            return n3.this.getHasPendingWork();
        }

        @Override // p0.b4
        public Flow<o3> getState() {
            return n3.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i10) {
            List listAccess$knownCompositions = n3.access$knownCompositions(n3.this);
            ArrayList arrayList = new ArrayList(listAccess$knownCompositions.size());
            int size = listAccess$knownCompositions.size();
            for (int i11 = 0; i11 < size; i11++) {
                y0 y0Var = (y0) listAccess$knownCompositions.get(i11);
                j0 j0Var = y0Var instanceof j0 ? (j0) y0Var : null;
                if (j0Var != null) {
                    arrayList.add(j0Var);
                }
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((j0) arrayList.get(i12)).invalidateGroupsWithKey(i10);
            }
        }

        @Override // p0.b4
        public d1.l observe(d1.n nVar) {
            return d1.m.observe(n3.this, nVar);
        }

        public final c resetErrorState() {
            return n3.access$resetErrorState(n3.this);
        }

        public final void retryFailedCompositions() {
            n3.access$retryFailedCompositions(n3.this);
        }

        public final List<b> saveStateAndDisposeForHotReload() {
            List listAccess$knownCompositions = n3.access$knownCompositions(n3.this);
            ArrayList arrayList = new ArrayList(listAccess$knownCompositions.size());
            int size = listAccess$knownCompositions.size();
            for (int i10 = 0; i10 < size; i10++) {
                y0 y0Var = (y0) listAccess$knownCompositions.get(i10);
                j0 j0Var = y0Var instanceof j0 ? (j0) y0Var : null;
                if (j0Var != null) {
                    arrayList.add(j0Var);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = new b((j0) arrayList.get(i11));
                bVar.clearContent();
                arrayList2.add(bVar);
            }
            return arrayList2;
        }
    }

    public n3(zu.m mVar) {
        h hVar = new h(new o6.v0(this, 3));
        this.f80349b = hVar;
        this.f80350c = new Object();
        this.f80353f = new ArrayList();
        this.f80355h = new z.v0(0, 1, null);
        this.f80356i = new r0.c(new y0[16], 0);
        this.f80357j = new ArrayList();
        this.f80358k = new ArrayList();
        this.f80359l = r0.b.m5983constructorimpl$default(null, 1, null);
        this.f80360m = new k2();
        this.f80361n = z.m1.mutableScatterMapOf();
        this.f80362o = r0.b.m5983constructorimpl$default(null, 1, null);
        this.f80370w = StateFlowKt.MutableStateFlow(o3.f80383e);
        this.f80371x = new z0.d0();
        CompletableJob completableJobJob = JobKt.Job((Job) mVar.get(Job.Key));
        completableJobJob.invokeOnCompletion(new g2(this, 3));
        this.f80372y = completableJobJob;
        this.f80373z = mVar.plus(hVar).plus(completableJobJob);
        this.B = new d();
    }

    public static void a(b1.e eVar) {
        try {
            if (eVar.apply() instanceof o.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            eVar.dispose();
        }
    }

    public static final Object access$awaitWorkAvailable(n3 n3Var, zu.d dVar) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (n3Var.e()) {
            return tu.x0.f87415a;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (n3Var.f80350c) {
            if (n3Var.e()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                n3Var.f80365r = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result == av.e.getCOROUTINE_SUSPENDED() ? result : tu.x0.f87415a;
    }

    public static final void access$discardUnusedMovableContentState(n3 n3Var) {
        int i10;
        z.f1 f1VarEmptyObjectList;
        synchronized (n3Var.f80350c) {
            try {
                if (r0.b.m5991isNotEmptyimpl(n3Var.f80359l)) {
                    z.f1 f1VarM5996valuesimpl = r0.b.m5996valuesimpl(n3Var.f80359l);
                    r0.b.m5981clearimpl(n3Var.f80359l);
                    n3Var.f80360m.clear();
                    r0.b.m5981clearimpl(n3Var.f80362o);
                    z.t0 t0Var = new z.t0(f1VarM5996valuesimpl.getSize());
                    Object[] objArr = f1VarM5996valuesimpl.f96812a;
                    int i11 = f1VarM5996valuesimpl.f96813b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        i2 i2Var = (i2) objArr[i12];
                        t0Var.add(tu.e0.to(i2Var, n3Var.f80361n.get(i2Var)));
                    }
                    n3Var.f80361n.clear();
                    f1VarEmptyObjectList = t0Var;
                } else {
                    f1VarEmptyObjectList = z.g1.emptyObjectList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = f1VarEmptyObjectList.f96812a;
        int i13 = f1VarEmptyObjectList.f96813b;
        for (i10 = 0; i10 < i13; i10++) {
            tu.v vVar = (tu.v) objArr2[i10];
            i2 i2Var2 = (i2) vVar.component1();
            h2 h2Var = (h2) vVar.component2();
            if (h2Var != null) {
                i2Var2.getComposition$runtime().disposeUnusedMovableContent(h2Var);
            }
        }
    }

    public static final boolean access$getHasBroadcastFrameClockAwaiters(n3 n3Var) {
        boolean zD;
        synchronized (n3Var.f80350c) {
            zD = n3Var.d();
        }
        return zD;
    }

    public static final boolean access$getHasConcurrentFrameWorkLocked(n3 n3Var) {
        return !n3Var.f80357j.isEmpty() || n3Var.d();
    }

    public static final boolean access$getShouldKeepRecomposing(n3 n3Var) {
        boolean z10;
        synchronized (n3Var.f80350c) {
            z10 = n3Var.f80367t;
        }
        if (!z10) {
            return true;
        }
        Iterator<Object> it = n3Var.f80372y.getChildren().iterator();
        while (it.hasNext()) {
            if (((Job) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    public static final List access$knownCompositions(n3 n3Var) {
        List listF;
        synchronized (n3Var.f80350c) {
            listF = n3Var.f();
        }
        return listF;
    }

    public static final void access$registerRunnerJob(n3 n3Var, Job job) {
        synchronized (n3Var.f80350c) {
            Throwable th2 = n3Var.f80352e;
            if (th2 != null) {
                throw th2;
            }
            if (((o3) n3Var.f80370w.getValue()).compareTo(o3.f80382c) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (n3Var.f80351d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            n3Var.f80351d = job;
            n3Var.c();
        }
    }

    public static final c access$resetErrorState(n3 n3Var) {
        c cVar;
        synchronized (n3Var.f80350c) {
            cVar = n3Var.f80368u;
            if (cVar != null) {
                n3Var.f80368u = null;
                n3Var.c();
            }
        }
        return cVar;
    }

    public static final void access$retryFailedCompositions(n3 n3Var) {
        ArrayList arrayList;
        int i10;
        synchronized (n3Var.f80350c) {
            arrayList = n3Var.f80363p;
            n3Var.f80363p = null;
        }
        if (arrayList == null) {
            return;
        }
        while (true) {
            i10 = 0;
            try {
                if (arrayList.isEmpty()) {
                    break;
                }
                y0 y0Var = (y0) uu.v0.removeLast(arrayList);
                if (y0Var instanceof j0) {
                    ((j0) y0Var).invalidateAll();
                    ((j0) y0Var).setContent(((j0) y0Var).getComposable());
                    if (n3Var.f80368u != null) {
                        break;
                    }
                }
            } catch (Throwable th2) {
                if (!arrayList.isEmpty()) {
                    synchronized (n3Var.f80350c) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            n3Var.o((y0) arrayList.get(i10));
                            i10++;
                        }
                    }
                }
                throw th2;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (n3Var.f80350c) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                n3Var.o((y0) arrayList.get(i10));
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a4 -> B:13:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$runFrameLoop(p0.n3 r12, p0.d2 r13, p0.c3 r14, zu.d r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof p0.u3
            if (r0 == 0) goto L16
            r0 = r15
            p0.u3 r0 = (p0.u3) r0
            int r1 = r0.f80512o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f80512o = r1
            goto L1b
        L16:
            p0.u3 r0 = new p0.u3
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f80510m
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f80512o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.util.List r13 = r0.f80509l
            java.util.List r13 = (java.util.List) r13
            java.util.List r14 = r0.f80508k
            java.util.List r14 = (java.util.List) r14
            p0.c3 r2 = r0.f80507j
            p0.d2 r5 = r0.f80506i
            tu.a0.throwOnFailure(r15)
            r8 = r12
            r15 = r14
            r14 = r2
            r2 = r13
        L3e:
            r13 = r5
            goto La8
        L41:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L49:
            java.util.List r13 = r0.f80509l
            java.util.List r13 = (java.util.List) r13
            java.util.List r14 = r0.f80508k
            java.util.List r14 = (java.util.List) r14
            p0.c3 r2 = r0.f80507j
            p0.d2 r5 = r0.f80506i
            tu.a0.throwOnFailure(r15)
            r10 = r13
            r9 = r14
            r11 = r2
            goto L86
        L5c:
            tu.a0.throwOnFailure(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L69:
            java.lang.Object r5 = r12.f80350c
            r0.f80506i = r13
            r0.f80507j = r14
            r6 = r15
            java.util.List r6 = (java.util.List) r6
            r0.f80508k = r6
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.f80509l = r6
            r0.f80512o = r4
            java.lang.Object r5 = r14.awaitFrameRequest(r5, r0)
            if (r5 != r1) goto L82
            goto La3
        L82:
            r5 = r13
            r11 = r14
            r9 = r15
            r10 = r2
        L86:
            com.moloco.sdk.internal.services.init.e r6 = new com.moloco.sdk.internal.services.init.e
            r7 = 1
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f80506i = r5
            r0.f80507j = r11
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r0.f80508k = r12
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            r0.f80509l = r12
            r0.f80512o = r3
            java.lang.Object r12 = r5.withFrameNanos(r6, r0)
            if (r12 != r1) goto La4
        La3:
            return r1
        La4:
            r15 = r9
            r2 = r10
            r14 = r11
            goto L3e
        La8:
            r12 = r8
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.n3.access$runFrameLoop(p0.n3, p0.d2, p0.c3, zu.d):java.lang.Object");
    }

    public static final void b(n3 n3Var, i2 i2Var, i2 i2Var2) {
        List<i2> nestedReferences$runtime = i2Var2.getNestedReferences$runtime();
        if (nestedReferences$runtime != null) {
            int size = nestedReferences$runtime.size();
            for (int i10 = 0; i10 < size; i10++) {
                i2 i2Var3 = nestedReferences$runtime.get(i10);
                n3Var.f80360m.add(i2Var3.getContent$runtime(), new l2(i2Var3, i2Var));
                b(n3Var, i2Var, i2Var3);
            }
        }
    }

    public static final void h(ArrayList arrayList, n3 n3Var, y0 y0Var) {
        arrayList.clear();
        synchronized (n3Var.f80350c) {
            Iterator it = n3Var.f80358k.iterator();
            while (it.hasNext()) {
                i2 i2Var = (i2) it.next();
                if (kotlin.jvm.internal.e0.areEqual(i2Var.getComposition$runtime(), y0Var)) {
                    arrayList.add(i2Var);
                    it.remove();
                }
            }
        }
    }

    public static /* synthetic */ void l(n3 n3Var, Throwable th2, int i10) throws Throwable {
        n3Var.k(th2, null, (i10 & 4) == 0);
    }

    public final d1.l addCompositionRegistrationObserver$runtime(d1.n nVar) {
        synchronized (this.f80350c) {
            try {
                z.t0 t0Var = this.A;
                int i10 = 0;
                if (t0Var == null) {
                    t0Var = new z.t0(i10, 1, null);
                    this.A = t0Var;
                }
                t0Var.add(nVar);
                ArrayList arrayList = this.f80353f;
                int size = arrayList.size();
                while (i10 < size) {
                    y0 y0Var = (y0) arrayList.get(i10);
                    if (y0Var instanceof d1.s) {
                        nVar.a();
                    }
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new p3(this);
    }

    public final b4 asRecomposerInfo() {
        return this.B;
    }

    public final Object awaitIdle(zu.d<? super tu.x0> dVar) {
        Object objCollect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new q3(2, null)), dVar);
        return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : tu.x0.f87415a;
    }

    public final CancellableContinuation c() {
        o3 o3Var;
        MutableStateFlow mutableStateFlow = this.f80370w;
        int iCompareTo = ((o3) mutableStateFlow.getValue()).compareTo(o3.f80382c);
        ArrayList arrayList = this.f80358k;
        ArrayList arrayList2 = this.f80357j;
        int i10 = 0;
        r0.c cVar = this.f80356i;
        int i11 = 1;
        kotlin.jvm.internal.u uVar = null;
        if (iCompareTo > 0) {
            if (this.f80368u != null) {
                o3Var = o3.f80383e;
            } else if (this.f80351d == null) {
                this.f80355h = new z.v0(i10, i11, uVar);
                cVar.clear();
                o3Var = d() ? o3.f80384f : o3.f80383e;
            } else {
                o3Var = (cVar.getSize() == 0 && !this.f80355h.isNotEmpty() && arrayList2.isEmpty() && arrayList.isEmpty() && this.f80366s <= 0 && !d() && !r0.b.m5991isNotEmptyimpl(this.f80359l)) ? o3.f80385g : o3.f80386h;
            }
            mutableStateFlow.setValue(o3Var);
            if (o3Var != o3.f80386h) {
                return null;
            }
            CancellableContinuation cancellableContinuation = this.f80365r;
            this.f80365r = null;
            return cancellableContinuation;
        }
        Iterator it = f().iterator();
        while (it.hasNext()) {
            q((y0) it.next());
        }
        this.f80353f.clear();
        this.f80354g = uu.p0.emptyList();
        this.f80355h = new z.v0(i10, i11, uVar);
        cVar.clear();
        arrayList2.clear();
        arrayList.clear();
        this.f80363p = null;
        CancellableContinuation cancellableContinuation2 = this.f80365r;
        if (cancellableContinuation2 != null) {
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation2, null, 1, null);
        }
        this.f80365r = null;
        this.f80368u = null;
        return null;
    }

    public final void cancel() {
        synchronized (this.f80350c) {
            if (((o3) this.f80370w.getValue()).compareTo(o3.f80385g) >= 0) {
                this.f80370w.setValue(o3.f80382c);
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.f80372y, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.f80372y.complete()) {
            synchronized (this.f80350c) {
                this.f80367t = true;
            }
        }
    }

    @Override // p0.f0
    public void composeInitial$runtime(y0 y0Var, kv.p pVar) throws Throwable {
        Object obj;
        boolean z10;
        boolean zIsComposing = y0Var.isComposing();
        synchronized (this.f80350c) {
            obj = null;
            if (((o3) this.f80370w.getValue()).compareTo(o3.f80382c) > 0) {
                boolean zContains = f().contains(y0Var);
                z10 = !zContains;
                if (!zContains) {
                    this.f80353f.add(y0Var);
                    this.f80354g = null;
                    z.t0 t0Var = this.A;
                    if (t0Var != null) {
                        Object[] objArr = t0Var.f96812a;
                        int i10 = t0Var.f96813b;
                        for (int i11 = 0; i11 < i10; i11++) {
                            if (objArr[i11] != null) {
                                throw new ClassCastException();
                            }
                            if (y0Var instanceof d1.s) {
                                throw null;
                            }
                        }
                    }
                }
            } else {
                z10 = true;
            }
        }
        try {
            m.a aVar = b1.m.f8651e;
            b1.e eVarTakeMutableSnapshot = aVar.takeMutableSnapshot(new g2(y0Var, 2), new androidx.lifecycle.c3(15, y0Var, obj));
            try {
                b1.m mVarMakeCurrent = eVarTakeMutableSnapshot.makeCurrent();
                try {
                    y0Var.composeContent(pVar);
                    if (!zIsComposing) {
                        aVar.notifyObjectsInitialized();
                    }
                    try {
                        g(y0Var);
                        try {
                            y0Var.applyChanges();
                            y0Var.applyLateChanges();
                            if (zIsComposing) {
                                return;
                            }
                            aVar.notifyObjectsInitialized();
                        } catch (Throwable th2) {
                            l(this, th2, 6);
                        }
                    } catch (Throwable th3) {
                        k(th3, y0Var, true);
                    }
                } finally {
                    eVarTakeMutableSnapshot.restoreCurrent(mVarMakeCurrent);
                }
            } finally {
                a(eVarTakeMutableSnapshot);
            }
        } catch (Throwable th4) {
            k(th4, y0Var, true);
            if (z10) {
                synchronized (this.f80350c) {
                    p(y0Var);
                }
            }
        }
    }

    @Override // p0.f0
    public z.o1 composeInitialPaused$runtime(y0 y0Var, p4 p4Var, kv.p pVar) {
        z0.d0 d0Var = this.f80371x;
        try {
            y0Var.getAndSetShouldPauseCallback(p4Var);
            try {
                composeInitial$runtime(y0Var, pVar);
                z.o1 o1VarEmptyScatterSet = (z.v0) d0Var.get();
                if (o1VarEmptyScatterSet == null) {
                    o1VarEmptyScatterSet = z.p1.emptyScatterSet();
                }
                return o1VarEmptyScatterSet;
            } finally {
                y0Var.getAndSetShouldPauseCallback(null);
            }
        } finally {
            d0Var.set(null);
        }
    }

    public final boolean d() {
        return !this.f80369v && this.f80349b.getHasAwaiters();
    }

    @Override // p0.f0
    public void deletedMovableContent$runtime(i2 i2Var) {
        CancellableContinuation cancellableContinuationC;
        synchronized (this.f80350c) {
            try {
                r0.b.m5979addimpl(this.f80359l, i2Var.getContent$runtime(), i2Var);
                if (i2Var.getNestedReferences$runtime() != null) {
                    b(this, i2Var, i2Var);
                }
                cancellableContinuationC = c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f80350c
            monitor-enter(r0)
            z.v0 r1 = r2.f80355h     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            r0.c r1 = r2.f80356i     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.d()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.n3.e():boolean");
    }

    public final List f() {
        List list = this.f80354g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f80353f;
        List listEmptyList = arrayList.isEmpty() ? uu.p0.emptyList() : new ArrayList(arrayList);
        this.f80354g = listEmptyList;
        return listEmptyList;
    }

    public final void g(y0 y0Var) {
        synchronized (this.f80350c) {
            ArrayList arrayList = this.f80358k;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (kotlin.jvm.internal.e0.areEqual(((i2) arrayList.get(i10)).getComposition$runtime(), y0Var)) {
                    ArrayList arrayList2 = new ArrayList();
                    h(arrayList2, this, y0Var);
                    while (!arrayList2.isEmpty()) {
                        i(arrayList2, null);
                        h(arrayList2, this, y0Var);
                    }
                    return;
                }
            }
        }
    }

    public final long getChangeCount() {
        return this.f80348a;
    }

    @Override // p0.f0
    public boolean getCollectingCallByInformation$runtime() {
        return ((Boolean) E.get()).booleanValue();
    }

    @Override // p0.f0
    public boolean getCollectingParameterInformation$runtime() {
        return false;
    }

    @Override // p0.f0
    public boolean getCollectingSourceInformation$runtime() {
        return d0.getComposeStackTraceEnabled();
    }

    @Override // p0.f0
    public long getCompositeKeyHashCode$runtime() {
        return 1000;
    }

    @Override // p0.f0
    public e0 getComposition$runtime() {
        return null;
    }

    public final StateFlow<o3> getCurrentState() {
        return this.f80370w;
    }

    @Override // p0.f0
    public zu.m getEffectCoroutineContext() {
        return this.f80373z;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f80350c
            monitor-enter(r0)
            z.v0 r1 = r2.f80355h     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L33
            r0.c r1 = r2.f80356i     // Catch: java.lang.Throwable -> L31
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L14
            goto L33
        L14:
            int r1 = r2.f80366s     // Catch: java.lang.Throwable -> L31
            if (r1 > 0) goto L33
            java.util.ArrayList r1 = r2.f80357j     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            boolean r1 = r2.d()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L33
            z.u0 r1 = r2.f80359l     // Catch: java.lang.Throwable -> L31
            boolean r1 = r0.b.m5991isNotEmptyimpl(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L2f
            goto L33
        L2f:
            r1 = 0
            goto L34
        L31:
            r1 = move-exception
            goto L36
        L33:
            r1 = 1
        L34:
            monitor-exit(r0)
            return r1
        L36:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.n3.getHasPendingWork():boolean");
    }

    @Override // p0.f0
    public zu.m getRecomposeCoroutineContext$runtime() {
        return zu.n.f98854b;
    }

    public final Flow<o3> getState() {
        return getCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0148, code lost:
    
        r3 = r9.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
    
        if (r4 >= r3) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0159, code lost:
    
        if (((tu.v) r9.get(r4)).getSecond() == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015e, code lost:
    
        r3 = new java.util.ArrayList(r9.size());
        r4 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        r11 = (tu.v) r9.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0178, code lost:
    
        if (r11.getSecond() != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        r11 = (p0.i2) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0183, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        if (r11 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        r4 = r16.f80350c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018e, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018f, code lost:
    
        uu.v0.addAll(r16.f80358k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0194, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
    
        r3 = new java.util.ArrayList(r9.size());
        r4 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a3, code lost:
    
        if (r8 >= r4) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a5, code lost:
    
        r11 = r9.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b0, code lost:
    
        if (((tu.v) r11).getSecond() == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b8, code lost:
    
        r9 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.util.List r17, z.v0 r18) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.n3.i(java.util.List, z.v0):java.util.List");
    }

    @Override // p0.f0
    public void insertMovableContent$runtime(i2 i2Var) {
        CancellableContinuation cancellableContinuationC;
        synchronized (this.f80350c) {
            this.f80358k.add(i2Var);
            cancellableContinuationC = c();
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    @Override // p0.f0
    public void invalidate$runtime(y0 y0Var) {
        CancellableContinuation cancellableContinuationC;
        synchronized (this.f80350c) {
            if (this.f80356i.contains(y0Var)) {
                cancellableContinuationC = null;
            } else {
                this.f80356i.add(y0Var);
                cancellableContinuationC = c();
            }
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    @Override // p0.f0
    public void invalidateScope$runtime(k3 k3Var) {
        CancellableContinuation cancellableContinuationC;
        synchronized (this.f80350c) {
            this.f80355h.add(k3Var);
            cancellableContinuationC = c();
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    public final y0 j(y0 y0Var, z.v0 v0Var) {
        if (y0Var.isComposing() || y0Var.isDisposed()) {
            return null;
        }
        Set set = this.f80364q;
        if (set != null && set.contains(y0Var)) {
            return null;
        }
        b1.e eVarTakeMutableSnapshot = b1.m.f8651e.takeMutableSnapshot(new g2(y0Var, 2), new androidx.lifecycle.c3(15, y0Var, v0Var));
        try {
            b1.m mVarMakeCurrent = eVarTakeMutableSnapshot.makeCurrent();
            if (v0Var != null) {
                try {
                    if (v0Var.isNotEmpty()) {
                        y0Var.prepareCompose(new androidx.lifecycle.x0(19, v0Var, y0Var));
                    }
                } catch (Throwable th2) {
                    eVarTakeMutableSnapshot.restoreCurrent(mVarMakeCurrent);
                    throw th2;
                }
            }
            boolean zRecompose = y0Var.recompose();
            eVarTakeMutableSnapshot.restoreCurrent(mVarMakeCurrent);
            if (zRecompose) {
                return y0Var;
            }
            return null;
        } finally {
            a(eVarTakeMutableSnapshot);
        }
    }

    public final Object join(zu.d<? super tu.x0> dVar) {
        Object objFirst = FlowKt.first(getCurrentState(), new r3(2, null), dVar);
        return objFirst == av.e.getCOROUTINE_SUSPENDED() ? objFirst : tu.x0.f87415a;
    }

    public final void k(Throwable th2, y0 y0Var, boolean z10) throws Throwable {
        int i10 = 0;
        if (!((Boolean) E.get()).booleanValue() || (th2 instanceof t)) {
            synchronized (this.f80350c) {
                c cVar = this.f80368u;
                if (cVar != null) {
                    throw cVar.getCause();
                }
                this.f80368u = new c(false, th2);
            }
            throw th2;
        }
        synchronized (this.f80350c) {
            try {
                z0.k0.logError("Error was captured in composition while live edit was enabled.", th2);
                this.f80357j.clear();
                this.f80356i.clear();
                this.f80355h = new z.v0(i10, 1, null);
                this.f80358k.clear();
                r0.b.m5981clearimpl(this.f80359l);
                this.f80361n.clear();
                this.f80368u = new c(z10, th2);
                if (y0Var != null) {
                    o(y0Var);
                }
                c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final Object m(kv.q qVar, zu.d dVar) {
        Object objWithContext = BuildersKt.withContext(this.f80349b, new t3(this, qVar, e2.getMonotonicFrameClock(dVar.getContext()), null), dVar);
        return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : tu.x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // p0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void movableContentStateReleased$runtime(p0.i2 r18, p0.h2 r19, p0.d r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.f80350c
            monitor-enter(r3)
            z.u0 r4 = r1.f80361n     // Catch: java.lang.Throwable -> L63
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> L63
            z.u0 r4 = r1.f80362o     // Catch: java.lang.Throwable -> L63
            z.f1 r0 = r0.b.m5988getimpl(r4, r0)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L70
            r4 = r20
            z.l1 r0 = r2.extractNestedStates$runtime(r4, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r2 = r0.f96866b     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r4 = r0.f96867c     // Catch: java.lang.Throwable -> L63
            long[] r0 = r0.f96865a     // Catch: java.lang.Throwable -> L63
            int r5 = r0.length     // Catch: java.lang.Throwable -> L63
            int r5 = r5 + (-2)
            if (r5 < 0) goto L70
            r6 = 0
            r7 = r6
        L2d:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L63
            long r10 = ~r8     // Catch: java.lang.Throwable -> L63
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6b
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L63
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L47:
            if (r12 >= r10) goto L69
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L65
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L63
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L63
            p0.h2 r13 = (p0.h2) r13     // Catch: java.lang.Throwable -> L63
            p0.i2 r14 = (p0.i2) r14     // Catch: java.lang.Throwable -> L63
            z.u0 r15 = r1.f80361n     // Catch: java.lang.Throwable -> L63
            r15.set(r14, r13)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L72
        L65:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L47
        L69:
            if (r10 != r11) goto L70
        L6b:
            if (r7 == r5) goto L70
            int r7 = r7 + 1
            goto L2d
        L70:
            monitor-exit(r3)
            return
        L72:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.n3.movableContentStateReleased$runtime(p0.i2, p0.h2, p0.d):void");
    }

    @Override // p0.f0
    public h2 movableContentStateResolve$runtime(i2 i2Var) {
        h2 h2Var;
        synchronized (this.f80350c) {
            h2Var = (h2) this.f80361n.remove(i2Var);
        }
        return h2Var;
    }

    public final boolean n() {
        uu.p0.emptyList();
        synchronized (this.f80350c) {
            boolean z10 = true;
            z = true;
            z = true;
            boolean z11 = true;
            z10 = true;
            z10 = true;
            int i10 = 0;
            if (this.f80355h.isEmpty()) {
                if (this.f80356i.getSize() == 0 && !d() && !r0.b.m5991isNotEmptyimpl(this.f80359l)) {
                    z11 = false;
                }
                return z11;
            }
            List listF = f();
            Set<? extends Object> setWrapIntoSet = r0.g.wrapIntoSet(this.f80355h);
            this.f80355h = new z.v0(i10, z10 ? 1 : 0, null);
            try {
                int size = listF.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((y0) listF.get(i11)).recordModificationsOf(setWrapIntoSet);
                    if (((o3) this.f80370w.getValue()).compareTo(o3.f80382c) <= 0) {
                        break;
                    }
                }
                synchronized (this.f80350c) {
                    if (c() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f80356i.getSize() == 0 && !d() && !r0.b.m5991isNotEmptyimpl(this.f80359l)) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th2) {
                synchronized (this.f80350c) {
                    this.f80355h.addAll(setWrapIntoSet);
                    throw th2;
                }
            }
        }
    }

    public final void o(y0 y0Var) {
        ArrayList arrayList = this.f80363p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f80363p = arrayList;
        }
        if (!arrayList.contains(y0Var)) {
            arrayList.add(y0Var);
        }
        p(y0Var);
    }

    public final void p(y0 y0Var) {
        if (this.f80353f.remove(y0Var)) {
            this.f80354g = null;
            q(y0Var);
        }
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.f80350c) {
            this.f80369v = true;
        }
    }

    public final void q(y0 y0Var) {
        z.t0 t0Var = this.A;
        if (t0Var != null) {
            Object[] objArr = t0Var.f96812a;
            int i10 = t0Var.f96813b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (objArr[i11] != null) {
                    throw new ClassCastException();
                }
                if (y0Var instanceof d1.s) {
                    throw null;
                }
            }
        }
    }

    @Override // p0.f0
    public z.o1 recomposePaused$runtime(y0 y0Var, p4 p4Var, z.o1 o1Var) {
        z0.d0 d0Var = this.f80371x;
        try {
            n();
            y0Var.recordModificationsOf(r0.g.wrapIntoSet(o1Var));
            y0Var.getAndSetShouldPauseCallback(p4Var);
            try {
                y0 y0VarJ = j(y0Var, null);
                if (y0VarJ != null) {
                    g(y0Var);
                    y0VarJ.applyChanges();
                    y0VarJ.applyLateChanges();
                }
                z.o1 o1VarEmptyScatterSet = (z.v0) d0Var.get();
                if (o1VarEmptyScatterSet == null) {
                    o1VarEmptyScatterSet = z.p1.emptyScatterSet();
                }
                return o1VarEmptyScatterSet;
            } finally {
                y0Var.getAndSetShouldPauseCallback(null);
            }
        } finally {
            d0Var.set(null);
        }
    }

    @Override // p0.f0
    public void reportPausedScope$runtime(k3 k3Var) {
        z0.d0 d0Var = this.f80371x;
        z.v0 v0VarMutableScatterSetOf = (z.v0) d0Var.get();
        if (v0VarMutableScatterSetOf == null) {
            v0VarMutableScatterSetOf = z.p1.mutableScatterSetOf();
            d0Var.set(v0VarMutableScatterSetOf);
        }
        v0VarMutableScatterSetOf.add(k3Var);
    }

    @Override // p0.f0
    public void reportRemovedComposition$runtime(y0 y0Var) {
        synchronized (this.f80350c) {
            try {
                Set linkedHashSet = this.f80364q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f80364q = linkedHashSet;
                }
                linkedHashSet.add(y0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation cancellableContinuationC;
        synchronized (this.f80350c) {
            if (this.f80369v) {
                this.f80369v = false;
                cancellableContinuationC = c();
            } else {
                cancellableContinuationC = null;
            }
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
    }

    public final Object runRecomposeAndApplyChanges(zu.d<? super tu.x0> dVar) {
        Object objM = m(new w3(this, null), dVar);
        return objM == av.e.getCOROUTINE_SUSPENDED() ? objM : tu.x0.f87415a;
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(zu.m mVar, zu.d<? super tu.x0> dVar) {
        Object objM = m(new z3(mVar, this, null), dVar);
        return objM == av.e.getCOROUTINE_SUSPENDED() ? objM : tu.x0.f87415a;
    }

    @Override // p0.f0
    public void unregisterComposition$runtime(y0 y0Var) {
        synchronized (this.f80350c) {
            p(y0Var);
            this.f80356i.remove(y0Var);
            this.f80357j.remove(y0Var);
        }
    }

    @tu.f
    public static /* synthetic */ void getState$annotations() {
    }

    @Override // p0.f0
    public void recordInspectionTable$runtime(Set<d1.e> set) {
    }

    @Override // p0.f0
    public void registerComposition$runtime(y0 y0Var) {
    }
}
