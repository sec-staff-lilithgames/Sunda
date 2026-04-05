package nc;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75867b;

    /* renamed from: c, reason: collision with root package name */
    public int f75868c;

    /* renamed from: e, reason: collision with root package name */
    public int f75869e;

    /* renamed from: f, reason: collision with root package name */
    public int f75870f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f75871g;

    /* renamed from: h, reason: collision with root package name */
    public final mc.z[] f75872h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f75873i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f75874j;

    /* renamed from: k, reason: collision with root package name */
    public final Locale f75875k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap] */
    public c(boolean z10, Collection<mc.z> collection, Map<String, List<jc.n0>> map, Locale locale) {
        ?? map2;
        this.f75867b = z10;
        this.f75872h = (mc.z[]) collection.toArray(new mc.z[collection.size()]);
        this.f75873i = map;
        this.f75875k = locale;
        if (map == null || map.isEmpty()) {
            map2 = Collections.EMPTY_MAP;
        } else {
            map2 = new HashMap();
            for (Map.Entry<String, List<jc.n0>> entry : map.entrySet()) {
                String key = entry.getKey();
                key = z10 ? key.toLowerCase(locale) : key;
                Iterator<jc.n0> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    String simpleName = it.next().getSimpleName();
                    if (z10) {
                        simpleName = simpleName.toLowerCase(locale);
                    }
                    map2.put(simpleName, key);
                }
            }
        }
        this.f75874j = map2;
        d(collection);
    }

    public static c construct(lc.z zVar, Collection<mc.z> collection, Map<String, List<jc.n0>> map, boolean z10) {
        return new c(z10, collection, map, zVar.getLocale());
    }

    public final int a(mc.z zVar) {
        mc.z[] zVarArr = this.f75872h;
        int length = zVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zVarArr[i10] == zVar) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + zVar.getName() + "' missing from _propsInOrder");
    }

    public c assignIndexes() {
        int length = this.f75871g.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            mc.z zVar = (mc.z) this.f75871g[i11];
            if (zVar != null) {
                zVar.assignIndex(i10);
                i10++;
            }
        }
        return this;
    }

    public final mc.z b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode() & this.f75868c;
        int i10 = iHashCode << 1;
        Object obj = this.f75871g[i10];
        if (str.equals(obj)) {
            return (mc.z) this.f75871g[i10 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i11 = this.f75868c + 1;
        int i12 = ((iHashCode >> 1) + i11) << 1;
        Object obj2 = this.f75871g[i12];
        if (str.equals(obj2)) {
            return (mc.z) this.f75871g[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.f75870f + i13;
            while (i13 < i14) {
                Object obj3 = this.f75871g[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return (mc.z) this.f75871g[i13 + 1];
                }
                i13 += 2;
            }
        }
        return null;
    }

    public final String c(mc.z zVar) {
        boolean z10 = this.f75867b;
        String name = zVar.getName();
        return z10 ? name.toLowerCase(this.f75875k) : name;
    }

    public final void d(Collection collection) {
        int i10;
        int size = collection.size();
        this.f75869e = size;
        if (size <= 5) {
            i10 = 8;
        } else if (size <= 12) {
            i10 = 16;
        } else {
            int i11 = 32;
            while (i11 < size + (size >> 2)) {
                i11 += i11;
            }
            i10 = i11;
        }
        this.f75868c = i10 - 1;
        int i12 = (i10 >> 1) + i10;
        Object[] objArrCopyOf = new Object[i12 * 2];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            mc.z zVar = (mc.z) it.next();
            if (zVar != null) {
                String strC = c(zVar);
                int iHashCode = strC.hashCode() & this.f75868c;
                int i14 = iHashCode << 1;
                if (objArrCopyOf[i14] != null) {
                    i14 = ((iHashCode >> 1) + i10) << 1;
                    if (objArrCopyOf[i14] != null) {
                        i14 = (i12 << 1) + i13;
                        i13 += 2;
                        if (i14 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i14] = strC;
                objArrCopyOf[i14 + 1] = zVar;
            }
        }
        this.f75871g = objArrCopyOf;
        this.f75870f = i13;
    }

    public mc.z find(int i10) {
        int length = this.f75871g.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            mc.z zVar = (mc.z) this.f75871g[i11];
            if (zVar != null && i10 == zVar.getPropertyIndex()) {
                return zVar;
            }
        }
        return null;
    }

    public boolean findDeserializeAndSet(ub.u uVar, jc.k kVar, Object obj, String str) throws IOException {
        mc.z zVarFind = find(str);
        if (zVarFind == null) {
            return false;
        }
        try {
            zVarFind.deserializeAndSet(uVar, kVar, obj);
            return true;
        } catch (Exception e10) {
            e = e10;
            while ((e instanceof InvocationTargetException) && e.getCause() != null) {
                e = e.getCause();
            }
            dd.i.throwIfError(e);
            boolean z10 = kVar == null || kVar.isEnabled(jc.l.WRAP_EXCEPTIONS);
            if (e instanceof IOException) {
                if (!z10 || !(e instanceof ub.h)) {
                    throw ((IOException) e);
                }
            } else if (!z10) {
                dd.i.throwIfRTE(e);
            }
            throw jc.r.wrapWithPath(e, obj, str);
        }
    }

    public mc.z[] getPropertiesInInsertionOrder() {
        return this.f75872h;
    }

    public boolean hasAliases() {
        return !this.f75873i.isEmpty();
    }

    public boolean isCaseInsensitive() {
        return this.f75867b;
    }

    @Override // java.lang.Iterable
    public Iterator<mc.z> iterator() {
        ArrayList arrayList = new ArrayList(this.f75869e);
        int length = this.f75871g.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            mc.z zVar = (mc.z) this.f75871g[i10];
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        return arrayList.iterator();
    }

    public void remove(mc.z zVar) {
        ArrayList arrayList = new ArrayList(this.f75869e);
        String strC = c(zVar);
        int length = this.f75871g.length;
        boolean zEquals = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.f75871g;
            mc.z zVar2 = (mc.z) objArr[i10];
            if (zVar2 != null) {
                if (zEquals || !(zEquals = strC.equals(objArr[i10 - 1]))) {
                    arrayList.add(zVar2);
                } else {
                    this.f75872h[a(zVar2)] = null;
                }
            }
        }
        if (zEquals) {
            d(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + zVar.getName() + "' found, can't remove");
    }

    public c renameAll(dd.a0 a0Var) {
        if (a0Var == null || a0Var == dd.a0.f51985b) {
            return this;
        }
        mc.z[] zVarArr = this.f75872h;
        ArrayList arrayList = new ArrayList(zVarArr.length);
        for (mc.z zVar : zVarArr) {
            if (zVar == null) {
                arrayList.add(zVar);
            } else {
                arrayList.add(zVar.unwrapped(a0Var));
            }
        }
        return new c(this.f75867b, arrayList, (Map<String, List<jc.n0>>) this.f75873i, this.f75875k);
    }

    public void replace(mc.z zVar, mc.z zVar2) {
        int length = this.f75871g.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.f75871g;
            if (objArr[i10] == zVar) {
                objArr[i10] = zVar2;
                this.f75872h[a(zVar)] = zVar2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + zVar.getName() + "' found, can't replace");
    }

    public int size() {
        return this.f75869e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Properties=[");
        Iterator<mc.z> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            mc.z next = it.next();
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(next.getName());
            sb2.append('(');
            sb2.append(next.getType());
            sb2.append(')');
            i10 = i11;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        Map map = this.f75873i;
        if (!map.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(map);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public c withCaseInsensitivity(boolean z10) {
        return this.f75867b == z10 ? this : new c(this, z10);
    }

    public c withProperty(mc.z zVar) {
        String strC = c(zVar);
        int length = this.f75871g.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            mc.z zVar2 = (mc.z) this.f75871g[i10];
            if (zVar2 != null && zVar2.getName().equals(strC)) {
                return new c(this, zVar, i10, a(zVar2));
            }
        }
        return new c(this, zVar, strC, strC.hashCode() & this.f75868c);
    }

    public c withoutProperties(Collection<String> collection) {
        return withoutProperties(collection, null);
    }

    public c withoutProperties(Collection<String> collection, Collection<String> collection2) {
        if ((collection == null || collection.isEmpty()) && collection2 == null) {
            return this;
        }
        mc.z[] zVarArr = this.f75872h;
        ArrayList arrayList = new ArrayList(zVarArr.length);
        for (mc.z zVar : zVarArr) {
            if (zVar != null && !dd.r.shouldIgnore(zVar.getName(), collection, collection2)) {
                arrayList.add(zVar);
            }
        }
        return new c(this.f75867b, arrayList, (Map<String, List<jc.n0>>) this.f75873i, this.f75875k);
    }

    @Deprecated
    public static c construct(lc.z zVar, Collection<mc.z> collection, Map<String, List<jc.n0>> map) {
        return new c(zVar.isEnabled(jc.y.ACCEPT_CASE_INSENSITIVE_PROPERTIES), collection, map, zVar.getLocale());
    }

    public mc.z find(String str) {
        if (str != null) {
            if (this.f75867b) {
                str = str.toLowerCase(this.f75875k);
            }
            int iHashCode = str.hashCode() & this.f75868c;
            int i10 = iHashCode << 1;
            Object obj = this.f75871g[i10];
            if (obj != str && !str.equals(obj)) {
                Map map = this.f75874j;
                if (obj == null) {
                    return b((String) map.get(str));
                }
                int i11 = this.f75868c + 1;
                int i12 = ((iHashCode >> 1) + i11) << 1;
                Object obj2 = this.f75871g[i12];
                if (str.equals(obj2)) {
                    return (mc.z) this.f75871g[i12 + 1];
                }
                if (obj2 != null) {
                    int i13 = (i11 + (i11 >> 1)) << 1;
                    int i14 = this.f75870f + i13;
                    while (i13 < i14) {
                        Object obj3 = this.f75871g[i13];
                        if (obj3 == str || str.equals(obj3)) {
                            return (mc.z) this.f75871g[i13 + 1];
                        }
                        i13 += 2;
                    }
                }
                return b((String) map.get(str));
            }
            return (mc.z) this.f75871g[i10 + 1];
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    @Deprecated
    public static c construct(Collection<mc.z> collection, boolean z10, Map<String, List<jc.n0>> map) {
        return new c(z10, collection, map);
    }

    @Deprecated
    public c(boolean z10, Collection<mc.z> collection, Map<String, List<jc.n0>> map) {
        this(z10, collection, map, Locale.getDefault());
    }

    public c(c cVar, mc.z zVar, int i10, int i11) {
        this.f75867b = cVar.f75867b;
        this.f75875k = cVar.f75875k;
        this.f75868c = cVar.f75868c;
        this.f75869e = cVar.f75869e;
        this.f75870f = cVar.f75870f;
        this.f75873i = cVar.f75873i;
        this.f75874j = cVar.f75874j;
        Object[] objArr = cVar.f75871g;
        this.f75871g = Arrays.copyOf(objArr, objArr.length);
        mc.z[] zVarArr = cVar.f75872h;
        mc.z[] zVarArr2 = (mc.z[]) Arrays.copyOf(zVarArr, zVarArr.length);
        this.f75872h = zVarArr2;
        this.f75871g[i10] = zVar;
        zVarArr2[i11] = zVar;
    }

    public c(c cVar, mc.z zVar, String str, int i10) {
        this.f75867b = cVar.f75867b;
        this.f75875k = cVar.f75875k;
        this.f75868c = cVar.f75868c;
        this.f75869e = cVar.f75869e;
        this.f75870f = cVar.f75870f;
        this.f75873i = cVar.f75873i;
        this.f75874j = cVar.f75874j;
        Object[] objArr = cVar.f75871g;
        this.f75871g = Arrays.copyOf(objArr, objArr.length);
        mc.z[] zVarArr = cVar.f75872h;
        int length = zVarArr.length;
        mc.z[] zVarArr2 = (mc.z[]) Arrays.copyOf(zVarArr, length + 1);
        this.f75872h = zVarArr2;
        zVarArr2[length] = zVar;
        int i11 = this.f75868c + 1;
        int i12 = i10 << 1;
        Object[] objArr2 = this.f75871g;
        if (objArr2[i12] != null) {
            i12 = ((i10 >> 1) + i11) << 1;
            if (objArr2[i12] != null) {
                int i13 = this.f75870f;
                i12 = ((i11 + (i11 >> 1)) << 1) + i13;
                this.f75870f = i13 + 2;
                if (i12 >= objArr2.length) {
                    this.f75871g = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f75871g;
        objArr3[i12] = str;
        objArr3[i12 + 1] = zVar;
    }

    public c(c cVar, boolean z10) {
        this.f75867b = z10;
        this.f75875k = cVar.f75875k;
        this.f75873i = cVar.f75873i;
        this.f75874j = cVar.f75874j;
        mc.z[] zVarArr = cVar.f75872h;
        mc.z[] zVarArr2 = (mc.z[]) Arrays.copyOf(zVarArr, zVarArr.length);
        this.f75872h = zVarArr2;
        d(Arrays.asList(zVarArr2));
    }
}
