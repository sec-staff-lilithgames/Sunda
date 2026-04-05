package pf;

import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f81194a;

    /* renamed from: b, reason: collision with root package name */
    public final c3[] f81195b;

    /* renamed from: c, reason: collision with root package name */
    public final k[] f81196c;

    /* renamed from: d, reason: collision with root package name */
    public final n3 f81197d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f81198e;

    @Deprecated
    public x(c3[] c3VarArr, k[] kVarArr, Object obj) {
        this(c3VarArr, kVarArr, n3.f27831c, obj);
    }

    public boolean isEquivalent(x xVar) {
        if (xVar != null) {
            int length = xVar.f81196c.length;
            k[] kVarArr = this.f81196c;
            if (length == kVarArr.length) {
                for (int i10 = 0; i10 < kVarArr.length; i10++) {
                    if (!isEquivalent(xVar, i10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean isRendererEnabled(int i10) {
        return this.f81195b[i10] != null;
    }

    public x(c3[] c3VarArr, k[] kVarArr, n3 n3Var, Object obj) {
        this.f81195b = c3VarArr;
        this.f81196c = (k[]) kVarArr.clone();
        this.f81197d = n3Var;
        this.f81198e = obj;
        this.f81194a = c3VarArr.length;
    }

    public boolean isEquivalent(x xVar, int i10) {
        return xVar != null && n1.areEqual(this.f81195b[i10], xVar.f81195b[i10]) && n1.areEqual(this.f81196c[i10], xVar.f81196c[i10]);
    }
}
