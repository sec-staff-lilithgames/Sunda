package s8;

import android.text.TextUtils;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85487a;

    /* renamed from: b, reason: collision with root package name */
    public int f85488b;

    /* renamed from: c, reason: collision with root package name */
    public int f85489c;

    /* renamed from: d, reason: collision with root package name */
    public ThreadFactory f85490d = new c();

    /* renamed from: e, reason: collision with root package name */
    public g f85491e = g.f85501a;

    /* renamed from: f, reason: collision with root package name */
    public String f85492f;

    /* renamed from: g, reason: collision with root package name */
    public long f85493g;

    public a(boolean z10) {
        this.f85487a = z10;
    }

    public h build() {
        if (TextUtils.isEmpty(this.f85492f)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f85492f);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f85488b, this.f85489c, this.f85493g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new e(this.f85490d, this.f85492f, this.f85491e, this.f85487a));
        if (this.f85493g != 0) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return new h(threadPoolExecutor);
    }

    public a setName(String str) {
        this.f85492f = str;
        return this;
    }

    public a setThreadCount(int i10) {
        this.f85488b = i10;
        this.f85489c = i10;
        return this;
    }

    @Deprecated
    public a setThreadFactory(ThreadFactory threadFactory) {
        this.f85490d = threadFactory;
        return this;
    }

    public a setThreadTimeoutMillis(long j10) {
        this.f85493g = j10;
        return this;
    }

    public a setUncaughtThrowableStrategy(g gVar) {
        this.f85491e = gVar;
        return this;
    }
}
