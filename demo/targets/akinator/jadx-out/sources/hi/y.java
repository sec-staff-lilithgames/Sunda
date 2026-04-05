package hi;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f58909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f58910c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f58911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f58912f;

    public /* synthetic */ y(z zVar, String str, String str2, int i10) {
        this.f58909b = i10;
        this.f58910c = zVar;
        this.f58911e = str;
        this.f58912f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58909b) {
            case 0:
                String str = this.f58911e;
                String str2 = this.f58912f;
                u uVar = this.f58910c.f58920h;
                uVar.getClass();
                try {
                    uVar.f58884d.setCustomKey(str, str2);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = uVar.f58881a;
                    if (context != null && j.isAppDebuggable(context)) {
                        throw e10;
                    }
                    ei.f.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
                    return;
                }
            default:
                this.f58910c.f58920h.j(this.f58911e, this.f58912f);
                return;
        }
    }
}
