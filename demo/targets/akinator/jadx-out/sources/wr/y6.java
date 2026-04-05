package wr;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y6 extends k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91202a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f91203b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f91204c;

    /* renamed from: d, reason: collision with root package name */
    public final String f91205d;

    /* renamed from: e, reason: collision with root package name */
    public final List f91206e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f91207f;

    /* renamed from: g, reason: collision with root package name */
    public final List f91208g;

    public y6(w6 w6Var) {
        this.f91202a = w6Var.f91174a;
        this.f91203b = w6Var.f91175b;
        this.f91204c = w6Var.f91176c;
        this.f91205d = w6Var.f91177d;
        this.f91206e = w6Var.f91178e;
        this.f91207f = w6Var.f91179f;
        this.f91208g = w6Var.f91180g;
    }

    public static k create() {
        return newBuilder().build();
    }

    public static w6 newBuilder() {
        return new w6();
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f91203b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<KeyManager> getKeyManagers() {
        return this.f91206e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f91204c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f91205d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f91207f;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f91208g;
    }

    public Set<x6> incomprehensible(Set<x6> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(x6.class);
        if (this.f91202a) {
            x6 x6Var = x6.f91190b;
            if (!set.contains(x6Var)) {
                enumSetNoneOf.add(x6Var);
            }
        }
        byte[] bArr = this.f91207f;
        List list = this.f91206e;
        if (bArr != null || this.f91204c != null || list != null) {
            x6 x6Var2 = x6.f91191c;
            if (!set.contains(x6Var2)) {
                enumSetNoneOf.add(x6Var2);
            }
        }
        if (list != null || this.f91208g != null) {
            x6 x6Var3 = x6.f91192e;
            if (!set.contains(x6Var3)) {
                enumSetNoneOf.add(x6Var3);
            }
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @Override // wr.k
    public k withoutBearerTokens() {
        return this;
    }
}
