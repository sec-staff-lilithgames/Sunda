package io.odeeo.internal.n;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.g.x;
import io.odeeo.internal.q0.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f64873a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64874b;

    /* renamed from: c, reason: collision with root package name */
    public final x.a f64875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f64876d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f64877e;

    public l(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        io.odeeo.internal.q0.a.checkArgument((bArr2 == null) ^ (i10 == 0));
        this.f64873a = z10;
        this.f64874b = str;
        this.f64876d = i10;
        this.f64877e = bArr2;
        this.f64875c = new x.a(a(str), bArr, i11, i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(C.CENC_TYPE_cbc1)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(C.CENC_TYPE_cbcs)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(C.CENC_TYPE_cenc)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(C.CENC_TYPE_cens)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                p.w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
