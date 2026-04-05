package pq;

import dq.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f81780b;

    public o(m mVar) {
        this.f81780b = mVar;
    }

    public void a(boolean z10) {
        k kVarM = this.f81780b.m();
        if (kVarM != null) {
            kVarM.c();
        }
    }

    @Override // dq.b0, ir.j, ir.d
    public /* bridge */ /* synthetic */ void execute(Object obj) {
        super.execute(obj);
    }

    @Override // dq.b0, ir.j, ir.d
    public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
        return super.executeSafely(obj);
    }

    @Override // dq.b0, ir.j
    public /* bridge */ /* synthetic */ void onExecute(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    @Override // dq.b0, ir.j
    public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
        super.onThrows(th2);
    }
}
