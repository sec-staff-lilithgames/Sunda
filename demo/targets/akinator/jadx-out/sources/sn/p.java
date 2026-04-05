package sn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f86032c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f86033e;

    public /* synthetic */ p(q qVar, r rVar, int i10) {
        this.f86031b = i10;
        this.f86032c = qVar;
        this.f86033e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f86031b) {
            case 0:
                q qVar = this.f86032c;
                this.f86033e.onDrmKeysLoaded(qVar.f86034a, qVar.f86035b);
                break;
            case 1:
                q qVar2 = this.f86032c;
                this.f86033e.onDrmKeysRestored(qVar2.f86034a, qVar2.f86035b);
                break;
            case 2:
                q qVar3 = this.f86032c;
                this.f86033e.onDrmSessionReleased(qVar3.f86034a, qVar3.f86035b);
                break;
            default:
                q qVar4 = this.f86032c;
                this.f86033e.onDrmKeysRemoved(qVar4.f86034a, qVar4.f86035b);
                break;
        }
    }
}
