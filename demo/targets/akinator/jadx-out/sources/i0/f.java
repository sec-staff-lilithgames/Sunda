package i0;

import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f {
    static /* synthetic */ Object bringIntoView$default(f fVar, i1.j jVar, zu.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        return fVar.bringIntoView(jVar, dVar);
    }

    Object bringIntoView(i1.j jVar, zu.d<? super x0> dVar);
}
