package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2725d extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f32723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2946q0 f32724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2771fb f32725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2725d(kv.a aVar, InterfaceC2946q0 interfaceC2946q0, InterfaceC2771fb interfaceC2771fb) {
        super(0);
        this.f32723a = (kotlin.jvm.internal.f0) aVar;
        this.f32724b = interfaceC2946q0;
        this.f32725c = interfaceC2771fb;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.f0, kv.a] */
    @Override // kv.a
    public final Object invoke() {
        try {
            if (((Boolean) this.f32723a.invoke()).booleanValue()) {
                this.f32725c.a(this.f32724b.a());
            } else {
                this.f32725c.onError(new Exception("Capture Aborted: Should Capture not satisfied"));
            }
        } catch (Exception e10) {
            this.f32725c.onError(e10);
        }
        return tu.x0.f87415a;
    }
}
