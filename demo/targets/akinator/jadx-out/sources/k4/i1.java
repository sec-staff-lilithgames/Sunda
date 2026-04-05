package k4;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i1 extends a1 implements a3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(File file, h2 serializer) {
        super(file, serializer);
        kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
        kotlin.jvm.internal.e0.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k4.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(java.lang.Object r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k4.h1
            if (r0 == 0) goto L13
            r0 = r7
            k4.h1 r0 = (k4.h1) r0
            int r1 = r0.f70359m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70359m = r1
            goto L18
        L13:
            k4.h1 r0 = new k4.h1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f70357k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70359m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.io.FileOutputStream r6 = r0.f70356j
            java.io.FileOutputStream r0 = r0.f70355i
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2d
            goto L5f
        L2d:
            r6 = move-exception
            goto L6f
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            tu.a0.throwOnFailure(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f70277c
            boolean r7 = r7.get()
            if (r7 != 0) goto L75
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.f70275a
            r7.<init>(r2)
            k4.h2 r2 = r5.f70276b     // Catch: java.lang.Throwable -> L6d
            k4.x2 r4 = new k4.x2     // Catch: java.lang.Throwable -> L6d
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6d
            r0.f70355i = r7     // Catch: java.lang.Throwable -> L6d
            r0.f70356j = r7     // Catch: java.lang.Throwable -> L6d
            r0.f70359m = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r6 = r7
            r0 = r6
        L5f:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2d
            r6.sync()     // Catch: java.lang.Throwable -> L2d
            r6 = 0
            gv.d.closeFinally(r0, r6)
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L6d:
            r6 = move-exception
            r0 = r7
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            gv.d.closeFinally(r0, r6)
            throw r7
        L75:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.i1.writeData(java.lang.Object, zu.d):java.lang.Object");
    }
}
