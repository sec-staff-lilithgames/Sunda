package com.apm.insight.b;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f12925a;

    /* renamed from: b, reason: collision with root package name */
    private static Printer f12926b;

    /* renamed from: c, reason: collision with root package name */
    private static final CopyOnWriteArrayList<e> f12927c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f12928d = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        String a();

        String b();

        String c();
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f12925a) {
            return;
        }
        f12925a = true;
        f12926b = new Printer() { // from class: com.apm.insight.b.h.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    h.a(true, str);
                } else if (str.charAt(0) == '<') {
                    h.a(false, str);
                }
            }
        };
        i.a();
        i.a(f12926b);
    }

    public static void a(e eVar) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f12927c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(eVar);
        }
    }

    public static void a(boolean z10, String str) {
        e.f12869a = System.nanoTime() / 1000000;
        e.f12870b = SystemClock.currentThreadTimeMillis();
        CopyOnWriteArrayList<e> copyOnWriteArrayList = f12927c;
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            e eVar = copyOnWriteArrayList.get(i10);
            if (eVar == null || !eVar.a()) {
                if (!z10 && eVar.f12871c) {
                    eVar.b("");
                }
            } else if (z10) {
                if (!eVar.f12871c) {
                    eVar.a(str);
                }
            } else if (eVar.f12871c) {
                eVar.b(str);
            }
        }
    }
}
