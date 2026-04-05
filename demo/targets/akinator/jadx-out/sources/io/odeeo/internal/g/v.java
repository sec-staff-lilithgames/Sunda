package io.odeeo.internal.g;

import com.ironsource.C3191e4;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface v {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final w f64172a;

        /* renamed from: b, reason: collision with root package name */
        public final w f64173b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f64172a.equals(aVar.f64172a) && this.f64173b.equals(aVar.f64173b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f64173b.hashCode() + (this.f64172a.hashCode() * 31);
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
            sb2.append(this.f64172a);
            if (this.f64172a.equals(this.f64173b)) {
                str = "";
            } else {
                str = ", " + this.f64173b;
            }
            return o2.o(sb2, str, C3191e4.i.f36531e);
        }

        public a(w wVar, w wVar2) {
            this.f64172a = (w) io.odeeo.internal.q0.a.checkNotNull(wVar);
            this.f64173b = (w) io.odeeo.internal.q0.a.checkNotNull(wVar2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements v {

        /* renamed from: a, reason: collision with root package name */
        public final long f64174a;

        /* renamed from: b, reason: collision with root package name */
        public final a f64175b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // io.odeeo.internal.g.v
        public long getDurationUs() {
            return this.f64174a;
        }

        @Override // io.odeeo.internal.g.v
        public a getSeekPoints(long j10) {
            return this.f64175b;
        }

        @Override // io.odeeo.internal.g.v
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f64174a = j10;
            this.f64175b = new a(j11 == 0 ? w.f64176c : new w(0L, j11));
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
