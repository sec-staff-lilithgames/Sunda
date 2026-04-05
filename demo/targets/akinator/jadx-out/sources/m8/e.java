package m8;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f74099b;

    /* renamed from: c, reason: collision with root package name */
    public d f74100c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f74098a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];

    /* renamed from: d, reason: collision with root package name */
    public int f74101d = 0;

    public final boolean a() {
        return this.f74100c.f74087b != 0;
    }

    public final int b() {
        try {
            return this.f74099b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (Exception unused) {
            this.f74100c.f74087b = 1;
            return 0;
        }
    }

    public final void c() {
        int iB = b();
        this.f74101d = iB;
        if (iB <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f74101d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f74099b.get(this.f74098a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbF = i.f(i10, i11, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbF.append(this.f74101d);
                    Log.d("GifHeaderParser", sbF.toString(), e10);
                }
                this.f74100c.f74087b = 1;
                return;
            }
        }
    }

    public void clear() {
        this.f74099b = null;
        this.f74100c = null;
    }

    public final int[] d(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f74099b.get(bArr);
            iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f74100c.f74087b = 1;
            return iArr;
        }
    }

    public final void e(int i10) {
        byte[] bArr;
        boolean z10 = false;
        while (!z10 && !a() && this.f74100c.f74088c <= i10) {
            int iB = b();
            if (iB == 33) {
                int iB2 = b();
                if (iB2 == 1) {
                    g();
                } else if (iB2 == 249) {
                    this.f74100c.f74089d = new c();
                    b();
                    int iB3 = b();
                    c cVar = this.f74100c.f74089d;
                    int i11 = (iB3 & 28) >> 2;
                    cVar.f74081g = i11;
                    if (i11 == 0) {
                        cVar.f74081g = 1;
                    }
                    cVar.f74080f = (iB3 & 1) != 0;
                    short s10 = this.f74099b.getShort();
                    if (s10 < 2) {
                        s10 = 10;
                    }
                    c cVar2 = this.f74100c.f74089d;
                    cVar2.f74083i = s10 * 10;
                    cVar2.f74082h = b();
                    b();
                } else if (iB2 == 254) {
                    g();
                } else if (iB2 != 255) {
                    g();
                } else {
                    c();
                    StringBuilder sb2 = new StringBuilder();
                    int i12 = 0;
                    while (true) {
                        bArr = this.f74098a;
                        if (i12 >= 11) {
                            break;
                        }
                        sb2.append((char) bArr[i12]);
                        i12++;
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        do {
                            c();
                            if (bArr[0] == 1) {
                                this.f74100c.f74097l = (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                            }
                            if (this.f74101d > 0) {
                            }
                        } while (!a());
                    } else {
                        g();
                    }
                }
            } else if (iB == 44) {
                d dVar = this.f74100c;
                if (dVar.f74089d == null) {
                    dVar.f74089d = new c();
                }
                dVar.f74089d.f74075a = this.f74099b.getShort();
                this.f74100c.f74089d.f74076b = this.f74099b.getShort();
                this.f74100c.f74089d.f74077c = this.f74099b.getShort();
                this.f74100c.f74089d.f74078d = this.f74099b.getShort();
                int iB4 = b();
                boolean z11 = (iB4 & 128) != 0;
                int iPow = (int) Math.pow(2.0d, (iB4 & 7) + 1);
                c cVar3 = this.f74100c.f74089d;
                cVar3.f74079e = (iB4 & 64) != 0;
                if (z11) {
                    cVar3.f74085k = d(iPow);
                } else {
                    cVar3.f74085k = null;
                }
                this.f74100c.f74089d.f74084j = this.f74099b.position();
                b();
                g();
                if (!a()) {
                    d dVar2 = this.f74100c;
                    dVar2.f74088c++;
                    dVar2.f74090e.add(dVar2.f74089d);
                }
            } else if (iB != 59) {
                this.f74100c.f74087b = 1;
            } else {
                z10 = true;
            }
        }
    }

    public final void f() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) b());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f74100c.f74087b = 1;
            return;
        }
        this.f74100c.f74091f = this.f74099b.getShort();
        this.f74100c.f74092g = this.f74099b.getShort();
        int iB = b();
        d dVar = this.f74100c;
        dVar.f74093h = (iB & 128) != 0;
        dVar.f74094i = (int) Math.pow(2.0d, (iB & 7) + 1);
        this.f74100c.f74095j = b();
        d dVar2 = this.f74100c;
        b();
        dVar2.getClass();
        if (!this.f74100c.f74093h || a()) {
            return;
        }
        d dVar3 = this.f74100c;
        dVar3.f74086a = d(dVar3.f74094i);
        d dVar4 = this.f74100c;
        dVar4.f74096k = dVar4.f74086a[dVar4.f74095j];
    }

    public final void g() {
        int iB;
        do {
            iB = b();
            this.f74099b.position(Math.min(this.f74099b.position() + iB, this.f74099b.limit()));
        } while (iB > 0);
    }

    public boolean isAnimated() {
        f();
        if (!a()) {
            e(2);
        }
        return this.f74100c.f74088c > 1;
    }

    public d parseHeader() {
        if (this.f74099b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f74100c;
        }
        f();
        if (!a()) {
            e(Integer.MAX_VALUE);
            d dVar = this.f74100c;
            if (dVar.f74088c < 0) {
                dVar.f74087b = 1;
            }
        }
        return this.f74100c;
    }

    public e setData(byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
            return this;
        }
        this.f74099b = null;
        this.f74100c.f74087b = 2;
        return this;
    }

    public e setData(ByteBuffer byteBuffer) {
        this.f74099b = null;
        Arrays.fill(this.f74098a, (byte) 0);
        this.f74100c = new d();
        this.f74101d = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f74099b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f74099b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
