package r8;

import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m extends j9.n implements o {

    /* renamed from: e, reason: collision with root package name */
    public n f84028e;

    public m(long j10) {
        super(j10);
    }

    @Override // j9.n
    public final int a(Object obj) {
        v0 v0Var = (v0) obj;
        if (v0Var == null) {
            return 1;
        }
        return v0Var.getSize();
    }

    @Override // j9.n
    public final void b(Object obj, Object obj2) {
        v0 v0Var = (v0) obj2;
        n nVar = this.f84028e;
        if (nVar == null || v0Var == null) {
            return;
        }
        nVar.onResourceRemoved(v0Var);
    }

    @Override // r8.o
    public /* bridge */ /* synthetic */ v0 put(n8.q qVar, v0 v0Var) {
        return (v0) super.put((Object) qVar, (Object) v0Var);
    }

    @Override // r8.o
    public /* bridge */ /* synthetic */ v0 remove(n8.q qVar) {
        return (v0) super.remove((Object) qVar);
    }

    @Override // r8.o
    public void setResourceRemovedListener(n nVar) {
        this.f84028e = nVar;
    }

    @Override // r8.o
    public void trimMemory(int i10) {
        if (i10 >= 40) {
            clearMemory();
        } else if (i10 >= 20 || i10 == 15) {
            c(getMaxSize() / 2);
        }
    }
}
