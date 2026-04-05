package fw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pw.b1;
import pw.h0;
import uu.f0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f56146a;

    /* renamed from: b, reason: collision with root package name */
    public int f56147b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f56148c;

    /* renamed from: d, reason: collision with root package name */
    public final pw.k f56149d;

    /* renamed from: e, reason: collision with root package name */
    public f[] f56150e;

    /* renamed from: f, reason: collision with root package name */
    public int f56151f;

    /* renamed from: g, reason: collision with root package name */
    public int f56152g;

    /* renamed from: h, reason: collision with root package name */
    public int f56153h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(b1 source, int i10) {
        this(source, i10, 0, 4, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f56150e.length;
            while (true) {
                length--;
                i11 = this.f56151f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                f fVar = this.f56150e[length];
                kotlin.jvm.internal.e0.checkNotNull(fVar);
                int i13 = fVar.f56145c;
                i10 -= i13;
                this.f56153h -= i13;
                this.f56152g--;
                i12++;
            }
            f[] fVarArr = this.f56150e;
            System.arraycopy(fVarArr, i11 + 1, fVarArr, i11 + 1 + i12, this.f56152g);
            this.f56151f += i12;
        }
        return i12;
    }

    public final pw.l b(int i10) throws IOException {
        if (i10 >= 0) {
            i iVar = i.f56163a;
            if (i10 <= iVar.getSTATIC_HEADER_TABLE().length - 1) {
                return iVar.getSTATIC_HEADER_TABLE()[i10].f56143a;
            }
        }
        int length = this.f56151f + 1 + (i10 - i.f56163a.getSTATIC_HEADER_TABLE().length);
        if (length >= 0) {
            f[] fVarArr = this.f56150e;
            if (length < fVarArr.length) {
                f fVar = fVarArr[length];
                kotlin.jvm.internal.e0.checkNotNull(fVar);
                return fVar.f56143a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(f fVar) {
        this.f56148c.add(fVar);
        int i10 = fVar.f56145c;
        int i11 = this.f56147b;
        if (i10 > i11) {
            f0.fill$default(this.f56150e, (Object) null, 0, 0, 6, (Object) null);
            this.f56151f = this.f56150e.length - 1;
            this.f56152g = 0;
            this.f56153h = 0;
            return;
        }
        a((this.f56153h + i10) - i11);
        int i12 = this.f56152g + 1;
        f[] fVarArr = this.f56150e;
        if (i12 > fVarArr.length) {
            f[] fVarArr2 = new f[fVarArr.length * 2];
            System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
            this.f56151f = this.f56150e.length - 1;
            this.f56150e = fVarArr2;
        }
        int i13 = this.f56151f;
        this.f56151f = i13 - 1;
        this.f56150e[i13] = fVar;
        this.f56152g++;
        this.f56153h += i10;
    }

    public final List<f> getAndResetHeaderList() {
        ArrayList arrayList = this.f56148c;
        List<f> list = y0.toList(arrayList);
        arrayList.clear();
        return list;
    }

    public final int maxDynamicTableByteCount() {
        return this.f56147b;
    }

    public final pw.l readByteString() throws IOException {
        pw.k kVar = this.f56149d;
        int iAnd = yv.h.and(kVar.readByte(), 255);
        boolean z10 = (iAnd & 128) == 128;
        long j10 = readInt(iAnd, 127);
        if (!z10) {
            return kVar.readByteString(j10);
        }
        pw.g gVar = new pw.g();
        a0.f56118a.decode(kVar, j10, gVar);
        return gVar.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        throw new java.io.IOException(a.b.e(r0, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void readHeaders() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.g.readHeaders():void");
    }

    public final int readInt(int i10, int i11) throws IOException {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            int iAnd = yv.h.and(this.f56149d.readByte(), 255);
            if ((iAnd & 128) == 0) {
                return i11 + (iAnd << i13);
            }
            i11 += (iAnd & 127) << i13;
            i13 += 7;
        }
    }

    public g(b1 source, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        this.f56146a = i10;
        this.f56147b = i11;
        this.f56148c = new ArrayList();
        this.f56149d = h0.buffer(source);
        this.f56150e = new f[8];
        this.f56151f = 7;
    }

    public /* synthetic */ g(b1 b1Var, int i10, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this(b1Var, i10, (i12 & 4) != 0 ? i10 : i11);
    }
}
