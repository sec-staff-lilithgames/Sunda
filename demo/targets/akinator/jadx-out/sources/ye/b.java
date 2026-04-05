package ye;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.util.h1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends re.g {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f94364a = new v0();

    /* renamed from: b, reason: collision with root package name */
    public final u0 f94365b = new u0();

    /* renamed from: c, reason: collision with root package name */
    public h1 f94366c;

    @Override // re.g
    public final Metadata a(re.e eVar, ByteBuffer byteBuffer) {
        int i10;
        Metadata.Entry spliceNullCommand;
        long j10;
        int i11;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        int unsignedShort;
        int unsignedByte;
        int unsignedByte2;
        long unsignedInt;
        boolean z13;
        long j13;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        int unsignedByte3;
        char c10;
        long j15;
        boolean z18;
        h1 h1Var = this.f94366c;
        if (h1Var == null || eVar.f84299k != h1Var.getTimestampOffsetUs()) {
            h1 h1Var2 = new h1(eVar.f12239g);
            this.f94366c = h1Var2;
            h1Var2.adjustSampleTimestamp(eVar.f12239g - eVar.f84299k);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        v0 v0Var = this.f94364a;
        v0Var.reset(bArrArray, iLimit);
        u0 u0Var = this.f94365b;
        u0Var.reset(bArrArray, iLimit);
        u0Var.skipBits(39);
        boolean z19 = true;
        long bits = (u0Var.readBits(1) << 32) | u0Var.readBits(32);
        u0Var.skipBits(20);
        int bits2 = u0Var.readBits(12);
        int bits3 = u0Var.readBits(8);
        v0Var.skipBytes(14);
        if (bits3 == 0) {
            i10 = 0;
            spliceNullCommand = new SpliceNullCommand();
        } else if (bits3 != 255) {
            long j16 = 1;
            long unsignedInt2 = C.TIME_UNSET;
            if (bits3 == 4) {
                int unsignedByte4 = v0Var.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i14 = 0;
                while (i14 < unsignedByte4) {
                    long unsignedInt3 = v0Var.readUnsignedInt();
                    boolean z20 = (v0Var.readUnsignedByte() & 128) != 0 ? z19 : false;
                    ArrayList arrayList2 = new ArrayList();
                    if (z20) {
                        j10 = j16;
                        i11 = unsignedByte4;
                        j11 = -9223372036854775807L;
                        j12 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        unsignedShort = 0;
                        unsignedByte = 0;
                        unsignedByte2 = 0;
                    } else {
                        int unsignedByte5 = v0Var.readUnsignedByte();
                        boolean z21 = (unsignedByte5 & 128) != 0 ? z19 : false;
                        boolean z22 = (unsignedByte5 & 64) != 0 ? z19 : false;
                        boolean z23 = (unsignedByte5 & 32) != 0 ? z19 : false;
                        long unsignedInt4 = z22 ? v0Var.readUnsignedInt() : -9223372036854775807L;
                        if (!z22) {
                            int unsignedByte6 = v0Var.readUnsignedByte();
                            ArrayList arrayList3 = new ArrayList(unsignedByte6);
                            int i15 = 0;
                            while (i15 < unsignedByte6) {
                                arrayList3.add(new g(v0Var.readUnsignedByte(), v0Var.readUnsignedInt()));
                                i15++;
                                unsignedByte4 = unsignedByte4;
                                j16 = j16;
                            }
                            arrayList2 = arrayList3;
                        }
                        j10 = j16;
                        i11 = unsignedByte4;
                        if (z23) {
                            long unsignedByte7 = v0Var.readUnsignedByte();
                            z13 = (unsignedByte7 & 128) != 0;
                            unsignedInt = ((((unsignedByte7 & j10) << 32) | v0Var.readUnsignedInt()) * 1000) / 90;
                        } else {
                            unsignedInt = -9223372036854775807L;
                            z13 = false;
                        }
                        j12 = unsignedInt;
                        z12 = z13;
                        unsignedShort = v0Var.readUnsignedShort();
                        z10 = z21;
                        z11 = z22;
                        j11 = unsignedInt4;
                        unsignedByte = v0Var.readUnsignedByte();
                        unsignedByte2 = v0Var.readUnsignedByte();
                    }
                    arrayList.add(new h(unsignedInt3, z20, z10, z11, arrayList2, j11, z12, j12, unsignedShort, unsignedByte, unsignedByte2));
                    i14++;
                    unsignedByte4 = i11;
                    j16 = j10;
                    z19 = true;
                }
                spliceNullCommand = new SpliceScheduleCommand(arrayList);
            } else if (bits3 == 5) {
                h1 h1Var3 = this.f94366c;
                long unsignedInt5 = v0Var.readUnsignedInt();
                boolean z24 = (v0Var.readUnsignedByte() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z24) {
                    j13 = -9223372036854775807L;
                    j14 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i12 = 0;
                    i13 = 0;
                    unsignedByte3 = 0;
                } else {
                    int unsignedByte8 = v0Var.readUnsignedByte();
                    boolean z25 = (unsignedByte8 & 128) != 0;
                    boolean z26 = (unsignedByte8 & 64) != 0;
                    boolean z27 = (unsignedByte8 & 32) != 0;
                    boolean z28 = (unsignedByte8 & 16) != 0;
                    long jA = (!z26 || z28) ? -9223372036854775807L : TimeSignalCommand.a(v0Var, bits);
                    if (z26) {
                        c10 = ' ';
                        j15 = 90;
                    } else {
                        int unsignedByte9 = v0Var.readUnsignedByte();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(unsignedByte9);
                        j15 = 90;
                        for (int i16 = 0; i16 < unsignedByte9; i16++) {
                            int unsignedByte10 = v0Var.readUnsignedByte();
                            long jA2 = !z28 ? TimeSignalCommand.a(v0Var, bits) : -9223372036854775807L;
                            arrayList4.add(new d(unsignedByte10, jA2, h1Var3.adjustTsTimestamp(jA2)));
                        }
                        list = arrayList4;
                    }
                    if (z27) {
                        long unsignedByte11 = v0Var.readUnsignedByte();
                        z18 = (unsignedByte11 & 128) != 0;
                        unsignedInt2 = ((((unsignedByte11 & 1) << c10) | v0Var.readUnsignedInt()) * 1000) / j15;
                    } else {
                        z18 = false;
                    }
                    int unsignedShort2 = v0Var.readUnsignedShort();
                    int unsignedByte12 = v0Var.readUnsignedByte();
                    z17 = z18;
                    unsignedByte3 = v0Var.readUnsignedByte();
                    z14 = z25;
                    i12 = unsignedShort2;
                    i13 = unsignedByte12;
                    j14 = unsignedInt2;
                    j13 = jA;
                    z16 = z28;
                    z15 = z26;
                }
                spliceNullCommand = new SpliceInsertCommand(unsignedInt5, z24, z14, z15, z16, j13, h1Var3.adjustTsTimestamp(j13), list, z17, j14, i12, i13, unsignedByte3);
            } else if (bits3 != 6) {
                spliceNullCommand = null;
            } else {
                h1 h1Var4 = this.f94366c;
                long jA3 = TimeSignalCommand.a(v0Var, bits);
                spliceNullCommand = new TimeSignalCommand(jA3, h1Var4.adjustTsTimestamp(jA3));
            }
            i10 = 0;
        } else {
            long unsignedInt6 = v0Var.readUnsignedInt();
            int i17 = bits2 - 4;
            byte[] bArr = new byte[i17];
            i10 = 0;
            v0Var.readBytes(bArr, 0, i17);
            spliceNullCommand = new PrivateCommand(unsignedInt6, bArr, bits);
        }
        if (spliceNullCommand == null) {
            return new Metadata(new Metadata.Entry[i10]);
        }
        Metadata.Entry[] entryArr = new Metadata.Entry[1];
        entryArr[i10] = spliceNullCommand;
        return new Metadata(entryArr);
    }
}
