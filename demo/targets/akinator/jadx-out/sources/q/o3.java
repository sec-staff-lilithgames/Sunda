package q;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f82199c;

    public /* synthetic */ o3(Toolbar toolbar, int i10) {
        this.f82198b = i10;
        this.f82199c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f82198b) {
            case 0:
                this.f82199c.collapseActionView();
                break;
            default:
                this.f82199c.invalidateMenu();
                break;
        }
    }
}
