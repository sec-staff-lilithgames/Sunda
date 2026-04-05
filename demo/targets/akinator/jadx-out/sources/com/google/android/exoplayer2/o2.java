package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.p f27868a;

    public o2(com.google.android.exoplayer2.util.p pVar) {
        this.f27868a = pVar;
    }

    public boolean contains(int i10) {
        return this.f27868a.contains(i10);
    }

    public boolean containsAny(int... iArr) {
        return this.f27868a.containsAny(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o2) {
            return this.f27868a.equals(((o2) obj).f27868a);
        }
        return false;
    }

    public int get(int i10) {
        return this.f27868a.get(i10);
    }

    public int hashCode() {
        return this.f27868a.hashCode();
    }

    public int size() {
        return this.f27868a.size();
    }
}
