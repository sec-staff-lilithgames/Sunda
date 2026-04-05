package ko;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f71650a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71654e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71655f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71656g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71657h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71658i;

    /* renamed from: j, reason: collision with root package name */
    public final int f71659j;

    /* renamed from: k, reason: collision with root package name */
    public final float f71660k;

    /* renamed from: l, reason: collision with root package name */
    public final String f71661l;

    public h(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f71650a = arrayList;
        this.f71651b = i10;
        this.f71652c = i11;
        this.f71653d = i12;
        this.f71654e = i13;
        this.f71655f = i14;
        this.f71656g = i15;
        this.f71657h = i16;
        this.f71658i = i17;
        this.f71659j = i18;
        this.f71660k = f10;
        this.f71661l = str;
    }

    public static h parse(io.bidmachine.media3.common.util.m0 m0Var) throws gn.z0 {
        String strBuildAvcCodecString;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            m0Var.skipBytes(4);
            int unsignedByte = (m0Var.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = m0Var.readUnsignedByte() & 31;
            for (int i18 = 0; i18 < unsignedByte2; i18++) {
                int unsignedShort = m0Var.readUnsignedShort();
                int position = m0Var.getPosition();
                m0Var.skipBytes(unsignedShort);
                arrayList.add(io.bidmachine.media3.common.util.h.buildNalUnit(m0Var.getData(), position, unsignedShort));
            }
            int unsignedByte3 = m0Var.readUnsignedByte();
            for (int i19 = 0; i19 < unsignedByte3; i19++) {
                int unsignedShort2 = m0Var.readUnsignedShort();
                int position2 = m0Var.getPosition();
                m0Var.skipBytes(unsignedShort2);
                arrayList.add(io.bidmachine.media3.common.util.h.buildNalUnit(m0Var.getData(), position2, unsignedShort2));
            }
            if (unsignedByte2 > 0) {
                jn.t spsNalUnit = jn.u.parseSpsNalUnit((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i20 = spsNalUnit.f69784e;
                int i21 = spsNalUnit.f69785f;
                int i22 = spsNalUnit.f69787h + 8;
                int i23 = spsNalUnit.f69788i + 8;
                int i24 = spsNalUnit.f69795p;
                int i25 = spsNalUnit.f69796q;
                int i26 = spsNalUnit.f69797r;
                int i27 = spsNalUnit.f69798s;
                float f11 = spsNalUnit.f69786g;
                strBuildAvcCodecString = io.bidmachine.media3.common.util.h.buildAvcCodecString(spsNalUnit.f69780a, spsNalUnit.f69781b, spsNalUnit.f69782c);
                i13 = i25;
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i11 = i21;
                i12 = i22;
                i16 = i23;
                i17 = i24;
                i10 = i20;
            } else {
                strBuildAvcCodecString = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new h(arrayList, unsignedByte, i10, i11, i12, i16, i17, i13, i14, i15, f10, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw gn.z0.createForMalformedContainer("Error parsing AVC config", e10);
        }
    }
}
