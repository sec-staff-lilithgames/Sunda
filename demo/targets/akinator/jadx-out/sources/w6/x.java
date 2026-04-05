package w6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import n6.a1;
import n6.x0;
import uu.q0;
import uu.y0;
import v6.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {
    public static final void a(int i10, StringBuilder sb2) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb2.append(y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final y5.i toRawQuery(a1 a1Var) {
        String str;
        kotlin.jvm.internal.e0.checkNotNullParameter(a1Var, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        String str2 = " AND";
        if (a1Var.getStates().isEmpty()) {
            str = " WHERE";
        } else {
            List<x0> states = a1Var.getStates();
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(states, 10));
            Iterator<T> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(t0.stateToInt((x0) it.next())));
            }
            sb2.append(" WHERE state IN (");
            a(arrayList2.size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        if (!a1Var.getIds().isEmpty()) {
            List<UUID> ids = a1Var.getIds();
            ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(ids, 10));
            Iterator<T> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb2.append(str.concat(" id IN ("));
            a(a1Var.getIds().size(), sb2);
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        if (a1Var.getTags().isEmpty()) {
            str2 = str;
        } else {
            sb2.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            a(a1Var.getTags().size(), sb2);
            sb2.append("))");
            arrayList.addAll(a1Var.getTags());
        }
        if (!a1Var.getUniqueWorkNames().isEmpty()) {
            sb2.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            a(a1Var.getUniqueWorkNames().size(), sb2);
            sb2.append("))");
            arrayList.addAll(a1Var.getUniqueWorkNames());
        }
        sb2.append(";");
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return new y5.a(string, arrayList.toArray(new Object[0]));
    }
}
