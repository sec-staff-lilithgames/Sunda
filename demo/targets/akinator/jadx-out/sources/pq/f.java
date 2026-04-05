package pq;

import br.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements yq.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f81643a;

    public f(e eVar) {
        this.f81643a = eVar;
    }

    @Override // yq.n
    public void a() {
        this.f81643a.f81631d.e();
    }

    @Override // yq.n
    public void onLoaded() {
        e eVar = this.f81643a;
        if (eVar.f81633f.a(true)) {
            eVar.f81631d.b(eVar);
        }
    }

    @Override // yq.n
    public void a(z zVar) {
        e eVar = this.f81643a;
        if (eVar.f81633f.h()) {
            return;
        }
        eVar.f81631d.a(zVar);
    }
}
