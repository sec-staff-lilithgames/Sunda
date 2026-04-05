package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u extends q implements Set {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f76673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, Object obj, Set set) {
        super(wVar, obj, set, null);
        this.f76673h = wVar;
    }

    @Override // nh.q, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zC = og.c((Set) this.f76572c, collection);
        if (zC) {
            this.f76673h.f76727i += this.f76572c.size() - size;
            e();
        }
        return zC;
    }
}
