package yr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94875b;

    public e(f fVar) {
        this.f94875b = fVar;
    }

    public abstract void doRun() throws IOException;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        f fVar = this.f94875b;
        try {
            if (fVar.f94895k == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            doRun();
        } catch (Exception e10) {
            fVar.f94890f.onException(e10);
        }
    }
}
