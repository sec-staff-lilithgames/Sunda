package o5;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b2 extends androidx.lifecycle.l1 {

    /* renamed from: l, reason: collision with root package name */
    public final y0 f77503l;

    /* renamed from: m, reason: collision with root package name */
    public final w f77504m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f77505n;

    /* renamed from: o, reason: collision with root package name */
    public final y1 f77506o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f77507p = new AtomicBoolean(true);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f77508q = new AtomicBoolean(false);

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f77509r = new AtomicBoolean(false);

    /* renamed from: s, reason: collision with root package name */
    public final zu.m f77510s;

    public b2(y0 y0Var, w wVar, boolean z10, String[] strArr, kotlin.jvm.internal.u uVar) {
        this.f77503l = y0Var;
        this.f77504m = wVar;
        this.f77505n = z10;
        this.f77506o = new y1(strArr, this);
        this.f77510s = y0Var.inCompatibilityMode$room_runtime_release() ? z10 ? y0Var.getTransactionContext$room_runtime_release() : y0Var.getQueryContext() : zu.n.f98854b;
    }

    public static final void access$invalidated(b2 b2Var) {
        boolean zHasActiveObservers = b2Var.hasActiveObservers();
        if (b2Var.f77507p.compareAndSet(false, true) && zHasActiveObservers) {
            BuildersKt__Builders_commonKt.launch$default(b2Var.f77503l.getCoroutineScope(), b2Var.f77510s, null, new x1(b2Var, null), 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x0031, Exception -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002d, B:28:0x0066), top: B:48:0x002d, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:26:0x005e, B:28:0x0066, B:35:0x007f, B:32:0x0075, B:33:0x007c), top: B:47:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o5.b2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.l1, o5.b2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [o5.b2] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005b -> B:26:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x008e -> B:40:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$refresh(o5.b2 r6, zu.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof o5.a2
            if (r0 == 0) goto L16
            r0 = r7
            o5.a2 r0 = (o5.a2) r0
            int r1 = r0.f77499m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f77499m = r1
            goto L1b
        L16:
            o5.a2 r0 = new o5.a2
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f77497k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77499m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r6 = r0.f77496j
            o5.b2 r2 = r0.f77495i
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            goto L5e
        L31:
            r6 = move-exception
            goto L88
        L33:
            r6 = move-exception
            goto L75
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            tu.a0.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f77509r
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L53
            o5.y0 r7 = r6.f77503l
            o5.y r7 = r7.getInvalidationTracker()
            o5.y1 r2 = r6.f77506o
            r7.addWeakObserver(r2)
        L53:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.f77508q
            boolean r7 = r7.compareAndSet(r3, r4)
            if (r7 == 0) goto L8e
            r7 = 0
            r2 = r6
            r6 = r3
        L5e:
            java.util.concurrent.atomic.AtomicBoolean r5 = r2.f77507p     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L7d
            r0.f77495i = r2     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r0.f77496j = r4     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r0.f77499m = r4     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            java.lang.Object r7 = r2.compute(r0)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r7 != r1) goto L73
            return r1
        L73:
            r6 = r4
            goto L5e
        L75:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "Exception while computing database live data."
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L7d:
            if (r6 == 0) goto L82
            r2.postValue(r7)     // Catch: java.lang.Throwable -> L31
        L82:
            java.util.concurrent.atomic.AtomicBoolean r7 = r2.f77508q
            r7.set(r3)
            goto L90
        L88:
            java.util.concurrent.atomic.AtomicBoolean r7 = r2.f77508q
            r7.set(r3)
            throw r6
        L8e:
            r2 = r6
            r6 = r3
        L90:
            if (r6 == 0) goto L9d
            java.util.concurrent.atomic.AtomicBoolean r6 = r2.f77507p
            boolean r6 = r6.get()
            if (r6 != 0) goto L9b
            goto L9d
        L9b:
            r6 = r2
            goto L53
        L9d:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b2.access$refresh(o5.b2, zu.d):java.lang.Object");
    }

    public abstract Object compute(zu.d<Object> dVar);

    @Override // androidx.lifecycle.l1
    public final void d() {
        this.f77504m.onActive(this);
        BuildersKt__Builders_commonKt.launch$default(this.f77503l.getCoroutineScope(), this.f77510s, null, new z1(this, null), 2, null);
    }

    @Override // androidx.lifecycle.l1
    public final void e() {
        this.f77504m.onInactive(this);
    }
}
