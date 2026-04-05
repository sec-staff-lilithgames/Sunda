package com.moloco.sdk.internal.services;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends o {

        /* renamed from: a, reason: collision with root package name */
        public final String f47163a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            this.f47163a = id2;
        }

        public final String a() {
            return this.f47163a;
        }

        public final String b() {
            return this.f47163a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f47163a, ((a) obj).f47163a);
        }

        public int hashCode() {
            return this.f47163a.hashCode();
        }

        public String toString() {
            return o2.q(new StringBuilder("Available(id="), this.f47163a, ')');
        }

        public final a a(String id2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            return new a(id2);
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f47163a;
            }
            return aVar.a(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f47164a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ o(kotlin.jvm.internal.u uVar) {
        this();
    }

    public o() {
    }
}
