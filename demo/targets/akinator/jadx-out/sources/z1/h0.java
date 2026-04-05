package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f97313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b0 b0Var) {
        super(2);
        this.f97313e = b0Var;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((tu.x0) obj, (e1.u) obj2);
        return tu.x0.f87415a;
    }

    public final void invoke(tu.x0 x0Var, e1.u mod) {
        Object obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(x0Var, "<anonymous parameter 0>");
        kotlin.jvm.internal.e0.checkNotNullParameter(mod, "mod");
        r0.c cVar = this.f97313e.f97264l;
        int size = cVar.getSize();
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = cVar.getContent();
            do {
                obj = content[i10];
                f1 f1Var = (f1) obj;
                if (f1Var.getModifier() == mod && !f1Var.getToBeReusedForSameModifier()) {
                    break;
                } else {
                    i10--;
                }
            } while (i10 >= 0);
            obj = null;
        } else {
            obj = null;
        }
        f1 f1Var2 = (f1) obj;
        if (f1Var2 == null) {
            return;
        }
        f1Var2.setToBeReusedForSameModifier(true);
    }
}
