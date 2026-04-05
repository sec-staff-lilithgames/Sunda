package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRequest f60329b;

    public d(AdRequest adRequest) {
        this.f60329b = adRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar = t.get();
        AdRequest adRequest = this.f60329b;
        n nVarB = tVar.b(adRequest.adRequestParameters);
        if (nVarB != null) {
            adRequest.processApiRequestSuccess(nVarB);
        } else {
            adRequest.processApiRequestFail(pr.a.f81788f, false);
            adRequest.cancel();
        }
    }
}
