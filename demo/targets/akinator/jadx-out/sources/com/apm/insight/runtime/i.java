package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f13308a;

    /* renamed from: b, reason: collision with root package name */
    private long f13309b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final List<Printer> f13310c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<Printer> f13311d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f13312e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.i.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    i.a().a(str);
                } else if (str.charAt(0) == '<') {
                    i.a().b(str);
                }
                i.c();
            }
        };
    }

    private i() {
    }

    public static i a() {
        if (f13308a == null) {
            synchronized (i.class) {
                try {
                    if (f13308a == null) {
                        f13308a = new i();
                    }
                } finally {
                }
            }
        }
        return f13308a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f13309b != -1 && SystemClock.uptimeMillis() - this.f13309b > 5000;
    }

    public final void b(String str) {
        this.f13309b = SystemClock.uptimeMillis();
        try {
            a(this.f13311d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    public final void a(String str) {
        this.f13309b = -1L;
        try {
            a(this.f13310c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th2) {
            com.apm.insight.a.a(th2);
        }
    }
}
