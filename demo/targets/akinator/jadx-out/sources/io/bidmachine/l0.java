package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class l0 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f60589c;

    public /* synthetic */ l0(int i10, Boolean bool) {
        this.f60588b = i10;
        this.f60589c = bool;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f60588b) {
            case 0:
                return BidMachine.lambda$setCoppa$5(this.f60589c);
            default:
                return BidMachine.lambda$setSubjectToGDPR$4(this.f60589c);
        }
    }
}
