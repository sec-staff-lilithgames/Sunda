package io.bidmachine.media3.common.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60715c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60716e;

    public /* synthetic */ f0(int i10, Object obj, Object obj2) {
        this.f60714b = i10;
        this.f60716e = obj;
        this.f60715c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f60714b
            switch(r0) {
                case 0: goto L8d;
                case 1: goto L21;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f60716e
            io.bidmachine.media3.common.util.e r0 = (io.bidmachine.media3.common.util.e) r0
            java.lang.Object r1 = r11.f60715c
            mh.v0 r1 = (mh.v0) r1
            java.lang.Object r2 = r0.f60712e
            java.lang.Object r1 = r1.apply(r2)
            r0.f60712e = r1
            io.bidmachine.media3.common.util.v r2 = r0.f60709b
            io.bidmachine.media3.common.util.c r3 = new io.bidmachine.media3.common.util.c
            r4 = 1
            r3.<init>(r0, r1, r4)
            r2.post(r3)
            return
        L21:
            java.lang.Object r0 = r11.f60716e
            io.bidmachine.media3.common.util.NetworkTypeObserver$Receiver r0 = (io.bidmachine.media3.common.util.NetworkTypeObserver$Receiver) r0
            java.lang.Object r1 = r11.f60715c
            android.content.Context r1 = (android.content.Context) r1
            io.bidmachine.media3.common.util.k0 r0 = r0.f60677a
            r0.getClass()
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r1.getSystemService(r2)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r3 = 5
            r4 = 0
            if (r2 != 0) goto L3b
            goto L7d
        L3b:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L7d
            r5 = 1
            if (r2 == 0) goto L7c
            boolean r6 = r2.isConnected()
            if (r6 != 0) goto L49
            goto L7c
        L49:
            int r6 = r2.getType()
            r7 = 2
            r8 = 9
            r9 = 6
            r10 = 4
            if (r6 == 0) goto L67
            if (r6 == r5) goto L65
            if (r6 == r10) goto L67
            if (r6 == r3) goto L67
            if (r6 == r9) goto L63
            if (r6 == r8) goto L61
            r4 = 8
            goto L7d
        L61:
            r4 = 7
            goto L7d
        L63:
            r4 = r3
            goto L7d
        L65:
            r4 = r7
            goto L7d
        L67:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L7a;
                case 2: goto L7a;
                case 3: goto L78;
                case 4: goto L78;
                case 5: goto L78;
                case 6: goto L78;
                case 7: goto L78;
                case 8: goto L78;
                case 9: goto L78;
                case 10: goto L78;
                case 11: goto L78;
                case 12: goto L78;
                case 13: goto L63;
                case 14: goto L78;
                case 15: goto L78;
                case 16: goto L6e;
                case 17: goto L78;
                case 18: goto L65;
                case 19: goto L6e;
                case 20: goto L70;
                default: goto L6e;
            }
        L6e:
            r4 = r9
            goto L7d
        L70:
            int r2 = io.bidmachine.media3.common.util.a1.f60679a
            r5 = 29
            if (r2 < r5) goto L7d
            r4 = r8
            goto L7d
        L78:
            r4 = r10
            goto L7d
        L7a:
            r4 = 3
            goto L7d
        L7c:
            r4 = r5
        L7d:
            int r2 = io.bidmachine.media3.common.util.a1.f60679a
            r5 = 31
            if (r2 < r5) goto L89
            if (r4 != r3) goto L89
            io.bidmachine.media3.common.util.h0.disambiguate4gAnd5gNsa(r1, r0)
            goto L8c
        L89:
            r0.a(r4)
        L8c:
            return
        L8d:
            java.lang.Object r0 = r11.f60716e
            io.bidmachine.media3.common.util.k0 r0 = (io.bidmachine.media3.common.util.k0) r0
            java.lang.Object r1 = r11.f60715c
            android.content.Context r1 = (android.content.Context) r1
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.addAction(r3)
            io.bidmachine.media3.common.util.NetworkTypeObserver$Receiver r3 = new io.bidmachine.media3.common.util.NetworkTypeObserver$Receiver
            r3.<init>(r0)
            r1.registerReceiver(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.f0.run():void");
    }
}
