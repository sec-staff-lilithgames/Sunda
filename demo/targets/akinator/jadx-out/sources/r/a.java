package r;

import com.applovin.impl.ga;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f83636c;

    /* renamed from: d, reason: collision with root package name */
    public static final ga f83637d = new ga(3);

    /* renamed from: e, reason: collision with root package name */
    public static final ga f83638e = new ga(4);

    /* renamed from: a, reason: collision with root package name */
    public e f83639a;

    /* renamed from: b, reason: collision with root package name */
    public final d f83640b;

    public a() {
        d dVar = new d();
        this.f83640b = dVar;
        this.f83639a = dVar;
    }

    public static Executor getIOThreadExecutor() {
        return f83638e;
    }

    public static a getInstance() {
        if (f83636c != null) {
            return f83636c;
        }
        synchronized (a.class) {
            try {
                if (f83636c == null) {
                    f83636c = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f83636c;
    }

    public static Executor getMainThreadExecutor() {
        return f83637d;
    }

    @Override // r.e
    public void executeOnDiskIO(Runnable runnable) {
        this.f83639a.executeOnDiskIO(runnable);
    }

    @Override // r.e
    public boolean isMainThread() {
        return this.f83639a.isMainThread();
    }

    @Override // r.e
    public void postToMainThread(Runnable runnable) {
        this.f83639a.postToMainThread(runnable);
    }

    public void setDelegate(e eVar) {
        if (eVar == null) {
            eVar = this.f83640b;
        }
        this.f83639a = eVar;
    }
}
