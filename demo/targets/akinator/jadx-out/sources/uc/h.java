package uc;

import jc.o;
import jc.r;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface h extends f {
    a expectAnyFormat(o oVar) throws r;

    b expectArrayFormat(o oVar) throws r;

    c expectBooleanFormat(o oVar) throws r;

    i expectIntegerFormat(o oVar) throws r;

    j expectMapFormat(o oVar) throws r;

    k expectNullFormat(o oVar) throws r;

    l expectNumberFormat(o oVar) throws r;

    m expectObjectFormat(o oVar) throws r;

    n expectStringFormat(o oVar) throws r;

    @Override // uc.f
    /* synthetic */ u0 getProvider();

    @Override // uc.f
    /* synthetic */ void setProvider(u0 u0Var);
}
