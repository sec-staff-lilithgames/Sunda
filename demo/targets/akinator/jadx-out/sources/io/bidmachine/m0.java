package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class m0 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60608c;

    public /* synthetic */ m0(String str, int i10) {
        this.f60607b = i10;
        this.f60608c = str;
    }

    @Override // rr.b
    public final Object get() {
        switch (this.f60607b) {
            case 0:
                return BidMachine.lambda$getBidToken$8(this.f60608c);
            case 1:
                return BidMachine.lambda$setEndpoint$1(this.f60608c);
            case 2:
                return BidMachine.lambda$setUSPrivacyString$6(this.f60608c);
            case 3:
                return BidMachine.lambda$initialize$0(this.f60608c);
            case 4:
                return BidMachineFetcher.lambda$release$1(this.f60608c);
            case 5:
                return a.b.k("BidTokenId from bidPayload - ", this.f60608c);
            case 6:
                return a.b.k("BidToken is null by bidTokenId - ", this.f60608c);
            case 7:
                return a.b.l("Network (", this.f60608c, ") adUnit register fail: format not provided");
            case 8:
                return a.b.l("Network (", this.f60608c, ") adUnit register fail: format not provided");
            case 9:
                return a.b.l("Network (", this.f60608c, ") load fail!");
            case 10:
                return a.b.l("Network (", this.f60608c, ") load fail!");
            case 11:
                return a.b.k("Initialization error: ", this.f60608c);
            default:
                return UrlProvider.lambda$setEndpoint$0(this.f60608c);
        }
    }
}
