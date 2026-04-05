package u;

import android.app.PendingIntent;
import android.content.ComponentName;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b.d f87466a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final PendingIntent f87467a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f87468b;

        /* renamed from: c, reason: collision with root package name */
        public final u.a f87469c;

        public a(PendingIntent pendingIntent, Executor executor, u.a aVar) {
            this.f87467a = pendingIntent;
            this.f87468b = executor;
            this.f87469c = aVar;
        }

        public u.a getCallback() {
            return this.f87469c;
        }

        public Executor getExecutor() {
            return this.f87468b;
        }

        public PendingIntent getId() {
            return this.f87467a;
        }
    }

    public b(b.d dVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f87466a = dVar;
    }
}
