package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3044ve extends W1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f33518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3044ve(String eventType, String str, String eventSource) {
        super(eventType, str);
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventSource, "eventSource");
        this.f33518e = eventSource;
    }

    public final String toString() {
        return AbstractC2962r0.a(new StringBuilder(), this.f32425a, ' ');
    }
}
