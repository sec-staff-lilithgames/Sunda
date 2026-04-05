package com.facebook.ads.redexgen.core;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.ironsource.C3364ne;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class HandlerC1409Nh extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC2171hD A06;
    public final C1937dL A07;
    public final C1911cu A08;
    public final AbstractRunnableC1624Vt A09;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, -63, -64, -59, -53, -42, -55, -51, -42, -72, -57, -57, -42, -58, -55, -64, -68, -59, -53, -72, -53, -64, -58, -59, -42, -62, -68, -48, -54, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, -31, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, 37, 74, 65, 54};
    }

    static {
        A07();
    }

    public HandlerC1409Nh(C1937dL c1937dL, AbstractC2171hD abstractC2171hD) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnectionC1408Ng(this);
        this.A07 = c1937dL;
        this.A08 = c1937dL.A02();
        this.A05 = new Messenger(this);
        this.A06 = abstractC2171hD;
        this.A09 = new C2150gr(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6h() == NZ.A06) {
            this.A07.A0F().AHD();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6i() == NZ.A07) {
            if (UA.A08(this.A07)) {
                this.A07.A0F().AH3();
                if (this.A06 instanceof C09946q) {
                    this.A06.AED(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, this.A06.A04(), null);
                    return;
                } else {
                    if (this.A06 instanceof C09936p) {
                        this.A06.AED(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, this.A06.A04(), null);
                        if (((C09936p) this.A06).A0E().A03 != null) {
                            this.A06.AED(3002, this.A06.A04(), null);
                        }
                        this.A06.AED(C3364ne.f37989h, this.A06.A04(), null);
                        return;
                    }
                    return;
                }
            }
            C1937dL c1937dL = this.A07;
            String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c1937dL.A0F().AHD();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6h() != NZ.A05) {
            return;
        }
        if (UA.A0C(this.A07)) {
            this.A07.A0F().AHK();
            this.A06.A03().AAn();
            this.A06.A0D(true);
            this.A06.A09();
            return;
        }
        this.A07.A0F().AHJ();
        this.A06.A03().AIh(new AdError(2008, A04(31, 21, 34)));
    }

    private void A08(Messenger messenger, int i10, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain((Handler) null, i10);
        messageObtain.replyTo = this.A05;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(messageObtain);
    }

    public static void A0B(C1937dL c1937dL, String str) {
        c1937dL.A0F().AH7(str);
        SN snA0G = c1937dL.A0G();
        if (snA0G != null && snA0G.A6g() != null && snA0G.A6c() != null) {
            snA0G.A6g().onError(snA0G.A6c(), AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AHW();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C1937dL c1937dL, int i10) {
        this.A07.A0F().AHU();
        AdActivityIntent adActivityIntentA05 = WB.A05(c1937dL);
        adActivityIntentA05.putExtra(A04(65, 8, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), EnumC1607Vb.A0E);
        adActivityIntentA05.putExtra(A04(52, 13, 3), this.A06.A04());
        adActivityIntentA05.putExtra(A04(5, 26, 33), i10);
        try {
            int usedContext = WB.A00(c1937dL, adActivityIntentA05);
            this.A07.A0F().AHV(usedContext);
        } catch (W9 e10) {
            String strA04 = A04(0, 5, 75);
            Throwable cause = e10.getCause();
            if (cause != null) {
                strA04 = strA04 + cause.toString();
            }
            A0B(c1937dL, strA04);
        }
    }

    public final void A0E(boolean z10) {
        this.A01 = C1410Ni.A04(this.A08, z10, this.A03);
        if (this.A01) {
            this.A07.A0F().AH9();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, UA.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AHH();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i10, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i10, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e10) {
            A0C();
            this.A07.A0F().AHC(e10);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC1616Vl.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AHR();
                    UA.A07(this.A08);
                } else {
                    this.A07.A0F().AHQ();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AHX();
            } else if (message.what == 2001 || message.what == 1011) {
                C1410Ni.A02(this.A08, message);
            } else {
                this.A07.A0F().AHI(message.what);
                this.A06.A0C(message);
            }
        } catch (Throwable th2) {
            AbstractC1616Vl.A00(th2, this);
        }
    }
}
