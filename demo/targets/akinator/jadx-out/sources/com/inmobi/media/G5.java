package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G5 implements F5 {

    /* renamed from: a, reason: collision with root package name */
    public Ub f31816a;

    /* renamed from: b, reason: collision with root package name */
    public final C2841je f31817b;

    public G5(Context context, double d10, EnumC2784g7 logLevel, boolean z10, boolean z11, int i10, long j10, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(logLevel, "logLevel");
        if (!z11) {
            this.f31817b = new C2841je();
        }
        if (z10) {
            return;
        }
        Ub logger = new Ub(context, d10, logLevel, j10, i10, z12);
        this.f31816a = logger;
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC2936p7.f33260a;
        kotlin.jvm.internal.e0.checkNotNull(logger);
        kotlin.jvm.internal.e0.checkNotNullParameter(logger, "logger");
        Objects.toString(logger);
        AbstractC2936p7.f33260a.add(new WeakReference(logger));
    }

    public final void a(String tag, String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.a(EnumC2784g7.f32871b, tag, message);
        }
        if (this.f31817b != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        }
    }

    public final void b(String tag, String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.a(EnumC2784g7.f32872c, tag, message);
        }
        if (this.f31817b != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        }
    }

    public final void c(String tag, String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.a(EnumC2784g7.f32870a, tag, message);
        }
        if (this.f31817b != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        }
    }

    public final void d(String tag, String message) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.a(EnumC2784g7.f32873d, tag, message);
        }
        if (this.f31817b != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void e(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            Objects.toString(ub2.f32371i);
            if (ub2.f32371i.get()) {
                return;
            }
            ub2.f32370h.put(key, value);
        }
    }

    public final void a(String tag, String message, Exception error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            EnumC2784g7 enumC2784g7 = EnumC2784g7.f32872c;
            StringBuilder sbT = a.b.t(message, "\nError: ");
            sbT.append(tu.h.stackTraceToString(error));
            ub2.a(enumC2784g7, tag, sbT.toString());
        }
        if (this.f31817b != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        }
    }

    public final void b() {
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.a();
        }
    }

    public final void a(boolean z10) {
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            Objects.toString(ub2.f32371i);
            if (!ub2.f32371i.get()) {
                ub2.f32366d = z10;
            }
        }
        if (z10) {
            return;
        }
        Ub ub3 = this.f31816a;
        if (ub3 == null || !ub3.f32368f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC2936p7.f33260a;
            AbstractC2919o7.a(this.f31816a);
            this.f31816a = null;
        }
    }

    public final void a() {
        Ub ub2 = this.f31816a;
        if (ub2 != null) {
            ub2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC2936p7.f33260a;
        AbstractC2919o7.a(this.f31816a);
    }
}
