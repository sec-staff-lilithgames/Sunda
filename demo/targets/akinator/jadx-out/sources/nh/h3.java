package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h3 extends cc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f76320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(i3 i3Var) {
        super(i3Var);
        this.f76320c = i3Var;
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) obj;
        i3 i3Var = this.f76320c;
        Iterator<Map.Entry<Object, Collection<Object>>> it = i3Var.f76349f.f76492h.asMap().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Collection<Object>> next = it.next();
            Collection collectionG = n3.g(next.getValue(), new m3(i3Var.f76349f, next.getKey()));
            if (!collectionG.isEmpty() && collection.equals(collectionG)) {
                if (collectionG.size() == next.getValue().size()) {
                    it.remove();
                    return true;
                }
                collectionG.clear();
                return true;
            }
        }
        return false;
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f76320c.f76349f.h(mh.g2.compose(mh.g2.in(collection), wa.f76740c));
    }

    @Override // nh.cc, java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f76320c.f76349f.h(mh.g2.compose(mh.g2.not(mh.g2.in(collection)), wa.f76740c));
    }
}
