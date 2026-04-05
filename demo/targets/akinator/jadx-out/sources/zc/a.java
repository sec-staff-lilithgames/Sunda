package zc;

import java.io.Serializable;
import java.util.Map;
import jc.s0;
import jc.u0;
import jc.w;
import jc.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends d implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public final jc.g f97752v;

    /* renamed from: w, reason: collision with root package name */
    public final rc.l f97753w;

    /* renamed from: x, reason: collision with root package name */
    public w f97754x;

    /* renamed from: y, reason: collision with root package name */
    public bd.u f97755y;

    public a(d dVar, jc.g gVar, rc.l lVar, w wVar) {
        super(dVar);
        this.f97753w = lVar;
        this.f97752v = gVar;
        this.f97754x = wVar;
        if (wVar instanceof bd.u) {
            this.f97755y = (bd.u) wVar;
        }
    }

    @Override // zc.d
    public void fixAccess(s0 s0Var) {
        this.f97753w.fixAccess(s0Var.isEnabled(y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void getAndFilter(Object obj, ub.o oVar, u0 u0Var, o oVar2) throws Exception {
        rc.l lVar = this.f97753w;
        Object value = lVar.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            u0Var.reportBadDefinition(this.f97752v.getType(), a.b.m("Value returned by 'any-getter' (", lVar.getName(), "()) not java.util.Map but ", value.getClass().getName()));
        }
        bd.u uVar = this.f97755y;
        if (uVar != null) {
            uVar.serializeFilteredAnyProperties(u0Var, oVar, obj, (Map) value, oVar2, null);
        } else {
            this.f97754x.serialize(value, oVar, u0Var);
        }
    }

    public void getAndSerialize(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        rc.l lVar = this.f97753w;
        Object value = lVar.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof Map)) {
            u0Var.reportBadDefinition(this.f97752v.getType(), a.b.m("Value returned by 'any-getter' ", lVar.getName(), "() not java.util.Map but ", value.getClass().getName()));
        }
        bd.u uVar = this.f97755y;
        if (uVar != null) {
            uVar.serializeWithoutTypeInfo((Map) value, oVar, u0Var);
        } else {
            this.f97754x.serialize(value, oVar, u0Var);
        }
    }

    public void resolve(u0 u0Var) throws jc.r {
        w wVar = this.f97754x;
        if (wVar instanceof j) {
            w wVarHandlePrimaryContextualization = u0Var.handlePrimaryContextualization(wVar, this.f97752v);
            this.f97754x = wVarHandlePrimaryContextualization;
            if (wVarHandlePrimaryContextualization instanceof bd.u) {
                this.f97755y = (bd.u) wVarHandlePrimaryContextualization;
            }
        }
    }

    @Override // zc.d, zc.p
    public void serializeAsField(Object obj, ub.o oVar, u0 u0Var) throws Exception {
        getAndSerialize(obj, oVar, u0Var);
    }

    @Deprecated
    public a(jc.g gVar, rc.l lVar, w wVar) {
        this(null, gVar, lVar, wVar);
    }
}
