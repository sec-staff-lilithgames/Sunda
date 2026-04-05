package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class R0 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0L;
    public static String[] A0M = {"4LY4lS0Dtnhb2OiQyA5efrKIFR", "dGupKpVCMt4qg9mKwPVhImHWchSaWcIC", "ZyPDBV2Dgn506ClNEjHAvEDIkGgGqxcu", "6d7pmCocDfQ9ggh3dWvmWW2CO", "v0AhzTtfFBaqfNNgAD9Hm9U40nGOHxVb", "UIU6rcdX7ZqD4Xq5NwRFZisMuquIGFkO", "tB8Uz7UMZA3JApFIn70Qu6pSbr2GCqXd", "GRU7Zt0cjyIBsRz9MT2AF"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public EnumC1607Vb A07;
    public InterfaceC1669Xo A08;
    public AbstractC1684Yd A09;
    public C1913cw A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final AudienceNetworkActivity A0E;
    public final AudienceNetworkActivityApi A0F;
    public final RA A0G;
    public final RJ A0H;
    public final C1506Rc A0I;
    public final C1937dL A0J;
    public final List<R6> A0K = new ArrayList();
    public int A01 = -1;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0L = new byte[]{3, 56, 55, 52, 58, 51, 118, 34, 57, 118, Utf8.REPLACEMENT_BYTE, 56, 48, 51, 36, 118, 32, Utf8.REPLACEMENT_BYTE, 51, 33, 2, 47, 38, 51, 118, 48, 36, 57, 59, 118, Utf8.REPLACEMENT_BYTE, 56, 34, 51, 56, 34, 118, 57, 36, 118, 37, 55, 32, 51, 50, 31, 56, 37, 34, 55, 56, 53, 51, 5, 34, 55, 34, 51, 42, 37, 20, 42, 40, Utf8.REPLACEMENT_BYTE, 34, 61, 34, Utf8.REPLACEMENT_BYTE, 50, 122, 120, 117, 117, 124, 107, 77, 96, 105, 124, 121, 118, 115, AbstractJsonLexerKt.TC_INVALID, 116, 110, 78, 117, 113, AbstractJsonLexerKt.TC_INVALID, 116, 116, 120, 122, 57, 113, 118, 116, 114, 117, 120, 120, 124, 57, 118, 115, 100, 57, 126, 121, 99, 114, 101, 100, 99, 126, 99, 126, 118, 123, 57, 115, 126, 100, 103, 123, 118, 110, 114, 115, 110, 99, 108, 102, 113, 97, 99, 114, 103, 62, 37, 60, 60, 49, 40, 59, 44, 44, 55, 58, 59, 26, 43, 51, 46, 45, 39, 45, 46, 49, 44, 42, 44, Utf8.REPLACEMENT_BYTE, 55, 42, 7, 5, 18, 19, 18, 17, 30, 25, 18, 19, 56, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 60, 18, 14, 79, 87, 85, 76, 125, 90, 72, 89, 78, 111, 89, 95, 83, 82, 88, 79, 122, 97, 81, 97, 124, 103, 107, 96, 122, 111, 122, 103, 97, 96, 112, 107, 108, 116, 112, 96, 76, 97, 14, 17, 29, 15, 44, 1, 8, 29};
    }

    static {
        A02();
    }

    public R0(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0E = audienceNetworkActivity;
        this.A0F = audienceNetworkActivityApi;
        this.A0J = RB.A02(audienceNetworkActivity);
        this.A0J.A0O(this);
        this.A0H = new RJ(this.A0J, this.A0E);
        this.A0I = new C1506Rc(this.A0J, this.A0E);
        this.A0G = new RA(this, this.A0J, this.A0E);
    }

    private String A00() {
        if (this.A07 == null || this.A07.A03() == null) {
            return A01(138, 4, 114);
        }
        return this.A07.A03();
    }

    private void A03(Intent intent, Bundle bundle) {
        String strA01 = A01(227, 8, 90);
        String strA012 = A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 8, 39);
        String strA013 = A01(165, 24, 85);
        if (bundle != null) {
            Bundle bundleA03 = WB.A03(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = bundleA03.getInt(strA013, -1);
            this.A0B = bundleA03.getString(strA012);
            this.A07 = (EnumC1607Vb) bundleA03.getSerializable(strA01);
            return;
        }
        this.A01 = intent.getIntExtra(strA013, -1);
        this.A0B = intent.getStringExtra(strA012);
        this.A07 = (EnumC1607Vb) intent.getSerializableExtra(strA01);
        this.A02 = intent.getIntExtra(A01(PsExtractor.PRIVATE_STREAM_1, 16, 30), 0) * 1000;
    }

    public final RelativeLayout A04() {
        return this.A06;
    }

    public final AudienceNetworkActivity A05() {
        return this.A0E;
    }

    public final C1937dL A06() {
        return this.A0J;
    }

    public final C1913cw A07() {
        return this.A0A;
    }

    public final String A08() {
        return this.A0B;
    }

    public final void A09() {
        this.A0G.A05(this.A07, this.A0B);
    }

    public final void A0A(R6 r62) {
        this.A0K.add(r62);
    }

    public final void A0B(R6 r62) {
        this.A0K.remove(r62);
    }

    public final void A0C(String str) {
        this.A0G.A09(str, this.A0B);
    }

    public final void A0D(String str, N9 n9) {
        if (this.A08 == null) {
            return;
        }
        AbstractC1684Yd abstractC1684Yd = this.A09;
        if (A0M[6].charAt(30) != 'X') {
            throw new RuntimeException();
        }
        A0M[0] = "nOOhjPgmgj4ymGbfbhDfGuv2YA";
        if (abstractC1684Yd == null) {
            this.A09 = AbstractC1685Ye.A02(this.A0J, this.A0J.A0A(), str, n9, this.A08, new C2096fw(this));
            this.A09.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        XP.A0H(this.A09);
        XP.A0R(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0M();
    }

    public final void A0E(String str, C1558Td c1558Td) {
        this.A0G.A08(str, c1558Td, this.A0B);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        WJ.A00();
        if (0 != 0) {
            throw new NullPointerException(A01(142, 15, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        }
        this.A0F.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i10) {
        this.A0J.A0F().A35(String.valueOf(A05().hashCode()), i10, A00());
        if (this.A0E.isFinishing()) {
            return;
        }
        this.A0G.A07(this.A07, this.A0B);
        this.A0G.A06(this.A07, this.A0B);
        this.A0F.finish(i10);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.A08 != null && this.A08.onActivityResult(i10, i11, intent)) {
            return;
        }
        LJ.A07(i10, i11, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.A03;
        long currentTime = jCurrentTimeMillis - this.A04;
        this.A03 = j10 + currentTime;
        this.A04 = jCurrentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<R6> it = this.A0K.iterator();
            while (it.hasNext()) {
                if (it.next().AAA()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0F.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap map = new HashMap();
            int i10 = configuration.orientation;
            String strA01 = A01(205, 14, 44);
            if (i10 == 1) {
                map.put(strA01, A01(157, 8, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            } else {
                map.put(strA01, A01(129, 9, 32));
            }
            C1580Ua.A02(UZ.A0K, map, this.A08 == null ? A01(0, 0, 15) : this.A08.getCurrentClientToken(), this.A0J.A0A());
            this.A00 = configuration.orientation;
            this.A0H.A01();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        XR.A02();
        this.A0I.A04();
        this.A05 = WB.A02(this.A0E.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C1937dL c1937dLA04 = WB.A04(this.A05);
        if (c1937dLA04 != null) {
            C1937dL startAdContext = this.A0J;
            startAdContext.A0M(c1937dLA04);
        }
        A03(this.A05, bundle);
        C1937dL startAdContext2 = this.A0J;
        startAdContext2.A0F().A36(String.valueOf(A05().hashCode()), A00());
        String callerType = this.A05.getStringExtra(A01(69, 10, 59));
        this.A0I.A08(this.A07, callerType == null || !(callerType.equals(AdPlacementType.INTERSTITIAL.name()) || callerType.equals(AdPlacementType.REWARDED_VIDEO.name())));
        this.A06 = new RelativeLayout(this.A0E);
        XP.A0K(this.A06, 0);
        this.A0E.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = this.A05;
        C1937dL startAdContext3 = this.A0J;
        US usA0A = startAdContext3.A0A();
        C1937dL startAdContext4 = this.A0J;
        this.A08 = new R5(this, intent, usA0A, startAdContext4).A0N(this.A07, this.A06);
        if (this.A08 == null) {
            C1937dL startAdContext5 = this.A0J;
            startAdContext5.A08().AAy(A01(58, 11, 105), AbstractC1550Sv.A0A, new C1551Sw(A01(0, 58, 116)));
            A09();
            finish(7);
            return;
        }
        this.A08.AAl(this.A05, bundle, this);
        this.A0G.A09(A01(90, 39, 53), this.A0B);
        this.A04 = System.currentTimeMillis();
        this.A0A = this.A0I.A03(this.A05, this.A06);
        this.A0I.A07(this.A05, this.A07, this.A06);
        this.A00 = this.A0E.getResources().getConfiguration().orientation;
        String callerType2 = A01(79, 11, 56);
        if (bundle != null) {
            this.A0C = bundle.getString(callerType2);
        } else {
            String stringExtra = this.A05.getStringExtra(callerType2);
            if (A0M[7].length() != 21) {
                A0M[5] = "dMohbzPZPFL3lBhphwrH1b8arfl2r2Ch";
                this.A0C = stringExtra;
            } else {
                A0M[0] = "3wH6tZS0sHFmmn7H8QunQNd9ha";
                this.A0C = stringExtra;
            }
        }
        this.A0I.A06();
        if (A0M[7].length() != 21) {
            throw new RuntimeException();
        }
        A0M[1] = "aldkJ30NOVt6q0NKQGcnTd28ZfXNLwwL";
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        this.A0J.A0F().A37(String.valueOf(A05().hashCode()), A00());
        this.A0G.A04(this.A07, this.A0B);
        if (this.A06 != null) {
            this.A06.removeAllViews();
        }
        if (this.A08 != null) {
            this.A08.onDestroy();
            this.A08 = null;
        }
        this.A0I.A05();
        AbstractC1684Yd abstractC1684Yd = this.A09;
        if (A0M[7].length() != 21) {
            throw new RuntimeException();
        }
        A0M[6] = "yBcEH8sYDqTUUkxjXqOG2DCn3q2DEyX3";
        if (abstractC1684Yd != null) {
            this.A09.A0L();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0J.A0F().A38(String.valueOf(A05().hashCode()), A00());
        this.A03 += System.currentTimeMillis() - this.A04;
        if (this.A08 != null) {
            this.A08.AEV(false);
            if (!this.A0E.isFinishing()) {
                C1580Ua.A02(UZ.A0E, null, this.A08.getCurrentClientToken(), this.A0J.A0A());
                this.A0D = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0J.A0F().A39(String.valueOf(A05().hashCode()), A00());
        this.A04 = System.currentTimeMillis();
        if (this.A08 != null) {
            InterfaceC1669Xo interfaceC1669Xo = this.A08;
            if (A0M[5].charAt(17) != 'w') {
                throw new RuntimeException();
            }
            A0M[6] = "WHwDulcP2dZca7YA0PmotSPySBaz7ZXD";
            interfaceC1669Xo.AF0(false);
            if (this.A0D) {
                C1580Ua.A02(UZ.A0F, null, this.A08.getCurrentClientToken(), this.A0J.A0A());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (this.A08 != null) {
            this.A08.AIB(bundle2);
        }
        bundle2.putInt(A01(165, 24, 85), this.A01);
        bundle2.putString(A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 8, 39), this.A0B);
        bundle2.putString(A01(79, 11, 56), this.A0C);
        bundle2.putSerializable(A01(227, 8, 90), this.A07);
        WB.A0A(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0J.A0F().A3A(String.valueOf(A05().hashCode()), A00());
        if (this.A01 != -1) {
            AbstractC1663Xi.A02(this.A0E, this.A01, this.A0J);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0J.A0F().A3B(String.valueOf(A05().hashCode()), A00());
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0F.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        A09();
        finish(5);
    }
}
