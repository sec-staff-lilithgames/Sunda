package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.PersistableBundle;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import de.c0;
import de.d0;
import de.e0;
import de.g0;
import de.h0;
import de.i0;
import de.j0;
import de.k0;
import de.l0;
import de.m0;
import de.r0;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f27433d = new j0();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f27434a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f27435b;

    /* renamed from: c, reason: collision with root package name */
    public int f27436c;

    public f(UUID uuid) {
        com.google.android.exoplayer2.util.a.checkNotNull(uuid);
        com.google.android.exoplayer2.util.a.checkArgument(!j.f27535b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27434a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f27435b = mediaDrm;
        this.f27436c = 1;
        if (j.f27537d.equals(uuid) && "ASUS_Z00AD".equals(n1.f28509d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static UUID a(UUID uuid) {
        return (n1.f28506a >= 27 || !j.f27536c.equals(uuid)) ? uuid : j.f27535b;
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(a(uuid));
    }

    public static f newInstance(UUID uuid) throws r0 {
        try {
            return new f(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new r0(1, e10);
        } catch (Exception e11) {
            throw new r0(2, e11);
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public synchronized void acquire() {
        com.google.android.exoplayer2.util.a.checkState(this.f27436c > 0);
        this.f27436c++;
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void closeSession(byte[] bArr) {
        this.f27435b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public int getCryptoType() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    @Override // com.google.android.exoplayer2.drm.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public de.a0 getKeyRequest(byte[] r15, java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> r16, int r17, java.util.HashMap<java.lang.String, java.lang.String> r18) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.f.getKeyRequest(byte[], java.util.List, int, java.util.HashMap):de.a0");
    }

    @Override // com.google.android.exoplayer2.drm.e
    public PersistableBundle getMetrics() {
        if (n1.f28506a < 28) {
            return null;
        }
        return this.f27435b.getMetrics();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] getPropertyByteArray(String str) {
        return this.f27435b.getPropertyByteArray(str);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public String getPropertyString(String str) {
        return this.f27435b.getPropertyString(str);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public g0 getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f27435b.getProvisionRequest();
        return new g0(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] openSession() throws MediaDrmException {
        return this.f27435b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.e
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws JSONException, DeniedByServerException, NotProvisionedException {
        if (j.f27536c.equals(this.f27434a)) {
            bArr2 = de.a.adjustResponseData(bArr2);
        }
        return this.f27435b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f27435b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f27435b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public synchronized void release() {
        int i10 = this.f27436c - 1;
        this.f27436c = i10;
        if (i10 == 0) {
            this.f27435b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        if (n1.f28506a >= 31) {
            return m0.requiresSecureDecoder(this.f27435b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f27434a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f27435b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnEventListener(c0 c0Var) {
        this.f27435b.setOnEventListener(c0Var == null ? null : new l0(0, this, c0Var));
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnExpirationUpdateListener(d0 d0Var) {
        if (n1.f28506a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f27435b.setOnExpirationUpdateListener(d0Var == null ? null : new k0(this, 0), (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setOnKeyStatusChangeListener(e0 e0Var) {
        if (n1.f28506a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f27435b.setOnKeyStatusChangeListener(e0Var == null ? null : new i0(this, 0), (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setPlayerIdForSession(byte[] bArr, zd.c0 c0Var) {
        if (n1.f28506a >= 31) {
            try {
                m0.setLogSessionIdOnMediaDrmSession(this.f27435b, bArr, c0Var);
            } catch (UnsupportedOperationException unused) {
                f0.w("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.f27435b.setPropertyByteArray(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public void setPropertyString(String str, String str2) {
        this.f27435b.setPropertyString(str, str2);
    }

    @Override // com.google.android.exoplayer2.drm.e
    public h0 createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        int i10 = n1.f28506a;
        UUID uuid = this.f27434a;
        return new h0(a(uuid), bArr, i10 < 21 && j.f27537d.equals(uuid) && "L3".equals(getPropertyString("securityLevel")));
    }
}
