package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3049w2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C3049w2 f33519a = new C3049w2();

    public C3049w2() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 event = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int i10 = event.f32830a;
        if (i10 == 1 || i10 == 2) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
            C3100z2.f33679h.set(false);
        } else if (i10 != 10) {
            if (i10 != 11) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(C3100z2.f(), "access$getTAG$p(...)");
            } else if (!Boolean.parseBoolean(event.f32831b)) {
                C3100z2.f33672a.h();
            }
        } else if (kotlin.jvm.internal.e0.areEqual("available", event.f32831b)) {
            C3100z2.f33672a.h();
        }
        return tu.x0.f87415a;
    }
}
