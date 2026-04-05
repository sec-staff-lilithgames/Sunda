package m7;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f74052a;

        public a(int i10) {
            super(null);
            this.f74052a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f74052a == ((a) obj).f74052a;
            }
            return false;
        }

        public int hashCode() {
            return this.f74052a;
        }

        public String toString() {
            return String.valueOf(this.f74052a);
        }
    }

    public c(u uVar) {
    }
}
