package fw;

import java.io.IOException;
import java.util.Arrays;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56154a;

    /* renamed from: b, reason: collision with root package name */
    public final pw.g f56155b;

    /* renamed from: c, reason: collision with root package name */
    public int f56156c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f56157d;

    /* renamed from: e, reason: collision with root package name */
    public int f56158e;

    /* renamed from: f, reason: collision with root package name */
    public f[] f56159f;

    /* renamed from: g, reason: collision with root package name */
    public int f56160g;

    /* renamed from: h, reason: collision with root package name */
    public int f56161h;

    /* renamed from: i, reason: collision with root package name */
    public int f56162i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(int i10, pw.g out) {
        this(i10, false, out, 2, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f56159f.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f56160g;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                f fVar = this.f56159f[length];
                kotlin.jvm.internal.e0.checkNotNull(fVar);
                i10 -= fVar.f56145c;
                int i13 = this.f56162i;
                f fVar2 = this.f56159f[length];
                kotlin.jvm.internal.e0.checkNotNull(fVar2);
                this.f56162i = i13 - fVar2.f56145c;
                this.f56161h--;
                i12++;
                length--;
            }
            f[] fVarArr = this.f56159f;
            int i14 = i11 + 1;
            System.arraycopy(fVarArr, i14, fVarArr, i14 + i12, this.f56161h);
            f[] fVarArr2 = this.f56159f;
            int i15 = this.f56160g + 1;
            Arrays.fill(fVarArr2, i15, i15 + i12, (Object) null);
            this.f56160g += i12;
        }
    }

    public final void b(f fVar) {
        int i10 = fVar.f56145c;
        int i11 = this.f56158e;
        if (i10 > i11) {
            f0.fill$default(this.f56159f, (Object) null, 0, 0, 6, (Object) null);
            this.f56160g = this.f56159f.length - 1;
            this.f56161h = 0;
            this.f56162i = 0;
            return;
        }
        a((this.f56162i + i10) - i11);
        int i12 = this.f56161h + 1;
        f[] fVarArr = this.f56159f;
        if (i12 > fVarArr.length) {
            f[] fVarArr2 = new f[fVarArr.length * 2];
            System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
            this.f56160g = this.f56159f.length - 1;
            this.f56159f = fVarArr2;
        }
        int i13 = this.f56160g;
        this.f56160g = i13 - 1;
        this.f56159f[i13] = fVar;
        this.f56161h++;
        this.f56162i += i10;
    }

    public final void resizeHeaderTable(int i10) {
        int iMin = Math.min(i10, 16384);
        int i11 = this.f56158e;
        if (i11 == iMin) {
            return;
        }
        if (iMin < i11) {
            this.f56156c = Math.min(this.f56156c, iMin);
        }
        this.f56157d = true;
        this.f56158e = iMin;
        int i12 = this.f56162i;
        if (iMin < i12) {
            if (iMin != 0) {
                a(i12 - iMin);
                return;
            }
            f0.fill$default(this.f56159f, (Object) null, 0, 0, 6, (Object) null);
            this.f56160g = this.f56159f.length - 1;
            this.f56161h = 0;
            this.f56162i = 0;
        }
    }

    public final void writeByteString(pw.l data) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        boolean z10 = this.f56154a;
        pw.g gVar = this.f56155b;
        if (z10) {
            a0 a0Var = a0.f56118a;
            if (a0Var.encodedLength(data) < data.size()) {
                pw.g gVar2 = new pw.g();
                a0Var.encode(data, gVar2);
                pw.l byteString = gVar2.readByteString();
                writeInt(byteString.size(), 127, 128);
                gVar.write(byteString);
                return;
            }
        }
        writeInt(data.size(), 127, 0);
        gVar.write(data);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeHeaders(java.util.List<fw.f> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.h.writeHeaders(java.util.List):void");
    }

    public final void writeInt(int i10, int i11, int i12) {
        pw.g gVar = this.f56155b;
        if (i10 < i11) {
            gVar.writeByte(i10 | i12);
            return;
        }
        gVar.writeByte(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            gVar.writeByte(128 | (i13 & 127));
            i13 >>>= 7;
        }
        gVar.writeByte(i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(pw.g out) {
        this(0, false, out, 3, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
    }

    public h(int i10, boolean z10, pw.g out) {
        kotlin.jvm.internal.e0.checkNotNullParameter(out, "out");
        this.f56154a = z10;
        this.f56155b = out;
        this.f56156c = Integer.MAX_VALUE;
        this.f56158e = i10;
        this.f56159f = new f[8];
        this.f56160g = 7;
    }

    public /* synthetic */ h(int i10, boolean z10, pw.g gVar, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, gVar);
    }
}
