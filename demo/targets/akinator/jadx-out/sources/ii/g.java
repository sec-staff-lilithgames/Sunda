package ii;

import android.os.Looper;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final a f59612d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static boolean f59613e;

    /* renamed from: a, reason: collision with root package name */
    public final c f59614a;

    /* renamed from: b, reason: collision with root package name */
    public final c f59615b;

    /* renamed from: c, reason: collision with root package name */
    public final c f59616c;

    public g(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        e0.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        e0.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f59614a = new c(backgroundExecutorService);
        this.f59615b = new c(backgroundExecutorService);
        Tasks.forResult(null);
        this.f59616c = new c(blockingExecutorService);
    }

    public static final void checkBackgroundThread() {
        f59612d.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        f59612d.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        f59612d.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return f59612d.getEnforcement();
    }

    public static final void setEnforcement(boolean z10) {
        f59612d.setEnforcement(z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final boolean access$isBackgroundThread(a aVar) {
            aVar.getClass();
            String name = Thread.currentThread().getName();
            e0.checkNotNullExpressionValue(name, "<get-threadName>(...)");
            return n0.contains$default((CharSequence) name, (CharSequence) "Firebase Background Thread #", false, 2, (Object) null);
        }

        public static final boolean access$isBlockingThread(a aVar) {
            aVar.getClass();
            String name = Thread.currentThread().getName();
            e0.checkNotNullExpressionValue(name, "<get-threadName>(...)");
            return n0.contains$default((CharSequence) name, (CharSequence) "Firebase Blocking Thread #", false, 2, (Object) null);
        }

        public static final boolean access$isNotMainThread(a aVar) {
            aVar.getClass();
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void a(kv.a aVar, kv.a aVar2) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return;
            }
            ei.f.getLogger().d((String) aVar2.invoke());
            getEnforcement();
        }

        public final void checkBackgroundThread() {
            a(new d(0, this, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0), new i.f(1));
        }

        public final void checkBlockingThread() {
            a(new e(0, this, a.class, "isBlockingThread", "isBlockingThread()Z", 0), new i.f(3));
        }

        public final void checkNotMainThread() {
            a(new f(0, this, a.class, "isNotMainThread", "isNotMainThread()Z", 0), new i.f(2));
        }

        public final boolean getEnforcement() {
            return g.f59613e;
        }

        public final void setEnforcement(boolean z10) {
            g.f59613e = z10;
        }

        public static /* synthetic */ void getEnforcement$annotations() {
        }
    }
}
