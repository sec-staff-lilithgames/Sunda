package com.google.firebase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f29673a;

    public /* synthetic */ d(g gVar) {
        this.f29673a = gVar;
    }

    @Override // com.google.firebase.e
    public final void onBackgroundStateChanged(boolean z10) {
        if (z10) {
            return;
        }
        ((zi.c) this.f29673a.f29684h.get()).registerHeartBeat();
    }
}
