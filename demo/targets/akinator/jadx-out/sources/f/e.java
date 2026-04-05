package f;

import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f55221c;

    public /* synthetic */ e(ComponentActivity componentActivity, int i10) {
        this.f55220b = i10;
        this.f55221c = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f55220b;
        ComponentActivity componentActivity = this.f55221c;
        switch (i10) {
            case 0:
                int i11 = ComponentActivity.f4643b;
                componentActivity.invalidateMenu();
                break;
            default:
                ComponentActivity.b(componentActivity);
                break;
        }
    }
}
