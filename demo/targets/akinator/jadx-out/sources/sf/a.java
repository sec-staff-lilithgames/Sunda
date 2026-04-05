package sf;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.o0;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f85597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85600d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85601e;

    /* renamed from: f, reason: collision with root package name */
    public final int f85602f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85603g;

    /* renamed from: h, reason: collision with root package name */
    public final float f85604h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85605i;

    public a(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f85597a = arrayList;
        this.f85598b = i10;
        this.f85599c = i11;
        this.f85600d = i12;
        this.f85601e = i13;
        this.f85602f = i14;
        this.f85603g = i15;
        this.f85604h = f10;
        this.f85605i = str;
    }

    public static a parse(v0 v0Var) throws h2 {
        String strBuildAvcCodecString;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        try {
            v0Var.skipBytes(4);
            int unsignedByte = (v0Var.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = v0Var.readUnsignedByte() & 31;
            for (int i15 = 0; i15 < unsignedByte2; i15++) {
                int unsignedShort = v0Var.readUnsignedShort();
                int position = v0Var.getPosition();
                v0Var.skipBytes(unsignedShort);
                arrayList.add(com.google.android.exoplayer2.util.e.buildNalUnit(v0Var.getData(), position, unsignedShort));
            }
            int unsignedByte3 = v0Var.readUnsignedByte();
            for (int i16 = 0; i16 < unsignedByte3; i16++) {
                int unsignedShort2 = v0Var.readUnsignedShort();
                int position2 = v0Var.getPosition();
                v0Var.skipBytes(unsignedShort2);
                arrayList.add(com.google.android.exoplayer2.util.e.buildNalUnit(v0Var.getData(), position2, unsignedShort2));
            }
            if (unsignedByte2 > 0) {
                o0 spsNalUnit = p0.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i17 = spsNalUnit.f28527e;
                int i18 = spsNalUnit.f28528f;
                int i19 = spsNalUnit.f28536n;
                int i20 = spsNalUnit.f28537o;
                int i21 = spsNalUnit.f28538p;
                float f11 = spsNalUnit.f28529g;
                strBuildAvcCodecString = com.google.android.exoplayer2.util.e.buildAvcCodecString(spsNalUnit.f28523a, spsNalUnit.f28524b, spsNalUnit.f28525c);
                i12 = i20;
                i13 = i21;
                f10 = f11;
                i10 = i17;
                i11 = i18;
                i14 = i19;
            } else {
                strBuildAvcCodecString = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f10 = 1.0f;
                i14 = -1;
            }
            return new a(arrayList, unsignedByte, i10, i11, i14, i12, i13, f10, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw h2.createForMalformedContainer("Error parsing AVC config", e10);
        }
    }
}
