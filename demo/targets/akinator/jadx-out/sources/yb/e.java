package yb;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import ub.o;
import ub.x;
import ub.y;
import ub.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends y {

    /* renamed from: d, reason: collision with root package name */
    public final e f94293d;

    /* renamed from: e, reason: collision with root package name */
    public e f94294e;

    /* renamed from: f, reason: collision with root package name */
    public String f94295f;

    /* renamed from: g, reason: collision with root package name */
    public d f94296g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f94297h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94298i;

    public e(int i10, e eVar, d dVar, boolean z10) {
        this.f88378a = i10;
        this.f94293d = eVar;
        this.f88380c = eVar == null ? 0 : eVar.f88380c + 1;
        this.f94296g = dVar;
        this.f88379b = -1;
        this.f94297h = z10;
        this.f94298i = false;
    }

    public static e createRootContext(d dVar) {
        return new e(0, null, dVar, true);
    }

    public final void a(o oVar) throws IOException {
        d dVar = this.f94296g;
        if (dVar == null || dVar == d.f94292a) {
            return;
        }
        e eVar = this.f94293d;
        if (eVar != null) {
            eVar.a(oVar);
        }
        if (this.f94297h) {
            if (this.f94298i) {
                this.f94298i = false;
                oVar.writeFieldName(this.f94295f);
                return;
            }
            return;
        }
        this.f94297h = true;
        int i10 = this.f88378a;
        if (i10 != 2) {
            if (i10 == 1) {
                oVar.writeStartArray();
            }
        } else {
            oVar.writeStartObject();
            if (this.f94298i) {
                this.f94298i = false;
                oVar.writeFieldName(this.f94295f);
            }
        }
    }

    public final void b(StringBuilder sb2) {
        e eVar = this.f94293d;
        if (eVar != null) {
            eVar.b(sb2);
        }
        int i10 = this.f88378a;
        if (i10 != 2) {
            if (i10 != 1) {
                sb2.append("/");
                return;
            }
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(getCurrentIndex());
            sb2.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this.f94295f != null) {
            sb2.append(AbstractJsonLexerKt.STRING);
            sb2.append(this.f94295f);
            sb2.append(AbstractJsonLexerKt.STRING);
        } else {
            sb2.append('?');
        }
        sb2.append(AbstractJsonLexerKt.END_OBJ);
    }

    public d checkValue(d dVar) {
        int i10 = this.f88378a;
        if (i10 == 2) {
            return dVar;
        }
        int i11 = this.f88379b + 1;
        this.f88379b = i11;
        return i10 == 1 ? dVar.includeElement(i11) : dVar.includeRootValue(i11);
    }

    public e closeArray(o oVar) throws IOException {
        boolean z10 = this.f94297h;
        e eVar = this.f94293d;
        d dVar = d.f94292a;
        if (z10) {
            oVar.writeEndArray();
        } else {
            d dVar2 = this.f94296g;
            if (dVar2 != null && dVar2 != dVar && dVar2.includeEmptyArray(hasCurrentIndex())) {
                if (eVar != null) {
                    eVar.a(oVar);
                }
                oVar.writeStartArray();
                oVar.writeEndArray();
            }
        }
        d dVar3 = this.f94296g;
        if (dVar3 != null && dVar3 != dVar) {
            dVar3.filterFinishArray();
        }
        return eVar;
    }

    public e closeObject(o oVar) throws IOException {
        boolean z10 = this.f94297h;
        e eVar = this.f94293d;
        d dVar = d.f94292a;
        if (z10) {
            oVar.writeEndObject();
        } else {
            d dVar2 = this.f94296g;
            if (dVar2 != null && dVar2 != dVar && dVar2.includeEmptyObject(hasCurrentName())) {
                if (eVar != null) {
                    eVar.a(oVar);
                }
                oVar.writeStartObject();
                oVar.writeEndObject();
            }
        }
        d dVar3 = this.f94296g;
        if (dVar3 != null && dVar3 != dVar) {
            dVar3.filterFinishObject();
        }
        return eVar;
    }

    public e createChildArrayContext(d dVar, boolean z10) {
        e eVar = this.f94294e;
        if (eVar == null) {
            e eVar2 = new e(1, this, dVar, z10);
            this.f94294e = eVar2;
            return eVar2;
        }
        eVar.f88378a = 1;
        eVar.f94296g = dVar;
        eVar.f88379b = -1;
        eVar.f94295f = null;
        eVar.f94297h = z10;
        eVar.f94298i = false;
        return eVar;
    }

    public e createChildObjectContext(d dVar, boolean z10) {
        e eVar = this.f94294e;
        if (eVar == null) {
            e eVar2 = new e(2, this, dVar, z10);
            this.f94294e = eVar2;
            return eVar2;
        }
        eVar.f88378a = 2;
        eVar.f94296g = dVar;
        eVar.f88379b = -1;
        eVar.f94295f = null;
        eVar.f94297h = z10;
        eVar.f94298i = false;
        return eVar;
    }

    public void ensureFieldNameWritten(o oVar) throws IOException {
        if (this.f94298i) {
            this.f94298i = false;
            oVar.writeFieldName(this.f94295f);
        }
    }

    public e findChildOf(e eVar) {
        e eVar2 = this.f94293d;
        if (eVar2 == eVar) {
            return this;
        }
        while (eVar2 != null) {
            e eVar3 = eVar2.f94293d;
            if (eVar3 == eVar) {
                return eVar2;
            }
            eVar2 = eVar3;
        }
        return null;
    }

    @Override // ub.y
    public final String getCurrentName() {
        return this.f94295f;
    }

    @Override // ub.y
    public Object getCurrentValue() {
        return null;
    }

    public d getFilter() {
        return this.f94296g;
    }

    @Override // ub.y
    public boolean hasCurrentName() {
        return this.f94295f != null;
    }

    public boolean isStartHandled() {
        return this.f94297h;
    }

    public z nextTokenToRead() {
        if (!this.f94297h) {
            this.f94297h = true;
            return this.f88378a == 2 ? z.START_OBJECT : z.START_ARRAY;
        }
        if (!this.f94298i || this.f88378a != 2) {
            return null;
        }
        this.f94298i = false;
        return z.FIELD_NAME;
    }

    public d setFieldName(String str) throws x {
        this.f94295f = str;
        this.f94298i = true;
        return this.f94296g;
    }

    public void skipParentChecks() {
        this.f94296g = null;
        for (e eVar = this.f94293d; eVar != null; eVar = eVar.f94293d) {
            eVar.f94296g = null;
        }
    }

    @Override // ub.y
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        b(sb2);
        return sb2.toString();
    }

    public void writePath(o oVar) throws IOException {
        d dVar = this.f94296g;
        if (dVar == null || dVar == d.f94292a) {
            return;
        }
        e eVar = this.f94293d;
        if (eVar != null) {
            eVar.a(oVar);
        }
        if (this.f94297h) {
            if (this.f94298i) {
                oVar.writeFieldName(this.f94295f);
                return;
            }
            return;
        }
        this.f94297h = true;
        int i10 = this.f88378a;
        if (i10 == 2) {
            oVar.writeStartObject();
            oVar.writeFieldName(this.f94295f);
        } else if (i10 == 1) {
            oVar.writeStartArray();
        }
    }

    @Override // ub.y
    public final e getParent() {
        return this.f94293d;
    }

    @Override // ub.y
    public void setCurrentValue(Object obj) {
    }
}
