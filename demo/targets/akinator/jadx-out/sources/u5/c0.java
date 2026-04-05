package u5;

import j1.o2;
import kotlin.jvm.internal.e0;
import sv.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {
    public static final boolean equalsCommon(b0 b0Var, Object obj) {
        e0.checkNotNullParameter(b0Var, "<this>");
        if (b0Var == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        String str = b0Var.f87860a;
        b0 b0Var2 = (b0) obj;
        String str2 = b0Var2.f87861b;
        if (e0.areEqual(str, b0Var2.f87860a)) {
            String str3 = b0Var.f87861b;
            if (str3 != null ? e0.areEqual(str3, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(b0 b0Var) {
        e0.checkNotNullParameter(b0Var, "<this>");
        int iHashCode = b0Var.f87860a.hashCode() * 31;
        String str = b0Var.f87861b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public static final String toStringCommon(b0 b0Var) {
        e0.checkNotNullParameter(b0Var, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |ViewInfo {\n            |   name = '");
        sb2.append(b0Var.f87860a);
        sb2.append("',\n            |   sql = '");
        return d0.trimMargin$default(o2.o(sb2, b0Var.f87861b, "'\n            |}\n        "), null, 1, null);
    }
}
