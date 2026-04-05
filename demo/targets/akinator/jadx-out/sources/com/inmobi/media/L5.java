package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Xe f31988a;

    /* renamed from: b, reason: collision with root package name */
    public final C2690af f31989b;

    public L5(Xe xe2, C2690af request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        this.f31988a = xe2;
        this.f31989b = request;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i10 = 0;
        while (true) {
            C2690af c2690af = this.f31989b;
            if (i10 > c2690af.f32374y) {
                return;
            }
            Z9 z9B = c2690af.b();
            if (this.f31989b.A.get()) {
                return;
            }
            if (z9B.b()) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("L5", "TAG");
                S9 s92 = z9B.f32602d;
                if (i10 == this.f31989b.f32374y) {
                    this.f31988a.a(s92);
                    return;
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(z9B.a());
                    if (kotlin.jvm.internal.e0.areEqual(JSONObject.class, JSONObject.class)) {
                        this.f31988a.a(jSONObject);
                    } else {
                        this.f31988a.a(new C3053w6().a(jSONObject, JSONObject.class));
                    }
                    return;
                } catch (Exception e10) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("L5", "TAG");
                    if (i10 == this.f31989b.f32374y) {
                        Xe xe2 = this.f31988a;
                        EnumC3017u4 enumC3017u4 = EnumC3017u4.f33429l;
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Exception while parsing the response";
                        }
                        xe2.a(new S9(enumC3017u4, message));
                        return;
                    }
                }
            }
            try {
                Thread.sleep(this.f31989b.f32375z * 1000);
            } catch (InterruptedException unused) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("L5", "TAG");
            }
            if (this.f31989b.A.get()) {
                return;
            } else {
                i10++;
            }
        }
    }
}
