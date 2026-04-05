package bk;

import bi.v;
import ci.a0;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements bi.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9703a;

    public /* synthetic */ b(int i10) {
        this.f9703a = i10;
    }

    @Override // bi.i
    public final Object create(bi.d dVar) {
        switch (this.f9703a) {
            case 0:
                return new c(dVar.setOf(f.class), d.getInstance());
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f29665a.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f29667c.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f29666b.get();
            case 4:
                v vVar = ExecutorsRegistrar.f29665a;
                return a0.f12321b;
            case 5:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            case 6:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            case 7:
                return TransportRegistrar.lambda$getComponents$0(dVar);
            case 8:
                return TransportRegistrar.lambda$getComponents$1(dVar);
            case 9:
                return TransportRegistrar.lambda$getComponents$2(dVar);
            case 10:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            default:
                return AbtRegistrar.lambda$getComponents$0(dVar);
        }
    }
}
