package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class vd extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Iterator f76714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ud f76715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Iterator f76716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ud f76717i;

    public /* synthetic */ vd(Iterator it, ud udVar, Iterator it2, ud udVar2, int i10) {
        this.f76713e = i10;
        this.f76714f = it;
        this.f76715g = udVar;
        this.f76716h = it2;
        this.f76717i = udVar2;
    }

    @Override // nh.b
    public final Object computeNext() {
        Object element;
        Object element2;
        switch (this.f76713e) {
            case 0:
                Iterator it = this.f76714f;
                if (!it.hasNext()) {
                    do {
                        Iterator it2 = this.f76716h;
                        if (!it2.hasNext()) {
                            this.f76111b = 3;
                            break;
                        } else {
                            td tdVar = (td) it2.next();
                            element = tdVar.getElement();
                        }
                    } while (this.f76717i.contains(element));
                } else {
                    td tdVar2 = (td) it.next();
                    Object element3 = tdVar2.getElement();
                    break;
                }
            default:
                Iterator it3 = this.f76714f;
                if (!it3.hasNext()) {
                    do {
                        Iterator it4 = this.f76716h;
                        if (!it4.hasNext()) {
                            this.f76111b = 3;
                            break;
                        } else {
                            td tdVar3 = (td) it4.next();
                            element2 = tdVar3.getElement();
                        }
                    } while (this.f76717i.contains(element2));
                } else {
                    td tdVar4 = (td) it3.next();
                    Object element4 = tdVar4.getElement();
                    break;
                }
        }
        return null;
    }
}
