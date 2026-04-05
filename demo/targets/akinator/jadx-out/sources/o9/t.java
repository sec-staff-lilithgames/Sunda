package o9;

import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f78549b;

    public t(s sVar) {
        this.f78549b = sVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        s sVar = this.f78549b;
        if (sVar.getMClassementDisplayed$akinatorGL_gplayFreemiumRelease() != null) {
            ta.c mClassementDisplayed$akinatorGL_gplayFreemiumRelease = sVar.getMClassementDisplayed$akinatorGL_gplayFreemiumRelease();
            kotlin.jvm.internal.e0.checkNotNull(mClassementDisplayed$akinatorGL_gplayFreemiumRelease);
            mClassementDisplayed$akinatorGL_gplayFreemiumRelease.decrementeTempsRestant();
            if (sVar.getActivity() == null || !sVar.isAdded()) {
                return;
            }
            sVar.requireActivity().runOnUiThread(new p(sVar, 3));
        }
    }
}
