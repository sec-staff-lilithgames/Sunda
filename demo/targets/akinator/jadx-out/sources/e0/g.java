package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f53062a;

    public g(h hVar) {
        this.f53062a = hVar;
    }

    @Override // e0.i1
    public void dragBy(float f10) {
        this.f53062a.getOnDelta().invoke(Float.valueOf(f10));
    }
}
