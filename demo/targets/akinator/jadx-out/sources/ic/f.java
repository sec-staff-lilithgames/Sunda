package ic;

import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f implements ub.b0, h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public g f59466b;

    /* renamed from: c, reason: collision with root package name */
    public g f59467c;

    /* renamed from: e, reason: collision with root package name */
    public ub.c0 f59468e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59469f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f59470g;

    /* renamed from: h, reason: collision with root package name */
    public i0 f59471h;

    /* renamed from: i, reason: collision with root package name */
    public String f59472i;

    /* renamed from: j, reason: collision with root package name */
    public String f59473j;

    /* renamed from: k, reason: collision with root package name */
    public String f59474k;

    /* renamed from: l, reason: collision with root package name */
    public String f59475l;

    /* renamed from: m, reason: collision with root package name */
    public String f59476m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f59477c = new a();

        @Override // ic.f.b, ic.g
        public boolean isInline() {
            return true;
        }

        @Override // ic.f.b, ic.g
        public void writeIndentation(ub.o oVar, int i10) throws IOException {
            oVar.writeRaw(' ');
        }
    }

    static {
        new cc.q(" ");
    }

    public f() {
        this(ub.b0.W8);
    }

    @Override // ub.b0
    public void beforeArrayValues(ub.o oVar) throws IOException {
        this.f59466b.writeIndentation(oVar, this.f59470g);
    }

    @Override // ub.b0
    public void beforeObjectEntries(ub.o oVar) throws IOException {
        this.f59467c.writeIndentation(oVar, this.f59470g);
    }

    public void indentArraysWith(g gVar) {
        if (gVar == null) {
            gVar = b.f59478b;
        }
        this.f59466b = gVar;
    }

    public void indentObjectsWith(g gVar) {
        if (gVar == null) {
            gVar = b.f59478b;
        }
        this.f59467c = gVar;
    }

    public f withArrayIndenter(g gVar) {
        if (gVar == null) {
            gVar = b.f59478b;
        }
        if (this.f59466b == gVar) {
            return this;
        }
        f fVar = new f(this);
        fVar.f59466b = gVar;
        return fVar;
    }

    public f withObjectIndenter(g gVar) {
        if (gVar == null) {
            gVar = b.f59478b;
        }
        if (this.f59467c == gVar) {
            return this;
        }
        f fVar = new f(this);
        fVar.f59467c = gVar;
        return fVar;
    }

    @Deprecated
    public f withRootSeparator(ub.c0 c0Var) {
        ub.c0 c0Var2 = this.f59468e;
        if (c0Var2 == c0Var || (c0Var != null && c0Var.equals(c0Var2))) {
            return this;
        }
        return new f(this).withSeparators(this.f59471h.withRootSeparator(c0Var == null ? null : c0Var.getValue()));
    }

    public f withSeparators(i0 i0Var) {
        f fVar = new f(this);
        fVar.f59471h = i0Var;
        fVar.f59468e = i0Var.getRootSeparator() == null ? null : new cc.q(i0Var.getRootSeparator());
        fVar.f59472i = i0Var.getObjectFieldValueSpacing().apply(i0Var.getObjectFieldValueSeparator());
        fVar.f59473j = i0Var.getObjectEntrySpacing().apply(i0Var.getObjectEntrySeparator());
        fVar.f59474k = i0Var.getObjectEmptySeparator();
        fVar.f59475l = i0Var.getArrayValueSpacing().apply(i0Var.getArrayValueSeparator());
        fVar.f59476m = i0Var.getArrayEmptySeparator();
        return fVar;
    }

    @Deprecated
    public f withSpacesInObjectEntries() {
        if (this.f59469f) {
            return this;
        }
        f fVarWithSeparators = withSeparators(this.f59471h.withObjectFieldValueSpacing(h0.BOTH));
        fVarWithSeparators.f59469f = true;
        return fVarWithSeparators;
    }

    @Deprecated
    public f withoutSpacesInObjectEntries() {
        if (!this.f59469f) {
            return this;
        }
        f fVarWithSeparators = withSeparators(this.f59471h.withObjectFieldValueSpacing(h0.NONE));
        fVarWithSeparators.f59469f = false;
        return fVarWithSeparators;
    }

    @Override // ub.b0
    public void writeArrayValueSeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59475l);
        this.f59466b.writeIndentation(oVar, this.f59470g);
    }

    @Override // ub.b0
    public void writeEndArray(ub.o oVar, int i10) throws IOException {
        if (!this.f59466b.isInline()) {
            this.f59470g--;
        }
        if (i10 > 0) {
            this.f59466b.writeIndentation(oVar, this.f59470g);
        } else {
            oVar.writeRaw(this.f59476m);
        }
        oVar.writeRaw(AbstractJsonLexerKt.END_LIST);
    }

    @Override // ub.b0
    public void writeEndObject(ub.o oVar, int i10) throws IOException {
        if (!this.f59467c.isInline()) {
            this.f59470g--;
        }
        if (i10 > 0) {
            this.f59467c.writeIndentation(oVar, this.f59470g);
        } else {
            oVar.writeRaw(this.f59474k);
        }
        oVar.writeRaw(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // ub.b0
    public void writeObjectEntrySeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59473j);
        this.f59467c.writeIndentation(oVar, this.f59470g);
    }

    @Override // ub.b0
    public void writeObjectFieldValueSeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59472i);
    }

    @Override // ub.b0
    public void writeRootValueSeparator(ub.o oVar) throws IOException {
        ub.c0 c0Var = this.f59468e;
        if (c0Var != null) {
            oVar.writeRaw(c0Var);
        }
    }

    @Override // ub.b0
    public void writeStartArray(ub.o oVar) throws IOException {
        if (!this.f59466b.isInline()) {
            this.f59470g++;
        }
        oVar.writeRaw(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // ub.b0
    public void writeStartObject(ub.o oVar) throws IOException {
        oVar.writeRaw(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.f59467c.isInline()) {
            return;
        }
        this.f59470g++;
    }

    @Deprecated
    public f(String str) {
        this(str == null ? null : new cc.q(str));
    }

    @Override // ic.h
    public f createInstance() {
        if (getClass() == f.class) {
            return new f(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    @Deprecated
    public f(ub.c0 c0Var) {
        this(ub.b0.W8.withRootSeparator(c0Var.getValue()));
    }

    @Deprecated
    public f(f fVar, ub.c0 c0Var) {
        this.f59466b = a.f59477c;
        this.f59467c = e.f59462h;
        this.f59469f = true;
        this.f59466b = fVar.f59466b;
        this.f59467c = fVar.f59467c;
        this.f59469f = fVar.f59469f;
        this.f59470g = fVar.f59470g;
        this.f59471h = fVar.f59471h;
        this.f59472i = fVar.f59472i;
        this.f59473j = fVar.f59473j;
        this.f59474k = fVar.f59474k;
        this.f59475l = fVar.f59475l;
        this.f59476m = fVar.f59476m;
        this.f59468e = c0Var;
    }

    @Deprecated
    public f withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new cc.q(str));
    }

    public f(i0 i0Var) {
        this.f59466b = a.f59477c;
        this.f59467c = e.f59462h;
        this.f59469f = true;
        this.f59471h = i0Var;
        this.f59468e = i0Var.getRootSeparator() == null ? null : new cc.q(i0Var.getRootSeparator());
        this.f59472i = i0Var.getObjectFieldValueSpacing().apply(i0Var.getObjectFieldValueSeparator());
        this.f59473j = i0Var.getObjectEntrySpacing().apply(i0Var.getObjectEntrySeparator());
        this.f59474k = i0Var.getObjectEmptySeparator();
        this.f59475l = i0Var.getArrayValueSpacing().apply(i0Var.getArrayValueSeparator());
        this.f59476m = i0Var.getArrayEmptySeparator();
    }

    public f(f fVar) {
        this.f59466b = a.f59477c;
        this.f59467c = e.f59462h;
        this.f59469f = true;
        this.f59468e = fVar.f59468e;
        this.f59466b = fVar.f59466b;
        this.f59467c = fVar.f59467c;
        this.f59469f = fVar.f59469f;
        this.f59470g = fVar.f59470g;
        this.f59471h = fVar.f59471h;
        this.f59472i = fVar.f59472i;
        this.f59473j = fVar.f59473j;
        this.f59474k = fVar.f59474k;
        this.f59475l = fVar.f59475l;
        this.f59476m = fVar.f59476m;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements g, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final b f59478b = new b();

        @Override // ic.g
        public boolean isInline() {
            return true;
        }

        @Override // ic.g
        public void writeIndentation(ub.o oVar, int i10) throws IOException {
        }
    }
}
