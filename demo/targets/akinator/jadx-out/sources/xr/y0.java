package xr;

import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f93246f = Logger.getLogger(wr.m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f93247a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final wr.n2 f93248b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f93249c;

    /* renamed from: d, reason: collision with root package name */
    public final long f93250d;

    /* renamed from: e, reason: collision with root package name */
    public int f93251e;

    public y0(wr.n2 n2Var, int i10, long j10, String str) {
        mh.p1.checkNotNull(str, "description");
        this.f93248b = (wr.n2) mh.p1.checkNotNull(n2Var, "logId");
        if (i10 > 0) {
            this.f93249c = new x0(this, i10);
        } else {
            this.f93249c = null;
        }
        this.f93250d = j10;
        b(new wr.a2().setDescription(str + " created").setSeverity(wr.b2.f90824b).setTimestampNanos(j10).build());
    }

    public static void a(wr.n2 n2Var, Level level, String str) {
        Logger logger = f93246f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, C3191e4.i.f36529d + n2Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(wr.c2 c2Var) {
        int iOrdinal = c2Var.f90850b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f93247a) {
            try {
                x0 x0Var = this.f93249c;
                if (x0Var != null) {
                    x0Var.add((x0) c2Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(this.f93248b, level, c2Var.f90849a);
    }

    public final void c(wr.x1 x1Var) {
        synchronized (this.f93247a) {
            try {
                if (this.f93249c == null) {
                    return;
                }
                x1Var.setChannelTrace(new wr.z1().setNumEventsLogged(this.f93251e).setCreationTimeNanos(this.f93250d).setEvents(new ArrayList(this.f93249c)).build());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
