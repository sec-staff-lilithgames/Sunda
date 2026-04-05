package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c6 extends w6 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6 f76151e;

    public c6(d6 d6Var) {
        this.f76151e = d6Var;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof td) {
            td tdVar = (td) obj;
            if (tdVar.getCount() > 0 && this.f76151e.count(tdVar.getElement()) == tdVar.getCount()) {
                return true;
            }
        }
        return false;
    }

    @Override // nh.w6
    public final Object get(int i10) {
        return this.f76151e.h(i10);
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f76151e.hashCode();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return this.f76151e.isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76151e.elementSet().size();
    }
}
