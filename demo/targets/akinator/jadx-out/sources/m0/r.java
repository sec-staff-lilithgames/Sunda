package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface r {
    /* renamed from: updateSelection-qCDeeow$default, reason: not valid java name */
    static /* synthetic */ tu.v m5563updateSelectionqCDeeow$default(r rVar, long j10, long j11, i1.h hVar, boolean z10, x1.d0 d0Var, b0 b0Var, s sVar, int i10, Object obj) {
        if (obj == null) {
            return rVar.mo5553updateSelectionqCDeeow(j10, j11, hVar, (i10 & 8) != 0 ? true : z10, d0Var, b0Var, (i10 & 64) != 0 ? null : sVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }

    i1.j getBoundingBox(int i10);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo5551getHandlePositiondBAh8RU(s sVar, boolean z10);

    x1.d0 getLayoutCoordinates();

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo5552getRangeOfLineContainingjx7JFs(int i10);

    s getSelectAllSelection();

    long getSelectableId();

    g2.b getText();

    /* renamed from: updateSelection-qCDeeow */
    tu.v mo5553updateSelectionqCDeeow(long j10, long j11, i1.h hVar, boolean z10, x1.d0 d0Var, b0 b0Var, s sVar);
}
