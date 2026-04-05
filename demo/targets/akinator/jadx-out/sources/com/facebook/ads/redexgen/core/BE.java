package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: assets/audience_network.dex */
public class BE<V> extends AbstractC08581i<K, V>.WrappedCollection implements List<V> {
    public final /* synthetic */ AbstractC08581i A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.List
    public final boolean addAll(int index, Collection<? extends V> c10) {
        if (c10.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = A06().addAll(index, c10);
        if (zAddAll) {
            AbstractC08581i.A02(this.A00, A02().size() - size);
            if (size == 0) {
                A03();
            }
        }
        return zAddAll;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)V */
    public BE(@ParametricNullness final AbstractC08581i this$0, @CheckForNull Object key, List delegate, C2347kH ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    public final List<V> A06() {
        return (List) A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final void add(@ParametricNullness int index, V element) {
        A04();
        boolean zIsEmpty = A02().isEmpty();
        A06().add(index, element);
        AbstractC08581i.A00(this.A00);
        if (zIsEmpty) {
            A03();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V get(int index) {
        A04();
        return A06().get(index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int indexOf(@CheckForNull Object o10) {
        A04();
        return A06().indexOf(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object o10) {
        A04();
        return A06().lastIndexOf(o10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final ListIterator<V> listIterator() {
        A04();
        return new BF(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final ListIterator<V> listIterator(int index) {
        A04();
        return new BF(this, index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V remove(int index) {
        A04();
        V vRemove = A06().remove(index);
        AbstractC08581i.A01(this.A00);
        A05();
        return vRemove;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @ParametricNullness
    public final V set(@ParametricNullness int index, V element) {
        A04();
        return A06().set(index, element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BE != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final List<V> subList(int fromIndex, int toIndex) {
        A04();
        return this.A00.A0H(A01(), A06().subList(fromIndex, toIndex), A00() == null ? this : A00());
    }
}
