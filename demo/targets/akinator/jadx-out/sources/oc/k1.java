package oc;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k1 extends t {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f78880f;

    static {
        int[] iArr = new int[127];
        f78880f = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            f78880f[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = f78880f;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public k1() {
        super(UUID.class);
    }

    public static int a0(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[i10] << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    @Override // oc.t
    public final Object V(String str, jc.k kVar) {
        if (str.length() != 36) {
            if (str.length() == 24) {
                return Z(ub.c.getDefaultVariant().decode(str.replace('-', '+').replace('_', '/')), kVar);
            }
            if (str.length() != 22) {
                return (UUID) kVar.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
            }
            return Z(ub.c.f88199d.decode(str.replace('+', '-').replace('/', '_')), kVar);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
        }
        return new UUID((c0(str, 0, kVar) << 32) + ((d0(str, 9, kVar) << 16) | d0(str, 14, kVar)), ((c0(str, 28, kVar) << 32) >>> 32) | (((d0(str, 19, kVar) << 16) | d0(str, 24, kVar)) << 32));
    }

    @Override // oc.t
    public final Object W(jc.k kVar, Object obj) throws jc.r {
        if (obj instanceof byte[]) {
            return Z((byte[]) obj, kVar);
        }
        super.W(kVar, obj);
        return null;
    }

    public final UUID Z(byte[] bArr, jc.k kVar) throws pc.c {
        if (bArr.length == 16) {
            return new UUID((a0(0, bArr) << 32) | ((a0(4, bArr) << 32) >>> 32), (a0(8, bArr) << 32) | ((a0(12, bArr) << 32) >>> 32));
        }
        throw pc.c.from(kVar.getParser(), a.b.f(bArr.length, " bytes", new StringBuilder("Can only construct UUIDs from byte[16]; got ")), bArr, handledType());
    }

    public final int b0(String str, int i10, jc.k kVar) throws jc.r {
        int i11;
        char cCharAt = str.charAt(i10);
        char cCharAt2 = str.charAt(i10 + 1);
        int[] iArr = f78880f;
        if (cCharAt <= 127 && cCharAt2 <= 127 && (i11 = (iArr[cCharAt] << 4) | iArr[cCharAt2]) >= 0) {
            return i11;
        }
        if (cCharAt > 127 || iArr[cCharAt] < 0) {
            throw kVar.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt), Integer.toHexString(cCharAt)));
        }
        throw kVar.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(cCharAt2), Integer.toHexString(cCharAt2)));
    }

    public final int c0(String str, int i10, jc.k kVar) {
        return b0(str, i10 + 6, kVar) + (b0(str, i10, kVar) << 24) + (b0(str, i10 + 2, kVar) << 16) + (b0(str, i10 + 4, kVar) << 8);
    }

    public final int d0(String str, int i10, jc.k kVar) {
        return b0(str, i10 + 2, kVar) + (b0(str, i10, kVar) << 8);
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) {
        return new UUID(0L, 0L);
    }
}
