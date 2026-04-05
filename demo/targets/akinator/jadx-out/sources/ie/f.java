package ie;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.p0;
import com.google.android.exoplayer2.util.v0;
import com.google.android.exoplayer2.y0;
import ee.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final v0 f59567b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f59568c;

    /* renamed from: d, reason: collision with root package name */
    public int f59569d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f59570e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f59571f;

    /* renamed from: g, reason: collision with root package name */
    public int f59572g;

    public f(l0 l0Var) {
        super(l0Var);
        this.f59567b = new v0(p0.f28540a);
        this.f59568c = new v0(4);
    }

    @Override // ie.e
    public final boolean a(v0 v0Var) throws d {
        int unsignedByte = v0Var.readUnsignedByte();
        int i10 = (unsignedByte >> 4) & 15;
        int i11 = unsignedByte & 15;
        if (i11 != 7) {
            throw new d(a.b.e(i11, "Video format not supported: "));
        }
        this.f59572g = i10;
        return i10 != 5;
    }

    @Override // ie.e
    public final boolean b(v0 v0Var, long j10) throws h2 {
        int unsignedByte = v0Var.readUnsignedByte();
        long int24 = (v0Var.readInt24() * 1000) + j10;
        l0 l0Var = this.f59566a;
        if (unsignedByte == 0 && !this.f59570e) {
            v0 v0Var2 = new v0(new byte[v0Var.bytesLeft()]);
            v0Var.readBytes(v0Var2.getData(), 0, v0Var.bytesLeft());
            sf.a aVar = sf.a.parse(v0Var2);
            this.f59569d = aVar.f85598b;
            l0Var.format(new y0().setSampleMimeType("video/avc").setCodecs(aVar.f85605i).setWidth(aVar.f85599c).setHeight(aVar.f85600d).setPixelWidthHeightRatio(aVar.f85604h).setInitializationData(aVar.f85597a).build());
            this.f59570e = true;
            return false;
        }
        if (unsignedByte == 1 && this.f59570e) {
            int i10 = this.f59572g == 1 ? 1 : 0;
            if (this.f59571f || i10 != 0) {
                v0 v0Var3 = this.f59568c;
                byte[] data = v0Var3.getData();
                data[0] = 0;
                data[1] = 0;
                data[2] = 0;
                int i11 = 4 - this.f59569d;
                int i12 = 0;
                while (v0Var.bytesLeft() > 0) {
                    v0Var.readBytes(v0Var3.getData(), i11, this.f59569d);
                    v0Var3.setPosition(0);
                    int unsignedIntToInt = v0Var3.readUnsignedIntToInt();
                    v0 v0Var4 = this.f59567b;
                    v0Var4.setPosition(0);
                    l0Var.sampleData(v0Var4, 4);
                    l0Var.sampleData(v0Var, unsignedIntToInt);
                    i12 = i12 + 4 + unsignedIntToInt;
                }
                this.f59566a.sampleMetadata(int24, i10, i12, 0, null);
                this.f59571f = true;
                return true;
            }
        }
        return false;
    }

    @Override // ie.e
    public void seek() {
        this.f59571f = false;
    }
}
