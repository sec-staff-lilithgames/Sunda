package t5;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f86327l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f86328a;

    /* renamed from: b, reason: collision with root package name */
    public y5.g f86329b;

    /* renamed from: c, reason: collision with root package name */
    public CoroutineScope f86330c;

    /* renamed from: d, reason: collision with root package name */
    public kv.a f86331d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f86332e;

    /* renamed from: f, reason: collision with root package name */
    public final long f86333f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f86334g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f86335h;

    /* renamed from: i, reason: collision with root package name */
    public y5.c f86336i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f86337j;

    /* renamed from: k, reason: collision with root package name */
    public Job f86338k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: t5.a$a, reason: collision with other inner class name */
    public static final class C0784a {
        public C0784a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new C0784a(null);
    }

    public a(long j10, TimeUnit timeUnit, b watch) {
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        e0.checkNotNullParameter(watch, "watch");
        this.f86328a = watch;
        this.f86332e = new Object();
        this.f86333f = timeUnit.toMillis(j10);
        this.f86334g = new AtomicInteger(0);
        ((sn.t) watch).getClass();
        this.f86335h = new AtomicLong(SystemClock.uptimeMillis());
    }

    public static final void access$autoCloseDatabase(a aVar) {
        synchronized (aVar.f86332e) {
            try {
                ((sn.t) aVar.f86328a).getClass();
                if (SystemClock.uptimeMillis() - aVar.f86335h.get() < aVar.f86333f) {
                    return;
                }
                if (aVar.f86334g.get() != 0) {
                    return;
                }
                kv.a aVar2 = aVar.f86331d;
                if (aVar2 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                aVar2.invoke();
                y5.c cVar = aVar.f86336i;
                if (cVar != null && cVar.isOpen()) {
                    cVar.close();
                }
                aVar.f86336i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void closeDatabaseIfOpen() {
        synchronized (this.f86332e) {
            try {
                this.f86337j = true;
                Job job = this.f86338k;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.f86338k = null;
                y5.c cVar = this.f86336i;
                if (cVar != null) {
                    cVar.close();
                }
                this.f86336i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        CoroutineScope coroutineScope;
        int iDecrementAndGet = this.f86334g.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        ((sn.t) this.f86328a).getClass();
        this.f86335h.set(SystemClock.uptimeMillis());
        if (iDecrementAndGet == 0) {
            CoroutineScope coroutineScope2 = this.f86330c;
            if (coroutineScope2 == null) {
                e0.throwUninitializedPropertyAccessException("coroutineScope");
                coroutineScope = null;
            } else {
                coroutineScope = coroutineScope2;
            }
            this.f86338k = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c(this, null), 3, null);
        }
    }

    public final <V> V executeRefCountingFunction(kv.l block) {
        e0.checkNotNullParameter(block, "block");
        try {
            return (V) block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final kv.a getAutoCloseCallbackForTest$room_runtime_release() {
        return this.f86331d;
    }

    public final y5.c getDelegateDatabase$room_runtime_release() {
        return this.f86336i;
    }

    public final int getRefCountForTest$room_runtime_release() {
        return this.f86334g.get();
    }

    public final y5.c incrementCountAndEnsureDbIsOpen() {
        Job job = this.f86338k;
        y5.g gVar = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f86338k = null;
        this.f86334g.incrementAndGet();
        if (this.f86337j) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.f86332e) {
            y5.c cVar = this.f86336i;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            y5.g gVar2 = this.f86329b;
            if (gVar2 == null) {
                e0.throwUninitializedPropertyAccessException("delegateOpenHelper");
            } else {
                gVar = gVar2;
            }
            y5.c writableDatabase = gVar.getWritableDatabase();
            this.f86336i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void initCoroutineScope(CoroutineScope coroutineScope) {
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f86330c = coroutineScope;
    }

    public final void initOpenHelper(y5.g delegateOpenHelper) {
        e0.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof r) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f86329b = delegateOpenHelper;
    }

    public final boolean isActive() {
        return !this.f86337j;
    }

    public final void setAutoCloseCallback(kv.a onAutoClose) {
        e0.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f86331d = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(y5.c cVar) {
        this.f86336i = cVar;
    }

    public /* synthetic */ a(long j10, TimeUnit timeUnit, b bVar, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, timeUnit, (i10 & 4) != 0 ? new sn.t(2) : bVar);
    }
}
