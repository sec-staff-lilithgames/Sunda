package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f13145a;

    private h(Context context) {
        this.f13145a = context;
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.e.g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.apm.insight.b.f.a(this.f13145a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.f13145a)) {
                b.a().a(com.apm.insight.l.k.b(this.f13145a));
            } else {
                NativeImpl.j();
            }
        } catch (Throwable th2) {
            try {
                com.apm.insight.a.b(th2);
                o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (m.a().a() == null) {
                }
            } finally {
                o.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (m.a().a() != null) {
                    com.apm.insight.j.d.a(m.a().a(), this.f13145a).a();
                }
            }
        }
    }

    public static void a(Context context) {
        m.a().a(new h(context), 0L);
    }
}
