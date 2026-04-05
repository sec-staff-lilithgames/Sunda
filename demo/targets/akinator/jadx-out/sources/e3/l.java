package e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends s {
    @Override // e3.s
    public void applyToWidget() {
        int orientation = ((d3.k) this.f53696b).getOrientation();
        h hVar = this.f53702h;
        if (orientation == 1) {
            this.f53696b.setX(hVar.f53668g);
        } else {
            this.f53696b.setY(hVar.f53668g);
        }
    }

    @Override // e3.s
    public final void c() {
        d3.k kVar = (d3.k) this.f53696b;
        int relativeBegin = kVar.getRelativeBegin();
        int relativeEnd = kVar.getRelativeEnd();
        kVar.getRelativePercent();
        int orientation = kVar.getOrientation();
        h hVar = this.f53702h;
        if (orientation == 1) {
            if (relativeBegin != -1) {
                hVar.f53673l.add(this.f53696b.Z.f51777d.f53702h);
                this.f53696b.Z.f51777d.f53702h.f53672k.add(hVar);
                hVar.f53667f = relativeBegin;
            } else if (relativeEnd != -1) {
                hVar.f53673l.add(this.f53696b.Z.f51777d.f53703i);
                this.f53696b.Z.f51777d.f53703i.f53672k.add(hVar);
                hVar.f53667f = -relativeEnd;
            } else {
                hVar.f53663b = true;
                hVar.f53673l.add(this.f53696b.Z.f51777d.f53703i);
                this.f53696b.Z.f51777d.f53703i.f53672k.add(hVar);
            }
            j(this.f53696b.f51777d.f53702h);
            j(this.f53696b.f51777d.f53703i);
            return;
        }
        if (relativeBegin != -1) {
            hVar.f53673l.add(this.f53696b.Z.f51779e.f53702h);
            this.f53696b.Z.f51779e.f53702h.f53672k.add(hVar);
            hVar.f53667f = relativeBegin;
        } else if (relativeEnd != -1) {
            hVar.f53673l.add(this.f53696b.Z.f51779e.f53703i);
            this.f53696b.Z.f51779e.f53703i.f53672k.add(hVar);
            hVar.f53667f = -relativeEnd;
        } else {
            hVar.f53663b = true;
            hVar.f53673l.add(this.f53696b.Z.f51779e.f53703i);
            this.f53696b.Z.f51779e.f53703i.f53672k.add(hVar);
        }
        j(this.f53696b.f51779e.f53702h);
        j(this.f53696b.f51779e.f53703i);
    }

    @Override // e3.s
    public final void d() {
        this.f53702h.clear();
    }

    @Override // e3.s
    public final boolean h() {
        return false;
    }

    public final void j(h hVar) {
        h hVar2 = this.f53702h;
        hVar2.f53672k.add(hVar);
        hVar.f53673l.add(hVar2);
    }

    @Override // e3.s, e3.e
    public void update(e eVar) {
        h hVar = this.f53702h;
        if (hVar.f53664c && !hVar.f53671j) {
            h hVar2 = (h) hVar.f53673l.get(0);
            hVar.resolve((int) ((((d3.k) this.f53696b).getRelativePercent() * hVar2.f53668g) + 0.5f));
        }
    }
}
