package xv;

import b0.e2;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.DesugarDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.g1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 implements Iterable, lv.a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f93621c = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f93622e = new f0(new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public final String[] f93623b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f93624a = new ArrayList(20);

        public final a add(String line) {
            kotlin.jvm.internal.e0.checkNotNullParameter(line, "line");
            int iIndexOf$default = sv.n0.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException(a.b.k("Unexpected header: ", line).toString());
            }
            String strSubstring = line.substring(0, iIndexOf$default);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String string = sv.n0.trim(strSubstring).toString();
            String strSubstring2 = line.substring(iIndexOf$default + 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            add(string, strSubstring2);
            return this;
        }

        public final a addAll(f0 headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            return yv.e.commonAddAll(this, headers);
        }

        public final a addLenient$okhttp(String line) {
            kotlin.jvm.internal.e0.checkNotNullParameter(line, "line");
            int iIndexOf$default = sv.n0.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final a addUnsafeNonAscii(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            yv.e.headersCheckName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final f0 build() {
            return yv.e.commonBuild(this);
        }

        public final String get(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            return yv.e.commonGet(this, name);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.f93624a;
        }

        public final a removeAll(String name) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            return yv.e.commonRemoveAll(this, name);
        }

        public final a set(String name, Date value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return set(name, dw.e.toHttpDateString(value));
        }

        public final a set(String name, Instant value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            Date dateFrom = DesugarDate.from(value);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(dateFrom, "from(...)");
            return set(name, dateFrom);
        }

        public final a set(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return yv.e.commonSet(this, name, value);
        }

        public final a addLenient$okhttp(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return yv.e.commonAddLenient(this, name, value);
        }

        public final a add(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return yv.e.commonAdd(this, name, value);
        }

        public final a add(String name, Date value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            return add(name, dw.e.toHttpDateString(value));
        }

        public final a add(String name, Instant value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            Date dateFrom = DesugarDate.from(value);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(dateFrom, "from(...)");
            return add(name, dateFrom);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final f0 m7893deprecated_of(String... namesAndValues) {
            kotlin.jvm.internal.e0.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final f0 of(String... namesAndValues) {
            kotlin.jvm.internal.e0.checkNotNullParameter(namesAndValues, "namesAndValues");
            return yv.e.commonHeadersOf((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @tu.f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final f0 m7892deprecated_of(Map<String, String> headers) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        public final f0 of(Map<String, String> map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "<this>");
            return yv.e.commonToHeaders(map);
        }
    }

    public f0(String[] namesAndValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(namesAndValues, "namesAndValues");
        this.f93623b = namesAndValues;
    }

    public static final f0 of(Map<String, String> map) {
        return f93621c.of(map);
    }

    @tu.f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m7891deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.f93623b;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += str.length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return yv.e.commonEquals(this, obj);
    }

    public final String get(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return yv.e.commonHeadersGet(this.f93623b, name);
    }

    public final Date getDate(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str != null) {
            return dw.e.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public final String[] getNamesAndValues$okhttp() {
        return this.f93623b;
    }

    public int hashCode() {
        return yv.e.commonHashCode(this);
    }

    @Override // java.lang.Iterable
    public Iterator<tu.v> iterator() {
        return yv.e.commonIterator(this);
    }

    public final String name(int i10) {
        return yv.e.commonName(this, i10);
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(sv.k0.getCASE_INSENSITIVE_ORDER(g1.f71834a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final a newBuilder() {
        return yv.e.commonNewBuilder(this);
    }

    public final int size() {
        return this.f93623b.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(sv.k0.getCASE_INSENSITIVE_ORDER(g1.f71834a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            String strP = e2.p(locale, "US", strName, locale, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(strP);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strP, arrayList);
            }
            arrayList.add(value(i10));
        }
        return treeMap;
    }

    public String toString() {
        return yv.e.commonToString(this);
    }

    public final String value(int i10) {
        return yv.e.commonValue(this, i10);
    }

    public final List<String> values(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return yv.e.commonValues(this, name);
    }

    public static final f0 of(String... strArr) {
        return f93621c.of(strArr);
    }
}
