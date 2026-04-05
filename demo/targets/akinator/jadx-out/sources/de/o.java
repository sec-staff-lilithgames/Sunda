package de;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f52157c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f52158e;

    public /* synthetic */ o(p pVar, q qVar, int i10) {
        this.f52156b = i10;
        this.f52157c = pVar;
        this.f52158e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52156b) {
            case 0:
                p pVar = this.f52157c;
                this.f52158e.onDrmKeysRemoved(pVar.f52159a, pVar.f52160b);
                break;
            case 1:
                p pVar2 = this.f52157c;
                this.f52158e.onDrmKeysRestored(pVar2.f52159a, pVar2.f52160b);
                break;
            case 2:
                p pVar3 = this.f52157c;
                this.f52158e.onDrmKeysLoaded(pVar3.f52159a, pVar3.f52160b);
                break;
            default:
                p pVar4 = this.f52157c;
                this.f52158e.onDrmSessionReleased(pVar4.f52159a, pVar4.f52160b);
                break;
        }
    }
}
