package o6;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f77981a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f77982b;

    public y(w delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f77981a = delegate;
        this.f77982b = new Object();
    }

    @Override // o6.w
    public boolean contains(v6.s id2) {
        boolean zContains;
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        synchronized (this.f77982b) {
            zContains = this.f77981a.contains(id2);
        }
        return zContains;
    }

    @Override // o6.w
    public /* bridge */ /* synthetic */ u remove(v6.b0 b0Var) {
        return super.remove(b0Var);
    }

    @Override // o6.w
    public /* bridge */ /* synthetic */ u tokenFor(v6.b0 b0Var) {
        return super.tokenFor(b0Var);
    }

    @Override // o6.w
    public u remove(v6.s id2) {
        u uVarRemove;
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        synchronized (this.f77982b) {
            uVarRemove = this.f77981a.remove(id2);
        }
        return uVarRemove;
    }

    @Override // o6.w
    public u tokenFor(v6.s id2) {
        u uVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        synchronized (this.f77982b) {
            uVar = this.f77981a.tokenFor(id2);
        }
        return uVar;
    }

    @Override // o6.w
    public List<u> remove(String workSpecId) {
        List<u> listRemove;
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f77982b) {
            listRemove = this.f77981a.remove(workSpecId);
        }
        return listRemove;
    }
}
