package w6;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import n6.q0;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h0 implements q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f90416c = n6.c0.tagWithPrefix("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f90417a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f90418b;

    public h0(WorkDatabase workDatabase, x6.b bVar) {
        this.f90417a = workDatabase;
        this.f90418b = bVar;
    }

    @Override // n6.q0
    public n1 updateProgress(Context context, UUID uuid, androidx.work.b bVar) {
        return n6.w.executeAsync(this.f90418b.getSerialTaskExecutor(), "updateProgress", new com.moloco.sdk.internal.ilrd.j(this, 6, uuid, bVar));
    }
}
