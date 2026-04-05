package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x extends y {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f76748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f76749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, int i10) {
        super(zVar);
        this.f76748g = i10;
        this.f76749h = zVar;
    }

    @Override // nh.y
    public final Object a(int i10) {
        switch (this.f76748g) {
            case 0:
                return this.f76749h.f76801e.c(i10);
            default:
                se seVar = this.f76749h.f76801e;
                mh.p1.checkElementIndex(i10, seVar.f76606c);
                return new qe(seVar, i10);
        }
    }
}
