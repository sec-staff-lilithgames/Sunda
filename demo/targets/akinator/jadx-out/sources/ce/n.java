package ce;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends j {

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f12262e;

    /* renamed from: f, reason: collision with root package name */
    public int f12263f;

    /* renamed from: g, reason: collision with root package name */
    public int f12264g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer[] f12265h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f12266i;

    /* renamed from: j, reason: collision with root package name */
    public int f12267j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f12268k;

    /* renamed from: l, reason: collision with root package name */
    public final i f12269l;

    public n(i iVar) {
        this.f12269l = iVar;
    }

    public static boolean b(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    public void init(long j10, int i10, ByteBuffer byteBuffer) {
        this.f12243c = j10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f12268k = null;
            return;
        }
        addFlag(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f12268k;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f12268k = ByteBuffer.allocate(iLimit);
        } else {
            this.f12268k.clear();
        }
        this.f12268k.put(byteBuffer);
        this.f12268k.flip();
        byteBuffer.position(0);
    }

    public void initForPrivateFrame(int i10, int i11) {
        this.f12263f = i10;
        this.f12264g = i11;
    }

    public boolean initForYuvFrame(int i10, int i11, int i12, int i13, int i14) {
        this.f12263f = i10;
        this.f12264g = i11;
        this.f12267j = i14;
        int i15 = (int) ((i11 + 1) / 2);
        if (b(i12, i11) && b(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (b(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f12262e;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f12262e = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f12262e.position(0);
                    this.f12262e.limit(i18);
                }
                if (this.f12265h == null) {
                    this.f12265h = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f12262e;
                ByteBuffer[] byteBufferArr = this.f12265h;
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
                if (this.f12266i == null) {
                    this.f12266i = new int[3];
                }
                int[] iArr = this.f12266i;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }

    @Override // ce.j
    public void release() {
        ((af.g) this.f12269l).releaseOutputBuffer(this);
    }
}
