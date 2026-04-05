package p0;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f80250a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f80251b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f80252c;

    /* renamed from: d, reason: collision with root package name */
    public final s4 f80253d;

    /* renamed from: e, reason: collision with root package name */
    public final b f80254e;

    /* renamed from: f, reason: collision with root package name */
    public List f80255f;

    /* renamed from: g, reason: collision with root package name */
    public final z2 f80256g;

    /* renamed from: h, reason: collision with root package name */
    public final List f80257h;

    public i2(f2 f2Var, Object obj, y0 y0Var, s4 s4Var, b bVar, List<? extends tu.v> list, z2 z2Var, List<i2> list2) {
        this.f80250a = f2Var;
        this.f80251b = obj;
        this.f80252c = y0Var;
        this.f80253d = s4Var;
        this.f80254e = bVar;
        this.f80255f = list;
        this.f80256g = z2Var;
        this.f80257h = list2;
    }

    public final b getAnchor$runtime() {
        return this.f80254e;
    }

    public final y0 getComposition$runtime() {
        return this.f80252c;
    }

    public final f2 getContent$runtime() {
        return this.f80250a;
    }

    public final List<tu.v> getInvalidations$runtime() {
        return this.f80255f;
    }

    public final z2 getLocals$runtime() {
        return this.f80256g;
    }

    public final List<i2> getNestedReferences$runtime() {
        return this.f80257h;
    }

    public final Object getParameter$runtime() {
        return this.f80251b;
    }

    public final s4 getSlotTable$runtime() {
        return this.f80253d;
    }

    public final void setInvalidations$runtime(List<? extends tu.v> list) {
        this.f80255f = list;
    }

    public final void transferPendingInvalidations$runtime() {
        List list = this.f80255f;
        y0 y0Var = this.f80252c;
        kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.f80255f = uu.y0.plus((Collection) list, (Iterable) ((j0) y0Var).extractInvalidationsOf$runtime(this.f80254e));
    }
}
