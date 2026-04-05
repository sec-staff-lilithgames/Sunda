package sv;

import be.nVUQ.UupKET;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p0.o2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n0 extends k0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements rv.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f86190a;

        public a(CharSequence charSequence) {
            this.f86190a = charSequence;
        }

        @Override // rv.t
        public Iterator<String> iterator() {
            return new n(this.f86190a);
        }
    }

    public static final tu.v b(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (z10 || collection.size() != 1) {
            CharSequence charSequence3 = charSequence;
            qv.k mVar = !z11 ? new qv.m(qv.v.coerceAtLeast(i10, 0), charSequence3.length()) : qv.v.downTo(qv.v.coerceAtMost(i10, getLastIndex(charSequence3)), 0);
            if (charSequence3 instanceof String) {
                int first = mVar.getFirst();
                int last = mVar.getLast();
                int step = mVar.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    int i11 = first;
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z12 = z10;
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            String str = (String) next2;
                            z12 = z10;
                            if (k0.regionMatches(str, 0, (String) charSequence3, i11, str.length(), z12)) {
                                break;
                            }
                            z10 = z12;
                        }
                        String str2 = (String) next2;
                        if (str2 == null) {
                            if (i11 == last) {
                                break;
                            }
                            i11 += step;
                            z10 = z12;
                        } else {
                            return tu.e0.to(Integer.valueOf(i11), str2);
                        }
                    }
                }
            } else {
                boolean z13 = z10;
                int first2 = mVar.getFirst();
                int last2 = mVar.getLast();
                int step2 = mVar.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    int i12 = first2;
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                charSequence2 = charSequence3;
                                next = null;
                                break;
                            }
                            next = it2.next();
                            String str3 = (String) next;
                            boolean z14 = z13;
                            charSequence2 = charSequence3;
                            z13 = z14;
                            if (regionMatchesImpl(str3, 0, charSequence2, i12, str3.length(), z14)) {
                                break;
                            }
                            charSequence3 = charSequence2;
                        }
                        String str4 = (String) next;
                        if (str4 == null) {
                            if (i12 == last2) {
                                break;
                            }
                            i12 += step2;
                            charSequence3 = charSequence2;
                        } else {
                            return tu.e0.to(Integer.valueOf(i12), str4);
                        }
                    }
                }
            }
        } else {
            String str5 = (String) y0.single(collection);
            int iIndexOf$default = !z11 ? indexOf$default(charSequence, str5, i10, false, 4, (Object) null) : lastIndexOf$default(charSequence, str5, i10, false, 4, (Object) null);
            if (iIndexOf$default >= 0) {
                return tu.e0.to(Integer.valueOf(iIndexOf$default), str5);
            }
        }
        return null;
    }

    public static final int c(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        qv.k mVar = !z11 ? new qv.m(qv.v.coerceAtLeast(i10, 0), qv.v.coerceAtMost(i11, charSequence.length())) : qv.v.downTo(qv.v.coerceAtMost(i10, getLastIndex(charSequence)), qv.v.coerceAtLeast(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = mVar.getFirst();
            int last = mVar.getLast();
            int step = mVar.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            int i12 = first;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (k0.regionMatches(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == last) {
                    return -1;
                }
                i12 += step;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int first2 = mVar.getFirst();
            int last2 = mVar.getLast();
            int step2 = mVar.getStep();
            if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
                return -1;
            }
            int i13 = first2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (regionMatchesImpl(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == last2) {
                    return -1;
                }
                i13 += step2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static final String commonPrefixWith(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i10 = 0;
        while (i10 < iMin && f.equals(charSequence.charAt(i10), other.charAt(i10), z10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (hasSurrogatePairAt(charSequence, i11) || hasSurrogatePairAt(other, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z10);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, other.length());
        int i10 = 0;
        while (i10 < iMin && f.equals(charSequence.charAt((length - i10) - 1), other.charAt((r1 - i10) - 1), z10)) {
            i10++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i10) - 1) || hasSurrogatePairAt(other, (r1 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z10);
    }

    public static boolean contains(CharSequence charSequence, CharSequence other, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return other instanceof String ? indexOf$default(charSequence, (String) other, 0, z10, 2, (Object) null) >= 0 : c(charSequence, other, 0, charSequence.length(), z10, false) >= 0;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return contains(charSequence, charSequence2, z10);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return k0.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!f.equals(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.e0.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static i d(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        requireNonNegativeLimit(i10);
        return new i(charSequence, 0, i10, new kotlinx.coroutines.b(cArr, z10, 1));
    }

    public static i e(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        requireNonNegativeLimit(i10);
        return new i(charSequence, 0, i10, new kotlinx.coroutines.b(uu.f0.asList(strArr), z10, 2));
    }

    public static final boolean endsWith(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && f.equals(charSequence.charAt(getLastIndex(charSequence)), c10, z10);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return endsWith(charSequence, c10, z10);
    }

    public static final List f(CharSequence charSequence, String str, int i10, boolean z10) {
        requireNonNegativeLimit(i10);
        int length = 0;
        int iIndexOf = indexOf(charSequence, str, 0, z10);
        if (iIndexOf == -1 || i10 == 1) {
            return uu.o0.listOf(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? qv.v.coerceAtMost(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
            length = str.length() + iIndexOf;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iIndexOf = indexOf(charSequence, str, length, z10);
        } while (iIndexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final tu.v findAnyOf(CharSequence charSequence, Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(strings, "strings");
        return b(charSequence, strings, i10, z10, false);
    }

    public static /* synthetic */ tu.v findAnyOf$default(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return findAnyOf(charSequence, collection, i10, z10);
    }

    public static final tu.v findLastAnyOf(CharSequence charSequence, Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(strings, "strings");
        return b(charSequence, strings, i10, z10, true);
    }

    public static /* synthetic */ tu.v findLastAnyOf$default(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return findLastAnyOf(charSequence, collection, i10, z10);
    }

    public static qv.m getIndices(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return new qv.m(0, charSequence.length() - 1);
    }

    public static int getLastIndex(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    public static final int indexOf(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return indexOf(charSequence, c10, i10, z10);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(uu.k0.single(chars), i10);
        }
        int iCoerceAtLeast = qv.v.coerceAtLeast(i10, 0);
        int lastIndex = getLastIndex(charSequence);
        if (iCoerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iCoerceAtLeast);
            for (char c10 : chars) {
                if (f.equals(c10, cCharAt, z10)) {
                    return iCoerceAtLeast;
                }
            }
            if (iCoerceAtLeast == lastIndex) {
                return -1;
            }
            iCoerceAtLeast++;
        }
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return indexOfAny(charSequence, cArr, i10, z10);
    }

    public static boolean isBlank(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!e.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final uu.n0 iterator(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return new m0(charSequence);
    }

    public static final int lastIndexOf(CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return lastIndexOf(charSequence, c10, i10, z10);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(uu.k0.single(chars), i10);
        }
        for (int iCoerceAtMost = qv.v.coerceAtMost(i10, getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            for (char c10 : chars) {
                if (f.equals(c10, cCharAt, z10)) {
                    return iCoerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return lastIndexOfAny(charSequence, cArr, i10, z10);
    }

    public static rv.t lineSequence(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    public static List<String> lines(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return rv.f0.toList(lineSequence(charSequence));
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return sb2;
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return padEnd(charSequence, i10, c10);
    }

    public static final CharSequence padStart(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Desired length ", " is less than zero."));
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return padStart(charSequence, i10, c10);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!f.equals(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return startsWith$default(charSequence, prefix, false, 2, (Object) null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(o2.i(i11, i10, "End index (", ") is less than start index (", ")."));
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(charSequence, i11, charSequence.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return endsWith$default(charSequence, suffix, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return (charSequence.length() >= suffix.length() + prefix.length() && startsWith$default(charSequence, prefix, false, 2, (Object) null) && endsWith$default(charSequence, suffix, false, 2, (Object) null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String replaceAfter(String str, char c10, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iIndexOf$default + 1, str.length(), replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c10, str2, str3);
    }

    public static final String replaceAfterLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, delimiter.length() + iLastIndexOf$default, str.length(), replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, char c10, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c10, str2, str3);
    }

    public static final String replaceBeforeLast(String str, char c10, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iLastIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c10, str2, str3);
    }

    public static final CharSequence replaceRange(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(o2.i(i11, i10, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(replacement);
        sb2.append(charSequence, i11, charSequence.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        return sb2;
    }

    public static final void requireNonNegativeLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List<String> split(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return f(charSequence, str, i10, z10);
            }
        }
        Iterable iterableAsIterable = rv.f0.asIterable(e(charSequence, delimiters, z10, i10));
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (qv.m) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return split(charSequence, strArr, z10, i10);
    }

    public static final rv.t splitToSequence(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiters, "delimiters");
        return rv.f0.map(e(charSequence, delimiters, z10, i10), new l0(charSequence, 1));
    }

    public static /* synthetic */ rv.t splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return splitToSequence(charSequence, strArr, z10, i10);
    }

    public static final boolean startsWith(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && f.equals(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return startsWith(charSequence, c10, z10);
    }

    public static final CharSequence subSequence(CharSequence charSequence, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static String substring(String str, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String substringAfter(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c10, str2);
    }

    public static String substringAfterLast(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c10, str2);
    }

    public static final String substringBefore(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c10, str2);
    }

    public static final String substringBeforeLast(String str, char c10, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c10, str2);
    }

    public static Boolean toBooleanStrictOrNull(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.e0.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.e0.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence trim(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = ((Boolean) o2.h(charSequence, !z10 ? i10 : length, predicate)).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!((Boolean) o2.h(charSequence, length, predicate)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, kv.l predicate) {
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

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return contains(charSequence, c10, z10);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? k0.endsWith$default((String) charSequence, (String) suffix, false, 2, null) : regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return endsWith(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return indexOf(charSequence, str, i10, z10);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i10, z10);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return lastIndexOf(charSequence, str, i10, z10);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = getLastIndex(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i10, z10);
    }

    public static /* synthetic */ String padEnd$default(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return padEnd(str, i10, c10);
    }

    public static /* synthetic */ String padStart$default(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return padStart(str, i10, c10);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c10, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return split(charSequence, cArr, z10, i10);
    }

    public static final rv.t splitToSequence(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiters, "delimiters");
        return rv.f0.map(d(charSequence, delimiters, z10, i10), new l0(charSequence, 0));
    }

    public static /* synthetic */ rv.t splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return splitToSequence(charSequence, cArr, z10, i10);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? k0.startsWith$default((String) charSequence, (String) prefix, false, 2, null) : regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return startsWith(charSequence, charSequence2, z10);
    }

    public static final String substring(CharSequence charSequence, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    public static final boolean toBooleanStrict(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.e0.areEqual(str, UupKET.krZ)) {
            return true;
        }
        if (kotlin.jvm.internal.e0.areEqual(str, YsiBvdpw.unILR)) {
            return false;
        }
        throw new IllegalArgumentException(a.b.k("The string doesn't represent a boolean value: ", str));
    }

    public static final String replaceAfter(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, delimiter.length() + iIndexOf$default, str.length(), replacement).toString();
    }

    public static final String replaceAfterLast(String str, char c10, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c10, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, iLastIndexOf$default + 1, str.length(), replacement).toString();
    }

    public static final String replaceBefore(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iIndexOf$default, replacement).toString();
    }

    public static final String replaceBeforeLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return iLastIndexOf$default == -1 ? missingDelimiterValue : replaceRange(str, 0, iLastIndexOf$default, replacement).toString();
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return startsWith(charSequence, charSequence2, i10, z10);
    }

    public static String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iIndexOf$default, str.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringAfterLast(String str, String delimiter, String str2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(str2, UupKET.fGfjOGLxkaoUt);
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iLastIndexOf$default, str.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.e0.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int indexOf(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i10);
        }
        return c(charSequence, string, i10, charSequence.length(), z10, false);
    }

    public static final int lastIndexOf(CharSequence charSequence, String string, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i10);
        }
        return c(charSequence, string, i10, 0, z10, true);
    }

    public static String removePrefix(String str, CharSequence prefix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        if (!startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String removeSuffix(String str, CharSequence suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        if (!endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String removeSurrounding(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(suffix, "suffix");
        if (str.length() < suffix.length() + prefix.length() || !startsWith$default((CharSequence) str, prefix, false, 2, (Object) null) || !endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean contains(CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        return indexOf$default(charSequence, c10, 0, z10, 2, (Object) null) >= 0;
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        if (!z10 && (charSequence instanceof String) && (prefix instanceof String)) {
            return k0.startsWith$default((String) charSequence, (String) prefix, i10, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i10, prefix, 0, prefix.length(), z10);
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence delimiter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(charSequence, delimiter, delimiter);
    }

    public static String removeSurrounding(String str, CharSequence delimiter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(str, delimiter, delimiter);
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(strings, "strings");
        tu.v vVarB = b(charSequence, strings, i10, z10, false);
        if (vVarB != null) {
            return ((Number) vVarB.getFirst()).intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(strings, "strings");
        tu.v vVarB = b(charSequence, strings, i10, z10, true);
        if (vVarB != null) {
            return ((Number) vVarB.getFirst()).intValue();
        }
        return -1;
    }

    public static final String trim(String str, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = ((Boolean) predicate.invoke(Character.valueOf(str.charAt(!z10 ? i10 : length)))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final String trimEnd(String str, kv.l predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(length)))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final String trimStart(String str, kv.l predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i10)))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(i10, str.length());
                    break;
                }
                i10++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static final List<String> split(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return f(charSequence, String.valueOf(delimiters[0]), i10, z10);
        }
        Iterable iterableAsIterable = rv.f0.asIterable(d(charSequence, delimiters, z10, i10));
        ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (qv.m) it.next()));
        }
        return arrayList;
    }

    public static final CharSequence trim(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zContains = uu.k0.contains(chars, charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!uu.k0.contains(chars, charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!uu.k0.contains(chars, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final String padEnd(String str, int i10, char c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i10, c10).toString();
    }

    public static String padStart(String str, int i10, char c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i10, c10).toString();
    }

    public static final CharSequence removeRange(CharSequence charSequence, qv.m range) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        return removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static final CharSequence replaceRange(CharSequence charSequence, qv.m range, CharSequence replacement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.e0.checkNotNullParameter(replacement, "replacement");
        return replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    public static String trim(String str, char... chars) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zContains = uu.k0.contains(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final String trimEnd(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!uu.k0.contains(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static String trimStart(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!uu.k0.contains(chars, str.charAt(i10))) {
                    charSequenceSubSequence = str.subSequence(i10, str.length());
                    break;
                }
                i10++;
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence trim(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zIsWhitespace = e.isWhitespace(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static CharSequence trimEnd(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!e.isWhitespace(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static CharSequence trimStart(CharSequence charSequence) {
        kotlin.jvm.internal.e0.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!e.isWhitespace(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }
}
