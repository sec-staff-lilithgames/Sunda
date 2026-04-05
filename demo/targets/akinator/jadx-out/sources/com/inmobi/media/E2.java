package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class E2 {
    public static final Object a(kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        try {
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(block.invoke());
        } catch (Error e10) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(e10));
        } catch (Exception e11) {
            int i12 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(e11));
        }
    }
}
