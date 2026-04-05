package oe;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79084a;

    /* renamed from: b, reason: collision with root package name */
    public final List f79085b;

    public g() {
        this(0);
    }

    public final List a(g0 g0Var) {
        String str;
        int i10;
        boolean zB = b(32);
        List list = this.f79085b;
        if (zB) {
            return list;
        }
        v0 v0Var = new v0(g0Var.f79089d);
        while (v0Var.bytesLeft() > 0) {
            int unsignedByte = v0Var.readUnsignedByte();
            int position = v0Var.getPosition() + v0Var.readUnsignedByte();
            if (unsignedByte == 134) {
                ArrayList arrayList = new ArrayList();
                int unsignedByte2 = v0Var.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < unsignedByte2; i11++) {
                    String string = v0Var.readString(3);
                    int unsignedByte3 = v0Var.readUnsignedByte();
                    boolean z10 = (unsignedByte3 & 128) != 0;
                    if (z10) {
                        i10 = unsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte unsignedByte4 = (byte) v0Var.readUnsignedByte();
                    v0Var.skipBytes(1);
                    arrayList.add(new y0().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i10).setInitializationData(z10 ? com.google.android.exoplayer2.util.e.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
                list = arrayList;
            }
            v0Var.setPosition(position);
        }
        return list;
    }

    public final boolean b(int i10) {
        return (i10 & this.f79084a) != 0;
    }

    @Override // oe.h0
    public SparseArray<j0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // oe.h0
    public j0 createPayloadReader(int i10, g0 g0Var) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new u(new r(g0Var.f79087b));
            }
            if (i10 == 21) {
                return new u(new p());
            }
            if (i10 == 27) {
                if (b(4)) {
                    return null;
                }
                return new u(new n(new b0(a(g0Var)), b(1), b(8)));
            }
            if (i10 == 36) {
                return new u(new o(new b0(a(g0Var))));
            }
            if (i10 == 89) {
                return new u(new i(g0Var.f79088c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new u(new d(g0Var.f79087b));
                }
                if (i10 == 257) {
                    return new a0(new t("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (b(16)) {
                        return null;
                    }
                    return new a0(new t(MimeTypes.APPLICATION_SCTE35));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (b(2)) {
                                return null;
                            }
                            return new u(new f(false, g0Var.f79087b));
                        case 16:
                            return new u(new l(new l0(a(g0Var))));
                        case 17:
                            if (b(2)) {
                                return null;
                            }
                            return new u(new q(g0Var.f79087b));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!b(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new u(new b(g0Var.f79087b));
            }
            return new u(new h(g0Var.f79087b));
        }
        return new u(new k(new l0(a(g0Var))));
    }

    public g(int i10) {
        this(i10, b5.of());
    }

    public g(int i10, List<z0> list) {
        this.f79084a = i10;
        this.f79085b = list;
    }
}
