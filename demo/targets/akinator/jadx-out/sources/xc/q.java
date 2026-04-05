package xc;

import java.util.Collection;
import java.util.Objects;
import jc.s0;
import lc.a0;
import lc.z;
import tb.v0;
import tb.w0;
import tb.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class q implements wc.i {

    /* renamed from: b, reason: collision with root package name */
    public w0 f91916b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f91917c;

    /* renamed from: e, reason: collision with root package name */
    public String f91918e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91919f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f91920g;

    /* renamed from: h, reason: collision with root package name */
    public Class f91921h;

    /* renamed from: i, reason: collision with root package name */
    public wc.h f91922i;

    public q() {
        this.f91919f = false;
    }

    public static q noTypeInfoBuilder() {
        return new q().withSettings(y0.construct(w0.f86793c, null, null, null, false, null));
    }

    public final wc.h a(a0 a0Var, jc.o oVar, wc.d dVar, Collection collection, boolean z10, boolean z11) {
        wc.h hVar = this.f91922i;
        if (hVar != null) {
            return hVar;
        }
        w0 w0Var = this.f91916b;
        if (w0Var == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int iOrdinal = w0Var.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return n.construct(oVar, (z) a0Var, (Collection<wc.c>) collection, dVar);
            }
            if (iOrdinal == 3) {
                return u.construct(a0Var, oVar, collection, z10, z11);
            }
            if (iOrdinal == 4) {
                return o.construct(a0Var, oVar, collection, z10, z11);
            }
            if (iOrdinal != 5) {
                throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f91916b);
            }
        }
        return l.construct(oVar, a0Var, collection, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @Override // wc.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wc.g buildTypeDeserializer(jc.j r11, jc.o r12, java.util.Collection<wc.c> r13) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.q.buildTypeDeserializer(jc.j, jc.o, java.util.Collection):wc.g");
    }

    @Override // wc.i
    public wc.j buildTypeSerializer(s0 s0Var, jc.o oVar, Collection<wc.c> collection) {
        if (this.f91916b == w0.f86793c || oVar.isPrimitive()) {
            return null;
        }
        if (this.f91916b == w0.f86798i) {
            return d.instance();
        }
        wc.h hVarA = a(s0Var, oVar, subTypeValidator(s0Var), collection, true, false);
        int iOrdinal = this.f91917c.ordinal();
        if (iOrdinal == 0) {
            return new i(hVarA, null, this.f91918e);
        }
        if (iOrdinal == 1) {
            return new k(hVarA, null);
        }
        if (iOrdinal == 2) {
            return new b(hVarA, null);
        }
        if (iOrdinal == 3) {
            return new g(hVarA, null, this.f91918e);
        }
        if (iOrdinal == 4) {
            return new e(hVarA, null, this.f91918e);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f91917c);
    }

    @Override // wc.i
    public /* bridge */ /* synthetic */ wc.i defaultImpl(Class cls) {
        return defaultImpl((Class<?>) cls);
    }

    @Override // wc.i
    public Class<?> getDefaultImpl() {
        return this.f91921h;
    }

    public String getTypeProperty() {
        return this.f91918e;
    }

    public boolean isTypeIdVisible() {
        return this.f91919f;
    }

    public wc.d subTypeValidator(z zVar) {
        return zVar.getPolymorphicTypeValidator();
    }

    @Override // wc.i
    public /* bridge */ /* synthetic */ wc.i withDefaultImpl(Class cls) {
        return withDefaultImpl((Class<?>) cls);
    }

    @Override // wc.i
    public q defaultImpl(Class<?> cls) {
        this.f91921h = cls;
        return this;
    }

    @Override // wc.i
    public q inclusion(v0 v0Var) {
        if (v0Var == null) {
            throw new IllegalArgumentException("includeAs cannot be null");
        }
        this.f91917c = v0Var;
        return this;
    }

    @Override // wc.i
    public q typeIdVisibility(boolean z10) {
        this.f91919f = z10;
        return this;
    }

    @Override // wc.i
    public q typeProperty(String str) {
        w0 w0Var = this.f91916b;
        if (str == null || str.isEmpty()) {
            str = w0Var.getDefaultPropertyName();
        }
        this.f91918e = str;
        return this;
    }

    @Override // wc.i
    public q withDefaultImpl(Class<?> cls) {
        if (this.f91921h == cls) {
            return this;
        }
        dd.i.verifyMustOverride(q.class, this, "withDefaultImpl");
        return new q(this, cls);
    }

    @Override // wc.i
    public q withSettings(y0 y0Var) {
        w0 idType = y0Var.getIdType();
        Objects.requireNonNull(idType);
        this.f91916b = idType;
        this.f91917c = y0Var.getInclusionType();
        String propertyName = y0Var.getPropertyName();
        w0 w0Var = this.f91916b;
        if (propertyName == null || propertyName.isEmpty()) {
            propertyName = w0Var.getDefaultPropertyName();
        }
        this.f91918e = propertyName;
        this.f91921h = y0Var.getDefaultImpl();
        this.f91919f = y0Var.getIdVisible();
        this.f91920g = y0Var.getRequireTypeIdForSubtypes();
        return this;
    }

    public q(q qVar, Class cls) {
        this.f91919f = false;
        this.f91916b = qVar.f91916b;
        this.f91917c = qVar.f91917c;
        this.f91918e = qVar.f91918e;
        this.f91919f = qVar.f91919f;
        this.f91922i = qVar.f91922i;
        this.f91921h = cls;
        this.f91920g = qVar.f91920g;
    }

    @Override // wc.i
    public q init(w0 w0Var, wc.h hVar) {
        if (w0Var != null) {
            this.f91916b = w0Var;
            this.f91922i = hVar;
            this.f91918e = w0Var.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    @Override // wc.i
    public q init(y0 y0Var, wc.h hVar) {
        this.f91922i = hVar;
        if (y0Var != null) {
            withSettings(y0Var);
        }
        return this;
    }

    public q(y0 y0Var) {
        this.f91919f = false;
        if (y0Var != null) {
            withSettings(y0Var);
        }
    }
}
