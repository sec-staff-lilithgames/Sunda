package sh;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class t extends th.a implements n1 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f85858f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final m1 f85859g = new m1(k.class);

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f85860h;

    /* renamed from: i, reason: collision with root package name */
    public static final kotlin.jvm.internal.d0 f85861i;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f85862b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f85863c;

    /* renamed from: e, reason: collision with root package name */
    public volatile s f85864e;

    static {
        boolean z10;
        kotlin.jvm.internal.d0 mVar;
        Throwable th2;
        kotlin.jvm.internal.d0 rVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f85860h = z10;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e10 = null;
        if (property == null || property.contains("Android")) {
            try {
                rVar = new r();
            } catch (Error | Exception e11) {
                try {
                    mVar = new l();
                } catch (Error | Exception e12) {
                    e10 = e12;
                    mVar = new m();
                }
                kotlin.jvm.internal.d0 d0Var = mVar;
                th2 = e11;
                rVar = d0Var;
            }
        } else {
            try {
                rVar = new l();
            } catch (NoClassDefFoundError unused2) {
                rVar = new m();
            }
        }
        th2 = null;
        f85861i = rVar;
        if (e10 != null) {
            m1 m1Var = f85859g;
            Logger loggerA = m1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            m1Var.a().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e10);
        }
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final void b(s sVar) {
        sVar.f85855a = null;
        while (true) {
            s sVar2 = this.f85864e;
            if (sVar2 == s.f85854c) {
                return;
            }
            s sVar3 = null;
            while (sVar2 != null) {
                s sVar4 = sVar2.f85856b;
                if (sVar2.f85855a != null) {
                    sVar3 = sVar2;
                } else if (sVar3 != null) {
                    sVar3.f85856b = sVar4;
                    if (sVar3.f85855a == null) {
                        break;
                    }
                } else if (!f85861i.h(this, sVar2, sVar4)) {
                    break;
                }
                sVar2 = sVar4;
            }
            return;
        }
    }
}
