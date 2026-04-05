package n6;

import androidx.lifecycle.t1;
import com.applovin.impl.y8;
import java.util.concurrent.Executor;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object await(n6.j0 r4, zu.d<? super n6.i0> r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof n6.m0
            if (r0 == 0) goto L13
            r0 = r5
            n6.m0 r0 = (n6.m0) r0
            int r1 = r0.f75766j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75766j = r1
            goto L18
        L13:
            n6.m0 r0 = new n6.m0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f75765i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f75766j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L46
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            sh.n1 r4 = r4.getResult()
            java.lang.String r5 = "getResult(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r5)
            r0.f75766j = r3
            java.lang.Object r5 = w2.r.await(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.n0.await(n6.j0, zu.d):java.lang.Object");
    }

    public static final j0 launchOperation(final t0 tracer, final String label, final Executor executor, final kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tracer, "tracer");
        kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        final t1 t1Var = new t1(j0.f75749b);
        n1 future = w2.o.getFuture(new w2.l() { // from class: n6.l0
            @Override // w2.l
            public final Object attachCompleter(w2.j completer) {
                kotlin.jvm.internal.e0.checkNotNullParameter(completer, "completer");
                executor.execute(new y8(tracer, label, block, t1Var, completer, 5));
                return tu.x0.f87415a;
            }
        });
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(future, "getFuture(...)");
        return new k0(t1Var, future);
    }
}
