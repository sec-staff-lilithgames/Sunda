package hw;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.g;
import pw.l;
import qv.k;
import qv.v;
import sv.f;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f59270a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final l f59271b = l.f81911f.encodeUtf8("xn--");

    public static int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED : i10 / 2;
        int i13 = (i12 / i11) + i12;
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return ((i13 * 36) / (i13 + 38)) + i14;
    }

    public static int b(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    public final String decode(String str) {
        int i10;
        int i11;
        int i12;
        String string = str;
        e0.checkNotNullParameter(string, "string");
        int length = string.length();
        g gVar = new g();
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13;
            int iIndexOf$default = n0.indexOf$default((CharSequence) string, '.', i14, false, 4, (Object) null);
            int i15 = iIndexOf$default == -1 ? length : iIndexOf$default;
            string = str;
            if (k0.regionMatches(string, i14, "xn--", 0, 4, true)) {
                int i16 = i14 + 4;
                ArrayList arrayList = new ArrayList();
                i10 = i15;
                int iLastIndexOf$default = n0.lastIndexOf$default((CharSequence) string, '-', i10, false, 4, (Object) null);
                char c10 = AbstractJsonLexerKt.BEGIN_LIST;
                char c11 = AbstractJsonLexerKt.BEGIN_OBJ;
                char c12 = 'A';
                if (iLastIndexOf$default >= i16) {
                    while (i16 < iLastIndexOf$default) {
                        int i17 = i16 + 1;
                        char cCharAt = string.charAt(i16);
                        if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                            return null;
                        }
                        arrayList.add(Integer.valueOf(cCharAt));
                        i16 = i17;
                    }
                    i16++;
                }
                int i18 = 128;
                int iA = 72;
                int i19 = 0;
                while (i16 < i10) {
                    k kVarStep = v.step(v.until(36, Integer.MAX_VALUE), 36);
                    int first = kVarStep.getFirst();
                    int last = kVarStep.getLast();
                    int step = kVarStep.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i11 = i19;
                        int i20 = 1;
                        while (i16 != i10) {
                            int i21 = i16 + 1;
                            char cCharAt2 = string.charAt(i16);
                            if ('a' <= cCharAt2 && cCharAt2 < c11) {
                                i12 = cCharAt2 - 'a';
                            } else if (c12 <= cCharAt2 && cCharAt2 < c10) {
                                i12 = cCharAt2 - 'A';
                            } else {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    return null;
                                }
                                i12 = cCharAt2 - 22;
                            }
                            int i22 = i20;
                            int i23 = i12 * i22;
                            int i24 = i11;
                            if (i24 > Integer.MAX_VALUE - i23) {
                                return null;
                            }
                            i11 = i24 + i23;
                            int i25 = first <= iA ? 1 : first >= iA + 26 ? 26 : first - iA;
                            if (i12 >= i25) {
                                int i26 = 36 - i25;
                                if (i22 > Integer.MAX_VALUE / i26) {
                                    return null;
                                }
                                i20 = i22 * i26;
                                if (first != last) {
                                    first += step;
                                    i16 = i21;
                                    c10 = AbstractJsonLexerKt.BEGIN_LIST;
                                    c11 = AbstractJsonLexerKt.BEGIN_OBJ;
                                    c12 = 'A';
                                }
                            }
                            i16 = i21;
                        }
                        return null;
                    }
                    i11 = i19;
                    iA = a(i11 - i19, arrayList.size() + 1, i19 == 0);
                    int size = i11 / (arrayList.size() + 1);
                    if (i18 > Integer.MAX_VALUE - size) {
                        return null;
                    }
                    i18 += size;
                    int size2 = i11 % (arrayList.size() + 1);
                    if (i18 > 1114111) {
                        return null;
                    }
                    arrayList.add(size2, Integer.valueOf(i18));
                    i19 = size2 + 1;
                    c10 = AbstractJsonLexerKt.BEGIN_LIST;
                    c11 = AbstractJsonLexerKt.BEGIN_OBJ;
                    c12 = 'A';
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    gVar.writeUtf8CodePoint(((Number) it.next()).intValue());
                }
            } else {
                gVar.writeUtf8(string, i14, i15);
                i10 = i15;
            }
            if (i10 >= length) {
                break;
            }
            gVar.writeByte(46);
            i13 = i10 + 1;
        }
        return gVar.readUtf8();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4, types: [char] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final String encode(String string) {
        int i10;
        e0.checkNotNullParameter(string, "string");
        int length = string.length();
        g gVar = new g();
        int i11 = 0;
        while (i11 < length) {
            int iIndexOf$default = n0.indexOf$default((CharSequence) string, '.', i11, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = length;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= iIndexOf$default) {
                    gVar.writeUtf8(string, i11, iIndexOf$default);
                    break;
                }
                int i13 = 128;
                if (string.charAt(i12) >= 128) {
                    gVar.write(f59271b);
                    ArrayList arrayList = new ArrayList();
                    while (i11 < iIndexOf$default) {
                        int iCharAt = string.charAt(i11);
                        if (f.isSurrogate(iCharAt)) {
                            int i14 = i11 + 1;
                            char cCharAt = i14 < iIndexOf$default ? string.charAt(i14) : (char) 0;
                            if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                                iCharAt = 63;
                            } else {
                                iCharAt = C.DEFAULT_BUFFER_SEGMENT_SIZE + (((iCharAt & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) << 10) | (cCharAt & 1023));
                                i11 = i14;
                            }
                        }
                        arrayList.add(Integer.valueOf(iCharAt));
                        i11++;
                    }
                    Iterator it = arrayList.iterator();
                    int i15 = 0;
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        if (iIntValue < 128) {
                            gVar.writeByte(iIntValue);
                            i15++;
                        }
                    }
                    if (i15 > 0) {
                        gVar.writeByte(45);
                    }
                    int iA = 72;
                    int i16 = i15;
                    int i17 = 0;
                    while (i16 < arrayList.size()) {
                        Iterator it2 = arrayList.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it2.next();
                        int i18 = Integer.MAX_VALUE;
                        if (it2.hasNext()) {
                            int iIntValue2 = ((Number) next).intValue();
                            if (iIntValue2 < i13) {
                                iIntValue2 = Integer.MAX_VALUE;
                            }
                            do {
                                Object next2 = it2.next();
                                int iIntValue3 = ((Number) next2).intValue();
                                if (iIntValue3 < i13) {
                                    iIntValue3 = Integer.MAX_VALUE;
                                }
                                if (iIntValue2 > iIntValue3) {
                                    iIntValue2 = iIntValue3;
                                    next = next2;
                                }
                            } while (it2.hasNext());
                        }
                        int iIntValue4 = ((Number) next).intValue();
                        int i19 = (i16 + 1) * (iIntValue4 - i13);
                        if (i17 > Integer.MAX_VALUE - i19) {
                            return null;
                        }
                        int i20 = i17 + i19;
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            int iIntValue5 = ((Number) it3.next()).intValue();
                            if (iIntValue5 < iIntValue4) {
                                if (i20 == i18) {
                                    return null;
                                }
                                i20++;
                            } else if (iIntValue5 == iIntValue4) {
                                k kVarStep = v.step(v.until(36, i18), 36);
                                int first = kVarStep.getFirst();
                                int last = kVarStep.getLast();
                                int step = kVarStep.getStep();
                                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                                    i10 = i20;
                                    while (true) {
                                        int i21 = first <= iA ? 1 : first >= iA + 26 ? 26 : first - iA;
                                        if (i10 < i21) {
                                            break;
                                        }
                                        int i22 = i10 - i21;
                                        int i23 = 36 - i21;
                                        gVar.writeByte(b((i22 % i23) + i21));
                                        i10 = i22 / i23;
                                        if (first == last) {
                                            break;
                                        }
                                        first += step;
                                    }
                                } else {
                                    i10 = i20;
                                }
                                gVar.writeByte(b(i10));
                                int i24 = i16 + 1;
                                boolean z10 = i16 == i15;
                                i16 = i24;
                                iA = a(i20, i24, z10);
                                i20 = 0;
                                i18 = Integer.MAX_VALUE;
                            }
                        }
                        i17 = i20 + 1;
                        i13 = iIntValue4 + 1;
                    }
                } else {
                    i12++;
                }
            }
            if (iIndexOf$default >= length) {
                break;
            }
            gVar.writeByte(46);
            i11 = iIndexOf$default + 1;
        }
        return gVar.readUtf8();
    }

    public final l getPREFIX() {
        return f59271b;
    }

    public final String getPREFIX_STRING() {
        return "xn--";
    }
}
