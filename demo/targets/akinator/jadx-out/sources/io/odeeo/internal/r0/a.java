package io.odeeo.internal.r0;

import io.odeeo.internal.b.g0;
import io.odeeo.internal.q0.u;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f66124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66125b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66126c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66127d;

    /* renamed from: e, reason: collision with root package name */
    public final float f66128e;

    /* renamed from: f, reason: collision with root package name */
    public final String f66129f;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f66124a = list;
        this.f66125b = i10;
        this.f66126c = i11;
        this.f66127d = i12;
        this.f66128e = f10;
        this.f66129f = str;
    }

    public static byte[] a(x xVar) {
        int unsignedShort = xVar.readUnsignedShort();
        int position = xVar.getPosition();
        xVar.skipBytes(unsignedShort);
        return io.odeeo.internal.q0.e.buildNalUnit(xVar.getData(), position, unsignedShort);
    }

    public static a parse(x xVar) throws g0 {
        float f10;
        String strBuildAvcCodecString;
        int i10;
        int i11;
        try {
            xVar.skipBytes(4);
            int unsignedByte = (xVar.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = xVar.readUnsignedByte() & 31;
            for (int i12 = 0; i12 < unsignedByte2; i12++) {
                arrayList.add(a(xVar));
            }
            int unsignedByte3 = xVar.readUnsignedByte();
            for (int i13 = 0; i13 < unsignedByte3; i13++) {
                arrayList.add(a(xVar));
            }
            if (unsignedByte2 > 0) {
                u.c spsNalUnit = u.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i14 = spsNalUnit.f65947e;
                int i15 = spsNalUnit.f65948f;
                f10 = spsNalUnit.f65949g;
                strBuildAvcCodecString = io.odeeo.internal.q0.e.buildAvcCodecString(spsNalUnit.f65943a, spsNalUnit.f65944b, spsNalUnit.f65945c);
                i10 = i14;
                i11 = i15;
            } else {
                f10 = 1.0f;
                strBuildAvcCodecString = null;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, unsignedByte, i10, i11, f10, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw g0.createForMalformedContainer("Error parsing AVC config", e10);
        }
    }
}
