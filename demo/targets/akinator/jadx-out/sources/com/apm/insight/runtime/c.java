package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f13287a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f13288b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f13289c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f13290d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f13291e = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13292a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f13292a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13292a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13292a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13292a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13292a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f13292a[crashType.ordinal()];
        if (i10 == 1) {
            this.f13287a.add(iCrashCallback);
            this.f13288b.add(iCrashCallback);
            this.f13289c.add(iCrashCallback);
            this.f13290d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f13290d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f13288b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f13287a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f13289c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f13292a[crashType.ordinal()];
        if (i10 == 1) {
            this.f13287a.remove(iCrashCallback);
            this.f13288b.remove(iCrashCallback);
            this.f13289c.remove(iCrashCallback);
            this.f13290d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f13290d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f13288b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f13287a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f13289c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f13288b;
    }

    public final List<ICrashCallback> d() {
        return this.f13289c;
    }

    public final List<ICrashCallback> e() {
        return this.f13290d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f13291e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f13291e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f13291e;
    }

    public final List<ICrashCallback> b() {
        return this.f13287a;
    }
}
