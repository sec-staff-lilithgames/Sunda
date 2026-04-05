package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class hr {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dp f2557;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private hr f2558;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ht f2559;

        /* renamed from: ｋ, reason: contains not printable characters */
        private int f2560;

        private e() {
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m2640(Method method) {
            if (this.f2559 == null || (method.getModifiers() & this.f2559.m2625()) != this.f2559.m2625() || (method.getModifiers() & this.f2559.m2627()) != 0 || this.f2559.m2652().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2559.m2651() != -1 && this.f2559.m2651() != parameterTypes.length) {
                return false;
            }
            List<Class> listM2654 = this.f2559.m2654();
            if (listM2654 != null) {
                if (listM2654.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM2654.size(); i10++) {
                    if (!listM2654.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2559.m2655() != null ? this.f2559.m2656() ? method.getReturnType().equals(this.f2559.m2655()) : this.f2559.m2655().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2560;
                if (i11 == 0) {
                    return true;
                }
                this.f2560 = i11 - 1;
            }
            return false;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void m2642(ht htVar) {
            this.f2559 = htVar;
            this.f2560 = htVar.m2653();
        }

        public /* synthetic */ e(byte b10) {
            this();
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final ht m2641() {
            return this.f2559;
        }
    }

    public hr() {
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m2629(Class cls, ht htVar, List<Method> list) {
        e eVar = new e((byte) 0);
        eVar.m2642(htVar);
        m2632(cls, eVar, list);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m2630(Class cls, ht htVar) {
        ArrayList arrayList = new ArrayList();
        m2629(cls, htVar, arrayList);
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m2632(Class cls, e eVar, List<Method> list) {
        ht htVarM2641 = eVar.m2641();
        for (Method method : (htVarM2641 == null || !htVarM2641.m2624()) ? Arrays.asList(cls.getDeclaredMethods()) : m2633(cls, htVarM2641.m2624(), htVarM2641.m2626())) {
            if (eVar.m2640(method)) {
                list.add(method);
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static List<Method> m2633(Class cls, boolean z10, int i10) {
        Method[] methodArrM3129 = new Method[0];
        if (cls != null) {
            methodArrM3129 = jz.m3129(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM3129);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM3129 = jz.m3129(jz.m3129(methodArrM3129, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM3129);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<dm> m2639() {
        ArrayList arrayList = new ArrayList(this.f2557.m2356());
        hr hrVar = this.f2558;
        if (hrVar != null) {
            arrayList.addAll(hrVar.m2639());
        }
        return arrayList;
    }

    public hr(dp dpVar, hr hrVar) {
        this.f2557 = dpVar;
        this.f2558 = hrVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final hr m2635() {
        return this.f2558;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final dl m2634(String str) {
        dl dlVar;
        hr hrVar = this;
        do {
            dlVar = hrVar.f2557.m2357().get(str);
            if (dlVar != null) {
                break;
            }
            hrVar = hrVar.f2558;
        } while (hrVar != null);
        return dlVar;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m2631(Class cls, ht htVar) {
        ArrayList arrayList = new ArrayList();
        m2629(cls, htVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m2638() {
        ArrayList arrayList = new ArrayList(this.f2557.m2360());
        hr hrVar = this.f2558;
        if (hrVar != null) {
            arrayList.addAll(hrVar.m2638());
        }
        return arrayList;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m2636() {
        return this.f2557.m2359();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final dq m2637(String str) {
        dq dqVar;
        hr hrVar = this;
        do {
            dqVar = hrVar.f2557.m2362().get(str);
            if (dqVar != null) {
                break;
            }
            hrVar = hrVar.f2558;
        } while (hrVar != null);
        return dqVar;
    }
}
