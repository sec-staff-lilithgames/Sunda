package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class O5 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f35095e = "EventsTracker";

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3409q7 f35096a;

    /* renamed from: b, reason: collision with root package name */
    private I5 f35097b;

    /* renamed from: c, reason: collision with root package name */
    private J7 f35098c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f35099d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35100a;

        public a(String str) {
            this.f35100a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Gd gd = new Gd();
                ArrayList<Pair<String, String>> arrayListD = O5.this.f35097b.d();
                if (C3271ic.f36944b.equals(O5.this.f35097b.e())) {
                    gd = C3231g8.b(O5.this.f35097b.b(), this.f35100a, arrayListD);
                } else if (C3271ic.f36943a.equals(O5.this.f35097b.e())) {
                    gd = C3231g8.a(O5.this.f35097b.b(), this.f35100a, arrayListD);
                }
                O5.this.a("response status code: " + gd.f34536a);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
            }
        }
    }

    public O5(I5 i52, InterfaceC3409q7 interfaceC3409q7) {
        if (i52 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (i52.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f35097b = i52;
        this.f35096a = interfaceC3409q7;
        this.f35098c = i52.c();
        this.f35099d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.f35099d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(w0.i.d(str, " ", map.toString()));
        if (this.f35097b.a() && !str.isEmpty()) {
            HashMap mapS = b0.e2.s("eventname", str);
            a(mapS, this.f35096a.a());
            a(mapS, map);
            b(this.f35098c.a(mapS));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f35097b.f()) {
            Log.d(f35095e, str);
        }
    }
}
