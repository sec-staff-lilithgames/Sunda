package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y3 {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m63invertToJiSxe2E(float[] invertTo, float[] other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(invertTo, "$this$invertTo");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        float f10 = invertTo[0];
        float f11 = invertTo[1];
        float f12 = invertTo[2];
        float f13 = invertTo[3];
        float f14 = invertTo[4];
        float f15 = invertTo[5];
        float f16 = invertTo[6];
        float f17 = invertTo[7];
        float f18 = invertTo[8];
        float f19 = invertTo[9];
        float f20 = invertTo[10];
        float f21 = invertTo[11];
        float f22 = invertTo[12];
        float f23 = invertTo[13];
        float f24 = invertTo[14];
        float f25 = invertTo[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f31 * f32) + (((f29 * f34) + ((f28 * f35) + ((f26 * f37) - (f27 * f36)))) - (f30 * f33));
        if (f38 == 0.0f) {
            return false;
        }
        float f39 = 1.0f / f38;
        other[0] = b0.e2.a(f17, f35, (f15 * f37) - (f16 * f36), f39);
        other[1] = e3.g.c(f13, f35, (f12 * f36) + ((-f11) * f37), f39);
        other[2] = b0.e2.a(f25, f29, (f23 * f31) - (f24 * f30), f39);
        other[3] = e3.g.c(f21, f29, (f20 * f30) + ((-f19) * f31), f39);
        float f40 = -f14;
        other[4] = e3.g.c(f17, f33, (f16 * f34) + (f40 * f37), f39);
        other[5] = b0.e2.a(f13, f33, (f37 * f10) - (f12 * f34), f39);
        float f41 = -f22;
        other[6] = e3.g.c(f25, f27, (f24 * f28) + (f41 * f31), f39);
        other[7] = b0.e2.a(f21, f27, (f18 * f31) - (f20 * f28), f39);
        other[8] = b0.e2.a(f17, f32, (f14 * f36) - (f15 * f34), f39);
        other[9] = e3.g.c(f13, f32, (f34 * f11) + ((-f10) * f36), f39);
        other[10] = b0.e2.a(f25, f26, (f22 * f30) - (f23 * f28), f39);
        other[11] = e3.g.c(f21, f26, (f28 * f19) + ((-f18) * f30), f39);
        other[12] = e3.g.c(f16, f32, (f15 * f33) + (f40 * f35), f39);
        other[13] = b0.e2.a(f12, f32, (f10 * f35) - (f11 * f33), f39);
        other[14] = e3.g.c(f24, f26, (f23 * f27) + (f41 * f29), f39);
        other[15] = b0.e2.a(f20, f26, (f18 * f29) - (f19 * f27), f39);
        return true;
    }
}
