package androidx.browser.customtabs;

import android.os.IBinder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f5197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5198c;

    public /* synthetic */ a0(b0 b0Var, Object obj, int i10) {
        this.f5196a = i10;
        this.f5197b = b0Var;
        this.f5198c = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f5196a) {
            case 0:
                this.f5197b.f5203b.cleanUpSession((n0) this.f5198c);
                break;
            default:
                this.f5197b.f5203b.cleanUpSession((u.d) this.f5198c);
                break;
        }
    }
}
