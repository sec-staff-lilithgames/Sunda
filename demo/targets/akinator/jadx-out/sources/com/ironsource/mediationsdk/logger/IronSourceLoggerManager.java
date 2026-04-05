package com.ironsource.mediationsdk.logger;

import com.ironsource.C3270ib;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceLoggerManager extends IronSourceLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile IronSourceLoggerManager f37579d;

    /* renamed from: c, reason: collision with root package name */
    private final List<IronSourceLogger> f37580c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.f37580c = new CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.f37580c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (f37579d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (f37579d == null) {
                        f37579d = new IronSourceLoggerManager("IronSourceLoggerManager");
                    }
                } finally {
                }
            }
        }
        return f37579d;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C3270ib c3270ib) {
        if (a(c3270ib.a())) {
            return;
        }
        a(ironSourceTag, c3270ib.c(), c3270ib.a());
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.f37580c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        if (a(i10)) {
            return;
        }
        a(ironSourceTag, str, i10);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        if (th2 == null) {
            Iterator<IronSourceLogger> it = this.f37580c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.f37580c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th2);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        log(ironSourceTag, str, i10);
    }

    public void setLoggerDebugLevel(String str, int i10) {
        if (str == null) {
            return;
        }
        IronSourceLogger ironSourceLoggerA = a(str);
        if (ironSourceLoggerA == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
            return;
        }
        if (i10 < 0 || i10 > 3) {
            this.f37580c.remove(ironSourceLoggerA);
            return;
        }
        log(IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i10 + ")", 0);
        ironSourceLoggerA.setDebugLevel(i10);
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C3270ib c3270ib, Throwable th2) {
        if (a(c3270ib.a())) {
            return;
        }
        logException(ironSourceTag, c3270ib.c(), th2);
    }

    private IronSourceLoggerManager(String str, int i10) {
        super(str, i10);
        this.f37580c = new CopyOnWriteArrayList();
        c();
    }

    private boolean a(int i10) {
        return i10 < this.f37575a;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        for (IronSourceLogger ironSourceLogger : this.f37580c) {
            if (ironSourceLogger.a() <= i10) {
                ironSourceLogger.log(ironSourceTag, str, i10);
            }
        }
    }

    public static IronSourceLoggerManager getLogger(int i10) {
        IronSourceLoggerManager logger = getLogger();
        logger.f37575a = i10;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.f37580c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
