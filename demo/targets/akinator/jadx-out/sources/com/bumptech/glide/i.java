package com.bumptech.glide;

import androidx.recyclerview.widget.l1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16573a;

    public i(l1 l1Var) {
        this.f16573a = Collections.unmodifiableMap(new HashMap((HashMap) l1Var.f7184a));
    }

    public boolean isEnabled(Class<Object> cls) {
        return this.f16573a.containsKey(cls);
    }
}
