package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.0Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C0Z<K, V> extends AbstractC08581i<K, V> implements InterfaceC1076Ah<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC08581i
    public final Collection<V> A0F(@ParametricNullness K key, Collection<V> collection) {
        return A0H(key, (List) collection, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Z != com.google.common.collect.AbstractListMultimap<K, V> */
    public C0Z(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Z != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC08581i
    public final <E> Collection<E> A0G(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Z != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.BD, com.facebook.ads.redexgen.core.InterfaceC2577oE
    public Map<K, Collection<V>> A49() {
        return super.A49();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Z != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC08581i, com.facebook.ads.redexgen.core.InterfaceC2577oE
    public boolean AGU(@ParametricNullness K key, @ParametricNullness V value) {
        return super.AGU(key, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0Z != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.BD
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }
}
