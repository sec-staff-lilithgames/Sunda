package ap;

import androidx.recyclerview.widget.l1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.t0;
import io.bidmachine.media3.common.util.l0;
import io.bidmachine.media3.common.util.m0;
import io.bidmachine.media3.common.util.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends to.c {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f7915a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final l0 f7916b = new l0();

    /* renamed from: c, reason: collision with root package name */
    public u0 f7917c;

    @Override // to.c
    public final gn.u0 a(to.b bVar, ByteBuffer byteBuffer) {
        t0 eVar;
        long j10;
        u0 u0Var = this.f7917c;
        if (u0Var == null || bVar.f87331l != u0Var.getTimestampOffsetUs()) {
            u0 u0Var2 = new u0(bVar.f77082h);
            this.f7917c = u0Var2;
            u0Var2.adjustSampleTimestamp(bVar.f77082h - bVar.f87331l);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        m0 m0Var = this.f7915a;
        m0Var.reset(bArrArray, iLimit);
        l0 l0Var = this.f7916b;
        l0Var.reset(bArrArray, iLimit);
        l0Var.skipBits(39);
        long bits = (l0Var.readBits(1) << 32) | l0Var.readBits(32);
        l0Var.skipBits(20);
        int bits2 = l0Var.readBits(12);
        int bits3 = l0Var.readBits(8);
        m0Var.skipBytes(14);
        if (bits3 == 0) {
            eVar = new e();
        } else if (bits3 == 255) {
            long unsignedInt = m0Var.readUnsignedInt();
            int i10 = bits2 - 4;
            m0Var.readBytes(new byte[i10], 0, i10);
            eVar = new a(unsignedInt, bits);
        } else if (bits3 == 4) {
            int unsignedByte = m0Var.readUnsignedByte();
            ArrayList arrayList = new ArrayList(unsignedByte);
            for (int i11 = 0; i11 < unsignedByte; i11++) {
                m0Var.readUnsignedInt();
                boolean z10 = (m0Var.readUnsignedByte() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int unsignedByte2 = m0Var.readUnsignedByte();
                    boolean z11 = (unsignedByte2 & 64) != 0;
                    boolean z12 = (unsignedByte2 & 32) != 0;
                    if (z11) {
                        m0Var.readUnsignedInt();
                    }
                    if (!z11) {
                        int unsignedByte3 = m0Var.readUnsignedByte();
                        ArrayList arrayList3 = new ArrayList(unsignedByte3);
                        for (int i12 = 0; i12 < unsignedByte3; i12++) {
                            m0Var.readUnsignedByte();
                            m0Var.readUnsignedInt();
                            arrayList3.add(new zi.d());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        m0Var.readUnsignedByte();
                        m0Var.readUnsignedInt();
                    }
                    m0Var.readUnsignedShort();
                    m0Var.readUnsignedByte();
                    m0Var.readUnsignedByte();
                }
                l1 l1Var = new l1();
                l1Var.f7184a = Collections.unmodifiableList(arrayList2);
                arrayList.add(l1Var);
            }
            eVar = new f(arrayList);
        } else if (bits3 == 5) {
            u0 u0Var3 = this.f7917c;
            m0Var.readUnsignedInt();
            boolean z13 = (m0Var.readUnsignedByte() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j10 = C.TIME_UNSET;
            } else {
                int unsignedByte4 = m0Var.readUnsignedByte();
                boolean z14 = (unsignedByte4 & 64) != 0;
                boolean z15 = (unsignedByte4 & 32) != 0;
                boolean z16 = (unsignedByte4 & 16) != 0;
                long jA = (!z14 || z16) ? C.TIME_UNSET : g.a(bits, m0Var);
                if (!z14) {
                    int unsignedByte5 = m0Var.readUnsignedByte();
                    ArrayList arrayList4 = new ArrayList(unsignedByte5);
                    for (int i13 = 0; i13 < unsignedByte5; i13++) {
                        m0Var.readUnsignedByte();
                        u0Var3.adjustTsTimestamp(!z16 ? g.a(bits, m0Var) : C.TIME_UNSET);
                        arrayList4.add(new com.bumptech.glide.f());
                    }
                    list = arrayList4;
                }
                if (z15) {
                    m0Var.readUnsignedByte();
                    m0Var.readUnsignedInt();
                }
                m0Var.readUnsignedShort();
                m0Var.readUnsignedByte();
                m0Var.readUnsignedByte();
                j10 = jA;
            }
            eVar = new d(list, j10, u0Var3.adjustTsTimestamp(j10));
        } else if (bits3 != 6) {
            eVar = null;
        } else {
            u0 u0Var4 = this.f7917c;
            long jA2 = g.a(bits, m0Var);
            eVar = new g(jA2, u0Var4.adjustTsTimestamp(jA2));
        }
        return eVar == null ? new gn.u0(new t0[0]) : new gn.u0(eVar);
    }
}
