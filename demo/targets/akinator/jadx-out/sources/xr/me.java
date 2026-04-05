package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class me implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ne f92806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oe f92807c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f92808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe f92809f;

    public me(qe qeVar, ne neVar, oe oeVar, Object obj) {
        this.f92809f = qeVar;
        this.f92806b = neVar;
        this.f92807c = oeVar;
        this.f92808e = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f92809f) {
            try {
                if (this.f92806b.f92832b == 0) {
                    try {
                        this.f92807c.close(this.f92808e);
                        this.f92809f.f92935a.remove(this.f92807c);
                        if (this.f92809f.f92935a.isEmpty()) {
                            this.f92809f.f92937c.shutdown();
                            this.f92809f.f92937c = null;
                        }
                    } catch (Throwable th2) {
                        this.f92809f.f92935a.remove(this.f92807c);
                        if (this.f92809f.f92935a.isEmpty()) {
                            this.f92809f.f92937c.shutdown();
                            this.f92809f.f92937c = null;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
