package io.bidmachine.analytics.internal;

import android.content.Context;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3877j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f60071c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f60072a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b f60073b = b.EMPTY;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.j$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.j$b */
    public enum b {
        EMPTY,
        CREATED,
        ENABLED,
        DISABLED,
        DESTROYED
    }

    public abstract String a();

    public final void a(Context context) {
        synchronized (this.f60072a) {
            if (this.f60073b != b.EMPTY) {
                return;
            }
            d(context);
            this.f60073b = b.CREATED;
        }
    }

    public final void b(Context context) {
        synchronized (this.f60072a) {
            if (this.f60073b != b.ENABLED) {
                return;
            }
            try {
                int i10 = tu.z.f87419c;
                e(context);
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            this.f60073b = b.DISABLED;
        }
    }

    public abstract void b(Object obj);

    public final void c(Context context) {
        synchronized (this.f60072a) {
            if (this.f60073b != b.DISABLED) {
                return;
            }
            try {
                int i10 = tu.z.f87419c;
                f(context);
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            this.f60073b = b.ENABLED;
        }
    }

    public abstract void d(Context context);

    public abstract void e(Context context);

    public abstract void f(Context context);

    public final void a(Object obj) {
        synchronized (this.f60072a) {
            b bVar = this.f60073b;
            if (bVar == b.CREATED || bVar == b.DISABLED) {
                b(obj);
                this.f60073b = b.DISABLED;
            }
        }
    }
}
