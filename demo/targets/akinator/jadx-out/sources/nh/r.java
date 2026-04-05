package nh;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends p implements ListIterator {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f76590f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(sVar);
        this.f76590f = sVar;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        s sVar = this.f76590f;
        boolean zIsEmpty = sVar.isEmpty();
        b().add(obj);
        sVar.f76614h.f76727i++;
        if (zIsEmpty) {
            sVar.c();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f76546b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, int i10) {
        super(sVar, ((List) sVar.f76572c).listIterator(i10));
        this.f76590f = sVar;
    }
}
