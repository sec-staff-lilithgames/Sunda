package bv;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class n extends d implements y {
    private final int arity;

    public n(int i10, zu.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.y
    public int getArity() {
        return this.arity;
    }

    @Override // bv.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strRenderLambdaToString = c1.renderLambdaToString(this);
        e0.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }

    public n(int i10) {
        this(i10, null);
    }
}
