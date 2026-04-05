package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.t1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2997t1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2997t1 f33376a = new C2997t1();

    public C2997t1() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 event = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        int i10 = event.f32830a;
        if (i10 == 1 || i10 == 2) {
            C3031v1 c3031v1 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
            C3031v1.f33480m.set(false);
        } else if (i10 != 10) {
            C3031v1 c3031v12 = C3031v1.f33468a;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("v1", "access$getTAG$p(...)");
        } else if (kotlin.jvm.internal.e0.areEqual("available", event.f32831b)) {
            C3031v1 c3031v13 = C3031v1.f33468a;
            if (!C3031v1.f33477j.get()) {
                c3031v13.c();
            }
        } else {
            C3031v1.d();
        }
        return tu.x0.f87415a;
    }
}
