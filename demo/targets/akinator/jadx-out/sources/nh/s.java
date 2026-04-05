package nh;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s extends q implements List {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f76614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, Object obj, List list, q qVar) {
        super(wVar, obj, list, qVar);
        this.f76614h = wVar;
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        d();
        boolean zIsEmpty = this.f76572c.isEmpty();
        ((List) this.f76572c).add(i10, obj);
        this.f76614h.f76727i++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f76572c).addAll(i10, collection);
        if (zAddAll) {
            this.f76614h.f76727i += this.f76572c.size() - size;
            if (size == 0) {
                c();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public Object get(int i10) {
        d();
        return ((List) this.f76572c).get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        d();
        return ((List) this.f76572c).indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        d();
        return ((List) this.f76572c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        d();
        return new r(this);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        d();
        Object objRemove = ((List) this.f76572c).remove(i10);
        w wVar = this.f76614h;
        wVar.f76727i--;
        e();
        return objRemove;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        d();
        return ((List) this.f76572c).set(i10, obj);
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        d();
        List listSubList = ((List) this.f76572c).subList(i10, i11);
        q qVar = this.f76573e;
        if (qVar == null) {
            qVar = this;
        }
        boolean z10 = listSubList instanceof RandomAccess;
        w wVar = this.f76614h;
        Object obj = this.f76571b;
        return z10 ? new m(wVar, obj, listSubList, qVar) : new s(wVar, obj, listSubList, qVar);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        d();
        return new r(this, i10);
    }
}
