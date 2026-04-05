package yc;

import dd.g0;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import jc.u0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends f implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final List f94299c;

    public a(o oVar) {
        super(oVar);
        this.f94299c = new ArrayList();
    }

    @Override // jc.t
    public final jc.t a(ub.w wVar) {
        return get(wVar.getMatchingIndex());
    }

    public a add(jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        this.f94299c.add(tVar);
        return this;
    }

    public a addAll(a aVar) {
        this.f94299c.addAll(aVar.f94299c);
        return this;
    }

    public a addArray() {
        a aVarArrayNode = arrayNode();
        this.f94299c.add(aVarArrayNode);
        return aVarArrayNode;
    }

    public a addNull() {
        this.f94299c.add(nullNode());
        return this;
    }

    public v addObject() {
        v vVarObjectNode = objectNode();
        this.f94299c.add(vVarObjectNode);
        return vVarObjectNode;
    }

    public a addPOJO(Object obj) {
        this.f94299c.add(obj == null ? nullNode() : pojoNode(obj));
        return this;
    }

    public a addRawValue(g0 g0Var) {
        this.f94299c.add(g0Var == null ? nullNode() : rawValueNode(g0Var));
        return this;
    }

    @Override // yc.f, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.START_ARRAY;
    }

    @Override // yc.b
    public final a e(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        if (wVar2.matches()) {
            return this;
        }
        jc.t tVar = get(wVar2.getMatchingIndex());
        if (tVar != null && (tVar instanceof b)) {
            a aVarE = ((b) tVar).e(wVar, wVar2.tail(), sVar, z10);
            if (aVarE != null) {
                return aVarE;
            }
            b.g(wVar, wVar2, sVar, tVar);
        }
        return j(wVar2, z10);
    }

    @Override // jc.t
    public Iterator<jc.t> elements() {
        return this.f94299c.listIterator();
    }

    @Override // jc.t
    public boolean equals(Comparator<jc.t> comparator, jc.t tVar) {
        if (!(tVar instanceof a)) {
            return false;
        }
        a aVar = (a) tVar;
        List list = this.f94299c;
        int size = list.size();
        if (aVar.size() != size) {
            return false;
        }
        List list2 = aVar.f94299c;
        for (int i10 = 0; i10 < size; i10++) {
            if (!((jc.t) list.get(i10)).equals(comparator, (jc.t) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // yc.b
    public final v f(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        if (wVar2.matches()) {
            return null;
        }
        jc.t tVar = get(wVar2.getMatchingIndex());
        if (tVar != null && (tVar instanceof b)) {
            v vVarF = ((b) tVar).f(wVar, wVar2.tail(), sVar, z10);
            if (vVarF != null) {
                return vVarF;
            }
            b.g(wVar, wVar2, sVar, tVar);
        }
        return m(wVar2, z10);
    }

    @Override // jc.t
    public List<jc.t> findParents(String str, List<jc.t> list) {
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            list = ((jc.t) it.next()).findParents(str, list);
        }
        return list;
    }

    @Override // jc.t
    public jc.t findValue(String str) {
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            jc.t tVarFindValue = ((jc.t) it.next()).findValue(str);
            if (tVarFindValue != null) {
                return tVarFindValue;
            }
        }
        return null;
    }

    @Override // jc.t
    public List<jc.t> findValues(String str, List<jc.t> list) {
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            list = ((jc.t) it.next()).findValues(str, list);
        }
        return list;
    }

    @Override // jc.t
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            list = ((jc.t) it.next()).findValuesAsText(str, list);
        }
        return list;
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94331b;
    }

    public final void h(int i10, jc.t tVar) {
        List list = this.f94299c;
        if (i10 < 0) {
            list.add(0, tVar);
        } else if (i10 >= list.size()) {
            list.add(tVar);
        } else {
            list.add(i10, tVar);
        }
    }

    @Override // yc.b
    public int hashCode() {
        return this.f94299c.hashCode();
    }

    public final void i(int i10, a0 a0Var) {
        if (i10 >= 0) {
            List list = this.f94299c;
            if (i10 < list.size()) {
                list.set(i10, a0Var);
                return;
            }
        }
        StringBuilder sbT = o2.t(i10, "Illegal index ", ", array size ");
        sbT.append(size());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public a insert(int i10, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        h(i10, tVar);
        return this;
    }

    public a insertArray(int i10) {
        a aVarArrayNode = arrayNode();
        h(i10, aVarArrayNode);
        return aVarArrayNode;
    }

    public a insertNull(int i10) {
        h(i10, nullNode());
        return this;
    }

    public v insertObject(int i10) {
        v vVarObjectNode = objectNode();
        h(i10, vVarObjectNode);
        return vVarObjectNode;
    }

    public a insertPOJO(int i10, Object obj) {
        h(i10, obj == null ? nullNode() : pojoNode(obj));
        return this;
    }

    public a insertRawValue(int i10, g0 g0Var) {
        h(i10, g0Var == null ? nullNode() : rawValueNode(g0Var));
        return this;
    }

    @Override // jc.t, ub.o0
    public boolean isArray() {
        return true;
    }

    @Override // jc.u
    public boolean isEmpty(u0 u0Var) {
        return this.f94299c.isEmpty();
    }

    public final a j(ub.w wVar, boolean z10) {
        int matchingIndex = wVar.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        ub.w wVarTail = wVar.tail();
        if (wVarTail.matches()) {
            a aVarArrayNode = arrayNode();
            n(matchingIndex, aVarArrayNode);
            return aVarArrayNode;
        }
        if (z10 && wVarTail.mayMatchElement()) {
            a aVarArrayNode2 = arrayNode();
            n(matchingIndex, aVarArrayNode2);
            return aVarArrayNode2.j(wVarTail, z10);
        }
        v vVarObjectNode = objectNode();
        n(matchingIndex, vVarObjectNode);
        return vVarObjectNode.j(wVarTail, z10);
    }

    public final v m(ub.w wVar, boolean z10) {
        int matchingIndex = wVar.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        ub.w wVarTail = wVar.tail();
        if (wVarTail.matches()) {
            v vVarObjectNode = objectNode();
            n(matchingIndex, vVarObjectNode);
            return vVarObjectNode;
        }
        if (z10 && wVarTail.mayMatchElement()) {
            a aVarArrayNode = arrayNode();
            n(matchingIndex, aVarArrayNode);
            return aVarArrayNode.m(wVarTail, z10);
        }
        v vVarObjectNode2 = objectNode();
        n(matchingIndex, vVarObjectNode2);
        return vVarObjectNode2.m(wVarTail, z10);
    }

    public final void n(int i10, f fVar) {
        if (i10 >= size()) {
            int maxElementIndexForInsert = this.f94310b.getMaxElementIndexForInsert();
            if (i10 > maxElementIndexForInsert) {
                throw new UnsupportedOperationException(String.format("Too big Array index (%d; max %d) to use for insert with `JsonPointer`", Integer.valueOf(i10), Integer.valueOf(maxElementIndexForInsert)));
            }
            while (i10 >= size()) {
                addNull();
            }
        }
        set(i10, fVar);
    }

    @Override // jc.t
    public Optional<jc.t> optional(int i10) {
        return Optional.ofNullable(get(i10));
    }

    public jc.t remove(int i10) {
        if (i10 < 0) {
            return null;
        }
        List list = this.f94299c;
        if (i10 < list.size()) {
            return (jc.t) list.remove(i10);
        }
        return null;
    }

    @Override // yc.f
    public /* bridge */ /* synthetic */ f removeIf(Predicate predicate) {
        return removeIf((Predicate<? super jc.t>) predicate);
    }

    @Override // yc.b, jc.t
    public jc.t required(int i10) {
        List list = this.f94299c;
        if (i10 >= 0 && i10 < list.size()) {
            return (jc.t) list.get(i10);
        }
        jc.t.b("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i10), Integer.valueOf(list.size()));
        throw null;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public void serialize(ub.o oVar, u0 u0Var) throws IOException {
        List list = this.f94299c;
        int size = list.size();
        oVar.writeStartArray(this, size);
        for (int i10 = 0; i10 < size; i10++) {
            ((jc.t) list.get(i10)).serialize(oVar, u0Var);
        }
        oVar.writeEndArray();
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(this, ub.z.START_ARRAY));
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            ((b) ((jc.t) it.next())).serialize(oVar, u0Var);
        }
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    public jc.t set(int i10, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        if (i10 >= 0) {
            List list = this.f94299c;
            if (i10 < list.size()) {
                return (jc.t) list.set(i10, tVar);
            }
        }
        StringBuilder sbT = o2.t(i10, "Illegal index ", ", array size ");
        sbT.append(size());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public a setNull(int i10) {
        i(i10, nullNode());
        return this;
    }

    public a setPOJO(int i10, Object obj) {
        i(i10, obj == null ? nullNode() : pojoNode(obj));
        return this;
    }

    public a setRawValue(int i10, g0 g0Var) {
        i(i10, g0Var == null ? nullNode() : rawValueNode(g0Var));
        return this;
    }

    @Override // yc.f, jc.t, ub.o0
    public int size() {
        return this.f94299c.size();
    }

    @Override // yc.f, jc.t
    public Stream<jc.t> valueStream() {
        return this.f94299c.stream();
    }

    @Override // jc.t
    public Iterator<jc.t> values() {
        return this.f94299c.listIterator();
    }

    public a addAll(Collection<? extends jc.t> collection) {
        Iterator<? extends jc.t> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    @Override // jc.t
    public a deepCopy() {
        List list = this.f94299c;
        a aVarArrayNode = arrayNode(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aVarArrayNode.f94299c.add(((jc.t) it.next()).deepCopy());
        }
        return aVarArrayNode;
    }

    @Override // jc.t
    public v findParent(String str) {
        Iterator it = this.f94299c.iterator();
        while (it.hasNext()) {
            jc.t tVarFindParent = ((jc.t) it.next()).findParent(str);
            if (tVarFindParent != null) {
                return (v) tVarFindParent;
            }
        }
        return null;
    }

    @Override // jc.t
    public boolean isEmpty() {
        return this.f94299c.isEmpty();
    }

    @Override // yc.f
    public a removeAll() {
        this.f94299c.clear();
        return this;
    }

    @Override // yc.f
    public a removeIf(Predicate<? super jc.t> predicate) {
        this.f94299c.removeIf(predicate);
        return this;
    }

    @Override // jc.t
    @Deprecated
    public v with(String str) {
        ub.w wVarC = b.c(str);
        return wVarC != null ? withObject(wVarC) : (v) super.with(str);
    }

    @Override // jc.t
    public a withArray(String str) {
        ub.w wVarC = b.c(str);
        return wVarC != null ? withArray(wVarC) : (a) super.withArray(str);
    }

    public a(o oVar, int i10) {
        super(oVar);
        this.f94299c = new ArrayList(i10);
    }

    public a add(short s10) {
        this.f94299c.add(numberNode(s10));
        return this;
    }

    @Override // yc.f, jc.t, ub.o0
    public jc.t get(int i10) {
        if (i10 < 0) {
            return null;
        }
        List list = this.f94299c;
        if (i10 < list.size()) {
            return (jc.t) list.get(i10);
        }
        return null;
    }

    public a insert(int i10, short s10) {
        h(i10, numberNode(s10));
        return this;
    }

    @Override // jc.t, ub.o0
    public jc.t path(String str) {
        return r.getInstance();
    }

    public a insert(int i10, Short sh2) {
        h(i10, sh2 == null ? nullNode() : numberNode(sh2.shortValue()));
        return this;
    }

    @Override // jc.t, ub.o0
    public jc.t path(int i10) {
        if (i10 >= 0) {
            List list = this.f94299c;
            if (i10 < list.size()) {
                return (jc.t) list.get(i10);
            }
        }
        return r.getInstance();
    }

    public a(o oVar, List<jc.t> list) {
        super(oVar);
        Objects.requireNonNull(list, "Must not pass `null` for 'children' argument");
        this.f94299c = list;
    }

    public a add(Short sh2) {
        this.f94299c.add(sh2 == null ? nullNode() : numberNode(sh2.shortValue()));
        return this;
    }

    @Override // yc.f, jc.t, ub.o0
    public jc.t get(String str) {
        return null;
    }

    public a insert(int i10, int i11) {
        h(i10, numberNode(i11));
        return this;
    }

    public a insert(int i10, Integer num) {
        h(i10, num == null ? nullNode() : numberNode(num.intValue()));
        return this;
    }

    public a add(int i10) {
        this.f94299c.add(numberNode(i10));
        return this;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        return this.f94299c.equals(((a) obj).f94299c);
    }

    public a insert(int i10, long j10) {
        h(i10, numberNode(j10));
        return this;
    }

    public a insert(int i10, Long l9) {
        h(i10, l9 == null ? nullNode() : numberNode(l9.longValue()));
        return this;
    }

    public a add(Integer num) {
        this.f94299c.add(num == null ? nullNode() : numberNode(num.intValue()));
        return this;
    }

    public a insert(int i10, float f10) {
        h(i10, numberNode(f10));
        return this;
    }

    public a insert(int i10, Float f10) {
        h(i10, f10 == null ? nullNode() : numberNode(f10.floatValue()));
        return this;
    }

    public a add(long j10) {
        this.f94299c.add(numberNode(j10));
        return this;
    }

    public a insert(int i10, double d10) {
        h(i10, numberNode(d10));
        return this;
    }

    public a set(int i10, short s10) {
        i(i10, numberNode(s10));
        return this;
    }

    public a insert(int i10, Double d10) {
        h(i10, d10 == null ? nullNode() : numberNode(d10.doubleValue()));
        return this;
    }

    public a set(int i10, Short sh2) {
        i(i10, sh2 == null ? nullNode() : numberNode(sh2.shortValue()));
        return this;
    }

    public a add(Long l9) {
        this.f94299c.add(l9 == null ? nullNode() : numberNode(l9.longValue()));
        return this;
    }

    public a insert(int i10, BigDecimal bigDecimal) {
        h(i10, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
        return this;
    }

    public a set(int i10, int i11) {
        i(i10, numberNode(i11));
        return this;
    }

    public a insert(int i10, BigInteger bigInteger) {
        h(i10, bigInteger == null ? nullNode() : numberNode(bigInteger));
        return this;
    }

    public a set(int i10, Integer num) {
        i(i10, num == null ? nullNode() : numberNode(num.intValue()));
        return this;
    }

    public a add(float f10) {
        this.f94299c.add(numberNode(f10));
        return this;
    }

    public a insert(int i10, String str) {
        h(i10, str == null ? nullNode() : textNode(str));
        return this;
    }

    public a set(int i10, long j10) {
        i(i10, numberNode(j10));
        return this;
    }

    public a insert(int i10, boolean z10) {
        h(i10, booleanNode(z10));
        return this;
    }

    public a set(int i10, Long l9) {
        i(i10, l9 == null ? nullNode() : numberNode(l9.longValue()));
        return this;
    }

    public a add(Float f10) {
        this.f94299c.add(f10 == null ? nullNode() : numberNode(f10.floatValue()));
        return this;
    }

    public a insert(int i10, Boolean bool) {
        if (bool == null) {
            return insertNull(i10);
        }
        h(i10, booleanNode(bool.booleanValue()));
        return this;
    }

    public a set(int i10, float f10) {
        i(i10, numberNode(f10));
        return this;
    }

    public a set(int i10, Float f10) {
        i(i10, f10 == null ? nullNode() : numberNode(f10.floatValue()));
        return this;
    }

    public a add(double d10) {
        this.f94299c.add(numberNode(d10));
        return this;
    }

    public a insert(int i10, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i10);
        }
        h(i10, binaryNode(bArr));
        return this;
    }

    public a set(int i10, double d10) {
        i(i10, numberNode(d10));
        return this;
    }

    public a set(int i10, Double d10) {
        i(i10, d10 == null ? nullNode() : numberNode(d10.doubleValue()));
        return this;
    }

    public a add(Double d10) {
        this.f94299c.add(d10 == null ? nullNode() : numberNode(d10.doubleValue()));
        return this;
    }

    public a set(int i10, BigDecimal bigDecimal) {
        i(i10, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
        return this;
    }

    public a set(int i10, BigInteger bigInteger) {
        i(i10, bigInteger == null ? nullNode() : numberNode(bigInteger));
        return this;
    }

    public a add(BigDecimal bigDecimal) {
        this.f94299c.add(bigDecimal == null ? nullNode() : numberNode(bigDecimal));
        return this;
    }

    public a set(int i10, String str) {
        i(i10, str == null ? nullNode() : textNode(str));
        return this;
    }

    public a set(int i10, boolean z10) {
        i(i10, booleanNode(z10));
        return this;
    }

    public a add(BigInteger bigInteger) {
        this.f94299c.add(bigInteger == null ? nullNode() : numberNode(bigInteger));
        return this;
    }

    public a set(int i10, Boolean bool) {
        i(i10, bool == null ? nullNode() : booleanNode(bool.booleanValue()));
        return this;
    }

    public a set(int i10, byte[] bArr) {
        i(i10, bArr == null ? nullNode() : binaryNode(bArr));
        return this;
    }

    public a add(String str) {
        this.f94299c.add(str == null ? nullNode() : textNode(str));
        return this;
    }

    public a add(boolean z10) {
        this.f94299c.add(booleanNode(z10));
        return this;
    }

    public a add(Boolean bool) {
        this.f94299c.add(bool == null ? nullNode() : booleanNode(bool.booleanValue()));
        return this;
    }

    public a add(byte[] bArr) {
        this.f94299c.add(bArr == null ? nullNode() : binaryNode(bArr));
        return this;
    }
}
