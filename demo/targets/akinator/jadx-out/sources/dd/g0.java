package dd;

import com.ironsource.C3191e4;
import java.io.IOException;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g0 implements jc.v {

    /* renamed from: b, reason: collision with root package name */
    public final Object f52011b;

    public g0(String str) {
        this.f52011b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        Object obj2 = ((g0) obj).f52011b;
        Object obj3 = this.f52011b;
        if (obj3 == obj2) {
            return true;
        }
        return obj3 != null && obj3.equals(obj2);
    }

    public int hashCode() {
        Object obj = this.f52011b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public Object rawValue() {
        return this.f52011b;
    }

    @Override // jc.v
    public void serialize(ub.o oVar, u0 u0Var) throws IOException {
        Object obj = this.f52011b;
        if (obj instanceof jc.v) {
            ((jc.v) obj).serialize(oVar, u0Var);
        } else if (obj instanceof ub.c0) {
            oVar.writeRawValue((ub.c0) obj);
        } else {
            oVar.writeRawValue(String.valueOf(obj));
        }
    }

    @Override // jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        Object obj = this.f52011b;
        if (obj instanceof jc.v) {
            ((jc.v) obj).serializeWithType(oVar, u0Var, jVar);
        } else if (obj instanceof ub.c0) {
            serialize(oVar, u0Var);
        }
    }

    public String toString() {
        return a.b.l("[RawValue of type ", i.classNameOf(this.f52011b), C3191e4.i.f36531e);
    }

    public g0(ub.c0 c0Var) {
        this.f52011b = c0Var;
    }

    public g0(jc.v vVar) {
        this.f52011b = vVar;
    }

    public void serialize(ub.o oVar) throws IOException {
        Object obj = this.f52011b;
        if (obj instanceof jc.v) {
            oVar.writeObject(obj);
        } else if (obj instanceof ub.c0) {
            oVar.writeRawValue((ub.c0) obj);
        } else {
            oVar.writeRawValue(String.valueOf(obj));
        }
    }
}
