package io.odeeo.internal.r0;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.q0.u;
import io.odeeo.internal.q0.x;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f66163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66165c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66166d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66167e;

    /* renamed from: f, reason: collision with root package name */
    public final String f66168f;

    public f(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f66163a = list;
        this.f66164b = i10;
        this.f66165c = i11;
        this.f66166d = i12;
        this.f66167e = f10;
        this.f66168f = str;
    }

    public static f parse(x xVar) throws g0 {
        boolean z10;
        int i10;
        try {
            xVar.skipBytes(21);
            int unsignedByte = xVar.readUnsignedByte() & 3;
            int unsignedByte2 = xVar.readUnsignedByte();
            int position = xVar.getPosition();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i12 >= unsignedByte2) {
                    break;
                }
                xVar.skipBytes(1);
                int unsignedShort = xVar.readUnsignedShort();
                for (int i14 = 0; i14 < unsignedShort; i14++) {
                    int unsignedShort2 = xVar.readUnsignedShort();
                    i13 += unsignedShort2 + 4;
                    xVar.skipBytes(unsignedShort2);
                }
                i12++;
            }
            xVar.setPosition(position);
            byte[] bArr = new byte[i13];
            int i15 = -1;
            int i16 = -1;
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < unsignedByte2) {
                int unsignedByte3 = xVar.readUnsignedByte() & 127;
                int unsignedShort3 = xVar.readUnsignedShort();
                int i19 = i11;
                while (i19 < unsignedShort3) {
                    int unsignedShort4 = xVar.readUnsignedShort();
                    boolean z11 = z10;
                    byte[] bArr2 = u.f65926a;
                    int i20 = unsignedByte;
                    System.arraycopy(bArr2, i11, bArr, i18, bArr2.length);
                    int length = i18 + bArr2.length;
                    System.arraycopy(xVar.getData(), xVar.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i19 == 0) {
                        u.a h265SpsNalUnit = u.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i15 = h265SpsNalUnit.f65937h;
                        i16 = h265SpsNalUnit.f65938i;
                        f10 = h265SpsNalUnit.f65939j;
                        i10 = unsignedByte2;
                        strBuildHevcCodecString = io.odeeo.internal.q0.e.buildHevcCodecString(h265SpsNalUnit.f65930a, h265SpsNalUnit.f65931b, h265SpsNalUnit.f65932c, h265SpsNalUnit.f65933d, h265SpsNalUnit.f65934e, h265SpsNalUnit.f65935f);
                    } else {
                        i10 = unsignedByte2;
                    }
                    i18 = length + unsignedShort4;
                    xVar.skipBytes(unsignedShort4);
                    i19++;
                    z10 = z11;
                    unsignedByte = i20;
                    unsignedByte2 = i10;
                    i11 = 0;
                }
                i17++;
                i11 = 0;
            }
            return new f(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i15, i16, f10, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw g0.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
