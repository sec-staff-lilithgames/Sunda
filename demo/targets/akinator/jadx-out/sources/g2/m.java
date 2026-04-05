package g2;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f56791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar) {
        super(0);
        this.f56791e = oVar;
    }

    @Override // kv.a
    public final Float invoke() {
        t tVar;
        u intrinsics;
        List<t> infoList$ui_text_release = this.f56791e.getInfoList$ui_text_release();
        if (infoList$ui_text_release.isEmpty()) {
            tVar = null;
        } else {
            t tVar2 = infoList$ui_text_release.get(0);
            float maxIntrinsicWidth = tVar2.getIntrinsics().getMaxIntrinsicWidth();
            int lastIndex = uu.p0.getLastIndex(infoList$ui_text_release);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    t tVar3 = infoList$ui_text_release.get(i10);
                    float maxIntrinsicWidth2 = tVar3.getIntrinsics().getMaxIntrinsicWidth();
                    if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                        tVar2 = tVar3;
                        maxIntrinsicWidth = maxIntrinsicWidth2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            tVar = tVar2;
        }
        t tVar4 = tVar;
        return Float.valueOf((tVar4 == null || (intrinsics = tVar4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
    }
}
