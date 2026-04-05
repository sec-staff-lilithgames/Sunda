package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H3 extends Wa {

    /* renamed from: e, reason: collision with root package name */
    public final C2787ga f31834e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(Za dao) {
        super(dao);
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        this.f31834e = new C2787ga(dao, new G3(this), this.f32455d);
    }

    @Override // com.inmobi.media.Wa
    public final void a(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("H3", "TAG");
        String str = ping.f31914b;
        if (!a(ping.f31917e)) {
            WeakReference weakReference = (WeakReference) this.f32453b.get(ping.f31920h);
            Wa.a(0, "Database capacity exceeded for pings", (short) 2248, ping, System.currentTimeMillis(), weakReference != null ? (Va) weakReference.get() : null);
            return;
        }
        Za za2 = this.f32452a;
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        za2.a(ping);
        C2787ga c2787ga = this.f31834e;
        Objects.toString(c2787ga.f32134d);
        if (c2787ga.f32134d == Ma.f32032b) {
            c2787ga.f32134d = Ma.f32033c;
            c2787ga.a();
        }
    }
}
