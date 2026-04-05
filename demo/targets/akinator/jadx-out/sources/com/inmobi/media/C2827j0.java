package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2827j0 implements InterfaceC2771fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2929p0 f32951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32952b;

    public C2827j0(C2929p0 c2929p0, boolean z10) {
        this.f32951a = c2929p0;
        this.f32952b = z10;
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f32951a.a("result pushed to queue");
        if (this.f32952b) {
            C2929p0 c2929p0 = this.f32951a;
            c2929p0.a("session end - cleanup");
            c2929p0.f33239g = null;
            c2929p0.f33238f.clear();
            c2929p0.f33235c.set(false);
            c2929p0.f33236d.set(false);
        }
    }

    @Override // com.inmobi.media.InterfaceC2771fb
    public final void onError(Exception exc) {
        this.f32951a.a(exc, "error in pushing to queue");
    }
}
