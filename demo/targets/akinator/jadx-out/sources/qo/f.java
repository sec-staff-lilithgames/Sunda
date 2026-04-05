package qo;

import gn.w;
import gn.z0;
import io.bidmachine.media3.common.util.m0;
import jn.u;
import ko.e1;
import ko.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final m0 f83416b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f83417c;

    /* renamed from: d, reason: collision with root package name */
    public int f83418d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83419e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83420f;

    /* renamed from: g, reason: collision with root package name */
    public int f83421g;

    public f(e1 e1Var) {
        super(e1Var);
        this.f83416b = new m0(u.f69799a);
        this.f83417c = new m0(4);
    }

    @Override // qo.e
    public final boolean a(m0 m0Var) throws d {
        int unsignedByte = m0Var.readUnsignedByte();
        int i10 = (unsignedByte >> 4) & 15;
        int i11 = unsignedByte & 15;
        if (i11 != 7) {
            throw new d(a.b.e(i11, "Video format not supported: "));
        }
        this.f83421g = i10;
        return i10 != 5;
    }

    @Override // qo.e
    public final boolean b(long j10, m0 m0Var) throws z0 {
        int unsignedByte = m0Var.readUnsignedByte();
        long int24 = (m0Var.readInt24() * 1000) + j10;
        e1 e1Var = this.f83415a;
        if (unsignedByte == 0 && !this.f83419e) {
            m0 m0Var2 = new m0(new byte[m0Var.bytesLeft()]);
            m0Var.readBytes(m0Var2.getData(), 0, m0Var.bytesLeft());
            h hVar = h.parse(m0Var2);
            this.f83418d = hVar.f71651b;
            e1Var.format(new w().setContainerMimeType("video/x-flv").setSampleMimeType("video/avc").setCodecs(hVar.f71661l).setWidth(hVar.f71652c).setHeight(hVar.f71653d).setPixelWidthHeightRatio(hVar.f71660k).setInitializationData(hVar.f71650a).build());
            this.f83419e = true;
            return false;
        }
        if (unsignedByte == 1 && this.f83419e) {
            int i10 = this.f83421g == 1 ? 1 : 0;
            if (this.f83420f || i10 != 0) {
                m0 m0Var3 = this.f83417c;
                byte[] data = m0Var3.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i11 = 4 - this.f83418d;
                int i12 = 0;
                while (m0Var.bytesLeft() > 0) {
                    m0Var.readBytes(m0Var3.getData(), i11, this.f83418d);
                    m0Var3.setPosition(0);
                    int unsignedIntToInt = m0Var3.readUnsignedIntToInt();
                    m0 m0Var4 = this.f83416b;
                    m0Var4.setPosition(0);
                    e1Var.sampleData(m0Var4, 4);
                    e1Var.sampleData(m0Var, unsignedIntToInt);
                    i12 = i12 + 4 + unsignedIntToInt;
                }
                this.f83415a.sampleMetadata(int24, i10, i12, 0, null);
                this.f83420f = true;
                return true;
            }
        }
        return false;
    }

    @Override // qo.e
    public void seek() {
        this.f83420f = false;
    }
}
