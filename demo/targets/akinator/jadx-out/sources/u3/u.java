package u3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f87825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f87826c;

    public u(k kVar, Object obj) {
        this.f87825b = kVar;
        this.f87826c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87825b.accept(this.f87826c);
    }
}
