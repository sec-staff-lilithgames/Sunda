package ii;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59607b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Callable f59608c;

    public /* synthetic */ b(Callable callable, int i10) {
        this.f59607b = i10;
        this.f59608c = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f59607b) {
        }
        return (Task) this.f59608c.call();
    }
}
