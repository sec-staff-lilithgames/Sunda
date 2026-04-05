package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class a implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequest f59832c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rr.b f59833e;

    public /* synthetic */ a(AdRequest adRequest, rr.b bVar, int i10) {
        this.f59831b = i10;
        this.f59832c = adRequest;
        this.f59833e = bVar;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f59831b) {
            case 0:
                return this.f59832c.lambda$log$7(this.f59833e);
            default:
                return this.f59832c.lambda$logError$8(this.f59833e);
        }
    }
}
