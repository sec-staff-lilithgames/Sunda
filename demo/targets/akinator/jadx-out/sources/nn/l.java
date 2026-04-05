package nn;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class l extends i {

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f77102f;

    /* renamed from: g, reason: collision with root package name */
    public int f77103g;

    /* renamed from: h, reason: collision with root package name */
    public int f77104h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer[] f77105i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f77106j;

    /* renamed from: k, reason: collision with root package name */
    public int f77107k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f77108l;

    /* renamed from: m, reason: collision with root package name */
    public final h f77109m;

    public l(h hVar) {
        this.f77109m = hVar;
    }

    public static boolean b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    public void init(long j10, int i10, ByteBuffer byteBuffer) {
        this.f77086c = j10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f77108l = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f77108l;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f77108l = ByteBuffer.allocate(iLimit);
        } else {
            this.f77108l.clear();
        }
        this.f77108l.put(byteBuffer);
        this.f77108l.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i10, int i11) {
        this.f77103g = i10;
        this.f77104h = i11;
    }

    public boolean initForYuvFrame(int i10, int i11, int i12, int i13, int i14) {
        this.f77103g = i10;
        this.f77104h = i11;
        this.f77107k = i14;
        int i15 = (int) ((i11 + 1) / 2);
        if (b(i12, i11) && b(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (b(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f77102f;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f77102f = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f77102f.position(0);
                    this.f77102f.limit(i18);
                }
                if (this.f77105i == null) {
                    this.f77105i = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f77102f;
                ByteBuffer[] byteBufferArr = this.f77105i;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i17);
                if (this.f77106j == null) {
                    this.f77106j = new int[3];
                }
                int[] iArr = this.f77106j;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }

    @Override // nn.i
    public void release() {
        ((ha.a) this.f77109m).releaseOutputBuffer(this);
    }
}
