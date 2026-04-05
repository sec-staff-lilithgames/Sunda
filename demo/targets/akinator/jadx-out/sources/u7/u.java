package u7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends f8.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f8.b f88022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f8.c f88023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x7.c f88024f;

    public u(f8.b bVar, f8.c cVar, x7.c cVar2) {
        this.f88022d = bVar;
        this.f88023e = cVar;
        this.f88024f = cVar2;
    }

    @Override // f8.c
    public x7.c getValue(f8.b bVar) {
        this.f88022d.set(bVar.getStartFrame(), bVar.getEndFrame(), ((x7.c) bVar.getStartValue()).f91759a, ((x7.c) bVar.getEndValue()).f91759a, bVar.getLinearKeyframeProgress(), bVar.getInterpolatedKeyframeProgress(), bVar.getOverallProgress());
        String str = (String) this.f88023e.getValue(this.f88022d);
        x7.c cVar = (x7.c) (bVar.getInterpolatedKeyframeProgress() == 1.0f ? bVar.getEndValue() : bVar.getStartValue());
        this.f88024f.set(str, cVar.f91760b, cVar.f91761c, cVar.f91762d, cVar.f91763e, cVar.f91764f, cVar.f91765g, cVar.f91766h, cVar.f91767i, cVar.f91768j, cVar.f91769k, cVar.f91770l, cVar.f91771m);
        return this.f88024f;
    }
}
