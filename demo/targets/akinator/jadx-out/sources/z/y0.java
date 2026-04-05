package z;

import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class y0 extends r1 implements Set, lv.h {

    /* renamed from: c, reason: collision with root package name */
    public final v0 f96992c;

    @Override // z.r1, java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f96992c.add(obj);
    }

    @Override // z.r1, java.util.Set, java.util.Collection
    public boolean addAll(Collection<Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return this.f96992c.addAll(elements);
    }

    @Override // z.r1, java.util.Set, java.util.Collection
    public void clear() {
        this.f96992c.clear();
    }

    @Override // z.r1, java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new x0(this);
    }

    @Override // z.r1, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f96992c.remove(obj);
    }

    @Override // z.r1, java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return this.f96992c.removeAll(elements);
    }

    @Override // z.r1, java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return this.f96992c.retainAll(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(v0 v0Var) {
        super(v0Var);
        kotlin.jvm.internal.e0.checkNotNullParameter(v0Var, gjnZrsdA.QdagvytXgyz);
        this.f96992c = v0Var;
    }
}
