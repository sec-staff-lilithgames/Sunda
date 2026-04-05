package ho;

import android.os.SystemClock;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import go.w;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import pn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f59091a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f59092b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f59093c = false;

    /* renamed from: d, reason: collision with root package name */
    public static long f59094d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static String f59095e = "time.android.com";

    /* renamed from: f, reason: collision with root package name */
    public static int f59096f = 1000;

    /* renamed from: g, reason: collision with root package name */
    public static long f59097g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public static long f59098h = -9223372036854775807L;

    public static long a() {
        byte b10;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            byte b11 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i10], Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
                bArr2[b11] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b11);
                    b10 = b11;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j10 = jCurrentTimeMillis / 1000;
                    long j11 = jCurrentTimeMillis - (j10 * 1000);
                    b10 = b11;
                    socketTimeoutException = socketTimeoutException2;
                    long j12 = j10 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j12 >> 24);
                    bArr[41] = (byte) (j12 >> 16);
                    bArr[42] = (byte) (j12 >> 8);
                    bArr[43] = (byte) j12;
                    long j13 = (j11 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j13 >> 24);
                    bArr[45] = (byte) (j13 >> 16);
                    bArr[46] = (byte) (j13 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j14 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b12 = bArr3[b10];
                    int i12 = bArr3[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    long jD = d(24, bArr3);
                    long jD2 = d(32, bArr3);
                    long jD3 = d(40, bArr3);
                    b((byte) ((b12 >> 6) & 3), (byte) (b12 & 7), i12, jD3);
                    long j15 = (j14 + (((jD3 - j14) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j15;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e10;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e10);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        break;
                    }
                    i10++;
                    i11 = i13;
                    b11 = b10;
                }
            }
            throw ((SocketTimeoutException) io.bidmachine.media3.common.util.a.checkNotNull(socketTimeoutException2));
        } finally {
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(a.b.e(b11, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(a.b.e(i10, "SNTP: Untrusted stratum: "));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(int i10, byte[] bArr) {
        long jC = c(i10, bArr);
        long jC2 = c(i10 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j10;
        synchronized (f59092b) {
            try {
                j10 = f59093c ? f59094d : C.TIME_UNSET;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j10;
        synchronized (f59092b) {
            j10 = f59097g;
        }
        return j10;
    }

    public static String getNtpHost() {
        String str;
        synchronized (f59092b) {
            str = f59095e;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i10;
        synchronized (f59092b) {
            i10 = f59096f;
        }
        return i10;
    }

    public static void initialize(w wVar, c cVar) {
        if (isInitialized()) {
            if (cVar != null) {
                ((h) cVar).onInitialized();
            }
        } else {
            if (wVar == null) {
                wVar = new w("SntpClient");
            }
            wVar.startLoading(new e(), new d(cVar), 1);
        }
    }

    public static boolean isInitialized() {
        boolean z10;
        synchronized (f59092b) {
            try {
                if (f59098h != C.TIME_UNSET && f59097g != C.TIME_UNSET) {
                    f59093c = f59093c && SystemClock.elapsedRealtime() - f59098h < f59097g;
                }
                z10 = f59093c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j10) {
        synchronized (f59092b) {
            f59097g = j10;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (f59092b) {
            try {
                if (!f59095e.equals(str)) {
                    f59095e = str;
                    f59093c = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setTimeoutMs(int i10) {
        synchronized (f59092b) {
            try {
                if (f59096f != i10) {
                    f59096f = i10;
                    f59093c = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
