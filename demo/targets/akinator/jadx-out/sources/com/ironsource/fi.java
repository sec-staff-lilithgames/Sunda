package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class fi implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3304ka f36732c;

    public /* synthetic */ fi(InterfaceC3304ka interfaceC3304ka, int i10) {
        this.f36731b = i10;
        this.f36732c = interfaceC3304ka;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36731b) {
            case 0:
                C3470u1.c(this.f36732c);
                break;
            default:
                C3470u1.d(this.f36732c);
                break;
        }
    }
}
