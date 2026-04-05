package com.google.android.exoplayer2.scheduler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f28031c;

    public /* synthetic */ c(d dVar, int i10) {
        this.f28030b = i10;
        this.f28031c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28030b) {
            case 0:
                RequirementsWatcher requirementsWatcher = this.f28031c.f28034c;
                if (requirementsWatcher.f28028g != null) {
                    requirementsWatcher.a();
                    break;
                }
                break;
            default:
                RequirementsWatcher requirementsWatcher2 = this.f28031c.f28034c;
                if (requirementsWatcher2.f28028g != null && (requirementsWatcher2.f28027f & 3) != 0) {
                    requirementsWatcher2.a();
                    break;
                }
                break;
        }
    }
}
