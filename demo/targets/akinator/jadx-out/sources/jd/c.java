package jd;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public final String f69497a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f69498b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f69499c;

    public c(String str, byte[] bArr, byte[] bArr2) {
        this.f69497a = str;
        this.f69498b = bArr;
        this.f69499c = bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            String str = this.f69497a;
            if (str != null ? str.equals(gVar.getPseudonymousId()) : gVar.getPseudonymousId() == null) {
                boolean z10 = gVar instanceof c;
                if (Arrays.equals(this.f69498b, z10 ? ((c) gVar).f69498b : gVar.getExperimentIdsClear())) {
                    if (Arrays.equals(this.f69499c, z10 ? ((c) gVar).f69499c : gVar.getExperimentIdsEncrypted())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // jd.g
    public byte[] getExperimentIdsClear() {
        return this.f69498b;
    }

    @Override // jd.g
    public byte[] getExperimentIdsEncrypted() {
        return this.f69499c;
    }

    @Override // jd.g
    public String getPseudonymousId() {
        return this.f69497a;
    }

    public int hashCode() {
        String str = this.f69497a;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f69498b)) * 1000003) ^ Arrays.hashCode(this.f69499c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f69497a + ", experimentIdsClear=" + Arrays.toString(this.f69498b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f69499c) + "}";
    }
}
