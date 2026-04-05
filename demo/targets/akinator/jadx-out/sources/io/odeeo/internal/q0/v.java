package io.odeeo.internal.q0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static v f65956e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f65957a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<c>> f65958b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f65959c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f65960d = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static volatile boolean f65961a;

        public static void disable5GNsaDisambiguation() {
            f65961a = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface c {
        void onNetworkTypeChanged(int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iB = v.b(context);
            int i10 = g0.f65861a;
            if (i10 >= 29 && !b.f65961a && iB == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) io.odeeo.internal.q0.a.checkNotNull((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            v.this.a(iB);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends PhoneStateListener {
        public e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            v.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            v.this.a(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public v(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static int b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type == 9) {
                        return 7;
                    }
                    if (type != 4 && type != 5) {
                        return type != 6 ? 8 : 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public static synchronized v getInstance(Context context) {
        try {
            if (f65956e == null) {
                f65956e = new v(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f65956e;
    }

    public static synchronized void resetForTests() {
        f65956e = null;
    }

    public int getNetworkType() {
        int i10;
        synchronized (this.f65959c) {
            i10 = this.f65960d;
        }
        return i10;
    }

    public void register(c cVar) {
        a();
        this.f65958b.add(new WeakReference<>(cVar));
        this.f65957a.post(new com.ironsource.environment.thread.a(19, this, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        cVar.onNetworkTypeChanged(getNetworkType());
    }

    public final void a() {
        Iterator<WeakReference<c>> it = this.f65958b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f65958b.remove(next);
            }
        }
    }

    public final void a(int i10) {
        synchronized (this.f65959c) {
            try {
                if (this.f65960d == i10) {
                    return;
                }
                this.f65960d = i10;
                Iterator<WeakReference<c>> it = this.f65958b.iterator();
                while (it.hasNext()) {
                    WeakReference<c> next = it.next();
                    c cVar = next.get();
                    if (cVar != null) {
                        cVar.onNetworkTypeChanged(i10);
                    } else {
                        this.f65958b.remove(next);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return g0.f65861a >= 29 ? 9 : 0;
        }
    }
}
