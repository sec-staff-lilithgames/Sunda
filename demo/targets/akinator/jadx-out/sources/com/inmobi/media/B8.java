package com.inmobi.media;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B8 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f31665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C8 f31666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(C8 c82, String str) {
        super(0);
        this.f31665a = str;
        this.f31666b = c82;
    }

    @Override // kv.a
    public final Object invoke() {
        C2826j c2826jB = AbstractC2807hd.a().b(this.f31665a);
        if (c2826jB != null) {
            C8 c82 = this.f31666b;
            try {
                String str = c2826jB.f32941c;
                if (str != null) {
                    return C8.a(c82, str);
                }
            } catch (Exception e10) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(c82.f31709x, "access$getTAG$p(...)");
                Y5 y52 = Y5.f32563a;
                Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            }
        }
        return null;
    }
}
