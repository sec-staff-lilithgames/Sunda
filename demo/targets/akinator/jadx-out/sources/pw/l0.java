package pw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 extends uu.g implements RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final a f81916e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final l[] f81917b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f81918c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static void a(long j10, g gVar, int i10, List list, int i11, int i12, ArrayList arrayList) throws IOException {
            int i13;
            int i14;
            ArrayList arrayList2;
            long j11;
            int i15;
            int i16 = i10;
            List list2 = list;
            ArrayList arrayList3 = arrayList;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((l) list2.get(i17)).size() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            l lVar = (l) list.get(i11);
            l lVar2 = (l) list2.get(i12 - 1);
            if (i16 == lVar.size()) {
                int iIntValue = ((Number) arrayList3.get(i11)).intValue();
                int i18 = i11 + 1;
                l lVar3 = (l) list2.get(i18);
                i13 = i18;
                i14 = iIntValue;
                lVar = lVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (lVar.getByte(i16) == lVar2.getByte(i16)) {
                int iMin = Math.min(lVar.size(), lVar2.size());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && lVar.getByte(i20) == lVar2.getByte(i20); i20++) {
                    i19++;
                }
                long j12 = 4;
                long size = (gVar.size() / j12) + j10 + 2 + i19 + 1;
                gVar.writeInt(-i19);
                gVar.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    gVar.writeInt(lVar.getByte(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((l) list2.get(i13)).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    gVar.writeInt(((Number) arrayList3.get(i13)).intValue());
                    return;
                } else {
                    g gVar2 = new g();
                    gVar.writeInt(((int) ((gVar2.size() / j12) + size)) * (-1));
                    a(size, gVar2, i21, list2, i13, i12, arrayList3);
                    gVar.writeAll(gVar2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((l) list2.get(i23 - 1)).getByte(i16) != ((l) list2.get(i23)).getByte(i16)) {
                    i22++;
                }
            }
            long j13 = 4;
            long size2 = (gVar.size() / j13) + j10 + 2 + (i22 * 2);
            gVar.writeInt(i22);
            gVar.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                int i25 = ((l) list2.get(i24)).getByte(i16);
                if (i24 == i13 || i25 != ((l) list2.get(i24 - 1)).getByte(i16)) {
                    gVar.writeInt(i25 & 255);
                }
            }
            g gVar3 = new g();
            int i26 = i13;
            while (i26 < i12) {
                byte b10 = ((l) list2.get(i26)).getByte(i16);
                int i27 = i26 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i12) {
                        i28 = i12;
                        break;
                    } else if (b10 != ((l) list2.get(i28)).getByte(i16)) {
                        break;
                    } else {
                        i28++;
                    }
                }
                if (i27 == i28 && i16 + 1 == ((l) list2.get(i26)).size()) {
                    gVar.writeInt(((Number) arrayList3.get(i26)).intValue());
                    arrayList2 = arrayList3;
                    j11 = size2;
                    i15 = i28;
                } else {
                    gVar.writeInt(((int) ((gVar3.size() / j13) + size2)) * (-1));
                    arrayList2 = arrayList3;
                    j11 = size2;
                    i15 = i28;
                    a(j11, gVar3, i16 + 1, list, i26, i15, arrayList2);
                    list2 = list;
                }
                size2 = j11;
                i26 = i15;
                arrayList3 = arrayList2;
            }
            gVar.writeAll(gVar3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final pw.l0 of(pw.l... r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pw.l0.a.of(pw.l[]):pw.l0");
        }
    }

    public l0(l[] lVarArr, int[] iArr, kotlin.jvm.internal.u uVar) {
        this.f81917b = lVarArr;
        this.f81918c = iArr;
    }

    public static final l0 of(l... lVarArr) {
        return f81916e.of(lVarArr);
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return contains((l) obj);
        }
        return false;
    }

    public final l[] getByteStrings$okio() {
        return this.f81917b;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f81917b.length;
    }

    public final int[] getTrie$okio() {
        return this.f81918c;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return indexOf((l) obj);
        }
        return -1;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return lastIndexOf((l) obj);
        }
        return -1;
    }

    public /* bridge */ boolean contains(l lVar) {
        return super.contains((Object) lVar);
    }

    @Override // uu.g, java.util.List
    public l get(int i10) {
        return this.f81917b[i10];
    }

    public /* bridge */ int indexOf(l lVar) {
        return super.indexOf((Object) lVar);
    }

    public /* bridge */ int lastIndexOf(l lVar) {
        return super.lastIndexOf((Object) lVar);
    }
}
