package b9;

import n8.v;
import n8.x;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements x {

    /* renamed from: a, reason: collision with root package name */
    public final q8.d f8969a;

    public l(q8.d dVar) {
        this.f8969a = dVar;
    }

    @Override // n8.x
    public v0 decode(m8.b bVar, int i10, int i11, v vVar) {
        return x8.e.obtain(bVar.getNextFrame(), this.f8969a);
    }

    @Override // n8.x
    public boolean handles(m8.b bVar, v vVar) {
        return true;
    }
}
