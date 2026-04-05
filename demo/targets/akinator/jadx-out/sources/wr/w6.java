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
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91174a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f91175b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f91176c;

    /* renamed from: d, reason: collision with root package name */
    public String f91177d;

    /* renamed from: e, reason: collision with root package name */
    public List f91178e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f91179f;

    /* renamed from: g, reason: collision with root package name */
    public List f91180g;

    public k build() {
        return new y6(this);
    }

    public w6 keyManager(File file, File file2) throws IOException {
        return keyManager(file, file2, (String) null);
    }

    public w6 requireFakeFeature() {
        this.f91174a = true;
        return this;
    }

    public w6 trustManager(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return trustManager(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public w6 keyManager(File file, File file2, String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream = new FileInputStream(file2);
            w6 w6VarKeyManager = keyManager(fileInputStream, fileInputStream, str);
            fileInputStream.close();
            return w6VarKeyManager;
        } catch (Throwable th2) {
            throw th2;
        } finally {
            fileInputStream.close();
        }
    }

    public w6 trustManager(InputStream inputStream) throws IOException {
        byte[] byteArray = ph.e0.toByteArray(inputStream);
        this.f91180g = null;
        this.f91179f = byteArray;
        return this;
    }

    public w6 trustManager(TrustManager... trustManagerArr) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(trustManagerArr)));
        this.f91179f = null;
        this.f91180g = listUnmodifiableList;
        return this;
    }

    public w6 keyManager(InputStream inputStream, InputStream inputStream2) throws IOException {
        return keyManager(inputStream, inputStream2, (String) null);
    }

    public w6 keyManager(InputStream inputStream, InputStream inputStream2, String str) throws IOException {
        byte[] byteArray = ph.e0.toByteArray(inputStream);
        byte[] byteArray2 = ph.e0.toByteArray(inputStream2);
        this.f91178e = null;
        this.f91175b = byteArray;
        this.f91176c = byteArray2;
        this.f91177d = str;
        return this;
    }

    public w6 keyManager(KeyManager... keyManagerArr) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(Arrays.asList(keyManagerArr)));
        this.f91175b = null;
        this.f91176c = null;
        this.f91177d = null;
        this.f91178e = listUnmodifiableList;
        return this;
    }
}
