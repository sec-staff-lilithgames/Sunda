package ad;

import dd.m0;
import nh.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a[] f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4300c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final jc.w f4301a;

        /* renamed from: b, reason: collision with root package name */
        public final a f4302b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f4303c;

        /* renamed from: d, reason: collision with root package name */
        public final jc.o f4304d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f4305e;

        public a(a aVar, m0 m0Var, jc.w wVar) {
            this.f4302b = aVar;
            this.f4301a = wVar;
            this.f4305e = m0Var.isTyped();
            this.f4303c = m0Var.getRawType();
            this.f4304d = m0Var.getType();
        }

        public boolean matchesTyped(Class<?> cls) {
            return this.f4303c == cls && this.f4305e;
        }

        public boolean matchesUntyped(Class<?> cls) {
            return this.f4303c == cls && !this.f4305e;
        }

        public boolean matchesTyped(jc.o oVar) {
            return this.f4305e && oVar.equals(this.f4304d);
        }

        public boolean matchesUntyped(jc.o oVar) {
            return !this.f4305e && oVar.equals(this.f4304d);
        }
    }

    public u(dd.u uVar) {
        int size = uVar.size();
        int i10 = 8;
        while (i10 < (size <= 64 ? size + size : size + (size >> 2))) {
            i10 += i10;
        }
        this.f4299b = i10;
        this.f4300c = i10 - 1;
        a[] aVarArr = new a[i10];
        uVar.contents(new c1(2, this, aVarArr));
        this.f4298a = aVarArr;
    }

    public static u from(dd.u uVar) {
        return new u(uVar);
    }

    public int size() {
        return this.f4299b;
    }

    public jc.w typedValueSerializer(jc.o oVar) {
        a aVar = this.f4298a[m0.typedHash(oVar) & this.f4300c];
        if (aVar == null) {
            return null;
        }
        if (aVar.matchesTyped(oVar)) {
            return aVar.f4301a;
        }
        do {
            aVar = aVar.f4302b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.matchesTyped(oVar));
        return aVar.f4301a;
    }

    public jc.w untypedValueSerializer(jc.o oVar) {
        a aVar = this.f4298a[m0.untypedHash(oVar) & this.f4300c];
        if (aVar == null) {
            return null;
        }
        if (aVar.matchesUntyped(oVar)) {
            return aVar.f4301a;
        }
        do {
            aVar = aVar.f4302b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.matchesUntyped(oVar));
        return aVar.f4301a;
    }

    public jc.w typedValueSerializer(Class<?> cls) {
        a aVar = this.f4298a[m0.typedHash(cls) & this.f4300c];
        if (aVar == null) {
            return null;
        }
        if (aVar.matchesTyped(cls)) {
            return aVar.f4301a;
        }
        do {
            aVar = aVar.f4302b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.matchesTyped(cls));
        return aVar.f4301a;
    }

    public jc.w untypedValueSerializer(Class<?> cls) {
        a aVar = this.f4298a[m0.untypedHash(cls) & this.f4300c];
        if (aVar == null) {
            return null;
        }
        if (aVar.matchesUntyped(cls)) {
            return aVar.f4301a;
        }
        do {
            aVar = aVar.f4302b;
            if (aVar == null) {
                return null;
            }
        } while (!aVar.matchesUntyped(cls));
        return aVar.f4301a;
    }
}
