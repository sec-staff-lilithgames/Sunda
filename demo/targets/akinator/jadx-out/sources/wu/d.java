package wu;

import java.util.RandomAccess;
import tu.t0;
import tu.v0;
import uu.g;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short[] f91297b;

    public d(short[] sArr) {
        this.f91297b = sArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t0) {
            return m7576containsxj2QHRw(((t0) obj).m7111unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m7576containsxj2QHRw(short s10) {
        return v0.m7116containsxj2QHRw(this.f91297b, s10);
    }

    @Override // uu.g, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i10) {
        return t0.m7105boximpl(m7577getMh2AYeg(i10));
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public short m7577getMh2AYeg(int i10) {
        return v0.m7120getMh2AYeg(this.f91297b, i10);
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return v0.m7121getSizeimpl(this.f91297b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof t0) {
            return m7578indexOfxj2QHRw(((t0) obj).m7111unboximpl());
        }
        return -1;
    }

    /* renamed from: indexOf-xj2QHRw, reason: not valid java name */
    public int m7578indexOfxj2QHRw(short s10) {
        return k0.indexOf(this.f91297b, s10);
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return v0.m7123isEmptyimpl(this.f91297b);
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof t0) {
            return m7579lastIndexOfxj2QHRw(((t0) obj).m7111unboximpl());
        }
        return -1;
    }

    /* renamed from: lastIndexOf-xj2QHRw, reason: not valid java name */
    public int m7579lastIndexOfxj2QHRw(short s10) {
        return k0.lastIndexOf(this.f91297b, s10);
    }
}
