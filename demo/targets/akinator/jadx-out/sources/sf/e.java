package sf;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.m0;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f85635a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85637c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85638d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85639e;

    /* renamed from: f, reason: collision with root package name */
    public final float f85640f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85641g;

    public e(List list, int i10, int i11, int i12, int i13, float f10, String str) {
        this.f85635a = list;
        this.f85636b = i10;
        this.f85637c = i11;
        this.f85638d = i12;
        this.f85639e = i13;
        this.f85640f = f10;
        this.f85641g = str;
    }

    public static e parse(v0 v0Var) throws h2 {
        boolean z10;
        int i10;
        try {
            v0Var.skipBytes(21);
            int unsignedByte = v0Var.readUnsignedByte() & 3;
            int unsignedByte2 = v0Var.readUnsignedByte();
            int position = v0Var.getPosition();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i12 >= unsignedByte2) {
                    break;
                }
                v0Var.skipBytes(1);
                int unsignedShort = v0Var.readUnsignedShort();
                for (int i14 = 0; i14 < unsignedShort; i14++) {
                    int unsignedShort2 = v0Var.readUnsignedShort();
                    i13 += unsignedShort2 + 4;
                    v0Var.skipBytes(unsignedShort2);
                }
                i12++;
            }
            v0Var.setPosition(position);
            byte[] bArr = new byte[i13];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < unsignedByte2) {
                int unsignedByte3 = v0Var.readUnsignedByte() & 63;
                int unsignedShort3 = v0Var.readUnsignedShort();
                int i20 = i11;
                while (i20 < unsignedShort3) {
                    int unsignedShort4 = v0Var.readUnsignedShort();
                    boolean z11 = z10;
                    int i21 = unsignedByte;
                    System.arraycopy(p0.f28540a, i11, bArr, i19, 4);
                    int i22 = i19 + 4;
                    System.arraycopy(v0Var.getData(), v0Var.getPosition(), bArr, i22, unsignedShort4);
                    if (unsignedByte3 == 33 && i20 == 0) {
                        m0 h265SpsNalUnit = p0.parseH265SpsNalUnit(bArr, i22, i22 + unsignedShort4);
                        int i23 = h265SpsNalUnit.f28497g;
                        i15 = h265SpsNalUnit.f28500j;
                        i16 = h265SpsNalUnit.f28501k;
                        i17 = h265SpsNalUnit.f28502l;
                        float f11 = h265SpsNalUnit.f28499i;
                        i10 = unsignedByte2;
                        strBuildHevcCodecString = com.google.android.exoplayer2.util.e.buildHevcCodecString(h265SpsNalUnit.f28491a, h265SpsNalUnit.f28492b, h265SpsNalUnit.f28493c, h265SpsNalUnit.f28494d, h265SpsNalUnit.f28495e, h265SpsNalUnit.f28496f);
                        f10 = f11;
                    } else {
                        i10 = unsignedByte2;
                    }
                    i19 = i22 + unsignedShort4;
                    v0Var.skipBytes(unsignedShort4);
                    i20++;
                    z10 = z11;
                    unsignedByte = i21;
                    unsignedByte2 = i10;
                    i11 = 0;
                }
                i18++;
                i11 = 0;
            }
            return new e(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i15, i16, i17, f10, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h2.createForMalformedContainer("Error parsing HEVC config", e10);
        }
    }
}
