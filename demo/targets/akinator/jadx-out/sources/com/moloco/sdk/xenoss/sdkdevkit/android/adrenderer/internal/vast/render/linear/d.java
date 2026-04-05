package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49974a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f49975a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49976a = new c();

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$d, reason: collision with other inner class name */
    public static final class C0481d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final n f49977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0481d(n error) {
            super(null);
            e0.checkNotNullParameter(error, "error");
            this.f49977a = error;
        }

        public final n a() {
            return this.f49977a;
        }

        public final n b() {
            return this.f49977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0481d) && this.f49977a == ((C0481d) obj).f49977a;
        }

        public int hashCode() {
            return this.f49977a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f49977a + ')';
        }

        public final C0481d a(n error) {
            e0.checkNotNullParameter(error, "error");
            return new C0481d(error);
        }

        public static /* synthetic */ C0481d a(C0481d c0481d, n nVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                nVar = c0481d.f49977a;
            }
            return c0481d.a(nVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final e f49978a = new e();

        public e() {
            super(null);
        }
    }

    public /* synthetic */ d(u uVar) {
        this();
    }

    public d() {
    }
}
