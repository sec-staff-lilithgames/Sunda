package wr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91230a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f91231b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f91232c;

    /* renamed from: d, reason: collision with root package name */
    public String f91233d;

    /* renamed from: e, reason: collision with root package name */
    public List f91234e;

    /* renamed from: f, reason: collision with root package name */
    public a7 f91235f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f91236g;

    /* renamed from: h, reason: collision with root package name */
    public List f91237h;

    public n5 build() {
        if (this.f91231b == null && this.f91234e == null) {
            throw new IllegalStateException("A key manager is required");
        }
        return new c7(this);
    }

    public z6 clientAuth(a7 a7Var) {
        mh.p1.checkNotNull(a7Var, "clientAuth");
        this.f91235f = a7Var;
        return this;
    }

    public z6 keyManager(File file, File file2) throws IOException {
        return keyManager(file, file2, (String) null);
    }

    public z6 requireFakeFeature() {
        this.f91230a = true;
        return this;
    }

    public z6 trustManager(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return trustManager(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public z6 keyManager(File file, File file2, String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream = new FileInputStream(file2);
            z6 z6VarKeyManager = keyManager(fileInputStream, fileInputStream, str);
            fileInputStream.close();
            return z6VarKeyManager;
        } catch (Throwable th2) {
            throw th2;
        } finally {
            fileInputStream.close();
        }
    }

    public z6 trustManager(InputStream inputStream) throws IOException {
        byte[] byteArray = ph.e0.toByteArray(inputStream);
        this.f91237h = null;
        this.f91236g = byteArray;
        return this;
    }

    public z6 trustManager(TrustManager... trustManagerArr) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
        this.f91236g = null;
        this.f91237h = listUnmodifiableList;
        return this;
    }

    public z6 keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
        return keyManager(inputStream, inputStream2, (String) null);
    }

    public z6 keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
        byte[] byteArray = ph.e0.toByteArray(inputStream);
        byte[] byteArray2 = ph.e0.toByteArray(inputStream2);
        this.f91234e = null;
        this.f91231b = byteArray;
        this.f91232c = byteArray2;
        this.f91233d = str;
        return this;
    }

    public z6 keyManager(KeyManager... keyManagerArr) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
        this.f91231b = null;
        this.f91232c = null;
        this.f91233d = null;
        this.f91234e = listUnmodifiableList;
        return this;
    }
}
