package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class ld implements mh.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76451c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd f76452e;

    public /* synthetic */ ld(nd ndVar, Object obj, int i10) {
        this.f76450b = i10;
        this.f76452e = ndVar;
        this.f76451c = obj;
    }

    @Override // mh.v0
    public final Object apply(Object obj) {
        switch (this.f76450b) {
            case 0:
                md mdVar = (md) this.f76452e;
                return mdVar.f76505i.transformEntry(this.f76451c, obj);
            default:
                return this.f76452e.f76505i.transformEntry(this.f76451c, obj);
        }
    }
}
