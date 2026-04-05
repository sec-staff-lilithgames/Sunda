package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3114a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    private static final int f35903l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC3132b f35904m = new C0210a();

    /* renamed from: n, reason: collision with root package name */
    private static final InterfaceC3427r9 f35905n = new b();

    /* renamed from: d, reason: collision with root package name */
    private final int f35909d;

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3132b f35906a = f35904m;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3427r9 f35907b = f35905n;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f35908c = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private String f35910e = "";

    /* renamed from: f, reason: collision with root package name */
    private boolean f35911f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35912g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile int f35913h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f35914i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f35915j = 0;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f35916k = new c();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a$b */
    public class b implements InterfaceC3427r9 {
        @Override // com.ironsource.InterfaceC3427r9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3114a c3114a = C3114a.this;
            c3114a.f35913h = (c3114a.f35913h + 1) % Integer.MAX_VALUE;
        }
    }

    public C3114a(int i10) {
        this.f35909d = i10;
    }

    public C3114a c() {
        this.f35910e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        setName("|ANR-ANRHandler|");
        int i10 = -1;
        while (!isInterrupted() && this.f35915j < this.f35914i) {
            int i11 = this.f35913h;
            this.f35908c.post(this.f35916k);
            try {
                Thread.sleep(this.f35909d);
                if (this.f35913h != i11) {
                    this.f35915j = 0;
                } else if (this.f35912g || !Debug.isDebuggerConnected()) {
                    this.f35915j++;
                    this.f35906a.a();
                    String str = C3422r4.f38273l;
                    if (str != null && !str.trim().isEmpty()) {
                        new P5(C3422r4.f38273l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.f35913h != i10) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i10 = this.f35913h;
                }
            } catch (InterruptedException e10) {
                this.f35907b.a(e10);
                return;
            }
        }
        if (this.f35915j >= this.f35914i) {
            this.f35906a.b();
        }
    }

    public void a(int i10) {
        this.f35914i = i10;
    }

    public int b() {
        return this.f35914i;
    }

    public int a() {
        return this.f35915j;
    }

    public C3114a b(boolean z10) {
        this.f35911f = z10;
        return this;
    }

    public C3114a a(InterfaceC3132b interfaceC3132b) {
        if (interfaceC3132b == null) {
            this.f35906a = f35904m;
            return this;
        }
        this.f35906a = interfaceC3132b;
        return this;
    }

    public C3114a a(InterfaceC3427r9 interfaceC3427r9) {
        if (interfaceC3427r9 == null) {
            this.f35907b = f35905n;
            return this;
        }
        this.f35907b = interfaceC3427r9;
        return this;
    }

    public C3114a a(String str) {
        if (str == null) {
            str = "";
        }
        this.f35910e = str;
        return this;
    }

    public C3114a a(boolean z10) {
        this.f35912g = z10;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String string = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder sbU = p0.o2.u(string);
                    sbU.append(stackTraceElement.toString());
                    sbU.append(";\n");
                    string = sbU.toString();
                }
            }
        }
        return string;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0210a implements InterfaceC3132b {
        @Override // com.ironsource.InterfaceC3132b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC3132b
        public void a() {
        }
    }
}
