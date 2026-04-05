package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Jf extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Kf f31928a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jf(Kf kf2) {
        super(0);
        this.f31928a = kf2;
    }

    public static final void a(Kf this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f31969c.post((Ff) this$0.f31977k.getValue());
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Runnable invoke() {
        return new zg.h(this.f31928a, 7);
    }
}
