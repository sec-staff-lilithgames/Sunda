package k8;

import com.applovin.shadow.okhttp3.internal.Util;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f70663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f70664c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f70665e;

    public /* synthetic */ a(int i10, String str, boolean z10) {
        this.f70663b = i10;
        this.f70664c = str;
        this.f70665e = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f70663b) {
            case 0:
                return Util.threadFactory$lambda$1(this.f70664c, this.f70665e, runnable);
            default:
                Thread thread = new Thread(runnable, this.f70664c);
                thread.setDaemon(this.f70665e);
                return thread;
        }
    }
}
