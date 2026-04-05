package md;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b0 {
    public abstract k a(jd.e eVar);

    public abstract k b(jd.f fVar);

    public abstract c0 build();

    public abstract k c(jd.j jVar);

    public <T> b0 setEvent(jd.f fVar, jd.e eVar, jd.j jVar) {
        b(fVar);
        a(eVar);
        c(jVar);
        return this;
    }

    public abstract b0 setTransportContext(d0 d0Var);

    public abstract b0 setTransportName(String str);
}
