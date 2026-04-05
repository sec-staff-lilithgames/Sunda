package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class nc extends ku.j {

    /* renamed from: c, reason: collision with root package name */
    public final oc f10711c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10712e;

    public nc(oc ocVar) {
        this.f10711c = ocVar;
    }

    @Override // ku.j, mt.i0, mt.f
    public void onComplete() {
        if (this.f10712e) {
            return;
        }
        this.f10712e = true;
        oc ocVar = this.f10711c;
        tt.d.dispose(ocVar.f10768f);
        ocVar.f10773k = true;
        ocVar.a();
    }

    @Override // ku.j, mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10712e) {
            mu.a.onError(th2);
            return;
        }
        this.f10712e = true;
        oc ocVar = this.f10711c;
        tt.d.dispose(ocVar.f10768f);
        if (!ocVar.f10771i.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            ocVar.f10773k = true;
            ocVar.a();
        }
    }

    @Override // ku.j, mt.i0
    public void onNext(Object obj) {
        if (this.f10712e) {
            return;
        }
        oc ocVar = this.f10711c;
        ocVar.f10770h.offer(oc.f10764m);
        ocVar.a();
    }
}
