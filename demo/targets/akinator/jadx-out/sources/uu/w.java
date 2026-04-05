package uu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w extends v {
    public static final void a(Object[] objArr, StringBuilder sb2, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (obj instanceof Object[]) {
                a((Object[]) obj, sb2, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string8, "toString(...)");
                sb2.append(string8);
            } else if (obj instanceof tu.i0) {
                sb2.append(wu.f.m7616contentToString2csIQuQ(((tu.i0) obj).m7054unboximpl()));
            } else if (obj instanceof tu.v0) {
                sb2.append(wu.f.m7618contentToStringd6D3K8(((tu.v0) obj).m7129unboximpl()));
            } else if (obj instanceof tu.m0) {
                sb2.append(wu.f.m7617contentToStringXUkPCBk(((tu.m0) obj).m7079unboximpl()));
            } else if (obj instanceof tu.q0) {
                sb2.append(wu.f.m7619contentToStringuLth9ew(((tu.q0) obj).m7104unboximpl()));
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        arrayList.remove(p0.getLastIndex(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof tu.i0) && (objArr2 instanceof tu.i0)) {
                    if (!wu.f.m7610contentEqualskV0jMPg(((tu.i0) objArr).m7054unboximpl(), ((tu.i0) objArr2).m7054unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof tu.v0) && (objArr2 instanceof tu.v0)) {
                    if (!wu.f.m7608contentEqualsFGO6Aew(((tu.v0) objArr).m7129unboximpl(), ((tu.v0) objArr2).m7129unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof tu.m0) && (objArr2 instanceof tu.m0)) {
                    if (!wu.f.m7609contentEqualsKJPZfPQ(((tu.m0) objArr).m7079unboximpl(), ((tu.m0) objArr2).m7079unboximpl())) {
                        return false;
                    }
                } else if ((objArr instanceof tu.q0) && (objArr2 instanceof tu.q0)) {
                    if (!wu.f.m7611contentEqualslec5QzE(((tu.q0) objArr).m7104unboximpl(), ((tu.q0) objArr2).m7104unboximpl())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.e0.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T> String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb2 = new StringBuilder((qv.v.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        a(tArr, sb2, new ArrayList());
        return sb2.toString();
    }

    public static final <T> List<T> flatten(T[][] tArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            v0.addAll(arrayList, tArr3);
        }
        return arrayList;
    }

    public static final <T, R> tu.v unzip(tu.v[] vVarArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVarArr, "<this>");
        ArrayList arrayList = new ArrayList(vVarArr.length);
        ArrayList arrayList2 = new ArrayList(vVarArr.length);
        for (tu.v vVar : vVarArr) {
            arrayList.add(vVar.getFirst());
            arrayList2.add(vVar.getSecond());
        }
        return tu.e0.to(arrayList, arrayList2);
    }
}
