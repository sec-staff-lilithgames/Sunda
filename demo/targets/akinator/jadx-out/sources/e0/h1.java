package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.q f53085a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.q f53086b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.j2 f53087c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.q f53088d;

    public h1(kv.q onDragStarted, kv.q onDragStopped, p0.j2 dragStartInteraction, f0.q qVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStarted, "onDragStarted");
        kotlin.jvm.internal.e0.checkNotNullParameter(onDragStopped, "onDragStopped");
        kotlin.jvm.internal.e0.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.f53085a = onDragStarted;
        this.f53086b = onDragStopped;
        this.f53087c = dragStartInteraction;
        this.f53088d = qVar;
    }

    public final p0.j2 getDragStartInteraction() {
        return this.f53087c;
    }

    public final f0.q getInteractionSource() {
        return this.f53088d;
    }

    public final kv.q getOnDragStarted() {
        return this.f53085a;
    }

    public final kv.q getOnDragStopped() {
        return this.f53086b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r9.invoke(r8, r2, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(kotlinx.coroutines.CoroutineScope r8, zu.d<? super tu.x0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof e0.e1
            if (r0 == 0) goto L13
            r0 = r9
            e0.e1 r0 = (e0.e1) r0
            int r1 = r0.f53032m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53032m = r1
            goto L18
        L13:
            e0.e1 r0 = new e0.e1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f53030k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53032m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r9)
            goto L7c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlinx.coroutines.CoroutineScope r8 = r0.f53029j
            e0.h1 r2 = r0.f53028i
            tu.a0.throwOnFailure(r9)
            goto L61
        L3d:
            tu.a0.throwOnFailure(r9)
            p0.j2 r9 = r7.f53087c
            java.lang.Object r9 = r9.getValue()
            f0.b r9 = (f0.b) r9
            if (r9 == 0) goto L67
            f0.q r2 = r7.f53088d
            if (r2 == 0) goto L60
            f0.a r6 = new f0.a
            r6.<init>(r9)
            r0.f53028i = r7
            r0.f53029j = r8
            r0.f53032m = r4
            java.lang.Object r9 = r2.emit(r6, r0)
            if (r9 != r1) goto L60
            goto L7b
        L60:
            r2 = r7
        L61:
            p0.j2 r9 = r2.f53087c
            r9.setValue(r5)
            goto L68
        L67:
            r2 = r7
        L68:
            kv.q r9 = r2.f53086b
            r2 = 0
            java.lang.Float r2 = bv.b.boxFloat(r2)
            r0.f53028i = r5
            r0.f53029j = r5
            r0.f53032m = r3
            java.lang.Object r8 = r9.invoke(r8, r2, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h1.processDragCancel(kotlinx.coroutines.CoroutineScope, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(kotlinx.coroutines.CoroutineScope r8, e0.m.b r9, zu.d<? super tu.x0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof e0.f1
            if (r0 == 0) goto L13
            r0 = r10
            e0.f1 r0 = (e0.f1) r0
            int r1 = r0.f53051o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53051o = r1
            goto L18
        L13:
            e0.f1 r0 = new e0.f1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f53049m
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53051o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            tu.a0.throwOnFailure(r10)
            goto Lb5
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            f0.b r8 = r0.f53048l
            e0.m$b r9 = r0.f53047k
            kotlinx.coroutines.CoroutineScope r2 = r0.f53046j
            e0.h1 r4 = r0.f53045i
            tu.a0.throwOnFailure(r10)
            goto L91
        L44:
            e0.m$b r9 = r0.f53047k
            kotlinx.coroutines.CoroutineScope r8 = r0.f53046j
            e0.h1 r2 = r0.f53045i
            tu.a0.throwOnFailure(r10)
            goto L74
        L4e:
            tu.a0.throwOnFailure(r10)
            p0.j2 r10 = r7.f53087c
            java.lang.Object r10 = r10.getValue()
            f0.b r10 = (f0.b) r10
            if (r10 == 0) goto L73
            f0.q r2 = r7.f53088d
            if (r2 == 0) goto L73
            f0.a r6 = new f0.a
            r6.<init>(r10)
            r0.f53045i = r7
            r0.f53046j = r8
            r0.f53047k = r9
            r0.f53051o = r5
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L73
            goto Lb4
        L73:
            r2 = r7
        L74:
            f0.b r10 = new f0.b
            r10.<init>()
            f0.q r5 = r2.f53088d
            if (r5 == 0) goto L94
            r0.f53045i = r2
            r0.f53046j = r8
            r0.f53047k = r9
            r0.f53048l = r10
            r0.f53051o = r4
            java.lang.Object r4 = r5.emit(r10, r0)
            if (r4 != r1) goto L8e
            goto Lb4
        L8e:
            r4 = r2
            r2 = r8
            r8 = r10
        L91:
            r10 = r8
            r8 = r2
            r2 = r4
        L94:
            p0.j2 r4 = r2.f53087c
            r4.setValue(r10)
            kv.q r10 = r2.f53085a
            long r4 = r9.m3767getStartPointF1C5BW0()
            i1.h r9 = i1.h.m4174boximpl(r4)
            r2 = 0
            r0.f53045i = r2
            r0.f53046j = r2
            r0.f53047k = r2
            r0.f53048l = r2
            r0.f53051o = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h1.processDragStart(kotlinx.coroutines.CoroutineScope, e0.m$b, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r10.invoke(r8, r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(kotlinx.coroutines.CoroutineScope r8, e0.m.c r9, zu.d<? super tu.x0> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof e0.g1
            if (r0 == 0) goto L13
            r0 = r10
            e0.g1 r0 = (e0.g1) r0
            int r1 = r0.f53069n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53069n = r1
            goto L18
        L13:
            e0.g1 r0 = new e0.g1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f53067l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53069n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r10)
            goto L85
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            e0.m$c r9 = r0.f53066k
            kotlinx.coroutines.CoroutineScope r8 = r0.f53065j
            e0.h1 r2 = r0.f53064i
            tu.a0.throwOnFailure(r10)
            goto L65
        L3f:
            tu.a0.throwOnFailure(r10)
            p0.j2 r10 = r7.f53087c
            java.lang.Object r10 = r10.getValue()
            f0.b r10 = (f0.b) r10
            if (r10 == 0) goto L6b
            f0.q r2 = r7.f53088d
            if (r2 == 0) goto L64
            f0.c r6 = new f0.c
            r6.<init>(r10)
            r0.f53064i = r7
            r0.f53065j = r8
            r0.f53066k = r9
            r0.f53069n = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L64
            goto L84
        L64:
            r2 = r7
        L65:
            p0.j2 r10 = r2.f53087c
            r10.setValue(r5)
            goto L6c
        L6b:
            r2 = r7
        L6c:
            kv.q r10 = r2.f53086b
            float r9 = r9.getVelocity()
            java.lang.Float r9 = bv.b.boxFloat(r9)
            r0.f53064i = r5
            r0.f53065j = r5
            r0.f53066k = r5
            r0.f53069n = r3
            java.lang.Object r8 = r10.invoke(r8, r9, r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.h1.processDragStop(kotlinx.coroutines.CoroutineScope, e0.m$c, zu.d):java.lang.Object");
    }
}
