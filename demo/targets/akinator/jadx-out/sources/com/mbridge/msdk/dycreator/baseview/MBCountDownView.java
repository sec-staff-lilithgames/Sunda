package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.util.timer.a;
import com.mbridge.msdk.util.timer.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBCountDownView extends MBTextView {

    /* renamed from: f, reason: collision with root package name */
    private b f39825f;

    /* renamed from: g, reason: collision with root package name */
    private MBCountDownView f39826g;

    public MBCountDownView(Context context) {
        super(context);
        this.f39826g = this;
    }

    public void initView(final String str, final String str2, int i10) {
        this.f39825f = new b().b(i10 * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.util.timer.a
            public void onFinish() {
                MBCountDownView.this.f39825f.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.util.timer.a
            public void onTick(long j10) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.f39826g.setText((j10 / 1000) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK + str);
                    return;
                }
                MBCountDownView.this.f39826g.setText(MBCountDownView.this.f39826g + " " + (j10 / 1000) + ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f39825f;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f39825f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39826g = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39826g = this;
    }
}
