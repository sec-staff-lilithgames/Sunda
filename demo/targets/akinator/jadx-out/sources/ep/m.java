package ep;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final e f54886a;

    public m(e eVar) {
        this.f54886a = eVar;
    }

    public boolean hasBothEyeViews() {
        e eVar = this.f54886a;
        if (eVar == null) {
            return false;
        }
        h hVar = eVar.f54838a;
        return hVar.f54867a && hVar.f54868b;
    }
}
