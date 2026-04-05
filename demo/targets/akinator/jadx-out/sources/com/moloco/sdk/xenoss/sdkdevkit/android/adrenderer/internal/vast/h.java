package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.z0;
import tu.e0;
import tu.t;
import tu.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final af.i f48972a = new af.i(6);

    /* renamed from: b, reason: collision with root package name */
    public static final af.i f48973b = new af.i(7);

    public static final Comparator<a0> b() {
        return f48972a;
    }

    public static final v c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return a(b(gVar.i(), gVar.f(), num, num2), b(gVar2.i(), gVar2.f(), num, num2));
    }

    public static final v d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        z0 z0Var = new z0();
        z0 z0Var2 = new z0();
        a(z0Var, z0Var2, b(gVar, gVar2, num, num2));
        a(z0Var, z0Var2, c(gVar, gVar2, num, num2));
        a(z0Var, z0Var2, a(gVar, gVar2));
        return e0.to(Integer.valueOf(z0Var.f71866b), Integer.valueOf(z0Var2.f71866b));
    }

    public static final v b(s sVar, s sVar2, double d10, Long l9, Integer num, Integer num2) {
        z0 z0Var = new z0();
        z0 z0Var2 = new z0();
        b(z0Var, z0Var2, a(sVar, sVar2, num, num2));
        b(z0Var, z0Var2, b(sVar, sVar2, num, num2));
        b(z0Var, z0Var2, a(sVar, sVar2, d10, l9));
        return e0.to(Integer.valueOf(z0Var.f71866b), Integer.valueOf(z0Var2.f71866b));
    }

    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> a(Integer num, Integer num2) {
        return new a(num, num2);
    }

    public static final Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> a() {
        return f48973b;
    }

    public static final Comparator<s> a(double d10, Long l9, Integer num, Integer num2) {
        return new b(d10, l9, num, num2);
    }

    public static final int a(a0 a0Var, a0 a0Var2) {
        kotlin.jvm.internal.e0.checkNotNull(a0Var2);
        int iB = b(a0Var2);
        kotlin.jvm.internal.e0.checkNotNull(a0Var);
        return kotlin.jvm.internal.e0.compare(iB, b(a0Var));
    }

    public static final int a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar2) {
        return a(nVar.g(), nVar2.g());
    }

    public static /* synthetic */ v a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            num2 = null;
        }
        return d(gVar, gVar2, num, num2);
    }

    public static final x0 a(z0 z0Var, z0 z0Var2, v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<destruct>");
        boolean zBooleanValue = ((Boolean) vVar.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) vVar.component2()).booleanValue();
        if (zBooleanValue) {
            z0Var.f71866b++;
        }
        if (zBooleanValue2) {
            z0Var2.f71866b++;
        }
        return x0.f87415a;
    }

    public static final x0 b(z0 z0Var, z0 z0Var2, v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<destruct>");
        boolean zBooleanValue = ((Boolean) vVar.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) vVar.component2()).booleanValue();
        if (zBooleanValue) {
            z0Var.f71866b++;
        }
        if (zBooleanValue2) {
            z0Var2.f71866b++;
        }
        return x0.f87415a;
    }

    public static /* synthetic */ v a(s sVar, s sVar2, double d10, Long l9, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l9 = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            num2 = null;
        }
        return b(sVar, sVar2, d10, l9, num, num2);
    }

    public static final boolean a(a0 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return it instanceof a0.c;
    }

    public static final v a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2) {
        Object obj;
        Object next;
        a1.o oVar = new a1.o(24);
        Iterator<T> it = gVar.h().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Boolean) oVar.invoke(next)).booleanValue()) {
                break;
            }
        }
        boolean z10 = next != null;
        Iterator<T> it2 = gVar2.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((Boolean) oVar.invoke(next2)).booleanValue()) {
                obj = next2;
                break;
            }
        }
        return e0.to(Boolean.valueOf(z10), Boolean.valueOf(obj != null));
    }

    public static final v b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2, Integer num, Integer num2) {
        return a(a(gVar.i(), gVar.f(), num, num2), a(gVar2.i(), gVar2.f(), num, num2));
    }

    public static final v b(s sVar, s sVar2, Integer num, Integer num2) {
        return a(b(sVar.j(), sVar.d(), num, num2), b(sVar2.j(), sVar2.d(), num, num2));
    }

    public static final v a(s sVar, s sVar2, Integer num, Integer num2) {
        return a(a(sVar.j(), sVar.d(), num, num2), a(sVar2.j(), sVar2.d(), num, num2));
    }

    public static final Double b(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() / num2.intValue()) - (num3.intValue() / num4.intValue()));
    }

    public static final v a(s sVar, s sVar2, double d10, Long l9) {
        return a(a(sVar, d10, l9), a(sVar2, d10, l9));
    }

    public static final v a(Double d10, Double d11) {
        if (d10 == null || d11 == null) {
            return e0.to(Boolean.valueOf(d10 != null), Boolean.valueOf(d11 != null));
        }
        if (kotlin.jvm.internal.e0.areEqual(d10, d11)) {
            Boolean bool = Boolean.TRUE;
            return e0.to(bool, bool);
        }
        if (Math.abs(d10.doubleValue()) == Math.abs(d11.doubleValue())) {
            return e0.to(Boolean.valueOf(d10.doubleValue() < 0.0d), Boolean.valueOf(d11.doubleValue() < 0.0d));
        }
        if (Double.compare(Math.abs(d10.doubleValue()), Math.abs(d11.doubleValue())) < 0) {
            return e0.to(Boolean.TRUE, Boolean.FALSE);
        }
        return e0.to(Boolean.FALSE, Boolean.TRUE);
    }

    public static final int b(a0 a0Var) {
        if (a0Var instanceof a0.a) {
            return 4;
        }
        if (a0Var instanceof a0.c) {
            return ((a0.c) a0Var).a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k.f49345c ? 3 : 2;
        }
        if (a0Var instanceof a0.b) {
            return 1;
        }
        throw new t();
    }

    public static final Double a(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0 || num3 == null || num3.intValue() == 0 || num4 == null || num4.intValue() == 0) {
            return null;
        }
        return Double.valueOf((num.intValue() * num2.intValue()) - (num3.intValue() * num4.intValue()));
    }

    public static final Double a(s sVar, double d10, Long l9) {
        Double dA = a(sVar, l9);
        if (dA != null) {
            return Double.valueOf(dA.doubleValue() - d10);
        }
        return null;
    }

    public static final Double a(s sVar, Long l9) {
        Double dValueOf;
        if (l9 == null) {
            return null;
        }
        if (sVar.b() != null) {
            dValueOf = Double.valueOf(sVar.b().intValue());
        } else {
            dValueOf = (sVar.f() == null || sVar.h() == null) ? null : Double.valueOf((sVar.f().intValue() - sVar.h().intValue()) / 2.0d);
        }
        if (dValueOf == null) {
            return null;
        }
        return Double.valueOf((dValueOf.doubleValue() / Segment.SIZE) * (l9.longValue() / 1000.0d));
    }
}
