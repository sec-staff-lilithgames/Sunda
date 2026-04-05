package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.i.ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class az {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, ay> f831 = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$4, reason: invalid class name */
    public class AnonymousClass4 extends iu {

        /* renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f838;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ ay.d f839;

        public AnonymousClass4(String str, ay.d dVar) {
            this.f838 = str;
            this.f839 = dVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            ay ayVarM1041 = az.m1041(az.this, this.f838);
            if (ayVarM1041 != null) {
                ayVarM1041.m1033(this.f839);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.az$5, reason: invalid class name */
    public class AnonymousClass5 extends iu {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ ay.a f841;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ String f842;

        public AnonymousClass5(String str, ay.a aVar) {
            this.f842 = str;
            this.f841 = aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            ay ayVarM1041 = az.m1041(az.this, this.f842);
            if (ayVarM1041 != null) {
                ayVarM1041.m1034(this.f841);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e extends s {
    }

    public az() {
        new Handler(Looper.getMainLooper());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ay m1041(az azVar, String str) {
        Map<String, ay> map = azVar.f831;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m1044(String str) {
        this.f831.put(str, new ay(str));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m1043(String str) {
        Map<String, ay> map = this.f831;
        ay ayVar = map != null ? map.get(str) : null;
        if (ayVar != null) {
            return ayVar.m1032();
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m1045() {
        Iterator it = new ArrayList(this.f831.values()).iterator();
        while (it.hasNext()) {
            if (((ay) it.next()).m1035()) {
                return false;
            }
        }
        return true;
    }
}
