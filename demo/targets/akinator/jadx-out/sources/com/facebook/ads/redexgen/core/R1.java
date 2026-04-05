package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class R1 implements AudienceNetworkActivityApi {
    public static byte[] A03;
    public static String[] A04 = {"npa5fyfDyBgpHwGfwNiqfHEj4F8LEiZf", "OqeETugh9", "5goSJATWOcVItDjddk", "82BqGjCZsQ5KSOXOW0A0KlOfyUV9N54d", "DC8qTi6RH4AT7G9O", "9IwTeKuU2aT5NbzWtfQwCWqg5E0PczVH", "CnGxzoUQk", "OIUpXP34AuomSZv"};
    public boolean A00;
    public final AudienceNetworkActivityApi A01;
    public final R0 A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {101, 97, 98, 86, 71, 74, 70, 77, 64, 70, 109, 70, 87, 84, 76, 81, 72, 19, 40, 35, 62, 54, 35, 37, 50, 35, 34, 102, 35, 62, 37, 35, 54, 50, 47, 41, 40, 104, 60, 51, 2, 60, 62, 41, 52, 43, 52, 41, 36};
        if (A04[2].length() == 12) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "H3o2ukg7PoWSfztBPt1oK5BMl3p36c0G";
        strArr[0] = "tZaZcqIYCt5A5bsZPeypVNujsThHJ9sw";
        A03 = bArr;
    }

    static {
        A01();
    }

    public R1(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi, R0 r02) {
        this.A01 = audienceNetworkActivityApi;
        this.A02 = r02;
    }

    private void A02(Throwable th2) {
        this.A00 = true;
        this.A02.A09();
        finish(8);
        SQ logContext = this.A02.A06();
        if (logContext != null) {
            logContext.A08().AAy(A00(38, 11, 116), AbstractC1550Sv.A0C, new C1551Sw(th2));
            return;
        }
        Log.e(A00(0, 17, 10), A00(17, 21, 111), th2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            if (this.A00) {
                this.A01.dump(str, fileDescriptor, printWriter, strArr);
            } else {
                this.A02.dump(str, fileDescriptor, printWriter, strArr);
            }
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i10) {
        this.A02.finish(i10);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
        } catch (Throwable t10) {
            A02(t10);
        }
        if (this.A00) {
            this.A01.onActivityResult(i10, i11, intent);
        } else {
            this.A02.onActivityResult(i10, i11, intent);
            this.A01.onActivityResult(i10, i11, intent);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        try {
            if (this.A00) {
                return;
            }
            this.A02.onBackPressed();
        } catch (Throwable th2) {
            if (A04[5].charAt(6) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "nPADpKrXuoueUGX";
            strArr[4] = "T13akIzntQNSUZag";
            A02(th2);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        try {
        } catch (Throwable t10) {
            A02(t10);
        }
        if (this.A00) {
            this.A01.onConfigurationChanged(configuration);
            return;
        }
        this.A02.onConfigurationChanged(configuration);
        this.A01.onConfigurationChanged(configuration);
        String[] strArr = A04;
        if (strArr[1].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[7] = "Q1wJ3SQKEGYG95X";
        strArr2[4] = "AvO5pGxADzIyCHUj";
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        this.A01.onCreate(bundle);
        try {
            this.A02.onCreate(bundle);
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        try {
        } catch (Throwable th2) {
            if (A04[2].length() == 12) {
                throw new RuntimeException();
            }
            A04[2] = "3CPJLXRae2337PFMI";
            A02(th2);
        }
        if (this.A00) {
            this.A01.onDestroy();
        } else {
            this.A02.onDestroy();
            this.A01.onDestroy();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        try {
        } catch (Throwable t10) {
            A02(t10);
        }
        if (this.A00) {
            this.A01.onPause();
        } else {
            this.A02.onPause();
            this.A01.onPause();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A01.onResume();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onResume();
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
        try {
            if (this.A00) {
                return;
            }
            this.A02.onSaveInstanceState(bundle);
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A01.onStart();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStart();
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A01.onStop();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStop();
        } catch (Throwable t10) {
            A02(t10);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
        } catch (Throwable t10) {
            A02(t10);
        }
        if (this.A00) {
            return this.A01.onTouchEvent(motionEvent);
        }
        this.A02.onTouchEvent(motionEvent);
        return this.A01.onTouchEvent(motionEvent);
    }
}
