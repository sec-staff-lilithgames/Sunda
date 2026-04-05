package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2821ia extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2837ja f32930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2821ia(C2837ja c2837ja) {
        super(1);
        this.f32930a = c2837ja;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        Z9 it = (Z9) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        F5 f52 = this.f32930a.f32975b;
        if (f52 != null) {
            ((G5) f52).a("NovatiqDataHandler", "Novatiq hyper id synced");
        }
        return tu.x0.f87415a;
    }
}
