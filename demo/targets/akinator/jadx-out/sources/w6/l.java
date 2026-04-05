package w6;

import androidx.lifecycle.r1;
import androidx.lifecycle.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public Object f90422b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x6.b f90423c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f90424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.a f90425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f90426g;

    public l(x6.b bVar, Object obj, t.a aVar, r1 r1Var) {
        this.f90423c = bVar;
        this.f90424e = obj;
        this.f90425f = aVar;
        this.f90426g = r1Var;
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(Object obj) {
        this.f90423c.executeOnTaskThread(new k(this, obj));
    }
}
