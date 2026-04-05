package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final long f49958a;

        public a(long j10) {
            super(null);
            this.f49958a = j10;
        }

        public final long a() {
            return this.f49958a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f49959a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public final long f49960a;

        /* renamed from: b, reason: collision with root package name */
        public final long f49961b;

        public c(long j10, long j11) {
            super(null);
            this.f49960a = j10;
            this.f49961b = j11;
        }

        public final long a() {
            return this.f49960a;
        }

        public final long b() {
            return this.f49961b;
        }

        public final long c() {
            return this.f49960a;
        }

        public final long d() {
            return this.f49961b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f49960a == cVar.f49960a && this.f49961b == cVar.f49961b;
        }

        public int hashCode() {
            return Long.hashCode(this.f49961b) + (Long.hashCode(this.f49960a) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Position(currentPositionMillis=");
            sb2.append(this.f49960a);
            sb2.append(", totalDurationMillis=");
            return e3.g.n(sb2, this.f49961b, ')');
        }

        public final c a(long j10, long j11) {
            return new c(j10, j11);
        }

        public static /* synthetic */ c a(c cVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = cVar.f49960a;
            }
            if ((i10 & 2) != 0) {
                j11 = cVar.f49961b;
            }
            return cVar.a(j10, j11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends j {

        /* renamed from: a, reason: collision with root package name */
        public final long f49962a;

        public d(long j10) {
            super(null);
            this.f49962a = j10;
        }

        public final long a() {
            return this.f49962a;
        }

        public final long b() {
            return this.f49962a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f49962a == ((d) obj).f49962a;
        }

        public int hashCode() {
            return Long.hashCode(this.f49962a);
        }

        public String toString() {
            return e3.g.n(new StringBuilder("Preparing(totalDurationMillis="), this.f49962a, ')');
        }

        public final d a(long j10) {
            return new d(j10);
        }

        public static /* synthetic */ d a(d dVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = dVar.f49962a;
            }
            return dVar.a(j10);
        }
    }

    public /* synthetic */ j(u uVar) {
        this();
    }

    public j() {
    }
}
