package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.h5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2799h5 extends Wa {

    /* renamed from: e, reason: collision with root package name */
    public final U4 f32893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2799h5(Za dao) {
        super(dao);
        kotlin.jvm.internal.e0.checkNotNullParameter(dao, "dao");
        this.f32893e = new U4(dao, new C2782g5(this), this.f32455d);
    }

    @Override // com.inmobi.media.Wa
    public final void a(Ja ping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
        try {
            String str = ping.f31914b;
            WeakReference weakReference = (WeakReference) this.f32453b.get(ping.f31920h);
            Va va2 = weakReference != null ? (Va) weakReference.get() : null;
            if (!a(ping.f31917e)) {
                Wa.a(0, "Database capacity exceeded for pings", (short) 2248, ping, System.currentTimeMillis(), va2);
                return;
            }
            Za za2 = this.f32452a;
            kotlin.jvm.internal.e0.checkNotNullParameter(ping, "ping");
            za2.a(ping);
            U4 u42 = this.f32893e;
            Objects.toString(u42.f32134d);
            if (u42.f32134d == Ma.f32032b) {
                u42.f32134d = Ma.f32033c;
                u42.a();
                u42.d();
            }
            Na naA = this.f32455d.a(ping);
            if (Qa.a(naA)) {
                String str2 = naA.f32074a.f31914b;
                b(naA, va2);
            } else {
                String str3 = naA.f32074a.f31914b;
                a(naA, va2);
            }
        } catch (Error e10) {
            WeakReference weakReference2 = (WeakReference) this.f32453b.get(ping.f31920h);
            Wa.a(0, e10.getMessage(), (short) 2251, ping, System.currentTimeMillis(), weakReference2 != null ? (Va) weakReference2.get() : null);
        } catch (Exception e11) {
            WeakReference weakReference3 = (WeakReference) this.f32453b.get(ping.f31920h);
            Wa.a(0, e11.getMessage(), (short) 2250, ping, System.currentTimeMillis(), weakReference3 != null ? (Va) weakReference3.get() : null);
        }
    }
}
