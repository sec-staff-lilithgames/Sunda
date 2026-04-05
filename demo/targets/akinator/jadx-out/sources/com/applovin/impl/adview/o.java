package com.applovin.impl.adview;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f13558c;

    public /* synthetic */ o(a aVar, int i10) {
        this.f13557b = i10;
        this.f13558c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13557b) {
            case 0:
                this.f13558c.s();
                break;
            case 1:
                this.f13558c.p();
                break;
            case 2:
                this.f13558c.r();
                break;
            case 3:
                this.f13558c.q();
                break;
            case 4:
                this.f13558c.t();
                break;
            default:
                this.f13558c.o();
                break;
        }
    }
}
