package ub;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final p f88312i = new p(cc.f.unknown(), -1L, -1L, -1, -1);

    /* renamed from: b, reason: collision with root package name */
    public final long f88313b;

    /* renamed from: c, reason: collision with root package name */
    public final long f88314c;

    /* renamed from: e, reason: collision with root package name */
    public final int f88315e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88316f;

    /* renamed from: g, reason: collision with root package name */
    public final cc.f f88317g;

    /* renamed from: h, reason: collision with root package name */
    public transient String f88318h;

    public p(cc.f fVar, long j10, int i10, int i11) {
        this(fVar, -1L, j10, i10, i11);
    }

    public StringBuilder appendOffsetDescription(StringBuilder sb2) {
        boolean zHasTextualContent = this.f88317g.hasTextualContent();
        int i10 = this.f88316f;
        int i11 = this.f88315e;
        if (zHasTextualContent) {
            sb2.append("line: ");
            if (i11 >= 0) {
                sb2.append(i11);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            if (i10 >= 0) {
                sb2.append(i10);
                return sb2;
            }
            sb2.append("UNKNOWN");
            return sb2;
        }
        if (i11 > 0) {
            sb2.append("line: ");
            sb2.append(i11);
            if (i10 > 0) {
                sb2.append(", column: ");
                sb2.append(i10);
            }
            return sb2;
        }
        sb2.append("byte offset: #");
        long j10 = this.f88313b;
        if (j10 >= 0) {
            sb2.append(j10);
            return sb2;
        }
        sb2.append("UNKNOWN");
        return sb2;
    }

    public cc.f contentReference() {
        return this.f88317g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        cc.f fVar = pVar.f88317g;
        cc.f fVar2 = this.f88317g;
        if (fVar2 == null) {
            if (fVar != null) {
                return false;
            }
        } else if (!fVar2.equals(fVar)) {
            return false;
        }
        return this.f88315e == pVar.f88315e && this.f88316f == pVar.f88316f && this.f88314c == pVar.f88314c && this.f88313b == pVar.f88313b;
    }

    public long getByteOffset() {
        return this.f88313b;
    }

    public long getCharOffset() {
        return this.f88314c;
    }

    public int getColumnNr() {
        return this.f88316f;
    }

    public int getLineNr() {
        return this.f88315e;
    }

    @Deprecated
    public Object getSourceRef() {
        return this.f88317g.getRawContent();
    }

    public int hashCode() {
        return ((((this.f88317g == null ? 1 : 2) ^ this.f88315e) + this.f88316f) ^ ((int) this.f88314c)) + ((int) this.f88313b);
    }

    public String offsetDescription() {
        return appendOffsetDescription(new StringBuilder(40)).toString();
    }

    public String sourceDescription() {
        if (this.f88318h == null) {
            this.f88318h = this.f88317g.buildSourceDescription();
        }
        return this.f88318h;
    }

    public String toString() {
        String strSourceDescription = sourceDescription();
        StringBuilder sb2 = new StringBuilder(strSourceDescription.length() + 40);
        w0.i.h(sb2, "[Source: ", strSourceDescription, "; ");
        StringBuilder sbAppendOffsetDescription = appendOffsetDescription(sb2);
        sbAppendOffsetDescription.append(AbstractJsonLexerKt.END_LIST);
        return sbAppendOffsetDescription.toString();
    }

    public p(cc.f fVar, long j10, long j11, int i10, int i11) {
        this.f88317g = fVar == null ? cc.f.unknown() : fVar;
        this.f88313b = j10;
        this.f88314c = j11;
        this.f88315e = i10;
        this.f88316f = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public p(Object obj, long j10, int i10, int i11) {
        cc.f fVarConstruct;
        if (obj instanceof cc.f) {
            fVarConstruct = (cc.f) obj;
        } else {
            fVarConstruct = cc.f.construct(false, obj, e.defaults());
        }
        this(fVarConstruct, j10, i10, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public p(Object obj, long j10, long j11, int i10, int i11) {
        cc.f fVarConstruct;
        if (obj instanceof cc.f) {
            fVarConstruct = (cc.f) obj;
        } else {
            fVarConstruct = cc.f.construct(false, obj, e.defaults());
        }
        this(fVarConstruct, j10, j11, i10, i11);
    }
}
