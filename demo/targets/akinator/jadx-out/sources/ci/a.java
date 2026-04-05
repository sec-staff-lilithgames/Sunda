package ci;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements ThreadFactory {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadFactory f12316g = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f12317b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    public final String f12318c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12319e;

    /* renamed from: f, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f12320f;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f12318c = str;
        this.f12319e = i10;
        this.f12320f = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = f12316g.newThread(new af.n(11, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f12318c + " Thread #" + this.f12317b.getAndIncrement());
        return threadNewThread;
    }
}
