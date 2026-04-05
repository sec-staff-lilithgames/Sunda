package fw;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f56134a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f56135b = new int[10];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public final void clear() {
        this.f56134a = 0;
        f0.fill$default(this.f56135b, 0, 0, 0, 6, (Object) null);
    }

    public final int get(int i10) {
        return this.f56135b[i10];
    }

    public final boolean getEnablePush(boolean z10) {
        return (this.f56134a & 4) != 0 ? this.f56135b[2] == 1 : z10;
    }

    public final int getHeaderTableSize() {
        if ((this.f56134a & 2) != 0) {
            return this.f56135b[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        return (this.f56134a & 16) != 0 ? this.f56135b[4] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.f56134a & 8) != 0) {
            return this.f56135b[3];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i10) {
        return (this.f56134a & 32) != 0 ? this.f56135b[5] : i10;
    }

    public final int getMaxHeaderListSize(int i10) {
        return (this.f56134a & 64) != 0 ? this.f56135b[6] : i10;
    }

    public final boolean isSet(int i10) {
        return ((1 << i10) & this.f56134a) != 0;
    }

    public final void merge(d0 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.isSet(i10)) {
                set(i10, other.get(i10));
            }
        }
    }

    public final d0 set(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f56135b;
            if (i10 < iArr.length) {
                this.f56134a = (1 << i10) | this.f56134a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.f56134a);
    }
}
