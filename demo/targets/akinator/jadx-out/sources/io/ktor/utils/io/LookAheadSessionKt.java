package io.ktor.utils.io;

import bv.d;
import bv.f;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class LookAheadSessionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.LookAheadSessionKt", f = "LookAheadSession.kt", i = {0, 0, 1, 1, 1}, l = {54, 59}, m = "consumeEachRemaining", n = {"$this$consumeEachRemaining", "visitor", "$this$consumeEachRemaining", "visitor", ApsMetricsDataMap.APSMETRICS_FIELD_SDK}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.LookAheadSessionKt$consumeEachRemaining$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LookAheadSessionKt.consumeEachRemaining(null, null, this);
        }
    }

    public static final void consumeEachRemaining(LookAheadSession lookAheadSession, l visitor) {
        boolean z10;
        e0.checkNotNullParameter(lookAheadSession, "<this>");
        e0.checkNotNullParameter(visitor, "visitor");
        do {
            z10 = false;
            ByteBuffer byteBufferRequest = lookAheadSession.request(0, 1);
            if (byteBufferRequest != null) {
                int iRemaining = byteBufferRequest.remaining();
                boolean zBooleanValue = ((Boolean) visitor.invoke(byteBufferRequest)).booleanValue();
                lookAheadSession.mo4580consumed(iRemaining);
                z10 = zBooleanValue;
            }
        } while (z10);
    }

    private static final Object consumeEachRemaining$$forInline(LookAheadSuspendSession lookAheadSuspendSession, p pVar, zu.d<? super x0> dVar) {
        while (true) {
            ByteBuffer byteBufferRequest = lookAheadSuspendSession.request(0, 1);
            if (byteBufferRequest == null) {
                b0.mark(0);
                Object objAwaitAtLeast = lookAheadSuspendSession.awaitAtLeast(1, dVar);
                b0.mark(1);
                if (!((Boolean) objAwaitAtLeast).booleanValue()) {
                    break;
                }
            } else {
                int iRemaining = byteBufferRequest.remaining();
                boolean zBooleanValue = ((Boolean) pVar.invoke(byteBufferRequest, dVar)).booleanValue();
                lookAheadSuspendSession.mo4580consumed(iRemaining);
                if (!zBooleanValue) {
                    break;
                }
            }
        }
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:17:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:30:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeEachRemaining(io.ktor.utils.io.LookAheadSuspendSession r6, kv.p r7, zu.d<? super tu.x0> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.LookAheadSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.LookAheadSessionKt$consumeEachRemaining$1 r0 = (io.ktor.utils.io.LookAheadSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.LookAheadSessionKt$consumeEachRemaining$1 r0 = new io.ktor.utils.io.LookAheadSessionKt$consumeEachRemaining$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            kv.p r7 = (kv.p) r7
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.LookAheadSuspendSession r2 = (io.ktor.utils.io.LookAheadSuspendSession) r2
            tu.a0.throwOnFailure(r8)
            goto L86
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.L$1
            kv.p r6 = (kv.p) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.LookAheadSuspendSession r7 = (io.ktor.utils.io.LookAheadSuspendSession) r7
            tu.a0.throwOnFailure(r8)
            goto L64
        L4a:
            tu.a0.throwOnFailure(r8)
        L4d:
            r8 = 0
            java.nio.ByteBuffer r8 = r6.request(r8, r4)
            if (r8 != 0) goto L70
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.awaitAtLeast(r4, r0)
            if (r8 != r1) goto L61
            goto L82
        L61:
            r5 = r7
            r7 = r6
            r6 = r5
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L93
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4d
        L70:
            int r2 = r8.remaining()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r8 = r7.invoke(r8, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            r5 = r2
            r2 = r6
            r6 = r5
        L86:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2.mo4580consumed(r6)
            if (r8 == 0) goto L93
            r6 = r2
            goto L4d
        L93:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.LookAheadSessionKt.consumeEachRemaining(io.ktor.utils.io.LookAheadSuspendSession, kv.p, zu.d):java.lang.Object");
    }
}
