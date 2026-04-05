package sn;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.PersistableBundle;
import io.bidmachine.media3.common.util.a1;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 implements i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f86022d = new k0();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f86023a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f86024b;

    /* renamed from: c, reason: collision with root package name */
    public int f86025c;

    public m0(UUID uuid) {
        io.bidmachine.media3.common.util.a.checkNotNull(uuid);
        UUID uuid2 = gn.l.f57985b;
        io.bidmachine.media3.common.util.a.checkArgument(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f86023a = uuid;
        MediaDrm mediaDrm = new MediaDrm((a1.f60679a >= 27 || !Objects.equals(uuid, gn.l.f57986c)) ? uuid : uuid2);
        this.f86024b = mediaDrm;
        this.f86025c = 1;
        if (gn.l.f57987d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        if (a1.f60679a < 27 && Objects.equals(uuid, gn.l.f57986c)) {
            uuid = gn.l.f57985b;
        }
        return MediaDrm.isCryptoSchemeSupported(uuid);
    }

    public static m0 newInstance(UUID uuid) throws r0 {
        try {
            return new m0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new r0(1, e10);
        } catch (Exception e11) {
            throw new r0(2, e11);
        }
    }

    @Override // sn.i0
    public synchronized void acquire() {
        io.bidmachine.media3.common.util.a.checkState(this.f86025c > 0);
        this.f86025c++;
    }

    @Override // sn.i0
    public void closeSession(byte[] bArr) {
        this.f86024b.closeSession(bArr);
    }

    @Override // sn.i0
    public int getCryptoType() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0206  */
    @Override // sn.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sn.b0 getKeyRequest(byte[] r15, java.util.List<io.bidmachine.media3.common.DrmInitData.SchemeData> r16, int r17, java.util.HashMap<java.lang.String, java.lang.String> r18) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.m0.getKeyRequest(byte[], java.util.List, int, java.util.HashMap):sn.b0");
    }

    @Override // sn.i0
    public PersistableBundle getMetrics() {
        if (a1.f60679a < 28) {
            return null;
        }
        return this.f86024b.getMetrics();
    }

    @Override // sn.i0
    public List<byte[]> getOfflineLicenseKeySetIds() {
        if (a1.f60679a >= 29) {
            return this.f86024b.getOfflineLicenseKeySetIds();
        }
        throw new UnsupportedOperationException();
    }

    @Override // sn.i0
    public byte[] getPropertyByteArray(String str) {
        return this.f86024b.getPropertyByteArray(str);
    }

    @Override // sn.i0
    public String getPropertyString(String str) {
        return this.f86024b.getPropertyString(str);
    }

    @Override // sn.i0
    public h0 getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f86024b.getProvisionRequest();
        return new h0(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // sn.i0
    public byte[] openSession() throws MediaDrmException {
        return this.f86024b.openSession();
    }

    @Override // sn.i0
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws JSONException, DeniedByServerException, NotProvisionedException {
        if (gn.l.f57986c.equals(this.f86023a)) {
            bArr2 = a.adjustResponseData(bArr2);
        }
        return this.f86024b.provideKeyResponse(bArr, bArr2);
    }

    @Override // sn.i0
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f86024b.provideProvisionResponse(bArr);
    }

    @Override // sn.i0
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f86024b.queryKeyStatus(bArr);
    }

    @Override // sn.i0
    public synchronized void release() {
        int i10 = this.f86025c - 1;
        this.f86025c = i10;
        if (i10 == 0) {
            this.f86024b.release();
        }
    }

    @Override // sn.i0
    public void removeOfflineLicense(byte[] bArr) {
        if (a1.f60679a < 29) {
            throw new UnsupportedOperationException();
        }
        this.f86024b.removeOfflineLicense(bArr);
    }

    @Override // sn.i0
    public boolean requiresSecureDecoder(byte[] bArr, String str) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i10 = a1.f60679a;
        UUID uuid = this.f86023a;
        if (i10 >= 31) {
            if (uuid.equals(gn.l.f57987d)) {
                String propertyString = getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(gn.l.f57986c);
            }
            if (zEquals) {
                MediaDrm mediaDrm = this.f86024b;
                return l0.requiresSecureDecoder(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i10 >= 27 || !Objects.equals(uuid, gn.l.f57986c)) ? uuid : gn.l.f57985b, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !uuid.equals(gn.l.f57986c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // sn.i0
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f86024b.restoreKeys(bArr, bArr2);
    }

    @Override // sn.i0
    public void setOnEventListener(d0 d0Var) {
        this.f86024b.setOnEventListener(d0Var == null ? null : new de.l0(2, this, d0Var));
    }

    @Override // sn.i0
    public void setOnExpirationUpdateListener(e0 e0Var) {
        if (a1.f60679a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f86024b.setOnExpirationUpdateListener(e0Var == null ? null : new de.k0(this, 1), (Handler) null);
    }

    @Override // sn.i0
    public void setOnKeyStatusChangeListener(f0 f0Var) {
        if (a1.f60679a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f86024b.setOnKeyStatusChangeListener(f0Var == null ? null : new de.i0(this, 1), (Handler) null);
    }

    @Override // sn.i0
    public void setPlayerIdForSession(byte[] bArr, on.f0 f0Var) {
        if (a1.f60679a >= 31) {
            try {
                l0.setLogSessionIdOnMediaDrmSession(this.f86024b, bArr, f0Var);
            } catch (UnsupportedOperationException unused) {
                io.bidmachine.media3.common.util.b0.w("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // sn.i0
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.f86024b.setPropertyByteArray(str, bArr);
    }

    @Override // sn.i0
    public void setPropertyString(String str, String str2) {
        this.f86024b.setPropertyString(str, str2);
    }

    @Override // sn.i0
    public j0 createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        int i10 = a1.f60679a;
        UUID uuid = this.f86023a;
        if (i10 < 27 && Objects.equals(uuid, gn.l.f57986c)) {
            uuid = gn.l.f57985b;
        }
        return new j0(uuid, bArr);
    }
}
