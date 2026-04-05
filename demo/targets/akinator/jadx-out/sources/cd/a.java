package cd;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends o {

    /* renamed from: m, reason: collision with root package name */
    public final jc.o f12129m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f12130n;

    public a(jc.o oVar, r rVar, Object obj, Object obj2, Object obj3, boolean z10) {
        super(obj.getClass(), rVar, null, null, oVar.hashCode(), obj2, obj3, z10);
        this.f12129m = oVar;
        this.f12130n = obj;
    }

    public static a construct(jc.o oVar, r rVar) {
        return construct(oVar, rVar, null, null);
    }

    @Override // jc.o
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == a.class) {
            return this.f12129m.equals(((a) obj).f12129m);
        }
        return false;
    }

    @Override // jc.o
    public Object getContentTypeHandler() {
        return this.f12129m.getTypeHandler();
    }

    @Override // jc.o
    public Object getContentValueHandler() {
        return this.f12129m.getValueHandler();
    }

    public Object[] getEmptyArray() {
        return (Object[]) this.f12130n;
    }

    @Override // cd.o, jc.o
    public StringBuilder getErasedSignature(StringBuilder sb2) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        return this.f12129m.getErasedSignature(sb2);
    }

    @Override // cd.o, jc.o
    public StringBuilder getGenericSignature(StringBuilder sb2) {
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        return this.f12129m.getGenericSignature(sb2);
    }

    @Override // jc.o, hc.a
    public boolean hasGenericTypes() {
        return this.f12129m.hasGenericTypes();
    }

    @Override // jc.o
    public boolean hasHandlers() {
        return super.hasHandlers() || this.f12129m.hasHandlers();
    }

    @Override // jc.o, hc.a
    public boolean isAbstract() {
        return false;
    }

    @Override // jc.o, hc.a
    public boolean isArrayType() {
        return true;
    }

    @Override // jc.o, hc.a
    public boolean isConcrete() {
        return true;
    }

    @Override // jc.o, hc.a
    public boolean isContainerType() {
        return true;
    }

    @Override // jc.o
    public jc.o refine(Class<?> cls, r rVar, jc.o oVar, jc.o[] oVarArr) {
        return null;
    }

    @Override // jc.o
    public String toString() {
        return "[array type, component type: " + this.f12129m + C3191e4.i.f36531e;
    }

    @Override // jc.o
    public jc.o withContentType(jc.o oVar) throws NegativeArraySizeException {
        return new a(oVar, this.f12164j, Array.newInstance(oVar.getRawClass(), 0), this.f69388e, this.f69389f, this.f69390g);
    }

    public static a construct(jc.o oVar, r rVar, Object obj, Object obj2) {
        return new a(oVar, rVar, Array.newInstance(oVar.getRawClass(), 0), obj, obj2, false);
    }

    @Override // jc.o, hc.a
    public jc.o getContentType() {
        return this.f12129m;
    }

    @Override // jc.o
    public a withContentTypeHandler(Object obj) {
        jc.o oVar = this.f12129m;
        if (obj == oVar.getTypeHandler()) {
            return this;
        }
        return new a(oVar.withTypeHandler(obj), this.f12164j, this.f12130n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public a withContentValueHandler(Object obj) {
        jc.o oVar = this.f12129m;
        if (obj == oVar.getValueHandler()) {
            return this;
        }
        return new a(oVar.withValueHandler(obj), this.f12164j, this.f12130n, this.f69388e, this.f69389f, this.f69390g);
    }

    @Override // jc.o
    public a withStaticTyping() {
        if (this.f69390g) {
            return this;
        }
        return new a(this.f12129m.withStaticTyping(), this.f12164j, this.f12130n, this.f69388e, this.f69389f, true);
    }

    @Override // jc.o
    public a withTypeHandler(Object obj) {
        if (obj == this.f69389f) {
            return this;
        }
        return new a(this.f12129m, this.f12164j, this.f12130n, this.f69388e, obj, this.f69390g);
    }

    @Override // jc.o
    public a withValueHandler(Object obj) {
        if (obj == this.f69388e) {
            return this;
        }
        return new a(this.f12129m, this.f12164j, this.f12130n, obj, this.f69389f, this.f69390g);
    }
}
