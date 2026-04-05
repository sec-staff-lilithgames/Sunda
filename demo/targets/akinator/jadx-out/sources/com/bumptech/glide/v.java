package com.bumptech.glide;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class v implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public h9.d f16682b = h9.a.getFactory();

    public final v dontTransition() {
        return transition(h9.a.getFactory());
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            return j9.s.bothNullOrEqual(this.f16682b, ((v) obj).f16682b);
        }
        return false;
    }

    public int hashCode() {
        h9.d dVar = this.f16682b;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final v transition(int i10) {
        return transition(new h9.g(i10));
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final v m371clone() {
        try {
            return (v) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final v transition(h9.i iVar) {
        return transition(new h9.h(iVar));
    }

    public final v transition(h9.d dVar) {
        this.f16682b = (h9.d) j9.q.checkNotNull(dVar);
        return this;
    }
}
