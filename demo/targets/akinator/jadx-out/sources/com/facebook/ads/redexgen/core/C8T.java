package com.facebook.ads.redexgen.core;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8T {
    public static byte[] A0X;
    public static String[] A0Y = {"mFphCeoU9HvMn9ZZEpclfwqoVhk40KwD", "hKlz0nzOWHQPWv", "iUYlz8XGQwag9oYQcAYdcNYdwsYMOsO1", "15ELq8Y13cCLXlrgije1Lj", "fmh7yYOlG9VsvjTz00hbP4", "Zli7uOe3zpCWYKVvl9v2rZgR93QJVexK", "W36N5BhoqHIblVGPIwsJc", "WdPWN8eOnICUfyPLt7yxKs7AdkGnQCZN"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public AudioTrack A0N;
    public C8Q A0O;
    public Method A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final C8R A0V;
    public final long[] A0W;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] - i12;
            if (A0Y[7].charAt(13) != 'y') {
                throw new RuntimeException();
            }
            A0Y[0] = "zj97MoHR9Py27VEns6K5abiX60E98d7F";
            bArrCopyOfRange[i13] = (byte) (i14 - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0X = new byte[]{-18, -20, -5, -45, -24, -5, -20, -11, -22, 0};
    }

    static {
        A06();
    }

    public C8T(C8R c8r) {
        this.A0V = (C8R) C3M.A01(c8r);
        if (AbstractC09264a.A02 >= 18) {
            try {
                this.A0P = AudioTrack.class.getMethod(A03(0, 10, 91), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0W = new long[10];
    }

    private long A00() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A0M != C.TIME_UNSET) {
            long currentTimeMs = this.A0M;
            long elapsedTimeSinceStopUs = (1000 * jElapsedRealtime) - currentTimeMs;
            long jA0Q = AbstractC09264a.A0Q(elapsedTimeSinceStopUs, this.A00);
            long mediaTimeSinceStopUs = this.A04;
            long elapsedTimeSinceStopUs2 = this.A07;
            long currentTimeMs2 = this.A0L;
            return Math.min(elapsedTimeSinceStopUs2, currentTimeMs2 + ((mediaTimeSinceStopUs * jA0Q) / 1000000));
        }
        long currentTimeMs3 = this.A0C;
        if (jElapsedRealtime - currentTimeMs3 >= 5) {
            A09(jElapsedRealtime);
            this.A0C = jElapsedRealtime;
        }
        return this.A0I + (this.A0J << 32);
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j10) {
        return (1000000 * j10) / this.A04;
    }

    private void A04() {
        int i10;
        long playbackPositionUs = System.nanoTime() / 1000;
        long systemTimeUs = this.A0A;
        if (playbackPositionUs - systemTimeUs >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long jA01 = A01();
            if (A0Y[0].charAt(8) != '9') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[5] = "mG91kidYerianKW8k81eRhz1YFhUJ0TD";
            strArr[2] = "tz52TeTP2nXzICTGyUb9gO4UkVUhPqg7";
            if (jA01 == 0) {
                return;
            }
            long[] jArr = this.A0W;
            int i11 = this.A02;
            long systemTimeUs2 = AbstractC09264a.A0R(jA01, this.A00);
            jArr[i11] = systemTimeUs2 - playbackPositionUs;
            int i12 = this.A02 + 1;
            String[] strArr2 = A0Y;
            if (strArr2[5].charAt(4) == strArr2[2].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0Y;
            strArr3[4] = "AFkMvnjOvj65Z9PkG4nAGP";
            strArr3[3] = "gdO3Z2pM7uD2KyszdkE03V";
            this.A02 = i12 % 10;
            if (this.A05 < 10) {
                this.A05++;
            }
            this.A0A = playbackPositionUs;
            if (A0Y[7].charAt(13) != 'y') {
                this.A0K = 0L;
                i10 = 0;
            } else {
                String[] strArr4 = A0Y;
                strArr4[1] = "OfE8owY5iQWinV";
                strArr4[6] = "VmS0vt0tfNVVuH5SEqER3";
                this.A0K = 0L;
                i10 = 0;
            }
            while (i10 < this.A05) {
                this.A0K += this.A0W[i10] / this.A05;
                i10++;
            }
        }
        if (this.A0T) {
            return;
        }
        A07(playbackPositionUs);
        A08(playbackPositionUs);
    }

    private void A05() {
        this.A0K = 0L;
        this.A05 = 0;
        this.A02 = 0;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0H = 0L;
        this.A0U = false;
    }

    private void A07(long j10) {
        C8Q c8q = (C8Q) C3M.A01(this.A0O);
        if (!c8q.A07(j10)) {
            return;
        }
        long jA02 = c8q.A02();
        long jA01 = c8q.A01();
        long audioTimestampSystemTimeUs = A01();
        if (Math.abs(jA02 - j10) > 5000000) {
            this.A0V.AFP(jA01, jA02, j10, audioTimestampSystemTimeUs);
            if (A0Y[7].charAt(13) != 'y') {
                throw new RuntimeException();
            }
            A0Y[7] = "mF6kCbqtc5PO8yUDnW98QRQbFVZ1vLXh";
            c8q.A04();
            return;
        }
        if (Math.abs(A02(jA01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0V.AEi(jA01, jA02, j10, audioTimestampSystemTimeUs);
            c8q.A04();
        } else {
            c8q.A03();
        }
    }

    private void A08(long j10) {
        if (this.A0R && this.A0P != null && j10 - this.A09 >= 500000) {
            try {
                this.A0E = (((Integer) AbstractC09264a.A0f((Integer) this.A0P.invoke(C3M.A01(this.A0N), new Object[0]))).intValue() * 1000) - this.A06;
                this.A0E = Math.max(this.A0E, 0L);
                if (this.A0E > 5000000) {
                    this.A0V.ADi(this.A0E);
                    this.A0E = 0L;
                }
            } catch (Exception unused) {
                this.A0P = null;
            }
            this.A09 = j10;
        }
    }

    private void A09(long j10) {
        int playState = ((AudioTrack) C3M.A01(this.A0N)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r1.getPlaybackHeadPosition() & 4294967295L;
        if (this.A0T) {
            int state = A0Y[7].charAt(13);
            if (state != 121) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[5] = "ov9kApTb7V0CjbZZCKupQjB7jnUQPlTV";
            strArr[2] = "rmmJb8OCjqsXlyJPr0xnnc6CD7US0gp3";
            if (playState == 2 && playbackHeadPosition == 0) {
                long rawPlaybackHeadPosition = this.A0I;
                String[] strArr2 = A0Y;
                String str = strArr2[5];
                String str2 = strArr2[2];
                int state2 = str.charAt(4);
                if (state2 != str2.charAt(4)) {
                    String[] strArr3 = A0Y;
                    strArr3[4] = "zeySHXDKnQ5XWlDOUaGDVi";
                    strArr3[3] = "LoWPIsfdmaPBaSpnKkuKXN";
                    this.A0F = rawPlaybackHeadPosition;
                } else {
                    this.A0F = rawPlaybackHeadPosition;
                }
            }
            playbackHeadPosition += this.A0F;
        }
        int state3 = AbstractC09264a.A02;
        if (state3 <= 29) {
            if (playbackHeadPosition == 0 && this.A0I > 0 && playState == 3) {
                if (this.A08 == C.TIME_UNSET) {
                    this.A08 = j10;
                    return;
                }
                return;
            }
            this.A08 = C.TIME_UNSET;
        }
        if (this.A0I > playbackHeadPosition) {
            this.A0J++;
        }
        this.A0I = playbackHeadPosition;
    }

    private boolean A0A() {
        return this.A0T && ((AudioTrack) C3M.A01(this.A0N)).getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0B(int i10) {
        return AbstractC09264a.A02 < 23 && (i10 == 5 || i10 == 6);
    }

    public final int A0C(long j10) {
        int bytesPending = (int) (j10 - (A00() * this.A03));
        return this.A01 - bytesPending;
    }

    public final long A0D(boolean z10) {
        long jA0Q;
        if (((AudioTrack) C3M.A01(this.A0N)).getPlayState() == 3) {
            A04();
        }
        long jNanoTime = System.nanoTime() / 1000;
        C8Q c8q = (C8Q) C3M.A01(this.A0O);
        boolean useGetTimestampMode = c8q.A06();
        if (useGetTimestampMode) {
            jA0Q = A02(c8q.A01()) + AbstractC09264a.A0Q(jNanoTime - c8q.A02(), this.A00);
        } else {
            int i10 = this.A05;
            if (A0Y[0].charAt(8) != '9') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[1] = "hPK4fhT0jDF836";
            strArr[6] = "hdImPZUqzFjLboc09pskO";
            if (i10 == 0) {
                jA0Q = A01();
            } else {
                jA0Q = AbstractC09264a.A0Q(this.A0K + jNanoTime, this.A00);
            }
            if (!z10) {
                jA0Q = Math.max(0L, jA0Q - this.A0E);
            }
        }
        if (this.A0S != useGetTimestampMode) {
            this.A0H = this.A0D;
            this.A0G = this.A0B;
        }
        long j10 = jNanoTime - this.A0H;
        if (j10 < 1000000) {
            long jA0Q2 = this.A0G + AbstractC09264a.A0Q(j10, this.A00);
            long j11 = (j10 * 1000) / 1000000;
            jA0Q = ((jA0Q * j11) + ((1000 - j11) * jA0Q2)) / 1000;
        }
        if (!this.A0U && jA0Q > this.A0B) {
            this.A0U = true;
            this.A0V.AEg(System.currentTimeMillis() - AbstractC09264a.A0P(AbstractC09264a.A0R(AbstractC09264a.A0P(jA0Q - this.A0B), this.A00)));
        }
        this.A0D = jNanoTime;
        this.A0B = jA0Q;
        this.A0S = useGetTimestampMode;
        return jA0Q;
    }

    public final void A0E() {
        A05();
        this.A0N = null;
        this.A0O = null;
    }

    public final void A0F() {
        ((C8Q) C3M.A01(this.A0O)).A05();
    }

    public final void A0G(float f10) {
        this.A00 = f10;
        if (this.A0O != null) {
            C8Q c8q = this.A0O;
            String[] strArr = A0Y;
            if (strArr[5].charAt(4) == strArr[2].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[1] = "VU48pb9CUkQeOU";
            strArr2[6] = "XcBh4pT8Ou6Ibzda0RyIg";
            c8q.A05();
        }
        A05();
    }

    public final void A0H(long j10) {
        this.A0L = A00();
        this.A0M = SystemClock.elapsedRealtime() * 1000;
        this.A07 = j10;
    }

    public final void A0I(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.A0N = audioTrack;
        this.A03 = i11;
        this.A01 = i12;
        this.A0O = new C8Q(audioTrack);
        this.A04 = audioTrack.getSampleRate();
        this.A0T = z10 && A0B(i10);
        this.A0R = AbstractC09264a.A15(i10);
        this.A06 = this.A0R ? A02(i12 / i11) : -9223372036854775807L;
        this.A0I = 0L;
        this.A0J = 0L;
        this.A0F = 0L;
        this.A0Q = false;
        this.A0M = C.TIME_UNSET;
        this.A08 = C.TIME_UNSET;
        this.A09 = 0L;
        this.A0E = 0L;
        this.A00 = 1.0f;
    }

    public final boolean A0J() {
        return ((AudioTrack) C3M.A01(this.A0N)).getPlayState() == 3;
    }

    public final boolean A0K() {
        A05();
        if (this.A0M == C.TIME_UNSET) {
            ((C8Q) C3M.A01(this.A0O)).A05();
            return true;
        }
        return false;
    }

    public final boolean A0L(long j10) {
        return j10 > A00() || A0A();
    }

    public final boolean A0M(long j10) {
        return this.A08 != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.A08 >= 200;
    }

    public final boolean A0N(long j10) {
        int playState = ((AudioTrack) C3M.A01(this.A0N)).getPlayState();
        if (this.A0T) {
            if (playState == 2) {
                this.A0Q = false;
                String[] strArr = A0Y;
                String str = strArr[4];
                String str2 = strArr[3];
                int length = str.length();
                int playState2 = str2.length();
                if (length != playState2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[1] = "DhRe3Wriyk6HQ1";
                strArr2[6] = "kYJAoF9OHBJ3Wrbuortpe";
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0Q;
        this.A0Q = A0L(j10);
        if (hadData && !this.A0Q && playState != 1) {
            this.A0V.AFY(this.A01, AbstractC09264a.A0P(this.A06));
        }
        return true;
    }
}
