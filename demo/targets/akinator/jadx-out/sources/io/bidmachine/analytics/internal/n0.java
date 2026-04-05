package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f60128a;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f60129b;

    /* renamed from: c, reason: collision with root package name */
    private final String f60130c;

    /* renamed from: d, reason: collision with root package name */
    private final CoroutineScope f60131d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ReaderConfig f60132a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60133b;

        /* renamed from: c, reason: collision with root package name */
        private final Struct f60134c;

        /* renamed from: d, reason: collision with root package name */
        private final g0.a f60135d;

        public a(ReaderConfig readerConfig, String str, Struct struct, g0.a aVar) {
            this.f60132a = readerConfig;
            this.f60133b = str;
            this.f60134c = struct;
            this.f60135d = aVar;
        }

        public final g0.a a() {
            return this.f60135d;
        }

        public final Struct b() {
            return this.f60134c;
        }

        public final ReaderConfig c() {
            return this.f60132a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f60136a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60137b;

        /* renamed from: d, reason: collision with root package name */
        int f60139d;

        public b(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f60137b = obj;
            this.f60139d |= Integer.MIN_VALUE;
            Object objA = n0.this.a((String) null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : tu.z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: a, reason: collision with root package name */
        Object f60140a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f60141b;

        /* renamed from: d, reason: collision with root package name */
        int f60143d;

        public c(zu.d dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f60141b = obj;
            this.f60143d |= Integer.MIN_VALUE;
            return n0.this.a((List) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        int f60144a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f60146c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, zu.d dVar) {
            super(2, dVar);
            this.f60146c = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return n0.this.new d(this.f60146c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f60144a;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                g0 g0Var = new g0(n0.this.f60128a.c().getUrl(), n0.this.f60128a.c().getName(), n0.this.f60128a.b(), this.f60146c, n0.this.f60128a.a(), null, 32, null);
                this.f60144a = 1;
                objA = g0Var.a(this);
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
            n0 n0Var = n0.this;
            List list = this.f60146c;
            if (tu.z.m7137isSuccessimpl(objA)) {
                l0 l0Var = n0Var.f60129b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((h0) obj2).b() != null) {
                        arrayList.add(obj2);
                    }
                }
                l0Var.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((h0) obj3).b() == null) {
                        arrayList2.add(obj3);
                    }
                }
                n0Var.f60129b.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    n0Var.a((h0) it.next());
                }
            }
            n0 n0Var2 = n0.this;
            List list2 = this.f60146c;
            if (tu.z.m7134exceptionOrNullimpl(objA) != null) {
                n0Var2.f60129b.c(list2);
            }
            return tu.z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends bv.n implements kv.p {

        /* renamed from: a, reason: collision with root package name */
        Object f60147a;

        /* renamed from: b, reason: collision with root package name */
        int f60148b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f60150d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f60151e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, List list, zu.d dVar) {
            super(2, dVar);
            this.f60150d = str;
            this.f60151e = list;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d create(Object obj, zu.d dVar) {
            return n0.this.new e(this.f60150d, this.f60151e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        
            if (r10.a(r1, r9) == r0) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r9.f60148b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                tu.a0.throwOnFailure(r10)
                goto L9e
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                java.lang.Object r1 = r9.f60147a
                java.util.List r1 = (java.util.List) r1
                tu.a0.throwOnFailure(r10)
                tu.z r10 = (tu.z) r10
                r10.m7139unboximpl()
                goto L8a
            L28:
                tu.a0.throwOnFailure(r10)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                io.bidmachine.analytics.internal.n0 r10 = io.bidmachine.analytics.internal.n0.this
                java.lang.String r4 = r9.f60150d
                java.util.List r5 = r9.f60151e
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L3f:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L56
                java.lang.Object r7 = r5.next()
                r8 = r7
                io.bidmachine.analytics.internal.h0 r8 = (io.bidmachine.analytics.internal.h0) r8
                io.bidmachine.analytics.internal.q0 r8 = r8.b()
                if (r8 == 0) goto L3f
                r6.add(r7)
                goto L3f
            L56:
                io.bidmachine.analytics.internal.n0.a(r10, r4, r6)
                java.util.List r10 = r9.f60151e
                io.bidmachine.analytics.internal.n0 r4 = io.bidmachine.analytics.internal.n0.this
                java.util.Iterator r10 = r10.iterator()
            L61:
                boolean r5 = r10.hasNext()
                if (r5 == 0) goto L7b
                java.lang.Object r5 = r10.next()
                io.bidmachine.analytics.internal.h0 r5 = (io.bidmachine.analytics.internal.h0) r5
                java.lang.Object r6 = io.bidmachine.analytics.internal.n0.a(r4, r5)
                boolean r6 = tu.z.m7136isFailureimpl(r6)
                if (r6 == 0) goto L61
                r1.add(r5)
                goto L61
            L7b:
                io.bidmachine.analytics.internal.n0 r10 = io.bidmachine.analytics.internal.n0.this
                java.lang.String r4 = r9.f60150d
                r9.f60147a = r1
                r9.f60148b = r3
                java.lang.Object r10 = io.bidmachine.analytics.internal.n0.a(r10, r4, r9)
                if (r10 != r0) goto L8a
                goto L9d
            L8a:
                boolean r10 = r1.isEmpty()
                if (r10 != 0) goto L9e
                io.bidmachine.analytics.internal.n0 r10 = io.bidmachine.analytics.internal.n0.this
                r3 = 0
                r9.f60147a = r3
                r9.f60148b = r2
                java.lang.Object r10 = io.bidmachine.analytics.internal.n0.a(r10, r1, r9)
                if (r10 != r0) goto L9e
            L9d:
                return r0
            L9e:
                tu.x0 r10 = tu.x0.f87415a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n0(p0 p0Var, a aVar, l0 l0Var) {
        this.f60128a = aVar;
        this.f60129b = l0Var;
        this.f60130c = aVar.c().getName();
        this.f60131d = CoroutineScopeKt.CoroutineScope(new CoroutineName("AnalyticsMonitor: " + aVar.c().getName()).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(p0Var.c()));
    }

    public final void b(String str, List list) {
        BuildersKt__Builders_commonKt.launch$default(this.f60131d, null, null, new e(str, list, null), 3, null);
    }

    public final String a() {
        return this.f60130c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, List list) {
        try {
            int i10 = tu.z.f87419c;
            l0 l0Var = this.f60129b;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h0) it.next()).e());
            }
            return tu.z.m7131constructorimpl(tu.z.m7130boximpl(l0Var.a(str, arrayList)));
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
    public final java.lang.Object a(java.lang.String r5, zu.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.n0.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.n0$b r0 = (io.bidmachine.analytics.internal.n0.b) r0
            int r1 = r0.f60139d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60139d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.n0$b r0 = new io.bidmachine.analytics.internal.n0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60137b
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f60139d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f60136a
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L2b:
            r5 = move-exception
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            int r6 = tu.z.f87419c     // Catch: java.lang.Throwable -> L2b
            io.bidmachine.analytics.internal.l0 r6 = r4.f60129b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L2b
            boolean r6 = tu.z.m7137isSuccessimpl(r5)     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L5a
            r6 = r5
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L5a
            r0.f60136a = r5     // Catch: java.lang.Throwable -> L2b
            r0.f60139d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L5a
            return r1
        L5a:
            tu.z r5 = tu.z.m7130boximpl(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)     // Catch: java.lang.Throwable -> L2b
            return r5
        L63:
            int r6 = tu.z.f87419c
            java.lang.Object r5 = tu.a0.createFailure(r5)
            java.lang.Object r5 = tu.z.m7131constructorimpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n0.a(java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(h0 h0Var) {
        try {
            int i10 = tu.z.f87419c;
            if (h0Var.b() != null) {
                return this.f60129b.b(h0Var);
            }
            Object objA = this.f60129b.a(h0Var.d(), h0Var.e());
            if (tu.z.m7136isFailureimpl(objA)) {
                objA = null;
            }
            h0 h0Var2 = (h0) objA;
            if (h0Var2 == null) {
                return this.f60129b.b(h0Var);
            }
            return this.f60129b.a(h0.a(h0Var, h0Var2.c(), null, 0L, null, null, null, (this.f60128a.c().getUniqueOnly() && kotlin.jvm.internal.e0.areEqual(h0Var.a(), h0Var2.a())) ? false : true, 62, null));
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
    public final java.lang.Object a(java.util.List r11, zu.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.bidmachine.analytics.internal.n0.c
            if (r0 == 0) goto L13
            r0 = r12
            io.bidmachine.analytics.internal.n0$c r0 = (io.bidmachine.analytics.internal.n0.c) r0
            int r1 = r0.f60143d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60143d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.n0$c r0 = new io.bidmachine.analytics.internal.n0$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f60141b
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f60143d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r12)
            goto L5e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            tu.a0.throwOnFailure(r12)
            io.bidmachine.analytics.internal.l0 r12 = r10.f60129b
            java.lang.Object r12 = r12.a(r11)
            boolean r2 = tu.z.m7137isSuccessimpl(r12)
            if (r2 == 0) goto L5e
            r2 = r12
            tu.x0 r2 = (tu.x0) r2
            kotlinx.coroutines.CoroutineScope r4 = r10.f60131d
            io.bidmachine.analytics.internal.n0$d r7 = new io.bidmachine.analytics.internal.n0$d
            r2 = 0
            r7.<init>(r11, r2)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            kotlinx.coroutines.Deferred r11 = kotlinx.coroutines.BuildersKt.async$default(r4, r5, r6, r7, r8, r9)
            r0.f60140a = r12
            r0.f60143d = r3
            java.lang.Object r11 = r11.await(r0)
            if (r11 != r1) goto L5e
            return r1
        L5e:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n0.a(java.util.List, zu.d):java.lang.Object");
    }
}
