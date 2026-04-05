package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b3 {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$awaitMouseEventDown(u1.c r9, zu.d r10) {
        /*
            boolean r0 = r10 instanceof m0.w2
            if (r0 == 0) goto L13
            r0 = r10
            m0.w2 r0 = (m0.w2) r0
            int r1 = r0.f73854k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73854k = r1
            goto L18
        L13:
            m0.w2 r0 = new m0.w2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f73853j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f73854k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.c r9 = r0.f73852i
            tu.a0.throwOnFailure(r10)
            goto L43
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            tu.a0.throwOnFailure(r10)
        L36:
            r0.f73852i = r9
            r0.f73854k = r3
            u1.o r10 = u1.o.f87647c
            java.lang.Object r10 = r9.awaitPointerEvent(r10, r0)
            if (r10 != r1) goto L43
            return r1
        L43:
            u1.m r10 = (u1.m) r10
            int r2 = r10.m7343getButtonsry648PA()
            boolean r2 = u1.s.m7375isPrimaryPressedaHzCxE(r2)
            if (r2 == 0) goto L36
            java.util.List r2 = r10.getChanges()
            int r4 = r2.size()
            r5 = 0
        L58:
            if (r5 >= r4) goto L79
            java.lang.Object r6 = r2.get(r5)
            u1.c0 r6 = (u1.c0) r6
            int r7 = r6.m7298getTypeT8wyACA()
            u1.y0 r8 = u1.z0.f87698b
            int r8 = r8.m7391getMouseT8wyACA()
            boolean r7 = u1.z0.m7397equalsimpl0(r7, r8)
            if (r7 == 0) goto L36
            boolean r6 = u1.n.changedToDown(r6)
            if (r6 == 0) goto L36
            int r5 = r5 + 1
            goto L58
        L79:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b3.access$awaitMouseEventDown(u1.c, zu.d):java.lang.Object");
    }

    public static final Object mouseSelectionDetector(u1.k0 k0Var, o oVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = e0.h2.forEachGesture(k0Var, new a3(oVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }
}
