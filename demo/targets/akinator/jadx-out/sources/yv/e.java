package yv;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import b0.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.k0;
import sv.n0;
import tu.v;
import uu.p0;
import uu.v0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e {
    public static final f0.a commonAdd(f0.a aVar, String name, String value) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        commonAddLenient(aVar, name, value);
        return aVar;
    }

    public static final f0.a commonAddAll(f0.a aVar, f0 headers) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            commonAddLenient(aVar, headers.name(i10), headers.value(i10));
        }
        return aVar;
    }

    public static final f0.a commonAddLenient(f0.a aVar, String name, String value) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        aVar.getNamesAndValues$okhttp().add(name);
        aVar.getNamesAndValues$okhttp().add(n0.trim(value).toString());
        return aVar;
    }

    public static final f0 commonBuild(f0.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        return new f0((String[]) aVar.getNamesAndValues$okhttp().toArray(new String[0]));
    }

    public static final boolean commonEquals(f0 f0Var, Object obj) {
        e0.checkNotNullParameter(f0Var, "<this>");
        return (obj instanceof f0) && Arrays.equals(f0Var.getNamesAndValues$okhttp(), ((f0) obj).getNamesAndValues$okhttp());
    }

    public static final String commonGet(f0.a aVar, String name) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        int size = aVar.getNamesAndValues$okhttp().size() - 2;
        int progressionLastElement = dv.d.getProgressionLastElement(size, 0, -2);
        if (progressionLastElement > size) {
            return null;
        }
        while (!k0.equals(name, aVar.getNamesAndValues$okhttp().get(size), true)) {
            if (size == progressionLastElement) {
                return null;
            }
            size -= 2;
        }
        return aVar.getNamesAndValues$okhttp().get(size + 1);
    }

    public static final int commonHashCode(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, "<this>");
        return Arrays.hashCode(f0Var.getNamesAndValues$okhttp());
    }

    public static final String commonHeadersGet(String[] namesAndValues, String name) {
        e0.checkNotNullParameter(namesAndValues, "namesAndValues");
        e0.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int progressionLastElement = dv.d.getProgressionLastElement(length, 0, -2);
        if (progressionLastElement > length) {
            return null;
        }
        while (!k0.equals(name, namesAndValues[length], true)) {
            if (length == progressionLastElement) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final f0 commonHeadersOf(String... inputNamesAndValues) {
        e0.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = n0.trim(inputNamesAndValues[i11]).toString();
        }
        int progressionLastElement = dv.d.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                headersCheckName(str);
                headersCheckValue(str2, str);
                if (i10 == progressionLastElement) {
                    break;
                }
                i10 += 2;
            }
        }
        return new f0(strArr);
    }

    public static final Iterator<v> commonIterator(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, "<this>");
        int size = f0Var.size();
        v[] vVarArr = new v[size];
        for (int i10 = 0; i10 < size; i10++) {
            vVarArr[i10] = tu.e0.to(f0Var.name(i10), f0Var.value(i10));
        }
        return kotlin.jvm.internal.i.iterator(vVarArr);
    }

    public static final String commonName(f0 f0Var, int i10) {
        e0.checkNotNullParameter(f0Var, "<this>");
        String str = (String) uu.k0.getOrNull(f0Var.getNamesAndValues$okhttp(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(e2.h(AbstractJsonLexerKt.END_LIST, "name[", i10));
    }

    public static final f0.a commonRemoveAll(f0.a aVar, String name) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        int i10 = 0;
        while (i10 < aVar.getNamesAndValues$okhttp().size()) {
            if (k0.equals(name, aVar.getNamesAndValues$okhttp().get(i10), true)) {
                aVar.getNamesAndValues$okhttp().remove(i10);
                aVar.getNamesAndValues$okhttp().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final f0.a commonSet(f0.a aVar, String name, String value) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        headersCheckName(name);
        headersCheckValue(value, name);
        aVar.removeAll(name);
        commonAddLenient(aVar, name, value);
        return aVar;
    }

    public static final f0 commonToHeaders(Map<String, String> map) {
        e0.checkNotNullParameter(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = n0.trim(key).toString();
            String string2 = n0.trim(value).toString();
            headersCheckName(string);
            headersCheckValue(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        return new f0(strArr);
    }

    public static final String commonToString(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = f0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strName = f0Var.name(i10);
            String strValue = f0Var.value(i10);
            sb2.append(strName);
            sb2.append(": ");
            if (h.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final String commonValue(f0 f0Var, int i10) {
        e0.checkNotNullParameter(f0Var, "<this>");
        String str = (String) uu.k0.getOrNull(f0Var.getNamesAndValues$okhttp(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(e2.h(AbstractJsonLexerKt.END_LIST, "value[", i10));
    }

    public static final List<String> commonValues(f0 f0Var, String name) {
        e0.checkNotNullParameter(f0Var, "<this>");
        e0.checkNotNullParameter(name, "name");
        int size = f0Var.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (k0.equals(name, f0Var.name(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f0Var.value(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? p0.emptyList() : listUnmodifiableList;
    }

    public static final void headersCheckName(String name) {
        e0.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, sv.e.checkRadix(16));
                e0.checkNotNullExpressionValue(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in header name: ");
                sb2.append(name);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final void headersCheckValue(String value, String name) {
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, sv.e.checkRadix(16));
                e0.checkNotNullExpressionValue(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb2.append(string);
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(h.isSensitiveHeader(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static final f0.a commonNewBuilder(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, OIPXcgrVyyxoLF.PBENIvBTfMJW);
        f0.a aVar = new f0.a();
        v0.addAll(aVar.getNamesAndValues$okhttp(), f0Var.getNamesAndValues$okhttp());
        return aVar;
    }
}
