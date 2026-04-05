package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lt.b f92743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f92744c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f92745e;

    public l(m mVar, lt.b bVar, int i10) {
        this.f92745e = mVar;
        this.f92743b = bVar;
        this.f92744c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f92745e;
        try {
            lt.f fVarTraceTask = lt.c.traceTask("AbstractStream.request");
            try {
                lt.c.linkIn(this.f92743b);
                mVar.f92777a.request(this.f92744c);
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            mVar.deframeFailed(th2);
        }
    }
}
