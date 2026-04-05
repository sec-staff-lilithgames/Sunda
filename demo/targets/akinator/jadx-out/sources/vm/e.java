package vm;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VastView f89309a;

    public e(VastView vastView) {
        this.f89309a = vastView;
    }

    @Override // vm.b
    public void a(int i10, int i11, float f10) throws IllegalStateException {
        VastView vastView = this.f89309a;
        if (vastView.V.size() == 2 && ((Integer) vastView.V.getFirst()).intValue() > ((Integer) vastView.V.getLast()).intValue()) {
            io.bidmachine.iab.vast.e.e(vastView.f60424b, "Playing progressing error: seek", new Object[0]);
            vastView.V.removeFirst();
        }
        if (vastView.V.size() == 19) {
            Integer num = (Integer) vastView.V.getFirst();
            int iIntValue = num.intValue();
            Integer num2 = (Integer) vastView.V.getLast();
            int iIntValue2 = num2.intValue();
            io.bidmachine.iab.vast.e.d(vastView.f60424b, "Playing progressing position: last=%d, first=%d)", num2, num);
            if (iIntValue2 > iIntValue) {
                vastView.V.removeFirst();
            } else {
                int i12 = vastView.W + 1;
                vastView.W = i12;
                if (i12 >= 3) {
                    vastView.p(qm.b.internal("Playing progressing error: video hang detected"));
                    return;
                }
            }
        }
        try {
            vastView.V.addLast(Integer.valueOf(i11));
            if (i10 == 0 || i11 <= 0 || vastView.f60444n == null) {
                return;
            }
            io.bidmachine.iab.vast.e.d(vastView.f60424b, "Playing progressing percent: %s", Float.valueOf(f10));
            if (vastView.f60423a0 < f10) {
                vastView.f60423a0 = f10;
                int i13 = i10 / 1000;
                vastView.f60444n.changePercentage(f10, Math.min(i13, (int) Math.ceil(i11 / 1000.0f)), i13);
            }
        } catch (Exception unused) {
        }
    }
}
