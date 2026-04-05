package com.facebook.ads.redexgen.core;

import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", ContentDisposition.Parameters.Size, "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1F<E> extends A3<E> implements List<E> {
    public static byte[] A00;
    public static String[] A01 = {"6o2kpFJ0aaKm", "Y3S9bP6f9KV4WNew3rE8YV0aKQTHvm3f", "vXqfzKlSrGtNrV", "d6q688tFOEkRTmoIavyEO3LGte2Y3zBG", "hfbtQesRf9zCxbPjGMA7grfwj2jMjSJI", "c4b5mEHWRN6KgilP3rpF8phuKVuohhIP", "BtMaQ2U4oqVznSkaM81HDKd2rmhi1ZrT", "jI38cxImdo4ZItvpXhBUuKHr68ZY1LLb"};
    public static final C2634pF A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A01[4].charAt(15) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "AnDFYrIpGP8RiZY0rYL1oA82wmurUP9n";
            bArrCopyOfRange[i13] = (byte) (i14 - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-19, 14, 3, 16, -1, 18, 7, 13, 12, -66, 7, 17, -66, 12, 13, 18, -66, 17, 19, 14, 14, 13, 16, 18, 3, 2, -66, 4, 13, 16, -66, 16, 3, -1, 2, -53, 13, 12, 10, 23, -66, 1, 13, 10, 10, 3, 1, 18, 7, 13, 12};
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    public abstract E get(int index);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int indexOf(E element) {
        int i10 = 0;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C2628p6.A0C(it.next(), element)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int lastIndexOf(E element) {
        C1F<E> c1f = this;
        ListIterator<E> listIterator = c1f.listIterator(c1f.size());
        while (listIterator.hasPrevious()) {
            if (C2628p6.A0C(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException(A06(0, 51, 74));
    }

    static {
        A07();
        A02 = new C2634pF(null);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        boolean z10 = other instanceof List;
        String[] strArr = A01;
        if (strArr[7].charAt(28) != strArr[6].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "QAWRpf6o5gcxm1";
        strArr2[0] = "2gyTGgFlMxEu";
        if (z10) {
            return A02.A06(this, (Collection) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return A02.A02(this);
    }

    @Override // com.facebook.ads.redexgen.core.A3, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new A2(this);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C1G(this, 0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return new C1G(this, index);
    }

    @Override // java.util.List
    public final List<E> subList(int fromIndex, int toIndex) {
        return new C0U(this, fromIndex, toIndex);
    }
}
