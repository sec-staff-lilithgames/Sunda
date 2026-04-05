package wr;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c7 extends n5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90864a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f90865b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f90866c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90867d;

    /* renamed from: e, reason: collision with root package name */
    public final List f90868e;

    /* renamed from: f, reason: collision with root package name */
    public final a7 f90869f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f90870g;

    /* renamed from: h, reason: collision with root package name */
    public final List f90871h;

    public c7(z6 z6Var) {
        this.f90864a = z6Var.f91230a;
        this.f90865b = z6Var.f91231b;
        this.f90866c = z6Var.f91232c;
        this.f90867d = z6Var.f91233d;
        this.f90868e = z6Var.f91234e;
        this.f90869f = z6Var.f91235f;
        this.f90870g = z6Var.f91236g;
        this.f90871h = z6Var.f91237h;
    }

    public static n5 create(File file, File file2) throws IOException {
        return newBuilder().keyManager(file, file2).build();
    }

    public static z6 newBuilder() {
        z6 z6Var = new z6();
        z6Var.f91235f = a7.f90810b;
        return z6Var;
    }

    public byte[] getCertificateChain() {
        byte[] bArr = this.f90865b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public a7 getClientAuth() {
        return this.f90869f;
    }

    public List<KeyManager> getKeyManagers() {
        return this.f90868e;
    }

    public byte[] getPrivateKey() {
        byte[] bArr = this.f90866c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String getPrivateKeyPassword() {
        return this.f90867d;
    }

    public byte[] getRootCertificates() {
        byte[] bArr = this.f90870g;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public List<TrustManager> getTrustManagers() {
        return this.f90871h;
    }

    public Set<b7> incomprehensible(Set<b7> set) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(b7.class);
        if (this.f90864a) {
            b7 b7Var = b7.f90837b;
            if (!set.contains(b7Var)) {
                enumSetNoneOf.add(b7Var);
            }
        }
        if (this.f90869f != a7.f90810b) {
            b7 b7Var2 = b7.f90838c;
            if (!set.contains(b7Var2)) {
                enumSetNoneOf.add(b7Var2);
            }
        }
        if (this.f90868e != null || this.f90871h != null) {
            b7 b7Var3 = b7.f90839e;
            if (!set.contains(b7Var3)) {
                enumSetNoneOf.add(b7Var3);
            }
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static n5 create(InputStream inputStream, InputStream inputStream2) throws IOException {
        return newBuilder().keyManager(inputStream, inputStream2).build();
    }
}
