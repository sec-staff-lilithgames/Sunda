package co;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class n extends e {

    /* renamed from: j, reason: collision with root package name */
    public byte[] f12463j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f12464k;

    public n(ln.i iVar, ln.m mVar, int i10, io.bidmachine.media3.common.b bVar, int i11, Object obj, byte[] bArr) {
        super(iVar, mVar, i10, bVar, i11, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.f12463j = bArr == null ? a1.f60681c : bArr;
    }

    public abstract void a(byte[] bArr, int i10);

    @Override // co.e, go.x
    public final void cancelLoad() {
        this.f12464k = true;
    }

    public byte[] getDataHolder() {
        return this.f12463j;
    }

    @Override // co.e, go.x
    public final void load() throws IOException {
        try {
            this.f12425i.open(this.f12418b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f12464k) {
                byte[] bArr = this.f12463j;
                if (bArr.length < i11 + 16384) {
                    this.f12463j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f12425i.read(this.f12463j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f12464k) {
                a(this.f12463j, i11);
            }
            ln.l.closeQuietly(this.f12425i);
        } catch (Throwable th2) {
            ln.l.closeQuietly(this.f12425i);
            throw th2;
        }
    }
}
