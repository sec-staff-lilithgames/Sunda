package com.inmobi.media;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import h2.rl.UeklptUrP;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3065x1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3082y1 f33555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3065x1(C3082y1 c3082y1) {
        super(1);
        this.f33555a = c3082y1;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        Z9 response = (Z9) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        boolean zB = response.b();
        String str = UeklptUrP.mfyPWwJgbJJ;
        if (zB) {
            F5 f52 = this.f33555a.f33591a.f33599a.f31653c;
            if (f52 != null) {
                String str2 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, str);
                ((G5) f52).b(str2, "asyncPing Failed");
            }
        } else {
            F5 f53 = this.f33555a.f33591a.f33599a.f31653c;
            if (f53 != null) {
                String str3 = C6.f31708a;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, str);
                ((G5) f53).a(str3, OIPXcgrVyyxoLF.rAiyAbBxaKU);
            }
        }
        return tu.x0.f87415a;
    }
}
