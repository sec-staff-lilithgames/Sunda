package u7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f88026b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f88025a = i10;
        this.f88026b = obj;
    }

    @Override // u7.a
    public final void onValueChanged() {
        switch (this.f88025a) {
            case 0:
                ((x) this.f88026b).f88037k = true;
                break;
            case 1:
                ((x) this.f88026b).f88037k = true;
                break;
            case 2:
                ((x) this.f88026b).f88037k = true;
                break;
            default:
                a8.a aVar = (a8.a) this.f88026b;
                boolean z10 = aVar.f4175s.getFloatValue() == 1.0f;
                if (z10 != aVar.f4181y) {
                    aVar.f4181y = z10;
                    aVar.f4172p.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
