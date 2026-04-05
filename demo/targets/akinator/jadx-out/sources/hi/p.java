package hi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f58860c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Thread f58861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi.j f58862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f58863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f58864h;

    public p(u uVar, long j10, Throwable th2, Thread thread, pi.j jVar, boolean z10) {
        this.f58864h = uVar;
        this.f58859b = j10;
        this.f58860c = th2;
        this.f58861e = thread;
        this.f58862f = jVar;
        this.f58863g = z10;
    }

    @Override // java.util.concurrent.Callable
    public Task<Void> call() throws Exception {
        long j10 = this.f58859b;
        long j11 = j10 / 1000;
        u uVar = this.f58864h;
        String strF = uVar.f();
        if (strF == null) {
            ei.f.getLogger().e("Tried to write a fatal exception while no session was open.");
            return Tasks.forResult(null);
        }
        uVar.f58883c.create();
        uVar.f58893m.persistFatalEvent(this.f58860c, this.f58861e, strF, j11);
        uVar.d(j10);
        pi.j jVar = this.f58862f;
        uVar.b(false, jVar, false);
        uVar.c(new h().getSessionId(), Boolean.valueOf(this.f58863g));
        return !uVar.f58882b.isAutomaticDataCollectionEnabled() ? Tasks.forResult(null) : ((pi.g) jVar).getSettingsAsync().onSuccessTask(uVar.f58885e.f59614a, new o(this, strF));
    }
}
