package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t1 implements ExpirationListener {
    @Override // io.bidmachine.ExpirationListener
    public void onExpired(BidToken bidToken) {
        nm.a.d("BidTokenManager", new r1(bidToken, 1));
        u1.d(bidToken.getId());
        bidToken.destroyAdRequest();
    }
}
