package oq;

import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d {
    public static final a a(br.e params) {
        e0.checkNotNullParameter(params, "params");
        ir.m mVar = new ir.m("AdPhaseAnimator");
        Map<br.i, br.l> animationParams = params.getAnimationParams();
        return new a(mVar, new i(animationParams), new b0(params));
    }

    public static final a a(br.a params, boolean z10) {
        e0.checkNotNullParameter(params, "params");
        return new a(new ir.m("AdElementAnimator (" + params.getName() + ')'), new i(params.getAnimationParams()), new z(params, z10));
    }
}
