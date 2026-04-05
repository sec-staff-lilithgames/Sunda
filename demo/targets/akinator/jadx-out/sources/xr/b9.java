package xr;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b9 extends WeakReference {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f92277f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g, reason: collision with root package name */
    public static final RuntimeException f92278g;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f92279a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f92280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92281c;

    /* renamed from: d, reason: collision with root package name */
    public final SoftReference f92282d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f92283e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f92278g = runtimeException;
    }

    public b9(c9 c9Var, u8 u8Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(c9Var, referenceQueue);
        this.f92283e = new AtomicBoolean();
        this.f92282d = new SoftReference(f92277f ? new RuntimeException("ManagedChannel allocation site") : f92278g);
        this.f92281c = u8Var.toString();
        this.f92279a = referenceQueue;
        this.f92280b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            b9 b9Var = (b9) referenceQueue.poll();
            if (b9Var == null) {
                return;
            }
            SoftReference softReference = b9Var.f92282d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            b9Var.f92280b.remove(b9Var);
            softReference.clear();
            if (!b9Var.f92283e.get()) {
                Level level = Level.SEVERE;
                Logger logger = c9.f92333e;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{b9Var.f92281c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        super.clear();
        this.f92280b.remove(this);
        this.f92282d.clear();
        a(this.f92279a);
    }
}
