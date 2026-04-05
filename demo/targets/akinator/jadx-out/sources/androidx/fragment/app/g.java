package androidx.fragment.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f6318b;

    public g(h hVar) {
        this.f6318b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f6318b;
        hVar.f6335c.endViewTransition(hVar.f6336e);
        hVar.f6337f.a();
    }
}
