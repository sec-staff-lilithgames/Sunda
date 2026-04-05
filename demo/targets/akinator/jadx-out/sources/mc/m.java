package mc;

import com.ironsource.C3191e4;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import jc.h0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final h0[] f74204a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.d f74205b;

    /* renamed from: c, reason: collision with root package name */
    public final zb.d f74206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74207d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends zb.b {
        public a(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public n createMatcher(h0 h0Var, zb.d dVar) {
            int i10 = this.f97745d;
            int i11 = this.f97744c;
            return new n(this.f97742a, this.f97743b, i11, i10 - i11, h0Var, dVar);
        }

        public a(byte[] bArr) {
            super(bArr);
        }

        public a(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }
    }

    public m(h0... h0VarArr) {
        this(h0VarArr, zb.d.f97750f, zb.d.f97749e, 64);
    }

    public final n a(a aVar) throws IOException {
        h0[] h0VarArr = this.f74204a;
        int length = h0VarArr.length;
        h0 h0Var = null;
        int i10 = 0;
        zb.d dVar = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            h0 h0Var2 = h0VarArr[i10];
            aVar.reset();
            zb.d dVarHasFormat = h0Var2.getFactory().hasFormat(aVar);
            if (dVarHasFormat != null && dVarHasFormat.ordinal() >= this.f74206c.ordinal() && (h0Var == null || dVar.ordinal() < dVarHasFormat.ordinal())) {
                if (dVarHasFormat.ordinal() >= this.f74205b.ordinal()) {
                    h0Var = h0Var2;
                    dVar = dVarHasFormat;
                    break;
                }
                h0Var = h0Var2;
                dVar = dVarHasFormat;
            }
            i10++;
        }
        return aVar.createMatcher(h0Var, dVar);
    }

    public n findFormat(InputStream inputStream) throws IOException {
        return a(new a(inputStream, new byte[this.f74207d]));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        h0[] h0VarArr = this.f74204a;
        int length = h0VarArr.length;
        if (length > 0) {
            sb2.append(h0VarArr[0].getFactory().getFormatName());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(h0VarArr[i10].getFactory().getFormatName());
            }
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    public m with(h0[] h0VarArr) {
        return new m(h0VarArr, this.f74205b, this.f74206c, this.f74207d);
    }

    public m withMaxInputLookahead(int i10) {
        if (i10 == this.f74207d) {
            return this;
        }
        return new m(this.f74204a, this.f74205b, this.f74206c, i10);
    }

    public m withMinimalMatch(zb.d dVar) {
        if (dVar == this.f74206c) {
            return this;
        }
        return new m(this.f74204a, this.f74205b, dVar, this.f74207d);
    }

    public m withOptimalMatch(zb.d dVar) {
        if (dVar == this.f74205b) {
            return this;
        }
        return new m(this.f74204a, dVar, this.f74206c, this.f74207d);
    }

    public m withType(jc.o oVar) {
        h0[] h0VarArr = this.f74204a;
        int length = h0VarArr.length;
        h0[] h0VarArr2 = new h0[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0VarArr2[i10] = h0VarArr[i10].forType(oVar);
        }
        return new m(h0VarArr2, this.f74205b, this.f74206c, this.f74207d);
    }

    public m(Collection<h0> collection) {
        this((h0[]) collection.toArray(new h0[collection.size()]));
    }

    public n findFormat(byte[] bArr) throws IOException {
        return a(new a(bArr));
    }

    public m with(jc.j jVar) {
        h0[] h0VarArr = this.f74204a;
        int length = h0VarArr.length;
        h0[] h0VarArr2 = new h0[length];
        for (int i10 = 0; i10 < length; i10++) {
            h0VarArr2[i10] = h0VarArr[i10].with(jVar);
        }
        return new m(h0VarArr2, this.f74205b, this.f74206c, this.f74207d);
    }

    public m(h0[] h0VarArr, zb.d dVar, zb.d dVar2, int i10) {
        this.f74204a = h0VarArr;
        this.f74205b = dVar;
        this.f74206c = dVar2;
        this.f74207d = i10;
    }

    public n findFormat(byte[] bArr, int i10, int i11) throws IOException {
        return a(new a(bArr, i10, i11));
    }
}
