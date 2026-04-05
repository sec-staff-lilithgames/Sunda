package com.pgl.ssdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class al {

    /* renamed from: a, reason: collision with root package name */
    private static volatile al f50391a;

    /* renamed from: b, reason: collision with root package name */
    private Context f50392b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f50393c = new ArrayList();

    private al(Context context) {
        this.f50392b = null;
        this.f50392b = context;
    }

    public static al a(Context context) {
        if (f50391a == null) {
            synchronized (al.class) {
                try {
                    if (f50391a == null) {
                        f50391a = new al(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50391a;
    }

    public int b() {
        Intent intentRegisterReceiver = this.f50392b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        if (this.f50392b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            return 0;
        }
        return Math.round(((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, 0) / r0.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized String d() {
        if (this.f50393c.size() <= 0) {
            return Y1.f35726f;
        }
        return String.valueOf(this.f50393c.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String e() {
        return new JSONArray((Collection) this.f50393c).toString();
    }

    public int f() {
        int iC;
        int iB = 0;
        try {
            synchronized (this) {
                iB = b();
                iC = c();
            }
            return (iB * 10000) + iC;
        } catch (Exception unused) {
            return iB * 10000;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.f50393c.add(Integer.valueOf(iF));
        try {
            int size = this.f50393c.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f50393c.subList(size - 10, size));
                this.f50393c.clear();
                this.f50393c = arrayList;
            }
        } catch (Throwable unused) {
        }
    }
}
