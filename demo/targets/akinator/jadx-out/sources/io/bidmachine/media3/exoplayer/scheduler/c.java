package io.bidmachine.media3.exoplayer.scheduler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f61556c;

    public /* synthetic */ c(d dVar, int i10) {
        this.f61555b = i10;
        this.f61556c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f61555b) {
            case 0:
                RequirementsWatcher requirementsWatcher = this.f61556c.f61559c;
                if (requirementsWatcher.f61553g != null) {
                    requirementsWatcher.a();
                    break;
                }
                break;
            default:
                RequirementsWatcher requirementsWatcher2 = this.f61556c.f61559c;
                if (requirementsWatcher2.f61553g != null && (requirementsWatcher2.f61552f & 3) != 0) {
                    requirementsWatcher2.a();
                    break;
                }
                break;
        }
    }
}
