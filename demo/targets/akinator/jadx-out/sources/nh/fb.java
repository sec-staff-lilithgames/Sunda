package nh;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class fb extends qb {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb f76268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(gb gbVar, gb gbVar2) {
        super(gbVar2);
        this.f76268c = gbVar;
    }

    @Override // nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        gb gbVar = this.f76268c;
        return eb.d(gbVar.f76296b, gbVar.f76297c, collection);
    }

    @Override // nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        gb gbVar = this.f76268c;
        return eb.e(gbVar.f76296b, gbVar.f76297c, collection);
    }
}
