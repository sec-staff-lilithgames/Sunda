package rc;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c1 {

    /* renamed from: g, reason: collision with root package name */
    public static final jc.n0[] f84141g = new jc.n0[0];

    /* renamed from: a, reason: collision with root package name */
    public final r f84142a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84143b;

    /* renamed from: c, reason: collision with root package name */
    public tb.m f84144c;

    /* renamed from: d, reason: collision with root package name */
    public jc.n0[] f84145d;

    /* renamed from: e, reason: collision with root package name */
    public jc.n0[] f84146e;

    /* renamed from: f, reason: collision with root package name */
    public List f84147f;

    public c1(r rVar, tb.m mVar) {
        this.f84142a = rVar;
        this.f84143b = mVar != null;
        this.f84144c = mVar == null ? tb.m.f86748b : mVar;
    }

    public void assignPropertyDefs(List<? extends d0> list) {
        this.f84147f = list;
    }

    public r creator() {
        return this.f84142a;
    }

    public tb.m creatorMode() {
        return this.f84144c;
    }

    public tb.m creatorModeOrDefault() {
        tb.m mVar = this.f84144c;
        return mVar == null ? tb.m.f86748b : mVar;
    }

    public jc.n0 explicitName(int i10) {
        return this.f84146e[i10];
    }

    public boolean hasExplicitNames() {
        int length = this.f84146e.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f84146e[i10] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNameFor(int i10) {
        return (this.f84146e[i10] == null && this.f84145d[i10] == null) ? false : true;
    }

    public boolean hasNameOrInjectForAllParams(lc.z zVar) {
        jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
        int length = this.f84145d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!hasNameFor(i10) && (annotationIntrospector == null || annotationIntrospector.findInjectableValue(this.f84142a.getParameter(i10)) == null)) {
                return false;
            }
        }
        return true;
    }

    public jc.n0 implicitName(int i10) {
        return this.f84145d[i10];
    }

    public String implicitNameSimple(int i10) {
        jc.n0 n0Var = this.f84145d[i10];
        if (n0Var == null) {
            return null;
        }
        return n0Var.getSimpleName();
    }

    public c1 introspectParamNames(lc.z zVar) {
        if (this.f84145d == null) {
            r rVar = this.f84142a;
            int parameterCount = rVar.getParameterCount();
            if (parameterCount == 0) {
                jc.n0[] n0VarArr = f84141g;
                this.f84146e = n0VarArr;
                this.f84145d = n0VarArr;
                return this;
            }
            this.f84146e = new jc.n0[parameterCount];
            this.f84145d = new jc.n0[parameterCount];
            jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
            for (int i10 = 0; i10 < parameterCount; i10++) {
                q parameter = rVar.getParameter(i10);
                String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(parameter);
                if (strFindImplicitPropertyName != null && !strFindImplicitPropertyName.isEmpty()) {
                    this.f84145d[i10] = jc.n0.construct(strFindImplicitPropertyName);
                }
                jc.n0 n0VarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
                if (n0VarFindNameForDeserialization != null && !n0VarFindNameForDeserialization.isEmpty()) {
                    this.f84146e[i10] = n0VarFindNameForDeserialization;
                }
            }
        }
        return this;
    }

    public boolean isAnnotated() {
        return this.f84143b;
    }

    public c1 overrideMode(tb.m mVar) {
        this.f84144c = mVar;
        return this;
    }

    public q param(int i10) {
        return this.f84142a.getParameter(i10);
    }

    public int paramCount() {
        return this.f84142a.getParameterCount();
    }

    public d0[] propertyDefs() {
        List list = this.f84147f;
        if (list == null || list.isEmpty()) {
            return new d0[0];
        }
        List list2 = this.f84147f;
        return (d0[]) list2.toArray(new d0[list2.size()]);
    }

    public String toString() {
        return "(mode=" + this.f84144c + ")" + this.f84142a;
    }

    public c1 introspectParamNames(lc.z zVar, jc.n0[] n0VarArr) {
        if (this.f84145d == null) {
            r rVar = this.f84142a;
            int parameterCount = rVar.getParameterCount();
            if (parameterCount == 0) {
                jc.n0[] n0VarArr2 = f84141g;
                this.f84146e = n0VarArr2;
                this.f84145d = n0VarArr2;
                return this;
            }
            this.f84146e = new jc.n0[parameterCount];
            this.f84145d = n0VarArr;
            jc.c annotationIntrospector = zVar.getAnnotationIntrospector();
            for (int i10 = 0; i10 < parameterCount; i10++) {
                jc.n0 n0VarFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(rVar.getParameter(i10));
                if (n0VarFindNameForDeserialization != null && !n0VarFindNameForDeserialization.isEmpty()) {
                    this.f84146e[i10] = n0VarFindNameForDeserialization;
                }
            }
        }
        return this;
    }
}
