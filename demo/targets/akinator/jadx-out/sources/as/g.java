package as;

import as.j;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public final pw.k f7955b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7954a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public e[] f7958e = new e[8];

    /* renamed from: f, reason: collision with root package name */
    public int f7959f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f7960g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f7961h = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7956c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f7957d = 4096;

    public g(j.a aVar) {
        this.f7955b = h0.buffer(aVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f7958e.length;
            while (true) {
                length--;
                i11 = this.f7959f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.f7958e[length].f7948c;
                i10 -= i13;
                this.f7961h -= i13;
                this.f7960g--;
                i12++;
            }
            e[] eVarArr = this.f7958e;
            System.arraycopy(eVarArr, i11 + 1, eVarArr, i11 + 1 + i12, this.f7960g);
            this.f7959f += i12;
        }
        return i12;
    }

    public final pw.l b(int i10) throws IOException {
        if (i10 >= 0) {
            e[] eVarArr = i.f7968b;
            if (i10 <= eVarArr.length - 1) {
                return eVarArr[i10].f7946a;
            }
        }
        int length = this.f7959f + 1 + (i10 - i.f7968b.length);
        if (length >= 0) {
            e[] eVarArr2 = this.f7958e;
            if (length < eVarArr2.length) {
                return eVarArr2[length].f7946a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(e eVar) {
        this.f7954a.add(eVar);
        int i10 = eVar.f7948c;
        int i11 = this.f7957d;
        if (i10 > i11) {
            Arrays.fill(this.f7958e, (Object) null);
            this.f7959f = this.f7958e.length - 1;
            this.f7960g = 0;
            this.f7961h = 0;
            return;
        }
        a((this.f7961h + i10) - i11);
        int i12 = this.f7960g + 1;
        e[] eVarArr = this.f7958e;
        if (i12 > eVarArr.length) {
            e[] eVarArr2 = new e[eVarArr.length * 2];
            System.arraycopy(eVarArr, 0, eVarArr2, eVarArr.length, eVarArr.length);
            this.f7959f = this.f7958e.length - 1;
            this.f7958e = eVarArr2;
        }
        int i13 = this.f7959f;
        this.f7959f = i13 - 1;
        this.f7958e[i13] = eVar;
        this.f7960g++;
        this.f7961h += i10;
    }

    public final pw.l d() {
        pw.k kVar = this.f7955b;
        byte b10 = kVar.readByte();
        int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        boolean z10 = (b10 & 128) == 128;
        int iE = e(i10, 127);
        if (!z10) {
            return kVar.readByteString(iE);
        }
        o oVar = o.get();
        byte[] byteArray = kVar.readByteArray(iE);
        oVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n nVar = oVar.f7997a;
        n nVar2 = nVar;
        int i11 = 0;
        int i12 = 0;
        for (byte b11 : byteArray) {
            i11 = (i11 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            i12 += 8;
            while (i12 >= 8) {
                nVar2 = ((n[]) nVar2.f7993c)[(i11 >>> (i12 - 8)) & 255];
                if (((n[]) nVar2.f7993c) == null) {
                    byteArrayOutputStream.write(nVar2.f7991a);
                    i12 -= nVar2.f7992b;
                    nVar2 = nVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            n nVar3 = ((n[]) nVar2.f7993c)[(i11 << (8 - i12)) & 255];
            n[] nVarArr = (n[]) nVar3.f7993c;
            int i13 = nVar3.f7992b;
            if (nVarArr != null || i13 > i12) {
                break;
            }
            byteArrayOutputStream.write(nVar3.f7991a);
            i12 -= i13;
            nVar2 = nVar;
        }
        return pw.l.of(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b10 = this.f7955b.readByte();
            int i14 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((b10 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b10 & AbstractJsonLexerKt.TC_INVALID) << i13;
            i13 += 7;
        }
    }

    public List<e> getAndResetHeaderList() {
        ArrayList arrayList = this.f7954a;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }
}
