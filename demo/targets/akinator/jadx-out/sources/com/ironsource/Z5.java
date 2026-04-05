package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Z5 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Pc> f35848a;

    public Z5(Looper looper) {
        super(looper);
        this.f35848a = new ConcurrentHashMap<>();
    }

    private boolean a(int i10) {
        return i10 == 1016 || i10 == 1015;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C8 c82 = (C8) message.obj;
            String path = c82.getPath();
            Pc pc2 = this.f35848a.get(path);
            if (pc2 == null) {
                return;
            }
            if (a(message.what)) {
                pc2.a(c82);
            } else {
                int i10 = message.what;
                pc2.a(c82, new C3477u8(i10, C3310kg.a(i10)));
            }
            this.f35848a.remove(path);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public void a(String str, Pc pc2) {
        if (str == null || pc2 == null) {
            return;
        }
        this.f35848a.put(str, pc2);
    }
}
