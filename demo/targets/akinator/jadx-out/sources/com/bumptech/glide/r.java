package com.bumptech.glide;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16664b;

    public r(u uVar) {
        this.f16664b = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u uVar = this.f16664b;
        uVar.f16672e.addListener(uVar);
    }
}
