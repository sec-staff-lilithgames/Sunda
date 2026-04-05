package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f32149a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final tu.o f32150b = tu.q.lazy(N2.f32042a);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f32151c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f32152d = new AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f32153e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final tu.o f32154f = tu.q.lazy(M2.f32019a);

    static {
        C2925od.f().a(new int[]{2, 1}, J2.f31898a);
        C2925od.a(new al.b(15));
    }

    public static final Config a(String str, String str2, P2 p22) {
        return O2.a(str, str2, p22);
    }

    public static final /* synthetic */ String b() {
        return "ConfigBootstrapHandler";
    }

    public static final /* synthetic */ String f() {
        return "Q2";
    }

    public static final void g() {
        O2.a();
    }

    public static final void h() {
        if (f32151c.getAndSet(false)) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(f(), "access$getTAG$cp(...)");
            ((K2) f32150b.getValue()).sendEmptyMessage(5);
        }
    }

    public static final void a() {
        O2.a();
    }
}
