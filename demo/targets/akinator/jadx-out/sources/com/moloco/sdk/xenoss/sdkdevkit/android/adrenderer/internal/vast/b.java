package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import java.util.Comparator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final double f48844b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f48845c;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f48846e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f48847f;

    public b(double d10, Long l9, Integer num, Integer num2) {
        this.f48844b = d10;
        this.f48845c = l9;
        this.f48846e = num;
        this.f48847f = num2;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(s mf1, s mf2) {
        e0.checkNotNullParameter(mf1, "mf1");
        e0.checkNotNullParameter(mf2, "mf2");
        v vVarB = h.b(mf1, mf2, this.f48844b, this.f48845c, this.f48846e, this.f48847f);
        return e0.compare(((Number) vVarB.component2()).intValue(), ((Number) vVarB.component1()).intValue());
    }

    public /* synthetic */ b(double d10, Long l9, Integer num, Integer num2, int i10, u uVar) {
        this(d10, (i10 & 2) != 0 ? null : l9, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2);
    }
}
