package u5;

import com.google.android.gms.ads.AdError;
import j1.o2;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import sv.d0;
import sv.k0;
import sv.n0;
import tu.x0;
import u5.z;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(((z.a) obj).f87946a, ((z.a) obj2).f87946a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return xu.d.compareValues(((z.d) obj).f87958a, ((z.d) obj2).f87958a);
        }
    }

    public static final boolean defaultValueEqualsCommon(String current, String str) {
        e0.checkNotNullParameter(current, "current");
        if (e0.areEqual(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i10 < current.length()) {
                    char cCharAt = current.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i11++;
                    } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != current.length() - 1) {
                        break;
                    }
                    i10++;
                    i12 = i13;
                } else if (i11 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return e0.areEqual(n0.trim(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static final boolean equalsCommon(z zVar, Object obj) {
        Set set;
        e0.checkNotNullParameter(zVar, "<this>");
        if (zVar == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar2 = (z) obj;
        if (!e0.areEqual(zVar.f87941a, zVar2.f87941a) || !e0.areEqual(zVar.f87942b, zVar2.f87942b) || !e0.areEqual(zVar.f87943c, zVar2.f87943c)) {
            return false;
        }
        Set set2 = zVar.f87944d;
        if (set2 == null || (set = zVar2.f87944d) == null) {
            return true;
        }
        return e0.areEqual(set2, set);
    }

    public static final String formatString(Collection<?> collection) {
        e0.checkNotNullParameter(collection, "collection");
        return !collection.isEmpty() ? o2.o(new StringBuilder(), d0.prependIndent$default(y0.joinToString$default(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null), "},") : " }";
    }

    public static final int hashCodeCommon(z zVar) {
        e0.checkNotNullParameter(zVar, "<this>");
        return zVar.f87943c.hashCode() + p0.o2.f(zVar.f87942b, zVar.f87941a.hashCode() * 31, 31);
    }

    public static final String toStringCommon(z zVar) {
        List listEmptyList;
        e0.checkNotNullParameter(zVar, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(zVar.f87941a);
        sb2.append("',\n            |    columns = {");
        sb2.append(formatString(y0.sortedWith(zVar.f87942b.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(formatString(zVar.f87943c));
        sb2.append("\n            |    indices = {");
        Set set = zVar.f87944d;
        if (set == null || (listEmptyList = y0.sortedWith(set, new b())) == null) {
            listEmptyList = p0.emptyList();
        }
        sb2.append(formatString(listEmptyList));
        sb2.append("\n            |}\n        ");
        return d0.trimMargin$default(sb2.toString(), null, 1, null);
    }

    public static final int hashCodeCommon(z.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        return (((((aVar.f87946a.hashCode() * 31) + aVar.f87952g) * 31) + (aVar.f87948c ? 1231 : 1237)) * 31) + aVar.f87949d;
    }

    public static final boolean equalsCommon(z.a aVar, Object obj) {
        e0.checkNotNullParameter(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof z.a)) {
            return false;
        }
        boolean zIsPrimaryKey = aVar.isPrimaryKey();
        int i10 = aVar.f87951f;
        z.a aVar2 = (z.a) obj;
        int i11 = aVar2.f87951f;
        if (zIsPrimaryKey != aVar2.isPrimaryKey() || !e0.areEqual(aVar.f87946a, aVar2.f87946a) || aVar.f87948c != aVar2.f87948c) {
            return false;
        }
        String str = aVar.f87950e;
        String str2 = aVar2.f87950e;
        if (i10 == 1 && i11 == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (i10 != 2 || i11 != 1 || str2 == null || defaultValueEqualsCommon(str2, str)) {
            return (i10 == 0 || i10 != i11 || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && aVar.f87952g == aVar2.f87952g;
        }
        return false;
    }

    public static final int hashCodeCommon(z.c cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        return cVar.f87957e.hashCode() + o2.c(p0.o2.e(p0.o2.e(cVar.f87953a.hashCode() * 31, 31, cVar.f87954b), 31, cVar.f87955c), 31, cVar.f87956d);
    }

    public static final boolean equalsCommon(z.c cVar, Object obj) {
        e0.checkNotNullParameter(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof z.c)) {
            return false;
        }
        z.c cVar2 = (z.c) obj;
        if (e0.areEqual(cVar.f87953a, cVar2.f87953a) && e0.areEqual(cVar.f87954b, cVar2.f87954b) && e0.areEqual(cVar.f87955c, cVar2.f87955c) && e0.areEqual(cVar.f87956d, cVar2.f87956d)) {
            return e0.areEqual(cVar.f87957e, cVar2.f87957e);
        }
        return false;
    }

    public static final int hashCodeCommon(z.d dVar) {
        e0.checkNotNullParameter(dVar, "<this>");
        return dVar.f87961d.hashCode() + o2.c((((k0.startsWith$default(dVar.f87958a, "index_", false, 2, null) ? -1184239155 : dVar.f87958a.hashCode()) * 31) + (dVar.f87959b ? 1 : 0)) * 31, 31, dVar.f87960c);
    }

    public static final boolean equalsCommon(z.d dVar, Object obj) {
        e0.checkNotNullParameter(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof z.d)) {
            return false;
        }
        boolean z10 = dVar.f87959b;
        String str = dVar.f87958a;
        z.d dVar2 = (z.d) obj;
        String str2 = dVar2.f87958a;
        if (z10 != dVar2.f87959b || !e0.areEqual(dVar.f87960c, dVar2.f87960c) || !e0.areEqual(dVar.f87961d, dVar2.f87961d)) {
            return false;
        }
        if (k0.startsWith$default(str, "index_", false, 2, null)) {
            return k0.startsWith$default(str2, "index_", false, 2, null);
        }
        return e0.areEqual(str, str2);
    }

    public static final String toStringCommon(z.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(aVar.f87946a);
        sb2.append("',\n            |   type = '");
        sb2.append(aVar.f87947b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(aVar.f87952g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(aVar.f87948c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(aVar.f87949d);
        sb2.append("',\n            |   defaultValue = '");
        String str = aVar.f87950e;
        if (str == null) {
            str = AdError.UNDEFINED_DOMAIN;
        }
        return d0.prependIndent$default(d0.trimMargin$default(o2.o(sb2, str, "'\n            |}\n        "), null, 1, null), null, 1, null);
    }

    public static final String toStringCommon(z.c cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(cVar.f87953a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(cVar.f87954b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(cVar.f87955c);
        sb2.append("',\n            |   columnNames = {");
        d0.prependIndent$default(y0.joinToString$default(y0.sorted(cVar.f87956d), ",", null, null, 0, null, null, 62, null), null, 1, null);
        d0.prependIndent$default("},", null, 1, null);
        x0 x0Var = x0.f87415a;
        sb2.append(x0Var);
        sb2.append("\n            |   referenceColumnNames = {");
        d0.prependIndent$default(y0.joinToString$default(y0.sorted(cVar.f87957e), ",", null, null, 0, null, null, 62, null), null, 1, null);
        d0.prependIndent$default(" }", null, 1, null);
        sb2.append(x0Var);
        sb2.append("\n            |}\n        ");
        return d0.prependIndent$default(d0.trimMargin$default(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String toStringCommon(z.d dVar) {
        e0.checkNotNullParameter(dVar, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(dVar.f87958a);
        sb2.append("',\n            |   unique = '");
        sb2.append(dVar.f87959b);
        sb2.append("',\n            |   columns = {");
        d0.prependIndent$default(y0.joinToString$default(dVar.f87960c, ",", null, null, 0, null, null, 62, null), null, 1, null);
        d0.prependIndent$default("},", null, 1, null);
        x0 x0Var = x0.f87415a;
        sb2.append(x0Var);
        sb2.append("\n            |   orders = {");
        d0.prependIndent$default(y0.joinToString$default(dVar.f87961d, ",", null, null, 0, null, null, 62, null), null, 1, null);
        d0.prependIndent$default(" }", null, 1, null);
        sb2.append(x0Var);
        sb2.append("\n            |}\n        ");
        return d0.prependIndent$default(d0.trimMargin$default(sb2.toString(), null, 1, null), null, 1, null);
    }
}
