package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A6 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B6 f31620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ba f31621b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A6(B6 b62, Ba ba2) {
        super(1);
        this.f31620a = b62;
        this.f31621b = ba2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3093yc it = (GestureDetectorOnGestureListenerC3093yc) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        if (it.L0) {
            F5 f52 = this.f31620a.f31653c;
            if (f52 != null) {
                String str = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((G5) f52).b(str, "setOrientationProperties called on unloaded ad");
            }
        } else {
            it.a(this.f31621b);
        }
        return tu.x0.f87415a;
    }
}
