package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface u4 {
    static /* synthetic */ void showMenu$default(u4 u4Var, i1.j jVar, kv.a aVar, kv.a aVar2, kv.a aVar3, kv.a aVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        if ((i10 & 8) != 0) {
            aVar3 = null;
        }
        if ((i10 & 16) != 0) {
            aVar4 = null;
        }
        u4Var.showMenu(jVar, aVar, aVar2, aVar3, aVar4);
    }

    w4 getStatus();

    void hide();

    void showMenu(i1.j jVar, kv.a aVar, kv.a aVar2, kv.a aVar3, kv.a aVar4);
}
