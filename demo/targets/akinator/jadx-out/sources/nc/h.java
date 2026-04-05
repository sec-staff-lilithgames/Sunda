package nc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final jc.o f75902a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f75903b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f75904c = new HashMap();

    public h(jc.o oVar) {
        this.f75902a = oVar;
    }

    public final void a(Integer num, String str) {
        HashMap map = this.f75904c;
        Object obj = map.get(str);
        if (obj == null) {
            map.put(str, num);
            return;
        }
        if (obj instanceof List) {
            ((List) obj).add(num);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(obj);
        linkedList.add(num);
        map.put(str, linkedList);
    }

    public void addExternal(mc.z zVar, wc.g gVar) {
        ArrayList arrayList = this.f75903b;
        Integer numValueOf = Integer.valueOf(arrayList.size());
        arrayList.add(new i(zVar, gVar));
        a(numValueOf, zVar.getName());
        a(numValueOf, gVar.getPropertyName());
    }

    public j build(c cVar) {
        ArrayList arrayList = this.f75903b;
        int size = arrayList.size();
        i[] iVarArr = new i[size];
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) arrayList.get(i10);
            mc.z zVarFind = cVar.find(iVar.getTypePropertyName());
            if (zVarFind != null) {
                iVar.linkTypeProperty(zVarFind);
            }
            iVarArr[i10] = iVar;
        }
        return new j(this.f75902a, iVarArr, this.f75904c);
    }
}
