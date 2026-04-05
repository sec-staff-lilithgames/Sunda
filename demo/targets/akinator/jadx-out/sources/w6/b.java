package w6;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import o6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f90389c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f90390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f90391f;

    public /* synthetic */ b(WorkDatabase workDatabase, String str, y0 y0Var, int i10) {
        this.f90388b = i10;
        this.f90389c = workDatabase;
        this.f90390e = str;
        this.f90391f = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f90388b) {
            case 0:
                Iterator<String> it = this.f90389c.workSpecDao().getUnfinishedWorkWithName(this.f90390e).iterator();
                while (it.hasNext()) {
                    d.a(it.next(), this.f90391f);
                }
                break;
            default:
                Iterator<String> it2 = this.f90389c.workSpecDao().getUnfinishedWorkWithTag(this.f90390e).iterator();
                while (it2.hasNext()) {
                    d.a(it2.next(), this.f90391f);
                }
                break;
        }
    }
}
