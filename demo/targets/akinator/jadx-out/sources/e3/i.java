package e3;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: m, reason: collision with root package name */
    public int f53674m;

    public i(s sVar) {
        super(sVar);
        if (sVar instanceof n) {
            this.f53666e = 2;
        } else {
            this.f53666e = 3;
        }
    }

    @Override // e3.h
    public void resolve(int i10) {
        if (this.f53671j) {
            return;
        }
        this.f53671j = true;
        this.f53668g = i10;
        Iterator it = this.f53672k.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.update(eVar);
        }
    }
}
