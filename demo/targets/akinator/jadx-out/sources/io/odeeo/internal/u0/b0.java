package io.odeeo.internal.u0;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b0<C extends Comparable> implements Comparable<b0<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C f66531a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b0<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f66532b = new a();
        private static final long serialVersionUID = 0;

        public a() {
            super(null);
        }

        private Object readResolve() {
            return f66532b;
        }

        @Override // io.odeeo.internal.u0.b0
        public void a(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.b0
        public void b(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // io.odeeo.internal.u0.b0
        public boolean c(Comparable<?> comparable) {
            return false;
        }

        @Override // io.odeeo.internal.u0.b0, java.lang.Comparable
        public int compareTo(b0<Comparable<?>> b0Var) {
            return b0Var == this ? 0 : 1;
        }

        @Override // io.odeeo.internal.u0.b0
        public o d() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // io.odeeo.internal.u0.b0
        public o e() {
            throw new IllegalStateException();
        }

        @Override // io.odeeo.internal.u0.b0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "+∞";
        }

        @Override // io.odeeo.internal.u0.b0
        public Comparable<?> c() {
            throw new IllegalStateException("range unbounded on this side");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<C extends Comparable> extends b0<C> {
        private static final long serialVersionUID = 0;

        public b(C c10) {
            super((Comparable) io.odeeo.internal.t0.u.checkNotNull(c10));
        }

        @Override // io.odeeo.internal.u0.b0
        public void a(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f66531a);
        }

        @Override // io.odeeo.internal.u0.b0
        public void b(StringBuilder sb2) {
            sb2.append(this.f66531a);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }

        @Override // io.odeeo.internal.u0.b0
        public boolean c(C c10) {
            return s2.a(this.f66531a, c10) < 0;
        }

        @Override // io.odeeo.internal.u0.b0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((b0) obj);
        }

        @Override // io.odeeo.internal.u0.b0
        public o d() {
            return o.OPEN;
        }

        @Override // io.odeeo.internal.u0.b0
        public o e() {
            return o.CLOSED;
        }

        @Override // io.odeeo.internal.u0.b0
        public int hashCode() {
            return ~this.f66531a.hashCode();
        }

        public String toString() {
            return "/" + this.f66531a + "\\";
        }

        @Override // io.odeeo.internal.u0.b0
        public b0<C> a(c0<C> c0Var) {
            Comparable comparableB = b(c0Var);
            return comparableB != null ? b0.b(comparableB) : b0.a();
        }

        public C b(c0<C> c0Var) {
            return (C) c0Var.next(this.f66531a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends b0<Comparable<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f66533b = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(null);
        }

        private Object readResolve() {
            return f66533b;
        }

        @Override // io.odeeo.internal.u0.b0
        public void a(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        @Override // io.odeeo.internal.u0.b0
        public void b(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // io.odeeo.internal.u0.b0
        public boolean c(Comparable<?> comparable) {
            return true;
        }

        @Override // io.odeeo.internal.u0.b0, java.lang.Comparable
        public int compareTo(b0<Comparable<?>> b0Var) {
            return b0Var == this ? 0 : -1;
        }

        @Override // io.odeeo.internal.u0.b0
        public o d() {
            throw new IllegalStateException();
        }

        @Override // io.odeeo.internal.u0.b0
        public o e() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // io.odeeo.internal.u0.b0
        public int hashCode() {
            return System.identityHashCode(this);
        }

        public String toString() {
            return "-∞";
        }

        @Override // io.odeeo.internal.u0.b0
        public b0<Comparable<?>> a(c0<Comparable<?>> c0Var) {
            try {
                return b0.b(c0Var.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        @Override // io.odeeo.internal.u0.b0
        public Comparable<?> c() {
            throw new IllegalStateException("range unbounded on this side");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d<C extends Comparable> extends b0<C> {
        private static final long serialVersionUID = 0;

        public d(C c10) {
            super((Comparable) io.odeeo.internal.t0.u.checkNotNull(c10));
        }

        @Override // io.odeeo.internal.u0.b0
        public void a(StringBuilder sb2) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f66531a);
        }

        @Override // io.odeeo.internal.u0.b0
        public void b(StringBuilder sb2) {
            sb2.append(this.f66531a);
            sb2.append(')');
        }

        @Override // io.odeeo.internal.u0.b0
        public boolean c(C c10) {
            return s2.a(this.f66531a, c10) <= 0;
        }

        @Override // io.odeeo.internal.u0.b0, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((b0) obj);
        }

        @Override // io.odeeo.internal.u0.b0
        public o d() {
            return o.CLOSED;
        }

        @Override // io.odeeo.internal.u0.b0
        public o e() {
            return o.OPEN;
        }

        @Override // io.odeeo.internal.u0.b0
        public int hashCode() {
            return this.f66531a.hashCode();
        }

        public String toString() {
            return "\\" + this.f66531a + "/";
        }
    }

    public b0(C c10) {
        this.f66531a = c10;
    }

    public static <C extends Comparable> b0<C> b() {
        return c.f66533b;
    }

    public b0<C> a(c0<C> c0Var) {
        return this;
    }

    public abstract void a(StringBuilder sb2);

    public abstract void b(StringBuilder sb2);

    public C c() {
        return this.f66531a;
    }

    public abstract boolean c(C c10);

    public abstract o d();

    public abstract o e();

    public boolean equals(Object obj) {
        if (obj instanceof b0) {
            try {
                if (compareTo((b0) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    public static <C extends Comparable> b0<C> a() {
        return a.f66532b;
    }

    public static <C extends Comparable> b0<C> b(C c10) {
        return new d(c10);
    }

    @Override // java.lang.Comparable
    public int compareTo(b0<C> b0Var) {
        if (b0Var == b()) {
            return 1;
        }
        if (b0Var == a()) {
            return -1;
        }
        int iA = s2.a(this.f66531a, b0Var.f66531a);
        return iA != 0 ? iA : io.odeeo.internal.w0.a.compare(this instanceof b, b0Var instanceof b);
    }

    public static <C extends Comparable> b0<C> a(C c10) {
        return new b(c10);
    }
}
