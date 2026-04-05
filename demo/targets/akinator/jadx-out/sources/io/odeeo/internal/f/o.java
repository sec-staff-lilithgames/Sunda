package io.odeeo.internal.f;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import de.l0;
import io.odeeo.internal.f.e;
import io.odeeo.internal.f.m;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final m.g f63939d = new os.c();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f63940a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f63941b;

    /* renamed from: c, reason: collision with root package name */
    public int f63942c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {
        public static boolean requiresSecureDecoder(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    public o(UUID uuid) throws UnsupportedSchemeException {
        io.odeeo.internal.q0.a.checkNotNull(uuid);
        io.odeeo.internal.q0.a.checkArgument(!io.odeeo.internal.b.h.f62710b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63940a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f63941b = mediaDrm;
        this.f63942c = 1;
        if (io.odeeo.internal.b.h.f62712d.equals(uuid) && a()) {
            a(mediaDrm);
        }
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(a(uuid));
    }

    public static o newInstance(UUID uuid) throws t {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new t(1, e10);
        } catch (Exception e11) {
            throw new t(2, e11);
        }
    }

    @Override // io.odeeo.internal.f.m
    public synchronized void acquire() {
        io.odeeo.internal.q0.a.checkState(this.f63942c > 0);
        this.f63942c++;
    }

    @Override // io.odeeo.internal.f.m
    public void closeSession(byte[] bArr) {
        this.f63941b.closeSession(bArr);
    }

    @Override // io.odeeo.internal.f.m
    public int getCryptoType() {
        return 2;
    }

    @Override // io.odeeo.internal.f.m
    public m.b getKeyRequest(byte[] bArr, List<e.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        e.b bVarA;
        byte[] bArrB;
        String strA;
        if (list != null) {
            bVarA = a(this.f63940a, list);
            bArrB = b(this.f63940a, (byte[]) io.odeeo.internal.q0.a.checkNotNull(bVarA.f63916e));
            strA = a(this.f63940a, bVarA.f63915d);
        } else {
            bVarA = null;
            bArrB = null;
            strA = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f63941b.getKeyRequest(bArr, bArrB, strA, i10, map);
        byte[] bArrA = a(this.f63940a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVarA != null && !TextUtils.isEmpty(bVarA.f63914c)) {
            defaultUrl = bVarA.f63914c;
        }
        return new m.b(bArrA, defaultUrl, g0.f65861a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // io.odeeo.internal.f.m
    public PersistableBundle getMetrics() {
        if (g0.f65861a < 28) {
            return null;
        }
        return this.f63941b.getMetrics();
    }

    @Override // io.odeeo.internal.f.m
    public byte[] getPropertyByteArray(String str) {
        return this.f63941b.getPropertyByteArray(str);
    }

    @Override // io.odeeo.internal.f.m
    public String getPropertyString(String str) {
        return this.f63941b.getPropertyString(str);
    }

    @Override // io.odeeo.internal.f.m
    public m.h getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f63941b.getProvisionRequest();
        return new m.h(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // io.odeeo.internal.f.m
    public byte[] openSession() throws MediaDrmException {
        return this.f63941b.openSession();
    }

    @Override // io.odeeo.internal.f.m
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws JSONException, DeniedByServerException, NotProvisionedException {
        if (io.odeeo.internal.b.h.f62711c.equals(this.f63940a)) {
            bArr2 = io.odeeo.internal.f.a.adjustResponseData(bArr2);
        }
        return this.f63941b.provideKeyResponse(bArr, bArr2);
    }

    @Override // io.odeeo.internal.f.m
    public void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f63941b.provideProvisionResponse(bArr);
    }

    @Override // io.odeeo.internal.f.m
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f63941b.queryKeyStatus(bArr);
    }

    @Override // io.odeeo.internal.f.m
    public synchronized void release() {
        int i10 = this.f63942c - 1;
        this.f63942c = i10;
        if (i10 == 0) {
            this.f63941b.release();
        }
    }

    @Override // io.odeeo.internal.f.m
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        if (g0.f65861a >= 31) {
            return a.requiresSecureDecoder(this.f63941b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f63940a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // io.odeeo.internal.f.m
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f63941b.restoreKeys(bArr, bArr2);
    }

    @Override // io.odeeo.internal.f.m
    public void setOnEventListener(m.d dVar) {
        this.f63941b.setOnEventListener(dVar == null ? null : new l0(1, this, dVar));
    }

    @Override // io.odeeo.internal.f.m
    public void setOnExpirationUpdateListener(final m.e eVar) {
        if (g0.f65861a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f63941b.setOnExpirationUpdateListener(eVar == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: os.d
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j10) {
                this.f79832a.a(eVar, mediaDrm, bArr, j10);
            }
        }, (Handler) null);
    }

    @Override // io.odeeo.internal.f.m
    public void setOnKeyStatusChangeListener(final m.f fVar) {
        if (g0.f65861a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f63941b.setOnKeyStatusChangeListener(fVar == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: os.b
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
                this.f79830a.a(fVar, mediaDrm, bArr, list, z10);
            }
        }, (Handler) null);
    }

    @Override // io.odeeo.internal.f.m
    public void setPropertyByteArray(String str, byte[] bArr) {
        this.f63941b.setPropertyByteArray(str, bArr);
    }

    @Override // io.odeeo.internal.f.m
    public void setPropertyString(String str, String str2) {
        this.f63941b.setPropertyString(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.d dVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        dVar.onEvent(this, bArr, i10, i11, bArr2);
    }

    public static /* synthetic */ m b(UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (t unused) {
            io.odeeo.internal.q0.p.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    @Override // io.odeeo.internal.f.m
    public n createCryptoConfig(byte[] bArr) throws MediaCryptoException {
        return new n(a(this.f63940a), bArr, g0.f65861a < 21 && io.odeeo.internal.b.h.f62712d.equals(this.f63940a) && "L3".equals(getPropertyString("securityLevel")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.f fVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new m.c(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        fVar.onKeyStatusChange(this, bArr, arrayList, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = io.odeeo.internal.b.h.f62713e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = io.odeeo.internal.n.h.parseSchemeSpecificData(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = a(r4)
            byte[] r4 = io.odeeo.internal.n.h.buildPsshAtom(r0, r4)
        L18:
            int r1 = io.odeeo.internal.q0.g0.f65861a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = io.odeeo.internal.b.h.f62712d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = io.odeeo.internal.q0.g0.f65863c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = io.odeeo.internal.q0.g0.f65864d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = io.odeeo.internal.n.h.parseSchemeSpecificData(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.f.o.b(java.util.UUID, byte[]):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.e eVar, MediaDrm mediaDrm, byte[] bArr, long j10) {
        eVar.onExpirationUpdate(this, bArr, j10);
    }

    public static e.b a(UUID uuid, List<e.b> list) {
        if (!io.odeeo.internal.b.h.f62712d.equals(uuid)) {
            return list.get(0);
        }
        if (g0.f65861a >= 28 && list.size() > 1) {
            e.b bVar = list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                e.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) io.odeeo.internal.q0.a.checkNotNull(bVar2.f63916e);
                if (g0.areEqual(bVar2.f63915d, bVar.f63915d) && g0.areEqual(bVar2.f63914c, bVar.f63914c) && io.odeeo.internal.n.h.isPsshAtom(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) io.odeeo.internal.q0.a.checkNotNull(list.get(i12).f63916e);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return bVar.copyWithData(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            e.b bVar3 = list.get(i13);
            int version = io.odeeo.internal.n.h.parseVersion((byte[]) io.odeeo.internal.q0.a.checkNotNull(bVar3.f63916e));
            int i14 = g0.f65861a;
            if ((i14 < 23 && version == 0) || (i14 >= 23 && version == 1)) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public static UUID a(UUID uuid) {
        return (g0.f65861a >= 27 || !io.odeeo.internal.b.h.f62711c.equals(uuid)) ? uuid : io.odeeo.internal.b.h.f62710b;
    }

    public static String a(UUID uuid, String str) {
        return (g0.f65861a < 26 && io.odeeo.internal.b.h.f62711c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return io.odeeo.internal.b.h.f62711c.equals(uuid) ? io.odeeo.internal.f.a.adjustRequestData(bArr) : bArr;
    }

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static boolean a() {
        return "ASUS_Z00AD".equals(g0.f65864d);
    }

    public static byte[] a(byte[] bArr) {
        x xVar = new x(bArr);
        int littleEndianInt = xVar.readLittleEndianInt();
        short littleEndianShort = xVar.readLittleEndianShort();
        short littleEndianShort2 = xVar.readLittleEndianShort();
        if (littleEndianShort == 1 && littleEndianShort2 == 1) {
            short littleEndianShort3 = xVar.readLittleEndianShort();
            Charset charset = io.odeeo.internal.t0.e.f66408e;
            String string = xVar.readString(littleEndianShort3, charset);
            if (string.contains("<LA_URL>")) {
                return bArr;
            }
            int iIndexOf = string.indexOf("</DATA>");
            if (iIndexOf == -1) {
                io.odeeo.internal.q0.p.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = string.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + string.substring(iIndexOf);
            int i10 = littleEndianInt + 52;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(i10);
            byteBufferAllocate.putShort(littleEndianShort);
            byteBufferAllocate.putShort(littleEndianShort2);
            byteBufferAllocate.putShort((short) (str.length() * 2));
            byteBufferAllocate.put(str.getBytes(charset));
            return byteBufferAllocate.array();
        }
        io.odeeo.internal.q0.p.i("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }
}
