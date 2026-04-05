package jc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t extends u implements ub.o0, Iterable {
    public static void b(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public abstract t a(ub.w wVar);

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public Optional<t> asOptional() {
        return Optional.of(this);
    }

    public abstract String asText();

    public String asText(String str) {
        String strAsText = asText();
        return strAsText == null ? str : strAsText;
    }

    @Override // ub.o0
    public abstract /* synthetic */ ub.z asToken();

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends t> T deepCopy();

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<t> elements() {
        return dd.i.emptyIterator();
    }

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<t> comparator, t tVar) {
        return comparator.compare(this, tVar) == 0;
    }

    @Override // ub.o0
    public Iterator<String> fieldNames() {
        return dd.i.emptyIterator();
    }

    @Deprecated
    public Iterator<Map.Entry<String, t>> fields() {
        return dd.i.emptyIterator();
    }

    public abstract t findParent(String str);

    public final List<t> findParents(String str) {
        List<t> listFindParents = findParents(str, null);
        return listFindParents == null ? Collections.EMPTY_LIST : listFindParents;
    }

    public abstract List<t> findParents(String str, List<t> list);

    public abstract t findPath(String str);

    public abstract t findValue(String str);

    public final List<t> findValues(String str) {
        List<t> listFindValues = findValues(str, null);
        return listFindValues == null ? Collections.EMPTY_LIST : listFindValues;
    }

    public abstract List<t> findValues(String str, List<t> list);

    public final List<String> findValuesAsText(String str) {
        List<String> listFindValuesAsText = findValuesAsText(str, null);
        return listFindValuesAsText == null ? Collections.EMPTY_LIST : listFindValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    @Override // ub.o0
    public abstract t get(int i10);

    public abstract yc.p getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        t tVar = get(str);
        return (tVar == null || tVar.isNull()) ? false : true;
    }

    public int intValue() {
        return 0;
    }

    @Override // ub.o0
    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == yc.p.f94332c;
    }

    public final boolean isBoolean() {
        return getNodeType() == yc.p.f94333e;
    }

    @Override // ub.o0
    public final boolean isContainerNode() {
        yc.p nodeType = getNodeType();
        return nodeType == yc.p.f94337i || nodeType == yc.p.f94331b;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    @Override // ub.o0
    public boolean isMissingNode() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == yc.p.f94335g;
    }

    public final boolean isNumber() {
        return getNodeType() == yc.p.f94336h;
    }

    @Override // ub.o0
    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == yc.p.f94338j;
    }

    public boolean isShort() {
        return false;
    }

    public final boolean isTextual() {
        return getNodeType() == yc.p.f94339k;
    }

    @Override // ub.o0
    public final boolean isValueNode() {
        int iOrdinal = getNodeType().ordinal();
        return (iOrdinal == 0 || iOrdinal == 3 || iOrdinal == 6) ? false : true;
    }

    @Override // java.lang.Iterable
    public final Iterator<t> iterator() {
        return elements();
    }

    public long longValue() {
        return 0L;
    }

    @Override // ub.o0
    public abstract /* synthetic */ ub.s numberType();

    public Number numberValue() {
        return null;
    }

    public Optional<t> optional(int i10) {
        return Optional.empty();
    }

    @Override // ub.o0
    public abstract t path(int i10);

    @Override // ub.o0
    public abstract t path(String str);

    public Set<Map.Entry<String, t>> properties() {
        return Collections.EMPTY_SET;
    }

    public Stream<Map.Entry<String, t>> propertyStream() {
        return dd.i.emptyStream();
    }

    public t required(String str) throws IllegalArgumentException {
        b("Node of type `%s` has no fields", getClass().getName());
        throw null;
    }

    public t requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(ub.w.compile(str));
    }

    @Override // jc.u, jc.v
    public abstract /* synthetic */ void serialize(ub.o oVar, u0 u0Var) throws IOException;

    @Override // jc.u, jc.v
    public abstract /* synthetic */ void serializeWithType(ub.o oVar, u0 u0Var, wc.j jVar) throws IOException;

    public short shortValue() {
        return (short) 0;
    }

    @Override // ub.o0
    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public String toPrettyString() {
        return toString();
    }

    public abstract String toString();

    @Override // ub.o0
    public abstract /* synthetic */ ub.u traverse();

    @Override // ub.o0
    public abstract /* synthetic */ ub.u traverse(ub.a0 a0Var);

    public Stream<t> valueStream() {
        return dd.i.emptyStream();
    }

    public Iterator<t> values() {
        return elements();
    }

    @Deprecated
    public <T extends t> T with(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but " + getClass().getName() + "), cannot call `with(String)` on it");
    }

    public <T extends t> T withArray(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + getClass().getName() + ")`, cannot call `withArray()` on it");
    }

    public yc.a withArrayProperty(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + getClass().getName() + ")`, cannot call `withArrayProperty(String)` on it");
    }

    public yc.v withObject(String str) {
        throw new UnsupportedOperationException("`withObject(String)` not implemented by `" + getClass().getName() + "`");
    }

    public yc.v withObjectProperty(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + getClass().getName() + ")`, cannot call `withObjectProperty(String)` on it");
    }

    public boolean asBoolean(boolean z10) {
        return z10;
    }

    public double asDouble(double d10) {
        return d10;
    }

    public int asInt(int i10) {
        return i10;
    }

    public long asLong(long j10) {
        return j10;
    }

    public boolean has(int i10) {
        return get(i10) != null;
    }

    public Optional<t> optional(String str) {
        return Optional.empty();
    }

    public t required(int i10) throws IllegalArgumentException {
        b("Node of type `%s` has no indexed values", getClass().getName());
        throw null;
    }

    public final t requiredAt(ub.w wVar) throws IllegalArgumentException {
        t tVarA = this;
        for (ub.w wVarTail = wVar; !wVarTail.matches(); wVarTail = wVarTail.tail()) {
            tVarA = tVarA.a(wVarTail);
            if (tVarA == null) {
                b("No node at '%s' (unmatched part: '%s')", wVar, wVarTail);
                throw null;
            }
        }
        return tVarA;
    }

    @Override // ub.o0
    public final t at(ub.w wVar) {
        if (wVar.matches()) {
            return this;
        }
        t tVarA = a(wVar);
        if (tVarA == null) {
            return yc.r.getInstance();
        }
        return tVarA.at(wVar.tail());
    }

    @Override // ub.o0
    public t get(String str) {
        return null;
    }

    public boolean hasNonNull(int i10) {
        t tVar = get(i10);
        return (tVar == null || tVar.isNull()) ? false : true;
    }

    public yc.a withArray(String str, s sVar, boolean z10) {
        return withArray(ub.w.compile(str), sVar, z10);
    }

    public final yc.v withObject(String str, s sVar, boolean z10) {
        return withObject(ub.w.compile(str), sVar, z10);
    }

    public final yc.a withArray(ub.w wVar) {
        return withArray(wVar, s.f69407b, true);
    }

    public final yc.v withObject(ub.w wVar) {
        return withObject(wVar, s.f69407b, true);
    }

    public yc.a withArray(ub.w wVar, s sVar, boolean z10) {
        throw new UnsupportedOperationException("`withArray(JsonPointer)` not implemented by ".concat(getClass().getName()));
    }

    public yc.v withObject(ub.w wVar, s sVar, boolean z10) {
        throw new UnsupportedOperationException("`withObject(JsonPointer)` not implemented by `" + getClass().getName() + "`");
    }

    @Override // ub.o0
    public final t at(String str) {
        return at(ub.w.compile(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends t> T require() throws IllegalArgumentException {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends t> T requireNonNull() throws IllegalArgumentException {
        return this;
    }

    public void forEachEntry(BiConsumer<? super String, ? super t> biConsumer) {
    }
}
