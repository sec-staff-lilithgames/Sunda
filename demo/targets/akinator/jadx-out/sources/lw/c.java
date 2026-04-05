package lw;

import java.net.IDN;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.l;
import rv.f0;
import sv.g;
import sv.n0;
import uu.o0;
import uu.p0;
import uu.y0;
import yv.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f73631b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final l f73632c = l.f81911f.of(42);

    /* renamed from: d, reason: collision with root package name */
    public static final List f73633d = o0.listOf("*");

    /* renamed from: e, reason: collision with root package name */
    public static final c f73634e = new c(f.getDefault(d.f73636a));

    /* renamed from: a, reason: collision with root package name */
    public final e f73635a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static final String access$binarySearch(a aVar, l lVar, l[] lVarArr, int i10) {
            int i11;
            int iAnd;
            boolean z10;
            int iAnd2;
            aVar.getClass();
            int size = lVar.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = (i12 + size) / 2;
                while (i13 > -1 && lVar.getByte(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (lVar.getByte(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iAnd = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iAnd = h.and(lVarArr[i17].getByte(i18), 255);
                        z10 = z12;
                    }
                    iAnd2 = iAnd - h.and(lVar.getByte(i14 + i19), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (lVarArr[i17].size() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == lVarArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i20 = i16 - i19;
                        int size2 = lVarArr[i17].size() - i18;
                        int length = lVarArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            size2 += lVarArr[i21].size();
                        }
                        if (size2 >= i20) {
                            if (size2 <= i20) {
                                return lVar.substring(i14, i16 + i14).string(g.f86134b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                size = i13;
            }
            return null;
        }

        public final c get() {
            return c.f73634e;
        }
    }

    public c(e publicSuffixList) {
        e0.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.f73635a = publicSuffixList;
    }

    public static List a(String str) {
        List listSplit$default = n0.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return e0.areEqual(y0.last(listSplit$default), "") ? y0.dropLast(listSplit$default, 1) : listSplit$default;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        a aVar;
        String strAccess$binarySearch;
        String str;
        String strAccess$binarySearch2;
        List listEmptyList;
        List listEmptyList2;
        int size;
        int size2;
        e0.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        e0.checkNotNull(unicode);
        List listA = a(unicode);
        e eVar = this.f73635a;
        eVar.ensureLoaded();
        int size3 = listA.size();
        l[] lVarArr = new l[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            lVarArr[i10] = l.f81911f.encodeUtf8((String) listA.get(i10));
        }
        int i11 = 0;
        while (true) {
            aVar = f73631b;
            if (i11 >= size3) {
                strAccess$binarySearch = null;
                break;
            }
            strAccess$binarySearch = a.access$binarySearch(aVar, eVar.getBytes(), lVarArr, i11);
            if (strAccess$binarySearch != null) {
                break;
            }
            i11++;
        }
        if (size3 > 1) {
            l[] lVarArr2 = (l[]) lVarArr.clone();
            int length = lVarArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                lVarArr2[i12] = f73632c;
                String strAccess$binarySearch3 = a.access$binarySearch(aVar, eVar.getBytes(), lVarArr2, i12);
                if (strAccess$binarySearch3 != null) {
                    str = strAccess$binarySearch3;
                    break;
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (str != null) {
            int i13 = size3 - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                strAccess$binarySearch2 = a.access$binarySearch(aVar, eVar.getExceptionBytes(), lVarArr, i14);
                if (strAccess$binarySearch2 != null) {
                    break;
                }
            }
            strAccess$binarySearch2 = null;
        } else {
            strAccess$binarySearch2 = null;
        }
        if (strAccess$binarySearch2 != null) {
            listEmptyList2 = n0.split$default((CharSequence) "!".concat(strAccess$binarySearch2), new char[]{'.'}, false, 0, 6, (Object) null);
        } else if (strAccess$binarySearch == null && str == null) {
            listEmptyList2 = f73633d;
        } else {
            if (strAccess$binarySearch == null || (listEmptyList = n0.split$default((CharSequence) strAccess$binarySearch, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = p0.emptyList();
            }
            if (str == null || (listEmptyList2 = n0.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList2 = p0.emptyList();
            }
            if (listEmptyList.size() > listEmptyList2.size()) {
                listEmptyList2 = listEmptyList;
            }
        }
        if (listA.size() == listEmptyList2.size() && ((String) listEmptyList2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listEmptyList2.get(0)).charAt(0) == '!') {
            size = listA.size();
            size2 = listEmptyList2.size();
        } else {
            size = listA.size();
            size2 = listEmptyList2.size() + 1;
        }
        return f0.joinToString$default(f0.drop(y0.asSequence(a(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
