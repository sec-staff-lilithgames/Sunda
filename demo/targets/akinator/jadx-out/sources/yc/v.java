package yc;

import dd.g0;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v extends f implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Map f94354c;

    public v(o oVar) {
        super(oVar);
        this.f94354c = new LinkedHashMap();
    }

    @Override // jc.t
    public final jc.t a(ub.w wVar) {
        return get(wVar.getMatchingProperty());
    }

    @Override // yc.f, yc.b, jc.t, ub.o0
    public ub.z asToken() {
        return ub.z.START_OBJECT;
    }

    @Override // yc.b
    public final a e(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        if (wVar2.matches()) {
            return null;
        }
        jc.t tVar = get(wVar2.getMatchingProperty());
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
        return this.f94354c.values().iterator();
    }

    @Override // jc.t
    public boolean equals(Comparator<jc.t> comparator, jc.t tVar) {
        if (!(tVar instanceof v)) {
            return false;
        }
        Map map = ((v) tVar).f94354c;
        Map map2 = this.f94354c;
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map2.entrySet()) {
            jc.t tVar2 = (jc.t) map.get(entry.getKey());
            if (tVar2 == null || !((jc.t) entry.getValue()).equals(comparator, tVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // yc.b
    public final v f(ub.w wVar, ub.w wVar2, jc.s sVar, boolean z10) {
        if (wVar2.matches()) {
            return this;
        }
        jc.t tVar = get(wVar2.getMatchingProperty());
        if (tVar != null && (tVar instanceof b)) {
            v vVarF = ((b) tVar).f(wVar, wVar2.tail(), sVar, z10);
            if (vVarF != null) {
                return vVarF;
            }
            b.g(wVar, wVar2, sVar, tVar);
        }
        return m(wVar2, z10);
    }

    @Override // jc.t, ub.o0
    public Iterator<String> fieldNames() {
        return this.f94354c.keySet().iterator();
    }

    @Override // jc.t
    @Deprecated
    public Iterator<Map.Entry<String, jc.t>> fields() {
        return this.f94354c.entrySet().iterator();
    }

    @Override // jc.t
    public List<jc.t> findParents(String str, List<jc.t> list) {
        for (Map.Entry entry : this.f94354c.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = ((jc.t) entry.getValue()).findParents(str, list);
            }
        }
        return list;
    }

    @Override // jc.t
    public jc.t findValue(String str) {
        Map map = this.f94354c;
        jc.t tVar = (jc.t) map.get(str);
        if (tVar != null) {
            return tVar;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            jc.t tVarFindValue = ((jc.t) it.next()).findValue(str);
            if (tVarFindValue != null) {
                return tVarFindValue;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jc.t
    public List<jc.t> findValues(String str, List<jc.t> list) {
        for (Map.Entry entry : this.f94354c.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == 0) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = ((jc.t) entry.getValue()).findValues(str, list);
            }
        }
        return list;
    }

    @Override // jc.t
    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry entry : this.f94354c.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(((jc.t) entry.getValue()).asText());
            } else {
                list = ((jc.t) entry.getValue()).findValuesAsText(str, list);
            }
        }
        return list;
    }

    @Override // jc.t
    public void forEachEntry(BiConsumer<? super String, ? super jc.t> biConsumer) {
        this.f94354c.forEach(biConsumer);
    }

    @Override // jc.t
    public p getNodeType() {
        return p.f94337i;
    }

    public final Map h(u0 u0Var) {
        boolean zIsEnabled = u0Var.isEnabled(lc.w.WRITE_PROPERTIES_SORTED);
        Map map = this.f94354c;
        return (!zIsEnabled || map.isEmpty() || (map instanceof TreeMap)) ? map : new TreeMap(map);
    }

    @Override // yc.b
    public int hashCode() {
        return this.f94354c.hashCode();
    }

    public final void i(String str, jc.t tVar) {
        Objects.requireNonNull(str);
        this.f94354c.put(str, tVar);
    }

    @Override // jc.u
    public boolean isEmpty(u0 u0Var) {
        return this.f94354c.isEmpty();
    }

    @Override // jc.t, ub.o0
    public final boolean isObject() {
        return true;
    }

    public final a j(ub.w wVar, boolean z10) {
        String matchingProperty = wVar.getMatchingProperty();
        ub.w wVarTail = wVar.tail();
        return wVarTail.matches() ? putArray(matchingProperty) : (z10 && wVarTail.mayMatchElement()) ? putArray(matchingProperty).j(wVarTail, z10) : putObject(matchingProperty).j(wVarTail, z10);
    }

    public final v m(ub.w wVar, boolean z10) {
        String matchingProperty = wVar.getMatchingProperty();
        ub.w wVarTail = wVar.tail();
        return wVarTail.matches() ? putObject(matchingProperty) : (z10 && wVarTail.mayMatchElement()) ? putArray(matchingProperty).m(wVarTail, z10) : putObject(matchingProperty).m(wVarTail, z10);
    }

    public final void n(ub.o oVar, u0 u0Var, boolean z10, boolean z11) throws IOException {
        for (Map.Entry entry : h(u0Var).entrySet()) {
            jc.t tVar = (jc.t) entry.getValue();
            if (!z10 || !tVar.isArray() || !tVar.isEmpty(u0Var)) {
                if (!z11 || !tVar.isNull()) {
                    oVar.writeFieldName((String) entry.getKey());
                    tVar.serialize(oVar, u0Var);
                }
            }
        }
    }

    @Override // jc.t
    public Optional<jc.t> optional(String str) {
        return Optional.ofNullable(get(str));
    }

    @Override // jc.t
    public Set<Map.Entry<String, jc.t>> properties() {
        return this.f94354c.entrySet();
    }

    @Override // jc.t
    public Stream<Map.Entry<String, jc.t>> propertyStream() {
        return this.f94354c.entrySet().stream();
    }

    @Deprecated
    public jc.t put(String str, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        Objects.requireNonNull(str);
        return (jc.t) this.f94354c.put(str, tVar);
    }

    @Deprecated
    public jc.t putAll(Map<String, ? extends jc.t> map) {
        return setAll(map);
    }

    public a putArray(String str) {
        a aVarArrayNode = arrayNode();
        i(str, aVarArrayNode);
        return aVarArrayNode;
    }

    public jc.t putIfAbsent(String str, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        Objects.requireNonNull(str);
        return (jc.t) this.f94354c.putIfAbsent(str, tVar);
    }

    public v putNull(String str) {
        i(str, nullNode());
        return this;
    }

    public v putObject(String str) {
        v vVarObjectNode = objectNode();
        i(str, vVarObjectNode);
        return vVarObjectNode;
    }

    public v putPOJO(String str, Object obj) {
        i(str, pojoNode(obj));
        return this;
    }

    public v putRawValue(String str, g0 g0Var) {
        i(str, rawValueNode(g0Var));
        return this;
    }

    public jc.t remove(String str) {
        return (jc.t) this.f94354c.remove(str);
    }

    @Override // yc.f
    public /* bridge */ /* synthetic */ f removeIf(Predicate predicate) {
        return removeIf((Predicate<? super jc.t>) predicate);
    }

    public jc.t replace(String str, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        Objects.requireNonNull(str);
        return (jc.t) this.f94354c.put(str, tVar);
    }

    @Override // yc.b, jc.t
    public jc.t required(String str) {
        jc.t tVar = (jc.t) this.f94354c.get(str);
        if (tVar != null) {
            return tVar;
        }
        jc.t.b("No value for property '%s' of `ObjectNode`", str);
        throw null;
    }

    public v retain(Collection<String> collection) {
        this.f94354c.keySet().retainAll(collection);
        return this;
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public void serialize(ub.o oVar, u0 u0Var) throws IOException {
        if (u0Var != null) {
            boolean zIsEnabled = u0Var.isEnabled(t0.WRITE_EMPTY_JSON_ARRAYS);
            boolean z10 = !zIsEnabled;
            boolean zIsEnabled2 = u0Var.isEnabled(lc.w.WRITE_NULL_PROPERTIES);
            boolean z11 = !zIsEnabled2;
            if (!zIsEnabled || !zIsEnabled2) {
                oVar.writeStartObject(this);
                n(oVar, u0Var, z10, z11);
                oVar.writeEndObject();
                return;
            }
        }
        oVar.writeStartObject(this);
        for (Map.Entry entry : h(u0Var).entrySet()) {
            jc.t tVar = (jc.t) entry.getValue();
            oVar.writeFieldName((String) entry.getKey());
            tVar.serialize(oVar, u0Var);
        }
        oVar.writeEndObject();
    }

    @Override // yc.b, jc.t, jc.u, jc.v
    public void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException {
        boolean z10;
        boolean z11;
        if (u0Var != null) {
            z10 = !u0Var.isEnabled(t0.WRITE_EMPTY_JSON_ARRAYS);
            z11 = !u0Var.isEnabled(lc.w.WRITE_NULL_PROPERTIES);
        } else {
            z10 = false;
            z11 = false;
        }
        hc.c cVarWriteTypePrefix = jVar.writeTypePrefix(oVar, jVar.typeId(this, ub.z.START_OBJECT));
        if (z10 || z11) {
            n(oVar, u0Var, z10, z11);
        } else {
            for (Map.Entry entry : h(u0Var).entrySet()) {
                jc.t tVar = (jc.t) entry.getValue();
                oVar.writeFieldName((String) entry.getKey());
                tVar.serialize(oVar, u0Var);
            }
        }
        jVar.writeTypeSuffix(oVar, cVarWriteTypePrefix);
    }

    public <T extends jc.t> T set(String str, jc.t tVar) {
        if (tVar == null) {
            tVar = nullNode();
        }
        i(str, tVar);
        return this;
    }

    public <T extends jc.t> T setAll(Map<String, ? extends jc.t> map) {
        for (Map.Entry<String, ? extends jc.t> entry : map.entrySet()) {
            jc.t value = entry.getValue();
            if (value == null) {
                value = nullNode();
            }
            i(entry.getKey(), value);
        }
        return this;
    }

    @Override // yc.f, jc.t, ub.o0
    public int size() {
        return this.f94354c.size();
    }

    @Override // yc.f, jc.t
    public Stream<jc.t> valueStream() {
        return this.f94354c.values().stream();
    }

    @Override // jc.t
    public Iterator<jc.t> values() {
        return this.f94354c.values().iterator();
    }

    @Override // jc.t
    public a withArrayProperty(String str) {
        jc.t tVar = (jc.t) this.f94354c.get(str);
        if (tVar == null || tVar.isNull()) {
            return putArray(str);
        }
        if (tVar.isArray()) {
            return (a) tVar;
        }
        b.d("Cannot replace `JsonNode` of type `%s` with `ArrayNode` for property \"%s\" with (default mode `OverwriteMode.%s`)", tVar.getClass().getName(), str, jc.s.f69407b);
        throw null;
    }

    @Override // jc.t
    public v withObject(String str) {
        ub.w wVarC = b.c(str);
        return wVarC != null ? withObject(wVarC) : withObjectProperty(str);
    }

    @Override // jc.t
    public v withObjectProperty(String str) {
        jc.t tVar = (jc.t) this.f94354c.get(str);
        if (tVar == null || tVar.isNull()) {
            return putObject(str);
        }
        if (tVar.isObject()) {
            return (v) tVar;
        }
        b.d("Cannot replace `JsonNode` of type `%s` with `ObjectNode` for property \"%s\" (default mode `OverwriteMode.%s`)", tVar.getClass().getName(), str, jc.s.f69407b);
        throw null;
    }

    public <T extends jc.t> T without(String str) {
        this.f94354c.remove(str);
        return this;
    }

    @Override // jc.t
    public v deepCopy() {
        v vVarObjectNode = objectNode();
        for (Map.Entry entry : this.f94354c.entrySet()) {
            vVarObjectNode.f94354c.put(entry.getKey(), ((jc.t) entry.getValue()).deepCopy());
        }
        return vVarObjectNode;
    }

    @Override // jc.t
    public v findParent(String str) {
        Map map = this.f94354c;
        if (((jc.t) map.get(str)) != null) {
            return this;
        }
        Iterator it = map.values().iterator();
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
        return this.f94354c.isEmpty();
    }

    @Deprecated
    public jc.t putAll(v vVar) {
        return setAll(vVar);
    }

    public v remove(Collection<String> collection) {
        this.f94354c.keySet().removeAll(collection);
        return this;
    }

    @Override // yc.f
    public v removeAll() {
        this.f94354c.clear();
        return this;
    }

    @Override // yc.f
    public v removeIf(Predicate<? super jc.t> predicate) {
        this.f94354c.values().removeIf(predicate);
        return this;
    }

    public v retain(String... strArr) {
        return retain(Arrays.asList(strArr));
    }

    @Override // jc.t
    @Deprecated
    public v with(String str) {
        ub.w wVarC = b.c(str);
        if (wVarC != null) {
            return withObject(wVarC);
        }
        Map map = this.f94354c;
        jc.t tVar = (jc.t) map.get(str);
        if (tVar == null) {
            v vVarObjectNode = objectNode();
            map.put(str, vVarObjectNode);
            return vVarObjectNode;
        }
        if (tVar instanceof v) {
            return (v) tVar;
        }
        StringBuilder sbO = e3.g.o("Property '", str, "' has value that is not of type `ObjectNode` (but `");
        sbO.append(tVar.getClass().getName());
        sbO.append("`)");
        throw new UnsupportedOperationException(sbO.toString());
    }

    @Override // jc.t
    public a withArray(String str) {
        ub.w wVarC = b.c(str);
        if (wVarC != null) {
            return withArray(wVarC);
        }
        Map map = this.f94354c;
        jc.t tVar = (jc.t) map.get(str);
        if (tVar == null) {
            a aVarArrayNode = arrayNode();
            map.put(str, aVarArrayNode);
            return aVarArrayNode;
        }
        if (tVar instanceof a) {
            return (a) tVar;
        }
        StringBuilder sbO = e3.g.o("Property '", str, "' has value that is not of type `ArrayNode` (but `");
        sbO.append(tVar.getClass().getName());
        sbO.append("`)");
        throw new UnsupportedOperationException(sbO.toString());
    }

    public <T extends jc.t> T without(Collection<String> collection) {
        this.f94354c.keySet().removeAll(collection);
        return this;
    }

    public v(o oVar, Map<String, jc.t> map) {
        super(oVar);
        Objects.requireNonNull(map, "Must not pass `null` for 'children' argument");
        this.f94354c = map;
    }

    @Override // yc.f, jc.t, ub.o0
    public jc.t get(int i10) {
        return null;
    }

    @Override // jc.t, ub.o0
    public jc.t path(int i10) {
        return r.getInstance();
    }

    public v put(String str, short s10) {
        i(str, numberNode(s10));
        return this;
    }

    @Override // yc.f, jc.t, ub.o0
    public jc.t get(String str) {
        return (jc.t) this.f94354c.get(str);
    }

    @Override // jc.t, ub.o0
    public jc.t path(String str) {
        jc.t tVar = (jc.t) this.f94354c.get(str);
        return tVar != null ? tVar : r.getInstance();
    }

    public v put(String str, Short sh2) {
        jc.t tVarNumberNode;
        if (sh2 == null) {
            tVarNumberNode = nullNode();
        } else {
            tVarNumberNode = numberNode(sh2.shortValue());
        }
        i(str, tVarNumberNode);
        return this;
    }

    public <T extends jc.t> T setAll(v vVar) {
        this.f94354c.putAll(vVar.f94354c);
        return this;
    }

    public v put(String str, int i10) {
        i(str, numberNode(i10));
        return this;
    }

    public v put(String str, Integer num) {
        jc.t tVarNumberNode;
        if (num == null) {
            tVarNumberNode = nullNode();
        } else {
            tVarNumberNode = numberNode(num.intValue());
        }
        i(str, tVarNumberNode);
        return this;
    }

    @Override // jc.t
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof v)) {
            return this.f94354c.equals(((v) obj).f94354c);
        }
        return false;
    }

    public v put(String str, long j10) {
        i(str, numberNode(j10));
        return this;
    }

    public v put(String str, Long l9) {
        jc.t tVarNumberNode;
        if (l9 == null) {
            tVarNumberNode = nullNode();
        } else {
            tVarNumberNode = numberNode(l9.longValue());
        }
        i(str, tVarNumberNode);
        return this;
    }

    public v put(String str, float f10) {
        i(str, numberNode(f10));
        return this;
    }

    public v put(String str, Float f10) {
        jc.t tVarNumberNode;
        if (f10 == null) {
            tVarNumberNode = nullNode();
        } else {
            tVarNumberNode = numberNode(f10.floatValue());
        }
        i(str, tVarNumberNode);
        return this;
    }

    public v put(String str, double d10) {
        i(str, numberNode(d10));
        return this;
    }

    public v put(String str, Double d10) {
        jc.t tVarNumberNode;
        if (d10 == null) {
            tVarNumberNode = nullNode();
        } else {
            tVarNumberNode = numberNode(d10.doubleValue());
        }
        i(str, tVarNumberNode);
        return this;
    }

    public v put(String str, BigDecimal bigDecimal) {
        a0 a0VarNumberNode;
        if (bigDecimal == null) {
            a0VarNumberNode = nullNode();
        } else {
            a0VarNumberNode = numberNode(bigDecimal);
        }
        i(str, a0VarNumberNode);
        return this;
    }

    public v put(String str, BigInteger bigInteger) {
        a0 a0VarNumberNode;
        if (bigInteger == null) {
            a0VarNumberNode = nullNode();
        } else {
            a0VarNumberNode = numberNode(bigInteger);
        }
        i(str, a0VarNumberNode);
        return this;
    }

    public v put(String str, String str2) {
        jc.t tVarTextNode;
        if (str2 == null) {
            tVarTextNode = nullNode();
        } else {
            tVarTextNode = textNode(str2);
        }
        i(str, tVarTextNode);
        return this;
    }

    public v put(String str, boolean z10) {
        i(str, booleanNode(z10));
        return this;
    }

    public v put(String str, Boolean bool) {
        jc.t tVarBooleanNode;
        if (bool == null) {
            tVarBooleanNode = nullNode();
        } else {
            tVarBooleanNode = booleanNode(bool.booleanValue());
        }
        i(str, tVarBooleanNode);
        return this;
    }

    public v put(String str, byte[] bArr) {
        jc.t tVarBinaryNode;
        if (bArr == null) {
            tVarBinaryNode = nullNode();
        } else {
            tVarBinaryNode = binaryNode(bArr);
        }
        i(str, tVarBinaryNode);
        return this;
    }
}
