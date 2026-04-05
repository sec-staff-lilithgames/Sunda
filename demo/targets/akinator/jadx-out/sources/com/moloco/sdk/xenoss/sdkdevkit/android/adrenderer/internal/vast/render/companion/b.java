package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f49545a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b, reason: collision with other inner class name */
    public static final class C0465b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0465b f49546a = new C0465b();

        public C0465b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f49547a = new c();

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f49548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            super(null);
            e0.checkNotNullParameter(error, "error");
            this.f49548a = error;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c a() {
            return this.f49548a;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
            return this.f49548a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && e0.areEqual(this.f49548a, ((d) obj).f49548a);
        }

        public int hashCode() {
            return this.f49548a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f49548a + ')';
        }

        public final d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
            e0.checkNotNullParameter(error, "error");
            return new d(error);
        }

        public static /* synthetic */ d a(d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = dVar.f49548a;
            }
            return dVar.a(cVar);
        }
    }

    public /* synthetic */ b(u uVar) {
        this();
    }

    public b() {
    }
}
