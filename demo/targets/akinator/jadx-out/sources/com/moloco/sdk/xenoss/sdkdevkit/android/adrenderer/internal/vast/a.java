package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f48842b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f48843c;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g c12, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g c22) {
        e0.checkNotNullParameter(c12, "c1");
        e0.checkNotNullParameter(c22, "c2");
        v vVarD = h.d(c12, c22, this.f48842b, this.f48843c);
        return e0.compare(((Number) vVarD.component2()).intValue(), ((Number) vVarD.component1()).intValue());
    }

    public a(Integer num, Integer num2) {
        this.f48842b = num;
        this.f48843c = num2;
    }

    public /* synthetic */ a(Integer num, Integer num2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
