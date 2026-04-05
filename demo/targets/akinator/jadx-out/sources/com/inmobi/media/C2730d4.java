package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2730d4 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2747e4 f32731a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2730d4(C2747e4 c2747e4) {
        super(1);
        this.f32731a = c2747e4;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        JSONObject jsonObject = (JSONObject) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
        InterfaceC2798h4 interfaceC2798h4 = this.f32731a.f32803d;
        if (interfaceC2798h4 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonObject, "jsonObject");
            InterfaceC3063x interfaceC3063x = ((C2917o5) interfaceC2798h4).f33179a.f33249b;
            GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = interfaceC3063x instanceof GestureDetectorOnGestureListenerC3093yc ? (GestureDetectorOnGestureListenerC3093yc) interfaceC3063x : null;
            if (gestureDetectorOnGestureListenerC3093yc != null) {
                gestureDetectorOnGestureListenerC3093yc.a(jsonObject);
            }
        }
        return tu.x0.f87415a;
    }
}
