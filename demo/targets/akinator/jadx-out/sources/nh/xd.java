package nh;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xd extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Iterator f76769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ud f76770g;

    public /* synthetic */ xd(Iterator it, ud udVar, int i10) {
        this.f76768e = i10;
        this.f76769f = it;
        this.f76770g = udVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // nh.b
    public final Object computeNext() {
        int iMin;
        td tdVar;
        Object element;
        int count;
        switch (this.f76768e) {
            case 0:
                do {
                    Iterator it = this.f76769f;
                    if (!it.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        td tdVar2 = (td) it.next();
                        Object element2 = tdVar2.getElement();
                        iMin = Math.min(tdVar2.getCount(), this.f76770g.count(element2));
                    }
                } while (iMin <= 0);
            case 1:
                do {
                    Iterator it2 = this.f76769f;
                    if (!it2.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        tdVar = (td) it2.next();
                        element = tdVar.getElement();
                    }
                } while (tdVar.getCount() <= this.f76770g.count(element));
            default:
                do {
                    Iterator it3 = this.f76769f;
                    if (!it3.hasNext()) {
                        this.f76111b = 3;
                        break;
                    } else {
                        td tdVar3 = (td) it3.next();
                        Object element3 = tdVar3.getElement();
                        count = tdVar3.getCount() - this.f76770g.count(element3);
                    }
                } while (count <= 0);
        }
        return null;
    }
}
