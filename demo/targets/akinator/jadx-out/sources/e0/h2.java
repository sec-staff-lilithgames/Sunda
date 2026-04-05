package e0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h2 {
    public static final boolean allPointersUp(u1.c cVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<this>");
        List<u1.c0> changes = cVar.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (changes.get(i10).getPressed()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (allPointersUp(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0046 -> B:19:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(u1.c r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof e0.f2
            if (r0 == 0) goto L13
            r0 = r7
            e0.f2 r0 = (e0.f2) r0
            int r1 = r0.f53054k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53054k = r1
            goto L18
        L13:
            e0.f2 r0 = new e0.f2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f53053j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53054k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.c r6 = r0.f53052i
            tu.a0.throwOnFailure(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            tu.a0.throwOnFailure(r7)
            boolean r7 = allPointersUp(r6)
            if (r7 != 0) goto L66
        L3c:
            r0.f53052i = r6
            r0.f53054k = r3
            u1.o r7 = u1.o.f87648e
            java.lang.Object r7 = r6.awaitPointerEvent(r7, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            u1.m r7 = (u1.m) r7
            java.util.List r7 = r7.getChanges()
            int r2 = r7.size()
            r4 = 0
        L54:
            if (r4 >= r2) goto L66
            java.lang.Object r5 = r7.get(r4)
            u1.c0 r5 = (u1.c0) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L63
            goto L3c
        L63:
            int r4 = r4 + 1
            goto L54
        L66:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h2.awaitAllPointersUp(u1.c, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [u1.k0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [u1.k0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [u1.k0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [zu.m] */
    /* JADX WARN: Type inference failed for: r8v3, types: [zu.m] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008b -> B:18:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a8 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(u1.k0 r8, kv.p r9, zu.d<? super tu.x0> r10) {
        /*
            boolean r0 = r10 instanceof e0.g2
            if (r0 == 0) goto L13
            r0 = r10
            e0.g2 r0 = (e0.g2) r0
            int r1 = r0.f53074m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53074m = r1
            goto L18
        L13:
            e0.g2 r0 = new e0.g2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f53073l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53074m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L4f
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            zu.m r8 = r0.f53072k
            kv.p r9 = r0.f53071j
            kv.p r9 = (kv.p) r9
            u1.k0 r2 = r0.f53070i
            tu.a0.throwOnFailure(r10)
            goto L4a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            zu.m r8 = r0.f53072k
            kv.p r9 = r0.f53071j
            kv.p r9 = (kv.p) r9
            u1.k0 r2 = r0.f53070i
            tu.a0.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L4d
        L4a:
            r10 = r8
            r8 = r2
            goto L62
        L4d:
            r10 = move-exception
            goto L93
        L4f:
            zu.m r8 = r0.f53072k
            kv.p r9 = r0.f53071j
            kv.p r9 = (kv.p) r9
            u1.k0 r2 = r0.f53070i
            tu.a0.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L4d
            goto L7c
        L5b:
            tu.a0.throwOnFailure(r10)
            zu.m r10 = r0.getContext()
        L62:
            boolean r2 = kotlinx.coroutines.JobKt.isActive(r10)
            if (r2 == 0) goto Lac
            r0.f53070i = r8     // Catch: java.util.concurrent.CancellationException -> L8e
            r2 = r9
            kv.p r2 = (kv.p) r2     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f53071j = r2     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f53072k = r10     // Catch: java.util.concurrent.CancellationException -> L8e
            r0.f53074m = r5     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r2 != r1) goto L7a
            goto Laa
        L7a:
            r2 = r8
            r8 = r10
        L7c:
            r0.f53070i = r2     // Catch: java.util.concurrent.CancellationException -> L4d
            r10 = r9
            kv.p r10 = (kv.p) r10     // Catch: java.util.concurrent.CancellationException -> L4d
            r0.f53071j = r10     // Catch: java.util.concurrent.CancellationException -> L4d
            r0.f53072k = r8     // Catch: java.util.concurrent.CancellationException -> L4d
            r0.f53074m = r4     // Catch: java.util.concurrent.CancellationException -> L4d
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L4d
            if (r10 != r1) goto L4a
            goto Laa
        L8e:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L93:
            boolean r6 = kotlinx.coroutines.JobKt.isActive(r8)
            if (r6 == 0) goto Lab
            r0.f53070i = r2
            r10 = r9
            kv.p r10 = (kv.p) r10
            r0.f53071j = r10
            r0.f53072k = r8
            r0.f53074m = r3
            java.lang.Object r10 = awaitAllPointersUp(r2, r0)
            if (r10 != r1) goto L4a
        Laa:
            return r1
        Lab:
            throw r10
        Lac:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h2.forEachGesture(u1.k0, kv.p, zu.d):java.lang.Object");
    }

    public static final Object awaitAllPointersUp(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        Object objAwaitPointerEventScope = k0Var.awaitPointerEventScope(new e2(2, null), dVar);
        return objAwaitPointerEventScope == av.e.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : tu.x0.f87415a;
    }
}
