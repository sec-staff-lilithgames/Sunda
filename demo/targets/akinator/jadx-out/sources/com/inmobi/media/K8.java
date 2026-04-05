package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import h2.rl.UeklptUrP;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K8 implements InterfaceC2955q9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N8 f31949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2887m9 f31950b;

    public K8(N8 n82, C2887m9 c2887m9) {
        this.f31949a = n82;
        this.f31950b = c2887m9;
    }

    public final void a(byte b10) {
        C2734d8 c2734d8 = this.f31949a.f32052b;
        if (c2734d8.f32759t || !(c2734d8 instanceof C2853k9) || b10 == 4) {
            return;
        }
        try {
            if (b10 == 0) {
                AbstractC3045vf abstractC3045vf = ((C2853k9) c2734d8).f32755p;
                if (abstractC3045vf != null) {
                    abstractC3045vf.a((byte) 5);
                    return;
                }
                return;
            }
            if (b10 == 1) {
                ((C2853k9) c2734d8).g(this.f31950b);
                return;
            }
            if (b10 == 2) {
                ((C2853k9) c2734d8).f(this.f31950b);
            } else if (b10 == 3) {
                ((C2853k9) c2734d8).h(this.f31950b);
            } else if (b10 == 5) {
                ((C2853k9) c2734d8).d(this.f31950b);
            }
        } catch (Exception e10) {
            N8 n82 = this.f31949a;
            F5 f52 = n82.f32056f;
            if (f52 != null) {
                String str = n82.f32057g;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                StringBuilder sb2 = new StringBuilder(UeklptUrP.OYZiOAjTMODHDk);
                sb2.append((int) b10);
                sb2.append(") event; ");
                ((G5) f52).b(str, Qf.a(e10, sb2));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }
}
