package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1081Am<E> extends AbstractC2476ma<E> implements List<E>, RandomAccess {
    public static byte[] A00 = null;
    public static String[] A01 = {"fHdUBkHaeOb", "RH", "RyMA6PTlrDF2m99nGPMPg2CjhSKVyaSQ", "ENegzNvFlexY3BR2RKk1z4PrLej5P8FF", "wggVriGK93MfFtYQABEEs6Hvem71Ew8R", "ul6RrA3f2JvHqPW8xA7h0PXskLz1uboQ", "Eo8bayYlVcx2q99x4ketqZKtcr", "wTUtZUDKElMjm9Nu5uZgljoHw4l"};
    public static final AF<Object> A02;
    public static final long serialVersionUID = -889275714;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> AbstractC1081Am<E> A05(Collection<? extends E> elements) {
        if (!(elements instanceof AbstractC2476ma)) {
            return A08(elements.toArray());
        }
        AbstractC1081Am<E> abstractC1081AmA0J = ((AbstractC2476ma) elements).A0J();
        return abstractC1081AmA0J.A0K() ? A06(abstractC1081AmA0J.toArray()) : abstractC1081AmA0J;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[0].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[1] = "b9";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 22);
            i13++;
        }
    }

    public static void A0B() {
        A00 = new byte[]{120, 94, 72, 13, 126, 72, 95, 68, 76, 65, 68, 87, 72, 73, 107, 66, 95, 64};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    static {
        A0B();
        A02 = new C0W(C08511b.A02, 0);
    }

    public static <E> C08571h<E> A01() {
        return new C08571h<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    private final AbstractC1081Am<E> A02(final int fromIndex, int toIndex) {
        final int i10 = toIndex - fromIndex;
        return new AbstractC1081Am<E>(fromIndex, i10) { // from class: com.facebook.ads.redexgen.X.1g
            public final transient int A00;
            public final transient int A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            {
                this.A01 = fromIndex;
                this.A00 = i10;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            public final int A0G() {
                return this.A02.A0H() + this.A01 + this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            public final int A0H() {
                return this.A02.A0H() + this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
            @CheckForNull
            public final Object[] A0L() {
                return this.A02.A0L();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1081Am, java.util.List
            /* renamed from: A0M */
            public final AbstractC1081Am<E> subList(int fromIndex2, int toIndex2) {
                AbstractC2279jA.A0B(fromIndex2, toIndex2, this.A00);
                return this.A02.subList(this.A01 + fromIndex2, this.A01 + toIndex2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.List
            public final E get(int index) {
                AbstractC2279jA.A00(index, this.A00);
                return this.A02.get(this.A01 + index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1081Am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ Iterator iterator() {
                return iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1081Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator() {
                return listIterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC1081Am, java.util.List
            public final /* bridge */ /* synthetic */ ListIterator listIterator(int index) {
                return super.listIterator(index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1g != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> AbstractC1081Am<E> A03() {
        return (AbstractC1081Am<E>) C08511b.A02;
    }

    public static <E> AbstractC1081Am<E> A04(E element) {
        return A08(element);
    }

    public static <E> AbstractC1081Am<E> A06(Object[] elements) {
        return A09(elements, elements.length);
    }

    public static <E> AbstractC1081Am<E> A07(E[] elements) {
        if (elements.length == 0) {
            return A03();
        }
        return A08((Object[]) elements.clone());
    }

    public static <E> AbstractC1081Am<E> A08(Object... elements) {
        return A06(AbstractC2589oR.A03(elements));
    }

    public static <E> AbstractC1081Am<E> A09(Object[] elements, int length) {
        if (length == 0) {
            return A03();
        }
        return new C08511b(elements, length);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    public int A0I(Object[] dst, int offset) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = offset + i10;
            dst[i11] = get(i10);
        }
        return offset + size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma
    @Deprecated
    public final AbstractC1081Am<E> A0J() {
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC1081Am<E> subList(int fromIndex, int toIndex) {
        AbstractC2279jA.A0B(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        int length = size();
        if (i10 == length) {
            return this;
        }
        if (i10 == 0) {
            return A03();
        }
        return A02(fromIndex, toIndex);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC2648pg<E> iterator() {
        return listIterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final AF<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public AF<E> listIterator(int i10) {
        AbstractC2279jA.A01(i10, size());
        if (isEmpty()) {
            return (AF<E>) A02;
        }
        return new C0W(this, i10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2476ma, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object object) {
        return indexOf(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        return AbstractC2544ng.A06(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int indexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2544ng.A00(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object object) {
        if (object == null) {
            return -1;
        }
        return AbstractC2544ng.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0A(0, 18, 59));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @Deprecated
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }
}
