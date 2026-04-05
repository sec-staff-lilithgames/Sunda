package n6;

import androidx.work.Worker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Worker f75704c;

    public /* synthetic */ c1(Worker worker, int i10) {
        this.f75703b = i10;
        this.f75704c = worker;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f75703b) {
            case 0:
                return this.f75704c.doWork();
            default:
                return this.f75704c.getForegroundInfo();
        }
    }
}
