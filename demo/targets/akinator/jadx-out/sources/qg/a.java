package qg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f83108a;

    public a(c cVar) {
        this.f83108a = cVar;
    }

    @Override // qg.u
    public void onCheckedChanged(v vVar, boolean z10) {
        c cVar = this.f83108a;
        if (z10) {
            if (!cVar.a(vVar)) {
                return;
            }
        } else if (!cVar.c(vVar, cVar.f83115e)) {
            return;
        }
        cVar.b();
    }
}
