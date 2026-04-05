package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class ee extends ig {
    public abstract ud c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return tdVar.getCount() > 0 && c().count(tdVar.getElement()) == tdVar.getCount();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (obj instanceof td) {
            td tdVar = (td) obj;
            Object element = tdVar.getElement();
            int count = tdVar.getCount();
            if (count != 0) {
                return c().setCount(element, count, 0);
            }
        }
        return false;
    }
}
