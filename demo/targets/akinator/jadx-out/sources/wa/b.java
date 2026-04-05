package wa;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f90470b;

    public b(e eVar) {
        this.f90470b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f90470b.f90487n) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.f90470b.f90483j, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                e eVar = this.f90470b;
                Context context = eVar.f90480g;
                if (context != null) {
                    context.bindService(intent, eVar, 1);
                }
            } catch (Throwable th2) {
                Object[] objArr = {th2};
                cb.a aVar = cb.b.f12046b.f12047a;
                if (aVar != null) {
                    aVar.e("Failed to bind IgniteRemoteService", objArr);
                }
                if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                } else {
                    ya.b.a(ya.d.ONE_DT_GENERAL_ERROR, fb.a.a(th2, ya.c.IGNITE_SERVICE_UNAVAILABLE));
                }
            } finally {
            }
        }
    }
}
