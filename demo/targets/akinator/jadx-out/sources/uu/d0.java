package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f88711b;

    public d0(boolean[] zArr) {
        this.f88711b = zArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            return contains(((Boolean) obj).booleanValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88711b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            return indexOf(((Boolean) obj).booleanValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88711b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Boolean) {
            return lastIndexOf(((Boolean) obj).booleanValue());
        }
        return -1;
    }

    public boolean contains(boolean z10) {
        return k0.contains(this.f88711b, z10);
    }

    @Override // uu.g, java.util.List
    public Boolean get(int i10) {
        return Boolean.valueOf(this.f88711b[i10]);
    }

    public int indexOf(boolean z10) {
        return k0.indexOf(this.f88711b, z10);
    }

    public int lastIndexOf(boolean z10) {
        return k0.lastIndexOf(this.f88711b, z10);
    }
}
