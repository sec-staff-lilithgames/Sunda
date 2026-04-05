package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1385Mi extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC2220iA A00;
    public InterfaceC1384Mh A01;
    public String A02;

    public C1385Mi(String str, AbstractC2220iA abstractC2220iA, InterfaceC1384Mh interfaceC1384Mh) {
        this.A00 = abstractC2220iA;
        this.A01 = interfaceC1384Mh;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC1959dh.A06.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A09.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A04.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A0A.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A05.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A0C.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A0B.A04(this.A02));
        intentFilter.addAction(EnumC1959dh.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC1959dh enumC1959dh = EnumC1959dh.A06;
        String action2 = this.A02;
        if (enumC1959dh.A04(action2).equals(action)) {
            this.A01.AF6(this.A00);
            return;
        }
        EnumC1959dh enumC1959dh2 = EnumC1959dh.A09;
        String action3 = this.A02;
        if (enumC1959dh2.A04(action3).equals(action)) {
            if (U7.A1t(context)) {
                this.A01.AF7(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AF7(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC1959dh enumC1959dh3 = EnumC1959dh.A04;
        String action4 = this.A02;
        if (enumC1959dh3.A04(action4).equals(action)) {
            this.A01.AF3(this.A00);
            return;
        }
        EnumC1959dh enumC1959dh4 = EnumC1959dh.A0A;
        String action5 = this.A02;
        if (enumC1959dh4.A04(action5).equals(action)) {
            this.A01.AF5(this.A00);
            return;
        }
        EnumC1959dh enumC1959dh5 = EnumC1959dh.A05;
        String action6 = this.A02;
        boolean zEquals = enumC1959dh5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (zEquals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC1959dh enumC1959dh6 = EnumC1959dh.A0B;
        String action7 = this.A02;
        if (enumC1959dh6.A04(action7).equals(action)) {
            InterfaceC1384Mh interfaceC1384Mh = this.A01;
            AbstractC2220iA abstractC2220iA = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            interfaceC1384Mh.AF1(abstractC2220iA);
            return;
        }
        EnumC1959dh enumC1959dh7 = EnumC1959dh.A0C;
        String action8 = this.A02;
        if (enumC1959dh7.A04(action8).equals(action)) {
            this.A01.AF2(this.A00);
            return;
        }
        EnumC1959dh enumC1959dh8 = EnumC1959dh.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC1959dh8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC1959dh8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
