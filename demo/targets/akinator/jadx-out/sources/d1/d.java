package d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[PHI: r9
      0x0037: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x0024, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void appendStackTrace(java.lang.StringBuilder r12, java.util.List<d1.c> r13) {
        /*
            java.util.List r0 = uu.o0.createListBuilder()
            java.util.List r13 = uu.w0.asReversed(r13)
            r1 = r13
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L14:
            if (r4 >= r1) goto Lc7
            java.lang.Object r7 = r13.get(r4)
            d1.c r7 = (d1.c) r7
            d1.x r8 = r7.getSourceInfo()
            java.lang.String r9 = r8.getFunctionName()
            if (r9 != 0) goto L37
            boolean r9 = r8.isCall()
            if (r9 == 0) goto L2f
            java.lang.String r9 = "<lambda>"
            goto L30
        L2f:
            r9 = r2
        L30:
            if (r9 != 0) goto L37
            if (r5 != 0) goto L38
            java.lang.String r5 = "<unknown function>"
            goto L38
        L37:
            r5 = r9
        L38:
            java.lang.String r9 = r8.getSourceFile()
            if (r9 != 0) goto L43
            if (r6 != 0) goto L44
            java.lang.String r6 = "<unknown file>"
            goto L44
        L43:
            r6 = r9
        L44:
            java.util.List r9 = r8.getLocations()
            java.lang.Integer r10 = r7.getGroupOffset()
            if (r10 == 0) goto L73
            java.lang.Integer r10 = r7.getGroupOffset()
            int r10 = r10.intValue()
            int r11 = r9.size()
            if (r10 >= r11) goto L73
            java.lang.Integer r7 = r7.getGroupOffset()
            int r7 = r7.intValue()
            java.lang.Object r7 = r9.get(r7)
            d1.q r7 = (d1.q) r7
            int r7 = r7.getLineNumber()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto L75
        L73:
            java.lang.String r7 = "<unknown line>"
        L75:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r10 = 40
            r9.append(r10)
            r9.append(r6)
            r10 = 58
            r9.append(r10)
            r9.append(r7)
            r7 = 41
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r9)
            boolean r9 = r8.isCall()
            if (r9 != 0) goto La7
            java.lang.Object r9 = uu.v0.removeLastOrNull(r0)
            java.lang.String r9 = (java.lang.String) r9
        La7:
            java.lang.String r9 = r8.getFunctionName()
            java.lang.String r10 = "rememberCompositionContext"
            boolean r9 = kotlin.jvm.internal.e0.areEqual(r9, r10)
            if (r9 == 0) goto Lc0
            java.lang.String r8 = r8.getPackageHash()
            java.lang.String r9 = "9igjgp"
            boolean r8 = kotlin.jvm.internal.e0.areEqual(r8, r9)
            if (r8 == 0) goto Lc0
            goto Lc3
        Lc0:
            r0.add(r7)
        Lc3:
            int r4 = r4 + 1
            goto L14
        Lc7:
            java.util.List r13 = uu.o0.build(r0)
            java.util.List r13 = uu.w0.asReversed(r13)
            r0 = r13
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
        Ld6:
            if (r3 >= r0) goto Lff
            java.lang.Object r1 = r13.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "\tat "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.append(r1)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r1)
            r2 = 10
            r12.append(r2)
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r1)
            int r3 = r3 + 1
            goto Ld6
        Lff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.d.appendStackTrace(java.lang.StringBuilder, java.util.List):void");
    }

    public static final Throwable attachComposeStackTrace(Throwable th2, kv.a aVar) {
        tryAttachComposeStackTrace(th2, aVar);
        return th2;
    }

    public static final boolean tryAttachComposeStackTrace(Throwable th2, kv.a aVar) {
        o oVar;
        List<Throwable> suppressedExceptions = tu.h.getSuppressedExceptions(th2);
        boolean z10 = false;
        if (!(suppressedExceptions instanceof Collection) || !suppressedExceptions.isEmpty()) {
            Iterator<T> it = suppressedExceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof o) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.invoke();
            boolean zIsEmpty = list.isEmpty();
            z10 = !zIsEmpty;
            oVar = !zIsEmpty ? new o(list) : null;
        } catch (Throwable th3) {
            oVar = th3;
        }
        if (oVar != null) {
            tu.h.addSuppressed(th2, oVar);
        }
        return z10;
    }
}
