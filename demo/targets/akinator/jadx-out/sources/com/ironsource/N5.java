package com.ironsource;

import android.util.Pair;
import com.ironsource.G7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class N5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f35035e = "Content-Type";

    /* renamed from: f, reason: collision with root package name */
    private static final String f35036f = "application/json";

    /* renamed from: a, reason: collision with root package name */
    private G7 f35037a;

    /* renamed from: b, reason: collision with root package name */
    String f35038b;

    /* renamed from: c, reason: collision with root package name */
    String f35039c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<C5> f35040d;

    public N5(G7 g72, String str, String str2, ArrayList<C5> arrayList) {
        this.f35037a = g72;
        this.f35038b = str;
        this.f35039c = str2;
        this.f35040d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        G7.a aVarA;
        G7.a aVar = new G7.a(this.f35040d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Gd gdB = C3231g8.b(this.f35039c, this.f35038b, arrayList);
            aVarA = aVar.a(gdB.a()).a(gdB.f34536a);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e10.getLocalizedMessage());
            aVarA = aVar.a(e10 instanceof Gc).a(e10);
        }
        G7 g72 = this.f35037a;
        if (g72 != null) {
            g72.a(aVarA);
        }
    }
}
