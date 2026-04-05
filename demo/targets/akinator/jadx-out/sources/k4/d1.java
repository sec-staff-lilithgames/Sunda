package k4;

import java.io.File;
import k4.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f70311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(File file) {
        super(0);
        this.f70311e = file;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m5125invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5125invoke() {
        c1.a aVar = c1.f70295d;
        Object activeFilesLock$datastore_core_release = aVar.getActiveFilesLock$datastore_core_release();
        File file = this.f70311e;
        synchronized (activeFilesLock$datastore_core_release) {
            aVar.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
        }
    }
}
