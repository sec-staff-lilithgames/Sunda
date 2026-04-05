package e6;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f53861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f53862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f53864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f53865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f53866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f53867g;

    public p(s sVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f53867g = sVar;
        this.f53861a = obj;
        this.f53862b = arrayList;
        this.f53863c = obj2;
        this.f53864d = arrayList2;
        this.f53865e = obj3;
        this.f53866f = arrayList3;
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionEnd(c0 c0Var, boolean z10) {
        super.onTransitionEnd(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public /* bridge */ /* synthetic */ void onTransitionStart(c0 c0Var, boolean z10) {
        super.onTransitionStart(c0Var, z10);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionEnd(c0 c0Var) {
        c0Var.removeListener(this);
    }

    @Override // e6.j0, e6.g0
    public void onTransitionStart(c0 c0Var) {
        s sVar = this.f53867g;
        Object obj = this.f53861a;
        if (obj != null) {
            sVar.replaceTargets(obj, this.f53862b, null);
        }
        Object obj2 = this.f53863c;
        if (obj2 != null) {
            sVar.replaceTargets(obj2, this.f53864d, null);
        }
        Object obj3 = this.f53865e;
        if (obj3 != null) {
            sVar.replaceTargets(obj3, this.f53866f, null);
        }
    }
}
