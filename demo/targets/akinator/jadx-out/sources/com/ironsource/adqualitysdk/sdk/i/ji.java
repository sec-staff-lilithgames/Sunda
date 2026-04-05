package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass2;
import com.ironsource.adqualitysdk.sdk.i.jd.AnonymousClass3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ji {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static ji f3005;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private List<View> f3009 = new ArrayList();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<jl> f3007 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<View> f3006 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    private in f3008 = new in() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.1
        @Override // com.ironsource.adqualitysdk.sdk.i.in
        /* renamed from: ﻛ */
        public final void mo2156() {
            List<View> listM3112 = jy.m3112();
            ji.this.f3006.clear();
            ji.this.f3006.addAll(ji.this.f3009);
            for (int i10 = 0; i10 < listM3112.size(); i10++) {
                View view = listM3112.get(i10);
                ji.this.f3006.remove(view);
                if (!ji.this.f3009.contains(view)) {
                    ji.this.f3009.add(view);
                    ji.this.m3005(view);
                }
            }
            for (int i11 = 0; i11 < ji.this.f3006.size(); i11++) {
                View view2 = (View) ji.this.f3006.get(i11);
                ji.this.f3009.remove(view2);
                ji.this.m3010(view2);
            }
            ji.this.f3006.clear();
        }
    };

    private ji() {
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized ji m3008() {
        try {
            if (f3005 == null) {
                f3005 = new ji();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3005;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m3012(jl jlVar) {
        synchronized (this) {
            try {
                this.f3007.remove(jlVar);
                if (this.f3007.size() == 0) {
                    p.m3248(jd.m2957().new AnonymousClass2(this.f3008));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3011(final jl jlVar) {
        synchronized (this) {
            this.f3007.add(jlVar);
        }
        p.m3248(jd.m2957().new AnonymousClass3(this.f3008));
        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                Iterator it = ji.this.f3009.iterator();
                while (it.hasNext()) {
                    jlVar.mo548((View) it.next());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾇ, reason: contains not printable characters */
    public synchronized void m3010(View view) {
        Iterator<jl> it = this.f3007.iterator();
        while (it.hasNext()) {
            it.next().mo543(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public synchronized void m3005(View view) {
        Iterator<jl> it = this.f3007.iterator();
        while (it.hasNext()) {
            it.next().mo548(view);
        }
    }
}
