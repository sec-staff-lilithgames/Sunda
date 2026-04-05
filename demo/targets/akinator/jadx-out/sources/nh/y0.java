package nh;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class y0 implements BinaryOperator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76780b;

    public /* synthetic */ y0(int i10) {
        this.f76780b = i10;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f76780b) {
            case 0:
                x4 x4Var = (x4) obj;
                x4 x4Var2 = (x4) obj2;
                x4Var.getClass();
                x4Var.b(x4Var2.f76621b, x4Var2.f76620a);
                return x4Var;
            case 1:
                return ((k6) obj).d((k6) obj2);
            case 2:
                fc fcVar = (fc) obj;
                fcVar.putAll((fc) obj2);
                return fcVar;
            case 3:
                ud udVar = (ud) obj;
                udVar.addAll((ud) obj2);
                return udVar;
            case 4:
                q4 q4Var = (q4) obj;
                q4Var.e((q4) obj2);
                return q4Var;
            case 5:
                final g1 g1Var = (g1) obj;
                g1 g1Var2 = (g1) obj2;
                if (g1Var.f76278b == null) {
                    return g1Var2;
                }
                EnumMap enumMap = g1Var2.f76278b;
                if (enumMap == null) {
                    return g1Var;
                }
                enumMap.forEach(new BiConsumer() { // from class: nh.f1
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj3, Object obj4) {
                        g1Var.a((Enum) obj3, obj4);
                    }
                });
                return g1Var;
            case 6:
                return ((g5) obj).b((g5) obj2);
            case 7:
                t6 t6Var = (t6) obj;
                t6Var.e((t6) obj2);
                return t6Var;
            case 8:
                c5 c5Var = (c5) obj;
                c5Var.a((c5) obj2);
                return c5Var;
            case 9:
                m6 m6Var = (m6) obj;
                m6Var.a((m6) obj2);
                return m6Var;
            case 10:
                ud udVar2 = (ud) obj;
                udVar2.addAll((ud) obj2);
                return udVar2;
            case 11:
                fc fcVar2 = (fc) obj;
                fcVar2.putAll((fc) obj2);
                return fcVar2;
            case 12:
                r6 r6Var = (r6) obj;
                r6 r6Var2 = (r6) obj2;
                int i10 = r6Var.f76286c + r6Var2.f76286c;
                Object[] objArr = r6Var.f76597f;
                if (i10 > objArr.length) {
                    int iA = t4.a(objArr.length, i10);
                    r6Var.f76597f = Arrays.copyOf(r6Var.f76597f, iA);
                    r6Var.f76598g = Arrays.copyOf(r6Var.f76598g, iA);
                }
                System.arraycopy(r6Var2.f76597f, 0, r6Var.f76597f, r6Var.f76286c, r6Var2.f76286c);
                System.arraycopy(r6Var2.f76598g, 0, r6Var.f76598g, r6Var.f76286c, r6Var2.f76286c);
                r6Var.f76286c += r6Var2.f76286c;
                return r6Var;
            case 13:
                h1 h1Var = (h1) obj;
                h1 h1Var2 = (h1) obj2;
                EnumSet enumSet = h1Var.f76314a;
                if (enumSet == null) {
                    return h1Var2;
                }
                EnumSet enumSet2 = h1Var2.f76314a;
                if (enumSet2 == null) {
                    return h1Var;
                }
                enumSet.addAll(enumSet2);
                return h1Var;
            case 14:
                throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
            default:
                h6 h6Var = (h6) obj;
                h6Var.getClass();
                h6Var.addAll(((h6) obj2).f76322a);
                return h6Var;
        }
    }
}
