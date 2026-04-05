package b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x0 implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final z0.a f8701b = new z0.a(0);

    @Override // b1.w0
    public abstract /* synthetic */ y0 getFirstStateRecord();

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m126isReadInh_f27i8$runtime(int i10) {
        return (i10 & j.m117constructorimpl(this.f8701b.get())) != 0;
    }

    @Override // b1.w0
    public /* bridge */ /* synthetic */ y0 mergeRecords(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        return super.mergeRecords(y0Var, y0Var2, y0Var3);
    }

    @Override // b1.w0
    public abstract /* synthetic */ void prependStateRecord(y0 y0Var);

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m127recordReadInh_f27i8$runtime(int i10) {
        z0.a aVar;
        int iM117constructorimpl;
        do {
            aVar = this.f8701b;
            iM117constructorimpl = j.m117constructorimpl(aVar.get());
            if ((iM117constructorimpl & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(iM117constructorimpl, j.m117constructorimpl(iM117constructorimpl | i10)));
    }
}
