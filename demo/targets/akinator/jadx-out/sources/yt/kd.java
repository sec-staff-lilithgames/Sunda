package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kd extends a {

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f95826e;

    /* renamed from: f, reason: collision with root package name */
    public final st.o f95827f;

    /* renamed from: g, reason: collision with root package name */
    public final tw.b f95828g;

    public kd(mt.l lVar, tw.b bVar, st.o oVar, tw.b bVar2) {
        super(lVar);
        this.f95826e = bVar;
        this.f95827f = oVar;
        this.f95828g = bVar2;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        mt.l lVar = this.f95121c;
        tw.b bVar = this.f95826e;
        st.o oVar = this.f95827f;
        tw.b bVar2 = this.f95828g;
        if (bVar2 == null) {
            jd jdVar = new jd(cVar, oVar);
            cVar.onSubscribe(jdVar);
            if (bVar != null) {
                gd gdVar = new gd(0L, jdVar);
                if (jdVar.f95758e.replace(gdVar)) {
                    bVar.subscribe(gdVar);
                }
            }
            lVar.subscribe((mt.q) jdVar);
            return;
        }
        hd hdVar = new hd(bVar2, cVar, oVar);
        cVar.onSubscribe(hdVar);
        if (bVar != null) {
            gd gdVar2 = new gd(0L, hdVar);
            if (hdVar.f95610m.replace(gdVar2)) {
                bVar.subscribe(gdVar2);
            }
        }
        lVar.subscribe((mt.q) hdVar);
    }
}
