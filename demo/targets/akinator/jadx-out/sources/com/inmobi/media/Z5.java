package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Z5 extends W1 {

    /* renamed from: e, reason: collision with root package name */
    public final String f32594e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z5(String eventId, String componentType, String eventType, String str) {
        super(eventType, str);
        kotlin.jvm.internal.e0.checkNotNullParameter(eventId, "eventId");
        kotlin.jvm.internal.e0.checkNotNullParameter(componentType, "componentType");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        this.f32594e = eventId;
        this.f32595f = componentType;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32425a);
        sb2.append('@');
        return AbstractC2962r0.a(sb2, this.f32595f, ' ');
    }

    public Z5(String str, String str2, String str3) {
        this(w0.i.c("toString(...)"), str, str2, str3);
    }
}
