package nc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f75863a;

    /* renamed from: b, reason: collision with root package name */
    public final mc.c0 f75864b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f75865c;

    /* renamed from: d, reason: collision with root package name */
    public final mc.z[] f75866d;

    public a0(jc.k kVar, mc.c0 c0Var, mc.z[] zVarArr, boolean z10, boolean z11) {
        this.f75864b = c0Var;
        if (z10) {
            this.f75865c = z.construct(kVar.getConfig().getLocale());
        } else {
            this.f75865c = new HashMap();
        }
        int length = zVarArr.length;
        this.f75863a = length;
        this.f75866d = new mc.z[length];
        if (z11) {
            jc.j config = kVar.getConfig();
            for (mc.z zVar : zVarArr) {
                if (!zVar.isIgnorable()) {
                    List<jc.n0> listFindAliases = zVar.findAliases(config);
                    if (!listFindAliases.isEmpty()) {
                        Iterator<jc.n0> it = listFindAliases.iterator();
                        while (it.hasNext()) {
                            this.f75865c.put(it.next().getSimpleName(), zVar);
                        }
                    }
                }
            }
        }
        for (int i10 = 0; i10 < length; i10++) {
            mc.z zVar2 = zVarArr[i10];
            this.f75866d[i10] = zVar2;
            if (!zVar2.isIgnorable()) {
                this.f75865c.put(zVar2.getName(), zVar2);
            }
        }
    }

    public static a0 construct(jc.k kVar, mc.c0 c0Var, mc.z[] zVarArr, c cVar) throws jc.r {
        int length = zVarArr.length;
        mc.z[] zVarArr2 = new mc.z[length];
        for (int i10 = 0; i10 < length; i10++) {
            mc.z zVarWithValueDeserializer = zVarArr[i10];
            if (!zVarWithValueDeserializer.hasValueDeserializer() && !zVarWithValueDeserializer.isInjectionOnly()) {
                zVarWithValueDeserializer = zVarWithValueDeserializer.withValueDeserializer(kVar.findContextualValueDeserializer(zVarWithValueDeserializer.getType(), zVarWithValueDeserializer));
            }
            zVarArr2[i10] = zVarWithValueDeserializer;
        }
        return new a0(kVar, c0Var, zVarArr2, cVar.isCaseInsensitive(), true);
    }

    public Object build(jc.k kVar, h0 h0Var) throws IOException {
        Object objCreateFromObjectWith = this.f75864b.createFromObjectWith(kVar, this.f75866d, h0Var);
        if (objCreateFromObjectWith == null) {
            return objCreateFromObjectWith;
        }
        Object objHandleIdValue = h0Var.handleIdValue(kVar, objCreateFromObjectWith);
        for (g0 g0Var = h0Var.f75912h; g0Var != null; g0Var = g0Var.f75900a) {
            g0Var.assign(objHandleIdValue);
        }
        return objHandleIdValue;
    }

    public mc.z findCreatorProperty(String str) {
        return (mc.z) this.f75865c.get(str);
    }

    public Collection<mc.z> properties() {
        return this.f75865c.values();
    }

    public a0 renameAll(dd.a0 a0Var) {
        if (a0Var == null || a0Var == dd.a0.f51985b) {
            return this;
        }
        mc.z[] zVarArr = this.f75866d;
        int length = zVarArr.length;
        HashMap map = new HashMap(this.f75865c);
        ArrayList arrayList = new ArrayList(length);
        for (mc.z zVar : zVarArr) {
            if (zVar == null) {
                arrayList.add(null);
            } else {
                mc.z zVarUnwrapped = zVar.unwrapped(a0Var);
                String name = zVar.getName();
                String name2 = zVarUnwrapped.getName();
                arrayList.add(zVarUnwrapped);
                if (!name.equals(name2) && map.containsKey(name)) {
                    map.remove(name);
                    map.put(name2, zVarUnwrapped);
                }
            }
        }
        return new a0(this, map, (mc.z[]) arrayList.toArray(new mc.z[0]));
    }

    public h0 startBuilding(ub.u uVar, jc.k kVar, w wVar) {
        return new h0(uVar, kVar, this.f75863a, wVar, null);
    }

    public h0 startBuildingWithAnySetter(ub.u uVar, jc.k kVar, w wVar, mc.x xVar) {
        return new h0(uVar, kVar, this.f75863a, wVar, xVar);
    }

    public mc.z findCreatorProperty(int i10) {
        for (mc.z zVar : this.f75865c.values()) {
            if (zVar.getPropertyIndex() == i10) {
                return zVar;
            }
        }
        return null;
    }

    public static a0 construct(jc.k kVar, mc.c0 c0Var, mc.z[] zVarArr, boolean z10) throws jc.r {
        int length = zVarArr.length;
        mc.z[] zVarArr2 = new mc.z[length];
        for (int i10 = 0; i10 < length; i10++) {
            mc.z zVarWithValueDeserializer = zVarArr[i10];
            if (!zVarWithValueDeserializer.hasValueDeserializer()) {
                zVarWithValueDeserializer = zVarWithValueDeserializer.withValueDeserializer(kVar.findContextualValueDeserializer(zVarWithValueDeserializer.getType(), zVarWithValueDeserializer));
            }
            zVarArr2[i10] = zVarWithValueDeserializer;
        }
        return new a0(kVar, c0Var, zVarArr2, z10, false);
    }

    @Deprecated
    public static a0 construct(jc.k kVar, mc.c0 c0Var, mc.z[] zVarArr) throws jc.r {
        return construct(kVar, c0Var, zVarArr, kVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    public a0(a0 a0Var, HashMap map, mc.z[] zVarArr) {
        this.f75863a = a0Var.f75863a;
        this.f75864b = a0Var.f75864b;
        this.f75865c = map;
        this.f75866d = zVarArr;
    }
}
