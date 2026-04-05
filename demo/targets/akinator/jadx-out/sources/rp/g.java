package rp;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f84633a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84634b;

    public g() {
        this(0);
    }

    public final List a(k0 k0Var) {
        String str;
        int i10;
        boolean zB = b(32);
        List list = this.f84634b;
        if (zB) {
            return list;
        }
        io.bidmachine.media3.common.util.m0 m0Var = new io.bidmachine.media3.common.util.m0(k0Var.f84729e);
        while (m0Var.bytesLeft() > 0) {
            int unsignedByte = m0Var.readUnsignedByte();
            int position = m0Var.getPosition() + m0Var.readUnsignedByte();
            if (unsignedByte == 134) {
                ArrayList arrayList = new ArrayList();
                int unsignedByte2 = m0Var.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < unsignedByte2; i11++) {
                    String string = m0Var.readString(3);
                    int unsignedByte3 = m0Var.readUnsignedByte();
                    boolean z10 = (unsignedByte3 & 128) != 0;
                    if (z10) {
                        i10 = unsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte unsignedByte4 = (byte) m0Var.readUnsignedByte();
                    m0Var.skipBytes(1);
                    arrayList.add(new gn.w().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i10).setInitializationData(z10 ? io.bidmachine.media3.common.util.h.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
                list = arrayList;
            }
            m0Var.setPosition(position);
        }
        return list;
    }

    public final boolean b(int i10) {
        return (i10 & this.f84633a) != 0;
    }

    @Override // rp.l0
    public SparseArray<n0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b  */
    @Override // rp.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rp.n0 createPayloadReader(int r5, rp.k0 r6) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.g.createPayloadReader(int, rp.k0):rp.n0");
    }

    public g(int i10) {
        this(i10, b5.of());
    }

    public g(int i10, List<io.bidmachine.media3.common.b> list) {
        this.f84633a = i10;
        this.f84634b = list;
    }
}
