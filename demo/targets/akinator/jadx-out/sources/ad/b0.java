package ad;

import java.io.IOException;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 extends jc.w implements zc.j {

    /* renamed from: b, reason: collision with root package name */
    public final wc.j f4253b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.w f4254c;

    public b0(wc.j jVar, jc.w wVar) {
        this.f4253b = jVar;
        this.f4254c = wVar;
    }

    @Override // zc.j
    public jc.w createContextual(u0 u0Var, jc.g gVar) throws jc.r {
        jc.w wVar = this.f4254c;
        jc.w wVarHandleSecondaryContextualization = wVar instanceof zc.j ? u0Var.handleSecondaryContextualization(wVar, gVar) : wVar;
        return wVarHandleSecondaryContextualization == wVar ? this : new b0(this.f4253b, wVarHandleSecondaryContextualization);
    }

    @Override // jc.w
    public Class<Object> handledType() {
        return Object.class;
    }

    @Override // jc.w
    public void serialize(Object obj, ub.o oVar, u0 u0Var) throws IOException {
        this.f4254c.serializeWithType(obj, oVar, u0Var, this.f4253b);
    }

    @Override // jc.w
    public void serializeWithType(Object obj, ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        this.f4254c.serializeWithType(obj, oVar, u0Var, jVar);
    }

    public wc.j typeSerializer() {
        return this.f4253b;
    }

    public jc.w valueSerializer() {
        return this.f4254c;
    }
}
