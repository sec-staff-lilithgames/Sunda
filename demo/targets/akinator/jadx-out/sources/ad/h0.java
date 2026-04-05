package ad;

import java.io.IOException;
import jc.u0;
import tb.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f4265a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4266b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4267c = false;

    public h0(f1 f1Var) {
        this.f4265a = f1Var;
    }

    public Object generateId(Object obj) {
        if (this.f4266b == null) {
            this.f4266b = this.f4265a.generateId(obj);
        }
        return this.f4266b;
    }

    public void writeAsField(ub.o oVar, u0 u0Var, l lVar) throws IOException {
        this.f4267c = true;
        if (oVar.canWriteObjectId()) {
            Object obj = this.f4266b;
            oVar.writeObjectId(obj == null ? null : String.valueOf(obj));
            return;
        }
        ub.c0 c0Var = lVar.f4279b;
        if (c0Var != null) {
            oVar.writeFieldName(c0Var);
            lVar.f4281d.serialize(this.f4266b, oVar, u0Var);
        }
    }

    public boolean writeAsId(ub.o oVar, u0 u0Var, l lVar) throws IOException {
        if (this.f4266b == null) {
            return false;
        }
        if (!this.f4267c && !lVar.f4282e) {
            return false;
        }
        if (oVar.canWriteObjectId()) {
            oVar.writeObjectRef(String.valueOf(this.f4266b));
            return true;
        }
        lVar.f4281d.serialize(this.f4266b, oVar, u0Var);
        return true;
    }
}
