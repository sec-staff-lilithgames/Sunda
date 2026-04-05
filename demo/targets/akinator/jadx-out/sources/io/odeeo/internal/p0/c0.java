package io.odeeo.internal.p0;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends e {

    /* renamed from: e, reason: collision with root package name */
    public final int f65592e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f65593f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f65594g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f65595h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f65596i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f65597j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f65598k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65599l;

    /* renamed from: m, reason: collision with root package name */
    public int f65600m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public c0() {
        this(2000);
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws IOException {
        this.f65595h = null;
        MulticastSocket multicastSocket = this.f65597j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) io.odeeo.internal.q0.a.checkNotNull(this.f65598k));
            } catch (IOException unused) {
            }
            this.f65597j = null;
        }
        DatagramSocket datagramSocket = this.f65596i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f65596i = null;
        }
        this.f65598k = null;
        this.f65600m = 0;
        if (this.f65599l) {
            this.f65599l = false;
            a();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f65596i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65595h;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        Uri uri = mVar.f65626a;
        this.f65595h = uri;
        String str = (String) io.odeeo.internal.q0.a.checkNotNull(uri.getHost());
        int port = this.f65595h.getPort();
        a(mVar);
        try {
            this.f65598k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f65598k, port);
            if (this.f65598k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f65597j = multicastSocket;
                multicastSocket.joinGroup(this.f65598k);
                this.f65596i = this.f65597j;
            } else {
                this.f65596i = new DatagramSocket(inetSocketAddress);
            }
            this.f65596i.setSoTimeout(this.f65592e);
            this.f65599l = true;
            b(mVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f65600m == 0) {
            try {
                ((DatagramSocket) io.odeeo.internal.q0.a.checkNotNull(this.f65596i)).receive(this.f65594g);
                int length = this.f65594g.getLength();
                this.f65600m = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f65594g.getLength();
        int i12 = this.f65600m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f65593f, length2 - i12, bArr, i10, iMin);
        this.f65600m -= iMin;
        return iMin;
    }

    public c0(int i10) {
        this(i10, 8000);
    }

    public c0(int i10, int i11) {
        super(true);
        this.f65592e = i11;
        byte[] bArr = new byte[i10];
        this.f65593f = bArr;
        this.f65594g = new DatagramPacket(bArr, 0, i10);
    }
}
