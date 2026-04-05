package q1;

import kotlin.jvm.internal.u;
import kv.l;
import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final l f82394a;

    /* renamed from: b, reason: collision with root package name */
    public final j2 f82395b;

    public d(int i10, l lVar, u uVar) {
        this.f82394a = lVar;
        this.f82395b = o5.mutableStateOf$default(b.m5965boximpl(i10), null, 2, null);
    }

    @Override // q1.c
    /* renamed from: getInputMode-aOaMEAU */
    public int mo5972getInputModeaOaMEAU() {
        return ((b) this.f82395b.getValue()).m5971unboximpl();
    }

    @Override // q1.c
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo5973requestInputModeiuPiT84(int i10) {
        return ((Boolean) this.f82394a.invoke(b.m5965boximpl(i10))).booleanValue();
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m5974setInputModeiuPiT84(int i10) {
        this.f82395b.setValue(b.m5965boximpl(i10));
    }
}
