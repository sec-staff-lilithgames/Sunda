package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2617ou {
    public static byte[] A00;
    public static String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00(Set<?> s10) {
        int i10 = 0;
        Iterator<?> it = s10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> A03(SortedSet<E> unfiltered, InterfaceC2280jB<? super E> predicate) {
        if (!(unfiltered instanceof AG)) {
            return new C1T((SortedSet) AbstractC2279jA.A04(unfiltered), (InterfaceC2280jB) AbstractC2279jA.A04(predicate));
        }
        AG ag2 = (AG) unfiltered;
        return new C1T((SortedSet) ag2.A01, AbstractC2282jD.A00(ag2.A00, predicate));
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> Set<E> A07(Set<E> unfiltered, InterfaceC2280jB<? super E> predicate) {
        if (unfiltered instanceof SortedSet) {
            return A03((SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof AG)) {
            return new AG((Set) AbstractC2279jA.A04(unfiltered), (InterfaceC2280jB) AbstractC2279jA.A04(predicate));
        }
        AG ag2 = (AG) unfiltered;
        return new AG((Set) ag2.A01, AbstractC2282jD.A00(ag2.A00, predicate));
    }

    public static void A08() {
        A00 = new byte[]{25, 16, 25, 17, 25, 18, 8, 47, 25, 8, 121, 111, 126, 59, 19, 5, 20, 82};
    }

    static {
        A08();
    }

    public static <E> AbstractC2615os<E> A01(final Set<? extends E> set1, final Set<? extends E> set2) {
        AbstractC2279jA.A05(set1, A04(10, 4, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        AbstractC2279jA.A05(set2, A04(14, 4, 29));
        return new AI(set1, set2);
    }

    public static <E> AbstractC2615os<E> A02(final Set<E> set1, final Set<?> set2) {
        AbstractC2279jA.A05(set1, A04(10, 4, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        AbstractC2279jA.A05(set2, A04(14, 4, 29));
        return new AH(set1, set2);
    }

    public static <E> HashSet<E> A05() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> A06(int expectedSize) {
        return new HashSet<>(AbstractC2562nz.A00(expectedSize));
    }

    public static boolean A09(@CheckForNull Set<?> s10, Object object) {
        if (s10 == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        if (A01[0].length() != 9) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "mkkUVP7U2mO33UgVMEf";
        strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
        Set set = (Set) object;
        try {
            if (s10.size() == set.size()) {
                if (s10.containsAll(set)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(Set<?> set, Collection<?> collection) {
        AbstractC2279jA.A04(collection);
        if (0 != 0) {
            throw new NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return AbstractC2523nL.A0F(set.iterator(), collection);
            }
        }
        Iterator<?> it = collection.iterator();
        String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0B(java.util.Set<?> r2, java.util.Iterator<?> r3) {
        /*
            r1 = 0
        L1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.remove(r0)
            r1 = r1 | r0
            goto L1
        L11:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2617ou.A0B(java.util.Set, java.util.Iterator):boolean");
    }
}
