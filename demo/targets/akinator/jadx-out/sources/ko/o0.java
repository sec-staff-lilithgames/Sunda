package ko;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f71716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71717b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71718c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71719d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71720e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71721f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71722g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71723h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71724i;

    /* renamed from: j, reason: collision with root package name */
    public final float f71725j;

    /* renamed from: k, reason: collision with root package name */
    public final int f71726k;

    /* renamed from: l, reason: collision with root package name */
    public final String f71727l;

    /* renamed from: m, reason: collision with root package name */
    public final jn.r f71728m;

    public o0(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str, jn.r rVar) {
        this.f71716a = list;
        this.f71717b = i10;
        this.f71718c = i11;
        this.f71719d = i12;
        this.f71720e = i13;
        this.f71721f = i14;
        this.f71722g = i15;
        this.f71723h = i16;
        this.f71724i = i17;
        this.f71725j = f10;
        this.f71726k = i18;
        this.f71727l = str;
        this.f71728m = rVar;
    }

    public static o0 a(io.bidmachine.media3.common.util.m0 m0Var, boolean z10, jn.r rVar) throws gn.z0 {
        boolean z11;
        jn.n h265Sei3dRefDisplayInfo;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                m0Var.skipBytes(4);
            } else {
                m0Var.skipBytes(21);
            }
            int unsignedByte = m0Var.readUnsignedByte() & 3;
            int unsignedByte2 = m0Var.readUnsignedByte();
            int position = m0Var.getPosition();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= unsignedByte2) {
                    break;
                }
                m0Var.skipBytes(1);
                int unsignedShort = m0Var.readUnsignedShort();
                for (int i15 = 0; i15 < unsignedShort; i15++) {
                    int unsignedShort2 = m0Var.readUnsignedShort();
                    i14 += unsignedShort2 + 4;
                    m0Var.skipBytes(unsignedShort2);
                }
                i13++;
            }
            m0Var.setPosition(position);
            byte[] bArr = new byte[i14];
            jn.r rVar2 = rVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f10 = 1.0f;
            String strBuildHevcCodecString = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < unsignedByte2) {
                int unsignedByte3 = m0Var.readUnsignedByte() & 63;
                int unsignedShort3 = m0Var.readUnsignedShort();
                int i26 = i12;
                jn.r h265VpsNalUnit = rVar2;
                while (i26 < unsignedShort3) {
                    boolean z12 = z11;
                    int unsignedShort4 = m0Var.readUnsignedShort();
                    int i27 = unsignedByte;
                    System.arraycopy(jn.u.f69799a, i12, bArr, i25, i11);
                    int i28 = i25 + 4;
                    System.arraycopy(m0Var.getData(), m0Var.getPosition(), bArr, i28, unsignedShort4);
                    if (unsignedByte3 == 32 && i26 == 0) {
                        h265VpsNalUnit = jn.u.parseH265VpsNalUnit(bArr, i28, i28 + unsignedShort4);
                    } else {
                        if (unsignedByte3 == 33 && i26 == 0) {
                            jn.o h265SpsNalUnit = jn.u.parseH265SpsNalUnit(bArr, i28, i28 + unsignedShort4, h265VpsNalUnit);
                            i16 = h265SpsNalUnit.f69757a + 1;
                            i17 = h265SpsNalUnit.f69759c + 8;
                            i18 = h265SpsNalUnit.f69760d + 8;
                            int i29 = h265SpsNalUnit.f69765i;
                            int i30 = h265SpsNalUnit.f69766j;
                            i19 = i29;
                            int i31 = h265SpsNalUnit.f69767k;
                            float f11 = h265SpsNalUnit.f69763g;
                            int i32 = h265SpsNalUnit.f69764h;
                            jn.j jVar = h265SpsNalUnit.f69758b;
                            if (jVar != null) {
                                i10 = i32;
                                strBuildHevcCodecString = io.bidmachine.media3.common.util.h.buildHevcCodecString(jVar.f69741a, jVar.f69742b, jVar.f69743c, jVar.f69744d, jVar.f69745e, jVar.f69746f);
                            } else {
                                i10 = i32;
                            }
                            i23 = i10;
                            f10 = f11;
                            i21 = i31;
                            i20 = i30;
                        } else if (unsignedByte3 == 39 && i26 == 0 && (h265Sei3dRefDisplayInfo = jn.u.parseH265Sei3dRefDisplayInfo(bArr, i28, i28 + unsignedShort4)) != null && h265VpsNalUnit != null) {
                            i12 = 0;
                            i22 = h265Sei3dRefDisplayInfo.f69756a == ((jn.h) h265VpsNalUnit.f69773a.get(0)).f69737b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i25 = i28 + unsignedShort4;
                    m0Var.skipBytes(unsignedShort4);
                    i26++;
                    z11 = z12;
                    unsignedByte = i27;
                    i11 = 4;
                }
                i24++;
                rVar2 = h265VpsNalUnit;
                i11 = 4;
            }
            return new o0(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i16, i17, i18, i19, i20, i21, i22, f10, i23, strBuildHevcCodecString, rVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw gn.z0.createForMalformedContainer("Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"), e10);
        }
    }

    public static o0 parse(io.bidmachine.media3.common.util.m0 m0Var) throws gn.z0 {
        return a(m0Var, false, null);
    }

    public static o0 parseLayered(io.bidmachine.media3.common.util.m0 m0Var, jn.r rVar) throws gn.z0 {
        return a(m0Var, true, rVar);
    }
}
