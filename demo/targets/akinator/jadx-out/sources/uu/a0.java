package uu;

import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends g implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f88697b;

    public a0(long[] jArr) {
        this.f88697b = jArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Long) {
            return contains(((Number) obj).longValue());
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f88697b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Long) {
            return indexOf(((Number) obj).longValue());
        }
        return -1;
    }

    @Override // uu.a, java.util.Collection
    public boolean isEmpty() {
        return this.f88697b.length == 0;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            return lastIndexOf(((Number) obj).longValue());
        }
        return -1;
    }

    public boolean contains(long j10) {
        return k0.contains(this.f88697b, j10);
    }

    @Override // uu.g, java.util.List
    public Long get(int i10) {
        return Long.valueOf(this.f88697b[i10]);
    }

    public int indexOf(long j10) {
        return k0.indexOf(this.f88697b, j10);
    }

    public int lastIndexOf(long j10) {
        return k0.lastIndexOf(this.f88697b, j10);
    }
}
