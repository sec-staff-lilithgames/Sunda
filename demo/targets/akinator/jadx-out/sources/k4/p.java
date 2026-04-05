package k4;

import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f70438a;

    /* renamed from: b, reason: collision with root package name */
    public final f f70439b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f70440c;

    /* renamed from: d, reason: collision with root package name */
    public final Flow f70441d;

    /* renamed from: e, reason: collision with root package name */
    public final Mutex f70442e;

    /* renamed from: f, reason: collision with root package name */
    public int f70443f;

    /* renamed from: g, reason: collision with root package name */
    public Job f70444g;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f70445h;

    /* renamed from: i, reason: collision with root package name */
    public final b f70446i;

    /* renamed from: j, reason: collision with root package name */
    public final tu.o f70447j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f70448k;

    /* renamed from: l, reason: collision with root package name */
    public final l2 f70449l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends g2 {

        /* renamed from: c, reason: collision with root package name */
        public List f70450c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f70451d;

        public b(p pVar, List<? extends kv.p> initTasksList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(initTasksList, "initTasksList");
            this.f70451d = pVar;
            this.f70450c = uu.y0.toList(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k4.g2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(bv.d r7) throws k4.e {
            /*
                r6 = this;
                boolean r0 = r7 instanceof k4.q
                if (r0 == 0) goto L13
                r0 = r7
                k4.q r0 = (k4.q) r0
                int r1 = r0.f70466l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f70466l = r1
                goto L18
            L13:
                k4.q r0 = new k4.q
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f70464j
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f70466l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L36
                if (r2 != r3) goto L2e
                k4.p$b r0 = r0.f70463i
                tu.a0.throwOnFailure(r7)
                goto L65
            L2e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L36:
                k4.p$b r0 = r0.f70463i
                tu.a0.throwOnFailure(r7)
                goto L75
            L3c:
                tu.a0.throwOnFailure(r7)
                java.util.List r7 = r6.f70450c
                k4.p r2 = r6.f70451d
                if (r7 == 0) goto L68
                kotlin.jvm.internal.e0.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L4f
                goto L68
            L4f:
                k4.l1 r7 = k4.p.access$getCoordinator(r2)
                k4.t r4 = new k4.t
                r5 = 0
                r4.<init>(r2, r6, r5)
                r0.f70463i = r6
                r0.f70466l = r3
                java.lang.Object r7 = r7.lock(r4, r0)
                if (r7 != r1) goto L64
                goto L73
            L64:
                r0 = r6
            L65:
                k4.g r7 = (k4.g) r7
                goto L77
            L68:
                r0.f70463i = r6
                r0.f70466l = r4
                r7 = 0
                java.lang.Object r7 = k4.p.access$readDataOrHandleCorruption(r2, r7, r0)
                if (r7 != r1) goto L74
            L73:
                return r1
            L74:
                r0 = r6
            L75:
                k4.g r7 = (k4.g) r7
            L77:
                k4.p r0 = r0.f70451d
                k4.x0 r0 = k4.p.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                tu.x0 r7 = tu.x0.f87415a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k4.p.b.a(bv.d):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public p(r2 storage, List<? extends kv.p> initTasksList, f corruptionHandler, CoroutineScope scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(storage, "storage");
        kotlin.jvm.internal.e0.checkNotNullParameter(initTasksList, "initTasksList");
        kotlin.jvm.internal.e0.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f70438a = storage;
        this.f70439b = corruptionHandler;
        this.f70440c = scope;
        this.f70441d = FlowKt.flow(new z(this, null));
        this.f70442e = MutexKt.Mutex$default(false, 1, null);
        this.f70445h = new x0();
        this.f70446i = new b(this, initTasksList);
        this.f70447j = tu.q.lazy(new o0(this));
        this.f70448k = tu.q.lazy(new u(this));
        this.f70449l = new l2(scope, new s0(this), t0.f70516e, new u0(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$decrementCollector(k4.p r5, zu.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof k4.a0
            if (r0 == 0) goto L16
            r0 = r6
            k4.a0 r0 = (k4.a0) r0
            int r1 = r0.f70274m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f70274m = r1
            goto L1b
        L16:
            k4.a0 r0 = new k4.a0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f70272k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70274m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.Mutex r5 = r0.f70271j
            k4.p r0 = r0.f70270i
            tu.a0.throwOnFailure(r6)
            r6 = r5
            r5 = r0
            goto L4d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f70442e
            r0.f70270i = r5
            r0.f70271j = r6
            r0.f70274m = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            int r0 = r5.f70443f     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 + (-1)
            r5.f70443f = r0     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L61
            kotlinx.coroutines.Job r0 = r5.f70444g     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5f
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r4, r3, r4)     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r5 = move-exception
            goto L67
        L5f:
            r5.f70444g = r4     // Catch: java.lang.Throwable -> L5d
        L61:
            r6.unlock(r4)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L67:
            r6.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.access$decrementCollector(k4.p, zu.d):java.lang.Object");
    }

    public static final Object access$doWithWriteFileLock(p pVar, boolean z10, kv.l lVar, zu.d dVar) {
        if (!z10) {
            return pVar.a().lock(new b0(lVar, null), dVar);
        }
        pVar.getClass();
        return lVar.invoke(dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:70)|(6:(1:(1:(2:18|19))(3:20|21|22))|13|14|51|64|65)(5:23|72|24|(3:26|68|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:55|56))(2:57|(2:59|60)(2:61|62)))|50)|47|66|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, k4.p] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$handleUpdate(k4.p r9, k4.o1.a r10, zu.d r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.access$handleUpdate(k4.p, k4.o1$a, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$incrementCollector(k4.p r11, zu.d r12) {
        /*
            r11.getClass()
            boolean r0 = r12 instanceof k4.d0
            if (r0 == 0) goto L16
            r0 = r12
            k4.d0 r0 = (k4.d0) r0
            int r1 = r0.f70310m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f70310m = r1
            goto L1b
        L16:
            k4.d0 r0 = new k4.d0
            r0.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r0.f70308k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70310m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            kotlinx.coroutines.sync.Mutex r11 = r0.f70307j
            k4.p r0 = r0.f70306i
            tu.a0.throwOnFailure(r12)
            r12 = r11
            r11 = r0
            goto L4d
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            tu.a0.throwOnFailure(r12)
            kotlinx.coroutines.sync.Mutex r12 = r11.f70442e
            r0.f70306i = r11
            r0.f70307j = r12
            r0.f70310m = r3
            java.lang.Object r0 = r12.lock(r4, r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            int r0 = r11.f70443f     // Catch: java.lang.Throwable -> L66
            int r0 = r0 + r3
            r11.f70443f = r0     // Catch: java.lang.Throwable -> L66
            if (r0 != r3) goto L69
            kotlinx.coroutines.CoroutineScope r5 = r11.f70440c     // Catch: java.lang.Throwable -> L66
            k4.f0 r8 = new k4.f0     // Catch: java.lang.Throwable -> L66
            r8.<init>(r11, r4)     // Catch: java.lang.Throwable -> L66
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L66
            r11.f70444g = r0     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r0 = move-exception
            r11 = r0
            goto L6f
        L69:
            r12.unlock(r4)
            tu.x0 r11 = tu.x0.f87415a
            return r11
        L6f:
            r12.unlock(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.access$incrementCollector(k4.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$readDataAndUpdateCache(k4.p r8, boolean r9, zu.d r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.access$readDataAndUpdateCache(k4.p, boolean, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: e -> 0x0064, TryCatch #2 {e -> 0x0064, blocks: (B:19:0x005f, B:54:0x0107, B:24:0x006d, B:51:0x00e9, B:32:0x008a, B:40:0x00a8, B:42:0x00ae, B:36:0x0093, B:48:0x00d6), top: B:81:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:61:0x0132, B:63:0x0144, B:64:0x014c), top: B:78:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:61:0x0132, B:63:0x0144, B:64:0x014c), top: B:78:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$readDataOrHandleCorruption(k4.p r9, boolean r10, zu.d r11) throws k4.e {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.access$readDataOrHandleCorruption(k4.p, boolean, zu.d):java.lang.Object");
    }

    public final l1 a() {
        return (l1) this.f70448k.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zu.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k4.g0
            if (r0 == 0) goto L13
            r0 = r6
            k4.g0 r0 = (k4.g0) r0
            int r1 = r0.f70340m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70340m = r1
            goto L18
        L13:
            k4.g0 r0 = new k4.g0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f70338k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70340m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r1 = r0.f70337j
            k4.p r0 = r0.f70336i
            tu.a0.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L30
            goto L68
        L30:
            r6 = move-exception
            goto L6f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            k4.p r2 = r0.f70336i
            tu.a0.throwOnFailure(r6)
            goto L53
        L40:
            tu.a0.throwOnFailure(r6)
            k4.l1 r6 = r5.a()
            r0.f70336i = r5
            r0.f70340m = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L52
            goto L67
        L52:
            r2 = r5
        L53:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            k4.p$b r4 = r2.f70446i     // Catch: java.lang.Throwable -> L6b
            r0.f70336i = r2     // Catch: java.lang.Throwable -> L6b
            r0.f70337j = r6     // Catch: java.lang.Throwable -> L6b
            r0.f70340m = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6b
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L6b:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6f:
            k4.x0 r0 = r0.f70445h
            k4.d2 r2 = new k4.d2
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.b(zu.d):java.lang.Object");
    }

    @Override // k4.n
    public Flow<Object> getData() {
        return this.f70441d;
    }

    public final s2 getStorageConnection$datastore_core_release() {
        return (s2) this.f70447j.getValue();
    }

    @Override // k4.n
    public Object updateData(kv.p pVar, zu.d<Object> dVar) {
        z2 z2Var = (z2) dVar.getContext().get(y2.f70566b);
        if (z2Var != null) {
            z2Var.checkNotUpdating(this);
        }
        return BuildersKt.withContext(new z2(z2Var, this), new r0(this, pVar, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeData$datastore_core_release(java.lang.Object r11, boolean r12, zu.d<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof k4.v0
            if (r0 == 0) goto L13
            r0 = r13
            k4.v0 r0 = (k4.v0) r0
            int r1 = r0.f70538l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70538l = r1
            goto L18
        L13:
            k4.v0 r0 = new k4.v0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f70536j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70538l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.z0 r11 = r0.f70535i
            tu.a0.throwOnFailure(r13)
            goto L54
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            tu.a0.throwOnFailure(r13)
            kotlin.jvm.internal.z0 r5 = new kotlin.jvm.internal.z0
            r5.<init>()
            k4.s2 r13 = r10.getStorageConnection$datastore_core_release()
            k4.w0 r4 = new k4.w0
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f70535i = r5
            r0.f70538l = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r11 = r5
        L54:
            int r11 = r11.f71866b
            java.lang.Integer r11 = bv.b.boxInt(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p.writeData$datastore_core_release(java.lang.Object, boolean, zu.d):java.lang.Object");
    }

    public /* synthetic */ p(r2 r2Var, List list, f fVar, CoroutineScope coroutineScope, int i10, kotlin.jvm.internal.u uVar) {
        this(r2Var, (i10 & 2) != 0 ? uu.p0.emptyList() : list, (i10 & 4) != 0 ? new l4.a() : fVar, (i10 & 8) != 0 ? CoroutineScopeKt.CoroutineScope(k4.a.ioDispatcher().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }
}
