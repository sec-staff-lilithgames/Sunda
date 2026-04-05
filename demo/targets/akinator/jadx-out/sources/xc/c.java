package xc;

import dd.k0;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jc.n0;
import jc.y;
import rc.d0;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c extends h {

    /* renamed from: p, reason: collision with root package name */
    public static final BitSet f91897p = new BitSet(0);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f91898n;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f91899o;

    public c(jc.o oVar, wc.h hVar, jc.o oVar2, jc.j jVar, Collection<wc.c> collection) {
        super(oVar, hVar, null, false, oVar2, null, true);
        HashMap map = new HashMap();
        this.f91898n = map;
        boolean zIsEnabled = jVar.isEnabled(y.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map2 = new HashMap();
        int i10 = 0;
        for (wc.c cVar : collection) {
            List<d0> listFindProperties = jVar.introspect(jVar.getTypeFactory().constructType(cVar.getType())).findProperties();
            BitSet bitSet = new BitSet(listFindProperties.size() + i10);
            for (d0 d0Var : listFindProperties) {
                String name = d0Var.getName();
                name = zIsEnabled ? name.toLowerCase() : name;
                Integer num = (Integer) map.get(name);
                if (num == null) {
                    int i11 = i10 + 1;
                    Integer numValueOf = Integer.valueOf(i10);
                    map.put(name, numValueOf);
                    num = numValueOf;
                    i10 = i11;
                }
                Iterator<n0> it = d0Var.findAliases().iterator();
                while (it.hasNext()) {
                    String simpleName = it.next().getSimpleName();
                    simpleName = zIsEnabled ? simpleName.toLowerCase() : simpleName;
                    if (!map.containsKey(simpleName)) {
                        map.put(simpleName, num);
                    }
                }
                bitSet.set(num.intValue());
            }
            String str = (String) map2.put(bitSet, cVar.getType().getName());
            if (str != null) {
                throw new IllegalStateException(e3.g.l("Subtypes ", str, " and ", cVar.getType().getName(), " have the same signature and cannot be uniquely deduced."));
            }
        }
        this.f91899o = map2;
    }

    @Override // xc.h, xc.a, wc.g
    public Object deserializeTypedFromObject(ub.u uVar, jc.k kVar) throws IOException {
        String str;
        z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == z.START_OBJECT) {
            zVarCurrentToken = uVar.nextToken();
        } else if (zVarCurrentToken != z.FIELD_NAME) {
            return f(uVar, kVar, null, "Unexpected input");
        }
        z zVar = z.END_OBJECT;
        HashMap map = this.f91899o;
        if (zVarCurrentToken == zVar && (str = (String) map.get(f91897p)) != null) {
            return e(uVar, kVar, null, str);
        }
        LinkedList linkedList = new LinkedList(map.keySet());
        k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
        boolean zIsEnabled = kVar.isEnabled(y.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (zVarCurrentToken == z.FIELD_NAME) {
            String strCurrentName = uVar.currentName();
            if (zIsEnabled) {
                strCurrentName = strCurrentName.toLowerCase();
            }
            k0VarBufferForInputBuffering.copyCurrentStructure(uVar);
            Integer num = (Integer) this.f91898n.get(strCurrentName);
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(iIntValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return e(uVar, kVar, k0VarBufferForInputBuffering, (String) map.get(linkedList.get(0)));
                }
            }
            zVarCurrentToken = uVar.nextToken();
        }
        return f(uVar, kVar, k0VarBufferForInputBuffering, String.format("Cannot deduce unique subtype of %s (%d candidates match)", dd.i.getTypeDescription(this.f91926c), Integer.valueOf(linkedList.size())));
    }

    @Override // xc.h, xc.a, xc.s, wc.g
    public wc.g forProperty(jc.g gVar) {
        return gVar == this.f91927e ? this : new c(this, gVar);
    }

    public c(c cVar, jc.g gVar) {
        super(cVar, gVar);
        this.f91898n = cVar.f91898n;
        this.f91899o = cVar.f91899o;
    }
}
