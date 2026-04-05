package io.ktor.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import tu.v;
import tu.x0;
import tv.Mu.QpyI;
import uu.o0;
import uu.p1;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class StringValuesKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StringValuesKt$appendFiltered$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements p {
        final /* synthetic */ boolean $keepEmpty;
        final /* synthetic */ p $predicate;
        final /* synthetic */ StringValuesBuilder $this_appendFiltered;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, StringValuesBuilder stringValuesBuilder, p pVar) {
            super(2);
            this.$keepEmpty = z10;
            this.$this_appendFiltered = stringValuesBuilder;
            this.$predicate = pVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String name, List<String> value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            List<String> list = value;
            ArrayList arrayList = new ArrayList(value.size());
            p pVar = this.$predicate;
            for (Object obj : list) {
                if (((Boolean) pVar.invoke(name, (String) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (this.$keepEmpty || !arrayList.isEmpty()) {
                this.$this_appendFiltered.appendAll(name, arrayList);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StringValuesKt$flattenForEach$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39971 extends f0 implements p {
        final /* synthetic */ p $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39971(p pVar) {
            super(2);
            this.$block = pVar;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String name, List<String> items) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(items, "items");
            p pVar = this.$block;
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                pVar.invoke(name, (String) it.next());
            }
        }
    }

    public static final StringValuesBuilder appendAll(StringValuesBuilder stringValuesBuilder, StringValuesBuilder builder) {
        e0.checkNotNullParameter(stringValuesBuilder, "<this>");
        e0.checkNotNullParameter(builder, "builder");
        Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringValuesBuilder.appendAll((String) entry.getKey(), (List) entry.getValue());
        }
        return stringValuesBuilder;
    }

    public static /* synthetic */ void appendFiltered$default(StringValuesBuilder stringValuesBuilder, StringValues stringValues, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        appendFiltered(stringValuesBuilder, stringValues, z10, pVar);
    }

    public static final StringValuesBuilder appendIfNameAbsent(StringValuesBuilder stringValuesBuilder, String name, String value) {
        e0.checkNotNullParameter(stringValuesBuilder, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    public static final StringValuesBuilder appendIfNameAndValueAbsent(StringValuesBuilder stringValuesBuilder, String name, String value) {
        e0.checkNotNullParameter(stringValuesBuilder, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name, value)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean entriesEquals(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return e0.areEqual(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int entriesHashCode(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i10) {
        return set.hashCode() + (i10 * 31);
    }

    public static final StringValues filter(StringValues stringValues, boolean z10, p predicate) {
        e0.checkNotNullParameter(stringValues, "<this>");
        e0.checkNotNullParameter(predicate, "predicate");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        Map mapCaseInsensitiveMap = stringValues.getCaseInsensitiveName() ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(setEntries.size());
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (Object obj : iterable) {
                if (((Boolean) predicate.invoke(entry.getKey(), (String) obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z10 || !arrayList.isEmpty()) {
                mapCaseInsensitiveMap.put(entry.getKey(), arrayList);
            }
        }
        return new StringValuesImpl(stringValues.getCaseInsensitiveName(), mapCaseInsensitiveMap);
    }

    public static /* synthetic */ StringValues filter$default(StringValues stringValues, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return filter(stringValues, z10, pVar);
    }

    public static final List<v> flattenEntries(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(tu.e0.to(entry.getKey(), (String) it2.next()));
            }
            v0.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final void flattenForEach(StringValues stringValues, p block) {
        e0.checkNotNullParameter(stringValues, "<this>");
        e0.checkNotNullParameter(block, "block");
        stringValues.forEach(new C39971(block));
    }

    public static final Map<String, List<String>> toMap(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), y0.toList((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final StringValues valuesOf(v[] pairs, boolean z10) {
        e0.checkNotNullParameter(pairs, "pairs");
        return new StringValuesImpl(z10, p1.toMap(uu.f0.asList(pairs)));
    }

    public static /* synthetic */ StringValues valuesOf$default(v[] vVarArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return valuesOf(vVarArr, z10);
    }

    public static final void appendFiltered(StringValuesBuilder stringValuesBuilder, StringValues source, boolean z10, p predicate) {
        e0.checkNotNullParameter(stringValuesBuilder, QpyI.IFVPPVy);
        e0.checkNotNullParameter(source, "source");
        e0.checkNotNullParameter(predicate, "predicate");
        source.forEach(new AnonymousClass1(z10, stringValuesBuilder, predicate));
    }

    public static final StringValues valuesOf(String name, String value, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return new StringValuesSingleImpl(z10, name, o0.listOf(value));
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return valuesOf(str, str2, z10);
    }

    public static final StringValues valuesOf(String name, List<String> values, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        return new StringValuesSingleImpl(z10, name, values);
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return valuesOf(str, (List<String>) list, z10);
    }

    public static final StringValues valuesOf() {
        return StringValues.Companion.getEmpty();
    }

    public static /* synthetic */ StringValues valuesOf$default(Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return valuesOf((Map<String, ? extends Iterable<String>>) map, z10);
    }

    public static final StringValues valuesOf(Map<String, ? extends Iterable<String>> map, boolean z10) {
        e0.checkNotNullParameter(map, "map");
        int size = map.size();
        if (size == 1) {
            Map.Entry entry = (Map.Entry) y0.single(map.entrySet());
            return new StringValuesSingleImpl(z10, (String) entry.getKey(), y0.toList((Iterable) entry.getValue()));
        }
        Map mapCaseInsensitiveMap = z10 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(size);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            mapCaseInsensitiveMap.put(entry2.getKey(), y0.toList((Iterable) entry2.getValue()));
        }
        return new StringValuesImpl(z10, mapCaseInsensitiveMap);
    }
}
