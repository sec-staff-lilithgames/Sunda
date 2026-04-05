package r6;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f83808a;

        public a(int i10) {
            super(null);
            this.f83808a = i10;
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = aVar.f83808a;
            }
            return aVar.copy(i10);
        }

        public final int component1() {
            return this.f83808a;
        }

        public final a copy(int i10) {
            return new a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f83808a == ((a) obj).f83808a;
        }

        public final int getReason() {
            return this.f83808a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f83808a);
        }

        public String toString() {
            return e3.g.m(new StringBuilder("ConstraintsNotMet(reason="), this.f83808a, ')');
        }
    }

    public c(u uVar) {
    }
}
