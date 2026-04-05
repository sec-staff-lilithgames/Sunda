package com.applovin.impl;

import com.applovin.impl.c2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w2 extends d2 {
    public w2(com.applovin.impl.sdk.k kVar) {
        super(kVar, c2.b.MEDIATED_AD);
    }

    public void a(c2 c2Var, v2 v2Var) {
        a(c2Var, v2Var, new HashMap());
    }

    public void a(c2 c2Var, v2 v2Var, Map map) {
        a(c2Var, v2Var.getFormat(), v2Var.getAdUnitId(), v2Var, null, map);
    }

    public void a(c2 c2Var, v2 v2Var, MaxError maxError) {
        a(c2Var, v2Var.getFormat(), v2Var.getAdUnitId(), v2Var, maxError, new HashMap());
    }

    public void a(c2 c2Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(c2Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    private void a(c2 c2Var, MaxAdFormat maxAdFormat, String str, v2 v2Var, MaxError maxError, Map map) {
        if (v2Var != null) {
            map.putAll(e2.a(v2Var));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(e2.a(maxError));
        }
        d(c2Var, map);
    }
}
