package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Xd extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2689ae f32517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(C2689ae c2689ae) {
        super(0);
        this.f32517a = c2689ae;
    }

    @Override // kv.a
    public final Object invoke() {
        F5 f52 = this.f32517a.f32655a;
        if (f52 != null) {
            ((G5) f52).a("StateMachine", " WebView Show called and started rendering from LOADING");
        }
        return tu.x0.f87415a;
    }
}
