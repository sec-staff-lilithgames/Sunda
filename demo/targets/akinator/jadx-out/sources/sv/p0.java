package sv;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import com.moloco.sdk.BKC.KerkSviMAy;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p0.j3;
import p0.o2;
import uu.b2;
import uu.c2;
import uu.f1;
import uu.g1;
import uu.g2;
import uu.h1;
import uu.o1;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p0 extends o0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Iterable, lv.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f86193b;

        public a(CharSequence charSequence) {
            this.f86193b = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return n0.iterator(this.f86193b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements rv.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f86194a;

        public b(CharSequence charSequence) {
            this.f86194a = charSequence;
        }

        @Override // rv.t
        public Iterator<Character> iterator() {
            return n0.iterator(this.f86194a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements f1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f86195a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f86196b;

        public c(CharSequence charSequence, kv.l lVar) {
            this.f86195a = charSequence;
            this.f86196b = lVar;
        }

        @Override // uu.f1
        public /* bridge */ /* synthetic */ Object keyOf(Object obj) {
            return keyOf(((Character) obj).charValue());
        }

        @Override // uu.f1
        public Iterator<Character> sourceIterator() {
            return n0.iterator(this.f86195a);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [K, java.lang.Object] */
        public K keyOf(char c10) {
            return this.f86196b.invoke(Character.valueOf(c10));
        }
    }

    public static final boolean all(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && ((String) charSequence).length() == 0) ? uu.p0.emptyList() : new a(charSequence);
    }

    public static final rv.t asSequence(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && ((String) charSequence).length() == 0) ? rv.y.emptySequence() : new b(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(CharSequence charSequence, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            tu.v vVar = (tu.v) o2.h(charSequence, i10, transform);
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), Character.valueOf(cCharAt));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            tu.v vVar = (tu.v) o2.h(charSequence, i10, transform);
            destination.put(vVar.getFirst(), vVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(qv.v.coerceAtMost(charSequence.length(), 128)), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M destination, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(Character.valueOf(cCharAt), valueSelector.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static List<String> chunked(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i10, i10, true);
    }

    public static final rv.t chunkedSequence(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i10, new f.j0(25));
    }

    public static final int count(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (((Boolean) o2.h(charSequence, i11, predicate)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    public static final CharSequence drop(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, QCmNMSGd.TlTOFaajsafXiR);
        if (i10 >= 0) {
            return charSequence.subSequence(qv.v.coerceAtMost(i10, charSequence.length()), charSequence.length());
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return take(charSequence, qv.v.coerceAtLeast(charSequence.length() - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = n0.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) o2.h(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final CharSequence filter(CharSequence charSequence, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, kv.p predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C destination, kv.p predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            int i12 = i11 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final CharSequence filterNot(CharSequence charSequence, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C destination, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C destination, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                destination.append(cCharAt);
            }
        }
        return destination;
    }

    public static char first(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, TJzY.KWFglESiffawrDR);
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            v0.addAll(arrayList, (Iterable) o2.h(charSequence, i10, transform));
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            v0.addAll(destination, (Iterable) o2.h(charSequence, i10, transform));
        }
        return destination;
    }

    public static final <R> R fold(CharSequence charSequence, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = (R) operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
        }
        return r10;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            r10 = (R) operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        for (int lastIndex = n0.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r10 = (R) operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        for (int lastIndex = n0.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r10 = (R) operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r10);
        }
        return r10;
    }

    public static final void forEach(CharSequence charSequence, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            action.invoke(Character.valueOf(charSequence.charAt(i10)));
        }
    }

    public static final void forEachIndexed(CharSequence charSequence, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            i10++;
            i11++;
        }
    }

    public static final Character getOrNull(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(Character.valueOf(cCharAt));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(Character.valueOf(cCharAt));
        }
        return destination;
    }

    public static final <K> f1 groupingBy(CharSequence charSequence, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        return new c(charSequence, keySelector);
    }

    public static final int indexOfFirst(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (((Boolean) o2.h(charSequence, length, predicate)).booleanValue()) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static char last(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, KerkSviMAy.qgQUvcrZyF);
        if (charSequence.length() != 0) {
            return charSequence.charAt(n0.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final <R> List<R> map(CharSequence charSequence, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            int i12 = i11 + 1;
            Object objInvoke = transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10)));
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(charSequence.charAt(i10))));
            i10++;
            i11++;
        }
        return destination;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objH = o2.h(charSequence, i10, transform);
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Object objH = o2.h(charSequence, i10, transform);
            if (objH != null) {
                destination.add(objH);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i10))));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Character maxByOrNull(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    cCharAt = cCharAt2;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final <R extends Comparable<? super R>> char maxByOrThrow(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                    if (comparable.compareTo(comparable2) < 0) {
                        cCharAt = cCharAt2;
                        comparable = comparable2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    public static final Character maxOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.e0.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char maxOrThrow(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.e0.compare((int) cCharAt, (int) cCharAt2) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final Character maxWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char maxWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) < 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final <R extends Comparable<? super R>> Character minByOrNull(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    cCharAt = cCharAt2;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final <R extends Comparable<? super R>> char minByOrThrow(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex != 0) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(cCharAt));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char cCharAt2 = charSequence.charAt(i10);
                    Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(cCharAt2));
                    if (comparable.compareTo(comparable2) > 0) {
                        cCharAt = cCharAt2;
                        comparable = comparable2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return cCharAt;
    }

    public static final Character minOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.e0.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char minOrThrow(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (kotlin.jvm.internal.e0.compare((int) cCharAt, (int) cCharAt2) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final Character minWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char minWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i10);
                if (comparator.compare(Character.valueOf(cCharAt), Character.valueOf(cCharAt2)) > 0) {
                    cCharAt = cCharAt2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final boolean none(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final <S extends CharSequence> S onEach(S s10, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(s10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        for (int i10 = 0; i10 < s10.length(); i10++) {
            action.invoke(Character.valueOf(s10.charAt(i10)));
        }
        return s10;
    }

    public static final <S extends CharSequence> S onEachIndexed(S s10, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(s10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        int i11 = 0;
        while (i10 < s10.length()) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(s10.charAt(i10)));
            i10++;
            i11++;
        }
        return s10;
    }

    public static final tu.v partition(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new tu.v(sb2, sb3);
    }

    public static final char random(CharSequence charSequence, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character randomOrNull(CharSequence charSequence, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    public static final char reduce(CharSequence charSequence, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = ((Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)))).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final char reduceIndexed(CharSequence charSequence, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = ((Character) operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)))).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cCharAt;
    }

    public static final Character reduceIndexedOrNull(CharSequence charSequence, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = ((Character) operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)))).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final Character reduceOrNull(CharSequence charSequence, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = n0.getLastIndex(charSequence);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharAt = ((Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)))).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    public static final char reduceRight(CharSequence charSequence, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt))).charValue();
        }
        return cCharAt;
    }

    public static final char reduceRightIndexed(CharSequence charSequence, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = ((Character) operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt))).charValue();
        }
        return cCharAt;
    }

    public static final Character reduceRightIndexedOrNull(CharSequence charSequence, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = ((Character) operation.invoke(Integer.valueOf(i10), Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static final Character reduceRightOrNull(CharSequence charSequence, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int lastIndex = n0.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(lastIndex);
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(cCharAt))).charValue();
        }
        return Character.valueOf(cCharAt);
    }

    public static CharSequence reversed(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static final <R> List<R> runningFold(CharSequence charSequence, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = (R) operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final <R> List<R> runningFoldIndexed(CharSequence charSequence, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final List<Character> runningReduce(CharSequence charSequence, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.p0.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character ch2 = (Character) operation.invoke(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = ch2.charValue();
            arrayList.add(ch2);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    public static final List<Character> runningReduceIndexed(CharSequence charSequence, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.p0.emptyList();
        }
        char cCharAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(cCharAt));
        int length = charSequence.length();
        int i10 = 1;
        while (i10 < length) {
            Character ch2 = (Character) operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10)));
            char cCharValue = ch2.charValue();
            arrayList.add(ch2);
            i10++;
            cCharAt = cCharValue;
        }
        return arrayList;
    }

    public static final <R> List<R> scan(CharSequence charSequence, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            r10 = (R) operation.invoke(r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return uu.o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r10);
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(charSequence.charAt(i10)));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static char single(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final CharSequence slice(CharSequence charSequence, qv.m indices) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : n0.subSequence(charSequence, indices);
    }

    @tu.f
    public static final int sumBy(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            iIntValue += ((Number) o2.h(charSequence, i10, selector)).intValue();
        }
        return iIntValue;
    }

    @tu.f
    public static final double sumByDouble(CharSequence charSequence, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            dDoubleValue += ((Number) o2.h(charSequence, i10, selector)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final CharSequence take(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 >= 0) {
            return charSequence.subSequence(0, qv.v.coerceAtMost(i10, charSequence.length()));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
        }
        int length = charSequence.length();
        return charSequence.subSequence(length - qv.v.coerceAtMost(i10, length), length);
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = n0.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) o2.h(charSequence, lastIndex, predicate)).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence takeWhile(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return charSequence.subSequence(0, i10);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            destination.add(Character.valueOf(charSequence.charAt(i10)));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return (HashSet) toCollection(charSequence, new HashSet(o1.mapCapacity(qv.v.coerceAtMost(charSequence.length(), 128))));
    }

    public static final List<Character> toList(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? toMutableList(charSequence) : uu.o0.listOf(Character.valueOf(charSequence.charAt(0))) : uu.p0.emptyList();
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? (Set) toCollection(charSequence, new LinkedHashSet(o1.mapCapacity(qv.v.coerceAtMost(charSequence.length(), 128)))) : b2.setOf(Character.valueOf(charSequence.charAt(0))) : c2.emptySet();
    }

    public static final List<String> windowed(CharSequence charSequence, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i10, i11, z10, new f.j0(23));
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(charSequence, i10, i11, z10);
    }

    public static final rv.t windowedSequence(CharSequence charSequence, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i10, i11, z10, new f.j0(24));
    }

    public static /* synthetic */ rv.t windowedSequence$default(CharSequence charSequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowedSequence(charSequence, i10, i11, z10);
    }

    public static final Iterable<g1> withIndex(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return new h1(new o6.v0(charSequence, 7));
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence other, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    public static final <R> List<R> zipWithNext(CharSequence charSequence, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            i10++;
            arrayList.add(transform.invoke(chValueOf, Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    public static final boolean any(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> List<R> chunked(CharSequence charSequence, int i10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i10, i10, true, transform);
    }

    public static final <R> rv.t chunkedSequence(CharSequence charSequence, int i10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i10, i10, true, transform);
    }

    public static final Character firstOrNull(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
        }
        return null;
    }

    public static final Character lastOrNull(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char cCharAt = charSequence.charAt(length);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return Character.valueOf(cCharAt);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final boolean none(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (((Boolean) o2.h(charSequence, i10, predicate)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final Character singleOrNull(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(cCharAt);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    public static final <R> List<R> windowed(CharSequence charSequence, int i10, int i11, boolean z10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        g2.checkWindowSizeStep(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i10, int i11, boolean z10, kv.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(charSequence, i10, i11, z10, lVar);
    }

    public static final <R> rv.t windowedSequence(CharSequence charSequence, int i10, int i11, boolean z10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        g2.checkWindowSizeStep(i10, i11);
        return rv.f0.map(y0.asSequence(qv.v.step(z10 ? n0.getIndices(charSequence) : qv.v.until(0, (charSequence.length() - i10) + 1), i11)), new j3(charSequence, i10, transform));
    }

    public static /* synthetic */ rv.t windowedSequence$default(CharSequence charSequence, int i10, int i11, boolean z10, kv.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowedSequence(charSequence, i10, i11, z10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            destination.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static final String filterNot(String str, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static final String slice(String str, qv.m indices) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : n0.substring(str, indices);
    }

    public static final String filterIndexed(String str, kv.p predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i12 = i11 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i11), Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        return sb2.toString();
    }

    public static final char first(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                return cCharAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char cCharAt = charSequence.charAt(length);
                if (!((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    return cCharAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final List<tu.v> zip(CharSequence charSequence, CharSequence other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(tu.e0.to(Character.valueOf(charSequence.charAt(i10)), Character.valueOf(other.charAt(i10))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(charSequence.length()), 16));
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(cCharAt)), valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static final String filter(String str, kv.l predicate) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static final char single(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                if (!z10) {
                    chValueOf = Character.valueOf(cCharAt);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z10) {
            kotlin.jvm.internal.e0.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
            return chValueOf.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> indices) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = uu.q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb2.append(charSequence.charAt(it.next().intValue()));
        }
        return sb2;
    }

    public static final List<tu.v> zipWithNext(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            i10++;
            arrayList.add(tu.e0.to(Character.valueOf(cCharAt), Character.valueOf(charSequence.charAt(i10))));
        }
        return arrayList;
    }

    public static final tu.v partition(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (((Boolean) predicate.invoke(Character.valueOf(cCharAt))).booleanValue()) {
                sb2.append(cCharAt);
            } else {
                sb3.append(cCharAt);
            }
        }
        return new tu.v(sb2.toString(), sb3.toString());
    }

    public static final String dropLastWhile(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = n0.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String strSubstring = str.substring(0, lastIndex + 1);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final String dropWhile(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i10)))).booleanValue()) {
                String strSubstring = str.substring(i10);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    public static final String takeLastWhile(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = n0.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String strSubstring = str.substring(lastIndex + 1);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static final String takeWhile(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i10)))).booleanValue()) {
                String strSubstring = str.substring(0, i10);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return str;
    }

    public static String drop(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(qv.v.coerceAtMost(i10, str.length()));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static String dropLast(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            return take(str, qv.v.coerceAtLeast(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return destination;
    }

    public static String take(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, qv.v.coerceAtMost(i10, str.length()));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }

    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            Object objInvoke = keySelector.invoke(Character.valueOf(cCharAt));
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(valueTransform.invoke(Character.valueOf(cCharAt)));
        }
        return linkedHashMap;
    }

    public static String takeLast(String str, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - qv.v.coerceAtMost(i10, length));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested character count ", " is less than zero.").toString());
    }
}
