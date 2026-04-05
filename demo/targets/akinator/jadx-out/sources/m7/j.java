package m7;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f74065c;

    /* renamed from: a, reason: collision with root package name */
    public final c f74066a;

    /* renamed from: b, reason: collision with root package name */
    public final c f74067b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        d dVar = d.f74053a;
        f74065c = new j(dVar, dVar);
    }

    public j(c cVar, c cVar2) {
        this.f74066a = cVar;
        this.f74067b = cVar2;
    }

    public static /* synthetic */ j copy$default(j jVar, c cVar, c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = jVar.f74066a;
        }
        if ((i10 & 2) != 0) {
            cVar2 = jVar.f74067b;
        }
        return jVar.copy(cVar, cVar2);
    }

    public final c component1() {
        return this.f74066a;
    }

    public final c component2() {
        return this.f74067b;
    }

    public final j copy(c cVar, c cVar2) {
        return new j(cVar, cVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return e0.areEqual(this.f74066a, jVar.f74066a) && e0.areEqual(this.f74067b, jVar.f74067b);
    }

    public final c getHeight() {
        return this.f74067b;
    }

    public final c getWidth() {
        return this.f74066a;
    }

    public int hashCode() {
        return this.f74067b.hashCode() + (this.f74066a.hashCode() * 31);
    }

    public String toString() {
        return "Size(width=" + this.f74066a + ", height=" + this.f74067b + ')';
    }
}
