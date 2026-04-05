package o5;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77547a;

    /* renamed from: b, reason: collision with root package name */
    public final y f77548b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f77549c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f77550d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f77551e;

    /* renamed from: f, reason: collision with root package name */
    public int f77552f;

    /* renamed from: g, reason: collision with root package name */
    public v f77553g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f77554h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f77555i;

    /* renamed from: j, reason: collision with root package name */
    public final h0 f77556j;

    /* renamed from: k, reason: collision with root package name */
    public final j0 f77557k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f77558b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String[] f77559c;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: o5.f0$a$a, reason: collision with other inner class name */
        public static final class C0753a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f77560b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String[] f77561c;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: o5.f0$a$a$a, reason: collision with other inner class name */
            public static final class C0754a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f77562i;

                /* renamed from: j, reason: collision with root package name */
                public int f77563j;

                public C0754a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f77562i = obj;
                    this.f77563j |= Integer.MIN_VALUE;
                    return C0753a.this.emit(null, this);
                }
            }

            public C0753a(FlowCollector flowCollector, String[] strArr) {
                this.f77560b = flowCollector;
                this.f77561c = strArr;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, zu.d r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof o5.f0.a.C0753a.C0754a
                    if (r0 == 0) goto L13
                    r0 = r11
                    o5.f0$a$a$a r0 = (o5.f0.a.C0753a.C0754a) r0
                    int r1 = r0.f77563j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f77563j = r1
                    goto L18
                L13:
                    o5.f0$a$a$a r0 = new o5.f0$a$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f77562i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f77563j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r11)
                    goto L7c
                L29:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L31:
                    tu.a0.throwOnFailure(r11)
                    java.util.Set r10 = (java.util.Set) r10
                    java.util.Set r11 = uu.b2.createSetBuilder()
                    java.lang.String[] r2 = r9.f77561c
                    int r4 = r2.length
                    r5 = 0
                L3e:
                    if (r5 >= r4) goto L62
                    r6 = r2[r5]
                    r7 = r10
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L49:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L5f
                    java.lang.Object r8 = r7.next()
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r8 = sv.k0.equals(r6, r8, r3)
                    if (r8 == 0) goto L49
                    r11.add(r6)
                    goto L49
                L5f:
                    int r5 = r5 + 1
                    goto L3e
                L62:
                    java.util.Set r10 = uu.b2.build(r11)
                    java.util.Collection r10 = (java.util.Collection) r10
                    boolean r11 = r10.isEmpty()
                    if (r11 == 0) goto L6f
                    r10 = 0
                L6f:
                    if (r10 == 0) goto L7c
                    r0.f77563j = r3
                    kotlinx.coroutines.flow.FlowCollector r11 = r9.f77560b
                    java.lang.Object r10 = r11.emit(r10, r0)
                    if (r10 != r1) goto L7c
                    return r1
                L7c:
                    tu.x0 r10 = tu.x0.f87415a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: o5.f0.a.C0753a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow, String[] strArr) {
            this.f77558b = flow;
            this.f77559c = strArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f77558b.collect(new C0753a(flowCollector, this.f77559c), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : tu.x0.f87415a;
        }
    }

    public f0(Context context, String name, y invalidationTracker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        this.f77547a = name;
        this.f77548b = invalidationTracker;
        this.f77549c = context.getApplicationContext();
        this.f77550d = invalidationTracker.getDatabase$room_runtime_release().getCoroutineScope();
        this.f77551e = new AtomicBoolean(true);
        this.f77554h = SharedFlowKt.MutableSharedFlow(0, 0, BufferOverflow.SUSPEND);
        this.f77555i = new i0(this, invalidationTracker.getTableNames$room_runtime_release());
        this.f77556j = new h0(this);
        this.f77557k = new j0(this);
    }

    public static final void access$registerCallback(f0 f0Var) {
        f0Var.getClass();
        try {
            v vVar = f0Var.f77553g;
            if (vVar != null) {
                f0Var.f77552f = vVar.registerCallback(f0Var.f77556j, f0Var.f77547a);
            }
        } catch (RemoteException e10) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
        }
    }

    public final Flow<Set<String>> createFlow(String[] resolvedTableNames) {
        kotlin.jvm.internal.e0.checkNotNullParameter(resolvedTableNames, "resolvedTableNames");
        return new a(this.f77554h, resolvedTableNames);
    }

    public final y getInvalidationTracker() {
        return this.f77548b;
    }

    public final String getName() {
        return this.f77547a;
    }

    public final void start(Intent serviceIntent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serviceIntent, "serviceIntent");
        if (this.f77551e.compareAndSet(true, false)) {
            this.f77549c.bindService(serviceIntent, this.f77557k, 1);
            this.f77548b.addRemoteObserver$room_runtime_release(this.f77555i);
        }
    }

    public final void stop() {
        if (this.f77551e.compareAndSet(false, true)) {
            this.f77548b.removeObserver(this.f77555i);
            try {
                v vVar = this.f77553g;
                if (vVar != null) {
                    vVar.unregisterCallback(this.f77556j, this.f77552f);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            this.f77549c.unbindService(this.f77557k);
        }
    }
}
