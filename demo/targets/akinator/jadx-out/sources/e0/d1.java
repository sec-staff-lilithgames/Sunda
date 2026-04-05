package e0;

import a2.g5;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f53011a = s2.i.m6817constructorimpl((float) 0.125d) / s2.i.m6817constructorimpl(18);

    public static final boolean a(u1.m mVar, long j10) {
        u1.c0 c0Var;
        List<u1.c0> changes = mVar.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0Var = null;
                break;
            }
            c0Var = changes.get(i10);
            if (u1.b0.m7258equalsimpl0(c0Var.m7294getIdJ3iCeTQ(), j10)) {
                break;
            }
            i10++;
        }
        u1.c0 c0Var2 = c0Var;
        if (c0Var2 != null && c0Var2.getPressed()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$awaitLongPressOrCancellation(u1.k0 r8, u1.c0 r9, zu.d r10) {
        /*
            boolean r0 = r10 instanceof e0.r
            if (r0 == 0) goto L13
            r0 = r10
            e0.r r0 = (e0.r) r0
            int r1 = r0.f53274l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53274l = r1
            goto L18
        L13:
            e0.r r0 = new e0.r
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53273k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53274l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            kotlin.jvm.internal.b1 r8 = r0.f53272j
            u1.c0 r9 = r0.f53271i
            tu.a0.throwOnFailure(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5d
            return r3
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.jvm.internal.b1 r10 = com.google.android.gms.internal.play_billing.a.m(r10)
            kotlin.jvm.internal.b1 r2 = new kotlin.jvm.internal.b1
            r2.<init>()
            r2.f71816b = r9
            a2.g5 r5 = r8.getViewConfiguration()
            long r5 = r5.getLongPressTimeoutMillis()
            e0.t r7 = new e0.t     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            r7.<init>(r8, r2, r10, r3)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            r0.f53271i = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            r0.f53272j = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            r0.f53274l = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.withTimeout(r5, r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5c
            if (r8 != r1) goto L5b
            return r1
        L5b:
            return r3
        L5c:
            r8 = r10
        L5d:
            java.lang.Object r8 = r8.f71816b
            u1.c0 r8 = (u1.c0) r8
            if (r8 != 0) goto L64
            goto L65
        L64:
            r9 = r8
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.access$awaitLongPressOrCancellation(u1.k0, u1.c0, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        if (u1.n.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:22:0x0069). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3748awaitDragOrCancellationrnUCldI(u1.c r17, long r18, zu.d<? super u1.c0> r20) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3748awaitDragOrCancellationrnUCldI(u1.c, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (i1.h.m4185getXimpl(u1.n.positionChangeIgnoreConsumed(r11)) == 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:22:0x0069). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3749awaitHorizontalDragOrCancellationrnUCldI(u1.c r17, long r18, zu.d<? super u1.c0> r20) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3749awaitHorizontalDragOrCancellationrnUCldI(u1.c, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, u1.c0, u1.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0121 -> B:50:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:57:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0181 -> B:50:0x0129). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3750awaitHorizontalPointerSlopOrCancellationgDDlDlE(u1.c r20, long r21, int r23, kv.p r24, zu.d<? super u1.c0> r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3750awaitHorizontalPointerSlopOrCancellationgDDlDlE(u1.c, long, int, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, u1.c0, u1.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0125 -> B:50:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0168 -> B:57:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0185 -> B:50:0x012d). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3751awaitHorizontalTouchSlopOrCancellationjO51t88(u1.c r20, long r21, kv.p r23, zu.d<? super u1.c0> r24) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3751awaitHorizontalTouchSlopOrCancellationjO51t88(u1.c, long, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:54:0x013a, B:58:0x015b], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, u1.c0, u1.o] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011b -> B:51:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0179 -> B:65:0x017f). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3752awaitPointerSlopOrCancellationgDDlDlE(u1.c r20, long r21, int r23, kv.p r24, zu.d<? super u1.c0> r25) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3752awaitPointerSlopOrCancellationgDDlDlE(u1.c, long, int, kv.p, zu.d):java.lang.Object");
    }

    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    public static final Object m3753awaitTouchSlopOrCancellationjO51t88(u1.c cVar, long j10, kv.p pVar, zu.d<? super u1.c0> dVar) {
        return m3752awaitPointerSlopOrCancellationgDDlDlE(cVar, j10, u1.z0.f87698b.m7393getTouchT8wyACA(), pVar, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (i1.h.m4186getYimpl(u1.n.positionChangeIgnoreConsumed(r11)) == 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:22:0x0069). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3754awaitVerticalDragOrCancellationrnUCldI(u1.c r17, long r18, zu.d<? super u1.c0> r20) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3754awaitVerticalDragOrCancellationrnUCldI(u1.c, long, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, u1.c0, u1.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0121 -> B:50:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:57:0x0166). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0181 -> B:50:0x0129). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3755awaitVerticalPointerSlopOrCancellationgDDlDlE(u1.c r20, long r21, int r23, kv.p r24, zu.d<? super u1.c0> r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3755awaitVerticalPointerSlopOrCancellationgDDlDlE(u1.c, long, int, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, u1.c0, u1.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0125 -> B:50:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0168 -> B:57:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0185 -> B:50:0x012d). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3756awaitVerticalTouchSlopOrCancellationjO51t88(u1.c r20, long r21, kv.p r23, zu.d<? super u1.c0> r24) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3756awaitVerticalTouchSlopOrCancellationjO51t88(u1.c, long, kv.p, zu.d):java.lang.Object");
    }

    public static final Object detectDragGestures(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new e0(aVar2, aVar, lVar, pVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectDragGestures$default(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = y.f53402e;
        }
        if ((i10 & 2) != 0) {
            aVar = z.f53430e;
        }
        if ((i10 & 4) != 0) {
            aVar2 = a0.f52957e;
        }
        kv.a aVar3 = aVar2;
        return detectDragGestures(k0Var, lVar, aVar, aVar3, pVar, dVar);
    }

    public static final Object detectDragGesturesAfterLongPress(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new l0(aVar2, aVar, lVar, pVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f0.f53044e;
        }
        if ((i10 & 2) != 0) {
            aVar = g0.f53063e;
        }
        if ((i10 & 4) != 0) {
            aVar2 = h0.f53084e;
        }
        kv.a aVar3 = aVar2;
        return detectDragGesturesAfterLongPress(k0Var, lVar, aVar, aVar3, pVar, dVar);
    }

    public static final Object detectHorizontalDragGestures(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new s0(aVar, aVar2, lVar, pVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = m0.f53173e;
        }
        if ((i10 & 2) != 0) {
            aVar = n0.f53203e;
        }
        if ((i10 & 4) != 0) {
            aVar2 = o0.f53219e;
        }
        kv.a aVar3 = aVar2;
        return detectHorizontalDragGestures(k0Var, lVar, aVar, aVar3, pVar, dVar);
    }

    public static final Object detectVerticalDragGestures(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new z0(aVar, aVar2, lVar, pVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(u1.k0 k0Var, kv.l lVar, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = t0.f53313e;
        }
        if ((i10 & 2) != 0) {
            aVar = u0.f53322e;
        }
        if ((i10 & 4) != 0) {
            aVar2 = v0.f53339e;
        }
        kv.a aVar3 = aVar2;
        return detectVerticalDragGestures(k0Var, lVar, aVar, aVar3, pVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3757dragjO51t88(u1.c r4, long r5, kv.l r7, zu.d<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof e0.a1
            if (r0 == 0) goto L13
            r0 = r8
            e0.a1 r0 = (e0.a1) r0
            int r1 = r0.f52961l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52961l = r1
            goto L18
        L13:
            e0.a1 r0 = new e0.a1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52960k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f52961l
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kv.l r4 = r0.f52959j
            kv.l r4 = (kv.l) r4
            u1.c r5 = r0.f52958i
            tu.a0.throwOnFailure(r8)
            r7 = r4
            r4 = r5
            goto L4c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            tu.a0.throwOnFailure(r8)
        L3c:
            r0.f52958i = r4
            r8 = r7
            kv.l r8 = (kv.l) r8
            r0.f52959j = r8
            r0.f52961l = r3
            java.lang.Object r8 = m3748awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            u1.c0 r8 = (u1.c0) r8
            if (r8 != 0) goto L56
            r4 = 0
            java.lang.Boolean r4 = bv.b.boxBoolean(r4)
            return r4
        L56:
            boolean r5 = u1.n.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L61
            java.lang.Boolean r4 = bv.b.boxBoolean(r3)
            return r4
        L61:
            r7.invoke(r8)
            long r5 = r8.m7294getIdJ3iCeTQ()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3757dragjO51t88(u1.c, long, kv.l, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (i1.h.m4185getXimpl(u1.n.positionChangeIgnoreConsumed(r13)) == 0.0f) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x00e1, B:36:0x00b7], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:24:0x007f). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3758horizontalDragjO51t88(u1.c r18, long r19, kv.l r21, zu.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3758horizontalDragjO51t88(u1.c, long, kv.l, zu.d):java.lang.Object");
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m3759pointerSlopE8SPZFQ(g5 pointerSlop, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return u1.z0.m7397equalsimpl0(i10, u1.z0.f87698b.m7391getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * f53011a : pointerSlop.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (i1.h.m4186getYimpl(u1.n.positionChangeIgnoreConsumed(r13)) == 0.0f) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x00e1, B:36:0x00b7], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007a -> B:24:0x007f). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3760verticalDragjO51t88(u1.c r18, long r19, kv.l r21, zu.d<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d1.m3760verticalDragjO51t88(u1.c, long, kv.l, zu.d):java.lang.Object");
    }
}
