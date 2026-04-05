package u7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f8.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f8.c f87989d;

    public h(f8.c cVar) {
        this.f87989d = cVar;
    }

    @Override // f8.c
    public Float getValue(f8.b bVar) {
        Float f10 = (Float) this.f87989d.getValue(bVar);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
