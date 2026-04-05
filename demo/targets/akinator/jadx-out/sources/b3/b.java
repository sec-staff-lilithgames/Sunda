package b3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f8723h;

    public b(char[] cArr) {
        super(cArr);
        this.f8723h = new ArrayList();
    }

    public static c allocate(char[] cArr) {
        return new b(cArr);
    }

    public void add(c cVar) {
        this.f8723h.add(cVar);
    }

    public void clear() {
        this.f8723h.clear();
    }

    @Override // b3.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f8723h.equals(((b) obj).f8723h);
        }
        return false;
    }

    public c get(String str) throws i {
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.content().equals(str)) {
                return dVar.getValue();
            }
        }
        throw new i(a.b.l("no element for key <", str, ">"), this);
    }

    public a getArray(String str) throws i {
        c cVar = get(str);
        if (cVar instanceof a) {
            return (a) cVar;
        }
        StringBuilder sbO = e3.g.o("no array found for key <", str, ">, found [");
        sbO.append(cVar.c());
        sbO.append("] : ");
        sbO.append(cVar);
        throw new i(sbO.toString(), this);
    }

    public a getArrayOrCreate(String str) {
        a arrayOrNull = getArrayOrNull(str);
        if (arrayOrNull != null) {
            return arrayOrNull;
        }
        a aVar = new a(new char[0]);
        put(str, aVar);
        return aVar;
    }

    public a getArrayOrNull(String str) {
        c orNull = getOrNull(str);
        if (orNull instanceof a) {
            return (a) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws i {
        c cVar = get(str);
        if (cVar instanceof l) {
            return ((l) cVar).getBoolean();
        }
        StringBuilder sbO = e3.g.o("no boolean found for key <", str, ">, found [");
        sbO.append(cVar.c());
        sbO.append("] : ");
        sbO.append(cVar);
        throw new i(sbO.toString(), this);
    }

    public float getFloat(String str) throws i {
        c cVar = get(str);
        if (cVar != null) {
            return cVar.getFloat();
        }
        StringBuilder sbO = e3.g.o("no float found for key <", str, ">, found [");
        sbO.append(cVar.c());
        sbO.append("] : ");
        sbO.append(cVar);
        throw new i(sbO.toString(), this);
    }

    public float getFloatOrNaN(String str) {
        c orNull = getOrNull(str);
        if (orNull instanceof e) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws i {
        c cVar = get(str);
        if (cVar != null) {
            return cVar.getInt();
        }
        StringBuilder sbO = e3.g.o("no int found for key <", str, ">, found [");
        sbO.append(cVar.c());
        sbO.append("] : ");
        sbO.append(cVar);
        throw new i(sbO.toString(), this);
    }

    public g getObject(String str) throws i {
        c cVar = get(str);
        if (cVar instanceof g) {
            return (g) cVar;
        }
        StringBuilder sbO = e3.g.o("no object found for key <", str, ">, found [");
        sbO.append(cVar.c());
        sbO.append("] : ");
        sbO.append(cVar);
        throw new i(sbO.toString(), this);
    }

    public g getObjectOrNull(String str) {
        c orNull = getOrNull(str);
        if (orNull instanceof g) {
            return (g) orNull;
        }
        return null;
    }

    public c getOrNull(String str) {
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.content().equals(str)) {
                return dVar.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws i {
        c cVar = get(str);
        if (cVar instanceof j) {
            return cVar.content();
        }
        StringBuilder sbB = h.b("no string found for key <", str, ">, found [", cVar != null ? cVar.c() : null, "] : ");
        sbB.append(cVar);
        throw new i(sbB.toString(), this);
    }

    public String getStringOrNull(String str) {
        c orNull = getOrNull(str);
        if (orNull instanceof j) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if ((cVar instanceof d) && ((d) cVar).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // b3.c
    public int hashCode() {
        return Objects.hash(this.f8723h, Integer.valueOf(super.hashCode()));
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).content());
            }
        }
        return arrayList;
    }

    public void put(String str, c cVar) {
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            d dVar = (d) ((c) it.next());
            if (dVar.content().equals(str)) {
                dVar.set(cVar);
                return;
            }
        }
        this.f8723h.add((d) d.allocate(str, cVar));
    }

    public void putNumber(String str, float f10) {
        put(str, new e(f10));
    }

    public void putString(String str, String str2) {
        j jVar = new j(str2.toCharArray());
        jVar.setStart(0L);
        jVar.setEnd(str2.length() - 1);
        put(str, jVar);
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (((d) cVar).content().equals(str)) {
                arrayList.add(cVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f8723h.remove((c) it2.next());
        }
    }

    public int size() {
        return this.f8723h.size();
    }

    @Override // b3.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    @Override // b3.c
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b mo128clone() {
        b bVar = (b) super.mo128clone();
        ArrayList arrayList = new ArrayList(this.f8723h.size());
        Iterator it = this.f8723h.iterator();
        while (it.hasNext()) {
            c cVarMo128clone = ((c) it.next()).mo128clone();
            cVarMo128clone.setContainer(bVar);
            arrayList.add(cVarMo128clone);
        }
        bVar.f8723h = arrayList;
        return bVar;
    }

    public String getStringOrNull(int i10) {
        c orNull = getOrNull(i10);
        if (orNull instanceof j) {
            return orNull.content();
        }
        return null;
    }

    public c getOrNull(int i10) {
        if (i10 < 0 || i10 >= this.f8723h.size()) {
            return null;
        }
        return (c) this.f8723h.get(i10);
    }

    public float getFloat(int i10) throws i {
        c cVar = get(i10);
        if (cVar != null) {
            return cVar.getFloat();
        }
        throw new i(a.b.e(i10, "no float at index "), this);
    }

    public int getInt(int i10) throws i {
        c cVar = get(i10);
        if (cVar != null) {
            return cVar.getInt();
        }
        throw new i(a.b.e(i10, "no int at index "), this);
    }

    public a getArray(int i10) throws i {
        c cVar = get(i10);
        if (cVar instanceof a) {
            return (a) cVar;
        }
        throw new i(a.b.e(i10, "no array at index "), this);
    }

    public boolean getBoolean(int i10) throws i {
        c cVar = get(i10);
        if (cVar instanceof l) {
            return ((l) cVar).getBoolean();
        }
        throw new i(a.b.e(i10, "no boolean at index "), this);
    }

    public g getObject(int i10) throws i {
        c cVar = get(i10);
        if (cVar instanceof g) {
            return (g) cVar;
        }
        throw new i(a.b.e(i10, "no object at index "), this);
    }

    public c get(int i10) throws i {
        if (i10 >= 0 && i10 < this.f8723h.size()) {
            return (c) this.f8723h.get(i10);
        }
        throw new i(a.b.e(i10, "no element at index "), this);
    }

    public String getString(int i10) throws i {
        c cVar = get(i10);
        if (cVar instanceof j) {
            return cVar.content();
        }
        throw new i(a.b.e(i10, "no string at index "), this);
    }
}
