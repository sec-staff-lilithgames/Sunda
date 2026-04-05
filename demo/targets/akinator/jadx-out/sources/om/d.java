package om;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class d implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f79550c;

    public /* synthetic */ d(e eVar, int i10) {
        this.f79549b = i10;
        this.f79550c = eVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f79549b) {
            case 0:
                e eVar = this.f79550c;
                return eVar.f79554e + " (" + eVar.f79555f + ") - Header bidding collect fail: timeout";
            default:
                e eVar2 = this.f79550c;
                return eVar2.f79554e + " (" + eVar2.f79555f + ") - Header bidding collect finished";
        }
    }
}
