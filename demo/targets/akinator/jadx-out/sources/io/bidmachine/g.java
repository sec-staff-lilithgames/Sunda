package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRequest f60360a;

    public g(AdRequest adRequest) {
        this.f60360a = adRequest;
    }

    @Override // io.bidmachine.s3
    public void onFail(pr.a aVar) {
        this.f60360a.processApiRequestFail(aVar);
    }

    @Override // io.bidmachine.s3
    public void onSuccess(n nVar) {
        this.f60360a.processApiRequestSuccess(nVar);
    }
}
