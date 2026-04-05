package o5;

import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f77686a;

    public p0(int i10) {
        this.f77686a = StateFlowKt.MutableStateFlow(new int[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super int[]> r5, zu.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o5.o0
            if (r0 == 0) goto L13
            r0 = r6
            o5.o0 r0 = (o5.o0) r0
            int r1 = r0.f77679k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77679k = r1
            goto L18
        L13:
            o5.o0 r0 = new o5.o0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f77677i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77679k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            tu.a0.throwOnFailure(r6)
            goto L3f
        L31:
            tu.a0.throwOnFailure(r6)
            r0.f77679k = r3
            kotlinx.coroutines.flow.MutableStateFlow r6 = r4.f77686a
            java.lang.Object r5 = r6.collect(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            tu.k r5 = new tu.k
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p0.collect(kotlinx.coroutines.flow.FlowCollector, zu.d):java.lang.Object");
    }

    public final void increment(Set<Integer> tableIds) {
        MutableStateFlow mutableStateFlow;
        Object value;
        int[] iArr;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            mutableStateFlow = this.f77686a;
            value = mutableStateFlow.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!mutableStateFlow.compareAndSet(value, iArr));
    }
}
