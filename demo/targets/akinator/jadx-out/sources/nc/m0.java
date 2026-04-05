package nc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f75942a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f75943b;

    public m0() {
        this.f75942a = new ArrayList();
        this.f75943b = new ArrayList();
    }

    public static ArrayList a(ArrayList arrayList, dd.a0 a0Var) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mc.z zVar = (mc.z) it.next();
            if (zVar == null) {
                arrayList2.add(null);
            } else {
                arrayList2.add(zVar.unwrapped(a0Var));
            }
        }
        return arrayList2;
    }

    public static jc.n0 creatorParamName(int i10) {
        return new jc.n0(a.b.e(i10, "@JsonUnwrapped/"));
    }

    public void addCreatorProperty(mc.z zVar) {
        this.f75942a.add(zVar);
    }

    public void addProperty(mc.z zVar) {
        this.f75943b.add(zVar);
    }

    public Object processUnwrapped(ub.u uVar, jc.k kVar, Object obj, dd.k0 k0Var) throws IOException {
        Iterator it = this.f75943b.iterator();
        while (it.hasNext()) {
            mc.z zVar = (mc.z) it.next();
            ub.u uVarAsParser = k0Var.asParser(uVar.streamReadConstraints());
            uVarAsParser.nextToken();
            zVar.deserializeAndSet(uVarAsParser, kVar, obj);
        }
        return obj;
    }

    public h0 processUnwrappedCreatorProperties(ub.u uVar, jc.k kVar, h0 h0Var, dd.k0 k0Var) throws IOException {
        Iterator it = this.f75942a.iterator();
        while (it.hasNext()) {
            mc.z zVar = (mc.z) it.next();
            ub.u uVarAsParser = k0Var.asParser(uVar.streamReadConstraints());
            uVarAsParser.nextToken();
            h0Var.assignParameter(zVar, zVar.deserialize(uVarAsParser, kVar));
        }
        return h0Var;
    }

    public m0 renameAll(dd.a0 a0Var) {
        return new m0(a(this.f75942a, a0Var), a(this.f75943b, a0Var));
    }

    public m0(ArrayList arrayList, ArrayList arrayList2) {
        this.f75942a = arrayList;
        this.f75943b = arrayList2;
    }
}
