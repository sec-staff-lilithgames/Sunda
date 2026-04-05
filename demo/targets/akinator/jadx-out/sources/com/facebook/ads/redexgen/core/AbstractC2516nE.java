package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2516nE {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T t10) {
        return (T) AbstractC2523nL.A07(iterable.iterator(), t10);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A02(Iterable<T> iterable, InterfaceC2280jB<? super T> predicate) {
        return AbstractC2523nL.A0C(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A03(Iterable<T> removeFrom, InterfaceC2280jB<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? A04((List) removeFrom, (InterfaceC2280jB) AbstractC2279jA.A04(predicate)) : AbstractC2523nL.A0D(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(List<T> list, InterfaceC2280jB<? super T> predicate, int to2, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A44(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n9 = from - 1; n9 >= to2; n9--) {
            list.remove(n9);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.jB != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean A04(java.util.List<T> r5, com.facebook.ads.redexgen.core.InterfaceC2280jB<? super T> r6) {
        /*
            r4 = 0
            r3 = 0
        L2:
            int r0 = r5.size()
            r2 = 1
            if (r4 >= r0) goto L25
            java.lang.Object r1 = r5.get(r4)
            boolean r0 = r6.A44(r1)
            if (r0 != 0) goto L1a
            if (r4 <= r3) goto L18
            r5.set(r3, r1)     // Catch: java.lang.IllegalArgumentException -> L1d java.lang.UnsupportedOperationException -> L21
        L18:
            int r3 = r3 + 1
        L1a:
            int r4 = r4 + 1
            goto L2
        L1d:
            A01(r5, r6, r3, r4)
            return r2
        L21:
            A01(r5, r6, r3, r4)
            return r2
        L25:
            int r0 = r5.size()
            java.util.List r0 = r5.subList(r3, r0)
            r0.clear()
            if (r4 == r3) goto L33
        L32:
            return r2
        L33:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2516nE.A04(java.util.List, com.facebook.ads.redexgen.X.jB):boolean");
    }
}
