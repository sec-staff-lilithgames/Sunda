package androidx.media;

import android.media.VolumeProvider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f6859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f6859a = t0Var;
    }

    @Override // android.media.VolumeProvider
    public void onAdjustVolume(int i10) {
        this.f6859a.onAdjustVolume(i10);
    }

    @Override // android.media.VolumeProvider
    public void onSetVolumeTo(int i10) {
        this.f6859a.onSetVolumeTo(i10);
    }
}
