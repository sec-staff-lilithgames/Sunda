package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class el extends eg {
    public el(ee eeVar, ee eeVar2, Cdo cdo) {
        super(eeVar, eeVar2, cdo);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ee
    /* renamed from: ﻛ */
    public final du mo2440(ds dsVar, cp cpVar) {
        Object objM2437 = m2480().m2473(dsVar, cpVar).m2437();
        Object objM24372 = m2478().m2473(dsVar, cpVar).m2437();
        try {
            return new du(Boolean.valueOf(mo2489(new BigDecimal(objM2437.toString()).compareTo(new BigDecimal(objM24372.toString())))));
        } catch (Exception unused) {
            return ((objM2437 instanceof String) && (objM24372 instanceof String)) ? new du(Boolean.valueOf(mo2490((String) objM2437, (String) objM24372))) : new du(Boolean.valueOf(mo2488(objM2437, objM24372)));
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo2488(Object obj, Object obj2);

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo2489(int i10);

    /* renamed from: ｋ, reason: contains not printable characters */
    public abstract boolean mo2490(String str, String str2);
}
