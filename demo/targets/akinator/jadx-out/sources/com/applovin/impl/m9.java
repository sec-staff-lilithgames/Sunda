package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.i8;
import com.applovin.impl.n5;
import com.applovin.impl.v1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14462c;

    public /* synthetic */ m9(Object obj, int i10) {
        this.f14461b = i10;
        this.f14462c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f14461b) {
            case 0:
                ((i8.a) this.f14462c).b();
                break;
            case 1:
                ((n5.c) this.f14462c).a();
                break;
            case 2:
                ((v1.h) this.f14462c).a();
                break;
            case 3:
                ((a6) this.f14462c).e();
                break;
            case 4:
                ((c1) this.f14462c).notifyDataSetChanged();
                break;
            case 5:
                ((c5) this.f14462c).c();
                break;
            case 6:
                ((d6) this.f14462c).e();
                break;
            case 7:
                g1.b((Context) this.f14462c);
                break;
            case 8:
                ((i8) this.f14462c).a();
                break;
            case 9:
                ((j5) this.f14462c).i();
                break;
            case 10:
                ((l3) this.f14462c).notifyDataSetChanged();
                break;
            case 11:
                ((p2) this.f14462c).notifyDataSetChanged();
                break;
            case 12:
                ((SharedPreferences.Editor) this.f14462c).commit();
                break;
            default:
                ((a) this.f14462c).b();
                break;
        }
    }
}
