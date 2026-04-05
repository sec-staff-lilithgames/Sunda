package io.bidmachine.analytics.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3868a implements InterfaceC3869b {

    /* renamed from: b, reason: collision with root package name */
    public static final C0580a f59997b = new C0580a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f59998a = "AES";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.a$a, reason: collision with other inner class name */
    public static final class C0580a {
        public /* synthetic */ C0580a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private C0580a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC3869b
    public byte[] a(Key key, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrA = f0.f60028a.a(12);
        byte[] bArrDoFinal = a(1, key, bArrA).doFinal(bArr);
        byte[] bArr2 = new byte[bArrDoFinal.length + 12];
        uu.f0.copyInto(bArrA, bArr2, 0, 0, 12);
        uu.f0.copyInto(bArrDoFinal, bArr2, 12, 0, bArrDoFinal.length);
        return bArr2;
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC3869b
    public String getName() {
        return this.f59998a;
    }

    private final Cipher a(int i10, Key key, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i10, key, gCMParameterSpec);
        return cipher;
    }
}
