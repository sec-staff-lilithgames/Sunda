package nh;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g3 extends nb {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f76283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var) {
        super(i3Var);
        this.f76283c = i3Var;
    }

    @Override // nh.nb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f76283c.remove(obj) != null;
    }

    @Override // nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        return this.f76283c.f76349f.h(mh.g2.compose(mh.g2.in(collection), wa.f76739b));
    }

    @Override // nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        return this.f76283c.f76349f.h(mh.g2.compose(mh.g2.not(mh.g2.in(collection)), wa.f76739b));
    }
}
