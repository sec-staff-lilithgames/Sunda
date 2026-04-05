package mc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a0 extends jc.r {

    /* renamed from: f, reason: collision with root package name */
    public final i0 f74149f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f74150g;

    public a0(ub.u uVar, String str, ub.p pVar, i0 i0Var) {
        super(uVar, str, pVar);
        this.f74149f = i0Var;
    }

    public void addUnresolvedId(Object obj, Class<?> cls, ub.p pVar) {
        this.f74150g.add(new b0(obj, cls, pVar));
    }

    @Override // jc.r, ub.x, java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        ArrayList arrayList = this.f74150g;
        if (arrayList == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(message);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append(((b0) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append('.');
        return sb2.toString();
    }

    public i0 getRoid() {
        return this.f74149f;
    }

    public Object getUnresolvedId() {
        return this.f74149f.getKey().f86715e;
    }

    public List<b0> getUnresolvedIds() {
        return this.f74150g;
    }

    public a0 withStackTrace() {
        super.fillInStackTrace();
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized a0 fillInStackTrace() {
        return this;
    }

    public a0(ub.u uVar, String str) {
        super(uVar, str);
        this.f74150g = new ArrayList();
    }
}
