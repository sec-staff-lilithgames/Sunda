package com.google.firebase.messaging;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class s implements yi.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29876b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f29875a = i10;
        this.f29876b = obj;
    }

    @Override // yi.b
    public final void handle(yi.a aVar) {
        int i10 = this.f29875a;
        Object obj = this.f29876b;
        switch (i10) {
            case 0:
                t tVar = (t) obj;
                if (tVar.e()) {
                    FirebaseMessaging firebaseMessaging = (FirebaseMessaging) tVar.f29883e;
                    j0 j0Var = FirebaseMessaging.f29723l;
                    firebaseMessaging.g();
                    break;
                }
                break;
            default:
                nj.j jVar = (nj.j) obj;
                jVar.getClass();
                jVar.f76945b.set(((com.google.firebase.b) aVar.getPayload()).f29663a);
                break;
        }
    }
}
