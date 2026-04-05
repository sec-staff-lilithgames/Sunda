package io.odeeo.internal.n;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.g.r;
import io.odeeo.internal.n.a;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import io.odeeo.internal.s.a;
import io.odeeo.internal.u0.h1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f64744a = g0.getUtf8Bytes("OpusHead");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64745a;

        /* renamed from: b, reason: collision with root package name */
        public int f64746b;

        /* renamed from: c, reason: collision with root package name */
        public int f64747c;

        /* renamed from: d, reason: collision with root package name */
        public long f64748d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f64749e;

        /* renamed from: f, reason: collision with root package name */
        public final x f64750f;

        /* renamed from: g, reason: collision with root package name */
        public final x f64751g;

        /* renamed from: h, reason: collision with root package name */
        public int f64752h;

        /* renamed from: i, reason: collision with root package name */
        public int f64753i;

        public a(x xVar, x xVar2, boolean z10) throws io.odeeo.internal.b.g0 {
            this.f64751g = xVar;
            this.f64750f = xVar2;
            this.f64749e = z10;
            xVar2.setPosition(12);
            this.f64745a = xVar2.readUnsignedIntToInt();
            xVar.setPosition(12);
            this.f64753i = xVar.readUnsignedIntToInt();
            io.odeeo.internal.g.k.checkContainerInput(xVar.readInt() == 1, "first_chunk must be 1");
            this.f64746b = -1;
        }

        public boolean moveNext() {
            int i10 = this.f64746b + 1;
            this.f64746b = i10;
            if (i10 == this.f64745a) {
                return false;
            }
            this.f64748d = this.f64749e ? this.f64750f.readUnsignedLongToLong() : this.f64750f.readUnsignedInt();
            if (this.f64746b == this.f64752h) {
                this.f64747c = this.f64751g.readUnsignedIntToInt();
                this.f64751g.skipBytes(4);
                int i11 = this.f64753i - 1;
                this.f64753i = i11;
                this.f64752h = i11 > 0 ? this.f64751g.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.n.b$b, reason: collision with other inner class name */
    public interface InterfaceC0623b {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final l[] f64754a;

        /* renamed from: b, reason: collision with root package name */
        public t f64755b;

        /* renamed from: c, reason: collision with root package name */
        public int f64756c;

        /* renamed from: d, reason: collision with root package name */
        public int f64757d = 0;

        public c(int i10) {
            this.f64754a = new l[i10];
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements InterfaceC0623b {

        /* renamed from: a, reason: collision with root package name */
        public final int f64758a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64759b;

        /* renamed from: c, reason: collision with root package name */
        public final x f64760c;

        public d(a.b bVar, t tVar) {
            x xVar = bVar.f64743b;
            this.f64760c = xVar;
            xVar.setPosition(12);
            int unsignedIntToInt = xVar.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(tVar.f62971l)) {
                int pcmFrameSize = g0.getPcmFrameSize(tVar.A, tVar.f62984y);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    p.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.f64758a = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.f64759b = xVar.readUnsignedIntToInt();
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int getFixedSampleSize() {
            return this.f64758a;
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int getSampleCount() {
            return this.f64759b;
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int readNextSampleSize() {
            int i10 = this.f64758a;
            return i10 == -1 ? this.f64760c.readUnsignedIntToInt() : i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements InterfaceC0623b {

        /* renamed from: a, reason: collision with root package name */
        public final x f64761a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64762b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64763c;

        /* renamed from: d, reason: collision with root package name */
        public int f64764d;

        /* renamed from: e, reason: collision with root package name */
        public int f64765e;

        public e(a.b bVar) {
            x xVar = bVar.f64743b;
            this.f64761a = xVar;
            xVar.setPosition(12);
            this.f64763c = xVar.readUnsignedIntToInt() & 255;
            this.f64762b = xVar.readUnsignedIntToInt();
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int getSampleCount() {
            return this.f64762b;
        }

        @Override // io.odeeo.internal.n.b.InterfaceC0623b
        public int readNextSampleSize() {
            int i10 = this.f64763c;
            if (i10 == 8) {
                return this.f64761a.readUnsignedByte();
            }
            if (i10 == 16) {
                return this.f64761a.readUnsignedShort();
            }
            int i11 = this.f64764d;
            this.f64764d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f64765e & 15;
            }
            int unsignedByte = this.f64761a.readUnsignedByte();
            this.f64765e = unsignedByte;
            return (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f64766a;

        /* renamed from: b, reason: collision with root package name */
        public final long f64767b;

        /* renamed from: c, reason: collision with root package name */
        public final int f64768c;

        public f(int i10, long j10, int i11) {
            this.f64766a = i10;
            this.f64767b = j10;
            this.f64768c = i11;
        }
    }

    public static int a(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static io.odeeo.internal.s.a b(x xVar, int i10) {
        xVar.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (xVar.getPosition() < i10) {
            a.b ilstElement = io.odeeo.internal.n.f.parseIlstElement(xVar);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new io.odeeo.internal.s.a(arrayList);
    }

    public static Pair<Long, String> c(x xVar) {
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        xVar.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = xVar.readUnsignedInt();
        xVar.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = xVar.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    public static io.odeeo.internal.s.a d(x xVar, int i10) {
        xVar.skipBytes(12);
        while (xVar.getPosition() < i10) {
            int position = xVar.getPosition();
            int i11 = xVar.readInt();
            if (xVar.readInt() == 1935766900) {
                if (i11 < 14) {
                    return null;
                }
                xVar.skipBytes(5);
                int unsignedByte = xVar.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f10 = unsignedByte == 12 ? 240.0f : 120.0f;
                xVar.skipBytes(1);
                return new io.odeeo.internal.s.a(new io.odeeo.internal.y.d(f10, xVar.readUnsignedByte()));
            }
            xVar.setPosition(position + i11);
        }
        return null;
    }

    public static io.odeeo.internal.s.a e(x xVar, int i10) {
        xVar.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(xVar);
        while (xVar.getPosition() < i10) {
            int position = xVar.getPosition();
            int i11 = xVar.readInt();
            if (xVar.readInt() == 1768715124) {
                xVar.setPosition(position);
                return b(xVar, position + i11);
            }
            xVar.setPosition(position + i11);
        }
        return null;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(x xVar) {
        int position = xVar.getPosition();
        xVar.skipBytes(4);
        if (xVar.readInt() != 1751411826) {
            position += 4;
        }
        xVar.setPosition(position);
    }

    public static io.odeeo.internal.s.a parseMdtaFromMeta(a.C0622a c0622a) {
        a.b leafAtomOfType = c0622a.getLeafAtomOfType(1751411826);
        a.b leafAtomOfType2 = c0622a.getLeafAtomOfType(1801812339);
        a.b leafAtomOfType3 = c0622a.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || b(leafAtomOfType.f64743b) != 1835299937) {
            return null;
        }
        x xVar = leafAtomOfType2.f64743b;
        xVar.setPosition(12);
        int i10 = xVar.readInt();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = xVar.readInt();
            xVar.skipBytes(4);
            strArr[i11] = xVar.readString(i12 - 8);
        }
        x xVar2 = leafAtomOfType3.f64743b;
        xVar2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (xVar2.bytesLeft() > 8) {
            int position = xVar2.getPosition();
            int i13 = xVar2.readInt();
            int i14 = xVar2.readInt() - 1;
            if (i14 < 0 || i14 >= i10) {
                e3.g.z(i14, "Skipped metadata with unknown key index: ", "AtomParsers");
            } else {
                io.odeeo.internal.y.a mdtaMetadataEntryFromIlst = io.odeeo.internal.n.f.parseMdtaMetadataEntryFromIlst(xVar2, position + i13, strArr[i14]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            xVar2.setPosition(position + i13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new io.odeeo.internal.s.a(arrayList);
    }

    public static List<n> parseTraks(a.C0622a c0622a, r rVar, long j10, io.odeeo.internal.f.e eVar, boolean z10, boolean z11, io.odeeo.internal.t0.k<k, k> kVar) throws io.odeeo.internal.b.g0 {
        k kVarApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0622a.f64742d.size(); i10++) {
            a.C0622a c0622a2 = c0622a.f64742d.get(i10);
            if (c0622a2.f64739a == 1953653099 && (kVarApply = kVar.apply(a(c0622a2, (a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a.getLeafAtomOfType(1836476516)), j10, eVar, z10, z11))) != null) {
                arrayList.add(a(kVarApply, (a.C0622a) io.odeeo.internal.q0.a.checkNotNull(((a.C0622a) io.odeeo.internal.q0.a.checkNotNull(((a.C0622a) io.odeeo.internal.q0.a.checkNotNull(c0622a2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), rVar));
            }
        }
        return arrayList;
    }

    public static Pair<io.odeeo.internal.s.a, io.odeeo.internal.s.a> parseUdta(a.b bVar) {
        x xVar = bVar.f64743b;
        xVar.setPosition(8);
        io.odeeo.internal.s.a aVarE = null;
        io.odeeo.internal.s.a aVarD = null;
        while (xVar.bytesLeft() >= 8) {
            int position = xVar.getPosition();
            int i10 = xVar.readInt();
            int i11 = xVar.readInt();
            if (i11 == 1835365473) {
                xVar.setPosition(position);
                aVarE = e(xVar, position + i10);
            } else if (i11 == 1936553057) {
                xVar.setPosition(position);
                aVarD = d(xVar, position + i10);
            }
            xVar.setPosition(position + i10);
        }
        return Pair.create(aVarE, aVarD);
    }

    public static k a(a.C0622a c0622a, a.b bVar, long j10, io.odeeo.internal.f.e eVar, boolean z10, boolean z11) throws io.odeeo.internal.b.g0 {
        long[] jArr;
        long[] jArr2;
        a.C0622a containerAtomOfType;
        Pair<long[], long[]> pairA;
        a.C0622a c0622a2 = (a.C0622a) io.odeeo.internal.q0.a.checkNotNull(c0622a.getContainerAtomOfType(1835297121));
        int iA = a(b(((a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a2.getLeafAtomOfType(1751411826))).f64743b));
        if (iA == -1) {
            return null;
        }
        f fVarE = e(((a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a.getLeafAtomOfType(1953196132))).f64743b);
        long jScaleLargeTimestamp = C.TIME_UNSET;
        long j11 = j10 == C.TIME_UNSET ? fVarE.f64767b : j10;
        long jD = d(bVar.f64743b);
        if (j11 != C.TIME_UNSET) {
            jScaleLargeTimestamp = g0.scaleLargeTimestamp(j11, 1000000L, jD);
        }
        long j12 = jScaleLargeTimestamp;
        a.C0622a c0622a3 = (a.C0622a) io.odeeo.internal.q0.a.checkNotNull(((a.C0622a) io.odeeo.internal.q0.a.checkNotNull(c0622a2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> pairC = c(((a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a2.getLeafAtomOfType(1835296868))).f64743b);
        c cVarA = a(((a.b) io.odeeo.internal.q0.a.checkNotNull(c0622a3.getLeafAtomOfType(1937011556))).f64743b, fVarE.f64766a, fVarE.f64768c, (String) pairC.second, eVar, z11);
        if (z10 || (containerAtomOfType = c0622a.getContainerAtomOfType(1701082227)) == null || (pairA = a(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairA.first;
            jArr2 = (long[]) pairA.second;
            jArr = jArr3;
        }
        if (cVarA.f64755b == null) {
            return null;
        }
        return new k(fVarE.f64766a, iA, ((Long) pairC.first).longValue(), jD, j12, cVarA.f64755b, cVarA.f64757d, cVarA.f64754a, cVarA.f64756c, jArr, jArr2);
    }

    public static int b(x xVar) {
        xVar.setPosition(16);
        return xVar.readInt();
    }

    public static byte[] b(x xVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            xVar.setPosition(i12);
            int i13 = xVar.readInt();
            if (xVar.readInt() == 1886547818) {
                return Arrays.copyOfRange(xVar.getData(), i12, i13 + i12);
            }
            i12 += i13;
        }
        return null;
    }

    public static float c(x xVar, int i10) {
        xVar.setPosition(i10 + 8);
        return xVar.readUnsignedIntToInt() / xVar.readUnsignedIntToInt();
    }

    public static f e(x xVar) {
        long j10;
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        xVar.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i10 = xVar.readInt();
        xVar.skipBytes(4);
        int position = xVar.getPosition();
        int i11 = fullAtomVersion == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j10 = C.TIME_UNSET;
            if (i13 < i11) {
                if (xVar.getData()[position + i13] != -1) {
                    long unsignedInt = fullAtomVersion == 0 ? xVar.readUnsignedInt() : xVar.readUnsignedLongToLong();
                    if (unsignedInt != 0) {
                        j10 = unsignedInt;
                    }
                } else {
                    i13++;
                }
            } else {
                xVar.skipBytes(i11);
                break;
            }
        }
        xVar.skipBytes(16);
        int i14 = xVar.readInt();
        int i15 = xVar.readInt();
        xVar.skipBytes(4);
        int i16 = xVar.readInt();
        int i17 = xVar.readInt();
        if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
            i12 = 90;
        } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
            i12 = 270;
        } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
            i12 = 180;
        }
        return new f(i10, j10, i12);
    }

    public static long d(x xVar) {
        xVar.setPosition(8);
        xVar.skipBytes(io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt()) != 0 ? 16 : 8);
        return xVar.readUnsignedInt();
    }

    public static Pair<Integer, l> c(x xVar, int i10, int i11) throws io.odeeo.internal.b.g0 {
        Pair<Integer, l> pairA;
        int position = xVar.getPosition();
        while (position - i10 < i11) {
            xVar.setPosition(position);
            int i12 = xVar.readInt();
            io.odeeo.internal.g.k.checkContainerInput(i12 > 0, "childAtomSize must be positive");
            if (xVar.readInt() == 1936289382 && (pairA = a(xVar, position, i12)) != null) {
                return pairA;
            }
            position += i12;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0272  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.n.n a(io.odeeo.internal.n.k r36, io.odeeo.internal.n.a.C0622a r37, io.odeeo.internal.g.r r38) throws io.odeeo.internal.b.g0 {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n.b.a(io.odeeo.internal.n.k, io.odeeo.internal.n.a$a, io.odeeo.internal.g.r):io.odeeo.internal.n.n");
    }

    public static c a(x xVar, int i10, int i11, String str, io.odeeo.internal.f.e eVar, boolean z10) throws io.odeeo.internal.b.g0 {
        xVar.setPosition(12);
        int i12 = xVar.readInt();
        c cVar = new c(i12);
        int i13 = 0;
        while (i13 < i12) {
            int position = xVar.getPosition();
            int i14 = xVar.readInt();
            io.odeeo.internal.g.k.checkContainerInput(i14 > 0, "childAtomSize must be positive");
            int i15 = xVar.readInt();
            if (i15 == 1635148593 || i15 == 1635148595 || i15 == 1701733238 || i15 == 1831958048 || i15 == 1836070006 || i15 == 1752589105 || i15 == 1751479857 || i15 == 1932670515 || i15 == 1211250227 || i15 == 1987063864 || i15 == 1987063865 || i15 == 1635135537 || i15 == 1685479798 || i15 == 1685479729 || i15 == 1685481573 || i15 == 1685481521) {
                c cVar2 = cVar;
                int i16 = i13;
                a(xVar, i15, position, i14, i10, i11, eVar, cVar2, i16);
                cVar = cVar2;
                i13 = i16;
            } else if (i15 == 1836069985 || i15 == 1701733217 || i15 == 1633889587 || i15 == 1700998451 || i15 == 1633889588 || i15 == 1835823201 || i15 == 1685353315 || i15 == 1685353317 || i15 == 1685353320 || i15 == 1685353324 || i15 == 1685353336 || i15 == 1935764850 || i15 == 1935767394 || i15 == 1819304813 || i15 == 1936684916 || i15 == 1953984371 || i15 == 778924082 || i15 == 778924083 || i15 == 1835557169 || i15 == 1835560241 || i15 == 1634492771 || i15 == 1634492791 || i15 == 1970037111 || i15 == 1332770163 || i15 == 1716281667) {
                c cVar3 = cVar;
                a(xVar, i15, position, i14, i10, str, z10, eVar, cVar3, i13);
                cVar = cVar3;
            } else if (i15 == 1414810956 || i15 == 1954034535 || i15 == 2004251764 || i15 == 1937010800 || i15 == 1664495672) {
                a(xVar, i15, position, i14, i10, str, cVar);
            } else if (i15 == 1835365492) {
                a(xVar, i15, position, i10, cVar);
            } else if (i15 == 1667329389) {
                cVar.f64755b = new t.b().setId(i10).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            xVar.setPosition(position + i14);
            i13++;
        }
        return cVar;
    }

    public static void a(x xVar, int i10, int i11, int i12, int i13, String str, c cVar) {
        xVar.setPosition(i11 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        h1 h1VarOf = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                xVar.readBytes(bArr, 0, i14);
                h1VarOf = h1.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i10 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f64757d = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f64755b = new t.b().setId(i13).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j10).setInitializationData(h1VarOf).build();
    }

    public static void a(x xVar, int i10, int i11, int i12, int i13, int i14, io.odeeo.internal.f.e eVar, c cVar, int i15) throws io.odeeo.internal.b.g0 {
        String str;
        int i16;
        io.odeeo.internal.f.e eVar2;
        int i17;
        String str2;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str3;
        int i18 = i11;
        int i19 = i12;
        io.odeeo.internal.f.e eVarCopyWithSchemeType = eVar;
        c cVar2 = cVar;
        xVar.setPosition(i18 + 16);
        xVar.skipBytes(16);
        int unsignedShort = xVar.readUnsignedShort();
        int unsignedShort2 = xVar.readUnsignedShort();
        xVar.skipBytes(50);
        int position = xVar.getPosition();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, l> pairC = c(xVar, i18, i19);
            if (pairC != null) {
                iIntValue = ((Integer) pairC.first).intValue();
                eVarCopyWithSchemeType = eVarCopyWithSchemeType == null ? null : eVarCopyWithSchemeType.copyWithSchemeType(((l) pairC.second).f64874b);
                cVar2.f64754a[i15] = (l) pairC.second;
            }
            xVar.setPosition(position);
        }
        String str4 = MimeTypes.VIDEO_H263;
        if (iIntValue == 1831958048) {
            str = MimeTypes.VIDEO_MPEG;
        } else {
            str = iIntValue == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        }
        float fC = 1.0f;
        byte[] bArrB = null;
        String str5 = null;
        List<byte[]> listOf = null;
        int i20 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i21 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferA = null;
        boolean z10 = false;
        while (position - i18 < i19) {
            xVar.setPosition(position);
            int position2 = xVar.getPosition();
            int i22 = xVar.readInt();
            if (i22 == 0) {
                i16 = position;
                if (xVar.getPosition() - i11 == i19) {
                    break;
                }
            } else {
                i16 = position;
            }
            io.odeeo.internal.g.k.checkContainerInput(i22 > 0, "childAtomSize must be positive");
            int i23 = xVar.readInt();
            if (i23 == 1635148611) {
                io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                xVar.setPosition(position2 + 8);
                io.odeeo.internal.r0.a aVar = io.odeeo.internal.r0.a.parse(xVar);
                listOf = aVar.f66124a;
                cVar2.f64756c = aVar.f66125b;
                if (!z10) {
                    fC = aVar.f66128e;
                }
                str5 = aVar.f66129f;
                str3 = "video/avc";
            } else if (i23 == 1752589123) {
                io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                xVar.setPosition(position2 + 8);
                io.odeeo.internal.r0.f fVar = io.odeeo.internal.r0.f.parse(xVar);
                listOf = fVar.f66163a;
                cVar2.f64756c = fVar.f66164b;
                if (!z10) {
                    fC = fVar.f66167e;
                }
                str5 = fVar.f66168f;
                str3 = "video/hevc";
            } else {
                if (i23 == 1685480259 || i23 == 1685485123) {
                    eVar2 = eVarCopyWithSchemeType;
                    i17 = iIntValue;
                    str2 = str4;
                    bArr = bArrB;
                    f10 = fC;
                    list = listOf;
                    io.odeeo.internal.r0.c cVar3 = io.odeeo.internal.r0.c.parse(xVar);
                    if (cVar3 != null) {
                        str5 = cVar3.f66138c;
                        str = "video/dolby-vision";
                    }
                } else if (i23 == 1987076931) {
                    io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                    str3 = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                } else if (i23 == 1635135811) {
                    io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                    str3 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                } else if (i23 == 1668050025) {
                    if (byteBufferA == null) {
                        byteBufferA = a();
                    }
                    ByteBuffer byteBuffer = byteBufferA;
                    byteBuffer.position(21);
                    byteBuffer.putShort(xVar.readShort());
                    byteBuffer.putShort(xVar.readShort());
                    byteBufferA = byteBuffer;
                    eVar2 = eVarCopyWithSchemeType;
                    i17 = iIntValue;
                    str2 = str4;
                    position = i16 + i22;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    iIntValue = i17;
                    str4 = str2;
                    eVarCopyWithSchemeType = eVar2;
                } else if (i23 == 1835295606) {
                    if (byteBufferA == null) {
                        byteBufferA = a();
                    }
                    ByteBuffer byteBuffer2 = byteBufferA;
                    short s10 = xVar.readShort();
                    short s11 = xVar.readShort();
                    i17 = iIntValue;
                    short s12 = xVar.readShort();
                    str2 = str4;
                    short s13 = xVar.readShort();
                    short s14 = xVar.readShort();
                    eVar2 = eVarCopyWithSchemeType;
                    short s15 = xVar.readShort();
                    List<byte[]> list2 = listOf;
                    short s16 = xVar.readShort();
                    byte[] bArr2 = bArrB;
                    short s17 = xVar.readShort();
                    long unsignedInt = xVar.readUnsignedInt();
                    long unsignedInt2 = xVar.readUnsignedInt();
                    byteBuffer2.position(1);
                    byteBuffer2.putShort(s14);
                    byteBuffer2.putShort(s15);
                    byteBuffer2.putShort(s10);
                    byteBuffer2.putShort(s11);
                    byteBuffer2.putShort(s12);
                    byteBuffer2.putShort(s13);
                    byteBuffer2.putShort(s16);
                    byteBuffer2.putShort(s17);
                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                    byteBufferA = byteBuffer2;
                    listOf = list2;
                    bArrB = bArr2;
                    fC = fC;
                    position = i16 + i22;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    iIntValue = i17;
                    str4 = str2;
                    eVarCopyWithSchemeType = eVar2;
                } else {
                    eVar2 = eVarCopyWithSchemeType;
                    i17 = iIntValue;
                    str2 = str4;
                    bArr = bArrB;
                    f10 = fC;
                    list = listOf;
                    if (i23 == 1681012275) {
                        io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                        str = str2;
                    } else if (i23 == 1702061171) {
                        io.odeeo.internal.g.k.checkContainerInput(str == null, null);
                        Pair<String, byte[]> pairA = a(xVar, position2);
                        String str6 = (String) pairA.first;
                        byte[] bArr3 = (byte[]) pairA.second;
                        if (bArr3 != null) {
                            listOf = h1.of(bArr3);
                            str = str6;
                            bArrB = bArr;
                            fC = f10;
                            position = i16 + i22;
                            i18 = i11;
                            i19 = i12;
                            cVar2 = cVar;
                            iIntValue = i17;
                            str4 = str2;
                            eVarCopyWithSchemeType = eVar2;
                        } else {
                            str = str6;
                        }
                    } else {
                        if (i23 == 1885434736) {
                            fC = c(xVar, position2);
                            listOf = list;
                            bArrB = bArr;
                            z10 = true;
                        } else if (i23 == 1937126244) {
                            bArrB = b(xVar, position2, i22);
                            listOf = list;
                            fC = f10;
                        } else if (i23 == 1936995172) {
                            int unsignedByte = xVar.readUnsignedByte();
                            xVar.skipBytes(3);
                            if (unsignedByte == 0) {
                                int unsignedByte2 = xVar.readUnsignedByte();
                                if (unsignedByte2 == 0) {
                                    listOf = list;
                                    bArrB = bArr;
                                    fC = f10;
                                    i20 = 0;
                                } else if (unsignedByte2 == 1) {
                                    i20 = 1;
                                } else if (unsignedByte2 == 2) {
                                    i20 = 2;
                                } else if (unsignedByte2 == 3) {
                                    i20 = 3;
                                }
                            }
                        } else if (i23 == 1668246642) {
                            int i24 = xVar.readInt();
                            if (i24 != 1852009592 && i24 != 1852009571) {
                                p.w("AtomParsers", "Unsupported color type: " + io.odeeo.internal.n.a.getAtomTypeString(i24));
                            } else {
                                int unsignedShort3 = xVar.readUnsignedShort();
                                int unsignedShort4 = xVar.readUnsignedShort();
                                xVar.skipBytes(2);
                                boolean z11 = i22 == 19 && (xVar.readUnsignedByte() & 128) != 0;
                                iIsoColorPrimariesToColorSpace = io.odeeo.internal.r0.b.isoColorPrimariesToColorSpace(unsignedShort3);
                                i21 = z11 ? 1 : 2;
                                iIsoTransferCharacteristicsToColorTransfer = io.odeeo.internal.r0.b.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                            }
                        }
                        position = i16 + i22;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        iIntValue = i17;
                        str4 = str2;
                        eVarCopyWithSchemeType = eVar2;
                    }
                }
                listOf = list;
                bArrB = bArr;
                fC = f10;
                position = i16 + i22;
                i18 = i11;
                i19 = i12;
                cVar2 = cVar;
                iIntValue = i17;
                str4 = str2;
                eVarCopyWithSchemeType = eVar2;
            }
            str = str3;
            eVar2 = eVarCopyWithSchemeType;
            i17 = iIntValue;
            str2 = str4;
            position = i16 + i22;
            i18 = i11;
            i19 = i12;
            cVar2 = cVar;
            iIntValue = i17;
            str4 = str2;
            eVarCopyWithSchemeType = eVar2;
        }
        io.odeeo.internal.f.e eVar3 = eVarCopyWithSchemeType;
        byte[] bArr4 = bArrB;
        float f11 = fC;
        List<byte[]> list3 = listOf;
        if (str == null) {
            return;
        }
        t.b drmInitData = new t.b().setId(i13).setSampleMimeType(str).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(f11).setRotationDegrees(i14).setProjectionData(bArr4).setStereoMode(i20).setInitializationData(list3).setDrmInitData(eVar3);
        int i25 = iIsoColorPrimariesToColorSpace;
        int i26 = i21;
        int i27 = iIsoTransferCharacteristicsToColorTransfer;
        if (i25 != -1 || i26 != -1 || i27 != -1 || byteBufferA != null) {
            drmInitData.setColorInfo(new io.odeeo.internal.r0.b(i25, i26, i27, byteBufferA != null ? byteBufferA.array() : null));
        }
        cVar.f64755b = drmInitData.build();
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static void a(x xVar, int i10, int i11, int i12, c cVar) {
        xVar.setPosition(i11 + 16);
        if (i10 == 1835365492) {
            xVar.readNullTerminatedString();
            String nullTerminatedString = xVar.readNullTerminatedString();
            if (nullTerminatedString != null) {
                cVar.f64755b = new t.b().setId(i12).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Pair<long[], long[]> a(a.C0622a c0622a) {
        a.b leafAtomOfType = c0622a.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        x xVar = leafAtomOfType.f64743b;
        xVar.setPosition(8);
        int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
        int unsignedIntToInt = xVar.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            jArr[i10] = fullAtomVersion == 1 ? xVar.readUnsignedLongToLong() : xVar.readUnsignedInt();
            jArr2[i10] = fullAtomVersion == 1 ? xVar.readLong() : xVar.readInt();
            if (xVar.readShort() == 1) {
                xVar.skipBytes(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(io.odeeo.internal.q0.x r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, io.odeeo.internal.f.e r28, io.odeeo.internal.n.b.c r29, int r30) throws io.odeeo.internal.b.g0 {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.n.b.a(io.odeeo.internal.q0.x, int, int, int, int, java.lang.String, boolean, io.odeeo.internal.f.e, io.odeeo.internal.n.b$c, int):void");
    }

    public static int a(x xVar, int i10, int i11, int i12) throws io.odeeo.internal.b.g0 {
        int position = xVar.getPosition();
        io.odeeo.internal.g.k.checkContainerInput(position >= i11, null);
        while (position - i11 < i12) {
            xVar.setPosition(position);
            int i13 = xVar.readInt();
            io.odeeo.internal.g.k.checkContainerInput(i13 > 0, "childAtomSize must be positive");
            if (xVar.readInt() == i10) {
                return position;
            }
            position += i13;
        }
        return -1;
    }

    public static Pair<String, byte[]> a(x xVar, int i10) {
        xVar.setPosition(i10 + 12);
        xVar.skipBytes(1);
        a(xVar);
        xVar.skipBytes(2);
        int unsignedByte = xVar.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            xVar.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            xVar.skipBytes(xVar.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            xVar.skipBytes(2);
        }
        xVar.skipBytes(1);
        a(xVar);
        String mimeTypeFromMp4ObjectType = io.odeeo.internal.q0.t.getMimeTypeFromMp4ObjectType(xVar.readUnsignedByte());
        if (!MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) && !MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) && !MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            xVar.skipBytes(12);
            xVar.skipBytes(1);
            int iA = a(xVar);
            byte[] bArr = new byte[iA];
            xVar.readBytes(bArr, 0, iA);
            return Pair.create(mimeTypeFromMp4ObjectType, bArr);
        }
        return Pair.create(mimeTypeFromMp4ObjectType, null);
    }

    public static Pair<Integer, l> a(x xVar, int i10, int i11) throws io.odeeo.internal.b.g0 {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            xVar.setPosition(i12);
            int i15 = xVar.readInt();
            int i16 = xVar.readInt();
            if (i16 == 1718775137) {
                numValueOf = Integer.valueOf(xVar.readInt());
            } else if (i16 == 1935894637) {
                xVar.skipBytes(4);
                string = xVar.readString(4);
            } else if (i16 == 1935894633) {
                i13 = i12;
                i14 = i15;
            }
            i12 += i15;
        }
        if (!C.CENC_TYPE_cenc.equals(string) && !C.CENC_TYPE_cbc1.equals(string) && !C.CENC_TYPE_cens.equals(string) && !C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        io.odeeo.internal.g.k.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        io.odeeo.internal.g.k.checkContainerInput(i13 != -1, "schi atom is mandatory");
        l lVarA = a(xVar, i13, i14, string);
        io.odeeo.internal.g.k.checkContainerInput(lVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (l) g0.castNonNull(lVarA));
    }

    public static l a(x xVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            xVar.setPosition(i14);
            int i15 = xVar.readInt();
            if (xVar.readInt() == 1952804451) {
                int fullAtomVersion = io.odeeo.internal.n.a.parseFullAtomVersion(xVar.readInt());
                xVar.skipBytes(1);
                if (fullAtomVersion == 0) {
                    xVar.skipBytes(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int unsignedByte = xVar.readUnsignedByte();
                    i12 = unsignedByte & 15;
                    i13 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                }
                boolean z10 = xVar.readUnsignedByte() == 1;
                int unsignedByte2 = xVar.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                xVar.readBytes(bArr2, 0, 16);
                if (z10 && unsignedByte2 == 0) {
                    int unsignedByte3 = xVar.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    xVar.readBytes(bArr, 0, unsignedByte3);
                }
                return new l(z10, str, unsignedByte2, bArr2, i13, i12, bArr);
            }
            i14 += i15;
        }
    }

    public static int a(x xVar) {
        int unsignedByte = xVar.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = xVar.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    public static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[g0.constrainValue(4, 0, length)] && jArr[g0.constrainValue(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }
}
