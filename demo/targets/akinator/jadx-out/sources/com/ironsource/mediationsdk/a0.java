package com.ironsource.mediationsdk;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractAdapter f37261c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f37263f;

    public /* synthetic */ a0(AbstractAdapter abstractAdapter, String str, List list, int i10) {
        this.f37260b = i10;
        this.f37261c = abstractAdapter;
        this.f37262e = str;
        this.f37263f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37260b) {
            case 0:
                c.a(this.f37261c, this.f37262e, this.f37263f);
                break;
            default:
                c.b(this.f37261c, this.f37262e, this.f37263f);
                break;
        }
    }
}
