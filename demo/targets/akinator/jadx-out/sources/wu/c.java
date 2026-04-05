package wu;

import java.util.RandomAccess;
import tu.g0;
import tu.i0;
import uu.g;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f91296b;

    public c(byte[] bArr) {
        this.f91296b = bArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof g0) {
            return m7572contains7apg3OU(((g0) obj).m7036unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m7572contains7apg3OU(byte b10) {
        return i0.m7041contains7apg3OU(this.f91296b, b10);
    }

    @Override // uu.g, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return g0.m7030boximpl(m7573getw2LRezQ(i10));
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m7573getw2LRezQ(int i10) {
        return i0.m7045getw2LRezQ(this.f91296b, i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return i0.m7046getSizeimpl(this.f91296b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof g0) {
            return m7574indexOf7apg3OU(((g0) obj).m7036unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m7574indexOf7apg3OU(byte b10) {
        return k0.indexOf(this.f91296b, b10);
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return i0.m7048isEmptyimpl(this.f91296b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof g0) {
            return m7575lastIndexOf7apg3OU(((g0) obj).m7036unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m7575lastIndexOf7apg3OU(byte b10) {
        return k0.lastIndexOf(this.f91296b, b10);
    }
}
