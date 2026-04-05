package io.odeeo.internal.f;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import io.odeeo.internal.f.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final m f63927a;

        public a(m mVar) {
            this.f63927a = mVar;
        }

        @Override // io.odeeo.internal.f.m.g
        public m acquireExoMediaDrm(UUID uuid) {
            this.f63927a.acquire();
            return this.f63927a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f63928a;

        /* renamed from: b, reason: collision with root package name */
        public final String f63929b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63930c;

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public byte[] getData() {
            return this.f63928a;
        }

        public String getLicenseServerUrl() {
            return this.f63929b;
        }

        public int getRequestType() {
            return this.f63930c;
        }

        public b(byte[] bArr, String str, int i10) {
            this.f63928a = bArr;
            this.f63929b = str;
            this.f63930c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f63931a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f63932b;

        public c(int i10, byte[] bArr) {
            this.f63931a = i10;
            this.f63932b = bArr;
        }

        public byte[] getKeyId() {
            return this.f63932b;
        }

        public int getStatusCode() {
            return this.f63931a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        void onEvent(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void onExpirationUpdate(m mVar, byte[] bArr, long j10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        void onKeyStatusChange(m mVar, byte[] bArr, List<c> list, boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface g {
        m acquireExoMediaDrm(UUID uuid);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f63933a;

        /* renamed from: b, reason: collision with root package name */
        public final String f63934b;

        public h(byte[] bArr, String str) {
            this.f63933a = bArr;
            this.f63934b = str;
        }

        public byte[] getData() {
            return this.f63933a;
        }

        public String getDefaultUrl() {
            return this.f63934b;
        }
    }

    void acquire();

    void closeSession(byte[] bArr);

    io.odeeo.internal.e.b createCryptoConfig(byte[] bArr) throws MediaCryptoException;

    int getCryptoType();

    b getKeyRequest(byte[] bArr, List<e.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    PersistableBundle getMetrics();

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    h getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    boolean requiresSecureDecoder(byte[] bArr, String str);

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(d dVar);

    void setOnExpirationUpdateListener(e eVar);

    void setOnKeyStatusChangeListener(f fVar);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
