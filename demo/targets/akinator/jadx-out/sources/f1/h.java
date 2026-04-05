package f1;

import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f55287e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static int f55288f;

    /* renamed from: a, reason: collision with root package name */
    public final List f55289a;

    /* renamed from: b, reason: collision with root package name */
    public i1.j f55290b;

    /* renamed from: c, reason: collision with root package name */
    public final l f55291c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55292d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final int access$generateId(a aVar) {
            int i10;
            synchronized (aVar) {
                h.f55288f++;
                i10 = h.f55288f;
            }
            return i10;
        }
    }

    public h(List<? extends j> autofillTypes, i1.j jVar, l lVar) {
        e0.checkNotNullParameter(autofillTypes, "autofillTypes");
        this.f55289a = autofillTypes;
        this.f55290b = jVar;
        this.f55291c = lVar;
        this.f55292d = a.access$generateId(f55287e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e0.areEqual(this.f55289a, hVar.f55289a) && e0.areEqual(this.f55290b, hVar.f55290b) && e0.areEqual(this.f55291c, hVar.f55291c);
    }

    public final List<j> getAutofillTypes() {
        return this.f55289a;
    }

    public final i1.j getBoundingBox() {
        return this.f55290b;
    }

    public final int getId() {
        return this.f55292d;
    }

    public final l getOnFill() {
        return this.f55291c;
    }

    public int hashCode() {
        int iHashCode = this.f55289a.hashCode() * 31;
        i1.j jVar = this.f55290b;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        l lVar = this.f55291c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final void setBoundingBox(i1.j jVar) {
        this.f55290b = jVar;
    }

    public /* synthetic */ h(List list, i1.j jVar, l lVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? p0.emptyList() : list, (i10 & 2) != 0 ? null : jVar, lVar);
    }
}
