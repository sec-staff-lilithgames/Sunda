package q5;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import sv.n0;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements x5.b, Mutex {

    /* renamed from: b, reason: collision with root package name */
    public final x5.b f82446b;

    /* renamed from: c, reason: collision with root package name */
    public final Mutex f82447c;

    /* renamed from: e, reason: collision with root package name */
    public zu.m f82448e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f82449f;

    public n(x5.b delegate, Mutex lock) {
        e0.checkNotNullParameter(delegate, "delegate");
        e0.checkNotNullParameter(lock, "lock");
        this.f82446b = delegate;
        this.f82447c = lock;
    }

    @Override // x5.b, java.lang.AutoCloseable
    public void close() {
        this.f82446b.close();
    }

    public final void dump(StringBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        if (this.f82448e == null && this.f82449f == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        zu.m mVar = this.f82448e;
        if (mVar != null) {
            builder.append("\t\tCoroutine: " + mVar);
            builder.append('\n');
        }
        Throwable th2 = this.f82449f;
        if (th2 != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = y0.drop(n0.lines(tu.h.stackTraceToString(th2)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        return this.f82447c.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object owner) {
        e0.checkNotNullParameter(owner, "owner");
        return this.f82447c.holdsLock(owner);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return this.f82447c.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, zu.d<? super x0> dVar) {
        return this.f82447c.lock(obj, dVar);
    }

    public final n markAcquired(zu.m context) {
        e0.checkNotNullParameter(context, "context");
        this.f82448e = context;
        this.f82449f = new Throwable();
        return this;
    }

    public final n markReleased() {
        this.f82448e = null;
        this.f82449f = null;
        return this;
    }

    @Override // x5.b
    public x5.d prepare(String sql) {
        e0.checkNotNullParameter(sql, "sql");
        return this.f82446b.prepare(sql);
    }

    public String toString() {
        return this.f82446b.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        return this.f82447c.tryLock(obj);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        this.f82447c.unlock(obj);
    }

    public /* synthetic */ n(x5.b bVar, Mutex mutex, int i10, kotlin.jvm.internal.u uVar) {
        this(bVar, (i10 & 2) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex);
    }
}
