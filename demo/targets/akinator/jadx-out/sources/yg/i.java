package yg;

import android.graphics.Matrix;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f94427a;

    public i(j jVar) {
        this.f94427a = jVar;
    }

    @Override // yg.s
    public void onCornerPathCreated(v vVar, Matrix matrix, int i10) {
        j jVar = this.f94427a;
        jVar.f94432g.set(i10, vVar.f94525i);
        w[] wVarArr = jVar.f94430e;
        vVar.a(vVar.f94522f);
        wVarArr[i10] = new u(new ArrayList(vVar.f94524h), new Matrix(matrix));
    }

    @Override // yg.s
    public void onEdgePathCreated(v vVar, Matrix matrix, int i10) {
        j jVar = this.f94427a;
        jVar.f94432g.set(i10 + 4, vVar.f94525i);
        w[] wVarArr = jVar.f94431f;
        vVar.a(vVar.f94522f);
        wVarArr[i10] = new u(new ArrayList(vVar.f94524h), new Matrix(matrix));
    }
}
