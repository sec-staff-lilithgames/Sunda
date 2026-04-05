package androidx.lifecycle;

import j$.time.Duration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6514a = new b();

    public final long toMillis(Duration timeout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeout, "timeout");
        return timeout.toMillis();
    }
}
