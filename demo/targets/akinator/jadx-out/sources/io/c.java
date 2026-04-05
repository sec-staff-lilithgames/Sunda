package io;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f62076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f62077c;

    public /* synthetic */ c(d dVar, int i10) {
        this.f62076b = i10;
        this.f62077c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f62076b) {
            case 0:
                e eVar = this.f62077c.f62090b;
                eVar.f62103i.onFirstFrameRendered(eVar);
                break;
            default:
                e eVar2 = this.f62077c.f62090b;
                eVar2.f62103i.onFrameDropped(eVar2);
                break;
        }
    }
}
