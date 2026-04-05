package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3104z6 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f33698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3104z6(boolean z10) {
        super(1);
        this.f33698a = z10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        GestureDetectorOnGestureListenerC3093yc it = (GestureDetectorOnGestureListenerC3093yc) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        it.setDisableBackButton(this.f33698a);
        return tu.x0.f87415a;
    }
}
