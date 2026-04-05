package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class g1 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60362b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequest f60363c;

    public /* synthetic */ g1(AdRequest adRequest, int i10) {
        this.f60362b = i10;
        this.f60363c = adRequest;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f60362b) {
            case 0:
                return BidMachineFetcher.lambda$fetch$0(this.f60363c);
            default:
                return BidMachineFetcher.lambda$toMap$2(this.f60363c);
        }
    }
}
