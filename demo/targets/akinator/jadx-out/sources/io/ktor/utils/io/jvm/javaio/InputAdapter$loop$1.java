package io.ktor.utils.io.jvm.javaio;

import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InputAdapter$loop$1 extends BlockingAdapter {
    final /* synthetic */ InputAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAdapter$loop$1(Job job, InputAdapter inputAdapter) {
        super(job);
        this.this$0 = inputAdapter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[PHI: r2 r10
      0x0061: PHI (r2v2 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) = (r2v3 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1), (r2v8 io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r10v3 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:20:0x005e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:25:0x0084). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.jvm.javaio.BlockingAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loop(zu.d<? super tu.x0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1$loop$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1$loop$1 r0 = (io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1$loop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1$loop$1 r0 = new io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1$loop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1 r2 = (io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) r2
            tu.a0.throwOnFailure(r10)
            goto L84
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            java.lang.Object r2 = r0.L$1
            io.ktor.utils.io.jvm.javaio.BlockingAdapter r2 = (io.ktor.utils.io.jvm.javaio.BlockingAdapter) r2
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1 r2 = (io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1) r2
            tu.a0.throwOnFailure(r10)
            goto L61
        L44:
            tu.a0.throwOnFailure(r10)
            r10 = 0
            r2 = r9
        L49:
            r2.result = r10
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r10 = io.ktor.utils.io.jvm.javaio.BlockingAdapter.access$rendezvousBlock(r2, r0)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r10 != r5) goto L5e
            bv.h.probeCoroutineSuspended(r0)
        L5e:
            if (r10 != r1) goto L61
            goto L83
        L61:
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
            kotlin.jvm.internal.e0.checkNotNull(r10, r5)
            byte[] r10 = (byte[]) r10
            io.ktor.utils.io.jvm.javaio.InputAdapter r5 = r2.this$0
            io.ktor.utils.io.ByteReadChannel r5 = io.ktor.utils.io.jvm.javaio.InputAdapter.access$getChannel$p(r5)
            int r6 = r2.getOffset()
            int r7 = r2.getLength()
            r0.L$0 = r2
            r8 = 0
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r10 = r5.readAvailable(r10, r6, r7, r0)
            if (r10 != r1) goto L84
        L83:
            return r1
        L84:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r5 = -1
            if (r10 != r5) goto L49
            io.ktor.utils.io.jvm.javaio.InputAdapter r0 = r2.this$0
            kotlinx.coroutines.CompletableJob r0 = io.ktor.utils.io.jvm.javaio.InputAdapter.access$getContext$p(r0)
            r0.complete()
            r2.finish(r10)
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.InputAdapter$loop$1.loop(zu.d):java.lang.Object");
    }
}
