package com.inmobi.media;

import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.o3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2915o3 extends Z5 {

    /* renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f33176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2915o3(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC2809hf.a(thread, error));
        kotlin.jvm.internal.e0.checkNotNullParameter(thread, "thread");
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        this.f33176g = stackTrace;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2915o3(String str) {
        String eventId = UUID.randomUUID().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(eventId, "toString(...)");
        kotlin.jvm.internal.e0.checkNotNullParameter("crashReporting", "component");
        kotlin.jvm.internal.e0.checkNotNullParameter("CatchEvent", "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventId, "eventId");
        super(eventId, "crashReporting", "CatchEvent", str);
    }
}
