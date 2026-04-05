package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class fu extends fr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private em f2282;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private fk f2283;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private fk f2284;

    public fu(fk fkVar, fk fkVar2, em emVar) {
        this.f2284 = fkVar;
        this.f2283 = fkVar2;
        this.f2282 = emVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fu.class == obj.getClass()) {
            fu fuVar = (fu) obj;
            fk fkVar = this.f2284;
            if (fkVar == null ? fuVar.f2284 != null : !fkVar.equals(fuVar.f2284)) {
                return false;
            }
            fk fkVar2 = this.f2283;
            if (fkVar2 == null ? fuVar.f2283 != null : !fkVar2.equals(fuVar.f2283)) {
                return false;
            }
            em emVar = this.f2282;
            em emVar2 = fuVar.f2282;
            if (emVar != null) {
                return emVar.equals(emVar2);
            }
            if (emVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fk fkVar = this.f2284;
        int iHashCode = (fkVar != null ? fkVar.hashCode() : 0) * 31;
        fk fkVar2 = this.f2283;
        int iHashCode2 = (iHashCode + (fkVar2 != null ? fkVar2.hashCode() : 0)) * 31;
        em emVar = this.f2282;
        return iHashCode2 + (emVar != null ? emVar.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* renamed from: ﻐ */
    public final du mo2509(ds dsVar, cp cpVar) {
        try {
            fk fkVar = this.f2284;
            if (fkVar != null) {
                return fkVar.mo2509(new ds(dsVar), cpVar);
            }
        } catch (Throwable th2) {
            if (this.f2283 != null) {
                HashMap map = new HashMap();
                em emVar = this.f2282;
                if (emVar != null) {
                    map.put(dy.m2458(emVar.m2492()), th2);
                }
                return this.f2283.mo2509(new ds(map, dsVar), cpVar);
            }
        }
        return new du(null);
    }
}
