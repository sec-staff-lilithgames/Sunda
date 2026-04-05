package cd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends f {

    /* renamed from: m, reason: collision with root package name */
    public final int f12155m;

    /* renamed from: n, reason: collision with root package name */
    public jc.o f12156n;

    public k(int i10) {
        super(Object.class, r.emptyBindings(), s.unknownType(), null, 1, null, null, false);
        this.f12155m = i10;
    }

    public jc.o actualType() {
        return this.f12156n;
    }

    @Override // cd.o
    public final String c() {
        return toString();
    }

    public final void d() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(getClass().getName()));
    }

    @Override // cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        sb2.append('$');
        sb2.append(this.f12155m + 1);
        return sb2;
    }

    @Override // cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        return getErasedSignature(sb2);
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return false;
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        d();
        throw null;
    }

    @Override // jc.o
    public String toString() {
        return getErasedSignature(new StringBuilder()).toString();
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) {
        d();
        throw null;
    }

    @Override // jc.o
    public jc.o withContentTypeHandler(Object obj) {
        d();
        throw null;
    }

    @Override // jc.o
    public jc.o withContentValueHandler(Object obj) {
        d();
        throw null;
    }

    @Override // jc.o
    public jc.o withStaticTyping() {
        d();
        throw null;
    }

    @Override // jc.o
    public jc.o withTypeHandler(Object obj) {
        d();
        throw null;
    }

    @Override // jc.o
    public jc.o withValueHandler(Object obj) {
        d();
        throw null;
    }

    public void actualType(jc.o oVar) {
        this.f12156n = oVar;
    }
}
