package com.applovin.shadow.okhttp3;

import a.b;
import b0.e2;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import dv.d;
import j$.time.Instant;
import j$.util.DateRetargetClass;
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
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import lv.a;
import sv.k0;
import sv.n0;
import tu.f;
import tu.v;
import uu.p0;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Headers implements Iterable<v>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String line) {
            e0.checkNotNullParameter(line, "line");
            int iIndexOf$default = n0.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException(b.k("Unexpected header: ", line).toString());
            }
            String strSubstring = line.substring(0, iIndexOf$default);
            e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = n0.trim(strSubstring).toString();
            String strSubstring2 = line.substring(iIndexOf$default + 1);
            e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            e0.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                addLenient$okhttp(headers.name(i10), headers.value(i10));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String line) {
            e0.checkNotNullParameter(line, "line");
            int iIndexOf$default = n0.indexOf$default((CharSequence) line, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                addLenient$okhttp("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String name) {
            e0.checkNotNullParameter(name, "name");
            int size = this.namesAndValues.size() - 2;
            int progressionLastElement = d.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (!k0.equals(name, this.namesAndValues.get(size), true)) {
                if (size == progressionLastElement) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String name) {
            e0.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (k0.equals(name, this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder set(String name, Date value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder set(String name, Instant value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            return set(name, new Date(value.toEpochMilli()));
        }

        public final Builder set(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String value) {
            e0.checkNotNullParameter(str, NyKZx.yQKxwHUB);
            e0.checkNotNullParameter(value, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(n0.trim(value).toString());
            return this;
        }

        public final Builder add(String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        public final Builder add(String name, Date value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        public final Builder add(String name, Instant value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            add(name, new Date(value.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                    sb2.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int progressionLastElement = d.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (!k0.equals(str, strArr[length], true)) {
                if (length == progressionLastElement) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m261deprecated_of(String... namesAndValues) {
            e0.checkNotNullParameter(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final Headers of(String... namesAndValues) {
            e0.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = n0.trim(str).toString();
            }
            int progressionLastElement = d.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i10 == progressionLastElement) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }

        @f
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m260deprecated_of(Map<String, String> headers) {
            e0.checkNotNullParameter(headers, "headers");
            return of(headers);
        }

        public final Headers of(Map<String, String> map) {
            e0.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = n0.trim(key).toString();
                String string2 = n0.trim(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, u uVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    @f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m259deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            length += this.namesAndValues[i10].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String name) {
        e0.checkNotNullParameter(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    public final Date getDate(String name) {
        e0.checkNotNullParameter(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String name) {
        e0.checkNotNullParameter(name, "name");
        Date date = getDate(name);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<v> iterator() {
        int size = size();
        v[] vVarArr = new v[size];
        for (int i10 = 0; i10 < size; i10++) {
            vVarArr[i10] = tu.e0.to(name(i10), value(i10));
        }
        return i.iterator(vVarArr);
    }

    public final String name(int i10) {
        return this.namesAndValues[i10 * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(k0.getCASE_INSENSITIVE_ORDER(g1.f71834a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(name(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        v0.addAll(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(k0.getCASE_INSENSITIVE_ORDER(g1.f71834a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            Locale locale = Locale.US;
            String strP = e2.p(locale, "US", strName, locale, "this as java.lang.String).toLowerCase(locale)");
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
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = name(i10);
            String strValue = value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i10) {
        return this.namesAndValues[(i10 * 2) + 1];
    }

    public final List<String> values(String name) {
        e0.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (k0.equals(name, name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i10));
            }
        }
        if (arrayList == null) {
            return p0.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        e0.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
