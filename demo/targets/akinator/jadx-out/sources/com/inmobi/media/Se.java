package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C3191e4;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Se {

    /* renamed from: a, reason: collision with root package name */
    public static final Se f32278a = new Se();

    /* renamed from: b, reason: collision with root package name */
    public static X0 f32279b;

    public static void e() {
        boolean z10;
        boolean zBooleanValue;
        X0 x02;
        try {
            Context contextD = C2925od.d();
            if (contextD != null) {
                X0 x03 = new X0();
                try {
                    kotlin.jvm.internal.c1.getOrCreateKotlinClass(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(contextD);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        x03.a(advertisingIdInfo.getId());
                        x03.a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f32279b = x03;
                        Boolean bool = AbstractC3024ub.f33454b;
                        if (bool == null) {
                            Context contextD2 = C2925od.d();
                            z10 = false;
                            if (contextD2 != null) {
                                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                                I6 i6A = H6.a(contextD2, "user_info_store");
                                kotlin.jvm.internal.e0.checkNotNullParameter("user_age_restricted", C3191e4.h.W);
                                AbstractC3024ub.f33454b = Boolean.valueOf(i6A.f31866a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC3024ub.f33454b;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            }
                            if (z10 && (x02 = f32279b) != null) {
                                x02.a((String) null);
                            }
                            return;
                        }
                        zBooleanValue = bool.booleanValue();
                        z10 = zBooleanValue;
                        if (z10) {
                            x02.a((String) null);
                        }
                    } catch (Exception unused) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("Se", "TAG");
                    }
                } catch (NoClassDefFoundError unused2) {
                }
            }
        } catch (Exception unused3) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Se", "TAG");
        }
    }

    public static final void f() {
        e();
    }

    public final void a() {
        try {
            e();
            d();
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Se", "TAG");
        }
    }

    public final X0 b() {
        return f32279b;
    }

    public final Boolean c() {
        X0 x02 = f32279b;
        if (x02 != null) {
            return x02.c();
        }
        return null;
    }

    public final void d() {
        String strA;
        try {
            X0 x02 = f32279b;
            if (x02 == null || (strA = x02.a()) == null) {
                return;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Se", "TAG");
            AbstractC2902n7.a((byte) 2, "Se", "Publisher device Id is ".concat(strA));
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("Se", "TAG");
        }
    }

    public final void a(boolean z10) {
        X0 x02 = f32279b;
        if (x02 == null) {
            return;
        }
        if (z10) {
            x02.a((String) null);
        } else if (x02.a() == null) {
            C2925od.a(new al.b(21));
        }
    }
}
