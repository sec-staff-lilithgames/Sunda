package io.odeeo.internal.w1;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final m f67411a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.l {
        public a() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return x0.f87415a;
        }

        public final void invoke(float f10) {
            h.this.setProgress((int) f10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(context, null, 0, null, 14, null);
        e0.checkNotNullParameter(context, "context");
    }

    public final m getSmoothHelper() {
        return this.f67411a;
    }

    public final void setSmoothProgress(int i10, long j10) {
        this.f67411a.setSmoothProgress(i10, j10, new a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        e0.checkNotNullParameter(context, PtLatqAYjEFT.vKQcbEXPk);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, 8, null);
        e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i10, m mVar, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.progressBarStyleHorizontal : i10, (i11 & 8) != 0 ? new m() : mVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i10, m smoothHelper) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(smoothHelper, "smoothHelper");
        this.f67411a = smoothHelper;
    }
}
