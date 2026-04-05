package io.odeeo.internal.p;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.p.d0;
import io.odeeo.internal.u0.h1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements d0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f65341a;

    /* renamed from: b, reason: collision with root package name */
    public final List<io.odeeo.internal.b.t> f65342b;

    public g() {
        this(0);
    }

    public final z a(d0.b bVar) {
        return new z(c(bVar));
    }

    public final f0 b(d0.b bVar) {
        return new f0(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    public final List<io.odeeo.internal.b.t> c(d0.b bVar) {
        String str;
        int i10;
        if (a(32)) {
            return this.f65342b;
        }
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(bVar.f65298d);
        ArrayList arrayList = this.f65342b;
        while (xVar.bytesLeft() > 0) {
            int unsignedByte = xVar.readUnsignedByte();
            int position = xVar.getPosition() + xVar.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new ArrayList();
                int unsignedByte2 = xVar.readUnsignedByte() & 31;
                for (int i11 = 0; i11 < unsignedByte2; i11++) {
                    String string = xVar.readString(3);
                    int unsignedByte3 = xVar.readUnsignedByte();
                    boolean z10 = (unsignedByte3 & 128) != 0;
                    if (z10) {
                        i10 = unsignedByte3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte unsignedByte4 = (byte) xVar.readUnsignedByte();
                    xVar.skipBytes(1);
                    arrayList.add(new t.b().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i10).setInitializationData(z10 ? io.odeeo.internal.q0.e.buildCea708InitializationData((unsignedByte4 & 64) != 0) : null).build());
                }
            }
            xVar.setPosition(position);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // io.odeeo.internal.p.d0.c
    public SparseArray<d0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    @Override // io.odeeo.internal.p.d0.c
    public d0 createPayloadReader(int i10, d0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new t(new q(bVar.f65296b));
            }
            if (i10 == 21) {
                return new t(new o());
            }
            if (i10 == 27) {
                if (a(4)) {
                    return null;
                }
                return new t(new m(a(bVar), a(1), a(8)));
            }
            if (i10 == 36) {
                return new t(new n(a(bVar)));
            }
            if (i10 == 89) {
                return new t(new i(bVar.f65297c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new t(new d(bVar.f65296b));
                }
                if (i10 == 257) {
                    return new y(new s("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new y(new s(MimeTypes.APPLICATION_SCTE35));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i10) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new t(new b(bVar.f65296b));
            }
            return new t(new h(bVar.f65296b));
        }
        return new t(new k(b(bVar)));
    }

    public g(int i10) {
        this(i10, h1.of());
    }

    public final boolean a(int i10) {
        return (i10 & this.f65341a) != 0;
    }

    public g(int i10, List<io.odeeo.internal.b.t> list) {
        this.f65341a = i10;
        this.f65342b = list;
    }
}
