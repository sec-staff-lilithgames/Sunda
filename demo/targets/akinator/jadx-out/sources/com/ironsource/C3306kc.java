package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3306kc {

    /* renamed from: e, reason: collision with root package name */
    public static final a f37095e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static volatile C3306kc f37096f;

    /* renamed from: a, reason: collision with root package name */
    private Dd f37097a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f37098b;

    /* renamed from: c, reason: collision with root package name */
    private String f37099c;

    /* renamed from: d, reason: collision with root package name */
    private V3 f37100d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.kc$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final C3306kc a() {
            C3306kc c3306kc;
            C3306kc c3306kc2 = C3306kc.f37096f;
            if (c3306kc2 != null) {
                return c3306kc2;
            }
            synchronized (this) {
                c3306kc = C3306kc.f37096f;
                if (c3306kc == null) {
                    c3306kc = new C3306kc(null);
                    C3306kc.f37096f = c3306kc;
                }
            }
            return c3306kc;
        }

        private a() {
        }

        public final InterfaceC3170d1 a(IronSource.a adFormat) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
            C3306kc c3306kc = C3306kc.f37096f;
            V3 v3B = c3306kc != null ? c3306kc.b() : null;
            C3306kc c3306kc2 = C3306kc.f37096f;
            Dd ddE = c3306kc2 != null ? c3306kc2.e() : null;
            if (v3B != null && ddE != null) {
                return new C3455t3(v3B, ddE, adFormat);
            }
            return new C3355n5();
        }
    }

    public /* synthetic */ C3306kc(kotlin.jvm.internal.u uVar) {
        this();
    }

    public static final C3306kc d() {
        return f37095e.a();
    }

    public final V3 b() {
        return this.f37100d;
    }

    public final AtomicBoolean c() {
        return this.f37098b;
    }

    public final Dd e() {
        return this.f37097a;
    }

    public final String f() {
        return this.f37099c;
    }

    public final void g() {
        this.f37098b.set(true);
    }

    private C3306kc() {
        this.f37098b = new AtomicBoolean(false);
        this.f37099c = "";
    }

    public final void a(Dd dd2) {
        this.f37097a = dd2;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f37099c = str;
    }

    public final void a(V3 v32) {
        this.f37100d = v32;
    }
}
