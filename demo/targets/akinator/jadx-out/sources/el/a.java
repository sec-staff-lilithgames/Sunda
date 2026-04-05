package el;

import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TestSuiteActivity f54687c;

    public /* synthetic */ a(TestSuiteActivity testSuiteActivity, int i10) {
        this.f54686b = i10;
        this.f54687c = testSuiteActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54686b) {
            case 0:
                TestSuiteActivity.a(this.f54687c);
                break;
            default:
                TestSuiteActivity.b(this.f54687c);
                break;
        }
    }
}
