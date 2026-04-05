package f6;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public o3.e[] f55384a;

    @Override // android.animation.TypeEvaluator
    public o3.e[] evaluate(float f10, o3.e[] eVarArr, o3.e[] eVarArr2) {
        if (!o3.f.canMorph(eVarArr, eVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!o3.f.canMorph(this.f55384a, eVarArr)) {
            this.f55384a = o3.f.deepCopyNodes(eVarArr);
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            this.f55384a[i10].interpolatePathDataNode(eVarArr[i10], eVarArr2[i10], f10);
        }
        return this.f55384a;
    }
}
