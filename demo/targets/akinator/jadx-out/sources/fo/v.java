package fo;

import gn.b2;
import io.bidmachine.media3.exoplayer.v1;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f55925a;

    /* renamed from: b, reason: collision with root package name */
    public final v1[] f55926b;

    /* renamed from: c, reason: collision with root package name */
    public final l[] f55927c;

    /* renamed from: d, reason: collision with root package name */
    public final b2 f55928d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f55929e;

    @Deprecated
    public v(v1[] v1VarArr, l[] lVarArr, Object obj) {
        this(v1VarArr, lVarArr, b2.f57818b, obj);
    }

    public boolean isEquivalent(v vVar) {
        if (vVar != null) {
            int length = vVar.f55927c.length;
            l[] lVarArr = this.f55927c;
            if (length == lVarArr.length) {
                for (int i10 = 0; i10 < lVarArr.length; i10++) {
                    if (!isEquivalent(vVar, i10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean isRendererEnabled(int i10) {
        return this.f55926b[i10] != null;
    }

    public v(v1[] v1VarArr, l[] lVarArr, b2 b2Var, Object obj) {
        io.bidmachine.media3.common.util.a.checkArgument(v1VarArr.length == lVarArr.length);
        this.f55926b = v1VarArr;
        this.f55927c = (l[]) lVarArr.clone();
        this.f55928d = b2Var;
        this.f55929e = obj;
        this.f55925a = v1VarArr.length;
    }

    public boolean isEquivalent(v vVar, int i10) {
        return vVar != null && Objects.equals(this.f55926b[i10], vVar.f55926b[i10]) && Objects.equals(this.f55927c[i10], vVar.f55927c[i10]);
    }
}
