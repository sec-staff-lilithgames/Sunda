package z0;

import java.util.Set;
import p0.j4;
import p0.k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x implements j4 {

    /* renamed from: b, reason: collision with root package name */
    public final Set f97238b;

    /* renamed from: c, reason: collision with root package name */
    public final r0.c f97239c = new r0.c(new k4[16], 0);

    public x(Set<j4> set) {
        this.f97238b = set;
    }

    public final r0.c getPausedRemembers() {
        return this.f97239c;
    }

    @Override // p0.j4
    public void onRemembered() {
        r0.c cVar = this.f97239c;
        Object[] objArr = cVar.f83647b;
        int size = cVar.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            j4 wrapped = ((k4) objArr[i10]).getWrapped();
            this.f97238b.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    @Override // p0.j4
    public void onAbandoned() {
    }

    @Override // p0.j4
    public void onForgotten() {
    }
}
