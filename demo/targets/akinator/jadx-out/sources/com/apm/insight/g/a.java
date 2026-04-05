package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.k.h;
import com.apm.insight.l.e;
import com.apm.insight.l.f;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private static a f13021a = null;

    /* renamed from: i, reason: collision with root package name */
    private static volatile boolean f13022i = false;

    /* renamed from: j, reason: collision with root package name */
    private static volatile ThreadLocal<Boolean> f13023j = new ThreadLocal<>();

    /* renamed from: l, reason: collision with root package name */
    private static volatile long f13024l = 10000;

    /* renamed from: m, reason: collision with root package name */
    private static ArrayList<b> f13025m = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f13026b;

    /* renamed from: c, reason: collision with root package name */
    private c f13027c;

    /* renamed from: d, reason: collision with root package name */
    private c f13028d;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f13029e = 0;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f13030f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f13031g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f13032h = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    private JSONArray f13033k;

    private a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f13026b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static a a() {
        if (f13021a == null) {
            f13021a = new a();
        }
        return f13021a;
    }

    private void c(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13026b;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    private void d() {
        synchronized (this) {
            this.f13030f--;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (this.f13030f != 0 && SystemClock.uptimeMillis() - jUptimeMillis < f13024l) {
            SystemClock.sleep(50L);
        }
    }

    private static void e() {
        File fileA = j.a(e.g());
        File fileA2 = j.a();
        if (f.b(fileA) && f.b(fileA2)) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        while (!h.a() && SystemClock.uptimeMillis() - jUptimeMillis < f13024l) {
            try {
                SystemClock.sleep(500L);
            } catch (Throwable unused) {
            }
        }
    }

    private static int f() {
        int iA = 0;
        for (int i10 = 0; i10 < f13025m.size(); i10++) {
            try {
                try {
                    iA |= f13025m.get(i10).a();
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            } catch (Throwable unused) {
            }
        }
        return iA;
    }

    private static Throwable g() {
        for (int i10 = 0; i10 < f13025m.size(); i10++) {
            try {
                f13025m.get(i10);
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    public final void b(c cVar) {
        this.f13028d = cVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        do {
            th2 = a(thread, th2);
        } while (th2 != null);
    }

    private static boolean b(Thread thread, Throwable th2) {
        ICrashFilter iCrashFilterB = e.b().b();
        if (iCrashFilterB != null) {
            try {
                if (!iCrashFilterB.onJavaCrashFilter(th2, thread)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
                        aVar.a("data", (Object) str);
                        aVar.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVar);
                        if (aVarA != null) {
                            com.apm.insight.k.d.a().c(aVarA.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean c() {
        Boolean bool = f13023j.get();
        return bool != null && bool.booleanValue();
    }

    public final void a(c cVar) {
        this.f13027c = cVar;
    }

    public final boolean b(String str) {
        return this.f13031g.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #10 {all -> 0x01b0, blocks: (B:103:0x01a6, B:105:0x01ac), top: B:161:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[PHI: r0
      0x0065: PHI (r0v52 boolean) = (r0v9 boolean), (r0v53 boolean), (r0v53 boolean), (r0v53 boolean) binds: [B:24:0x0064, B:20:0x005a, B:142:0x0065, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x00ba, TryCatch #12 {all -> 0x00ba, blocks: (B:39:0x00aa, B:44:0x00b7, B:48:0x00bf, B:49:0x00da, B:47:0x00bd), top: B:165:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[Catch: all -> 0x00ba, TryCatch #12 {all -> 0x00ba, blocks: (B:39:0x00aa, B:44:0x00b7, B:48:0x00bf, B:49:0x00da, B:47:0x00bd), top: B:165:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Throwable a(java.lang.Thread r18, java.lang.Throwable r19) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.g.a.a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    public static boolean b() {
        return f13022i;
    }

    private String a(File file, Throwable th2, Thread thread, boolean z10) {
        String absolutePath = file.getAbsolutePath();
        this.f13032h.put(file.getName(), file);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
            NativeImpl.c(absolutePath);
        } catch (Throwable unused) {
        }
        String strA = null;
        if (z10) {
            int iH = NativeImpl.h(absolutePath);
            if (iH > 0) {
                try {
                    e.g();
                    NativeImpl.a(iH, com.apm.insight.l.a.b());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getMessage());
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, th2.getClass().getName());
                    if (th2.getMessage() != null) {
                        NativeImpl.a(iH, ": ");
                        NativeImpl.a(iH, th2.getMessage());
                    }
                    NativeImpl.a(iH, "\n");
                    NativeImpl.a(iH, thread.getName());
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    NativeImpl.a(iH, "stack:");
                    NativeImpl.a(iH, "\n");
                } catch (Throwable unused3) {
                }
                com.apm.insight.l.m.a(th2, iH);
                NativeImpl.b(iH);
            }
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    e.g();
                    sb2.append(com.apm.insight.l.a.b());
                    sb2.append("\n");
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.write((th2.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th2 + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                } catch (Throwable unused4) {
                }
                try {
                    fileOutputStream.write("stack:\n".getBytes());
                } catch (Throwable unused5) {
                }
                try {
                    strA = com.apm.insight.l.m.a(th2, new PrintStream(fileOutputStream), Looper.getMainLooper() == Looper.myLooper() ? new e.a() { // from class: com.apm.insight.g.a.1

                        /* renamed from: a, reason: collision with root package name */
                        private boolean f13034a = false;

                        @Override // com.apm.insight.l.e.a
                        public final boolean a(String str) {
                            if (!this.f13034a && str.contains("android.os.Looper.loop")) {
                                this.f13034a = true;
                            }
                            return !this.f13034a;
                        }
                    } : new e.a());
                    com.apm.insight.a.a((Closeable) fileOutputStream);
                } catch (Throwable th3) {
                    try {
                        th2.printStackTrace(new PrintStream(fileOutputStream));
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th3 + "\n").getBytes());
                            fileOutputStream.write((th4 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                }
                com.apm.insight.a.a((Closeable) fileOutputStream);
            } catch (Throwable unused7) {
            }
        }
        return strA;
    }

    public final void a(Thread thread, Throwable th2, boolean z10, com.apm.insight.entity.a aVar) {
        List<ICrashCallback> listC;
        CrashType crashType;
        if (z10) {
            listC = l.a().b();
            crashType = CrashType.LAUNCH;
        } else {
            listC = l.a().c();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : listC) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(crashType, com.apm.insight.l.m.a(th2), thread, this.f13033k);
                } else {
                    iCrashCallback.onCrash(crashType, com.apm.insight.l.m.a(th2), thread);
                }
                aVar.b("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            } catch (Throwable th3) {
                com.apm.insight.a.b(th3);
                aVar.b("callback_err_".concat(iCrashCallback.getClass().getName()), String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }

    private void a(Thread thread, Throwable th2, boolean z10, long j10) {
        Thread thread2;
        Throwable th3;
        long j11;
        List<IOOMCallback> listA = l.a().a();
        CrashType crashType = z10 ? CrashType.LAUNCH : CrashType.JAVA;
        for (IOOMCallback iOOMCallback : listA) {
            try {
                if (iOOMCallback instanceof com.apm.insight.b) {
                    thread2 = thread;
                    th3 = th2;
                    j11 = j10;
                    try {
                        ((com.apm.insight.b) iOOMCallback).a(crashType, th3, thread2, j11, this.f13033k);
                    } catch (Throwable th4) {
                        th = th4;
                        com.apm.insight.a.b(th);
                        th2 = th3;
                        thread = thread2;
                        j10 = j11;
                    }
                } else {
                    thread2 = thread;
                    th3 = th2;
                    j11 = j10;
                    iOOMCallback.onCrash(crashType, th3, thread2, j11);
                }
            } catch (Throwable th5) {
                th = th5;
                thread2 = thread;
                th3 = th2;
                j11 = j10;
            }
            th2 = th3;
            thread = thread2;
            j10 = j11;
        }
    }

    public final void a(String str) {
        this.f13031g.put(str, new Object());
    }

    public static void a(final Throwable th2) {
        if (th2 == null) {
            return;
        }
        try {
            m.a().a(new Runnable() { // from class: com.apm.insight.g.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        com.apm.insight.entity.a aVarA = com.apm.insight.entity.a.a(System.currentTimeMillis(), com.apm.insight.e.g(), th2);
                        aVarA.a("userdefine", (Object) 1);
                        com.apm.insight.entity.a aVarA2 = com.apm.insight.runtime.a.f.a().a(CrashType.CUSTOM_JAVA, aVarA);
                        if (aVarA2 != null) {
                            com.apm.insight.k.d.a().c(aVarA2.c());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(long j10) {
        f13024l = j10;
    }
}
