package wu;

import java.util.RandomAccess;
import tu.o0;
import tu.q0;
import uu.g;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f91295b;

    public b(long[] jArr) {
        this.f91295b = jArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof o0) {
            return m7568containsVKZWuLQ(((o0) obj).m7086unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m7568containsVKZWuLQ(long j10) {
        return q0.m7091containsVKZWuLQ(this.f91295b, j10);
    }

    @Override // uu.g, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return o0.m7080boximpl(m7569getsVKNKU(i10));
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public long m7569getsVKNKU(int i10) {
        return q0.m7095getsVKNKU(this.f91295b, i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return q0.m7096getSizeimpl(this.f91295b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof o0) {
            return m7570indexOfVKZWuLQ(((o0) obj).m7086unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m7570indexOfVKZWuLQ(long j10) {
        return k0.indexOf(this.f91295b, j10);
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return q0.m7098isEmptyimpl(this.f91295b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof o0) {
            return m7571lastIndexOfVKZWuLQ(((o0) obj).m7086unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m7571lastIndexOfVKZWuLQ(long j10) {
        return k0.lastIndexOf(this.f91295b, j10);
    }
}
