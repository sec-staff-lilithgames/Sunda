package sh;

import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f85842a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f85843b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f85844c;

    public m1(Class cls) {
        this.f85843b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f85844c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f85842a) {
            try {
                Logger logger2 = this.f85844c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f85843b);
                this.f85844c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
