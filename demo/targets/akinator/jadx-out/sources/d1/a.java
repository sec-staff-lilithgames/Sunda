package d1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import p0.o2;
import p0.q1;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f51696a = new ArrayList();

    public final void a(q1 q1Var, Object obj) {
        String sourceInformation;
        String sourceInformation2;
        String sourceInformation3 = q1Var.getSourceInformation();
        c cVar = null;
        x sourceInformation4 = sourceInformation3 != null ? y.parseSourceInformation(sourceInformation3) : null;
        if (sourceInformation4 != null) {
            if (obj == null) {
                cVar = new c(sourceInformation4, null);
            } else {
                ArrayList<Object> groups = q1Var.getGroups();
                int i10 = 0;
                if (groups != null) {
                    int size = groups.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        Object obj2 = groups.get(i12);
                        if (e0.areEqual(obj2, obj)) {
                            break;
                        }
                        q1 q1VarC = c(obj2);
                        if (q1VarC != null && ((q1VarC.getKey() == -127 || (q1VarC.getKey() == 0 && (obj2 instanceof p0.b) && groupKeyOf((p0.b) obj2) == -127)) && q1VarC.getSourceInformation() == null)) {
                            ArrayList<Object> groups2 = q1VarC.getGroups();
                            if (groups2 != null) {
                                int size2 = groups2.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    q1 q1VarC2 = c(groups2.get(i13));
                                    if (q1VarC2 != null && (sourceInformation2 = q1VarC2.getSourceInformation()) != null && k0.startsWith$default(sourceInformation2, "C", false, 2, null)) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (q1VarC != null && (sourceInformation = q1VarC.getSourceInformation()) != null && k0.startsWith$default(sourceInformation, "C", false, 2, null)) {
                            i11++;
                        }
                    }
                    i10 = i11;
                }
                cVar = new c(sourceInformation4, Integer.valueOf(i10));
            }
        }
        if (cVar != null) {
            this.f51696a.add(cVar);
        }
    }

    public final boolean b(q1 q1Var, Object obj) {
        ArrayList<Object> groups = q1Var.getGroups();
        boolean z10 = false;
        if (groups != null) {
            int size = groups.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = groups.get(i10);
                if (obj2 instanceof p0.b) {
                    if (e0.areEqual(obj2, obj)) {
                        a(q1Var, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof q1)) {
                        throw new IllegalStateException(o2.o(obj2, "Unexpected child source info "));
                    }
                    if (b((q1) obj2, obj)) {
                        a(q1Var, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!q1Var.getClosed()) {
                a(q1Var, null);
                return true;
            }
            int dataStartOffset = q1Var.getDataStartOffset();
            int dataEndOffset = q1Var.getDataEndOffset();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    a(q1Var, null);
                }
                return z10;
            }
        }
        return false;
    }

    public final q1 c(Object obj) {
        if (obj instanceof p0.b) {
            return sourceInformationOf((p0.b) obj);
        }
        if (obj instanceof q1) {
            return (q1) obj;
        }
        throw new IllegalStateException(o2.o(obj, "Unexpected child source info "));
    }

    public abstract int groupKeyOf(p0.b bVar);

    public final void processEdge(q1 q1Var, Object obj) {
        if (q1Var != null) {
            if (obj == null) {
                a(q1Var, null);
            } else {
                if (b(q1Var, obj) || q1Var.getClosed()) {
                    return;
                }
                a(q1Var, null);
            }
        }
    }

    public abstract q1 sourceInformationOf(p0.b bVar);

    public final List<c> trace() {
        return this.f51696a;
    }
}
