package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.c f25898c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25901f;

    /* renamed from: g, reason: collision with root package name */
    public p f25902g;

    /* renamed from: d, reason: collision with root package name */
    public final Cipher f25899d = null;

    /* renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f25900e = null;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25896a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f25897b = new SparseArray();

    public i(File file) {
        this.f25898c = new com.fyber.inneractive.sdk.player.exoplayer2.util.c(new File(file, CachedContentIndex.FILE_NAME));
    }

    public final void a() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.f25896a.values()) {
            if (hVar.f25894c.isEmpty()) {
                linkedList.add(hVar.f25893b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) this.f25896a.remove((String) it.next());
            if (hVar2 != null) {
                if (!hVar2.f25894c.isEmpty()) {
                    throw new IllegalStateException();
                }
                this.f25897b.remove(hVar2.f25892a);
                this.f25901f = true;
            }
        }
    }

    public final void b() throws Throwable {
        DataOutputStream dataOutputStream;
        IOException e10;
        Throwable th2;
        if (!this.f25901f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.util.b bVarB = this.f25898c.b();
            p pVar = this.f25902g;
            if (pVar == null) {
                this.f25902g = new p(bVarB);
            } else {
                pVar.a(bVarB);
            }
            dataOutputStream = new DataOutputStream(this.f25902g);
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.f25899d != null ? 1 : 0);
                if (this.f25899d != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.f25899d.init(1, this.f25900e, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f25902g, this.f25899d));
                    } catch (InvalidAlgorithmParameterException e11) {
                        e = e11;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e12) {
                        e = e12;
                        throw new IllegalStateException(e);
                    }
                } else {
                    dataOutputStream2 = dataOutputStream;
                }
                dataOutputStream2.writeInt(this.f25896a.size());
                int i10 = 0;
                for (h hVar : this.f25896a.values()) {
                    dataOutputStream2.writeInt(hVar.f25892a);
                    dataOutputStream2.writeUTF(hVar.f25893b);
                    dataOutputStream2.writeLong(hVar.f25895d);
                    int iHashCode = (hVar.f25893b.hashCode() + (hVar.f25892a * 31)) * 31;
                    long j10 = hVar.f25895d;
                    i10 += iHashCode + ((int) (j10 ^ (j10 >>> 32)));
                }
                dataOutputStream2.writeInt(i10);
                com.fyber.inneractive.sdk.player.exoplayer2.util.c cVar = this.f25898c;
                cVar.getClass();
                dataOutputStream2.close();
                cVar.f26011b.delete();
                int i11 = z.f26070a;
                this.f25901f = false;
            } catch (IOException e13) {
                e10 = e13;
                try {
                    throw new a(e10);
                } catch (Throwable th3) {
                    DataOutputStream dataOutputStream3 = dataOutputStream;
                    th = th3;
                    dataOutputStream2 = dataOutputStream3;
                    Throwable th4 = th;
                    dataOutputStream = dataOutputStream2;
                    th2 = th4;
                    z.a(dataOutputStream);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                z.a(dataOutputStream);
                throw th2;
            }
        } catch (IOException e14) {
            dataOutputStream = dataOutputStream2;
            e10 = e14;
        } catch (Throwable th6) {
            th = th6;
            Throwable th42 = th;
            dataOutputStream = dataOutputStream2;
            th2 = th42;
            z.a(dataOutputStream);
            throw th2;
        }
    }

    public final h a(String str, long j10) {
        SparseArray sparseArray = this.f25897b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        h hVar = new h(iKeyAt, str, j10);
        this.f25896a.put(str, hVar);
        this.f25897b.put(iKeyAt, str);
        this.f25901f = true;
        return hVar;
    }
}
