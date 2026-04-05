package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08581i<K, V> extends BD<K, V> implements Serializable {
    public static byte[] A02 = null;
    public static String[] A03 = {"8r4g5TVHuPTTEnOtjBSYLe2NoPZev3PL", "ZANRIcgacCs2MrGdQFs4BnSQ4f0OwMHM", "INAFHP4NB26l7mhFzzAYwDEUO08LdW1T", "w9HTcMerj5Ucor1CBa36675WVQ4LimP", "S0p05mXNQ0J7ss", "bhB1flpiQfpMN0", "TPylgZWOdIZWygeLq1OgLn1DVzZt4taa", "Gp6xvn2xjKoLwUaOKBIxtDMJneYJVeH8"};
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map<K, Collection<V>> A01;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A02 = new byte[]{56, 19, 1, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 0, 31, 25, 26, 23, 2, 19, 18, 86, 2, 30, 19, 86, 53, 25, 26, 26, 19, 21, 2, 31, 25, 24, 86, 5, 6, 19, 21};
    }

    public abstract Collection<V> A0D();

    public abstract Collection<V> A0F(@ParametricNullness K key, Collection<V> collection);

    public abstract <E> Collection<E> A0G(Collection<E> collection);

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public AbstractC08581i(Map<K, Collection<V>> map) {
        AbstractC2279jA.A0C(map.isEmpty());
        this.A01 = map;
    }

    public static /* synthetic */ int A00(AbstractC08581i abstractC08581i) {
        int i10 = abstractC08581i.A00;
        abstractC08581i.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A01(AbstractC08581i abstractC08581i) {
        int i10 = abstractC08581i.A00;
        abstractC08581i.A00 = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int A02(AbstractC08581i abstractC08581i, int i10) {
        int i11 = abstractC08581i.A00 + i10;
        abstractC08581i.A00 = i11;
        return i11;
    }

    public static /* synthetic */ int A03(AbstractC08581i abstractC08581i, int i10) {
        int i11 = abstractC08581i.A00 - i10;
        abstractC08581i.A00 = i11;
        return i11;
    }

    public static <E> Iterator<E> A05(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public void A0A(@CheckForNull Object key) {
        Collection<V> collection = (Collection) AbstractC2562nz.A06(this.A01, key);
        if (collection != null) {
            int count = collection.size();
            collection.clear();
            this.A00 -= count;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.BD
    public final Collection<V> A0B() {
        return new C2350kK(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.BD
    public Iterator<V> A0C() {
        return new BH(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Collection<V> A0E(@ParametricNullness K key) {
        return A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kH != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/1i<TK;TV;>.WrappedCollection;)Ljava/util/List<TV;>; */
    public final List A0H(@ParametricNullness Object key, @CheckForNull List list, C2347kH ancestor) {
        if (list instanceof RandomAccess) {
            return new C08601k(this, key, list, ancestor);
        }
        return new BE(this, key, list, ancestor);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public Map<K, Collection<V>> A0I() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Map<K, Collection<V>> A0J() {
        if (this.A01 instanceof NavigableMap) {
            return new C0Y(this, (NavigableMap) this.A01);
        }
        boolean z10 = this.A01 instanceof SortedMap;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        A03[3] = "NCYt1eTwLWbpcysHbDqNMrCxO6pYN55";
        if (z10) {
            return new C08591j(this, (SortedMap) this.A01);
        }
        return new BG(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final Set<K> A0K() {
        if (this.A01 instanceof NavigableMap) {
            return new C0I(this, (NavigableMap) this.A01);
        }
        if (this.A01 instanceof SortedMap) {
            return new C0X(this, (SortedMap) this.A01);
        }
        return new C08611l(this, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    public final void A0L(Map<K, Collection<V>> map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection<V> collection : map.values()) {
            AbstractC2279jA.A0C(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2577oE
    public boolean AGU(@ParametricNullness K key, @ParametricNullness V value) {
        Collection<V> collection = this.A01.get(key);
        if (collection == null) {
            Collection<V> collectionA0E = A0E(key);
            if (collectionA0E.add(value)) {
                this.A00++;
                this.A01.put(key, collectionA0E);
                return true;
            }
            throw new AssertionError(A04(0, 43, 58));
        }
        if (collection.add(value)) {
            int i10 = this.A00 + 1;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "qdqPg3EJJL9zSp";
            strArr[5] = "JvkYzNNxKsGyOY";
            this.A00 = i10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2577oE
    public void clear() {
        Iterator<Collection<V>> it = this.A01.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2577oE
    public int size() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1i != com.google.common.collect.AbstractMapBasedMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.BD, com.facebook.ads.redexgen.core.InterfaceC2577oE
    public Collection<V> values() {
        return super.values();
    }
}
