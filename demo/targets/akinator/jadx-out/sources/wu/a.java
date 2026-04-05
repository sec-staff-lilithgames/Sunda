package wu;

import java.util.RandomAccess;
import tu.k0;
import tu.m0;
import uu.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f91294b;

    public a(int[] iArr) {
        this.f91294b = iArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k0) {
            return m7564containsWZ4Q5Ns(((k0) obj).m7061unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m7564containsWZ4Q5Ns(int i10) {
        return m0.m7066containsWZ4Q5Ns(this.f91294b, i10);
    }

    @Override // uu.g, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return k0.m7055boximpl(m7565getpVg5ArA(i10));
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public int m7565getpVg5ArA(int i10) {
        return m0.m7070getpVg5ArA(this.f91294b, i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return m0.m7071getSizeimpl(this.f91294b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k0) {
            return m7566indexOfWZ4Q5Ns(((k0) obj).m7061unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m7566indexOfWZ4Q5Ns(int i10) {
        return uu.k0.indexOf(this.f91294b, i10);
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return m0.m7073isEmptyimpl(this.f91294b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k0) {
            return m7567lastIndexOfWZ4Q5Ns(((k0) obj).m7061unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m7567lastIndexOfWZ4Q5Ns(int i10) {
        return uu.k0.lastIndexOf(this.f91294b, i10);
    }
}
