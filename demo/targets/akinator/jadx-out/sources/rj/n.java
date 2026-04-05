package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n extends o {

    /* renamed from: j, reason: collision with root package name */
    public l f84479j;

    /* renamed from: k, reason: collision with root package name */
    public b f84480k;

    public static m builder() {
        return new m();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        b bVar = nVar.f84480k;
        if (hashCode() != nVar.hashCode()) {
            return false;
        }
        b bVar2 = this.f84480k;
        return (bVar2 != null || bVar == null) && (bVar2 == null || bVar2.equals(bVar)) && this.f84479j.equals(nVar.f84479j);
    }

    @Override // rj.o
    public b getAction() {
        return this.f84480k;
    }

    @Override // rj.o
    public l getImageData() {
        return this.f84479j;
    }

    public int hashCode() {
        b bVar = this.f84480k;
        return this.f84479j.hashCode() + (bVar != null ? bVar.hashCode() : 0);
    }
}
