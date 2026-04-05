package y6;

import kotlin.jvm.internal.e0;
import n6.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f94113a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("ConstraintTrkngWrkr");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f94113a = strTagWithPrefix;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$awaitConstraintsNotMet(r6.l r4, v6.b0 r5, zu.d r6) {
        /*
            boolean r0 = r6 instanceof y6.g
            if (r0 == 0) goto L13
            r0 = r6
            y6.g r0 = (y6.g) r0
            int r1 = r0.f94111j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94111j = r1
            goto L18
        L13:
            y6.g r0 = new y6.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94110i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94111j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r6)
            kotlinx.coroutines.flow.Flow r4 = r4.track(r5)
            y6.h r6 = new y6.h
            r2 = 0
            r6.<init>(r5, r2)
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.onEach(r4, r6)
            y6.f r5 = new y6.f
            r5.<init>(r4)
            r0.f94111j = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.first(r5, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r6.c$a r6 = (r6.c.a) r6
            int r4 = r6.getReason()
            java.lang.Integer r4 = bv.b.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.i.access$awaitConstraintsNotMet(r6.l, v6.b0, zu.d):java.lang.Object");
    }
}
