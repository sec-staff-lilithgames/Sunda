package u1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final x1.d0 f87553a;

    /* renamed from: b, reason: collision with root package name */
    public final k f87554b;

    public f(x1.d0 rootCoordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.f87553a = rootCoordinates;
        this.f87554b = new k();
    }

    public static /* synthetic */ boolean dispatchChanges$default(f fVar, g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return fVar.dispatchChanges(gVar, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* renamed from: addHitPath-KNwqfcY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7302addHitPathKNwqfcY(long r12, java.util.List<? extends u1.i0> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputFilters"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            int r0 = r14.size()
            u1.k r1 = r11.f87554b
            r2 = 1
            r3 = 0
            r4 = r3
        Le:
            if (r4 >= r0) goto L7a
            java.lang.Object r5 = r14.get(r4)
            u1.i0 r5 = (u1.i0) r5
            if (r2 == 0) goto L5f
            r0.c r6 = r1.getChildren()
            int r7 = r6.getSize()
            if (r7 <= 0) goto L3b
            java.lang.Object[] r6 = r6.getContent()
            r8 = r3
        L27:
            r9 = r6[r8]
            r10 = r9
            u1.j r10 = (u1.j) r10
            u1.i0 r10 = r10.getPointerInputFilter()
            boolean r10 = kotlin.jvm.internal.e0.areEqual(r10, r5)
            if (r10 == 0) goto L37
            goto L3c
        L37:
            int r8 = r8 + 1
            if (r8 < r7) goto L27
        L3b:
            r9 = 0
        L3c:
            u1.j r9 = (u1.j) r9
            if (r9 == 0) goto L5e
            r9.markIsIn()
            r0.c r1 = r9.getPointerIds()
            u1.b0 r5 = u1.b0.m7255boximpl(r12)
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L5c
            r0.c r1 = r9.getPointerIds()
            u1.b0 r5 = u1.b0.m7255boximpl(r12)
            r1.add(r5)
        L5c:
            r1 = r9
            goto L77
        L5e:
            r2 = r3
        L5f:
            u1.j r6 = new u1.j
            r6.<init>(r5)
            r0.c r5 = r6.getPointerIds()
            u1.b0 r7 = u1.b0.m7255boximpl(r12)
            r5.add(r7)
            r0.c r1 = r1.getChildren()
            r1.add(r6)
            r1 = r6
        L77:
            int r4 = r4 + 1
            goto Le
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.f.m7302addHitPathKNwqfcY(long, java.util.List):void");
    }

    public final boolean dispatchChanges(g internalPointerEvent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        Map<b0, c0> changes = internalPointerEvent.getChanges();
        k kVar = this.f87554b;
        x1.d0 d0Var = this.f87553a;
        if (kVar.buildCache(changes, d0Var, internalPointerEvent, z10)) {
            return kVar.dispatchFinalEventPass(internalPointerEvent) || kVar.dispatchMainEventPass(internalPointerEvent.getChanges(), d0Var, internalPointerEvent, z10);
        }
        return false;
    }

    public final k getRoot$ui_release() {
        return this.f87554b;
    }

    public final void processCancel() {
        k kVar = this.f87554b;
        kVar.dispatchCancel();
        kVar.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.f87554b.removeDetachedPointerInputFilters();
    }
}
