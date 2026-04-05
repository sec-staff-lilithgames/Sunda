package io.ktor.http;

import com.ironsource.C3191e4;
import io.ktor.http.ContentRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import qv.p;
import sv.n0;
import tu.t;
import tu.v;
import uu.k0;
import uu.p0;
import uu.q0;
import uu.y0;
import xu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class RangesKt {
    public static final List<p> mergeRangesKeepOrder(List<p> list) {
        e0.checkNotNullParameter(list, "<this>");
        List<p> listSortedWith = y0.sortedWith(list, new Comparator() { // from class: io.ktor.http.RangesKt$mergeRangesKeepOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return d.compareValues(((p) t10).getStart(), ((p) t11).getStart());
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        for (p pVar : listSortedWith) {
            if (arrayList.isEmpty()) {
                arrayList.add(pVar);
            } else if (((p) y0.last((List) arrayList)).getEndInclusive().longValue() < pVar.getStart().longValue() - 1) {
                arrayList.add(pVar);
            } else {
                p pVar2 = (p) y0.last((List) arrayList);
                arrayList.set(p0.getLastIndex(arrayList), new p(pVar2.getStart().longValue(), Math.max(pVar2.getEndInclusive().longValue(), pVar.getEndInclusive().longValue())));
            }
        }
        p[] pVarArr = new p[list.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p range = (p) it.next();
            int size = list.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    e0.checkNotNullExpressionValue(range, "range");
                    if (io.ktor.util.RangesKt.contains(range, list.get(i10))) {
                        pVarArr[i10] = range;
                        break;
                    }
                    i10++;
                }
            }
        }
        return k0.filterNotNull(pVarArr);
    }

    public static final RangesSpecifier parseRangesSpecifier(String rangeSpec) {
        int iIndexOf$default;
        v vVar;
        ContentRange bounded;
        e0.checkNotNullParameter(rangeSpec, "rangeSpec");
        try {
            iIndexOf$default = n0.indexOf$default((CharSequence) rangeSpec, C3191e4.i.f36525b, 0, false, 6, (Object) null);
        } catch (Throwable unused) {
        }
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = rangeSpec.substring(0, iIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = rangeSpec.substring(iIndexOf$default + 1);
        e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        v vVar2 = tu.e0.to(strSubstring, strSubstring2);
        String str = (String) vVar2.component1();
        List<String> listSplit$default = n0.split$default((CharSequence) vVar2.component2(), new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
        for (String str2 : listSplit$default) {
            if (sv.k0.startsWith$default(str2, "-", false, 2, null)) {
                bounded = new ContentRange.Suffix(Long.parseLong(n0.removePrefix(str2, (CharSequence) "-")));
            } else {
                int iIndexOf$default2 = n0.indexOf$default((CharSequence) str2, "-", 0, false, 6, (Object) null);
                if (iIndexOf$default2 == -1) {
                    vVar = tu.e0.to("", "");
                } else {
                    String strSubstring3 = str2.substring(0, iIndexOf$default2);
                    e0.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    String strSubstring4 = str2.substring(iIndexOf$default2 + 1);
                    e0.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
                    vVar = tu.e0.to(strSubstring3, strSubstring4);
                }
                String str3 = (String) vVar.component1();
                String str4 = (String) vVar.component2();
                bounded = str4.length() > 0 ? new ContentRange.Bounded(Long.parseLong(str3), Long.parseLong(str4)) : new ContentRange.TailFrom(Long.parseLong(str3));
            }
            arrayList.add(bounded);
        }
        if (!arrayList.isEmpty() && str.length() != 0) {
            RangesSpecifier rangesSpecifier = new RangesSpecifier(str, arrayList);
            if (RangesSpecifier.isValid$default(rangesSpecifier, null, 1, null)) {
                return rangesSpecifier;
            }
        }
        return null;
    }

    public static final List<p> toLongRanges(List<? extends ContentRange> list, long j10) {
        p pVarUntil;
        e0.checkNotNullParameter(list, "<this>");
        List<? extends ContentRange> list2 = list;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
        for (ContentRange contentRange : list2) {
            if (contentRange instanceof ContentRange.Bounded) {
                ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                pVarUntil = new p(bounded.getFrom(), qv.v.coerceAtMost(bounded.getTo(), j10 - 1));
            } else if (contentRange instanceof ContentRange.TailFrom) {
                pVarUntil = qv.v.until(((ContentRange.TailFrom) contentRange).getFrom(), j10);
            } else {
                if (!(contentRange instanceof ContentRange.Suffix)) {
                    throw new t();
                }
                pVarUntil = qv.v.until(qv.v.coerceAtLeast(j10 - ((ContentRange.Suffix) contentRange).getLastCount(), 0L), j10);
            }
            arrayList.add(pVarUntil);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((p) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
