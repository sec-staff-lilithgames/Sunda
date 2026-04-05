package com.moloco.sdk.internal.ilrd;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public final String f46032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String reason) {
            super(null);
            e0.checkNotNullParameter(reason, "reason");
            this.f46032a = reason;
        }

        public final String a() {
            return this.f46032a;
        }

        public final String b() {
            return this.f46032a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && e0.areEqual(this.f46032a, ((a) obj).f46032a);
        }

        public int hashCode() {
            return this.f46032a.hashCode();
        }

        public String toString() {
            return o2.q(new StringBuilder("Error(reason="), this.f46032a, ')');
        }

        public final a a(String reason) {
            e0.checkNotNullParameter(reason, "reason");
            return new a(reason);
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f46032a;
            }
            return aVar.a(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final b f46033a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46034a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ m(u uVar) {
        this();
    }

    public m() {
    }
}
