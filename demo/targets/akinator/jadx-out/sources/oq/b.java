package oq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    static /* synthetic */ void a(b bVar, dq.h hVar, br.i iVar, boolean z10, Runnable runnable, Runnable runnable2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareAndAnimate");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        bVar.a(hVar, iVar, z10, (i10 & 8) != 0 ? null : runnable, (i10 & 16) != 0 ? null : runnable2);
    }

    void a();

    void a(dq.h hVar);

    void a(dq.h hVar, br.i iVar, boolean z10, Runnable runnable, Runnable runnable2);

    void a(dq.h hVar, boolean z10, br.i iVar);

    void a(dq.i iVar);

    void a(dq.i iVar, br.i iVar2);

    void a(dq.i iVar, br.i iVar2, boolean z10, Runnable runnable, Runnable runnable2);

    boolean a(int i10);

    void b(dq.h hVar, br.i iVar, boolean z10, Runnable runnable, Runnable runnable2);
}
