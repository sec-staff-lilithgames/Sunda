package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class f0 implements y, Serializable {
    private final int arity;

    public f0(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.y
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strRenderLambdaToString = c1.renderLambdaToString(this);
        e0.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
