package zk;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C2750e7;
import com.inmobi.media.C2793h;
import com.inmobi.media.C2868l7;
import com.inmobi.media.C2977rf;
import com.inmobi.media.F5;
import com.inmobi.media.InterfaceC2994sf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98166c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f98168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f98169g;

    public /* synthetic */ p0(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f98165b = i10;
        this.f98166c = obj;
        this.f98167e = obj2;
        this.f98168f = obj3;
        this.f98169g = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98165b) {
            case 0:
                C2868l7.a((C2868l7) this.f98166c, (Context) this.f98167e, (String) this.f98168f, (C2750e7) this.f98169g);
                break;
            default:
                C2977rf.b((C2793h) this.f98166c, (AdConfig) this.f98167e, (InterfaceC2994sf) this.f98168f, (F5) this.f98169g);
                break;
        }
    }
}
