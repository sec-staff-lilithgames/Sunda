package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static t0 f28565e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f28566a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f28567b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f28568c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f28569d = 0;

    public t0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new BroadcastReceiver() { // from class: com.google.android.exoplayer2.util.NetworkTypeObserver$Receiver
            /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
            @Override // android.content.BroadcastReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onReceive(android.content.Context r8, android.content.Intent r9) {
                /*
                    r7 = this;
                    java.lang.String r9 = "connectivity"
                    java.lang.Object r9 = r8.getSystemService(r9)
                    android.net.ConnectivityManager r9 = (android.net.ConnectivityManager) r9
                    r0 = 5
                    r1 = 0
                    if (r9 != 0) goto Ld
                    goto L4e
                Ld:
                    android.net.NetworkInfo r9 = r9.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
                    r2 = 1
                    if (r9 == 0) goto L4d
                    boolean r3 = r9.isConnected()
                    if (r3 != 0) goto L1b
                    goto L4d
                L1b:
                    int r3 = r9.getType()
                    r4 = 9
                    r5 = 6
                    r6 = 4
                    if (r3 == 0) goto L34
                    if (r3 == r2) goto L45
                    if (r3 == r6) goto L34
                    if (r3 == r0) goto L34
                    if (r3 == r5) goto L47
                    if (r3 == r4) goto L32
                    r1 = 8
                    goto L4e
                L32:
                    r1 = 7
                    goto L4e
                L34:
                    int r9 = r9.getSubtype()
                    switch(r9) {
                        case 1: goto L4b;
                        case 2: goto L4b;
                        case 3: goto L49;
                        case 4: goto L49;
                        case 5: goto L49;
                        case 6: goto L49;
                        case 7: goto L49;
                        case 8: goto L49;
                        case 9: goto L49;
                        case 10: goto L49;
                        case 11: goto L49;
                        case 12: goto L49;
                        case 13: goto L47;
                        case 14: goto L49;
                        case 15: goto L49;
                        case 16: goto L3b;
                        case 17: goto L49;
                        case 18: goto L45;
                        case 19: goto L3b;
                        case 20: goto L3d;
                        default: goto L3b;
                    }
                L3b:
                    r1 = r5
                    goto L4e
                L3d:
                    int r9 = com.google.android.exoplayer2.util.n1.f28506a
                    r2 = 29
                    if (r9 < r2) goto L4e
                    r1 = r4
                    goto L4e
                L45:
                    r1 = 2
                    goto L4e
                L47:
                    r1 = r0
                    goto L4e
                L49:
                    r1 = r6
                    goto L4e
                L4b:
                    r1 = 3
                    goto L4e
                L4d:
                    r1 = r2
                L4e:
                    int r9 = com.google.android.exoplayer2.util.n1.f28506a
                    r2 = 31
                    com.google.android.exoplayer2.util.t0 r3 = r7.f28408a
                    if (r9 < r2) goto L5c
                    if (r1 != r0) goto L5c
                    com.google.android.exoplayer2.util.r0.disambiguate4gAnd5gNsa(r8, r3)
                    goto L5f
                L5c:
                    com.google.android.exoplayer2.util.t0.a(r3, r1)
                L5f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.NetworkTypeObserver$Receiver.onReceive(android.content.Context, android.content.Intent):void");
            }
        }, intentFilter);
    }

    public static void a(t0 t0Var, int i10) {
        synchronized (t0Var.f28568c) {
            try {
                if (t0Var.f28569d == i10) {
                    return;
                }
                t0Var.f28569d = i10;
                Iterator it = t0Var.f28567b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    s0 s0Var = (s0) weakReference.get();
                    if (s0Var != null) {
                        ((qf.v) s0Var).onNetworkTypeChanged(i10);
                    } else {
                        t0Var.f28567b.remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized t0 getInstance(Context context) {
        try {
            if (f28565e == null) {
                f28565e = new t0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28565e;
    }

    public static synchronized void resetForTests() {
        f28565e = null;
    }

    public int getNetworkType() {
        int i10;
        synchronized (this.f28568c) {
            i10 = this.f28569d;
        }
        return i10;
    }

    public void register(s0 s0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28567b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(s0Var));
        this.f28566a.post(new af.n(27, this, s0Var));
    }
}
