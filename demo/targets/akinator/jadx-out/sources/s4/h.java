package s4;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f85393a;

    public h(i iVar) {
        this.f85393a = iVar;
    }

    @Override // s4.q
    public void onFailed(Throwable th2) {
        this.f85393a.f85408a.b(th2);
    }

    @Override // s4.q
    public void onLoaded(o0 o0Var) {
        i iVar = this.f85393a;
        if (o0Var == null) {
            iVar.f85408a.b(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        iVar.f85396c = o0Var;
        o0 o0Var2 = iVar.f85396c;
        s sVar = iVar.f85408a;
        iVar.f85395b = new com.google.firebase.messaging.t(o0Var2, sVar.f85453g, sVar.f85460n, sVar.f85455i, sVar.f85456j, Build.VERSION.SDK_INT >= 34 ? y.a() : jh.i.C());
        s sVar2 = iVar.f85408a;
        sVar2.getClass();
        ArrayList arrayList = new ArrayList();
        sVar2.f85447a.writeLock().lock();
        try {
            sVar2.f85449c = 1;
            arrayList.addAll(sVar2.f85448b);
            sVar2.f85448b.clear();
            sVar2.f85447a.writeLock().unlock();
            sVar2.f85450d.post(new o(arrayList, sVar2.f85449c, null));
        } catch (Throwable th2) {
            sVar2.f85447a.writeLock().unlock();
            throw th2;
        }
    }
}
