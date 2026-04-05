package com.apm.insight.b;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static int f12929a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static b f12930b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f12931c;

    /* renamed from: d, reason: collision with root package name */
    private static Printer f12932d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Printer {

        /* renamed from: a, reason: collision with root package name */
        List<Printer> f12933a = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private List<Printer> f12936d = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        List<Printer> f12934b = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private boolean f12937e = false;

        /* renamed from: c, reason: collision with root package name */
        boolean f12935c = false;

        @Override // android.util.Printer
        public final void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i.b();
            if (str.charAt(0) == '>' && this.f12935c) {
                for (Printer printer : this.f12934b) {
                    if (!this.f12933a.contains(printer)) {
                        this.f12933a.add(printer);
                    }
                }
                this.f12934b.clear();
                this.f12935c = false;
            }
            if (this.f12933a.size() > i.f12929a) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.f12933a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            str.charAt(0);
            i.b();
        }
    }

    public static void a() throws NoSuchFieldException, SecurityException {
        if (f12931c) {
            return;
        }
        f12931c = true;
        f12930b = new b();
        Printer printerD = d();
        f12932d = printerD;
        if (printerD != null) {
            f12930b.f12933a.add(printerD);
        }
        if (com.apm.insight.e.s()) {
            Looper.getMainLooper().setMessageLogging(f12930b);
        }
    }

    public static /* synthetic */ a b() {
        return null;
    }

    private static Printer d() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Printer printer) {
        if (printer == null || f12930b.f12934b.contains(printer)) {
            return;
        }
        f12930b.f12934b.add(printer);
        f12930b.f12935c = true;
    }
}
