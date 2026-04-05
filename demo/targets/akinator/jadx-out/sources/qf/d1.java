package qf;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d1 extends h {

    /* renamed from: e, reason: collision with root package name */
    public final int f82927e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f82928f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f82929g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f82930h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f82931i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f82932j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f82933k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f82934l;

    /* renamed from: m, reason: collision with root package name */
    public int f82935m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends q {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public d1() {
        this(2000);
    }

    @Override // qf.h, qf.p
    public void close() throws IOException {
        this.f82930h = null;
        MulticastSocket multicastSocket = this.f82932j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) com.google.android.exoplayer2.util.a.checkNotNull(this.f82933k));
            } catch (IOException unused) {
            }
            this.f82932j = null;
        }
        DatagramSocket datagramSocket = this.f82931i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f82931i = null;
        }
        this.f82933k = null;
        this.f82935m = 0;
        if (this.f82934l) {
            this.f82934l = false;
            b();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f82931i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // qf.h, qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.h, qf.p
    public Uri getUri() {
        return this.f82930h;
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws IOException {
        Uri uri = tVar.f82992a;
        this.f82930h = uri;
        String str = (String) com.google.android.exoplayer2.util.a.checkNotNull(uri.getHost());
        int port = this.f82930h.getPort();
        c(tVar);
        try {
            this.f82933k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f82933k, port);
            if (this.f82933k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f82932j = multicastSocket;
                multicastSocket.joinGroup(this.f82933k);
                this.f82931i = this.f82932j;
            } else {
                this.f82931i = new DatagramSocket(inetSocketAddress);
            }
            this.f82931i.setSoTimeout(this.f82927e);
            this.f82934l = true;
            d(tVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // qf.h, qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f82935m;
        DatagramPacket datagramPacket = this.f82929g;
        if (i12 == 0) {
            try {
                ((DatagramSocket) com.google.android.exoplayer2.util.a.checkNotNull(this.f82931i)).receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f82935m = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f82935m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f82928f, length2 - i13, bArr, i10, iMin);
        this.f82935m -= iMin;
        return iMin;
    }

    public d1(int i10) {
        this(i10, 8000);
    }

    public d1(int i10, int i11) {
        super(true);
        this.f82927e = i11;
        byte[] bArr = new byte[i10];
        this.f82928f = bArr;
        this.f82929g = new DatagramPacket(bArr, 0, i10);
    }
}
