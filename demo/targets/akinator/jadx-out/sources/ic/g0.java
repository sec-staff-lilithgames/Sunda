package ic;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f59479b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f59480c;

    /* renamed from: e, reason: collision with root package name */
    public final String f59481e;

    public g0(byte[] bArr, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        }
        this.f59479b = bArr;
        this.f59481e = (str == null || str.isEmpty()) ? C.UTF8_NAME : str;
    }

    public Object getRawPayload() {
        byte[] bArr = this.f59479b;
        return bArr != null ? bArr : this.f59480c;
    }

    public String toString() {
        byte[] bArr = this.f59479b;
        if (bArr == null) {
            return this.f59480c.toString();
        }
        try {
            return new String(bArr, this.f59481e);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public g0(CharSequence charSequence) {
        if (charSequence != null) {
            this.f59480c = charSequence;
            return;
        }
        throw new IllegalArgumentException();
    }
}
