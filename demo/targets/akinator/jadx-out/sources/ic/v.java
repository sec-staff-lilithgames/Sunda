package ic;

import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v implements ub.b0, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public String f59526b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f59527c;

    public v() {
        this(ub.b0.X8.toString());
    }

    public void setRootValueSeparator(String str) {
        this.f59526b = str;
    }

    public v setSeparators(i0 i0Var) {
        this.f59527c = i0Var;
        return this;
    }

    @Override // ub.b0
    public void writeArrayValueSeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59527c.getArrayValueSeparator());
    }

    @Override // ub.b0
    public void writeEndArray(ub.o oVar, int i10) throws IOException {
        oVar.writeRaw(AbstractJsonLexerKt.END_LIST);
    }

    @Override // ub.b0
    public void writeEndObject(ub.o oVar, int i10) throws IOException {
        oVar.writeRaw(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // ub.b0
    public void writeObjectEntrySeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59527c.getObjectEntrySeparator());
    }

    @Override // ub.b0
    public void writeObjectFieldValueSeparator(ub.o oVar) throws IOException {
        oVar.writeRaw(this.f59527c.getObjectFieldValueSeparator());
    }

    @Override // ub.b0
    public void writeRootValueSeparator(ub.o oVar) throws IOException {
        String str = this.f59526b;
        if (str != null) {
            oVar.writeRaw(str);
        }
    }

    @Override // ub.b0
    public void writeStartArray(ub.o oVar) throws IOException {
        oVar.writeRaw(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // ub.b0
    public void writeStartObject(ub.o oVar) throws IOException {
        oVar.writeRaw(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public v(String str) {
        this.f59526b = str;
        this.f59527c = ub.b0.W8.withObjectFieldValueSpacing(h0.NONE);
    }

    @Override // ub.b0
    public void beforeArrayValues(ub.o oVar) throws IOException {
    }

    @Override // ub.b0
    public void beforeObjectEntries(ub.o oVar) throws IOException {
    }
}
