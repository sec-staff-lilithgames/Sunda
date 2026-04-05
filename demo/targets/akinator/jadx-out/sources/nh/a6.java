package nh;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a6 extends ej {

    /* renamed from: b, reason: collision with root package name */
    public int f76088b;

    /* renamed from: c, reason: collision with root package name */
    public Object f76089c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f76090e;

    public a6(ej ejVar) {
        this.f76090e = ejVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f76088b > 0 || this.f76090e.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f76088b <= 0) {
            td tdVar = (td) this.f76090e.next();
            this.f76089c = tdVar.getElement();
            this.f76088b = tdVar.getCount();
        }
        this.f76088b--;
        Object obj = this.f76089c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
