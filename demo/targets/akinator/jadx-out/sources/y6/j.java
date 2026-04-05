package y6;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import n6.c0;
import uu.y0;
import v6.b0;
import v6.n;
import v6.n0;
import v6.o;
import v6.p0;
import v6.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f94114a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("DiagnosticsWrkr");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f94114a = strTagWithPrefix;
    }

    public static final String access$workSpecRows(u uVar, p0 p0Var, o oVar, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            n systemIdInfo = oVar.getSystemIdInfo(n0.generationalId(b0Var));
            Integer numValueOf = systemIdInfo != null ? Integer.valueOf(systemIdInfo.f89148c) : null;
            String str = b0Var.f89053a;
            String strJoinToString$default = y0.joinToString$default(uVar.getNamesForWorkSpecId(str), ",", null, null, 0, null, null, 62, null);
            String strJoinToString$default2 = y0.joinToString$default(p0Var.getTagsForWorkSpecId(str), ",", null, null, 0, null, null, 62, null);
            StringBuilder sbO = e3.g.o("\n", str, "\t ");
            sbO.append(b0Var.f89055c);
            sbO.append("\t ");
            sbO.append(numValueOf);
            sbO.append("\t ");
            sbO.append(b0Var.f89054b.name());
            sbO.append("\t ");
            sbO.append(strJoinToString$default);
            sbO.append("\t ");
            sbO.append(strJoinToString$default2);
            sbO.append('\t');
            sb2.append(sbO.toString());
        }
        return sb2.toString();
    }
}
