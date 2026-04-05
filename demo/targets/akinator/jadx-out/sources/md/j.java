package md;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends u {

    /* renamed from: a, reason: collision with root package name */
    public final String f74294a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f74295b;

    /* renamed from: c, reason: collision with root package name */
    public final t f74296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f74297d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74298e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f74299f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f74300g;

    /* renamed from: h, reason: collision with root package name */
    public final String f74301h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f74302i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f74303j;

    public j(String str, Integer num, t tVar, long j10, long j11, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f74294a = str;
        this.f74295b = num;
        this.f74296c = tVar;
        this.f74297d = j10;
        this.f74298e = j11;
        this.f74299f = map;
        this.f74300g = num2;
        this.f74301h = str2;
        this.f74302i = bArr;
        this.f74303j = bArr2;
    }

    @Override // md.u
    public final Map a() {
        return this.f74299f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f74294a.equals(uVar.getTransportName())) {
            return false;
        }
        Integer num = this.f74295b;
        if (num == null) {
            if (uVar.getCode() != null) {
                return false;
            }
        } else if (!num.equals(uVar.getCode())) {
            return false;
        }
        if (!this.f74296c.equals(uVar.getEncodedPayload()) || this.f74297d != uVar.getEventMillis() || this.f74298e != uVar.getUptimeMillis() || !this.f74299f.equals(uVar.a())) {
            return false;
        }
        Integer num2 = this.f74300g;
        if (num2 == null) {
            if (uVar.getProductId() != null) {
                return false;
            }
        } else if (!num2.equals(uVar.getProductId())) {
            return false;
        }
        String str = this.f74301h;
        if (str == null) {
            if (uVar.getPseudonymousId() != null) {
                return false;
            }
        } else if (!str.equals(uVar.getPseudonymousId())) {
            return false;
        }
        boolean z10 = uVar instanceof j;
        if (Arrays.equals(this.f74302i, z10 ? ((j) uVar).f74302i : uVar.getExperimentIdsClear())) {
            return Arrays.equals(this.f74303j, z10 ? ((j) uVar).f74303j : uVar.getExperimentIdsEncrypted());
        }
        return false;
    }

    @Override // md.u
    public Integer getCode() {
        return this.f74295b;
    }

    @Override // md.u
    public t getEncodedPayload() {
        return this.f74296c;
    }

    @Override // md.u
    public long getEventMillis() {
        return this.f74297d;
    }

    @Override // md.u
    public byte[] getExperimentIdsClear() {
        return this.f74302i;
    }

    @Override // md.u
    public byte[] getExperimentIdsEncrypted() {
        return this.f74303j;
    }

    @Override // md.u
    public Integer getProductId() {
        return this.f74300g;
    }

    @Override // md.u
    public String getPseudonymousId() {
        return this.f74301h;
    }

    @Override // md.u
    public String getTransportName() {
        return this.f74294a;
    }

    @Override // md.u
    public long getUptimeMillis() {
        return this.f74298e;
    }

    public int hashCode() {
        int iHashCode = (this.f74294a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f74295b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f74296c.hashCode()) * 1000003;
        long j10 = this.f74297d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f74298e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f74299f.hashCode()) * 1000003;
        Integer num2 = this.f74300g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f74301h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f74302i)) * 1000003) ^ Arrays.hashCode(this.f74303j);
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f74294a + ", code=" + this.f74295b + ", encodedPayload=" + this.f74296c + ", eventMillis=" + this.f74297d + ", uptimeMillis=" + this.f74298e + ", autoMetadata=" + this.f74299f + ", productId=" + this.f74300g + ", pseudonymousId=" + this.f74301h + ", experimentIdsClear=" + Arrays.toString(this.f74302i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f74303j) + "}";
    }
}
