package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hm;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class hn {

    /* renamed from: ｋ, reason: contains not printable characters */
    private List<Field> f2533;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private hm f2534;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private a f2535;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private hm f2537;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private int f2538;

        private a() {
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final void m2618(hm hmVar) {
            this.f2537 = hmVar;
            this.f2538 = hmVar.m2594();
        }

        /* renamed from: ﻛ */
        public boolean mo2617(Field field) {
            if (this.f2537 == null || (field.getModifiers() & this.f2537.m2625()) != this.f2537.m2625() || (field.getModifiers() & this.f2537.m2627()) != 0 || this.f2537.m2592().contains(field.getType())) {
                return false;
            }
            if (this.f2537.m2595() ? field.getType().equals(this.f2537.m2593()) : this.f2537.m2593().isAssignableFrom(field.getType())) {
                int i10 = this.f2538;
                if (i10 == 0) {
                    return true;
                }
                this.f2538 = i10 - 1;
            }
            return false;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final hm m2619() {
            return this.f2537;
        }

        public /* synthetic */ a(hn hnVar) {
            this();
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m2608(Class cls, a aVar, List<Field> list) throws SecurityException {
        for (Field field : m2610(cls, aVar.m2619())) {
            if (aVar.mo2617(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static hm.e m2609() {
        return new hm.e();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final <T> Field m2614(Class cls, Class<T> cls2) {
        Field fieldM2613;
        synchronized (jv.class) {
            try {
                if (this.f2534 == null) {
                    this.f2534 = new hm();
                }
                this.f2534.m2597(cls2);
                fieldM2613 = m2613(cls, this.f2534);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fieldM2613;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List<Field> m2615(Class cls, hm hmVar) {
        ArrayList arrayList = new ArrayList();
        m2611(cls, hmVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Field m2616(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hn.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hn.a
            /* renamed from: ﻛ, reason: contains not printable characters */
            public final boolean mo2617(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hn.class) {
            try {
                if (this.f2533 == null) {
                    this.f2533 = new ArrayList();
                }
                this.f2533.clear();
                m2608(cls, aVar, this.f2533);
                if (this.f2533.isEmpty()) {
                    return null;
                }
                return this.f2533.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Field[] m2610(Class cls, hm hmVar) {
        if (hmVar != null && hmVar.m2624()) {
            return m2612(cls, hmVar.m2624(), hmVar.m2626(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m2611(Class cls, hm hmVar, List<Field> list) {
        synchronized (hn.class) {
            try {
                if (this.f2535 == null) {
                    this.f2535 = new a(this);
                }
                this.f2535.m2618(hmVar);
                m2608(cls, this.f2535, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Field m2613(Class cls, hm hmVar) {
        synchronized (jv.class) {
            try {
                if (this.f2533 == null) {
                    this.f2533 = new ArrayList();
                }
                this.f2533.clear();
                m2611(cls, hmVar, this.f2533);
                if (this.f2533.isEmpty()) {
                    return null;
                }
                return this.f2533.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field[] m2612(Class cls, boolean z10, int i10, List<String> list) throws SecurityException {
        while (cls != null && !jz.m3132(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM3133 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM3133 = jz.m3133(declaredFields, fields);
            if (!z10) {
                return fieldArrM3133;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM3133 = jz.m3133(fieldArrM3133, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM3133 = jz.m3133(fieldArrM3133, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM3133;
    }
}
