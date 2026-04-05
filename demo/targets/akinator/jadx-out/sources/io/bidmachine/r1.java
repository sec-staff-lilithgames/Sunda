package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class r1 implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BidToken f61993c;

    public /* synthetic */ r1(BidToken bidToken, int i10) {
        this.f61992b = i10;
        this.f61993c = bidToken;
    }

    @Override // rr.b
    public final Object get() {
        String id2;
        String str;
        switch (this.f61992b) {
            case 0:
                id2 = this.f61993c.getId();
                str = "BidTokenId - ";
                break;
            default:
                id2 = this.f61993c.getId();
                str = "BidToken expired - ";
                break;
        }
        return a.b.k(str, id2);
    }
}
