package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v implements ve {

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f93150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93151c = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f93152e;

    public v(x xVar, Runnable runnable) {
        this.f93152e = xVar;
        this.f93150b = runnable;
    }

    @Override // xr.ve
    public InputStream next() {
        if (!this.f93151c) {
            this.f93150b.run();
            this.f93151c = true;
        }
        return this.f93152e.f93223c.messageReadQueuePoll();
    }
}
