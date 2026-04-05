package as;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final pw.g f7962a;

    /* renamed from: c, reason: collision with root package name */
    public int f7964c;

    /* renamed from: e, reason: collision with root package name */
    public int f7966e;

    /* renamed from: b, reason: collision with root package name */
    public e[] f7963b = new e[8];

    /* renamed from: d, reason: collision with root package name */
    public int f7965d = 7;

    public h(pw.g gVar) {
        this.f7962a = gVar;
    }

    public final void a(e eVar) {
        int i10;
        int i11 = eVar.f7948c;
        if (i11 > 4096) {
            Arrays.fill(this.f7963b, (Object) null);
            this.f7965d = this.f7963b.length - 1;
            this.f7964c = 0;
            this.f7966e = 0;
            return;
        }
        int i12 = (this.f7966e + i11) - 4096;
        if (i12 > 0) {
            int length = this.f7963b.length - 1;
            int i13 = 0;
            while (true) {
                i10 = this.f7965d;
                if (length < i10 || i12 <= 0) {
                    break;
                }
                int i14 = this.f7963b[length].f7948c;
                i12 -= i14;
                this.f7966e -= i14;
                this.f7964c--;
                i13++;
                length--;
            }
            e[] eVarArr = this.f7963b;
            int i15 = i10 + 1;
            System.arraycopy(eVarArr, i15, eVarArr, i15 + i13, this.f7964c);
            this.f7965d += i13;
        }
        int i16 = this.f7964c + 1;
        e[] eVarArr2 = this.f7963b;
        if (i16 > eVarArr2.length) {
            e[] eVarArr3 = new e[eVarArr2.length * 2];
            System.arraycopy(eVarArr2, 0, eVarArr3, eVarArr2.length, eVarArr2.length);
            this.f7965d = this.f7963b.length - 1;
            this.f7963b = eVarArr3;
        }
        int i17 = this.f7965d;
        this.f7965d = i17 - 1;
        this.f7963b[i17] = eVar;
        this.f7964c++;
        this.f7966e += i11;
    }

    public final void b(pw.l lVar) {
        d(lVar.size(), 127, 0);
        this.f7962a.write(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r14) {
        /*
            r13 = this;
            int r0 = r14.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto Lc9
            java.lang.Object r3 = r14.get(r2)
            as.e r3 = (as.e) r3
            pw.l r4 = r3.f7946a
            pw.l r4 = r4.toAsciiLowercase()
            pw.l r5 = r3.f7947b
            java.util.Map r6 = as.i.f7969c
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = -1
            if (r6 == 0) goto L4e
            int r6 = r6.intValue()
            int r8 = r6 + 1
            r9 = 2
            if (r8 < r9) goto L4b
            r9 = 7
            if (r8 > r9) goto L4b
            as.e[] r9 = as.i.f7968b
            r10 = r9[r6]
            pw.l r10 = r10.f7947b
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L3b
            r6 = r8
            goto L50
        L3b:
            r9 = r9[r8]
            pw.l r9 = r9.f7947b
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L4b
            int r6 = r6 + 2
            r12 = r8
            r8 = r6
            r6 = r12
            goto L50
        L4b:
            r6 = r8
            r8 = r7
            goto L50
        L4e:
            r6 = r7
            r8 = r6
        L50:
            if (r8 != r7) goto L84
            int r9 = r13.f7965d
        L54:
            int r9 = r9 + 1
            as.e[] r10 = r13.f7963b
            int r11 = r10.length
            if (r9 >= r11) goto L84
            r10 = r10[r9]
            pw.l r10 = r10.f7946a
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L54
            as.e[] r10 = r13.f7963b
            r10 = r10[r9]
            pw.l r10 = r10.f7947b
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L79
            int r8 = r13.f7965d
            int r9 = r9 - r8
            as.e[] r8 = as.i.f7968b
            int r8 = r8.length
            int r8 = r8 + r9
            goto L84
        L79:
            if (r6 != r7) goto L54
            int r6 = r13.f7965d
            int r6 = r9 - r6
            as.e[] r10 = as.i.f7968b
            int r10 = r10.length
            int r6 = r6 + r10
            goto L54
        L84:
            if (r8 == r7) goto L8e
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.8E-43)
            r13.d(r8, r3, r4)
            goto Lc5
        L8e:
            r8 = 64
            if (r6 != r7) goto La1
            pw.g r6 = r13.f7962a
            r6.writeByte(r8)
            r13.b(r4)
            r13.b(r5)
            r13.a(r3)
            goto Lc5
        La1:
            pw.l r7 = as.i.f7967a
            boolean r7 = r4.startsWith(r7)
            if (r7 == 0) goto Lba
            pw.l r7 = as.e.f7945h
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto Lba
            r3 = 15
            r13.d(r6, r3, r1)
            r13.b(r5)
            goto Lc5
        Lba:
            r4 = 63
            r13.d(r6, r4, r8)
            r13.b(r5)
            r13.a(r3)
        Lc5:
            int r2 = r2 + 1
            goto L6
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: as.h.c(java.util.List):void");
    }

    public final void d(int i10, int i11, int i12) {
        pw.g gVar = this.f7962a;
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
}
