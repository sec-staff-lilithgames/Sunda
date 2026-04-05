package xr;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputStream f92786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f92787c;

    public m3(v3 v3Var, InputStream inputStream) {
        this.f92787c = v3Var;
        this.f92786b = inputStream;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f92787c.f93162c.writeMessage(this.f92786b);
    }
}
