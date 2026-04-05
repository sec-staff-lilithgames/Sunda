package u9;

import ca.y;
import com.digidust.elokence.akinator.activities.HomeActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final HomeActivity f88163a;

    public f(HomeActivity homeActivity) {
        this.f88163a = homeActivity;
    }

    public void processOnResume() {
        y.getInstance(this.f88163a).initializeIfNecessary();
    }

    public void processOnCreate() {
    }
}
