package k4;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f70558a;

    public x0() {
        w2 w2Var = w2.f70555b;
        kotlin.jvm.internal.e0.checkNotNull(w2Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f70558a = StateFlowKt.MutableStateFlow(w2Var);
    }

    public final q2 getCurrentState() {
        return (q2) this.f70558a.getValue();
    }

    public final Flow<q2> getFlow() {
        return this.f70558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k4.q2 tryUpdate(k4.q2 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
        L5:
            kotlinx.coroutines.flow.MutableStateFlow r0 = r5.f70558a
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            k4.q2 r2 = (k4.q2) r2
            boolean r3 = r2 instanceof k4.d2
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            k4.w2 r3 = k4.w2.f70555b
            boolean r3 = kotlin.jvm.internal.e0.areEqual(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L2b
        L1d:
            boolean r3 = r2 instanceof k4.g
            if (r3 == 0) goto L2d
            int r3 = r6.getVersion()
            int r4 = r2.getVersion()
            if (r3 <= r4) goto L31
        L2b:
            r2 = r6
            goto L31
        L2d:
            boolean r3 = r2 instanceof k4.j1
            if (r3 == 0) goto L38
        L31:
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L5
            return r2
        L38:
            tu.t r6 = new tu.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.x0.tryUpdate(k4.q2):k4.q2");
    }
}
