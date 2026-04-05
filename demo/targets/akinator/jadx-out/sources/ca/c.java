package ca;

import androidx.lifecycle.b1;
import com.digidust.elokence.akinator.factories.AkApplication;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements androidx.lifecycle.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AkApplication f11942b;

    public c(AkApplication akApplication) {
        this.f11942b = akApplication;
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
        super.onCreate(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
        super.onDestroy(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onPause(b1 b1Var) {
        super.onPause(b1Var);
    }

    @Override // androidx.lifecycle.r
    public /* bridge */ /* synthetic */ void onResume(b1 b1Var) {
        super.onResume(b1Var);
    }

    @Override // androidx.lifecycle.r
    public void onStart(b1 owner) {
        e0.checkNotNullParameter(owner, "owner");
        na.a.startMusic(ma.c.f74126e);
        AkApplication.access$startPeriodicWSCRefresh(this.f11942b);
    }

    @Override // androidx.lifecycle.r
    public void onStop(b1 owner) {
        e0.checkNotNullParameter(owner, "owner");
        AkApplication.access$stopPeriodicWSCRefresh(this.f11942b);
        na.a.onAppBackgrounded();
    }
}
