package sg;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class j implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        return new float[]{vf.a.lerp(fArr[0], fArr2[0], f10), vf.a.lerp(fArr[1], fArr2[1], f10), vf.a.lerp(fArr[2], fArr2[2], f10), vf.a.lerp(fArr[3], fArr2[3], f10), vf.a.lerp(fArr[4], fArr2[4], f10), vf.a.lerp(fArr[5], fArr2[5], f10), vf.a.lerp(fArr[6], fArr2[6], f10), vf.a.lerp(fArr[7], fArr2[7], f10)};
    }
}
