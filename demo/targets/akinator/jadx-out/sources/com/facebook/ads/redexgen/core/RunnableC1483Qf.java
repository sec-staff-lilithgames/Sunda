package com.facebook.ads.redexgen.core;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1483Qf implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"YAUr0vF6CX8YQIb3U2BTwiKsPx4egdml", "mCzYZBoaiKXOzjUHkKBQEDESozpM1xd6", "icS38dGHdjVFjizVfUSTymHnsbTrfSoO", "cz24QPO5JMZmQB4F0QhCndjSq8meDVtx", "FtYcbE5Uq8HUJyIzKb3J4QjvmALEd3tS", "OczTw8YbFDCs0vVm57WwAmFlfg0gTpir", "toWNn3QT1tQgvY3MKWHjSENw", "YozzgSFsuZbL3IkC1bDOEp8MFgumFV8x"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C09846g A06;
    public Interpolator A00 = C09846g.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A08[6].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "lXzWc938MQZaj6BgS1Y9BEfSDAuAR6qF";
            strArr[5] = "B8zmNNge3ag7Hwi7A1PWi4fqxiL6HNqU";
            bArrCopyOfRange[i13] = (byte) ((b10 - i12) - 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {64, 68, 14, 65, 81, 96, 93, 90, 90};
        String[] strArr = A08;
        if (strArr[1].charAt(2) != strArr[5].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[7] = "TeOjcoFpg61NRcWtZ7RqEgvJb0vCzhPX";
        strArr2[0] = "wzSzDJFWC0w6xe3VuPJPH24U0YXOvF2u";
        A07 = bArr;
    }

    static {
        A03();
    }

    public RunnableC1483Qf(C09846g c09846g) {
        this.A06 = c09846g;
        this.A01 = new OverScroller(c09846g.getContext(), C09846g.A1A);
    }

    private float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, int i11, int i12, int i13) {
        int absDx;
        int containerSize = Math.abs(i10);
        int delta = Math.abs(i11);
        int duration = containerSize > delta ? 1 : 0;
        int halfContainerSize = (int) Math.sqrt((i12 * i12) + (i13 * i13));
        int absDx2 = (int) Math.sqrt((i10 * i10) + (i11 * i11));
        C09846g c09846g = this.A06;
        int width = duration != 0 ? c09846g.getWidth() : c09846g.getHeight();
        int velocity = width / 2;
        float fA00 = velocity + (velocity * A00(Math.min(1.0f, (absDx2 * 1.0f) / width)));
        if (halfContainerSize > 0) {
            absDx = Math.round(Math.abs(fA00 / halfContainerSize) * 1000.0f) * 4;
        } else {
            if (duration == 0) {
                containerSize = delta;
            }
            absDx = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(absDx, 2000);
        int absDx3 = A08[2].charAt(23);
        if (absDx3 != 110) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "0orcdyFTKXkoGK9yWPRw9CMcRo5SNB9j";
        strArr[0] = "sq5WBRFpbSiYOu42pzh1wsqhDGiHcevd";
        return iMin;
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i10, int i11, int i12, int i13) {
        A0B(i10, i11, A01(i10, i11, i12, i13));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
        } else {
            this.A06.removeCallbacks(this);
            P3.A0D(this.A06, this);
        }
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i10, int i11) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i10, int i11) {
        A06(i10, i11, 0, 0);
    }

    public final void A0B(int i10, int i11, int i12) {
        A0C(i10, i11, i12, C09846g.A1A);
    }

    public final void A0C(int i10, int i11, int i12, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i10, i11, i12);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[2].charAt(23) != 'n') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "88zIldbbkktihn9hTQ4sgRWvKPoy0Har";
            strArr[5] = "wazVAycqzf9kUc8ZZnvbPZ6jaLgaodB2";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i10, int i11, Interpolator interpolator) {
        int iA01 = A01(i10, i11, 0, 0);
        if (interpolator == null) {
            interpolator = C09846g.A1A;
        }
        A0C(i10, i11, iA01, interpolator);
        if (A08[6].length() == 25) {
            throw new RuntimeException();
        }
        A08[3] = "4ylqCkbib8Hqjgb9G4JU7JWl2ANwoVnp";
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A06.A06 == null) {
            A08();
            return;
        }
        A04();
        this.A06.A1K();
        OverScroller overScroller = this.A01;
        AbstractC1479Qb abstractC1479Qb = this.A06.A06.A02;
        if (overScroller.computeScrollOffset()) {
            int[] iArr = this.A06.A16;
            int overscrollX = overScroller.getCurrX();
            int velY = overScroller.getCurrY();
            int vresult = overscrollX - this.A02;
            int velX = velY - this.A03;
            int iA1f = 0;
            int iA1g = 0;
            this.A02 = overscrollX;
            this.A03 = velY;
            int i10 = 0;
            int i11 = 0;
            if (this.A06.A1w(vresult, velX, iArr, null, 1)) {
                vresult -= iArr[0];
                velX -= iArr[1];
            }
            if (this.A06.A04 != null) {
                this.A06.A1L();
                this.A06.A1M();
                OQ.A01(A02(0, 9, 115));
                C09846g c09846g = this.A06;
                C1481Qd c1481Qd = this.A06.A0s;
                String[] strArr = A08;
                if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[1] = "nozOsXlmQMzJhvkopjwZaheFFVNTeY58";
                strArr2[5] = "LtzfvJebeScyRtmgs1USyUey2pVvSmq5";
                c09846g.A1j(c1481Qd);
                if (vresult != 0) {
                    QO qo2 = this.A06.A06;
                    QW qw2 = this.A06.A0r;
                    C09846g c09846g2 = this.A06;
                    if (A08[4].charAt(19) != '9') {
                        A08[4] = "aF9lT9JucYAVgVWisB0rNkK4be7J2iGb";
                        iA1f = qo2.A1f(vresult, qw2, c09846g2.A0s);
                        i10 = vresult - iA1f;
                    } else {
                        iA1f = qo2.A1f(vresult, qw2, c09846g2.A0s);
                        i10 = vresult - iA1f;
                    }
                }
                if (velX != 0) {
                    QO qo3 = this.A06.A06;
                    QW qw3 = this.A06.A0r;
                    if (A08[4].charAt(19) != 57) {
                        String[] strArr3 = A08;
                        strArr3[7] = "UcFH7yF8zZNprQitZtXhkmlCMHIdnioP";
                        strArr3[0] = "hCBROqFKcvdbLIHuO2wEis8Nwj1iktft";
                        iA1g = qo3.A1g(velX, qw3, this.A06.A0s);
                        i11 = velX - iA1g;
                    } else {
                        iA1g = qo3.A1g(velX, qw3, this.A06.A0s);
                        i11 = velX - iA1g;
                    }
                }
                OQ.A00();
                this.A06.A1Q();
                this.A06.A1N();
                this.A06.A1p(false);
                if (abstractC1479Qb != null && !abstractC1479Qb.A0E() && abstractC1479Qb.A0F()) {
                    int x10 = this.A06.A0s.A03();
                    if (x10 == 0) {
                        abstractC1479Qb.A09();
                    } else if (abstractC1479Qb.A07() >= x10) {
                        abstractC1479Qb.A0A(x10 - 1);
                        abstractC1479Qb.A04(vresult - i10, velX - i11);
                    } else {
                        int y10 = vresult - i10;
                        if (A08[4].charAt(19) != 57) {
                            String[] strArr4 = A08;
                            strArr4[1] = "2vzJUgZGYJyf60lr7OoRSSfYHAbPRQwN";
                            strArr4[5] = "FZzkKBCO3vggmWhfitA4hZZwekV7eOzC";
                            abstractC1479Qb.A04(y10, velX - i11);
                        } else {
                            abstractC1479Qb.A04(y10, velX - i11);
                        }
                    }
                }
            }
            if (!this.A06.A0v.isEmpty()) {
                this.A06.invalidate();
            }
            if (this.A06.getOverScrollMode() != 2) {
                C09846g c09846g3 = this.A06;
                String[] strArr5 = A08;
                if (strArr5[7].charAt(6) != strArr5[0].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[6] = CampaignEx.JSON_KEY_AD_K;
                c09846g3.A1b(vresult, velX);
            }
            int dy = iA1f;
            int hresult = iA1g;
            if (!this.A06.A1v(dy, hresult, i10, i11, null, 1) && (i10 != 0 || i11 != 0)) {
                int x11 = (int) overScroller.getCurrVelocity();
                int dx2 = 0;
                if (i10 != overscrollX) {
                    if (i10 < 0) {
                        dx2 = -x11;
                    } else {
                        dx2 = i10 > 0 ? x11 : 0;
                    }
                }
                if (i11 != velY) {
                    if (i11 < 0) {
                        x11 = -x11;
                    } else if (i11 <= 0) {
                        x11 = 0;
                    }
                } else {
                    x11 = 0;
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1a(dx2, x11);
                }
                if ((dx2 != 0 || i10 == overscrollX || overScroller.getFinalX() == 0) && (x11 != 0 || i11 == velY || overScroller.getFinalY() == 0)) {
                    overScroller.abortAnimation();
                }
            }
            if (iA1f != 0 || iA1g != 0) {
                C09846g c09846g4 = this.A06;
                if (A08[6].length() != 25) {
                    A08[3] = "MhQkdHLAPY6K0mrvY0I8ZqPtgRA1J8Gx";
                    c09846g4.A1d(iA1f, iA1g);
                } else {
                    A08[6] = "5ZFiatMajPEhKsDar8BqfzNMKoQTJ";
                    c09846g4.A1d(iA1f, iA1g);
                }
            }
            if (!this.A06.awakenScrollBars()) {
                this.A06.invalidate();
            }
            boolean z10 = (vresult == 0 && velX == 0) || (vresult != 0 && this.A06.A06.A22() && iA1f == vresult) || (velX != 0 && this.A06.A06.A23() && iA1g == velX);
            if (overScroller.isFinished() || (!z10 && !this.A06.A1t(1))) {
                this.A06.setScrollState(0);
                if (C09846g.A1E) {
                    this.A06.A02.A02();
                }
                this.A06.A1Z(1);
            } else {
                A07();
                if (this.A06.A03 != null) {
                    this.A06.A03.A0B(this.A06, vresult, velX);
                }
            }
        }
        if (abstractC1479Qb != null) {
            if (abstractC1479Qb.A0E()) {
                abstractC1479Qb.A04(0, 0);
            }
            if (!this.A05) {
                abstractC1479Qb.A09();
            }
        }
        A05();
    }
}
