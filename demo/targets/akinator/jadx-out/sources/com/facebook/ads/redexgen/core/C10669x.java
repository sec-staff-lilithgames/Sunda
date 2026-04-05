package com.facebook.ads.redexgen.core;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.http.ContentDisposition;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0016J\b\u0010%\u001a\u00020&H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006'"}, d2 = {"Lkotlin/collections/EmptyList;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "serialVersionUID", "", ContentDisposition.Parameters.Size, "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "readResolve", "subList", "fromIndex", "toIndex", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10669x implements List, Serializable, RandomAccess {
    public static byte[] A00 = null;
    public static final C10669x A01;
    public static final long serialVersionUID = -7390468764508069838L;

    static {
        A05();
        A01 = new C10669x();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{65, 53, -119, -124, 94, -125, 121, 122, -115, 79, 53, -109, -69, -66, -62, -57, 110, -70, -73, -63, -62, 110, -78, -67, -77, -63, -68, 117, -62, 110, -79, -67, -68, -62, -81, -73, -68, 110, -77, -70, -77, -69, -77, -68, -62, 110, -81, -62, 110, -73, -68, -78, -77, -58, 110, 96, -123, 123, 124, -113, 81, 55, 120, -103, -114, -101, -118, -99, -110, -104, -105, 73, -110, -100, 73, -105, -104, -99, 73, -100, -98, -103, -103, -104, -101, -99, -114, -115, 73, -113, -104, -101, 73, -101, -114, -118, -115, 86, -104, -105, -107, -94, 73, -116, -104, -107, -107, -114, -116, -99, -110, -104, -105, -50, -48, 106, 123, 123, 106, -126, -84, -77, -84, -76, -84, -75, -69, -25, -18, -25, -17, -25, -16, -10, -11, -48, -36, -39, -41, -77, -40, -50, -49, -30, -92, -118};
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException(A03(62, 51, 37));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p8.A02(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C2628p6.A09(tArr, A03(115, 5, 5));
        return (T[]) p8.A03(this, tArr);
    }

    private final int A00() {
        return 0;
    }

    private final int A01(Void r42) {
        C2628p6.A09(r42, A03(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 7, 67));
        return -1;
    }

    private final int A02(Void r42) {
        C2628p6.A09(r42, A03(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 7, 67));
        return -1;
    }

    private final Void A04(int i10) {
        throw new IndexOutOfBoundsException(A03(11, 44, 74) + i10 + '.');
    }

    private final boolean A06(Void r42) {
        C2628p6.A09(r42, A03(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 7, 67));
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (0 == 0) {
            return false;
        }
        return A06(null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        C2628p6.A09(elements, A03(127, 8, 126));
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object other) {
        return (other instanceof List) && ((List) other).isEmpty();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        A04(i10);
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (0 == 0) {
            return -1;
        }
        return A01(null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C10679y.A01;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (0 == 0) {
            return -1;
        }
        return A02(null);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C10679y.A01;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int index) {
        if (index == 0) {
            return C10679y.A01;
        }
        throw new IndexOutOfBoundsException(A03(55, 7, 19) + index);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return A00();
    }

    @Override // java.util.List
    public final List subList(int fromIndex, int toIndex) {
        if (fromIndex == 0 && toIndex == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(A03(135, 11, 102) + fromIndex + A03(0, 11, 17) + toIndex);
    }

    public final String toString() {
        return A03(113, 2, 111);
    }
}
