package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements rr.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f60323c;

    public /* synthetic */ c(n nVar, int i10) {
        this.f60322b = i10;
        this.f60323c = nVar;
    }

    @Override // rr.b
    public final Object get() {
        int i10 = this.f60322b;
        n nVar = this.f60323c;
        switch (i10) {
            case 0:
                return AdRequest.lambda$processApiRequestSuccess$5(nVar);
            case 1:
                int i11 = n.f61893y;
                nVar.getClass();
                return String.format("detachRequest - %s", nVar);
            case 2:
                int i12 = n.f61893y;
                nVar.getClass();
                return String.format("onLoadStart - %s", nVar);
            case 3:
                int i13 = n.f61893y;
                nVar.getClass();
                return String.format("attachRequest - %s", nVar);
            case 4:
                int i14 = n.f61893y;
                nVar.getClass();
                return String.format("release - %s", nVar);
            case 5:
                int i15 = n.f61893y;
                nVar.getClass();
                return String.format("notifyExpired - %s", nVar);
            case 6:
                int i16 = n.f61893y;
                nVar.getClass();
                return String.format("destroy - %s", nVar);
            case 7:
                return String.format("processImpression - %s", nVar);
            case 8:
                return String.format("processDestroy - %s", nVar);
            case 9:
                return String.format("processLoadSuccess - %s", nVar);
            case 10:
                return String.format("processExpired - %s", nVar);
            case 11:
                return String.format("processClicked - %s", nVar);
            case 12:
                return String.format("processShown - %s", nVar);
            case 13:
                return String.format("processFillAd - %s", nVar);
            case 14:
                return String.format("processFinished - %s", nVar);
            case 15:
                return String.format("onBrokenCreativeEvent - %s", nVar);
            case 16:
                return String.format("receive - %s", nVar);
            case 17:
                return String.format("store - %s", nVar);
            default:
                return String.format("remove - %s", nVar);
        }
    }
}
