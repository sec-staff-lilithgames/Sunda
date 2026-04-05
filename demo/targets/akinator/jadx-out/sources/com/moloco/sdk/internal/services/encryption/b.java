package com.moloco.sdk.internal.services.encryption;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f47002a = a.f47001a;

    String a(byte[] bArr, byte[] bArr2);

    IvParameterSpec a();

    byte[] a(String str);

    byte[] a(byte[] bArr);

    byte[] a(byte[] bArr, String str);

    String b(byte[] bArr);

    SecretKeySpec b();

    byte[] b(byte[] bArr, String str);
}
