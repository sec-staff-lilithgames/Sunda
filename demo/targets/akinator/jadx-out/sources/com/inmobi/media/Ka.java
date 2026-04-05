package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ka {

    /* renamed from: a, reason: collision with root package name */
    public static C2799h5 f31952a;

    /* renamed from: b, reason: collision with root package name */
    public static H3 f31953b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f31954c = new AtomicBoolean(false);

    public static void a() {
        LinkedHashMap linkedHashMap = Q2.f32149a;
        if (((AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null)).getPingsV2Config().getEnabled() && f31954c.compareAndSet(false, true)) {
            Za za2 = new Za();
            f31952a = new C2799h5(za2);
            f31953b = new H3(za2);
            C2799h5 c2799h5 = f31952a;
            if (c2799h5 != null) {
                U4 u42 = c2799h5.f32893e;
                u42.getClass();
                Ma ma2 = Ma.f32033c;
                if (u42.a(ma2)) {
                    u42.f32134d = ma2;
                    u42.a();
                    u42.c();
                    u42.d();
                }
            }
            H3 h32 = f31953b;
            if (h32 != null) {
                C2787ga c2787ga = h32.f31834e;
                c2787ga.getClass();
                Ma ma3 = Ma.f32033c;
                if (c2787ga.a(ma3)) {
                    c2787ga.f32134d = ma3;
                    c2787ga.a();
                }
            }
        }
    }
}
