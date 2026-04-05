package hj;

import android.os.CountDownTimer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f58991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, long j10, long j11) {
        super(j10, j11);
        this.f58991a = vVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f58991a.onFinish();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
    }
}
