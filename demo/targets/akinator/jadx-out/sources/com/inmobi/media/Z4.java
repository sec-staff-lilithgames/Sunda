package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z4 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public static final Z4 f32593a = new Z4();

    public Z4() {
        super(1);
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3093yc it = (GestureDetectorOnGestureListenerC3093yc) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        F5 f52 = it.f33628i;
        if (f52 != null) {
            String str = GestureDetectorOnGestureListenerC3093yc.f33611b1;
            ((G5) f52).a(str, AbstractC2823ic.a(it, str, "TAG", "fireBackButtonPressedEvent "));
        }
        String str2 = it.J;
        if (str2 != null) {
            it.a(str2, "broadcastEvent('backButtonPressed')");
        }
        return tu.x0.f87415a;
    }
}
