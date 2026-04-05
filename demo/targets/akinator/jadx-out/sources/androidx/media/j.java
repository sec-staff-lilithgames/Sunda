package androidx.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6829b;

    public j(k kVar) {
        this.f6829b = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k kVar = this.f6829b;
        kVar.f6839i.f6775f.remove(((j0) kVar.f6836f).asBinder());
    }
}
