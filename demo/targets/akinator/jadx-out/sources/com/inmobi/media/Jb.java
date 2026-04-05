package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Jb extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ob f31924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jb(Ob ob2) {
        super(1);
        this.f31924a = ob2;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C3092yb data = (C3092yb) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        int iIncrementAndGet = this.f31924a.f32097c.incrementAndGet();
        Ob ob2 = this.f31924a;
        if (iIncrementAndGet == ob2.f32099e) {
            if (data.f33608a == 0 && data.f33609b == 0) {
                ob2.a(new Ab((short) 2234), (C3092yb) null);
            } else {
                sv.d0.trimMargin$default("No of In-App Purchases: " + data.f33608a + "\n                                    | and No of Subscriptions: " + data.f33609b, null, 1, null);
                this.f31924a.a(Bb.f31676a, data);
            }
        }
        return tu.x0.f87415a;
    }
}
