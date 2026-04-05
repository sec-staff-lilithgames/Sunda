package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.MonitorConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class X {

    /* renamed from: g, reason: collision with root package name */
    public static final a f59953g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f59954a;

    /* renamed from: b, reason: collision with root package name */
    private final V f59955b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59956c;

    /* renamed from: d, reason: collision with root package name */
    private final CoroutineScope f59957d;

    /* renamed from: e, reason: collision with root package name */
    private Job f59958e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f59959f = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MonitorConfig f59960a;

        /* renamed from: b, reason: collision with root package name */
        private final String f59961b;

        /* renamed from: c, reason: collision with root package name */
        private final Struct f59962c;

        public b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.f59960a = monitorConfig;
            this.f59961b = str;
            this.f59962c = struct;
        }

        public final Struct a() {
            return this.f59962c;
        }

        public final MonitorConfig b() {
            return this.f59960a;
        }

        public final String c() {
            return this.f59961b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59963a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f59965c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, zu.d dVar) {
            super(2, dVar);
            this.f59965c = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return X.this.new c(this.f59965c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f59963a;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                X x10 = X.this;
                List list = this.f59965c;
                this.f59963a = 1;
                if (x10.a(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59966a;

        public d(zu.d dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return X.this.new d(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r7.a(0, r6) == r0) goto L15;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r6.f59966a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                tu.a0.throwOnFailure(r7)
                tu.z r7 = (tu.z) r7
                r7.m7139unboximpl()
                goto L49
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                tu.a0.throwOnFailure(r7)
                goto L3d
            L23:
                tu.a0.throwOnFailure(r7)
                io.bidmachine.analytics.internal.X r7 = io.bidmachine.analytics.internal.X.this
                io.bidmachine.analytics.internal.X$b r7 = io.bidmachine.analytics.internal.X.a(r7)
                io.bidmachine.analytics.MonitorConfig r7 = r7.b()
                long r4 = r7.getInterval()
                r6.f59966a = r3
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L3d
                goto L48
            L3d:
                io.bidmachine.analytics.internal.X r7 = io.bidmachine.analytics.internal.X.this
                r6.f59966a = r2
                r1 = 0
                java.lang.Object r7 = io.bidmachine.analytics.internal.X.a(r7, r1, r6)
                if (r7 != r0) goto L49
            L48:
                return r0
            L49:
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59968a;

        /* renamed from: b, reason: collision with root package name */
        Object f59969b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59970c;

        /* renamed from: e, reason: collision with root package name */
        int f59972e;

        public e(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f59970c = obj;
            this.f59972e |= Integer.MIN_VALUE;
            return X.this.a((List) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59973a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f59975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, zu.d dVar) {
            super(2, dVar);
            this.f59975c = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return X.this.new f(this.f59975c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f59973a;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                P p10 = new P(X.this.f59954a.b().getUrl(), X.this.f59954a.b().getName(), X.this.f59954a.a(), this.f59975c, null, 16, null);
                this.f59973a = 1;
                objA = p10.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
                objA = ((tu.z) obj).m7139unboximpl();
            }
            X x10 = X.this;
            List list = this.f59975c;
            if (tu.z.m7137isSuccessimpl(objA)) {
                x10.f59955b.b(list);
            }
            X x11 = X.this;
            List list2 = this.f59975c;
            if (tu.z.m7134exceptionOrNullimpl(objA) != null) {
                x11.f59955b.c(list2);
            }
            return tu.z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f59976a;

        /* renamed from: b, reason: collision with root package name */
        Object f59977b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59978c;

        /* renamed from: e, reason: collision with root package name */
        int f59980e;

        public g(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f59978c = obj;
            this.f59980e |= Integer.MIN_VALUE;
            Object objA = X.this.a(0, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : tu.z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f59981a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f59983c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Q q10, zu.d dVar) {
            super(2, dVar);
            this.f59983c = q10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return X.this.new h(this.f59983c, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r5.a(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r5.a(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r4.f59981a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                tu.a0.throwOnFailure(r5)
                goto L5c
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                tu.a0.throwOnFailure(r5)
                tu.z r5 = (tu.z) r5
                r5.m7139unboximpl()
                goto L5c
            L23:
                tu.a0.throwOnFailure(r5)
                io.bidmachine.analytics.internal.X r5 = io.bidmachine.analytics.internal.X.this
                io.bidmachine.analytics.internal.Q r1 = r4.f59983c
                java.lang.Object r5 = io.bidmachine.analytics.internal.X.a(r5, r1)
                boolean r5 = tu.z.m7137isSuccessimpl(r5)
                if (r5 == 0) goto L4b
                io.bidmachine.analytics.internal.X r5 = io.bidmachine.analytics.internal.X.this
                io.bidmachine.analytics.internal.X$b r1 = io.bidmachine.analytics.internal.X.a(r5)
                io.bidmachine.analytics.MonitorConfig r1 = r1.b()
                int r1 = r1.getBatchSize()
                r4.f59981a = r3
                java.lang.Object r5 = io.bidmachine.analytics.internal.X.a(r5, r1, r4)
                if (r5 != r0) goto L5c
                goto L5b
            L4b:
                io.bidmachine.analytics.internal.X r5 = io.bidmachine.analytics.internal.X.this
                io.bidmachine.analytics.internal.Q r1 = r4.f59983c
                java.util.List r1 = uu.o0.listOf(r1)
                r4.f59981a = r2
                java.lang.Object r5 = io.bidmachine.analytics.internal.X.a(r5, r1, r4)
                if (r5 != r0) goto L5c
            L5b:
                return r0
            L5c:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public X(p0 p0Var, b bVar, V v10) {
        this.f59954a = bVar;
        this.f59955b = v10;
        this.f59956c = bVar.b().getName();
        this.f59957d = CoroutineScopeKt.CoroutineScope(new CoroutineName("AnalyticsMonitor: " + bVar.b().getName()).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(p0Var.c()));
    }

    public final String b() {
        return this.f59956c;
    }

    public final void b(Q q10) {
        if (this.f59959f.get()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f59957d, null, null, new h(q10, null), 3, null);
    }

    public final void a() {
        if (this.f59959f.compareAndSet(false, true)) {
            Object objA = this.f59955b.a(this.f59954a.b().getName(), this.f59954a.c());
            if (tu.z.m7137isSuccessimpl(objA)) {
                BuildersKt__Builders_commonKt.launch$default(this.f59957d, null, null, new c((List) objA, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Q q10) {
        try {
            int i10 = tu.z.f87419c;
            return this.f59955b.a(q10);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, zu.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.X.g
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.X$g r0 = (io.bidmachine.analytics.internal.X.g) r0
            int r1 = r0.f59980e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59980e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.X$g r0 = new io.bidmachine.analytics.internal.X$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f59978c
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59980e
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r9 = r0.f59977b
            java.lang.Object r0 = r0.f59976a
            io.bidmachine.analytics.internal.X r0 = (io.bidmachine.analytics.internal.X) r0
            tu.a0.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r9 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            tu.a0.throwOnFailure(r10)
            int r10 = tu.z.f87419c     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.V r10 = r8.f59955b     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.X$b r2 = r8.f59954a     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.MonitorConfig r2 = r2.b()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.X$b r6 = r8.f59954a     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.X$b r7 = r8.f59954a     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.MonitorConfig r7 = r7.b()     // Catch: java.lang.Throwable -> L31
            int r7 = r7.getBatchSize()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r10.a(r2, r6, r7)     // Catch: java.lang.Throwable -> L31
            boolean r2 = tu.z.m7137isSuccessimpl(r10)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L85
            r2 = r10
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L31
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L82
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L31
            if (r6 < r9) goto L82
            r0.f59976a = r8     // Catch: java.lang.Throwable -> L31
            r0.f59977b = r10     // Catch: java.lang.Throwable -> L31
            r0.f59980e = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L85
            return r1
        L82:
            a(r8, r4, r5, r3)     // Catch: java.lang.Throwable -> L31
        L85:
            r0 = r8
            r9 = r10
        L87:
            java.lang.Throwable r10 = tu.z.m7134exceptionOrNullimpl(r9)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L90
            a(r0, r4, r5, r3)     // Catch: java.lang.Throwable -> L31
        L90:
            tu.z r9 = tu.z.m7130boximpl(r9)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = tu.z.m7131constructorimpl(r9)     // Catch: java.lang.Throwable -> L31
            return r9
        L99:
            int r10 = tu.z.f87419c
            java.lang.Object r9 = tu.a0.createFailure(r9)
            java.lang.Object r9 = tu.z.m7131constructorimpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.a(int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r12, zu.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof io.bidmachine.analytics.internal.X.e
            if (r0 == 0) goto L13
            r0 = r13
            io.bidmachine.analytics.internal.X$e r0 = (io.bidmachine.analytics.internal.X.e) r0
            int r1 = r0.f59972e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59972e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.X$e r0 = new io.bidmachine.analytics.internal.X$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f59970c
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f59972e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r12 = r0.f59969b
            java.lang.Object r0 = r0.f59968a
            io.bidmachine.analytics.internal.X r0 = (io.bidmachine.analytics.internal.X) r0
            tu.a0.throwOnFailure(r13)
            goto L94
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            tu.a0.throwOnFailure(r13)
            io.bidmachine.analytics.internal.V r13 = r11.f59955b
            java.lang.Object r13 = r13.a(r12)
            boolean r2 = tu.z.m7137isSuccessimpl(r13)
            if (r2 == 0) goto L99
            r2 = r13
            tu.x0 r2 = (tu.x0) r2
            io.bidmachine.analytics.internal.X$b r2 = r11.f59954a
            io.bidmachine.analytics.MonitorConfig r2 = r2.b()
            int r2 = r2.getBatchSize()
            java.util.List r12 = uu.y0.chunked(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = uu.q0.collectionSizeOrDefault(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L66:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r12.next()
            java.util.List r4 = (java.util.List) r4
            kotlinx.coroutines.CoroutineScope r5 = r11.f59957d
            io.bidmachine.analytics.internal.X$f r8 = new io.bidmachine.analytics.internal.X$f
            r6 = 0
            r8.<init>(r4, r6)
            r9 = 3
            r10 = 0
            r7 = 0
            kotlinx.coroutines.Deferred r4 = kotlinx.coroutines.BuildersKt.async$default(r5, r6, r7, r8, r9, r10)
            r2.add(r4)
            goto L66
        L85:
            r0.f59968a = r11
            r0.f59969b = r13
            r0.f59972e = r3
            java.lang.Object r12 = kotlinx.coroutines.AwaitKt.awaitAll(r2, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            r0 = r11
            r12 = r13
        L94:
            r0.a(r3)
            r13 = r12
            goto L9a
        L99:
            r0 = r11
        L9a:
            java.lang.Throwable r12 = tu.z.m7134exceptionOrNullimpl(r13)
            if (r12 == 0) goto La3
            r0.a(r3)
        La3:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.a(java.util.List, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void a(X x10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        x10.a(z10);
    }

    private final void a(boolean z10) {
        Job job;
        if (this.f59959f.get()) {
            return;
        }
        if (z10 || (job = this.f59958e) == null || !job.isActive()) {
            Job job2 = this.f59958e;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.f59958e = BuildersKt__Builders_commonKt.launch$default(this.f59957d, null, null, new d(null), 3, null);
        }
    }
}
