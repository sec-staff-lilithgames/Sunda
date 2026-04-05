package a1;

import java.util.List;
import z.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f3406c;

    public i(u0 u0Var, String str, kv.a aVar) {
        this.f3404a = u0Var;
        this.f3405b = str;
        this.f3406c = aVar;
    }

    @Override // a1.g
    public void unregister() {
        u0 u0Var = this.f3404a;
        String str = this.f3405b;
        List list = (List) u0Var.remove(str);
        if (list != null) {
            list.remove(this.f3406c);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        u0Var.set(str, list);
    }
}
