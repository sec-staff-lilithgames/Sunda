package ln;

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
/* loaded from: classes9.dex */
public final class h0 extends b {

    /* renamed from: e, reason: collision with root package name */
    public final int f73451e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f73452f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f73453g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f73454h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f73455i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f73456j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f73457k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f73458l;

    /* renamed from: m, reason: collision with root package name */
    public int f73459m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends j {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public h0() {
        this(2000);
    }

    @Override // ln.b, ln.i
    public void close() throws IOException {
        this.f73454h = null;
        MulticastSocket multicastSocket = this.f73456j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) io.bidmachine.media3.common.util.a.checkNotNull(this.f73457k));
            } catch (IOException unused) {
            }
            this.f73456j = null;
        }
        DatagramSocket datagramSocket = this.f73455i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f73455i = null;
        }
        this.f73457k = null;
        this.f73459m = 0;
        if (this.f73458l) {
            this.f73458l = false;
            b();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f73455i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // ln.b, ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.b, ln.i
    public Uri getUri() {
        return this.f73454h;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException {
        Uri uri = mVar.f73467a;
        this.f73454h = uri;
        String str = (String) io.bidmachine.media3.common.util.a.checkNotNull(uri.getHost());
        int port = this.f73454h.getPort();
        c(mVar);
        try {
            this.f73457k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f73457k, port);
            if (this.f73457k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f73456j = multicastSocket;
                multicastSocket.joinGroup(this.f73457k);
                this.f73455i = this.f73456j;
            } else {
                this.f73455i = new DatagramSocket(inetSocketAddress);
            }
            this.f73455i.setSoTimeout(this.f73451e);
            this.f73458l = true;
            d(mVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f73459m;
        DatagramPacket datagramPacket = this.f73453g;
        if (i12 == 0) {
            try {
                ((DatagramSocket) io.bidmachine.media3.common.util.a.checkNotNull(this.f73455i)).receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f73459m = length;
                a(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f73459m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f73452f, length2 - i13, bArr, i10, iMin);
        this.f73459m -= iMin;
        return iMin;
    }

    public h0(int i10) {
        this(i10, 8000);
    }

    public h0(int i10, int i11) {
        super(true);
        this.f73451e = i11;
        byte[] bArr = new byte[i10];
        this.f73452f = bArr;
        this.f73453g = new DatagramPacket(bArr, 0, i10);
    }
}
